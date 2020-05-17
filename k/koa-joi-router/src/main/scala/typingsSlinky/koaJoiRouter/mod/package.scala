package typingsSlinky.koaJoiRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FullHandler = js.Function2[
    /* ctx */ typingsSlinky.koa.mod.Context, 
    /* next */ typingsSlinky.koa.mod.Next, 
    js.Any
  ]
  type Method = js.Function3[
    /* path */ java.lang.String | js.RegExp, 
    /* handlerOrConfig */ typingsSlinky.koaJoiRouter.mod.Handler | typingsSlinky.koaJoiRouter.mod.Config, 
    /* repeated */ typingsSlinky.koaJoiRouter.mod.Handler, 
    typingsSlinky.koaJoiRouter.mod.Router
  ]
}
