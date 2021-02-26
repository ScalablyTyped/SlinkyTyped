package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMathMat extends StObject {
  
  var Align: WdOMathVertAlignType = js.native
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  def Cell(Row: Double, Col: Double): OMath = js.native
  
  var ColGap: Double = js.native
  
  var ColGapRule: WdOMathSpacingRule = js.native
  
  var ColSpacing: Double = js.native
  
  val Cols: OMathMatCols = js.native
  
  val Creator: Double = js.native
  
  val Parent: js.Any = js.native
  
  var PlcHoldHidden: Boolean = js.native
  
  var RowSpacing: Double = js.native
  
  var RowSpacingRule: WdOMathSpacingRule = js.native
  
  val Rows: OMathMatRows = js.native
  
  @JSName("Word.OMathMat_typekey")
  var WordDotOMathMat_typekey: OMathMat = js.native
}
object OMathMat {
  
  @scala.inline
  def apply(
    Align: WdOMathVertAlignType,
    Application: Application,
    Cell: (Double, Double) => OMath,
    ColGap: Double,
    ColGapRule: WdOMathSpacingRule,
    ColSpacing: Double,
    Cols: OMathMatCols,
    Creator: Double,
    Parent: js.Any,
    PlcHoldHidden: Boolean,
    RowSpacing: Double,
    RowSpacingRule: WdOMathSpacingRule,
    Rows: OMathMatRows,
    WordDotOMathMat_typekey: OMathMat
  ): OMathMat = {
    val __obj = js.Dynamic.literal(Align = Align.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Cell = js.Any.fromFunction2(Cell), ColGap = ColGap.asInstanceOf[js.Any], ColGapRule = ColGapRule.asInstanceOf[js.Any], ColSpacing = ColSpacing.asInstanceOf[js.Any], Cols = Cols.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PlcHoldHidden = PlcHoldHidden.asInstanceOf[js.Any], RowSpacing = RowSpacing.asInstanceOf[js.Any], RowSpacingRule = RowSpacingRule.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathMat_typekey")(WordDotOMathMat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathMat]
  }
  
  @scala.inline
  implicit class OMathMatMutableBuilder[Self <: OMathMat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: WdOMathVertAlignType): Self = StObject.set(x, "Align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCell(value: (Double, Double) => OMath): Self = StObject.set(x, "Cell", js.Any.fromFunction2(value))
    
    @scala.inline
    def setColGap(value: Double): Self = StObject.set(x, "ColGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColGapRule(value: WdOMathSpacingRule): Self = StObject.set(x, "ColGapRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColSpacing(value: Double): Self = StObject.set(x, "ColSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCols(value: OMathMatCols): Self = StObject.set(x, "Cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlcHoldHidden(value: Boolean): Self = StObject.set(x, "PlcHoldHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpacing(value: Double): Self = StObject.set(x, "RowSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpacingRule(value: WdOMathSpacingRule): Self = StObject.set(x, "RowSpacingRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: OMathMatRows): Self = StObject.set(x, "Rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathMat_typekey(value: OMathMat): Self = StObject.set(x, "Word.OMathMat_typekey", value.asInstanceOf[js.Any])
  }
}
