package typingsSlinky.mqtt.storeOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStoreOptions extends js.Object {
  /**
    * true, clear _inflights at close
    */
  var clean: js.UndefOr[Boolean] = js.native
}

object IStoreOptions {
  @scala.inline
  def apply(): IStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStoreOptions]
  }
  @scala.inline
  implicit class IStoreOptionsOps[Self <: IStoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(js.undefined)
        ret
    }
  }
  
}

