package typingsSlinky.activexPowerpoint.global.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import typingsSlinky.activexPowerpoint.PowerPoint.PpSlideShowAdvanceMode
import typingsSlinky.activexPowerpoint.PowerPoint.PpSlideShowRangeType
import typingsSlinky.activexPowerpoint.PowerPoint.PpSlideShowType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.SlideShowSettings")
@js.native
class SlideShowSettings protected ()
  extends typingsSlinky.activexPowerpoint.PowerPoint.SlideShowSettings {
  /* CompleteClass */
  override var AdvanceMode: PpSlideShowAdvanceMode = js.native
  /* CompleteClass */
  override val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override var EndingSlide: Double = js.native
  /* CompleteClass */
  override var LoopUntilStopped: MsoTriState = js.native
  /* CompleteClass */
  override val NamedSlideShows: typingsSlinky.activexPowerpoint.PowerPoint.NamedSlideShows = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val PointerColor: typingsSlinky.activexPowerpoint.PowerPoint.ColorFormat = js.native
  /* CompleteClass */
  @JSName("PowerPoint.SlideShowSettings_typekey")
  override var PowerPointDotSlideShowSettings_typekey: typingsSlinky.activexPowerpoint.PowerPoint.SlideShowSettings = js.native
  /* CompleteClass */
  override var RangeType: PpSlideShowRangeType = js.native
  /* CompleteClass */
  override var ShowMediaControls: MsoTriState = js.native
  /* CompleteClass */
  override var ShowPresenterView: MsoTriState = js.native
  /* CompleteClass */
  override var ShowScrollbar: MsoTriState = js.native
  /* CompleteClass */
  override var ShowType: PpSlideShowType = js.native
  /* CompleteClass */
  override var ShowWithAnimation: MsoTriState = js.native
  /* CompleteClass */
  override var ShowWithNarration: MsoTriState = js.native
  /* CompleteClass */
  override var SlideShowName: String = js.native
  /* CompleteClass */
  override var StartingSlide: Double = js.native
  /* CompleteClass */
  override def Run(): typingsSlinky.activexPowerpoint.PowerPoint.SlideShowWindow = js.native
}

