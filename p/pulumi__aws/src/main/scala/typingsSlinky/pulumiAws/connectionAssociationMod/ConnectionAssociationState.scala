package typingsSlinky.pulumiAws.connectionAssociationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionAssociationState extends js.Object {
  /**
    * The ID of the connection.
    */
  val connectionId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the LAG with which to associate the connection.
    */
  val lagId: js.UndefOr[Input[String]] = js.native
}

object ConnectionAssociationState {
  @scala.inline
  def apply(): ConnectionAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionAssociationState]
  }
  @scala.inline
  implicit class ConnectionAssociationStateOps[Self <: ConnectionAssociationState] (val x: Self) extends AnyVal {
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
    def withoutConnectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(js.undefined)
        ret
    }
    @scala.inline
    def withLagId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lagId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLagId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lagId")(js.undefined)
        ret
    }
  }
  
}

