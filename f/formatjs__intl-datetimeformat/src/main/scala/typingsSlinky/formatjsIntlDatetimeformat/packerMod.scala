package typingsSlinky.formatjsIntlDatetimeformat

import typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.UnpackedZoneData
import typingsSlinky.formatjsIntlDatetimeformat.typesMod.PackedData
import typingsSlinky.formatjsIntlDatetimeformat.typesMod.UnpackedData
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/intl-datetimeformat/lib/src/packer", JSImport.Namespace)
@js.native
object packerMod extends js.Object {
  
  def pack(data: UnpackedData): PackedData = js.native
  
  def unpack(data: PackedData): Record[String, js.Array[UnpackedZoneData]] = js.native
}
