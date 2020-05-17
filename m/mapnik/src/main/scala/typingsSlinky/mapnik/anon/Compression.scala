package typingsSlinky.mapnik.anon

import typingsSlinky.mapnik.mapnikStrings.DEFAULT
import typingsSlinky.mapnik.mapnikStrings.FILTERED
import typingsSlinky.mapnik.mapnikStrings.FIXED
import typingsSlinky.mapnik.mapnikStrings.HUFFMAN_ONLY
import typingsSlinky.mapnik.mapnikStrings.RLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compression extends js.Object {
  var compression: js.UndefOr[Double] = js.native
  var level: js.UndefOr[Double] = js.native
  var strategy: js.UndefOr[FILTERED | HUFFMAN_ONLY | RLE | FIXED | DEFAULT] = js.native
}

object Compression {
  @scala.inline
  def apply(): Compression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compression]
  }
  @scala.inline
  implicit class CompressionOps[Self <: Compression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompression(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withStrategy(value: FILTERED | HUFFMAN_ONLY | RLE | FIXED | DEFAULT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(js.undefined)
        ret
    }
  }
  
}

