package typingsSlinky.awsSdkClientDynamodbNode.typesGlobalTableNotFoundExceptionMod

import typingsSlinky.awsSdkClientDynamodbNode.describeGlobalTableExceptionsUnionMod.DescribeGlobalTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.describeGlobalTableSettingsExceptionsUnionMod.DescribeGlobalTableSettingsExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.updateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.updateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_GlobalTableNotFoundExceptionDetails> * / any */ @js.native
trait GlobalTableNotFoundException
  extends DescribeGlobalTableExceptionsUnion
     with DescribeGlobalTableSettingsExceptionsUnion
     with UpdateGlobalTableExceptionsUnion
     with UpdateGlobalTableSettingsExceptionsUnion {
  
  var name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.GlobalTableNotFoundException = js.native
}
object GlobalTableNotFoundException {
  
  @scala.inline
  def apply(
    name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.GlobalTableNotFoundException
  ): GlobalTableNotFoundException = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTableNotFoundException]
  }
  
  @scala.inline
  implicit class GlobalTableNotFoundExceptionOps[Self <: GlobalTableNotFoundException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.GlobalTableNotFoundException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
