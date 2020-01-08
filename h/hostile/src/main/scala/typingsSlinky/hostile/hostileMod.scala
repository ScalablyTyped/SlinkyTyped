package typingsSlinky.hostile

import typingsSlinky.hostile.hostileStrings.CColonSlashWindowsSlashSystem32SlashdriversSlashetcSlashhosts
import typingsSlinky.hostile.hostileStrings.SlashetcSlashhosts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hostile", JSImport.Namespace)
@js.native
object hostileMod extends js.Object {
  val HOSTS: CColonSlashWindowsSlashSystem32SlashdriversSlashetcSlashhosts | SlashetcSlashhosts = js.native
  def get(preserveFormatting: Boolean): Unit | Lines = js.native
  def get(preserveFormatting: Boolean, cb: GetCallback): Unit | Lines = js.native
  def getFile(filePath: String, preserveFormatting: Boolean): Unit | Lines = js.native
  def getFile(filePath: String, preserveFormatting: Boolean, cb: GetCallback): Unit | Lines = js.native
  @JSName("getFile")
  def getFile_Lines(filePath: String, preserveFormatting: Boolean): Lines = js.native
  @JSName("getFile")
  def getFile_Unit(filePath: String, preserveFormatting: Boolean, cb: GetCallback): Unit = js.native
  @JSName("get")
  def get_Lines(preserveFormatting: Boolean): Lines = js.native
  @JSName("get")
  def get_Unit(preserveFormatting: Boolean, cb: GetCallback): Unit = js.native
  def remove(ip: String, host: String): Unit = js.native
  def remove(ip: String, host: String, cb: Callback): Unit = js.native
  def set(ip: String, host: String): Unit = js.native
  def set(ip: String, host: String, cb: Callback): Unit = js.native
  def writeFile(lines: js.Array[Line], preserveFormatting: Boolean): Unit = js.native
  def writeFile(lines: js.Array[Line], preserveFormatting: Boolean, cb: Callback): Unit = js.native
  type Callback = js.Function1[/* error */ js.Error | Null, Unit]
  type GetCallback = js.Function2[/* error */ js.Error | Null, /* lines */ Lines, Unit]
  type Line = String | (js.Tuple2[String, String])
  type Lines = js.Array[Line]
}

