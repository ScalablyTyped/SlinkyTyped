package typingsSlinky.awsSdkClientLambdaNode.typesKmsdisabledexceptionMod

import typingsSlinky.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KMSDisabledException
  extends ServiceException[KMSDisabledExceptionDetails]
     with InvokeExceptionsUnion {
  
  @JSName("name")
  var name_KMSDisabledException: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSDisabledException = js.native
}
object KMSDisabledException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: KMSDisabledExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSDisabledException
  ): KMSDisabledException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMSDisabledException]
  }
  
  @scala.inline
  implicit class KMSDisabledExceptionOps[Self <: KMSDisabledException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSDisabledException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
