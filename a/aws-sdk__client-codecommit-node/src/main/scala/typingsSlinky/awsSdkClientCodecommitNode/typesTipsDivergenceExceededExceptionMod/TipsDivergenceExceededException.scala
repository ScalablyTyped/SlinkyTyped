package typingsSlinky.awsSdkClientCodecommitNode.typesTipsDivergenceExceededExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.getMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TipsDivergenceExceededException
  extends ServiceException[TipsDivergenceExceededExceptionDetails]
     with GetMergeConflictsExceptionsUnion {
  
  @JSName("name")
  var name_TipsDivergenceExceededException: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TipsDivergenceExceededException = js.native
}
object TipsDivergenceExceededException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: TipsDivergenceExceededExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TipsDivergenceExceededException
  ): TipsDivergenceExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TipsDivergenceExceededException]
  }
  
  @scala.inline
  implicit class TipsDivergenceExceededExceptionOps[Self <: TipsDivergenceExceededException] (val x: Self) extends AnyVal {
    
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
    def setName(
      value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TipsDivergenceExceededException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
