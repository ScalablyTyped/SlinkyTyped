package typingsSlinky.browserfs.zipFSMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/backend/ZipFS", "DigitalSignature")
@js.native
class DigitalSignature protected () extends js.Object {
  def this(data: Buffer) = this()
  
  var data: js.Any = js.native
  
  def signatureData(): Buffer = js.native
  
  def size(): Double = js.native
}
