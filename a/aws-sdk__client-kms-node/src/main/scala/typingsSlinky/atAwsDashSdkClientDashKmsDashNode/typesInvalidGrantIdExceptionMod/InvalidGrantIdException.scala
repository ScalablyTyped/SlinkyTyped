package typingsSlinky.atAwsDashSdkClientDashKmsDashNode.typesInvalidGrantIdExceptionMod

import typingsSlinky.atAwsDashSdkClientDashKmsDashNode.typesRetireGrantExceptionsUnionMod.RetireGrantExceptionsUnion
import typingsSlinky.atAwsDashSdkClientDashKmsDashNode.typesRevokeGrantExceptionsUnionMod.RevokeGrantExceptionsUnion
import typingsSlinky.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidGrantIdException
  extends ServiceException[_InvalidGrantIdExceptionDetails]
     with RetireGrantExceptionsUnion
     with RevokeGrantExceptionsUnion {
  @JSName("name")
  var name_InvalidGrantIdException: typingsSlinky.atAwsDashSdkClientDashKmsDashNode.atAwsDashSdkClientDashKmsDashNodeStrings.InvalidGrantIdException = js.native
}

