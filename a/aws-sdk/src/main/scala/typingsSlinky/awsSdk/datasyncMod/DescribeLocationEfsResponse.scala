package typingsSlinky.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLocationEfsResponse extends StObject {
  
  /**
    * The time that the EFS location was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  
  var Ec2Config: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.Ec2Config] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the EFS location that was described.
    */
  var LocationArn: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.LocationArn] = js.native
  
  /**
    * The URL of the EFS location that was described.
    */
  var LocationUri: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.LocationUri] = js.native
}
object DescribeLocationEfsResponse {
  
  @scala.inline
  def apply(): DescribeLocationEfsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocationEfsResponse]
  }
  
  @scala.inline
  implicit class DescribeLocationEfsResponseMutableBuilder[Self <: DescribeLocationEfsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setEc2Config(value: Ec2Config): Self = StObject.set(x, "Ec2Config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2ConfigUndefined: Self = StObject.set(x, "Ec2Config", js.undefined)
    
    @scala.inline
    def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
    
    @scala.inline
    def setLocationUri(value: LocationUri): Self = StObject.set(x, "LocationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUriUndefined: Self = StObject.set(x, "LocationUri", js.undefined)
  }
}
