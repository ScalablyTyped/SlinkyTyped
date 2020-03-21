package typingsSlinky.koaGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Options = (js.Function3[
    /* request */ typingsSlinky.koa.mod.Request, 
    /* repsonse */ typingsSlinky.koa.mod.Response, 
    /* ctx */ typingsSlinky.koa.mod.Context, 
    typingsSlinky.koaGraphql.mod.OptionsResult
  ]) | typingsSlinky.koaGraphql.mod.OptionsResult
  type OptionsResult = typingsSlinky.koaGraphql.mod.OptionsData | js.Promise[typingsSlinky.koaGraphql.mod.OptionsData]
}
