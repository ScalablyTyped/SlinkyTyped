package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderFooter extends StObject {
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  var Exists: Boolean = js.native
  
  val Index: WdHeaderFooterIndex = js.native
  
  val IsHeader: Boolean = js.native
  
  var LinkToPrevious: Boolean = js.native
  
  val PageNumbers: typingsSlinky.activexWord.Word.PageNumbers = js.native
  
  val Parent: js.Any = js.native
  
  val Range: typingsSlinky.activexWord.Word.Range = js.native
  
  val Shapes: typingsSlinky.activexWord.Word.Shapes = js.native
  
  @JSName("Word.HeaderFooter_typekey")
  var WordDotHeaderFooter_typekey: HeaderFooter = js.native
}
object HeaderFooter {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Exists: Boolean,
    Index: WdHeaderFooterIndex,
    IsHeader: Boolean,
    LinkToPrevious: Boolean,
    PageNumbers: PageNumbers,
    Parent: js.Any,
    Range: Range,
    Shapes: Shapes,
    WordDotHeaderFooter_typekey: HeaderFooter
  ): HeaderFooter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Exists = Exists.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], IsHeader = IsHeader.asInstanceOf[js.Any], LinkToPrevious = LinkToPrevious.asInstanceOf[js.Any], PageNumbers = PageNumbers.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Shapes = Shapes.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.HeaderFooter_typekey")(WordDotHeaderFooter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderFooter]
  }
  
  @scala.inline
  implicit class HeaderFooterMutableBuilder[Self <: HeaderFooter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExists(value: Boolean): Self = StObject.set(x, "Exists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: WdHeaderFooterIndex): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHeader(value: Boolean): Self = StObject.set(x, "IsHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkToPrevious(value: Boolean): Self = StObject.set(x, "LinkToPrevious", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumbers(value: PageNumbers): Self = StObject.set(x, "PageNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapes(value: Shapes): Self = StObject.set(x, "Shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotHeaderFooter_typekey(value: HeaderFooter): Self = StObject.set(x, "Word.HeaderFooter_typekey", value.asInstanceOf[js.Any])
  }
}
