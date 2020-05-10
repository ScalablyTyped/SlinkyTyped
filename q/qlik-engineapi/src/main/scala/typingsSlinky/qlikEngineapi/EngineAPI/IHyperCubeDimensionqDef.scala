package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HyperCubeDimensionqDef width extend NxInlineDimensionDef
  */
@js.native
trait IHyperCubeDimensionqDef extends INxInlineDimensionDef {
  var autoSort: js.UndefOr[Boolean] = js.native
  var cId: js.UndefOr[String] = js.native
  var othersLabel: js.UndefOr[IStringExpressionContainer] = js.native
}

object IHyperCubeDimensionqDef {
  @scala.inline
  def apply(): IHyperCubeDimensionqDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHyperCubeDimensionqDef]
  }
  @scala.inline
  implicit class IHyperCubeDimensionqDefOps[Self <: IHyperCubeDimensionqDef] (val x: Self) extends AnyVal {
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
    def withOthersLabel(value: IStringExpressionContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("othersLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOthersLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("othersLabel")(js.undefined)
        ret
    }
  }
  
}

