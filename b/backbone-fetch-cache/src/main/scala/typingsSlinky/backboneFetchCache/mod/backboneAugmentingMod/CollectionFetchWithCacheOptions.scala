package typingsSlinky.backboneFetchCache.mod.backboneAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionFetchWithCacheOptions extends ModelFetchWithCacheOptions {
  @JSName("prefillSuccess")
  var prefillSuccess_CollectionFetchWithCacheOptions: js.UndefOr[js.Function1[/* self */ js.Any, Unit]] = js.native
}

object CollectionFetchWithCacheOptions {
  @scala.inline
  def apply(): CollectionFetchWithCacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionFetchWithCacheOptions]
  }
  @scala.inline
  implicit class CollectionFetchWithCacheOptionsOps[Self <: CollectionFetchWithCacheOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrefillSuccess(value: /* self */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefillSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPrefillSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefillSuccess")(js.undefined)
        ret
    }
  }
  
}

