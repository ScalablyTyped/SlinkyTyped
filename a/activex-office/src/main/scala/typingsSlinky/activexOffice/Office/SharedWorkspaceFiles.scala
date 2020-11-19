package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedWorkspaceFiles extends js.Object {
  
  def apply(Index: Double): SharedWorkspaceFile = js.native
  
  def Add(FileName: String): SharedWorkspaceFile = js.native
  def Add(
    FileName: String,
    ParentFolder: js.UndefOr[scala.Nothing],
    OverwriteIfFileAlreadyExists: js.UndefOr[scala.Nothing],
    KeepInSync: Boolean
  ): SharedWorkspaceFile = js.native
  def Add(FileName: String, ParentFolder: js.UndefOr[scala.Nothing], OverwriteIfFileAlreadyExists: Boolean): SharedWorkspaceFile = js.native
  def Add(
    FileName: String,
    ParentFolder: js.UndefOr[scala.Nothing],
    OverwriteIfFileAlreadyExists: Boolean,
    KeepInSync: Boolean
  ): SharedWorkspaceFile = js.native
  def Add(FileName: String, ParentFolder: SharedWorkspaceFolder): SharedWorkspaceFile = js.native
  def Add(
    FileName: String,
    ParentFolder: SharedWorkspaceFolder,
    OverwriteIfFileAlreadyExists: js.UndefOr[scala.Nothing],
    KeepInSync: Boolean
  ): SharedWorkspaceFile = js.native
  def Add(FileName: String, ParentFolder: SharedWorkspaceFolder, OverwriteIfFileAlreadyExists: Boolean): SharedWorkspaceFile = js.native
  def Add(
    FileName: String,
    ParentFolder: SharedWorkspaceFolder,
    OverwriteIfFileAlreadyExists: Boolean,
    KeepInSync: Boolean
  ): SharedWorkspaceFile = js.native
  
  val Application: js.Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): SharedWorkspaceFile = js.native
  
  val ItemCountExceeded: Boolean = js.native
  
  val Parent: js.Any = js.native
}
