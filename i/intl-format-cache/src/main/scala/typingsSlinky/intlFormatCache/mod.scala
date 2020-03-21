package typingsSlinky.intlFormatCache

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
object mod extends js.Object {
  val default: MemoizeFormatConstructorFn = js.native
  type CacheValue = NumberFormat | DateTimeFormat | PluralRules | js.Any
  type MemoizeFormatConstructorFn = js.Function2[
    /* constructor */ AnonInstantiable, 
    /* cache */ js.UndefOr[Record[String, CacheValue]], 
    js.Function1[/* args */ ConstructorParameters[AnonInstantiable], js.Any]
  ]
}

