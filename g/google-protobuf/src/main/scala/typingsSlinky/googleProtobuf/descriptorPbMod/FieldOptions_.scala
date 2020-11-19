package typingsSlinky.googleProtobuf.descriptorPbMod

import typingsSlinky.googleProtobuf.descriptorPbMod.FieldOptions.CType
import typingsSlinky.googleProtobuf.descriptorPbMod.FieldOptions.JSType
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions")
@js.native
class FieldOptions_ () extends Message {
  
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: js.UndefOr[scala.Nothing], index: Double): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: Double): UninterpretedOption = js.native
  
  def clearCtype(): Unit = js.native
  
  def clearDeprecated(): Unit = js.native
  
  def clearJstype(): Unit = js.native
  
  def clearLazy(): Unit = js.native
  
  def clearPacked(): Unit = js.native
  
  def clearUninterpretedOptionList(): Unit = js.native
  
  def clearWeak(): Unit = js.native
  
  def getCtype(): js.UndefOr[CType] = js.native
  
  def getDeprecated(): js.UndefOr[Boolean] = js.native
  
  def getJstype(): js.UndefOr[JSType] = js.native
  
  def getLazy(): js.UndefOr[Boolean] = js.native
  
  def getPacked(): js.UndefOr[Boolean] = js.native
  
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  
  def getWeak(): js.UndefOr[Boolean] = js.native
  
  def hasCtype(): Boolean = js.native
  
  def hasDeprecated(): Boolean = js.native
  
  def hasJstype(): Boolean = js.native
  
  def hasLazy(): Boolean = js.native
  
  def hasPacked(): Boolean = js.native
  
  def hasWeak(): Boolean = js.native
  
  def setCtype(value: CType): Unit = js.native
  
  def setDeprecated(value: Boolean): Unit = js.native
  
  def setJstype(value: JSType): Unit = js.native
  
  def setLazy(value: Boolean): Unit = js.native
  
  def setPacked(value: Boolean): Unit = js.native
  
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): Unit = js.native
  
  def setWeak(value: Boolean): Unit = js.native
}
