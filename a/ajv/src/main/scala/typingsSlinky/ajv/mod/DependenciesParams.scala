package typingsSlinky.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DependenciesParams extends ErrorParameters {
  
  var deps: String = js.native
  
  var depsCount: Double = js.native
  
  var missingProperty: String = js.native
  
  var property: String = js.native
}
object DependenciesParams {
  
  @scala.inline
  def apply(deps: String, depsCount: Double, missingProperty: String, property: String): DependenciesParams = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], depsCount = depsCount.asInstanceOf[js.Any], missingProperty = missingProperty.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependenciesParams]
  }
  
  @scala.inline
  implicit class DependenciesParamsMutableBuilder[Self <: DependenciesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeps(value: String): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepsCount(value: Double): Self = StObject.set(x, "depsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingProperty(value: String): Self = StObject.set(x, "missingProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
