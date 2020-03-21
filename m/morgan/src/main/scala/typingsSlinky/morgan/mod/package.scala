package typingsSlinky.morgan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FormatFn = js.Function3[
    /* tokens */ typingsSlinky.morgan.mod.TokenIndexer, 
    /* req */ typingsSlinky.express.mod.Request_[typingsSlinky.expressServeStaticCore.mod.ParamsDictionary], 
    /* res */ typingsSlinky.express.mod.Response_, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  type TokenCallbackFn = js.Function3[
    /* req */ typingsSlinky.express.mod.Request_[typingsSlinky.expressServeStaticCore.mod.ParamsDictionary], 
    /* res */ typingsSlinky.express.mod.Response_, 
    /* arg */ js.UndefOr[java.lang.String | scala.Double | scala.Boolean], 
    js.UndefOr[java.lang.String]
  ]
  type TokenIndexer = org.scalablytyped.runtime.StringDictionary[typingsSlinky.morgan.mod.TokenCallbackFn]
}
