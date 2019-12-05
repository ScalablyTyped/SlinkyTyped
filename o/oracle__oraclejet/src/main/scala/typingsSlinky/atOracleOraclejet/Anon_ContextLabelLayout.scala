package typingsSlinky.atOracleOraclejet

import typingsSlinky.atOracleOraclejet.ojdiagramDashUtilsMod.LabelLayout
import typingsSlinky.atOracleOraclejet.ojdiagramMod.DvtDiagramLayoutContext
import typingsSlinky.atOracleOraclejet.ojdiagramMod.DvtDiagramLayoutContextNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextLabelLayout extends js.Object {
  var labelLayout: LabelLayout | (js.Function2[
    /* context */ DvtDiagramLayoutContext, 
    /* node */ DvtDiagramLayoutContextNode, 
    LabelLayout
  ])
}

object Anon_ContextLabelLayout {
  @scala.inline
  def apply(
    labelLayout: LabelLayout | (js.Function2[
      /* context */ DvtDiagramLayoutContext, 
      /* node */ DvtDiagramLayoutContextNode, 
      LabelLayout
    ])
  ): Anon_ContextLabelLayout = {
    val __obj = js.Dynamic.literal(labelLayout = labelLayout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ContextLabelLayout]
  }
}

