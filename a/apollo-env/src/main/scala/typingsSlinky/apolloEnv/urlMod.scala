package typingsSlinky.apolloEnv

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloEnv.arrayMod.global.Array
import typingsSlinky.node.NodeJS.Dict
import typingsSlinky.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMod {
  
  @JSImport("apollo-env/lib/fetch/url", "URL")
  @js.native
  class URL protected () extends URL_ {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: URL_) = this()
  }
  
  @JSImport("apollo-env/lib/fetch/url", "URLSearchParams")
  @js.native
  class URLSearchParams ()
    extends typingsSlinky.node.urlMod.URLSearchParams {
    def this(init: String) = this()
    def this(init: js.Array[js.Tuple2[String, String]]) = this()
    def this(init: js.Iterable[js.Tuple2[String, String]]) = this()
    def this(init: Dict[String | js.Array[String]]) = this()
    def this(init: typingsSlinky.node.urlMod.URLSearchParams) = this()
  }
  
  type URLSearchParamsInit = typingsSlinky.node.urlMod.URLSearchParams | String | (StringDictionary[js.UndefOr[js.Object | Array[js.Object]]]) | (js.Iterable[js.Tuple2[String, js.Object]]) | (Array[js.Tuple2[String, js.Object]])
}
