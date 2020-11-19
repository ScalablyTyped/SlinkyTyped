package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewFile extends js.Object {
  
  def Add(FileName: String): Boolean = js.native
  def Add(
    FileName: String,
    Section: js.UndefOr[scala.Nothing],
    DisplayName: js.UndefOr[scala.Nothing],
    Action: MsoFileNewAction
  ): Boolean = js.native
  def Add(FileName: String, Section: js.UndefOr[scala.Nothing], DisplayName: String): Boolean = js.native
  def Add(
    FileName: String,
    Section: js.UndefOr[scala.Nothing],
    DisplayName: String,
    Action: MsoFileNewAction
  ): Boolean = js.native
  def Add(FileName: String, Section: MsoFileNewSection): Boolean = js.native
  def Add(
    FileName: String,
    Section: MsoFileNewSection,
    DisplayName: js.UndefOr[scala.Nothing],
    Action: MsoFileNewAction
  ): Boolean = js.native
  def Add(FileName: String, Section: MsoFileNewSection, DisplayName: String): Boolean = js.native
  def Add(FileName: String, Section: MsoFileNewSection, DisplayName: String, Action: MsoFileNewAction): Boolean = js.native
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  @JSName("Office.NewFile_typekey")
  var OfficeDotNewFile_typekey: NewFile = js.native
  
  def Remove(FileName: String): Boolean = js.native
  def Remove(
    FileName: String,
    Section: js.UndefOr[scala.Nothing],
    DisplayName: js.UndefOr[scala.Nothing],
    Action: MsoFileNewAction
  ): Boolean = js.native
  def Remove(FileName: String, Section: js.UndefOr[scala.Nothing], DisplayName: String): Boolean = js.native
  def Remove(
    FileName: String,
    Section: js.UndefOr[scala.Nothing],
    DisplayName: String,
    Action: MsoFileNewAction
  ): Boolean = js.native
  def Remove(FileName: String, Section: MsoFileNewSection): Boolean = js.native
  def Remove(
    FileName: String,
    Section: MsoFileNewSection,
    DisplayName: js.UndefOr[scala.Nothing],
    Action: MsoFileNewAction
  ): Boolean = js.native
  def Remove(FileName: String, Section: MsoFileNewSection, DisplayName: String): Boolean = js.native
  def Remove(FileName: String, Section: MsoFileNewSection, DisplayName: String, Action: MsoFileNewAction): Boolean = js.native
}
