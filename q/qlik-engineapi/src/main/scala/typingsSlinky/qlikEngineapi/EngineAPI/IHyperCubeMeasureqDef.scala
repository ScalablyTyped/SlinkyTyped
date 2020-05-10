package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HyperCubeMeasureqDef with extend of NxInlineMeasureDef
  */
@js.native
trait IHyperCubeMeasureqDef extends INxInlineMeasureDef {
  var autoSort: js.UndefOr[Boolean] = js.native
  var cId: js.UndefOr[String] = js.native
  var numFormatFromTemplate: js.UndefOr[Boolean] = js.native
}

object IHyperCubeMeasureqDef {
  @scala.inline
  def apply(qDef: String): IHyperCubeMeasureqDef = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHyperCubeMeasureqDef]
  }
  @scala.inline
  implicit class IHyperCubeMeasureqDefOps[Self <: IHyperCubeMeasureqDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSort")(js.undefined)
        ret
    }
    @scala.inline
    def withCId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cId")(js.undefined)
        ret
    }
    @scala.inline
    def withNumFormatFromTemplate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFormatFromTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumFormatFromTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFormatFromTemplate")(js.undefined)
        ret
    }
  }
  
}

