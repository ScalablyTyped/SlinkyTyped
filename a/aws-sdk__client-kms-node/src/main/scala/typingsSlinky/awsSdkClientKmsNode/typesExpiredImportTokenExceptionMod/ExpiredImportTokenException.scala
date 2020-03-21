package typingsSlinky.awsSdkClientKmsNode.typesExpiredImportTokenExceptionMod

import typingsSlinky.awsSdkClientKmsNode.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpiredImportTokenException
  extends ServiceException[ExpiredImportTokenExceptionDetails]
     with ImportKeyMaterialExceptionsUnion {
  @JSName("name")
  var name_ExpiredImportTokenException: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.ExpiredImportTokenException = js.native
}

