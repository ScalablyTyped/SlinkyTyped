package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContext
import typingsSlinky.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContextNode
import typingsSlinky.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon4 extends js.Object {
  var labelLayout: LabelLayout | (js.Function2[
    /* context */ DvtDiagramLayoutContext, 
    /* node */ DvtDiagramLayoutContextNode, 
    LabelLayout
  ]) = js.native
}

object Anon4 {
  @scala.inline
  def apply(
    labelLayout: LabelLayout | (js.Function2[
      /* context */ DvtDiagramLayoutContext, 
      /* node */ DvtDiagramLayoutContextNode, 
      LabelLayout
    ])
  ): Anon4 = {
    val __obj = js.Dynamic.literal(labelLayout = labelLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon4]
  }
  @scala.inline
  implicit class Anon4Ops[Self <: Anon4] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelLayoutFunction2(
      value: (/* context */ DvtDiagramLayoutContext, /* node */ DvtDiagramLayoutContextNode) => LabelLayout
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLayout")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLabelLayout(
      value: LabelLayout | (js.Function2[
          /* context */ DvtDiagramLayoutContext, 
          /* node */ DvtDiagramLayoutContextNode, 
          LabelLayout
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLayout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

