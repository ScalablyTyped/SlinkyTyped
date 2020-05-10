package typingsSlinky.extjs.Ext.data.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMemory extends IClient {
  /** [Config Option] (Object) */
  var data: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var enablePaging: js.UndefOr[Boolean] = js.native
}

object IMemory {
  @scala.inline
  def apply(): IMemory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMemory]
  }
  @scala.inline
  implicit class IMemoryOps[Self <: IMemory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePaging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePaging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePaging")(js.undefined)
        ret
    }
  }
  
}

