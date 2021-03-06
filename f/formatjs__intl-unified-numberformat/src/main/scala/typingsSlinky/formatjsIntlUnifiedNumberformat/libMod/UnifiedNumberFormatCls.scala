package typingsSlinky.formatjsIntlUnifiedNumberformat.libMod

import typingsSlinky.formatjsIntlUnifiedNumberformat.coreMod.ResolvedUnifiedNumberFormatOptions
import typingsSlinky.formatjsIntlUnifiedNumberformat.coreMod.UnifiedNumberFormatOptions
import typingsSlinky.formatjsIntlUnifiedNumberformat.coreMod.UnifiedNumberFormatPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-unified-numberformat/lib", "UnifiedNumberFormat")
@js.native
class UnifiedNumberFormatCls ()
  extends typingsSlinky.formatjsIntlUnifiedNumberformat.coreMod.UnifiedNumberFormat {
  def this(locales: String) = this()
  def this(locales: js.Array[String]) = this()
  def this(locales: String, options: UnifiedNumberFormatOptions) = this()
  def this(locales: js.Array[String], options: UnifiedNumberFormatOptions) = this()
  /* CompleteClass */
  override def format(x: Double): String = js.native
  /* CompleteClass */
  override def formatToParts(x: Double): js.Array[UnifiedNumberFormatPart] = js.native
  /* CompleteClass */
  override def resolvedOptions(): ResolvedUnifiedNumberFormatOptions = js.native
}

