package typingsSlinky.cacheManager.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cacheManager.AnonCreate
import typingsSlinky.cacheManager.cacheManagerStrings.memory
import typingsSlinky.cacheManager.cacheManagerStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreConfig
  extends CachingConfig
     with /**
  * You may pass in any other arguments these will be passed on to the `create` method of your store,
  * otherwise they will be ignored.
  */
/* key */ StringDictionary[js.Any] {
  var max: js.UndefOr[Double] = js.native
  var store: memory | none | Store | AnonCreate = js.native
}

object StoreConfig {
  @scala.inline
  def apply(store: memory | none | Store | AnonCreate, ttl: Double | TtlFunction): StoreConfig = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreConfig]
  }
  @scala.inline
  implicit class StoreConfigOps[Self <: StoreConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStore(value: memory | none | Store | AnonCreate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
  }
  
}

