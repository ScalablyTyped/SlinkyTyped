package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait View extends js.Object {
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  var DisplaySlideMiniature: MsoTriState = js.native
  
  def GotoSlide(Index: Double): Unit = js.native
  
  val MediaControlsHeight: Double = js.native
  
  val MediaControlsLeft: Double = js.native
  
  val MediaControlsTop: Double = js.native
  
  val MediaControlsVisible: MsoTriState = js.native
  
  val MediaControlsWidth: Double = js.native
  
  val Parent: js.Any = js.native
  
  def Paste(): Unit = js.native
  
  /**
    * @param PowerPoint.PpPasteDataType [DataType=0]
    * @param Office.MsoTriState [DisplayAsIcon=0]
    * @param string [IconFileName='']
    * @param number [IconIndex=0]
    * @param string [IconLabel='']
    * @param Office.MsoTriState [Link=0]
    */
  def PasteSpecial(
    DataType: js.UndefOr[PpPasteDataType],
    DisplayAsIcon: js.UndefOr[MsoTriState],
    IconFileName: js.UndefOr[String],
    IconIndex: js.UndefOr[Double],
    IconLabel: js.UndefOr[String],
    Link: js.UndefOr[MsoTriState]
  ): Unit = js.native
  
  def Player(ShapeId: js.Any): typingsSlinky.activexPowerpoint.PowerPoint.Player = js.native
  
  @JSName("PowerPoint.View_typekey")
  var PowerPointDotView_typekey: View = js.native
  
  val PrintOptions: typingsSlinky.activexPowerpoint.PowerPoint.PrintOptions = js.native
  
  /**
    * @param number [From=-1]
    * @param number [To=-1]
    * @param string [PrintToFile='']
    * @param number [Copies=0]
    * @param Office.MsoTriState [Collate=-99]
    */
  def PrintOut(): Unit = js.native
  def PrintOut(
    From: js.UndefOr[scala.Nothing],
    To: js.UndefOr[scala.Nothing],
    PrintToFile: js.UndefOr[scala.Nothing],
    Copies: js.UndefOr[scala.Nothing],
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(
    From: js.UndefOr[scala.Nothing],
    To: js.UndefOr[scala.Nothing],
    PrintToFile: js.UndefOr[scala.Nothing],
    Copies: Double
  ): Unit = js.native
  def PrintOut(
    From: js.UndefOr[scala.Nothing],
    To: js.UndefOr[scala.Nothing],
    PrintToFile: js.UndefOr[scala.Nothing],
    Copies: Double,
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(From: js.UndefOr[scala.Nothing], To: js.UndefOr[scala.Nothing], PrintToFile: String): Unit = js.native
  def PrintOut(
    From: js.UndefOr[scala.Nothing],
    To: js.UndefOr[scala.Nothing],
    PrintToFile: String,
    Copies: js.UndefOr[scala.Nothing],
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(
    From: js.UndefOr[scala.Nothing],
    To: js.UndefOr[scala.Nothing],
    PrintToFile: String,
    Copies: Double
  ): Unit = js.native
  def PrintOut(
    From: js.UndefOr[scala.Nothing],
    To: js.UndefOr[scala.Nothing],
    PrintToFile: String,
    Copies: Double,
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(From: js.UndefOr[scala.Nothing], To: Double): Unit = js.native
  def PrintOut(
    From: js.UndefOr[scala.Nothing],
    To: Double,
    PrintToFile: js.UndefOr[scala.Nothing],
    Copies: js.UndefOr[scala.Nothing],
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(
    From: js.UndefOr[scala.Nothing],
    To: Double,
    PrintToFile: js.UndefOr[scala.Nothing],
    Copies: Double
  ): Unit = js.native
  def PrintOut(
    From: js.UndefOr[scala.Nothing],
    To: Double,
    PrintToFile: js.UndefOr[scala.Nothing],
    Copies: Double,
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(From: js.UndefOr[scala.Nothing], To: Double, PrintToFile: String): Unit = js.native
  def PrintOut(
    From: js.UndefOr[scala.Nothing],
    To: Double,
    PrintToFile: String,
    Copies: js.UndefOr[scala.Nothing],
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(From: js.UndefOr[scala.Nothing], To: Double, PrintToFile: String, Copies: Double): Unit = js.native
  def PrintOut(
    From: js.UndefOr[scala.Nothing],
    To: Double,
    PrintToFile: String,
    Copies: Double,
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(From: Double): Unit = js.native
  def PrintOut(
    From: Double,
    To: js.UndefOr[scala.Nothing],
    PrintToFile: js.UndefOr[scala.Nothing],
    Copies: js.UndefOr[scala.Nothing],
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(
    From: Double,
    To: js.UndefOr[scala.Nothing],
    PrintToFile: js.UndefOr[scala.Nothing],
    Copies: Double
  ): Unit = js.native
  def PrintOut(
    From: Double,
    To: js.UndefOr[scala.Nothing],
    PrintToFile: js.UndefOr[scala.Nothing],
    Copies: Double,
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(From: Double, To: js.UndefOr[scala.Nothing], PrintToFile: String): Unit = js.native
  def PrintOut(
    From: Double,
    To: js.UndefOr[scala.Nothing],
    PrintToFile: String,
    Copies: js.UndefOr[scala.Nothing],
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(From: Double, To: js.UndefOr[scala.Nothing], PrintToFile: String, Copies: Double): Unit = js.native
  def PrintOut(
    From: Double,
    To: js.UndefOr[scala.Nothing],
    PrintToFile: String,
    Copies: Double,
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(From: Double, To: Double): Unit = js.native
  def PrintOut(
    From: Double,
    To: Double,
    PrintToFile: js.UndefOr[scala.Nothing],
    Copies: js.UndefOr[scala.Nothing],
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(From: Double, To: Double, PrintToFile: js.UndefOr[scala.Nothing], Copies: Double): Unit = js.native
  def PrintOut(
    From: Double,
    To: Double,
    PrintToFile: js.UndefOr[scala.Nothing],
    Copies: Double,
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(From: Double, To: Double, PrintToFile: String): Unit = js.native
  def PrintOut(
    From: Double,
    To: Double,
    PrintToFile: String,
    Copies: js.UndefOr[scala.Nothing],
    Collate: MsoTriState
  ): Unit = js.native
  def PrintOut(From: Double, To: Double, PrintToFile: String, Copies: Double): Unit = js.native
  def PrintOut(From: Double, To: Double, PrintToFile: String, Copies: Double, Collate: MsoTriState): Unit = js.native
  
  var Slide: js.Any = js.native
  
  val Type: PpViewType = js.native
  
  var Zoom: Double = js.native
  
  var ZoomToFit: MsoTriState = js.native
}
