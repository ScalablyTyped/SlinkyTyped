package typingsSlinky.antdMobileRn

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUnselectedTintColor extends js.Object {
  var barTintColor: String = js.native
  var styles: StringDictionary[RegisteredStyle[_]] = js.native
  var tintColor: String = js.native
  var unselectedTintColor: String = js.native
}

object AnonUnselectedTintColor {
  @scala.inline
  def apply(
    barTintColor: String,
    styles: StringDictionary[RegisteredStyle[_]],
    tintColor: String,
    unselectedTintColor: String
  ): AnonUnselectedTintColor = {
    val __obj = js.Dynamic.literal(barTintColor = barTintColor.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any], unselectedTintColor = unselectedTintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUnselectedTintColor]
  }
  @scala.inline
  implicit class AnonUnselectedTintColorOps[Self <: AnonUnselectedTintColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barTintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyles(value: StringDictionary[RegisteredStyle[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnselectedTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectedTintColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

