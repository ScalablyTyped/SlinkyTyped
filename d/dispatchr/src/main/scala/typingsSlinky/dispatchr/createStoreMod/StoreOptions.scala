package typingsSlinky.dispatchr.createStoreMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreOptions extends js.Object {
  var dehydrate: js.UndefOr[js.Function0[_]] = js.native
  var handlers: StringDictionary[String] = js.native
  var initialize: js.UndefOr[js.Function0[Unit]] = js.native
  var mixins: js.UndefOr[js.Array[js.Object]] = js.native
  var rehydrate: js.UndefOr[js.Function1[/* state */ js.Any, Unit]] = js.native
  var statics: js.UndefOr[StringDictionary[js.Any]] = js.native
  var storeName: String = js.native
}

object StoreOptions {
  @scala.inline
  def apply(handlers: StringDictionary[String], storeName: String): StoreOptions = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], storeName = storeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreOptions]
  }
  @scala.inline
  implicit class StoreOptionsOps[Self <: StoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandlers(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoreName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDehydrate(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dehydrate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDehydrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dehydrate")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInitialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.undefined)
        ret
    }
    @scala.inline
    def withMixins(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMixins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixins")(js.undefined)
        ret
    }
    @scala.inline
    def withRehydrate(value: /* state */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rehydrate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRehydrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rehydrate")(js.undefined)
        ret
    }
    @scala.inline
    def withStatics(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statics")(js.undefined)
        ret
    }
  }
  
}

