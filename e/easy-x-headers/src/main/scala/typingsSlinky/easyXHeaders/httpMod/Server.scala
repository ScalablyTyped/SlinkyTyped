package typingsSlinky.easyXHeaders.httpMod

import typingsSlinky.easyXHeaders.anon.Address
import typingsSlinky.easyXHeaders.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Server extends EventEmitter {
  
  def address(): Address = js.native
  
  def close(): Server = js.native
  def close(cb: js.Any): Server = js.native
  
  def listen(handle: js.Any): Server = js.native
  def listen(handle: js.Any, listeningListener: js.Function): Server = js.native
  def listen(path: String): Server = js.native
  def listen(path: String, callback: js.Function): Server = js.native
  def listen(port: Double): Server = js.native
  def listen(
    port: Double,
    hostname: js.UndefOr[scala.Nothing],
    backlog: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): Server = js.native
  def listen(port: Double, hostname: js.UndefOr[scala.Nothing], backlog: Double): Server = js.native
  def listen(port: Double, hostname: js.UndefOr[scala.Nothing], backlog: Double, callback: js.Function): Server = js.native
  def listen(port: Double, hostname: js.UndefOr[scala.Nothing], callback: js.Function): Server = js.native
  def listen(port: Double, hostname: String): Server = js.native
  def listen(port: Double, hostname: String, backlog: js.UndefOr[scala.Nothing], callback: js.Function): Server = js.native
  def listen(port: Double, hostname: String, backlog: Double): Server = js.native
  def listen(port: Double, hostname: String, backlog: Double, callback: js.Function): Server = js.native
  def listen(port: Double, hostname: String, callback: js.Function): Server = js.native
  
  var maxHeadersCount: Double = js.native
}
