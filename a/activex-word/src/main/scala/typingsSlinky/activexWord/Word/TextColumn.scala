package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextColumn extends StObject {
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val Parent: js.Any = js.native
  
  var SpaceAfter: Double = js.native
  
  var Width: Double = js.native
  
  @JSName("Word.TextColumn_typekey")
  var WordDotTextColumn_typekey: TextColumn = js.native
}
object TextColumn {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Parent: js.Any,
    SpaceAfter: Double,
    Width: Double,
    WordDotTextColumn_typekey: TextColumn
  ): TextColumn = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SpaceAfter = SpaceAfter.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TextColumn_typekey")(WordDotTextColumn_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextColumn]
  }
  
  @scala.inline
  implicit class TextColumnMutableBuilder[Self <: TextColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfter(value: Double): Self = StObject.set(x, "SpaceAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotTextColumn_typekey(value: TextColumn): Self = StObject.set(x, "Word.TextColumn_typekey", value.asInstanceOf[js.Any])
  }
}
