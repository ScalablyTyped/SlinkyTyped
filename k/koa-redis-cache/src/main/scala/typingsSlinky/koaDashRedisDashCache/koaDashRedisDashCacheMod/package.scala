package typingsSlinky.koaDashRedisDashCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaDashRedisDashCacheMod {
  import typingsSlinky.koa.koaMod.Context

  type getPrefixCallback = js.Function1[/* ctx */ Context, String]
  type onErrorCallback = js.Function1[/* error */ js.Error, Unit]
}
