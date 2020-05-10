package typingsSlinky.chromeApps.WebView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WebView element from html
  */
/** A set of data types. Missing properties are interpreted as false. */
@js.native
trait ClearDataTypeSet extends js.Object {
  /** Websites' appcaches. */
  var appcache: js.UndefOr[Boolean] = js.native
  /**
    * The browser's cache. Note: when removing data, this clears the entire cache; it is not limited to the range you specify.
    * @since Chrome 43.
    */
  var cache: js.UndefOr[Boolean] = js.native
  /** The partition's cookies. */
  var cookies: js.UndefOr[Boolean] = js.native
  /** Websites' filesystems. */
  var fileSystems: js.UndefOr[Boolean] = js.native
  /** Websites' IndexedDB data. */
  var indexedDB: js.UndefOr[Boolean] = js.native
  /** Websites' local storage data. */
  var localStorage: js.UndefOr[Boolean] = js.native
  /** The partition's persistent cookies. */
  var persistentCookies: js.UndefOr[Boolean] = js.native
  /** The partition's session cookies. */
  var sessionCookies: js.UndefOr[Boolean] = js.native
  /** Websites' WebSQL data. */
  var webSQL: js.UndefOr[Boolean] = js.native
}

object ClearDataTypeSet {
  @scala.inline
  def apply(): ClearDataTypeSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearDataTypeSet]
  }
  @scala.inline
  implicit class ClearDataTypeSetOps[Self <: ClearDataTypeSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppcache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appcache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppcache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appcache")(js.undefined)
        ret
    }
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
    def withFileSystems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSystems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSystems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSystems")(js.undefined)
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
    def withPersistentCookies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentCookies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistentCookies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentCookies")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionCookies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionCookies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionCookies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionCookies")(js.undefined)
        ret
    }
    @scala.inline
    def withWebSQL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSQL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebSQL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSQL")(js.undefined)
        ret
    }
  }
  
}

