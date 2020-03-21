package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RdsParameters extends js.Object {
  /**
    * Database.
    */
  var Database: typingsSlinky.awsSdk.quicksightMod.Database = js.native
  /**
    * Instance ID.
    */
  var InstanceId: typingsSlinky.awsSdk.quicksightMod.InstanceId = js.native
}

object RdsParameters {
  @scala.inline
  def apply(Database: Database, InstanceId: InstanceId): RdsParameters = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RdsParameters]
  }
}

