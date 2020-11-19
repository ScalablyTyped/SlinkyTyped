package typingsSlinky.bip174

import typingsSlinky.bip174.interfacesMod.KeyValue
import typingsSlinky.bip174.interfacesMod.PsbtGlobal
import typingsSlinky.bip174.interfacesMod.PsbtGlobalUpdate
import typingsSlinky.bip174.interfacesMod.PsbtInput
import typingsSlinky.bip174.interfacesMod.PsbtInputUpdate
import typingsSlinky.bip174.interfacesMod.PsbtOutput
import typingsSlinky.bip174.interfacesMod.PsbtOutputUpdate
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bip174/src/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def addInputAttributes(inputs: js.Array[PsbtInput], data: js.Any): Unit = js.native
  
  def addOutputAttributes(outputs: js.Array[PsbtOutput], data: js.Any): Unit = js.native
  
  def checkForInput(inputs: js.Array[PsbtInput], inputIndex: Double): PsbtInput = js.native
  
  def checkForOutput(outputs: js.Array[PsbtOutput], outputIndex: Double): PsbtOutput = js.native
  
  def checkHasKey(checkKeyVal: KeyValue, keyVals: js.UndefOr[scala.Nothing], enumLength: Double): Unit = js.native
  def checkHasKey(checkKeyVal: KeyValue, keyVals: js.Array[KeyValue], enumLength: Double): Unit = js.native
  
  def defaultLocktimeSetter(locktime: Double, txBuf: Buffer): Buffer = js.native
  
  def defaultVersionSetter(version: Double, txBuf: Buffer): Buffer = js.native
  
  def getEnumLength(myenum: js.Any): Double = js.native
  
  def inputCheckUncleanFinalized(inputIndex: Double, input: PsbtInput): Unit = js.native
  
  def updateGlobal(updateData: PsbtGlobalUpdate, mainData: PsbtGlobal): Unit = js.native
  
  def updateInput(updateData: PsbtInputUpdate, mainData: PsbtInput): Unit = js.native
  
  def updateOutput(updateData: PsbtOutputUpdate, mainData: PsbtOutput): Unit = js.native
}
