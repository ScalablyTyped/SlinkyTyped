package typingsSlinky.reactScroll.elementMod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementProps
  extends AllHTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  @JSName("name")
  var name_ElementProps: String
}

object ElementProps {
  @scala.inline
  def apply(
    name: String,
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLDivElement] = null,
    ClassAttributes: ClassAttributes[org.scalajs.dom.raw.HTMLDivElement] = null
  ): ElementProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    __obj.asInstanceOf[ElementProps]
  }
}

