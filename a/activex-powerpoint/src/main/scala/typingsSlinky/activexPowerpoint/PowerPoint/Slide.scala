package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoBackgroundStyleIndex
import typingsSlinky.activexOffice.Office.MsoThemeColorSchemeIndex
import typingsSlinky.activexOffice.Office.MsoTriState
import typingsSlinky.activexOffice.Office.Script
import typingsSlinky.activexOffice.Office.Scripts
import typingsSlinky.activexOffice.Office.ThemeColor
import typingsSlinky.activexOffice.Office.ThemeColorScheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slide extends StObject {
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  def ApplyTemplate(FileName: String): Unit = js.native
  
  def ApplyTheme(themeName: String): Unit = js.native
  
  def ApplyThemeColorScheme(themeColorSchemeName: String): Unit = js.native
  
  val Background: ShapeRange = js.native
  
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  
  var ColorScheme: typingsSlinky.activexPowerpoint.PowerPoint.ColorScheme = js.native
  
  val Comments: typingsSlinky.activexPowerpoint.PowerPoint.Comments = js.native
  
  def Copy(): Unit = js.native
  
  var CustomLayout: typingsSlinky.activexPowerpoint.PowerPoint.CustomLayout = js.native
  
  val CustomerData: typingsSlinky.activexPowerpoint.PowerPoint.CustomerData = js.native
  
  def Cut(): Unit = js.native
  
  def Delete(): Unit = js.native
  
  var Design: typingsSlinky.activexPowerpoint.PowerPoint.Design = js.native
  
  var DisplayMasterShapes: MsoTriState = js.native
  
  def Duplicate(): SlideRange = js.native
  
  /**
    * @param number [ScaleWidth=0]
    * @param number [ScaleHeight=0]
    */
  def Export(FileName: String, FilterName: String): Unit = js.native
  def Export(FileName: String, FilterName: String, ScaleWidth: js.UndefOr[scala.Nothing], ScaleHeight: Double): Unit = js.native
  def Export(FileName: String, FilterName: String, ScaleWidth: Double): Unit = js.native
  def Export(FileName: String, FilterName: String, ScaleWidth: Double, ScaleHeight: Double): Unit = js.native
  
  var FollowMasterBackground: MsoTriState = js.native
  
  val HasNotesPage: MsoTriState = js.native
  
  val HeadersFooters: typingsSlinky.activexPowerpoint.PowerPoint.HeadersFooters = js.native
  
  val Hyperlinks: typingsSlinky.activexPowerpoint.PowerPoint.Hyperlinks = js.native
  
  var Layout: PpSlideLayout = js.native
  
  val Master: typingsSlinky.activexPowerpoint.PowerPoint.Master = js.native
  
  def MoveTo(toPos: Double): Unit = js.native
  
  def MoveToSectionStart(toSection: Double): Unit = js.native
  
  var Name: String = js.native
  
  val NotesPage: SlideRange = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.Slide_typekey")
  var PowerPointDotSlide_typekey: Slide = js.native
  
  val PrintSteps: Double = js.native
  
  /**
    * @param boolean [Overwrite=false]
    * @param boolean [UseSlideOrder=false]
    */
  def PublishSlides(SlideLibraryUrl: String): Unit = js.native
  def PublishSlides(SlideLibraryUrl: String, Overwrite: js.UndefOr[scala.Nothing], UseSlideOrder: Boolean): Unit = js.native
  def PublishSlides(SlideLibraryUrl: String, Overwrite: Boolean): Unit = js.native
  def PublishSlides(SlideLibraryUrl: String, Overwrite: Boolean, UseSlideOrder: Boolean): Unit = js.native
  
  def Scripts(Index: js.Any): Script = js.native
  @JSName("Scripts")
  val Scripts_Original: Scripts = js.native
  
  val SectionNumber: Double = js.native
  
  def Select(): Unit = js.native
  
  val Shapes: typingsSlinky.activexPowerpoint.PowerPoint.Shapes = js.native
  
  val SlideID: Double = js.native
  
  val SlideIndex: Double = js.native
  
  val SlideNumber: Double = js.native
  
  val SlideShowTransition: typingsSlinky.activexPowerpoint.PowerPoint.SlideShowTransition = js.native
  
  val Tags: typingsSlinky.activexPowerpoint.PowerPoint.Tags = js.native
  
  def ThemeColorScheme(Index: MsoThemeColorSchemeIndex): ThemeColor = js.native
  @JSName("ThemeColorScheme")
  val ThemeColorScheme_Original: ThemeColorScheme = js.native
  
  val TimeLine: typingsSlinky.activexPowerpoint.PowerPoint.TimeLine = js.native
  
  val sectionIndex: Double = js.native
}
