package typingsSlinky.apolloServerEnv.fetchMod

import typingsSlinky.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server-env/dist/fetch", "Headers")
@js.native
class Headers ()
  extends Iterable[js.Tuple2[String, String]] {
  def this(init: HeadersInit) = this()
  
  def append(name: String, value: String): Unit = js.native
  
  def delete(name: String): Unit = js.native
  
  def entries(): js.Iterator[js.Tuple2[String, String]] = js.native
  
  def get(name: String): String | Null = js.native
  
  def has(name: String): Boolean = js.native
  
  def keys(): js.Iterator[String] = js.native
  
  def set(name: String, value: String): Unit = js.native
  
  def values(): js.Iterator[js.Array[String]] = js.native
}
