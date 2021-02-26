package typingsSlinky.jestEnvironmentNode

import typingsSlinky.jestEnvironment.mod.JestEnvironment
import typingsSlinky.jestTypes.configMod.ProjectConfig
import typingsSlinky.node.vmMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-environment-node", JSImport.Namespace)
  @js.native
  class ^ protected () extends NodeEnvironment {
    def this(config: ProjectConfig) = this()
  }
  
  @js.native
  trait NodeEnvironment extends JestEnvironment {
    
    var context: Context | Null = js.native
    
    @JSName("getVmContext")
    def getVmContext_MNodeEnvironment(): Context | Null = js.native
  }
  
  @js.native
  trait Timer extends StObject {
    
    var id: Double = js.native
    
    def ref(): Timer = js.native
    
    def unref(): Timer = js.native
  }
  object Timer {
    
    @scala.inline
    def apply(id: Double, ref: () => Timer, unref: () => Timer): Timer = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
      __obj.asInstanceOf[Timer]
    }
    
    @scala.inline
    implicit class TimerMutableBuilder[Self <: Timer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: () => Timer): Self = StObject.set(x, "ref", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnref(value: () => Timer): Self = StObject.set(x, "unref", js.Any.fromFunction0(value))
    }
  }
}
