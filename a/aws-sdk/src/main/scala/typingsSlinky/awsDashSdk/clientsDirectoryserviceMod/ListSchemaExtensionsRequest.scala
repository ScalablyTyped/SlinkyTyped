package typingsSlinky.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSchemaExtensionsRequest extends js.Object {
  /**
    * The identifier of the directory from which to retrieve the schema extension information.
    */
  var DirectoryId: typingsSlinky.awsDashSdk.clientsDirectoryserviceMod.DirectoryId = js.native
  /**
    * The maximum number of items to return.
    */
  var Limit: js.UndefOr[typingsSlinky.awsDashSdk.clientsDirectoryserviceMod.Limit] = js.native
  /**
    * The ListSchemaExtensions.NextToken value from a previous call to ListSchemaExtensions. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsDashSdk.clientsDirectoryserviceMod.NextToken] = js.native
}

object ListSchemaExtensionsRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, Limit: Int | Double = null, NextToken: NextToken = null): ListSchemaExtensionsRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchemaExtensionsRequest]
  }
}

