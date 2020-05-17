package typingsSlinky.koaGraphql.mod

import typingsSlinky.koa.mod.Context
import typingsSlinky.koa.mod.Request
import typingsSlinky.koa.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function3[
/ * request * / typingsSlinky.koa.mod.Request, 
/ * repsonse * / typingsSlinky.koa.mod.Response, 
/ * ctx * / typingsSlinky.koa.mod.Context, 
typingsSlinky.koaGraphql.mod.OptionsResult]
  - typingsSlinky.koaGraphql.mod.OptionsResult
*/
trait Options extends js.Object

object Options {
  @scala.inline
  implicit def apply(
    value: js.Function3[/* request */ Request, /* repsonse */ Response, /* ctx */ Context, OptionsResult]
  ): Options = value.asInstanceOf[Options]
  @scala.inline
  implicit def apply(value: OptionsResult): Options = value.asInstanceOf[Options]
}

