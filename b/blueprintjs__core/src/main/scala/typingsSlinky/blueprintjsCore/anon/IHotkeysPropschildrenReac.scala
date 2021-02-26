package typingsSlinky.blueprintjsCore.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @blueprintjs/core.@blueprintjs/core/lib/esm/components/hotkeys/hotkeysTypes.IHotkeysProps & {  children :react.react.ReactNode} */
@js.native
trait IHotkeysPropschildrenReac extends StObject {
  
  var children: ReactElement = js.native
  
  /** A space-delimited list of class names to pass along to a child element. */
  var className: js.UndefOr[String] = js.native
  
  /**
    * In order to make local hotkeys work on elements that are not normally
    * focusable, such as `<div>`s or `<span>`s, we add a `tabIndex` attribute
    * to the hotkey target, which makes it focusable. By default, we use `0`,
    * but you can override this value to change the tab navigation behavior
    * of the component. You may even set this value to `null`, which will omit
    * the `tabIndex` from the component decorated by `HotkeysTarget`.
    */
  var tabIndex: js.UndefOr[Double] = js.native
}
object IHotkeysPropschildrenReac {
  
  @scala.inline
  def apply(): IHotkeysPropschildrenReac = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHotkeysPropschildrenReac]
  }
  
  @scala.inline
  implicit class IHotkeysPropschildrenReacMutableBuilder[Self <: IHotkeysPropschildrenReac] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
  }
}
