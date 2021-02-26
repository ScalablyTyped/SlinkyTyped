package typingsSlinky.ionicCore.componentsMod.LocalJSX

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.mod.ComponentRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonTab extends StObject {
  
  /**
    * The component to display inside of the tab.
    */
  var component: js.UndefOr[ComponentRef] = js.native
  
  /**
    * A tab id must be provided for each `ion-tab`. It's used internally to reference the selected tab or by the router to switch between them.
    */
  var tab: String = js.native
}
object IonTab {
  
  @scala.inline
  def apply(tab: String): IonTab = {
    val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonTab]
  }
  
  @scala.inline
  implicit class IonTabMutableBuilder[Self <: IonTab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: ComponentRef): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentHTMLElement(value: HTMLElement): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentNull: Self = StObject.set(x, "component", null)
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
