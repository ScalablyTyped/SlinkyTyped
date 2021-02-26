package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IamInstanceProfileSpecification extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the instance profile.
    */
  var Arn: js.UndefOr[String] = js.native
  
  /**
    * The name of the instance profile.
    */
  var Name: js.UndefOr[String] = js.native
}
object IamInstanceProfileSpecification {
  
  @scala.inline
  def apply(): IamInstanceProfileSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamInstanceProfileSpecification]
  }
  
  @scala.inline
  implicit class IamInstanceProfileSpecificationMutableBuilder[Self <: IamInstanceProfileSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
