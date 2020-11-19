package typingsSlinky.peerjsJsBinarypack

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("peerjs-js-binarypack", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def pack(data: js.Any): Blob = js.native
  
  def unpack(data: js.typedarray.ArrayBuffer): js.Any = js.native
}
