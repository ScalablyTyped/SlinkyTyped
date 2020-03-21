package typingsSlinky.reactBootstrap.carouselCaptionMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselCaptionProps
  extends AllHTMLAttributes[CarouselCaption]
     with ClassAttributes[CarouselCaption] {
  var componentClass: js.UndefOr[ReactComponentClass[_]] = js.undefined
}

object CarouselCaptionProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[CarouselCaption] = null,
    ClassAttributes: ClassAttributes[CarouselCaption] = null,
    componentClass: ReactComponentClass[_] = null
  ): CarouselCaptionProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselCaptionProps]
  }
}

