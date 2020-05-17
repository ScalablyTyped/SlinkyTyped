package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathEqArray extends js.Object {
  var Align: WdOMathVertAlignType = js.native
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val E: OMathArgs = js.native
  var MaxDist: Boolean = js.native
  var ObjDist: Boolean = js.native
  val Parent: js.Any = js.native
  var RowSpacing: Double = js.native
  var RowSpacingRule: WdOMathSpacingRule = js.native
  @JSName("Word.OMathEqArray_typekey")
  var WordDotOMathEqArray_typekey: OMathEqArray = js.native
}

object OMathEqArray {
  @scala.inline
  def apply(
    Align: WdOMathVertAlignType,
    Application: Application,
    Creator: Double,
    E: OMathArgs,
    MaxDist: Boolean,
    ObjDist: Boolean,
    Parent: js.Any,
    RowSpacing: Double,
    RowSpacingRule: WdOMathSpacingRule,
    WordDotOMathEqArray_typekey: OMathEqArray
  ): OMathEqArray = {
    val __obj = js.Dynamic.literal(Align = Align.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], MaxDist = MaxDist.asInstanceOf[js.Any], ObjDist = ObjDist.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RowSpacing = RowSpacing.asInstanceOf[js.Any], RowSpacingRule = RowSpacingRule.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathEqArray_typekey")(WordDotOMathEqArray_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathEqArray]
  }
  @scala.inline
  implicit class OMathEqArrayOps[Self <: OMathEqArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: WdOMathVertAlignType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withE(value: OMathArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("E")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxDist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjDist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjDist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowSpacingRule(value: WdOMathSpacingRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowSpacingRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotOMathEqArray_typekey(value: OMathEqArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.OMathEqArray_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

