package typingsSlinky.bloomFilter.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterOptions extends js.Object {
  var nFlags: js.UndefOr[Double] = js.native
  var nHashFuncs: Double = js.native
  var nTweak: js.UndefOr[Double] = js.native
  var vData: Buffer = js.native
}

object FilterOptions {
  @scala.inline
  def apply(nHashFuncs: Double, vData: Buffer): FilterOptions = {
    val __obj = js.Dynamic.literal(nHashFuncs = nHashFuncs.asInstanceOf[js.Any], vData = vData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOptions]
  }
  @scala.inline
  implicit class FilterOptionsOps[Self <: FilterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNHashFuncs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nHashFuncs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVData(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nFlags")(js.undefined)
        ret
    }
    @scala.inline
    def withNTweak(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nTweak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNTweak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nTweak")(js.undefined)
        ret
    }
  }
  
}

