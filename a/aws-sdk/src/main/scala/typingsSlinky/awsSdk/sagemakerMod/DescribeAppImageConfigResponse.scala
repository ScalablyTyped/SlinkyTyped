package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAppImageConfigResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the AppImageConfig.
    */
  var AppImageConfigArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AppImageConfigArn] = js.native
  
  /**
    * The name of the AppImageConfig.
    */
  var AppImageConfigName: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AppImageConfigName] = js.native
  
  /**
    * When the AppImageConfig was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The configuration of a KernelGateway app.
    */
  var KernelGatewayImageConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.KernelGatewayImageConfig] = js.native
  
  /**
    * When the AppImageConfig was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
}
object DescribeAppImageConfigResponse {
  
  @scala.inline
  def apply(): DescribeAppImageConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppImageConfigResponse]
  }
  
  @scala.inline
  implicit class DescribeAppImageConfigResponseMutableBuilder[Self <: DescribeAppImageConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppImageConfigArn(value: AppImageConfigArn): Self = StObject.set(x, "AppImageConfigArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppImageConfigArnUndefined: Self = StObject.set(x, "AppImageConfigArn", js.undefined)
    
    @scala.inline
    def setAppImageConfigName(value: AppImageConfigName): Self = StObject.set(x, "AppImageConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppImageConfigNameUndefined: Self = StObject.set(x, "AppImageConfigName", js.undefined)
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setKernelGatewayImageConfig(value: KernelGatewayImageConfig): Self = StObject.set(x, "KernelGatewayImageConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelGatewayImageConfigUndefined: Self = StObject.set(x, "KernelGatewayImageConfig", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
  }
}
