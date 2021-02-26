package typingsSlinky.reactHotkeys.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentProps extends ComponentPropsBase {
  
  var ref: js.UndefOr[MutableRefObject[ReactComponentClass[js.Object]]] = js.native
}
object ComponentProps {
  
  @scala.inline
  def apply(onBlur: () => Unit, onFocus: () => Unit, tabIndex: TabIndex): ComponentProps = {
    val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction0(onBlur), onFocus = js.Any.fromFunction0(onFocus), tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentProps]
  }
  
  @scala.inline
  implicit class ComponentPropsMutableBuilder[Self <: ComponentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRef(value: MutableRefObject[ReactComponentClass[js.Object]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
