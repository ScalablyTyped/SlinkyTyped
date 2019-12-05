package typingsSlinky.nodeDashZendesk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashZendeskMod {
  type ZendeskCallback[TResponse, TResult] = js.Function3[/* error */ js.UndefOr[js.Error], /* response */ TResponse, /* result */ TResult, Unit]
  type ZendeskID = Double
}
