package typingsSlinky.pulumiAws.inputMod.cognito

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceServerScope extends StObject {
  
  /**
    * The scope description.
    */
  var scopeDescription: Input[String] = js.native
  
  /**
    * The scope name.
    */
  var scopeName: Input[String] = js.native
}
object ResourceServerScope {
  
  @scala.inline
  def apply(scopeDescription: Input[String], scopeName: Input[String]): ResourceServerScope = {
    val __obj = js.Dynamic.literal(scopeDescription = scopeDescription.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceServerScope]
  }
  
  @scala.inline
  implicit class ResourceServerScopeMutableBuilder[Self <: ResourceServerScope] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopeDescription(value: Input[String]): Self = StObject.set(x, "scopeDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeName(value: Input[String]): Self = StObject.set(x, "scopeName", value.asInstanceOf[js.Any])
  }
}
