package typingsSlinky.intlDashFormatDashCache

import typingsSlinky.intlDashFormatDashCache.intlDashFormatDashCacheMod.CacheValue
import typingsSlinky.intlDashFormatDashCache.intlDashFormatDashCacheMod.MemoizeFormatConstructorFn
import typingsSlinky.std.ConstructorParameters
import typingsSlinky.std.Intl.DateTimeFormat
import typingsSlinky.std.Intl.NumberFormat
import typingsSlinky.std.Intl.PluralRules
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-format-cache", JSImport.Namespace)
@js.native
object intlDashFormatDashCacheMod extends js.Object {
  val default: MemoizeFormatConstructorFn = js.native
  type CacheValue = NumberFormat | DateTimeFormat | PluralRules | js.Any
  type MemoizeFormatConstructorFn = js.Function2[
    /* constructor */ Anon_Args, 
    /* cache */ js.UndefOr[Record[String, CacheValue]], 
    js.Function1[/* args */ ConstructorParameters[Anon_Args], js.Any]
  ]
}

