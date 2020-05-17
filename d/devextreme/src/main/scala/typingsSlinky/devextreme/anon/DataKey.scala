package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataKey extends js.Object {
  var data: js.UndefOr[js.Any] = js.native
  var key: js.UndefOr[js.Any] = js.native
}

object DataKey {
  @scala.inline
  def apply(): DataKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataKey]
  }
  @scala.inline
  implicit class DataKeyOps[Self <: DataKey] (val x: Self) extends AnyVal {
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
    def withKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
  }
  
}

