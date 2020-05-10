package typingsSlinky.rocksdb.mod.RocksDB

import typingsSlinky.abstractLeveldown.mod.AbstractIteratorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IteratorOptions extends AbstractIteratorOptions[Bytes] {
  var fillCache: js.UndefOr[Boolean] = js.native
}

object IteratorOptions {
  @scala.inline
  def apply(): IteratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IteratorOptions]
  }
  @scala.inline
  implicit class IteratorOptionsOps[Self <: IteratorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFillCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillCache")(js.undefined)
        ret
    }
  }
  
}

