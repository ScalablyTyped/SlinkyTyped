package typingsSlinky.angularCompiler.compilerFacadeInterfaceMod

import typingsSlinky.angularCompiler.angularCompilerStrings.directiveInject
import typingsSlinky.angularCompiler.angularCompilerStrings.inject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait R3FactoryDefMetadataFacade extends StObject {
  
  var deps: js.Array[R3DependencyMetadataFacade] | Null = js.native
  
  var injectFn: directiveInject | inject = js.native
  
  var name: String = js.native
  
  var target: R3FactoryTarget = js.native
  
  var `type`: js.Any = js.native
  
  var typeArgumentCount: Double = js.native
}
object R3FactoryDefMetadataFacade {
  
  @scala.inline
  def apply(
    injectFn: directiveInject | inject,
    name: String,
    target: R3FactoryTarget,
    `type`: js.Any,
    typeArgumentCount: Double
  ): R3FactoryDefMetadataFacade = {
    val __obj = js.Dynamic.literal(injectFn = injectFn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3FactoryDefMetadataFacade]
  }
  
  @scala.inline
  implicit class R3FactoryDefMetadataFacadeMutableBuilder[Self <: R3FactoryDefMetadataFacade] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeps(value: js.Array[R3DependencyMetadataFacade]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepsNull: Self = StObject.set(x, "deps", null)
    
    @scala.inline
    def setDepsVarargs(value: R3DependencyMetadataFacade*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    @scala.inline
    def setInjectFn(value: directiveInject | inject): Self = StObject.set(x, "injectFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: R3FactoryTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeArgumentCount(value: Double): Self = StObject.set(x, "typeArgumentCount", value.asInstanceOf[js.Any])
  }
}
