package typingsSlinky.activexShell.Shell32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Definition of interface FolderItemVerbs */
@js.native
trait FolderItemVerbs extends js.Object {
  
  /** Get count of open folder windows */
  val Count: Double = js.native
  
  /** Return the specified verb */
  def Item(): FolderItemVerb = js.native
  def Item(index: js.Any): FolderItemVerb = js.native
  
  @JSName("Shell32.FolderItemVerbs_typekey")
  var Shell32DotFolderItemVerbs_typekey: FolderItemVerbs = js.native
}
