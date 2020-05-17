package typingsSlinky.reactSelect.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactSelect.themeMod.ThemeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theme extends ThemeConfig {
  var borderRadius: Double = js.native
  var colors: StringDictionary[String] = js.native
  var spacing: ThemeSpacing = js.native
}

object Theme {
  @scala.inline
  def apply(borderRadius: Double, colors: StringDictionary[String], spacing: ThemeSpacing): Theme = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  @scala.inline
  implicit class ThemeOps[Self <: Theme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColors(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpacing(value: ThemeSpacing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

