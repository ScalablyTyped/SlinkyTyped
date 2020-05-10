package typingsSlinky.knockoutMapping.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutPropertyMappingCallBack extends js.Object {
  var create: js.UndefOr[js.Function1[/* options */ KnockoutMappingCreateOptions, Unit]] = js.native
  var key: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  var update: js.UndefOr[js.Function1[/* options */ KnockoutMappingUpdateOptions, Unit]] = js.native
}

object KnockoutPropertyMappingCallBack {
  @scala.inline
  def apply(): KnockoutPropertyMappingCallBack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutPropertyMappingCallBack]
  }
  @scala.inline
  implicit class KnockoutPropertyMappingCallBackOps[Self <: KnockoutPropertyMappingCallBack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: /* options */ KnockoutMappingCreateOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: /* options */ KnockoutMappingUpdateOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

