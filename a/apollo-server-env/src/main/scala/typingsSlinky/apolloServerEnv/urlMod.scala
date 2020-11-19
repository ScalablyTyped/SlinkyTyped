package typingsSlinky.apolloServerEnv

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Iterable
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server-env/dist/url", JSImport.Namespace)
@js.native
object urlMod extends js.Object {
  
  @js.native
  class URL protected () extends js.Object {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: URL) = this()
    
    var hash: String = js.native
    
    var host: String = js.native
    
    var hostname: String = js.native
    
    var href: String = js.native
    
    val origin: String = js.native
    
    var password: String = js.native
    
    var pathname: String = js.native
    
    var port: String = js.native
    
    var protocol: String = js.native
    
    var search: String = js.native
    
    val searchParams: URLSearchParams = js.native
    
    def toJSON(): String = js.native
    
    var username: String = js.native
  }
  
  @js.native
  class URLSearchParams ()
    extends Iterable[js.Tuple2[String, String]] {
    def this(init: URLSearchParamsInit) = this()
    
    def append(name: String, value: String): Unit = js.native
    
    def delete(name: String): Unit = js.native
    
    def entries(): IterableIterator[js.Tuple2[String, String]] = js.native
    
    def forEach(callback: js.Function2[/* value */ String, /* name */ String, Unit]): Unit = js.native
    
    def get(name: String): String | Null = js.native
    
    def getAll(name: String): js.Array[String] = js.native
    
    def has(name: String): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_URLSearchParams: js.Function0[IterableIterator[js.Tuple2[String, String]]] = js.native
    
    def keys(): IterableIterator[String] = js.native
    
    def set(name: String, value: String): Unit = js.native
    
    def sort(): Unit = js.native
    
    def values(): IterableIterator[String] = js.native
  }
  
  type URLSearchParamsInit = URLSearchParams | String | (StringDictionary[js.UndefOr[js.Object | js.Array[js.Object]]]) | (js.Iterable[js.Tuple2[String, js.Object]]) | (js.Array[js.Tuple2[String, js.Object]])
}
