package typingsSlinky.devextreme.mod.DevExpress.data

import typingsSlinky.devextreme.anon.Filter
import typingsSlinky.devextreme.devextremeStrings.processed
import typingsSlinky.devextreme.devextremeStrings.raw
import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomStoreOptions extends StoreOptions[CustomStore] {
  /** Specifies a custom implementation of the byKey(key) method. */
  var byKey: js.UndefOr[js.Function1[/* key */ js.Any | String | Double, Promise[_] | JQueryPromise[_]]] = js.native
  /** Specifies whether raw data should be saved in the cache. Applies only if loadMode is "raw". */
  var cacheRawData: js.UndefOr[Boolean] = js.native
  /** Specifies a custom implementation of the insert(values) method. */
  var insert: js.UndefOr[js.Function1[/* values */ js.Any, Promise[_] | JQueryPromise[_]]] = js.native
  /** Specifies a custom implementation of the load(options) method. */
  var load: js.UndefOr[
    js.Function1[/* options */ LoadOptions, Promise[_] | JQueryPromise[_] | js.Array[_]]
  ] = js.native
  /** Specifies how data returned by the load function is treated. */
  var loadMode: js.UndefOr[processed | raw] = js.native
  /** Specifies a custom implementation of the remove(key) method. */
  var remove: js.UndefOr[
    js.Function1[/* key */ js.Any | String | Double, Promise[Unit] | JQueryPromise[Unit]]
  ] = js.native
  /** Specifies a custom implementation of the totalCount(options) method. */
  var totalCount: js.UndefOr[js.Function1[/* loadOptions */ Filter, Promise[Double] | JQueryPromise[Double]]] = js.native
  /** Specifies a custom implementation of the update(key, values) method. */
  var update: js.UndefOr[
    js.Function2[
      /* key */ js.Any | String | Double, 
      /* values */ js.Any, 
      Promise[_] | JQueryPromise[_]
    ]
  ] = js.native
  /** Specifies whether the store combines the search and filter expressions. Defaults to true if the loadMode is "raw" and false if it is "processed". */
  var useDefaultSearch: js.UndefOr[Boolean] = js.native
}

object CustomStoreOptions {
  @scala.inline
  def apply(): CustomStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomStoreOptions]
  }
  @scala.inline
  implicit class CustomStoreOptionsOps[Self <: CustomStoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByKey(value: /* key */ js.Any | String | Double => Promise[_] | JQueryPromise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutByKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byKey")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheRawData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheRawData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheRawData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheRawData")(js.undefined)
        ret
    }
    @scala.inline
    def withInsert(value: /* values */ js.Any => Promise[_] | JQueryPromise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: /* options */ LoadOptions => Promise[_] | JQueryPromise[_] | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadMode(value: processed | raw): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: /* key */ js.Any | String | Double => Promise[Unit] | JQueryPromise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalCount(value: /* loadOptions */ Filter => Promise[Double] | JQueryPromise[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTotalCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalCount")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: (/* key */ js.Any | String | Double, /* values */ js.Any) => Promise[_] | JQueryPromise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withUseDefaultSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDefaultSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDefaultSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDefaultSearch")(js.undefined)
        ret
    }
  }
  
}

