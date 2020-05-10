package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PosStore extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var storeAddress: js.UndefOr[String] = js.native
  var storeCode: js.UndefOr[String] = js.native
}

object PosStore {
  @scala.inline
  def apply(): PosStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PosStore]
  }
  @scala.inline
  implicit class PosStoreOps[Self <: PosStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeCode")(js.undefined)
        ret
    }
  }
  
}

