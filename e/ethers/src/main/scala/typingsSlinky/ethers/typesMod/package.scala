package typingsSlinky.ethers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type CoerceFunc = js.Function2[/* type */ java.lang.String, /* value */ js.Any, js.Any]
  type ContractFunction = js.Function1[/* repeated */ js.Any, js.Promise[js.Any]]
  type Listener = js.Function1[/* repeated */ js.Any, scala.Unit]
  type ProgressCallback = js.Function1[/* percent */ scala.Double, scala.Unit]
}
