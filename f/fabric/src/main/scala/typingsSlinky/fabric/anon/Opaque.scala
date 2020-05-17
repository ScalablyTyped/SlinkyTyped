package typingsSlinky.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Opaque extends js.Object {
  /** Filter matrix */
  var matrix: js.UndefOr[js.Array[Double]] = js.native
  var opaque: js.UndefOr[Boolean] = js.native
}

object Opaque {
  @scala.inline
  def apply(): Opaque = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Opaque]
  }
  @scala.inline
  implicit class OpaqueOps[Self <: Opaque] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withOpaque(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opaque")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpaque: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opaque")(js.undefined)
        ret
    }
  }
  
}

