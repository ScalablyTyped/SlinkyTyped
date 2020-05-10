package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoClientCommonOption extends js.Object {
  /** Do not make the db an event listener to the original connection. */
  var noListener: js.UndefOr[Boolean] = js.native
  /** Control if you want to return a cached instance or have a new one created */
  var returnNonCachedInstance: js.UndefOr[Boolean] = js.native
}

object MongoClientCommonOption {
  @scala.inline
  def apply(): MongoClientCommonOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoClientCommonOption]
  }
  @scala.inline
  implicit class MongoClientCommonOptionOps[Self <: MongoClientCommonOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoListener(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noListener")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnNonCachedInstance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnNonCachedInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnNonCachedInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnNonCachedInstance")(js.undefined)
        ret
    }
  }
  
}

