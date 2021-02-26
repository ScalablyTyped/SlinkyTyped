package typingsSlinky.reactUid

import slinky.core.ReactComponentClass
import typingsSlinky.reactUid.contextMod.UIDProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlMod {
  
  @JSImport("react-uid/dist/es5/Control", "UIDConsumer")
  @js.native
  val UIDConsumer: ReactComponentClass[UIDProps] = js.native
  
  @JSImport("react-uid/dist/es5/Control", "UIDFork")
  @js.native
  val UIDFork: ReactComponentClass[WithPrefix] = js.native
  
  @JSImport("react-uid/dist/es5/Control", "UIDReset")
  @js.native
  val UIDReset: ReactComponentClass[WithPrefix] = js.native
  
  @js.native
  trait WithPrefix extends StObject {
    
    var prefix: js.UndefOr[String] = js.native
  }
  object WithPrefix {
    
    @scala.inline
    def apply(): WithPrefix = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithPrefix]
    }
    
    @scala.inline
    implicit class WithPrefixMutableBuilder[Self <: WithPrefix] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}
