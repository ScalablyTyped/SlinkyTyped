package typingsSlinky.axiosDashMockDashAdapter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object axiosDashMockDashAdapterMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.axios.axiosMod.AxiosRequestConfig

  type CallbackResponseSpecFunc = js.Function1[/* config */ AxiosRequestConfig, js.Array[js.Any] | js.Promise[js.Array[js.Any]]]
  type HeadersMatcher = StringDictionary[String]
  type RequestMatcherFunc = js.Function3[
    /* matcher */ js.UndefOr[String | js.RegExp], 
    /* body */ js.UndefOr[String | RequestDataMatcher], 
    /* headers */ js.UndefOr[HeadersMatcher], 
    RequestHandler
  ]
  type ResponseSpecFunc = js.Function3[
    /* statusOrCallback */ Double | CallbackResponseSpecFunc, 
    /* data */ js.UndefOr[js.Any], 
    /* headers */ js.UndefOr[js.Any], 
    MockAdapter
  ]
}
