package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalClusterMember extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) for each Aurora cluster. 
    */
  var DBClusterArn: js.UndefOr[String] = js.native
  /**
    *  Specifies whether the Aurora cluster is the primary cluster (that is, has read-write capability) for the Aurora global database with which it is associated. 
    */
  var IsWriter: js.UndefOr[Boolean] = js.native
  /**
    *  The Amazon Resource Name (ARN) for each read-only secondary cluster associated with the Aurora global database. 
    */
  var Readers: js.UndefOr[ReadersArnList] = js.native
}

object GlobalClusterMember {
  @scala.inline
  def apply(): GlobalClusterMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalClusterMember]
  }
  @scala.inline
  implicit class GlobalClusterMemberOps[Self <: GlobalClusterMember] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBClusterArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterArn")(js.undefined)
        ret
    }
    @scala.inline
    def withIsWriter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsWriter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsWriter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsWriter")(js.undefined)
        ret
    }
    @scala.inline
    def withReaders(value: ReadersArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Readers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Readers")(js.undefined)
        ret
    }
  }
  
}

