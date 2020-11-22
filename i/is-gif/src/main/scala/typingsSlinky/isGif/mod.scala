package typingsSlinky.isGif

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("is-gif", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Returns a boolean of whether input is a GIF image.
    */
  def apply(input: Buffer): Boolean = js.native
  def apply(input: js.typedarray.Uint8Array): Boolean = js.native
}
