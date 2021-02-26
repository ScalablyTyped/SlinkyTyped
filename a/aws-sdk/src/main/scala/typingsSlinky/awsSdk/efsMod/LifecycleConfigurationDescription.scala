package typingsSlinky.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecycleConfigurationDescription extends StObject {
  
  /**
    * An array of lifecycle management policies. Currently, EFS supports a maximum of one policy per file system.
    */
  var LifecyclePolicies: js.UndefOr[typingsSlinky.awsSdk.efsMod.LifecyclePolicies] = js.native
}
object LifecycleConfigurationDescription {
  
  @scala.inline
  def apply(): LifecycleConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleConfigurationDescription]
  }
  
  @scala.inline
  implicit class LifecycleConfigurationDescriptionMutableBuilder[Self <: LifecycleConfigurationDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLifecyclePolicies(value: LifecyclePolicies): Self = StObject.set(x, "LifecyclePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecyclePoliciesUndefined: Self = StObject.set(x, "LifecyclePolicies", js.undefined)
    
    @scala.inline
    def setLifecyclePoliciesVarargs(value: LifecyclePolicy*): Self = StObject.set(x, "LifecyclePolicies", js.Array(value :_*))
  }
}
