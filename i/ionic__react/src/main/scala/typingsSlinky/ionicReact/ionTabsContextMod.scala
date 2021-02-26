package typingsSlinky.ionicReact

import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionTabsContextMod {
  
  @JSImport("@ionic/react/dist/types/components/navigation/IonTabsContext", "IonTabsContext")
  @js.native
  val IonTabsContext: Context[IonTabsContextState] = js.native
  
  @js.native
  trait IonTabsContextState extends StObject {
    
    var activeTab: js.UndefOr[String] = js.native
    
    def selectTab(tab: String): Boolean = js.native
  }
  object IonTabsContextState {
    
    @scala.inline
    def apply(selectTab: String => Boolean): IonTabsContextState = {
      val __obj = js.Dynamic.literal(selectTab = js.Any.fromFunction1(selectTab))
      __obj.asInstanceOf[IonTabsContextState]
    }
    
    @scala.inline
    implicit class IonTabsContextStateMutableBuilder[Self <: IonTabsContextState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveTab(value: String): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
      
      @scala.inline
      def setSelectTab(value: String => Boolean): Self = StObject.set(x, "selectTab", js.Any.fromFunction1(value))
    }
  }
}
