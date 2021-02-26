package typingsSlinky.bip174.interfacesMod

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WitnessUtxo extends StObject {
  
  var script: Buffer = js.native
  
  var value: Double = js.native
}
object WitnessUtxo {
  
  @scala.inline
  def apply(script: Buffer, value: Double): WitnessUtxo = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WitnessUtxo]
  }
  
  @scala.inline
  implicit class WitnessUtxoMutableBuilder[Self <: WitnessUtxo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScript(value: Buffer): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
