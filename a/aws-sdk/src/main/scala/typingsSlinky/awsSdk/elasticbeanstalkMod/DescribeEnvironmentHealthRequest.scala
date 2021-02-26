package typingsSlinky.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEnvironmentHealthRequest extends StObject {
  
  /**
    * Specify the response elements to return. To retrieve all attributes, set to All. If no attribute names are specified, returns the name of the environment.
    */
  var AttributeNames: js.UndefOr[EnvironmentHealthAttributes] = js.native
  
  /**
    * Specify the environment by ID. You must specify either this or an EnvironmentName, or both.
    */
  var EnvironmentId: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentId] = js.native
  
  /**
    * Specify the environment by name. You must specify either this or an EnvironmentName, or both.
    */
  var EnvironmentName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
}
object DescribeEnvironmentHealthRequest {
  
  @scala.inline
  def apply(): DescribeEnvironmentHealthRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentHealthRequest]
  }
  
  @scala.inline
  implicit class DescribeEnvironmentHealthRequestMutableBuilder[Self <: DescribeEnvironmentHealthRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeNames(value: EnvironmentHealthAttributes): Self = StObject.set(x, "AttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNamesUndefined: Self = StObject.set(x, "AttributeNames", js.undefined)
    
    @scala.inline
    def setAttributeNamesVarargs(value: EnvironmentHealthAttribute*): Self = StObject.set(x, "AttributeNames", js.Array(value :_*))
    
    @scala.inline
    def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
  }
}
