package typingsSlinky.appBuilderLib

import typingsSlinky.lazyVal.mod.Lazy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packageDependenciesMod {
  
  @JSImport("app-builder-lib/out/util/packageDependencies", "createLazyProductionDeps")
  @js.native
  def createLazyProductionDeps(projectDir: String): Lazy[js.Array[_]] = js.native
  @JSImport("app-builder-lib/out/util/packageDependencies", "createLazyProductionDeps")
  @js.native
  def createLazyProductionDeps(projectDir: String, excludedDependencies: js.Array[String]): Lazy[js.Array[_]] = js.native
  
  @js.native
  trait NodeModuleDirInfo extends StObject {
    
    val deps: js.Array[NodeModuleInfo] = js.native
    
    val dir: String = js.native
  }
  object NodeModuleDirInfo {
    
    @scala.inline
    def apply(deps: js.Array[NodeModuleInfo], dir: String): NodeModuleDirInfo = {
      val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeModuleDirInfo]
    }
    
    @scala.inline
    implicit class NodeModuleDirInfoMutableBuilder[Self <: NodeModuleDirInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeps(value: js.Array[NodeModuleInfo]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepsVarargs(value: NodeModuleInfo*): Self = StObject.set(x, "deps", js.Array(value :_*))
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NodeModuleInfo extends StObject {
    
    val name: String = js.native
  }
  object NodeModuleInfo {
    
    @scala.inline
    def apply(name: String): NodeModuleInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeModuleInfo]
    }
    
    @scala.inline
    implicit class NodeModuleInfoMutableBuilder[Self <: NodeModuleInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
