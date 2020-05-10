package typingsSlinky.reactNavigationStack

import slinky.core.facade.ReactElement
import typingsSlinky.reactNavigationStack.backButtonWebMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBackImage extends js.Object {
  var backImage: js.Function1[/* hasTintColor */ Props, ReactElement] = js.native
  var pressColorAndroid: String = js.native
  var tintColor: String = js.native
  var truncatedTitle: String = js.native
}

object AnonBackImage {
  @scala.inline
  def apply(
    backImage: /* hasTintColor */ Props => ReactElement,
    pressColorAndroid: String,
    tintColor: String,
    truncatedTitle: String
  ): AnonBackImage = {
    val __obj = js.Dynamic.literal(backImage = js.Any.fromFunction1(backImage), pressColorAndroid = pressColorAndroid.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any], truncatedTitle = truncatedTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackImage]
  }
  @scala.inline
  implicit class AnonBackImageOps[Self <: AnonBackImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackImage(value: /* hasTintColor */ Props => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backImage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPressColorAndroid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressColorAndroid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTruncatedTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncatedTitle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

