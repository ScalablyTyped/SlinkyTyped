package typingsSlinky.axiosMockAdapter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CallbackResponseSpecFunc = js.Function1[
    /* config */ typingsSlinky.axios.mod.AxiosRequestConfig, 
    js.Array[js.Any] | js.Promise[js.Array[js.Any]]
  ]
  type HeadersMatcher = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type RequestMatcherFunc = js.Function3[
    /* matcher */ js.UndefOr[java.lang.String | js.RegExp], 
    /* body */ js.UndefOr[java.lang.String | typingsSlinky.axiosMockAdapter.mod.RequestDataMatcher], 
    /* headers */ js.UndefOr[typingsSlinky.axiosMockAdapter.mod.HeadersMatcher], 
    typingsSlinky.axiosMockAdapter.mod.RequestHandler
  ]
  type ResponseSpecFunc = js.Function3[
    /* statusOrCallback */ scala.Double | typingsSlinky.axiosMockAdapter.mod.CallbackResponseSpecFunc, 
    /* data */ js.UndefOr[js.Any], 
    /* headers */ js.UndefOr[js.Any], 
    typingsSlinky.axiosMockAdapter.mod.MockAdapter
  ]
}
