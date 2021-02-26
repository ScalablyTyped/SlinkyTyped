package typingsSlinky.mobxReact

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Context
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerMod {
  
  @JSImport("mobx-react/dist/Provider", "MobXProviderContext")
  @js.native
  val MobXProviderContext: Context[Record[String, js.Any]] = js.native
  
  object Provider {
    
    @JSImport("mobx-react/dist/Provider", "Provider")
    @js.native
    def apply(props: ProviderProps): ReactElement = js.native
    @JSImport("mobx-react/dist/Provider", "Provider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx-react/dist/Provider", "Provider.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ @js.native
  trait ProviderProps extends StObject {
    
    var children: ReactElement = js.native
  }
  object ProviderProps {
    
    @scala.inline
    def apply(): ProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProviderProps]
    }
    
    @scala.inline
    implicit class ProviderPropsMutableBuilder[Self <: ProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
