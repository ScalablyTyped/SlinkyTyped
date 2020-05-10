package typingsSlinky.qlikVisualizationextensions.BackendAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INxAttrExprInfo extends js.Object {
  /**
    * Is continuous axis used.
    */
  var qContinuousAxes: Boolean = js.native
  /**
    * Corresponds to the label of the dimension that is selected.
    */
  var qFallbackTitle: String = js.native
  /**
    * Is a cyclic dimension used.
    */
  var qIsCyclic: Boolean = js.native
  /**
    * Maximum value.
    */
  var qMax: Double = js.native
  /**
    * Minimum value.
    */
  var qMin: Double = js.native
}

object INxAttrExprInfo {
  @scala.inline
  def apply(qContinuousAxes: Boolean, qFallbackTitle: String, qIsCyclic: Boolean, qMax: Double, qMin: Double): INxAttrExprInfo = {
    val __obj = js.Dynamic.literal(qContinuousAxes = qContinuousAxes.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qIsCyclic = qIsCyclic.asInstanceOf[js.Any], qMax = qMax.asInstanceOf[js.Any], qMin = qMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAttrExprInfo]
  }
  @scala.inline
  implicit class INxAttrExprInfoOps[Self <: INxAttrExprInfo] (val x: Self) extends AnyVal {
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

