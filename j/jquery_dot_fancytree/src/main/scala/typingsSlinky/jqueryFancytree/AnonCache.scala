package typingsSlinky.jqueryFancytree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCache extends js.Object {
  /**
    * false: Append random '_' argument to the request url to prevent caching.
    */
  var cache: Boolean = js.native
  /**
    * Default 'json' -> Expect json format and pass json object to callbacks.
    */
  var dataType: String = js.native
  /**
    * HTTP Method (default: 'GET')
    */
  var `type`: String = js.native
}

object AnonCache {
  @scala.inline
  def apply(cache: Boolean, dataType: String, `type`: String): AnonCache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCache]
  }
  @scala.inline
  implicit class AnonCacheOps[Self <: AnonCache] (val x: Self) extends AnyVal {
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
    def withDataType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

