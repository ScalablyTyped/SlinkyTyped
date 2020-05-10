package typingsSlinky.mongodb

import typingsSlinky.mongodb.mod.ClientSession
import typingsSlinky.mongodb.mongodbStrings.majority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mongodb.mongodb.UpdateOneOptions & {  multi ? :boolean} */
@js.native
trait UpdateOneOptionsmultibool extends js.Object {
  var arrayFilters: js.UndefOr[js.Array[js.Object]] = js.native
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.native
  /**
    * requests acknowledgement from MongoDB that the write operation has
    * been written to the journal
    * @default false
    */
  var j: js.UndefOr[Boolean] = js.native
  var multi: js.UndefOr[Boolean] = js.native
  var session: js.UndefOr[ClientSession] = js.native
  var upsert: js.UndefOr[Boolean] = js.native
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

object UpdateOneOptionsmultibool {
  @scala.inline
  def apply(): UpdateOneOptionsmultibool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOneOptionsmultibool]
  }
  @scala.inline
  implicit class UpdateOneOptionsmultiboolOps[Self <: UpdateOneOptionsmultibool] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayFilters(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withBypassDocumentValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypassDocumentValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBypassDocumentValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypassDocumentValidation")(js.undefined)
        ret
    }
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
    def withMulti(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMulti: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(js.undefined)
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
    def withUpsert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsert")(js.undefined)
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

