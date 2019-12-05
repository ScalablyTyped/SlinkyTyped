package typingsSlinky.morgan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object morganMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.express.expressMod.Request
  import typingsSlinky.express.expressMod.Response
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type FormatFn = js.Function3[
    /* tokens */ TokenIndexer, 
    /* req */ Request[ParamsDictionary], 
    /* res */ Response, 
    js.UndefOr[String | Null]
  ]
  type TokenCallbackFn = js.Function3[
    /* req */ Request[ParamsDictionary], 
    /* res */ Response, 
    /* arg */ js.UndefOr[String | Double | Boolean], 
    String
  ]
  type TokenIndexer = StringDictionary[TokenCallbackFn]
}
