package typingsSlinky.formatjsEcma402Abstract.resolveLocaleMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.formatjsEcma402Abstract.anon.Dictk
import typingsSlinky.std.Record
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/ecma402-abstract/lib/ResolveLocale", "ResolveLocale")
@js.native
object ResolveLocale extends js.Object {
  
  def apply[K /* <: String */, D /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in K ]: any}
    */ typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.ResolveLocale with TopLevel[js.Any] */](
    availableLocales: Set[String],
    requestedLocales: js.Array[String],
    options: Dictk,
    relevantExtensionKeys: js.Array[K],
    localeData: Record[String, js.UndefOr[D]],
    getDefaultLocale: js.Function0[String]
  ): ResolveLocaleResult = js.native
}
