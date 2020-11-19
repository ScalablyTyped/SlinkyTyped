package typingsSlinky.activexVbide.VBIDE

import typingsSlinky.activexOffice.Office.CommandBar
import typingsSlinky.activexOffice.Office.CommandBars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VBE extends js.Object {
  
  var ActiveCodePane: CodePane = js.native
  
  var ActiveVBProject: VBProject = js.native
  
  val ActiveWindow: Window = js.native
  
  def Addins(index: js.Any): AddIn = js.native
  @JSName("Addins")
  val Addins_Original: Addins = js.native
  
  def CodePanes(index: js.Any): CodePane = js.native
  @JSName("CodePanes")
  val CodePanes_Original: CodePanes = js.native
  
  def CommandBars(Index: String): CommandBar = js.native
  def CommandBars(Index: Double): CommandBar = js.native
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  
  val Events: typingsSlinky.activexVbide.VBIDE.Events = js.native
  
  val MainWindow: Window = js.native
  
  val SelectedVBComponent: VBComponent = js.native
  
  @JSName("VBIDE.VBE_typekey")
  var VBIDEDotVBE_typekey: VBE = js.native
  
  def VBProjects(index: js.Any): VBProject = js.native
  @JSName("VBProjects")
  val VBProjects_Original: VBProjects = js.native
  
  val Version: String = js.native
  
  def Windows(index: js.Any): Window = js.native
  @JSName("Windows")
  val Windows_Original: Windows = js.native
}
