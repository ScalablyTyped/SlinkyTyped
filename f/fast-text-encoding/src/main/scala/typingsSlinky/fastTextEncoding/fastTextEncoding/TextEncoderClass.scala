package typingsSlinky.fastTextEncoding.fastTextEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TextEncoder instance.
  */
@js.native
trait TextEncoderClass extends js.Object {
  
  def encode(string: String): js.typedarray.Uint8Array = js.native
  def encode(string: String, options: TextEncodingOptions): js.typedarray.Uint8Array = js.native
  
  var encoding: String = js.native
}
