package typingsSlinky.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxAttrDimInfo extends js.Object {
  var qCardinal: Double = js.native
  var qError: NxValidationError = js.native
  var qFallbackTitle: String = js.native
  var qLocked: Boolean = js.native
  var qSize: Size = js.native
}

object NxAttrDimInfo {
  @scala.inline
  def apply(
    qCardinal: Double,
    qError: NxValidationError,
    qFallbackTitle: String,
    qLocked: Boolean,
    qSize: Size
  ): NxAttrDimInfo = {
    val __obj = js.Dynamic.literal(qCardinal = qCardinal.asInstanceOf[js.Any], qError = qError.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qLocked = qLocked.asInstanceOf[js.Any], qSize = qSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxAttrDimInfo]
  }
  @scala.inline
  implicit class NxAttrDimInfoOps[Self <: NxAttrDimInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQCardinal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qCardinal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQError(value: NxValidationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQFallbackTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFallbackTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

