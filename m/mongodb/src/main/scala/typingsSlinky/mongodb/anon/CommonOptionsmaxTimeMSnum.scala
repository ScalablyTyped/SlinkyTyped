package typingsSlinky.mongodb.anon

import typingsSlinky.mongodb.mod.ClientSession
import typingsSlinky.mongodb.mongodbStrings.majority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mongodb.mongodb.CommonOptions & {  maxTimeMS ? :number} */
@js.native
trait CommonOptionsmaxTimeMSnum extends js.Object {
  /**
    * requests acknowledgement from MongoDB that the write operation has
    * been written to the journal
    * @default false
    */
  var j: js.UndefOr[Boolean] = js.native
  var maxTimeMS: js.UndefOr[Double] = js.native
  var session: js.UndefOr[ClientSession] = js.native
  /**
    * requests acknowledgement that the write operation has
    * propagated to a specified number of mongod hosts
    * @default 1
    */
  var w: js.UndefOr[Double | majority | String] = js.native
  /**
    * a time limit, in milliseconds, for the write concern
    */
  var wtimeout: js.UndefOr[Double] = js.native
}

object CommonOptionsmaxTimeMSnum {
  @scala.inline
  def apply(): CommonOptionsmaxTimeMSnum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptionsmaxTimeMSnum]
  }
  @scala.inline
  implicit class CommonOptionsmaxTimeMSnumOps[Self <: CommonOptionsmaxTimeMSnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJ(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("j")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("j")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTimeMS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTimeMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTimeMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTimeMS")(js.undefined)
        ret
    }
    @scala.inline
    def withSession(value: ClientSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
    @scala.inline
    def withW(value: Double | majority | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutW: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(js.undefined)
        ret
    }
    @scala.inline
    def withWtimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wtimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWtimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wtimeout")(js.undefined)
        ret
    }
  }
  
}

