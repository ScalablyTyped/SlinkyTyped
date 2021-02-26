package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentWindow extends StObject {
  
  def Activate(): Unit = js.native
  
  val Active: MsoTriState = js.native
  
  val ActivePane: Pane = js.native
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  var BlackAndWhite: MsoTriState = js.native
  
  val Caption: String = js.native
  
  def Close(): Unit = js.native
  
  def ExpandSection(sectionIndex: Double, Expand: Boolean): Unit = js.native
  
  def FitToPage(): Unit = js.native
  
  var Height: Double = js.native
  
  def IsSectionExpanded(sectionIndex: Double): Boolean = js.native
  
  /**
    * @param number [Down=1]
    * @param number [Up=0]
    * @param number [ToRight=0]
    * @param number [ToLeft=0]
    */
  def LargeScroll(): Unit = js.native
  def LargeScroll(
    Down: js.UndefOr[scala.Nothing],
    Up: js.UndefOr[scala.Nothing],
    ToRight: js.UndefOr[scala.Nothing],
    ToLeft: Double
  ): Unit = js.native
  def LargeScroll(Down: js.UndefOr[scala.Nothing], Up: js.UndefOr[scala.Nothing], ToRight: Double): Unit = js.native
  def LargeScroll(Down: js.UndefOr[scala.Nothing], Up: js.UndefOr[scala.Nothing], ToRight: Double, ToLeft: Double): Unit = js.native
  def LargeScroll(Down: js.UndefOr[scala.Nothing], Up: Double): Unit = js.native
  def LargeScroll(Down: js.UndefOr[scala.Nothing], Up: Double, ToRight: js.UndefOr[scala.Nothing], ToLeft: Double): Unit = js.native
  def LargeScroll(Down: js.UndefOr[scala.Nothing], Up: Double, ToRight: Double): Unit = js.native
  def LargeScroll(Down: js.UndefOr[scala.Nothing], Up: Double, ToRight: Double, ToLeft: Double): Unit = js.native
  def LargeScroll(Down: Double): Unit = js.native
  def LargeScroll(Down: Double, Up: js.UndefOr[scala.Nothing], ToRight: js.UndefOr[scala.Nothing], ToLeft: Double): Unit = js.native
  def LargeScroll(Down: Double, Up: js.UndefOr[scala.Nothing], ToRight: Double): Unit = js.native
  def LargeScroll(Down: Double, Up: js.UndefOr[scala.Nothing], ToRight: Double, ToLeft: Double): Unit = js.native
  def LargeScroll(Down: Double, Up: Double): Unit = js.native
  def LargeScroll(Down: Double, Up: Double, ToRight: js.UndefOr[scala.Nothing], ToLeft: Double): Unit = js.native
  def LargeScroll(Down: Double, Up: Double, ToRight: Double): Unit = js.native
  def LargeScroll(Down: Double, Up: Double, ToRight: Double, ToLeft: Double): Unit = js.native
  
  var Left: Double = js.native
  
  def NewWindow(): DocumentWindow = js.native
  
  val Panes: typingsSlinky.activexPowerpoint.PowerPoint.Panes = js.native
  
  val Parent: js.Any = js.native
  
  def PointsToScreenPixelsX(Points: Double): Double = js.native
  
  def PointsToScreenPixelsY(Points: Double): Double = js.native
  
  @JSName("PowerPoint.DocumentWindow_typekey")
  var PowerPointDotDocumentWindow_typekey: DocumentWindow = js.native
  
  val Presentation: typingsSlinky.activexPowerpoint.PowerPoint.Presentation = js.native
  
  def RangeFromPoint(X: Double, Y: Double): js.Any = js.native
  
  /** @param Office.MsoTriState [Start=-1] */
  def ScrollIntoView(Left: Double, Top: Double, Width: Double, Height: Double): Unit = js.native
  def ScrollIntoView(Left: Double, Top: Double, Width: Double, Height: Double, Start: MsoTriState): Unit = js.native
  
  val Selection: typingsSlinky.activexPowerpoint.PowerPoint.Selection = js.native
  
  /**
    * @param number [Down=1]
    * @param number [Up=0]
    * @param number [ToRight=0]
    * @param number [ToLeft=0]
    */
  def SmallScroll(): Unit = js.native
  def SmallScroll(
    Down: js.UndefOr[scala.Nothing],
    Up: js.UndefOr[scala.Nothing],
    ToRight: js.UndefOr[scala.Nothing],
    ToLeft: Double
  ): Unit = js.native
  def SmallScroll(Down: js.UndefOr[scala.Nothing], Up: js.UndefOr[scala.Nothing], ToRight: Double): Unit = js.native
  def SmallScroll(Down: js.UndefOr[scala.Nothing], Up: js.UndefOr[scala.Nothing], ToRight: Double, ToLeft: Double): Unit = js.native
  def SmallScroll(Down: js.UndefOr[scala.Nothing], Up: Double): Unit = js.native
  def SmallScroll(Down: js.UndefOr[scala.Nothing], Up: Double, ToRight: js.UndefOr[scala.Nothing], ToLeft: Double): Unit = js.native
  def SmallScroll(Down: js.UndefOr[scala.Nothing], Up: Double, ToRight: Double): Unit = js.native
  def SmallScroll(Down: js.UndefOr[scala.Nothing], Up: Double, ToRight: Double, ToLeft: Double): Unit = js.native
  def SmallScroll(Down: Double): Unit = js.native
  def SmallScroll(Down: Double, Up: js.UndefOr[scala.Nothing], ToRight: js.UndefOr[scala.Nothing], ToLeft: Double): Unit = js.native
  def SmallScroll(Down: Double, Up: js.UndefOr[scala.Nothing], ToRight: Double): Unit = js.native
  def SmallScroll(Down: Double, Up: js.UndefOr[scala.Nothing], ToRight: Double, ToLeft: Double): Unit = js.native
  def SmallScroll(Down: Double, Up: Double): Unit = js.native
  def SmallScroll(Down: Double, Up: Double, ToRight: js.UndefOr[scala.Nothing], ToLeft: Double): Unit = js.native
  def SmallScroll(Down: Double, Up: Double, ToRight: Double): Unit = js.native
  def SmallScroll(Down: Double, Up: Double, ToRight: Double, ToLeft: Double): Unit = js.native
  
  var SplitHorizontal: Double = js.native
  
  var SplitVertical: Double = js.native
  
  var Top: Double = js.native
  
  val View: typingsSlinky.activexPowerpoint.PowerPoint.View = js.native
  
  var ViewType: PpViewType = js.native
  
  var Width: Double = js.native
  
  var WindowState: PpWindowState = js.native
}
