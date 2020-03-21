package typingsSlinky.awsSdkClientKmsNode.typesInvalidMarkerExceptionMod

import typingsSlinky.awsSdkClientKmsNode.listAliasesExceptionsUnionMod.ListAliasesExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.listGrantsExceptionsUnionMod.ListGrantsExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.listKeysExceptionsUnionMod.ListKeysExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.listResourceTagsExceptionsUnionMod.ListResourceTagsExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.listRetirableGrantsExceptionsUnionMod.ListRetirableGrantsExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidMarkerException
  extends ServiceException[InvalidMarkerExceptionDetails]
     with ListAliasesExceptionsUnion
     with ListGrantsExceptionsUnion
     with ListKeysExceptionsUnion
     with ListResourceTagsExceptionsUnion
     with ListRetirableGrantsExceptionsUnion {
  @JSName("name")
  var name_InvalidMarkerException: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidMarkerException = js.native
}

