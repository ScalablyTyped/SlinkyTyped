package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpBars extends StObject {
  
  val Application: js.Any = js.native
  
  val Border: ChartBorder = js.native
  
  val Creator: Double = js.native
  
  def Delete(): js.Any = js.native
  
  val Fill: ChartFillFormat = js.native
  
  val Format: ChartFormat = js.native
  
  val Interior: typingsSlinky.activexWord.Word.Interior = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  def Select(): js.Any = js.native
  
  @JSName("Word.UpBars_typekey")
  var WordDotUpBars_typekey: UpBars = js.native
}
object UpBars {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Border: ChartBorder,
    Creator: Double,
    Delete: () => js.Any,
    Fill: ChartFillFormat,
    Format: ChartFormat,
    Interior: Interior,
    Name: String,
    Parent: js.Any,
    Select: () => js.Any,
    WordDotUpBars_typekey: UpBars
  ): UpBars = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Word.UpBars_typekey")(WordDotUpBars_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpBars]
  }
  
  @scala.inline
  implicit class UpBarsMutableBuilder[Self <: UpBars] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: ChartBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => js.Any): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFill(value: ChartFillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterior(value: Interior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWordDotUpBars_typekey(value: UpBars): Self = StObject.set(x, "Word.UpBars_typekey", value.asInstanceOf[js.Any])
  }
}
