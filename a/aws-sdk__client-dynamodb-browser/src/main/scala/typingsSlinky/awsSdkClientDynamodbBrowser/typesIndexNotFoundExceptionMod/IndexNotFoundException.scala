package typingsSlinky.awsSdkClientDynamodbBrowser.typesIndexNotFoundExceptionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.updateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexNotFoundException
  extends ServiceException[IndexNotFoundExceptionDetails]
     with UpdateGlobalTableSettingsExceptionsUnion {
  @JSName("name")
  var name_IndexNotFoundException: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.IndexNotFoundException = js.native
}

