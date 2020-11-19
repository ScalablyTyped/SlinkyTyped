package typingsSlinky.htmlparser2.tokenizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Callbacks extends js.Object {
  
  def onattribdata(value: String): Unit = js.native
  
  def onattribend(): Unit = js.native
  
  def onattribname(name: String): Unit = js.native
  
  def oncdata(data: String): Unit = js.native
  
  def onclosetag(name: String): Unit = js.native
  
  def oncomment(data: String): Unit = js.native
  
  def ondeclaration(content: String): Unit = js.native
  
  def onend(): Unit = js.native
  
  def onerror(error: js.Error): Unit = js.native
  def onerror(error: js.Error, state: State): Unit = js.native
  
  def onopentagend(): Unit = js.native
  
  def onopentagname(name: String): Unit = js.native
  
  def onprocessinginstruction(instruction: String): Unit = js.native
  
  def onselfclosingtag(): Unit = js.native
  
  def ontext(value: String): Unit = js.native
}
