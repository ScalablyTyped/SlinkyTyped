package typingsSlinky.koaDashGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaDashGraphqlMod {
  import typingsSlinky.koa.koaMod.Context
  import typingsSlinky.koa.koaMod.Request
  import typingsSlinky.koa.koaMod.Response

  type Options = (js.Function3[/* request */ Request, /* repsonse */ Response, /* ctx */ Context, OptionsResult]) | OptionsResult
  type OptionsResult = OptionsData | js.Promise[OptionsData]
}
