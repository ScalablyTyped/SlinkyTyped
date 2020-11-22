package typingsSlinky.itMultipart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type IncomingHttpHeaders = typingsSlinky.node.httpMod.IncomingHttpHeaders
  
  type It[T] = typingsSlinky.std.AsyncIterable[T] with (typingsSlinky.std.AsyncIterator[T, _, js.UndefOr[scala.Nothing]])
  
  type PrefixStream[T] = typingsSlinky.std.AsyncIterable[T] with (typingsSlinky.std.AsyncIterator[T, _, js.UndefOr[scala.Nothing]]) with typingsSlinky.itMultipart.mod.PrefixPush[T]
  
  type parseHeaders = js.Function1[/* arg0 */ java.lang.String, typingsSlinky.itMultipart.mod.IncomingHttpHeaders]
}
