package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMath extends StObject {
  
  var AlignPoint: Double = js.native
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val ArgIndex: Double = js.native
  
  var ArgSize: Double = js.native
  
  val Breaks: OMathBreaks = js.native
  
  def BuildUp(): Unit = js.native
  
  def ConvertToLiteralText(): Unit = js.native
  
  def ConvertToMathText(): Unit = js.native
  
  def ConvertToNormalText(): Unit = js.native
  
  val Creator: Double = js.native
  
  val Functions: OMathFunctions = js.native
  
  var Justification: WdOMathJc = js.native
  
  def Linearize(): Unit = js.native
  
  val NestingLevel: Double = js.native
  
  val Parent: js.Any = js.native
  
  val ParentArg: OMath = js.native
  
  val ParentCol: OMathMatCol = js.native
  
  val ParentFunction: OMathFunction = js.native
  
  val ParentOMath: OMath = js.native
  
  val ParentRow: OMathMatRow = js.native
  
  val Range: typingsSlinky.activexWord.Word.Range = js.native
  
  def Remove(): Unit = js.native
  
  var Type: WdOMathType = js.native
  
  @JSName("Word.OMath_typekey")
  var WordDotOMath_typekey: OMath = js.native
}
object OMath {
  
  @scala.inline
  def apply(
    AlignPoint: Double,
    Application: Application,
    ArgIndex: Double,
    ArgSize: Double,
    Breaks: OMathBreaks,
    BuildUp: () => Unit,
    ConvertToLiteralText: () => Unit,
    ConvertToMathText: () => Unit,
    ConvertToNormalText: () => Unit,
    Creator: Double,
    Functions: OMathFunctions,
    Justification: WdOMathJc,
    Linearize: () => Unit,
    NestingLevel: Double,
    Parent: js.Any,
    ParentArg: OMath,
    ParentCol: OMathMatCol,
    ParentFunction: OMathFunction,
    ParentOMath: OMath,
    ParentRow: OMathMatRow,
    Range: Range,
    Remove: () => Unit,
    Type: WdOMathType,
    WordDotOMath_typekey: OMath
  ): OMath = {
    val __obj = js.Dynamic.literal(AlignPoint = AlignPoint.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], ArgIndex = ArgIndex.asInstanceOf[js.Any], ArgSize = ArgSize.asInstanceOf[js.Any], Breaks = Breaks.asInstanceOf[js.Any], BuildUp = js.Any.fromFunction0(BuildUp), ConvertToLiteralText = js.Any.fromFunction0(ConvertToLiteralText), ConvertToMathText = js.Any.fromFunction0(ConvertToMathText), ConvertToNormalText = js.Any.fromFunction0(ConvertToNormalText), Creator = Creator.asInstanceOf[js.Any], Functions = Functions.asInstanceOf[js.Any], Justification = Justification.asInstanceOf[js.Any], Linearize = js.Any.fromFunction0(Linearize), NestingLevel = NestingLevel.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ParentArg = ParentArg.asInstanceOf[js.Any], ParentCol = ParentCol.asInstanceOf[js.Any], ParentFunction = ParentFunction.asInstanceOf[js.Any], ParentOMath = ParentOMath.asInstanceOf[js.Any], ParentRow = ParentRow.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Remove = js.Any.fromFunction0(Remove), Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMath_typekey")(WordDotOMath_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMath]
  }
  
  @scala.inline
  implicit class OMathMutableBuilder[Self <: OMath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignPoint(value: Double): Self = StObject.set(x, "AlignPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgIndex(value: Double): Self = StObject.set(x, "ArgIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgSize(value: Double): Self = StObject.set(x, "ArgSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreaks(value: OMathBreaks): Self = StObject.set(x, "Breaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUp(value: () => Unit): Self = StObject.set(x, "BuildUp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConvertToLiteralText(value: () => Unit): Self = StObject.set(x, "ConvertToLiteralText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConvertToMathText(value: () => Unit): Self = StObject.set(x, "ConvertToMathText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConvertToNormalText(value: () => Unit): Self = StObject.set(x, "ConvertToNormalText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctions(value: OMathFunctions): Self = StObject.set(x, "Functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustification(value: WdOMathJc): Self = StObject.set(x, "Justification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearize(value: () => Unit): Self = StObject.set(x, "Linearize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNestingLevel(value: Double): Self = StObject.set(x, "NestingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentArg(value: OMath): Self = StObject.set(x, "ParentArg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentCol(value: OMathMatCol): Self = StObject.set(x, "ParentCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFunction(value: OMathFunction): Self = StObject.set(x, "ParentFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentOMath(value: OMath): Self = StObject.set(x, "ParentOMath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentRow(value: OMathMatRow): Self = StObject.set(x, "ParentRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: WdOMathType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMath_typekey(value: OMath): Self = StObject.set(x, "Word.OMath_typekey", value.asInstanceOf[js.Any])
  }
}
