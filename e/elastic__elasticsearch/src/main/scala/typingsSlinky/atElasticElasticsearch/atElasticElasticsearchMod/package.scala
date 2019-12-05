package typingsSlinky.atElasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atElasticElasticsearchMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.atElasticElasticsearch.libTransportMod.ApiResponse

  type anyObject = StringDictionary[js.Any]
  type callbackFn[T] = js.Function2[/* err */ js.Error | Null, /* result */ ApiResponse[T, js.Any], Unit]
  type extendsCallback = js.Function1[/* options */ ClientExtendsCallbackOptions, js.Any]
}
