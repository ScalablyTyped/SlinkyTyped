package typingsSlinky.chunkedDc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object chunkedDc {
  
  /** unchunker.ts **/
  type MessageListener = js.Function2[/* message */ js.typedarray.Uint8Array, /* context */ js.UndefOr[js.Any], scala.Unit]
}
