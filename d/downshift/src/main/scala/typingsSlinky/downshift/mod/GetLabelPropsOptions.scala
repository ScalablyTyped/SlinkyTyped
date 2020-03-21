package typingsSlinky.downshift.mod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.std.HTMLLabelElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLabelPropsOptions
  extends AllHTMLAttributes[HTMLLabelElement]
     with ClassAttributes[HTMLLabelElement]

object GetLabelPropsOptions {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLLabelElement] = null,
    ClassAttributes: ClassAttributes[org.scalajs.dom.raw.HTMLLabelElement] = null
  ): GetLabelPropsOptions = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    __obj.asInstanceOf[GetLabelPropsOptions]
  }
}

