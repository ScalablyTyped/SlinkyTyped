package typingsSlinky.googleProtobuf.typePbMod

import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.googleProtobuf.typePbMod.Field.Cardinality
import typingsSlinky.googleProtobuf.typePbMod.Field.Kind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/type_pb", "Field")
@js.native
class Field_ () extends Message {
  
  def addOptions(): Option = js.native
  def addOptions(value: js.UndefOr[scala.Nothing], index: Double): Option = js.native
  def addOptions(value: Option): Option = js.native
  def addOptions(value: Option, index: Double): Option = js.native
  
  def clearOptionsList(): Field = js.native
  
  def getCardinality(): Cardinality = js.native
  
  def getDefaultValue(): String = js.native
  
  def getJsonName(): String = js.native
  
  def getKind(): Kind = js.native
  
  def getName(): String = js.native
  
  def getNumber(): Double = js.native
  
  def getOneofIndex(): Double = js.native
  
  def getOptionsList(): js.Array[Option] = js.native
  
  def getPacked(): Boolean = js.native
  
  def getTypeUrl(): String = js.native
  
  def setCardinality(value: Cardinality): Field = js.native
  
  def setDefaultValue(value: String): Field = js.native
  
  def setJsonName(value: String): Field = js.native
  
  def setKind(value: Kind): Field = js.native
  
  def setName(value: String): Field = js.native
  
  def setNumber(value: Double): Field = js.native
  
  def setOneofIndex(value: Double): Field = js.native
  
  def setOptionsList(value: js.Array[Option]): Field = js.native
  
  def setPacked(value: Boolean): Field = js.native
  
  def setTypeUrl(value: String): Field = js.native
}
