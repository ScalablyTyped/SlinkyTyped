package typingsSlinky.extjs.Ext.data

import typingsSlinky.extjs.Ext.data.proxy.IAjax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRestProxy extends IAjax {
  /** [Config Option] (Boolean) */
  var appendId: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.native
}

object IRestProxy {
  @scala.inline
  def apply(): IRestProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRestProxy]
  }
  @scala.inline
  implicit class IRestProxyOps[Self <: IRestProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendId")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
  }
  
}

