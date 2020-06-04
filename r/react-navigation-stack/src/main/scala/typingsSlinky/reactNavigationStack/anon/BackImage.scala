package typingsSlinky.reactNavigationStack.anon

import slinky.core.facade.ReactElement
import typingsSlinky.reactNavigationStack.backButtonWebMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackImage extends js.Object {
  var backImage: js.Function1[/* hasTintColor */ Props, ReactElement]
  var pressColorAndroid: String
  var tintColor: String
  var truncatedTitle: String
}

object BackImage {
  @scala.inline
  def apply(
    backImage: /* hasTintColor */ Props => ReactElement,
    pressColorAndroid: String,
    tintColor: String,
    truncatedTitle: String
  ): BackImage = {
    val __obj = js.Dynamic.literal(backImage = js.Any.fromFunction1(backImage), pressColorAndroid = pressColorAndroid.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any], truncatedTitle = truncatedTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackImage]
  }
  @scala.inline
  implicit class BackImageOps[Self <: BackImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackImage(value: /* hasTintColor */ Props => ReactElement): Self = this.set("backImage", js.Any.fromFunction1(value))
    @scala.inline
    def setPressColorAndroid(value: String): Self = this.set("pressColorAndroid", value.asInstanceOf[js.Any])
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTruncatedTitle(value: String): Self = this.set("truncatedTitle", value.asInstanceOf[js.Any])
  }
  
}

