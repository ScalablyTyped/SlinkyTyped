package typingsSlinky.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxAttrExprInfo extends js.Object {
  var qContinuousAxes: Boolean = js.native
  var qFallbackTitle: String = js.native
  var qIsCyclic: Boolean = js.native
  var qMax: Double = js.native
  var qMin: Double = js.native
}

object NxAttrExprInfo {
  @scala.inline
  def apply(qContinuousAxes: Boolean, qFallbackTitle: String, qIsCyclic: Boolean, qMax: Double, qMin: Double): NxAttrExprInfo = {
    val __obj = js.Dynamic.literal(qContinuousAxes = qContinuousAxes.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qIsCyclic = qIsCyclic.asInstanceOf[js.Any], qMax = qMax.asInstanceOf[js.Any], qMin = qMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxAttrExprInfo]
  }
  @scala.inline
  implicit class NxAttrExprInfoOps[Self <: NxAttrExprInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQContinuousAxes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qContinuousAxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQFallbackTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFallbackTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQIsCyclic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsCyclic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

