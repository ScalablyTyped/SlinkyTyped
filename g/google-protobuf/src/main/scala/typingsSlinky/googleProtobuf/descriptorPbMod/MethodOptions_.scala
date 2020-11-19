package typingsSlinky.googleProtobuf.descriptorPbMod

import typingsSlinky.googleProtobuf.descriptorPbMod.MethodOptions.IdempotencyLevel
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodOptions")
@js.native
class MethodOptions_ () extends Message {
  
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: js.UndefOr[scala.Nothing], index: Double): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: Double): UninterpretedOption = js.native
  
  def clearDeprecated(): Unit = js.native
  
  def clearIdempotencyLevel(): Unit = js.native
  
  def clearUninterpretedOptionList(): Unit = js.native
  
  def getDeprecated(): js.UndefOr[Boolean] = js.native
  
  def getIdempotencyLevel(): js.UndefOr[IdempotencyLevel] = js.native
  
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  
  def hasDeprecated(): Boolean = js.native
  
  def hasIdempotencyLevel(): Boolean = js.native
  
  def setDeprecated(value: Boolean): Unit = js.native
  
  def setIdempotencyLevel(value: IdempotencyLevel): Unit = js.native
  
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): Unit = js.native
}
