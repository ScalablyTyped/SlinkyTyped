package typingsSlinky.awsSdkClientKmsBrowser.typesInvalidMarkerExceptionMod

import typingsSlinky.awsSdkClientKmsBrowser.listAliasesExceptionsUnionMod.ListAliasesExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.listGrantsExceptionsUnionMod.ListGrantsExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.listKeysExceptionsUnionMod.ListKeysExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.listResourceTagsExceptionsUnionMod.ListResourceTagsExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.listRetirableGrantsExceptionsUnionMod.ListRetirableGrantsExceptionsUnion
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
  var name_InvalidMarkerException: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidMarkerException = js.native
}

