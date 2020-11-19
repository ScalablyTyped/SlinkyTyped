package typingsSlinky.formData.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.httpMod.ClientRequest
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormData extends Readable {
  
  def append(key: String, value: js.Any): Unit = js.native
  def append(key: String, value: js.Any, options: String): Unit = js.native
  def append(key: String, value: js.Any, options: AppendOptions): Unit = js.native
  
  def getBoundary(): String = js.native
  
  def getBuffer(): Buffer = js.native
  
  def getHeaders(): Headers = js.native
  def getHeaders(userHeaders: Headers): Headers = js.native
  
  def getLength(callback: js.Function2[/* err */ js.Error | Null, /* length */ Double, Unit]): Unit = js.native
  
  def getLengthSync(): Double = js.native
  
  def hasKnownLength(): Boolean = js.native
  
  def submit(params: String): ClientRequest = js.native
  def submit(
    params: String,
    callback: js.Function2[/* error */ js.Error | Null, /* response */ IncomingMessage, Unit]
  ): ClientRequest = js.native
  def submit(params: SubmitOptions): ClientRequest = js.native
  def submit(
    params: SubmitOptions,
    callback: js.Function2[/* error */ js.Error | Null, /* response */ IncomingMessage, Unit]
  ): ClientRequest = js.native
}
