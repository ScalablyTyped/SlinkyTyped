package typingsSlinky.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppearTransition extends js.Object {
  var appearTransition: Boolean = js.native
  var percent: Double = js.native
  var position: String = js.native
  var styles: StringDictionary[RegisteredStyle[_]] = js.native
  var unfilled: Boolean = js.native
}

object AppearTransition {
  @scala.inline
  def apply(
    appearTransition: Boolean,
    percent: Double,
    position: String,
    styles: StringDictionary[RegisteredStyle[_]],
    unfilled: Boolean
  ): AppearTransition = {
    val __obj = js.Dynamic.literal(appearTransition = appearTransition.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], unfilled = unfilled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppearTransition]
  }
  @scala.inline
  implicit class AppearTransitionOps[Self <: AppearTransition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppearTransition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyles(value: StringDictionary[RegisteredStyle[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnfilled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfilled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

