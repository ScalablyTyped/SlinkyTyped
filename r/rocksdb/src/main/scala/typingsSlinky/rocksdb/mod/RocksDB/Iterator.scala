package typingsSlinky.rocksdb.mod.RocksDB

import typingsSlinky.abstractLeveldown.mod.AbstractIterator
import typingsSlinky.abstractLeveldown.mod.AbstractLevelDOWN
import typingsSlinky.abstractLeveldown.mod.ErrorCallback
import typingsSlinky.abstractLeveldown.mod.ErrorKeyValueCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Iterator extends AbstractIterator[Bytes, Bytes] {
  var binding: js.Any = js.native
  var cache: js.Any = js.native
  var fastFuture: js.Any = js.native
  var finished: js.Any = js.native
  def seek(key: Bytes): Unit = js.native
}

object Iterator {
  @scala.inline
  def apply(
    binding: js.Any,
    cache: js.Any,
    db: AbstractLevelDOWN[Bytes, Bytes],
    end: ErrorCallback => Unit,
    fastFuture: js.Any,
    finished: js.Any,
    next: ErrorKeyValueCallback[Bytes, Bytes] => Iterator,
    seek: Bytes => Unit
  ): Iterator = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], end = js.Any.fromFunction1(end), fastFuture = fastFuture.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], next = js.Any.fromFunction1(next), seek = js.Any.fromFunction1(seek))
    __obj.asInstanceOf[Iterator]
  }
  @scala.inline
  implicit class IteratorOps[Self <: Iterator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinding(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCache(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFastFuture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastFuture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinished(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finished")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeek(value: Bytes => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

