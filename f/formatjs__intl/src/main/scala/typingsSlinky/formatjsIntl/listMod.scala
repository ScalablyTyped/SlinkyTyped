package typingsSlinky.formatjsIntl

import typingsSlinky.formatjsIntl.anon.LocaleOnError
import typingsSlinky.formatjsIntl.anon.TypeofIntlListFormat
import typingsSlinky.formatjsIntlListformat.mod.default
import typingsSlinky.std.ConstructorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("@formatjs/intl/lib/src/list", "formatList")
  @js.native
  def formatList_1(
    hasLocaleOnError: LocaleOnError,
    getListFormat: js.Function1[/* args */ ConstructorParameters[TypeofIntlListFormat], default],
    values: js.Array[String],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallValuesOpts>[1] */ js.Any
  ): String = js.native
}
