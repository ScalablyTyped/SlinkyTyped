package typingsSlinky.diagnosticChannelPublishers.mysqlPubMod

import typingsSlinky.diagnosticChannelPublishers.AnonConnection
import typingsSlinky.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMysqlData extends js.Object {
  var callbackArgs: IArguments
  var duration: Double
  var err: js.Error
  var query: AnonConnection
}

object IMysqlData {
  @scala.inline
  def apply(callbackArgs: IArguments, duration: Double, err: js.Error, query: AnonConnection): IMysqlData = {
    val __obj = js.Dynamic.literal(callbackArgs = callbackArgs.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], err = err.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMysqlData]
  }
}

