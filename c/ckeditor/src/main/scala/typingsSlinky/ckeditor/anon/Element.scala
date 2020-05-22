package typingsSlinky.ckeditor.anon

import typingsSlinky.ckeditor.CKEDITOR.dom.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  var element: typingsSlinky.ckeditor.CKEDITOR.dom.element
  var item: js.Any
}

object Element {
  @scala.inline
  def apply(element: element, item: js.Any): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
}

