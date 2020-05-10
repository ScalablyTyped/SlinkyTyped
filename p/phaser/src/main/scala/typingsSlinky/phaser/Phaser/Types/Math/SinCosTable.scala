package typingsSlinky.phaser.Phaser.Types.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinCosTable extends js.Object {
  /**
    * The cosine value.
    */
  var cos: Double = js.native
  /**
    * The length.
    */
  var length: Double = js.native
  /**
    * The sine value.
    */
  var sin: Double = js.native
}

object SinCosTable {
  @scala.inline
  def apply(cos: Double, length: Double, sin: Double): SinCosTable = {
    val __obj = js.Dynamic.literal(cos = cos.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], sin = sin.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinCosTable]
  }
  @scala.inline
  implicit class SinCosTableOps[Self <: SinCosTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

