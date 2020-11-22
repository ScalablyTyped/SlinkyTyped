package typingsSlinky.itMultipart.mod

import typingsSlinky.itMultipart.anon.Body
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("it-multipart/dist", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * @typedef {import('http').IncomingHttpHeaders} IncomingHttpHeaders
    */
  /**
    * @template T
    * @typedef {AsyncIterable<T> & AsyncIterator<T>} It
    */
  /**
    * Streaming multipart HTTP message parser
    * @param {import('http').IncomingMessage} source
    * @param {string} [boundary]
    * @returns {AsyncIterable<{headers:IncomingHttpHeaders, body:It<Buffer>}>}
    */
  def apply(source: IncomingMessage): AsyncIterable[Body] = js.native
  def apply(source: IncomingMessage, boundary: String): AsyncIterable[Body] = js.native
}
