package typingsSlinky.fuzzySearch.mod

import typingsSlinky.fuzzySearch.anon.RequiredOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FuzzySearch[T /* <: js.Object | String */] extends js.Object {
  
  var haystack: js.Array[T] = js.native
  
  var keys: js.Array[String] = js.native
  
  var options: RequiredOptions = js.native
  
  def search(): js.Array[T] = js.native
  def search(needle: String): js.Array[T] = js.native
}
