package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.anon.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response[T] extends js.Object {
  /** This is the data you would see in https://developer.github.com/v3/ */
  var data: T = js.native
  /** Response headers */
  var headers: Date = js.native
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[js.Iterator[_]] = js.native
  /** Response status number */
  var status: Double = js.native
}

