package typingsSlinky.rfc6902

import typingsSlinky.rfc6902.rfc6902Strings.`null`
import typingsSlinky.rfc6902.rfc6902Strings.`object`
import typingsSlinky.rfc6902.rfc6902Strings.array
import typingsSlinky.rfc6902.rfc6902Strings.bigint
import typingsSlinky.rfc6902.rfc6902Strings.boolean
import typingsSlinky.rfc6902.rfc6902Strings.function
import typingsSlinky.rfc6902.rfc6902Strings.number
import typingsSlinky.rfc6902.rfc6902Strings.string
import typingsSlinky.rfc6902.rfc6902Strings.symbol
import typingsSlinky.rfc6902.rfc6902Strings.undefined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rfc6902/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def clone[T /* <: js.Any */](source: T): T = js.native
  
  def hasOwnProperty(v: js.Symbol): Boolean = js.native
  def hasOwnProperty(v: Double): Boolean = js.native
  
  def objectType(`object`: js.Any): string | number | bigint | boolean | symbol | undefined | `object` | function | `null` | array = js.native
}
