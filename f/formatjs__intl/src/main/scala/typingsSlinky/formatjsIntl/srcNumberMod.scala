package typingsSlinky.formatjsIntl

import typingsSlinky.formatjsIntl.anon.OnError
import typingsSlinky.formatjsIntl.anon.TypeofNumberFormat
import typingsSlinky.std.ConstructorParameters
import typingsSlinky.std.Intl.NumberFormat
import typingsSlinky.std.Intl.NumberFormatPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNumberMod {
  
  @JSImport("@formatjs/intl/src/number", "formatNumber")
  @js.native
  def formatNumber(
    config: OnError,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any
  ): String = js.native
  @JSImport("@formatjs/intl/src/number", "formatNumber")
  @js.native
  def formatNumber(
    config: OnError,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatNumberOptions | undefined): string>[1] */ js.Any
  ): String = js.native
  
  @JSImport("@formatjs/intl/src/number", "formatNumberToParts")
  @js.native
  def formatNumberToParts(
    config: OnError,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any
  ): js.Array[NumberFormatPart] = js.native
  @JSImport("@formatjs/intl/src/number", "formatNumberToParts")
  @js.native
  def formatNumberToParts(
    config: OnError,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatNumberOptions | undefined): string>[1] */ js.Any
  ): js.Array[NumberFormatPart] = js.native
  
  @JSImport("@formatjs/intl/src/number", "getFormatter")
  @js.native
  def getFormatter(
    hasLocaleFormatsOnError: OnError,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat]
  ): NumberFormat = js.native
  @JSImport("@formatjs/intl/src/number", "getFormatter")
  @js.native
  def getFormatter(
    hasLocaleFormatsOnError: OnError,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatNumberOptions | undefined): string>[1] */ js.Any
  ): NumberFormat = js.native
}
