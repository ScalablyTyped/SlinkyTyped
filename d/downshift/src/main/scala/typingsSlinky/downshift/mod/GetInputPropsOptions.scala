package typingsSlinky.downshift.mod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInputPropsOptions
  extends AllHTMLAttributes[HTMLInputElement]
     with ClassAttributes[HTMLInputElement]

object GetInputPropsOptions {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement] = null,
    ClassAttributes: ClassAttributes[org.scalajs.dom.raw.HTMLInputElement] = null
  ): GetInputPropsOptions = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    __obj.asInstanceOf[GetInputPropsOptions]
  }
}

