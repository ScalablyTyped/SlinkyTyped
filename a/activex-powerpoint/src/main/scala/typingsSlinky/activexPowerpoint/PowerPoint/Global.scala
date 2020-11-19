package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.CommandBar
import typingsSlinky.activexOffice.Office.CommandBars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Global extends js.Object {
  
  val ActivePresentation: Presentation = js.native
  
  val ActiveProtectedViewWindow: ProtectedViewWindow = js.native
  
  val ActiveWindow: DocumentWindow = js.native
  
  val AddIns: typingsSlinky.activexPowerpoint.PowerPoint.AddIns = js.native
  
  val AnswerWizard: typingsSlinky.activexOffice.Office.AnswerWizard = js.native
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  val Assistant: typingsSlinky.activexOffice.Office.Assistant = js.native
  
  def CommandBars(Index: String): CommandBar = js.native
  def CommandBars(Index: Double): CommandBar = js.native
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  
  val Dialogs: js.Any = js.native
  
  val FileConverters: typingsSlinky.activexPowerpoint.PowerPoint.FileConverters = js.native
  
  val IsSandboxed: Boolean = js.native
  
  @JSName("PowerPoint.Global_typekey")
  var PowerPointDotGlobal_typekey: Global = js.native
  
  val Presentations: typingsSlinky.activexPowerpoint.PowerPoint.Presentations = js.native
  
  val ProtectedViewWindows: typingsSlinky.activexPowerpoint.PowerPoint.ProtectedViewWindows = js.native
  
  val SlideShowWindows: typingsSlinky.activexPowerpoint.PowerPoint.SlideShowWindows = js.native
  
  val Windows: DocumentWindows = js.native
}
