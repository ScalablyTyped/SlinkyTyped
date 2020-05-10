package typingsSlinky.formatjsIntlUnifiedNumberformat.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnifiedNumberFormat extends js.Object {
  def format(x: Double): String = js.native
  def formatToParts(x: Double): js.Array[UnifiedNumberFormatPart] = js.native
  def resolvedOptions(): ResolvedUnifiedNumberFormatOptions = js.native
}

@JSImport("@formatjs/intl-unified-numberformat", "UnifiedNumberFormat")
@js.native
object UnifiedNumberFormat extends TopLevel[UnifiedNumberFormatConstructor]

