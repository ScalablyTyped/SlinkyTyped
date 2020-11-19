package typingsSlinky.googleProtobuf.apiPbMod

import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.googleProtobuf.typePbMod.Option
import typingsSlinky.googleProtobuf.typePbMod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/api_pb", "Method")
@js.native
class Method_ () extends Message {
  
  def addOptions(): Option = js.native
  def addOptions(value: js.UndefOr[scala.Nothing], index: Double): Option = js.native
  def addOptions(value: Option): Option = js.native
  def addOptions(value: Option, index: Double): Option = js.native
  
  def clearOptionsList(): Unit = js.native
  
  def getName(): String = js.native
  
  def getOptionsList(): js.Array[Option] = js.native
  
  def getRequestStreaming(): Boolean = js.native
  
  def getRequestTypeUrl(): String = js.native
  
  def getResponseStreaming(): Boolean = js.native
  
  def getResponseTypeUrl(): String = js.native
  
  def getSyntax(): Syntax = js.native
  
  def setName(value: String): Unit = js.native
  
  def setOptionsList(value: js.Array[Option]): Unit = js.native
  
  def setRequestStreaming(value: Boolean): Unit = js.native
  
  def setRequestTypeUrl(value: String): Unit = js.native
  
  def setResponseStreaming(value: Boolean): Unit = js.native
  
  def setResponseTypeUrl(value: String): Unit = js.native
  
  def setSyntax(value: Syntax): Unit = js.native
}
