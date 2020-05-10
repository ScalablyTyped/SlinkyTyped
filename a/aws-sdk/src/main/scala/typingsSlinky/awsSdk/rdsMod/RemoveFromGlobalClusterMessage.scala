package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveFromGlobalClusterMessage extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) identifying the cluster that was detached from the Aurora global database cluster. 
    */
  var DbClusterIdentifier: js.UndefOr[String] = js.native
  /**
    *  The cluster identifier to detach from the Aurora global database cluster. 
    */
  var GlobalClusterIdentifier: js.UndefOr[String] = js.native
}

object RemoveFromGlobalClusterMessage {
  @scala.inline
  def apply(): RemoveFromGlobalClusterMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveFromGlobalClusterMessage]
  }
  @scala.inline
  implicit class RemoveFromGlobalClusterMessageOps[Self <: RemoveFromGlobalClusterMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDbClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbClusterIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbClusterIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalClusterIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalClusterIdentifier")(js.undefined)
        ret
    }
  }
  
}

