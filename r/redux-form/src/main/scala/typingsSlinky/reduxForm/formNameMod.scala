package typingsSlinky.reduxForm

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reduxForm.anon.Form
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formNameMod extends Shortcut {
  
  @JSImport("redux-form/lib/FormName", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FormNameProps] = js.native
  
  @JSImport("redux-form/lib/FormName", "FormName")
  @js.native
  val FormName: ReactComponentClass[FormNameProps] = js.native
  
  @js.native
  trait FormNameProps extends StObject {
    
    def children(props: Form): ReactElement = js.native
  }
  object FormNameProps {
    
    @scala.inline
    def apply(children: Form => ReactElement): FormNameProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[FormNameProps]
    }
    
    @scala.inline
    implicit class FormNamePropsMutableBuilder[Self <: FormNameProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: Form => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  type _To = ReactComponentClass[FormNameProps]
  
  /* This means you don't have to write `default`, but can instead just say `formNameMod.foo` */
  override def _to: ReactComponentClass[FormNameProps] = default
}
