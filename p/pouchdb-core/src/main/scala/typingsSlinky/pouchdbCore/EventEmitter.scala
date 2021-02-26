package typingsSlinky.pouchdbCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventEmitter extends StObject {
  
  def addListener(event: String, listener: js.Function): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function): this.type = js.native
  
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  
  def eventNames(): js.Array[String | js.Symbol] = js.native
  
  def getMaxListeners(): Double = js.native
  
  def listenerCount(`type`: String): Double = js.native
  def listenerCount(`type`: js.Symbol): Double = js.native
  
  def listeners(event: String): js.Array[js.Function] = js.native
  def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  
  def on(event: String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  
  def once(event: String, listener: js.Function): this.type = js.native
  def once(event: js.Symbol, listener: js.Function): this.type = js.native
  
  def prependListener(event: String, listener: js.Function): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function): this.type = js.native
  
  def prependOnceListener(event: String, listener: js.Function): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function): this.type = js.native
  
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: String): this.type = js.native
  def removeAllListeners(event: js.Symbol): this.type = js.native
  
  def removeListener(event: String, listener: js.Function): this.type = js.native
  def removeListener(event: js.Symbol, listener: js.Function): this.type = js.native
  
  def setMaxListeners(n: Double): this.type = js.native
}
