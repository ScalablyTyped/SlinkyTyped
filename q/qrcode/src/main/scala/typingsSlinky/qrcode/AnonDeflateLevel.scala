package typingsSlinky.qrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeflateLevel extends js.Object {
  /**
    * Compression level for deflate.
    * Default: 9
    */
  var deflateLevel: js.UndefOr[Double] = js.native
  /**
    * Compression strategy for deflate.
    * Default: 3
    */
  var deflateStrategy: js.UndefOr[Double] = js.native
}

object AnonDeflateLevel {
  @scala.inline
  def apply(): AnonDeflateLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDeflateLevel]
  }
  @scala.inline
  implicit class AnonDeflateLevelOps[Self <: AnonDeflateLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeflateLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deflateLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeflateLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deflateLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withDeflateStrategy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deflateStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeflateStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deflateStrategy")(js.undefined)
        ret
    }
  }
  
}

