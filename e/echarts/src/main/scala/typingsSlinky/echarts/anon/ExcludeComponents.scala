package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcludeComponents extends js.Object {
  // Background color of exporting image, use backgroundColor in
  // option by default.
  var backgroundColor: String = js.native
  // Excluded components list. e.g. ['toolbox']
  var excludeComponents: js.UndefOr[js.Array[String]] = js.native
  // Resolution ratio of exporting image, 1 by default.
  var pixelRatio: Double = js.native
  // Exporting format, can be either png, or jpeg
  var `type`: String = js.native
}

object ExcludeComponents {
  @scala.inline
  def apply(backgroundColor: String, pixelRatio: Double, `type`: String): ExcludeComponents = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeComponents]
  }
  @scala.inline
  implicit class ExcludeComponentsOps[Self <: ExcludeComponents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcludeComponents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeComponents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeComponents")(js.undefined)
        ret
    }
  }
  
}

