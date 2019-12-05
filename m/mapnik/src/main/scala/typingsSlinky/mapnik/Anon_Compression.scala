package typingsSlinky.mapnik

import typingsSlinky.mapnik.mapnikStrings.DEFAULT
import typingsSlinky.mapnik.mapnikStrings.FILTERED
import typingsSlinky.mapnik.mapnikStrings.FIXED
import typingsSlinky.mapnik.mapnikStrings.HUFFMAN_ONLY
import typingsSlinky.mapnik.mapnikStrings.RLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compression extends js.Object {
  var compression: js.UndefOr[Double] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var strategy: js.UndefOr[FILTERED | HUFFMAN_ONLY | RLE | FIXED | DEFAULT] = js.undefined
}

object Anon_Compression {
  @scala.inline
  def apply(
    compression: Int | Double = null,
    level: Int | Double = null,
    strategy: FILTERED | HUFFMAN_ONLY | RLE | FIXED | DEFAULT = null
  ): Anon_Compression = {
    val __obj = js.Dynamic.literal()
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Compression]
  }
}

