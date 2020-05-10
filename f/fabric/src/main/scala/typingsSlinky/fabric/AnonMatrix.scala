package typingsSlinky.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMatrix extends js.Object {
  /** Filter matrix */
  var matrix: js.UndefOr[js.Array[Double]] = js.native
}

object AnonMatrix {
  @scala.inline
  def apply(): AnonMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMatrix]
  }
  @scala.inline
  implicit class AnonMatrixOps[Self <: AnonMatrix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatrix(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatrix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrix")(js.undefined)
        ret
    }
  }
  
}

