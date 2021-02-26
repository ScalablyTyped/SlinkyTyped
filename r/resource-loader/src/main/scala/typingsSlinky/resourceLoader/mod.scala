package typingsSlinky.resourceLoader

import typingsSlinky.resourceLoader.mod.MiniSignal.MiniSignalBinding
import typingsSlinky.resourceLoader.resourceLoaderBooleans.`false`
import typingsSlinky.resourceLoader.resourceLoaderBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mini-signals", JSImport.Default)
  @js.native
  class default[CbType] () extends MiniSignal[CbType]
  
  @js.native
  trait MiniSignal[CbType] extends StObject {
    
    def add(fn: CbType): MiniSignalBinding = js.native
    def add(fn: CbType, thisArg: js.Any): MiniSignalBinding = js.native
    
    def detach(node: MiniSignalBinding): MiniSignal[CbType] = js.native
    
    def detachAll(): MiniSignal[CbType] = js.native
    
    var dispatch: CbType = js.native
    
    def handlers(): js.Array[MiniSignalBinding] = js.native
    @JSName("handlers")
    def handlers_false(exists: `false`): js.Array[MiniSignalBinding] = js.native
    @JSName("handlers")
    def handlers_true(exists: `true`): Boolean = js.native
    
    def has(node: MiniSignalBinding): Boolean = js.native
    
    def once(fn: CbType): MiniSignalBinding = js.native
    def once(fn: CbType, thisArg: js.Any): MiniSignalBinding = js.native
  }
  object MiniSignal {
    
    @js.native
    trait MiniSignalBinding extends StObject {
      
      def detach(): Boolean = js.native
    }
    object MiniSignalBinding {
      
      @scala.inline
      def apply(detach: () => Boolean): MiniSignalBinding = {
        val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach))
        __obj.asInstanceOf[MiniSignalBinding]
      }
      
      @scala.inline
      implicit class MiniSignalBindingMutableBuilder[Self <: MiniSignalBinding] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDetach(value: () => Boolean): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
      }
    }
  }
}
