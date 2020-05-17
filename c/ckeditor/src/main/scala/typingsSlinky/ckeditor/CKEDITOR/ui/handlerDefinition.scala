package typingsSlinky.ckeditor.CKEDITOR.ui

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ckeditor.CKEDITOR.dom.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait handlerDefinition[T] extends js.Object {
  var contentsElement: element = js.native
  def create(definition: StringDictionary[js.Any]): T = js.native
}

object handlerDefinition {
  @scala.inline
  def apply[T](contentsElement: element, create: StringDictionary[js.Any] => T): handlerDefinition[T] = {
    val __obj = js.Dynamic.literal(contentsElement = contentsElement.asInstanceOf[js.Any], create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[handlerDefinition[T]]
  }
  @scala.inline
  implicit class handlerDefinitionOps[Self[t] <: handlerDefinition[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withContentsElement(value: element): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentsElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate(value: StringDictionary[js.Any] => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

