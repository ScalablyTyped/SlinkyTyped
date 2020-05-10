package typingsSlinky.pulumiAws.connectionAssociationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionAssociationArgs extends js.Object {
  /**
    * The ID of the connection.
    */
  val connectionId: Input[String] = js.native
  /**
    * The ID of the LAG with which to associate the connection.
    */
  val lagId: Input[String] = js.native
}

object ConnectionAssociationArgs {
  @scala.inline
  def apply(connectionId: Input[String], lagId: Input[String]): ConnectionAssociationArgs = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], lagId = lagId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionAssociationArgs]
  }
  @scala.inline
  implicit class ConnectionAssociationArgsOps[Self <: ConnectionAssociationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLagId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lagId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

