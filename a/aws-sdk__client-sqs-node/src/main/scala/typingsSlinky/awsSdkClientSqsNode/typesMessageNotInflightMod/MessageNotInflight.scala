package typingsSlinky.awsSdkClientSqsNode.typesMessageNotInflightMod

import typingsSlinky.awsSdkClientSqsNode.changeMessageVisibilityExceptionsUnionMod.ChangeMessageVisibilityExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageNotInflight
  extends ServiceException[MessageNotInflightDetails]
     with ChangeMessageVisibilityExceptionsUnion {
  @JSName("name")
  var name_MessageNotInflight: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MessageNotInflight = js.native
}

