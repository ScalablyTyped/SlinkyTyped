package typingsSlinky.chunkedDashDc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object chunkedDc {
  /** unchunker.ts **/
  type MessageListener = js.Function2[
    /* message */ scala.scalajs.js.typedarray.Uint8Array, 
    /* context */ js.UndefOr[js.Any], 
    Unit
  ]
}
