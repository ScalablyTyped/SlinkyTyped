package typingsSlinky.enhancedResolve

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileKindPluginMod {
  
  @JSImport("enhanced-resolve/lib/FileKindPlugin", JSImport.Namespace)
  @js.native
  class ^ protected () extends FileKindPlugin {
    def this(source: String, target: String) = this()
  }
  
  @js.native
  trait FileKindPlugin extends StObject {
    
    @JSName("apply")
    def apply(resolver: typingsSlinky.enhancedResolve.resolverMod.^): Unit = js.native
    
    var source: String = js.native
    
    var target: String = js.native
  }
  object FileKindPlugin {
    
    @scala.inline
    def apply(apply: typingsSlinky.enhancedResolve.resolverMod.^ => Unit, source: String, target: String): FileKindPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileKindPlugin]
    }
    
    @scala.inline
    implicit class FileKindPluginMutableBuilder[Self <: FileKindPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: typingsSlinky.enhancedResolve.resolverMod.^ => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
