package typingsSlinky.cassandraDriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyBuffer extends js.Object {
  var copyBuffer: js.UndefOr[Boolean] = js.native
  var map: js.UndefOr[js.Function] = js.native
  var set: js.UndefOr[js.Function] = js.native
  var useBigIntAsLong: js.UndefOr[Boolean] = js.native
  var useBigIntAsVarint: js.UndefOr[Boolean] = js.native
  var useUndefinedAsUnset: js.UndefOr[Boolean] = js.native
}

object CopyBuffer {
  @scala.inline
  def apply(): CopyBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyBuffer]
  }
  @scala.inline
  implicit class CopyBufferOps[Self <: CopyBuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopyBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withSet(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.undefined)
        ret
    }
    @scala.inline
    def withUseBigIntAsLong(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBigIntAsLong")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseBigIntAsLong: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBigIntAsLong")(js.undefined)
        ret
    }
    @scala.inline
    def withUseBigIntAsVarint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBigIntAsVarint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseBigIntAsVarint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBigIntAsVarint")(js.undefined)
        ret
    }
    @scala.inline
    def withUseUndefinedAsUnset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUndefinedAsUnset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseUndefinedAsUnset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUndefinedAsUnset")(js.undefined)
        ret
    }
  }
  
}

