package typingsSlinky.awsSdkClientKmsNode.typesInvalidImportTokenExceptionMod

import typingsSlinky.awsSdkClientKmsNode.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidImportTokenException
  extends ServiceException[InvalidImportTokenExceptionDetails]
     with ImportKeyMaterialExceptionsUnion {
  @JSName("name")
  var name_InvalidImportTokenException: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidImportTokenException = js.native
}

