package typingsSlinky.bip174

import typingsSlinky.bip174.interfacesMod.FinalScriptWitness
import typingsSlinky.bip174.interfacesMod.KeyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bip174/src/lib/converter/input/finalScriptWitness", JSImport.Namespace)
@js.native
object finalScriptWitnessMod extends js.Object {
  
  def canAdd(currentData: js.Any, newData: js.Any): Boolean = js.native
  
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.FinalScriptWitness */ Boolean = js.native
  
  def decode(keyVal: KeyValue): FinalScriptWitness = js.native
  
  def encode(data: FinalScriptWitness): KeyValue = js.native
  
  val expected: /* "Buffer" */ String = js.native
}
