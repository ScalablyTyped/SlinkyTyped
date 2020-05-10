package typingsSlinky.firefoxWebextBrowser.browser.browsingData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A set of data types. Missing data types are interpreted as `false`. */
@js.native
trait DataTypeSet extends js.Object {
  /**
    * The browser's cache. Note: when removing data, this clears the _entire_ cache: it is not limited to the
    * range you specify.
    */
  var cache: js.UndefOr[Boolean] = js.native
  /** The browser's cookies. */
  var cookies: js.UndefOr[Boolean] = js.native
  /** The browser's download list. */
  var downloads: js.UndefOr[Boolean] = js.native
  /** The browser's stored form data. */
  var formData: js.UndefOr[Boolean] = js.native
  /** The browser's history. */
  var history: js.UndefOr[Boolean] = js.native
  /** Websites' IndexedDB data. */
  var indexedDB: js.UndefOr[Boolean] = js.native
  /** Websites' local storage data. */
  var localStorage: js.UndefOr[Boolean] = js.native
  /** Stored passwords. */
  var passwords: js.UndefOr[Boolean] = js.native
  /** Plugins' data. */
  var pluginData: js.UndefOr[Boolean] = js.native
  /** Server-bound certificates. */
  var serverBoundCertificates: js.UndefOr[Boolean] = js.native
  /** Service Workers. */
  var serviceWorkers: js.UndefOr[Boolean] = js.native
}

object DataTypeSet {
  @scala.inline
  def apply(): DataTypeSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTypeSet]
  }
  @scala.inline
  implicit class DataTypeSetOps[Self <: DataTypeSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCookies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookies")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloads(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloads")(js.undefined)
        ret
    }
    @scala.inline
    def withFormData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formData")(js.undefined)
        ret
    }
    @scala.inline
    def withHistory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexedDB(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexedDB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexedDB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexedDB")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalStorage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswords(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwords")(js.undefined)
        ret
    }
    @scala.inline
    def withPluginData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluginData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginData")(js.undefined)
        ret
    }
    @scala.inline
    def withServerBoundCertificates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverBoundCertificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerBoundCertificates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverBoundCertificates")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceWorkers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceWorkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceWorkers")(js.undefined)
        ret
    }
  }
  
}

