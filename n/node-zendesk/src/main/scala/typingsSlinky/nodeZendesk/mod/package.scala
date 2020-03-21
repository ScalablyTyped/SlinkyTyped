package typingsSlinky.nodeZendesk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ZendeskCallback[TResponse, TResult] = js.Function3[
    /* error */ js.UndefOr[js.Error], 
    /* response */ TResponse, 
    /* result */ TResult, 
    scala.Unit
  ]
  type ZendeskID = scala.Double
}
