package typingsSlinky.fuzzaldrin

import typingsSlinky.fuzzaldrin.anon.Key
import typingsSlinky.fuzzaldrin.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fuzzaldrin", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def filter(candidates: js.Array[String], query: String): js.Array[String] = js.native
  def filter(candidates: js.Array[String], query: String, options: MaxResults): js.Array[String] = js.native
  def filter[T, K /* <: /* keyof T */ String */](
    candidates: js.Array[T],
    query: String with (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any),
    options: Key[K, T]
  ): js.Array[T] = js.native
  
  def `match`(string: String, query: String): js.Any = js.native
  
  def score(string: String, query: String): Double = js.native
}
