package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait System extends js.Object {
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val ComputerType: String = js.native
  
  def Connect(Path: String): Unit = js.native
  def Connect(Path: String, Drive: js.UndefOr[scala.Nothing], Password: js.Any): Unit = js.native
  def Connect(Path: String, Drive: js.Any): Unit = js.native
  def Connect(Path: String, Drive: js.Any, Password: js.Any): Unit = js.native
  
  val Country: WdCountry = js.native
  
  val CountryRegion: WdCountry = js.native
  
  val Creator: Double = js.native
  
  var Cursor: WdCursorType = js.native
  
  val FreeDiskSpace: Double = js.native
  
  val HorizontalResolution: Double = js.native
  
  val LanguageDesignation: String = js.native
  
  def MSInfo(): Unit = js.native
  
  val MacintoshName: String = js.native
  
  val MathCoprocessorInstalled: Boolean = js.native
  
  val OperatingSystem: String = js.native
  
  val Parent: js.Any = js.native
  
  def PrivateProfileString(FileName: String, Section: String, Key: String): String = js.native
  
  val ProcessorType: String = js.native
  
  def ProfileString(Section: String, Key: String): String = js.native
  
  val QuickDrawInstalled: Boolean = js.native
  
  val Version: String = js.native
  
  val VerticalResolution: Double = js.native
  
  @JSName("Word.System_typekey")
  var WordDotSystem_typekey: System = js.native
}
