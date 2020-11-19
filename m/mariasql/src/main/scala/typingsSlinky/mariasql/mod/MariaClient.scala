package typingsSlinky.mariasql.mod

import typingsSlinky.mariasql.mariasqlStrings.close
import typingsSlinky.mariasql.mariasqlStrings.connect
import typingsSlinky.mariasql.mariasqlStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MariaClient extends js.Object {
  
  def connect(config: ClientConfig): Unit = js.native
  
  var connected: Boolean = js.native
  
  def destroy(): Unit = js.native
  
  def end(): Unit = js.native
  
  def escape(query: String): String = js.native
  
  def isMariaDB(): Boolean = js.native
  
  def on(signal: String, cb: MariaCallBackVoid): MariaClient = js.native
  @JSName("on")
  def on_close(signal: close, cb: MariaCallBackObject): MariaClient = js.native
  @JSName("on")
  def on_connect(signal: connect, cb: MariaCallBackVoid): MariaClient = js.native
  @JSName("on")
  def on_error(signal: error, cb: MariaCallBackError): MariaClient = js.native
  
  def prepare(query: String): MariaPreparedQuery = js.native
  
  def query(q: String): MariaQuery = js.native
  def query(q: String, placeHolders: js.UndefOr[scala.Nothing], useArray: Boolean): MariaQuery = js.native
  def query(q: String, placeHolders: js.Array[_]): MariaQuery = js.native
  def query(q: String, placeHolders: js.Array[_], useArray: Boolean): MariaQuery = js.native
  def query(q: String, placeHolders: Dictionary): MariaQuery = js.native
  def query(q: String, placeHolders: Dictionary, useArray: Boolean): MariaQuery = js.native
  def query(q: String, useArray: Boolean): MariaQuery = js.native
  
  var threadId: String = js.native
}
