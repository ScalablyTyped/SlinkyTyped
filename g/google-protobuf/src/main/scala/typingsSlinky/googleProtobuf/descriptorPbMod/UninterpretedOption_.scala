package typingsSlinky.googleProtobuf.descriptorPbMod

import typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption.NamePart
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "UninterpretedOption")
@js.native
class UninterpretedOption_ () extends Message {
  
  def addName(): NamePart = js.native
  def addName(value: js.UndefOr[scala.Nothing], index: Double): NamePart = js.native
  def addName(value: NamePart): NamePart = js.native
  def addName(value: NamePart, index: Double): NamePart = js.native
  
  def clearAggregateValue(): Unit = js.native
  
  def clearDoubleValue(): Unit = js.native
  
  def clearIdentifierValue(): Unit = js.native
  
  def clearNameList(): Unit = js.native
  
  def clearNegativeIntValue(): Unit = js.native
  
  def clearPositiveIntValue(): Unit = js.native
  
  def clearStringValue(): Unit = js.native
  
  def getAggregateValue(): js.UndefOr[String] = js.native
  
  def getDoubleValue(): js.UndefOr[Double] = js.native
  
  def getIdentifierValue(): js.UndefOr[String] = js.native
  
  def getNameList(): js.Array[NamePart] = js.native
  
  def getNegativeIntValue(): js.UndefOr[Double] = js.native
  
  def getPositiveIntValue(): js.UndefOr[Double] = js.native
  
  def getStringValue(): js.typedarray.Uint8Array | String = js.native
  
  def getStringValue_asB64(): String = js.native
  
  def getStringValue_asU8(): js.typedarray.Uint8Array = js.native
  
  def hasAggregateValue(): Boolean = js.native
  
  def hasDoubleValue(): Boolean = js.native
  
  def hasIdentifierValue(): Boolean = js.native
  
  def hasNegativeIntValue(): Boolean = js.native
  
  def hasPositiveIntValue(): Boolean = js.native
  
  def hasStringValue(): Boolean = js.native
  
  def setAggregateValue(value: String): Unit = js.native
  
  def setDoubleValue(value: Double): Unit = js.native
  
  def setIdentifierValue(value: String): Unit = js.native
  
  def setNameList(value: js.Array[NamePart]): Unit = js.native
  
  def setNegativeIntValue(value: Double): Unit = js.native
  
  def setPositiveIntValue(value: Double): Unit = js.native
  
  def setStringValue(value: String): Unit = js.native
  def setStringValue(value: js.typedarray.Uint8Array): Unit = js.native
}
