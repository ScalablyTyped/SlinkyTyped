package typingsSlinky.getCertain

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("get-certain", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply[TKey, TValue](map: Map[TKey, TValue], key: TKey): TValue = js.native
  def apply[TKey, TValue](map: Map[TKey, TValue], key: TKey, message: String): TValue = js.native
}
