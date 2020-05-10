package typingsSlinky.cachefactory.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheFactoryInfo extends CacheOptions {
  var caches: StringDictionary[CacheInfo] = js.native
  var size: Double = js.native
}

object CacheFactoryInfo {
  @scala.inline
  def apply(caches: StringDictionary[CacheInfo], size: Double): CacheFactoryInfo = {
    val __obj = js.Dynamic.literal(caches = caches.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheFactoryInfo]
  }
  @scala.inline
  implicit class CacheFactoryInfoOps[Self <: CacheFactoryInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaches(value: StringDictionary[CacheInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

