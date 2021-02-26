package typingsSlinky.enhancedResolve

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesInHierachicDirectoriesPluginMod {
  
  @JSImport("enhanced-resolve/lib/ModulesInHierachicDirectoriesPlugin", JSImport.Namespace)
  @js.native
  class ^ protected () extends ModulesInHierachicDirectoriesPlugin {
    def this(source: String, directories: js.Array[String], target: String) = this()
  }
  
  @js.native
  trait ModulesInHierachicDirectoriesPlugin extends StObject {
    
    @JSName("apply")
    def apply(resolver: typingsSlinky.enhancedResolve.resolverMod.^): Unit = js.native
    
    var directories: js.Array[String] = js.native
    
    var source: String = js.native
    
    var target: String = js.native
  }
  object ModulesInHierachicDirectoriesPlugin {
    
    @scala.inline
    def apply(
      apply: typingsSlinky.enhancedResolve.resolverMod.^ => Unit,
      directories: js.Array[String],
      source: String,
      target: String
    ): ModulesInHierachicDirectoriesPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), directories = directories.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModulesInHierachicDirectoriesPlugin]
    }
    
    @scala.inline
    implicit class ModulesInHierachicDirectoriesPluginMutableBuilder[Self <: ModulesInHierachicDirectoriesPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: typingsSlinky.enhancedResolve.resolverMod.^ => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDirectories(value: js.Array[String]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoriesVarargs(value: String*): Self = StObject.set(x, "directories", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
