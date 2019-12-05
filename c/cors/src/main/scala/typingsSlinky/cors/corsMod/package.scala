package typingsSlinky.cors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object corsMod {
  import typingsSlinky.express.expressMod.Request
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type CorsOptionsDelegate = js.Function2[
    /* req */ Request[ParamsDictionary], 
    /* callback */ js.Function2[/* err */ js.Error | Null, /* options */ js.UndefOr[CorsOptions], Unit], 
    Unit
  ]
  type CustomOrigin = js.Function2[
    /* requestOrigin */ js.UndefOr[String], 
    /* callback */ js.Function2[/* err */ js.Error | Null, /* allow */ js.UndefOr[Boolean], Unit], 
    Unit
  ]
}
