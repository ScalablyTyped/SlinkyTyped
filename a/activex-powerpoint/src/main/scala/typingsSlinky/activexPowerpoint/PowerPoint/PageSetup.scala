package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoOrientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageSetup extends StObject {
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  var FirstSlideNumber: Double = js.native
  
  var NotesOrientation: MsoOrientation = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.PageSetup_typekey")
  var PowerPointDotPageSetup_typekey: PageSetup = js.native
  
  var SlideHeight: Double = js.native
  
  var SlideOrientation: MsoOrientation = js.native
  
  var SlideSize: PpSlideSizeType = js.native
  
  var SlideWidth: Double = js.native
}
object PageSetup {
  
  @scala.inline
  def apply(
    Application: Application,
    FirstSlideNumber: Double,
    NotesOrientation: MsoOrientation,
    Parent: js.Any,
    PowerPointDotPageSetup_typekey: PageSetup,
    SlideHeight: Double,
    SlideOrientation: MsoOrientation,
    SlideSize: PpSlideSizeType,
    SlideWidth: Double
  ): PageSetup = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], FirstSlideNumber = FirstSlideNumber.asInstanceOf[js.Any], NotesOrientation = NotesOrientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SlideHeight = SlideHeight.asInstanceOf[js.Any], SlideOrientation = SlideOrientation.asInstanceOf[js.Any], SlideSize = SlideSize.asInstanceOf[js.Any], SlideWidth = SlideWidth.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PageSetup_typekey")(PowerPointDotPageSetup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSetup]
  }
  
  @scala.inline
  implicit class PageSetupMutableBuilder[Self <: PageSetup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstSlideNumber(value: Double): Self = StObject.set(x, "FirstSlideNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesOrientation(value: MsoOrientation): Self = StObject.set(x, "NotesOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotPageSetup_typekey(value: PageSetup): Self = StObject.set(x, "PowerPoint.PageSetup_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideHeight(value: Double): Self = StObject.set(x, "SlideHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideOrientation(value: MsoOrientation): Self = StObject.set(x, "SlideOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideSize(value: PpSlideSizeType): Self = StObject.set(x, "SlideSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideWidth(value: Double): Self = StObject.set(x, "SlideWidth", value.asInstanceOf[js.Any])
  }
}
