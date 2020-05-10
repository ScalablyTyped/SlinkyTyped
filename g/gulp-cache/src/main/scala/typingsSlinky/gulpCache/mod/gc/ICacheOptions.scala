package typingsSlinky.gulpCache.mod.gc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICacheOptions extends js.Object {
  /**
    * Specifies the name of the directory where the cache
    * is to be stored.
    */
  var cacheDirName: String = js.native
}

object ICacheOptions {
  @scala.inline
  def apply(cacheDirName: String): ICacheOptions = {
    val __obj = js.Dynamic.literal(cacheDirName = cacheDirName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICacheOptions]
  }
  @scala.inline
  implicit class ICacheOptionsOps[Self <: ICacheOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheDirName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheDirName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

