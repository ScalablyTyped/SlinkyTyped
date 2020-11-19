package typingsSlinky.htmlEncodingSniffer.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html-encoding-sniffer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * @param buffer The NodeJS buffer containing the (X)HTML source text.
    *
    * @return The canonical [encoding name](https://encoding.spec.whatwg.org/#names-and-labels)
    *         for use with the `whatwg-encoding` or similar package.
    */
  def apply(buffer: Buffer): String = js.native
  def apply(buffer: Buffer, options: Options): String = js.native
}
