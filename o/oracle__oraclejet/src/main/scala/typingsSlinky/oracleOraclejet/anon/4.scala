package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContext
import typingsSlinky.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContextNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `4` extends StObject {
  
  var labelLayout: typingsSlinky.oracleOraclejet.ojdiagramUtilsMod.LabelLayout | (js.Function2[
    /* context */ DvtDiagramLayoutContext, 
    /* node */ DvtDiagramLayoutContextNode, 
    typingsSlinky.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
  ]) = js.native
}
object `4` {
  
  @scala.inline
  def apply(
    labelLayout: typingsSlinky.oracleOraclejet.ojdiagramUtilsMod.LabelLayout | (js.Function2[
      /* context */ DvtDiagramLayoutContext, 
      /* node */ DvtDiagramLayoutContextNode, 
      typingsSlinky.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
    ])
  ): `4` = {
    val __obj = js.Dynamic.literal(labelLayout = labelLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit class `4MutableBuilder`[Self <: `4`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelLayout(
      value: typingsSlinky.oracleOraclejet.ojdiagramUtilsMod.LabelLayout | (js.Function2[
          /* context */ DvtDiagramLayoutContext, 
          /* node */ DvtDiagramLayoutContextNode, 
          typingsSlinky.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
        ])
    ): Self = StObject.set(x, "labelLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelLayoutFunction2(
      value: (/* context */ DvtDiagramLayoutContext, /* node */ DvtDiagramLayoutContextNode) => typingsSlinky.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
    ): Self = StObject.set(x, "labelLayout", js.Any.fromFunction2(value))
  }
}
