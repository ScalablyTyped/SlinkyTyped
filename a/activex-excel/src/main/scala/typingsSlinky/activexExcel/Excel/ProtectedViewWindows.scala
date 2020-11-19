package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtectedViewWindows extends js.Object {
  
  def apply(Index: String): ProtectedViewWindow = js.native
  def apply(Index: Double): ProtectedViewWindow = js.native
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): ProtectedViewWindow = js.native
  def Item(Index: Double): ProtectedViewWindow = js.native
  
  def Open(Filename: String): ProtectedViewWindow = js.native
  def Open(
    Filename: String,
    Password: js.UndefOr[scala.Nothing],
    AddToMru: js.UndefOr[scala.Nothing],
    RepairMode: Boolean
  ): ProtectedViewWindow = js.native
  def Open(Filename: String, Password: js.UndefOr[scala.Nothing], AddToMru: Boolean): ProtectedViewWindow = js.native
  def Open(Filename: String, Password: js.UndefOr[scala.Nothing], AddToMru: Boolean, RepairMode: Boolean): ProtectedViewWindow = js.native
  def Open(Filename: String, Password: String): ProtectedViewWindow = js.native
  def Open(Filename: String, Password: String, AddToMru: js.UndefOr[scala.Nothing], RepairMode: Boolean): ProtectedViewWindow = js.native
  def Open(Filename: String, Password: String, AddToMru: Boolean): ProtectedViewWindow = js.native
  def Open(Filename: String, Password: String, AddToMru: Boolean, RepairMode: Boolean): ProtectedViewWindow = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: js.Any): ProtectedViewWindow = js.native
}
