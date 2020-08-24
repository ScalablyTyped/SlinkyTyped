package typingsSlinky.formatjsIntlDatetimeformat

import typingsSlinky.formatjsIntlDatetimeformat.typesMod.PackedData
import typingsSlinky.formatjsIntlDatetimeformat.typesMod.UnpackedData
import typingsSlinky.formatjsIntlDatetimeformat.typesMod.UnpackedZoneData
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-datetimeformat/src/packer", JSImport.Namespace)
@js.native
object packerMod extends js.Object {
  def pack(data: UnpackedData): PackedData = js.native
  def unpack(data: PackedData): Record[String, js.Array[UnpackedZoneData]] = js.native
}

