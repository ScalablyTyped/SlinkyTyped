package typingsSlinky.node.cryptoMod

import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.anon.PlaintextLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecipherCCM extends Decipher {
  
  def setAAD(buffer: ArrayBufferView, options: PlaintextLength): this.type = js.native
  
  def setAuthTag(buffer: ArrayBufferView): this.type = js.native
}
