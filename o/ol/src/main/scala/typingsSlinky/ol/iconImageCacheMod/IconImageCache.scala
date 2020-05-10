package typingsSlinky.ol.iconImageCacheMod

import typingsSlinky.ol.colorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconImageCache extends js.Object {
  def canExpireCache(): Boolean = js.native
  def clear(): Unit = js.native
  def expire(): Unit = js.native
  def get(src: String, crossOrigin: String, color: Color): typingsSlinky.ol.iconImageMod.default = js.native
  def set(src: String, crossOrigin: String, color: Color, iconImage: typingsSlinky.ol.iconImageMod.default): Unit = js.native
  def setSize(maxCacheSize: Double): Unit = js.native
}

object IconImageCache {
  @scala.inline
  def apply(
    canExpireCache: () => Boolean,
    clear: () => Unit,
    expire: () => Unit,
    get: (String, String, Color) => typingsSlinky.ol.iconImageMod.default,
    set: (String, String, Color, typingsSlinky.ol.iconImageMod.default) => Unit,
    setSize: Double => Unit
  ): IconImageCache = {
    val __obj = js.Dynamic.literal(canExpireCache = js.Any.fromFunction0(canExpireCache), clear = js.Any.fromFunction0(clear), expire = js.Any.fromFunction0(expire), get = js.Any.fromFunction3(get), set = js.Any.fromFunction4(set), setSize = js.Any.fromFunction1(setSize))
    __obj.asInstanceOf[IconImageCache]
  }
  @scala.inline
  implicit class IconImageCacheOps[Self <: IconImageCache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanExpireCache(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canExpireCache")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExpire(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expire")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet(value: (String, String, Color) => typingsSlinky.ol.iconImageMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSet(value: (String, String, Color, typingsSlinky.ol.iconImageMod.default) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSetSize(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

