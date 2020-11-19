package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLNamespaces extends js.Object {
  
  /** @param boolean [InstallForAllUsers=false] */
  def Add(Path: String, NamespaceURI: js.Any, Alias: js.Any): XMLNamespace = js.native
  def Add(Path: String, NamespaceURI: js.Any, Alias: js.Any, InstallForAllUsers: Boolean): XMLNamespace = js.native
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  /** @param boolean [InstallForAllUsers=false] */
  def InstallManifest(Path: String): Unit = js.native
  def InstallManifest(Path: String, InstallForAllUsers: Boolean): Unit = js.native
  
  def Item(Index: js.Any): XMLNamespace = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.XMLNamespaces_typekey")
  var WordDotXMLNamespaces_typekey: XMLNamespaces = js.native
}
