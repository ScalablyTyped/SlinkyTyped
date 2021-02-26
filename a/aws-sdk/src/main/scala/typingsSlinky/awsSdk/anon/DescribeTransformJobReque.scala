package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.sagemakerMod.TransformJobName
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/sagemaker.DescribeTransformJobRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeTransformJobReque extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  
  /**
    * The name of the transform job that you want to view details of.
    */
  var TransformJobName: typingsSlinky.awsSdk.sagemakerMod.TransformJobName = js.native
}
object DescribeTransformJobReque {
  
  @scala.inline
  def apply(TransformJobName: TransformJobName): DescribeTransformJobReque = {
    val __obj = js.Dynamic.literal(TransformJobName = TransformJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTransformJobReque]
  }
  
  @scala.inline
  implicit class DescribeTransformJobRequeMutableBuilder[Self <: DescribeTransformJobReque] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    @scala.inline
    def setTransformJobName(value: TransformJobName): Self = StObject.set(x, "TransformJobName", value.asInstanceOf[js.Any])
  }
}
