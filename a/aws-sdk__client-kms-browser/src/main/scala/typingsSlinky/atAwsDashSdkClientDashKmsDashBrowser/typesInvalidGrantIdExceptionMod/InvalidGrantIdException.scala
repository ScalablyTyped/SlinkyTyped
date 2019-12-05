package typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.typesInvalidGrantIdExceptionMod

import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.typesRetireGrantExceptionsUnionMod.RetireGrantExceptionsUnion
import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.typesRevokeGrantExceptionsUnionMod.RevokeGrantExceptionsUnion
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
  var name_InvalidGrantIdException: typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.InvalidGrantIdException = js.native
}

