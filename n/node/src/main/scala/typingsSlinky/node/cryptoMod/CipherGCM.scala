package typingsSlinky.node.cryptoMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.anon.PlaintextLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CipherGCM extends Cipher {
  
  def getAuthTag(): Buffer = js.native
  
  def setAAD(buffer: ArrayBufferView): this.type = js.native
  def setAAD(buffer: ArrayBufferView, options: PlaintextLength): this.type = js.native
}
