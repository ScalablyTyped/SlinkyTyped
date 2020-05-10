package typingsSlinky.devextreme.mod.DevExpress.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreOptions[T] extends js.Object {
  /** Specifies the function that is executed when the store throws an error. */
  var errorHandler: js.UndefOr[js.Function] = js.native
  /** Specifies the key property (or properties) used to access data items. */
  var key: js.UndefOr[String | js.Array[String]] = js.native
  /** A function that is executed after a data item is added to the store. */
  var onInserted: js.UndefOr[js.Function2[/* values */ js.Any, /* key */ js.Any | String | Double, _]] = js.native
  /** A function that is executed before a data item is added to the store. */
  var onInserting: js.UndefOr[js.Function1[/* values */ js.Any, _]] = js.native
  /** A function that is executed after data is loaded to the store. */
  var onLoaded: js.UndefOr[js.Function1[/* result */ js.Array[_], _]] = js.native
  /** A function that is executed before data is loaded to the store. */
  var onLoading: js.UndefOr[js.Function1[/* loadOptions */ LoadOptions, _]] = js.native
  /** A function that is executed after a data item is added, updated, or removed from the store. */
  var onModified: js.UndefOr[js.Function] = js.native
  /** A function that is executed before a data item is added, updated, or removed from the store. */
  var onModifying: js.UndefOr[js.Function] = js.native
  /** The function executed before changes are pushed to the store. */
  var onPush: js.UndefOr[js.Function1[/* changes */ js.Array[_], _]] = js.native
  /** A function that is executed after a data item is removed from the store. */
  var onRemoved: js.UndefOr[js.Function1[/* key */ js.Any | String | Double, _]] = js.native
  /** A function that is executed before a data item is removed from the store. */
  var onRemoving: js.UndefOr[js.Function1[/* key */ js.Any | String | Double, _]] = js.native
  /** A function that is executed after a data item is updated in the store. */
  var onUpdated: js.UndefOr[js.Function2[/* key */ js.Any | String | Double, /* values */ js.Any, _]] = js.native
  /** A function that is executed before a data item is updated in the store. */
  var onUpdating: js.UndefOr[js.Function2[/* key */ js.Any | String | Double, /* values */ js.Any, _]] = js.native
}

object StoreOptions {
  @scala.inline
  def apply[T](): StoreOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreOptions[T]]
  }
  @scala.inline
  implicit class StoreOptionsOps[Self[t] <: StoreOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withErrorHandler(value: js.Function): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorHandler: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String | js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInserted(value: (/* values */ js.Any, /* key */ js.Any | String | Double) => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInserted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnInserted: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInserted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInserting(value: /* values */ js.Any => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInserting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInserting: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInserting")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoaded(value: /* result */ js.Array[_] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoaded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoaded: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoading(value: /* loadOptions */ LoadOptions => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoading")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoading: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withOnModified(value: js.Function): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnModified: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModified")(js.undefined)
        ret
    }
    @scala.inline
    def withOnModifying(value: js.Function): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModifying")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnModifying: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModifying")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPush(value: /* changes */ js.Array[_] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPush")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPush: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPush")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemoved(value: /* key */ js.Any | String | Double => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRemoved: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemoving(value: /* key */ js.Any | String | Double => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoving")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRemoving: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoving")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdated(value: (/* key */ js.Any | String | Double, /* values */ js.Any) => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdated")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnUpdated: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdating(value: (/* key */ js.Any | String | Double, /* values */ js.Any) => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdating")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnUpdating: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdating")(js.undefined)
        ret
    }
  }
  
}

