package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearStorageDataOptions extends js.Object {
  /**
    * Should follow window.location.origin’s representation scheme://host:port.
    */
  var origin: js.UndefOr[String] = js.native
  /**
    * The types of quotas to clear, can contain: temporary, persistent, syncable.
    */
  var quotas: js.UndefOr[js.Array[String]] = js.native
  /**
    * The types of storages to clear, can contain: appcache, cookies, filesystem,
    * indexdb, localstorage, shadercache, websql, serviceworkers, cachestorage.
    */
  var storages: js.UndefOr[js.Array[String]] = js.native
}

object ClearStorageDataOptions {
  @scala.inline
  def apply(): ClearStorageDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearStorageDataOptions]
  }
  @scala.inline
  implicit class ClearStorageDataOptionsOps[Self <: ClearStorageDataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotas(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotas")(js.undefined)
        ret
    }
    @scala.inline
    def withStorages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storages")(js.undefined)
        ret
    }
  }
  
}

