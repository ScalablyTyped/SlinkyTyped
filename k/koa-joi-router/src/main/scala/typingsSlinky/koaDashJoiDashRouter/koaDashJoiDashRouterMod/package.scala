package typingsSlinky.koaDashJoiDashRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaDashJoiDashRouterMod {
  import typingsSlinky.koa.koaMod.Context
  import typingsSlinky.koa.koaMod.Next

  type FullHandler = js.Function2[/* ctx */ Context, /* next */ Next, js.Any]
  type Handler = FullHandler | NestedHandler
  type Method = js.Function3[
    /* path */ String | js.RegExp, 
    /* handlerOrConfig */ Handler | Config, 
    /* repeated */ Handler, 
    Router
  ]
}
