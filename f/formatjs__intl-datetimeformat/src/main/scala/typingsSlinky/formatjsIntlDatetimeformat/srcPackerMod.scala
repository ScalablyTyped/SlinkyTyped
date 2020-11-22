package typingsSlinky.formatjsIntlDatetimeformat

import typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.UnpackedZoneData
import typingsSlinky.formatjsIntlDatetimeformat.srcTypesMod.PackedData
import typingsSlinky.formatjsIntlDatetimeformat.srcTypesMod.UnpackedData
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/intl-datetimeformat/src/packer", JSImport.Namespace)
@js.native
object srcPackerMod extends js.Object {
  
  def pack(data: UnpackedData): PackedData = js.native
  
  def unpack(data: PackedData): Record[String, js.Array[UnpackedZoneData]] = js.native
}
