package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomLabel extends StObject {
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val DotMatrix: Boolean = js.native
  
  var Height: Double = js.native
  
  var HorizontalPitch: Double = js.native
  
  val Index: Double = js.native
  
  var Name: String = js.native
  
  var NumberAcross: Double = js.native
  
  var NumberDown: Double = js.native
  
  var PageSize: WdCustomLabelPageSize = js.native
  
  val Parent: js.Any = js.native
  
  var SideMargin: Double = js.native
  
  var TopMargin: Double = js.native
  
  val Valid: Boolean = js.native
  
  var VerticalPitch: Double = js.native
  
  var Width: Double = js.native
  
  @JSName("Word.CustomLabel_typekey")
  var WordDotCustomLabel_typekey: CustomLabel = js.native
}
object CustomLabel {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    DotMatrix: Boolean,
    Height: Double,
    HorizontalPitch: Double,
    Index: Double,
    Name: String,
    NumberAcross: Double,
    NumberDown: Double,
    PageSize: WdCustomLabelPageSize,
    Parent: js.Any,
    SideMargin: Double,
    TopMargin: Double,
    Valid: Boolean,
    VerticalPitch: Double,
    Width: Double,
    WordDotCustomLabel_typekey: CustomLabel
  ): CustomLabel = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DotMatrix = DotMatrix.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HorizontalPitch = HorizontalPitch.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberAcross = NumberAcross.asInstanceOf[js.Any], NumberDown = NumberDown.asInstanceOf[js.Any], PageSize = PageSize.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SideMargin = SideMargin.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any], Valid = Valid.asInstanceOf[js.Any], VerticalPitch = VerticalPitch.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CustomLabel_typekey")(WordDotCustomLabel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLabel]
  }
  
  @scala.inline
  implicit class CustomLabelMutableBuilder[Self <: CustomLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDotMatrix(value: Boolean): Self = StObject.set(x, "DotMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalPitch(value: Double): Self = StObject.set(x, "HorizontalPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberAcross(value: Double): Self = StObject.set(x, "NumberAcross", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberDown(value: Double): Self = StObject.set(x, "NumberDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSize(value: WdCustomLabelPageSize): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideMargin(value: Double): Self = StObject.set(x, "SideMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopMargin(value: Double): Self = StObject.set(x, "TopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid(value: Boolean): Self = StObject.set(x, "Valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalPitch(value: Double): Self = StObject.set(x, "VerticalPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotCustomLabel_typekey(value: CustomLabel): Self = StObject.set(x, "Word.CustomLabel_typekey", value.asInstanceOf[js.Any])
  }
}
