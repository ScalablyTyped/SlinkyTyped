package typingsSlinky.calidation.mod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormValidationProps[T /* <: js.Object */]
  extends FormProps[T]
     with ValidationProps[T] {
  
  @JSName("children")
  def children_MFormValidationProps(context: ValidationContext[T]): ReactElement = js.native
}
object FormValidationProps {
  
  @scala.inline
  def apply[T /* <: js.Object */](children: ValidationContext[T] => ReactElement, config: FieldsConfig[T]): FormValidationProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormValidationProps[T]]
  }
  
  @scala.inline
  implicit class FormValidationPropsMutableBuilder[Self <: FormValidationProps[_], T /* <: js.Object */] (val x: Self with FormValidationProps[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ValidationContext[T] => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
  }
}
