package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Border extends StObject {
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  var ArtStyle: WdPageBorderArt = js.native
  
  var ArtWidth: Double = js.native
  
  var Color: WdColor = js.native
  
  var ColorIndex: WdColorIndex = js.native
  
  val Creator: Double = js.native
  
  val Inside: Boolean = js.native
  
  var LineStyle: WdLineStyle = js.native
  
  var LineWidth: WdLineWidth = js.native
  
  val Parent: js.Any = js.native
  
  var Visible: Boolean = js.native
  
  @JSName("Word.Border_typekey")
  var WordDotBorder_typekey: Border = js.native
}
object Border {
  
  @scala.inline
  def apply(
    Application: Application,
    ArtStyle: WdPageBorderArt,
    ArtWidth: Double,
    Color: WdColor,
    ColorIndex: WdColorIndex,
    Creator: Double,
    Inside: Boolean,
    LineStyle: WdLineStyle,
    LineWidth: WdLineWidth,
    Parent: js.Any,
    Visible: Boolean,
    WordDotBorder_typekey: Border
  ): Border = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ArtStyle = ArtStyle.asInstanceOf[js.Any], ArtWidth = ArtWidth.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Inside = Inside.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], LineWidth = LineWidth.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Border_typekey")(WordDotBorder_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
  
  @scala.inline
  implicit class BorderMutableBuilder[Self <: Border] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtStyle(value: WdPageBorderArt): Self = StObject.set(x, "ArtStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtWidth(value: Double): Self = StObject.set(x, "ArtWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: WdColor): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIndex(value: WdColorIndex): Self = StObject.set(x, "ColorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInside(value: Boolean): Self = StObject.set(x, "Inside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyle(value: WdLineStyle): Self = StObject.set(x, "LineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidth(value: WdLineWidth): Self = StObject.set(x, "LineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotBorder_typekey(value: Border): Self = StObject.set(x, "Word.Border_typekey", value.asInstanceOf[js.Any])
  }
}
