package typingsSlinky.pusherJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventsDispatcher extends js.Object {
  
  def bind(eventName: String, callback: EventCallback): this.type = js.native
  def bind(eventName: String, callback: EventCallback, context: js.Any): this.type = js.native
  
  def bind_global(callback: EventCallback): this.type = js.native
  
  def emit(eventName: String): this.type = js.native
  def emit(eventName: String, data: js.Any): this.type = js.native
  
  def unbind(): this.type = js.native
  def unbind(eventName: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  def unbind(eventName: js.UndefOr[scala.Nothing], callback: Null, context: js.Any): this.type = js.native
  def unbind(eventName: js.UndefOr[scala.Nothing], callback: EventCallback): this.type = js.native
  def unbind(eventName: js.UndefOr[scala.Nothing], callback: EventCallback, context: js.Any): this.type = js.native
  def unbind(eventName: String): this.type = js.native
  def unbind(eventName: String, callback: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  def unbind(eventName: String, callback: Null, context: js.Any): this.type = js.native
  def unbind(eventName: String, callback: EventCallback): this.type = js.native
  def unbind(eventName: String, callback: EventCallback, context: js.Any): this.type = js.native
  def unbind(eventName: Null, callback: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  def unbind(eventName: Null, callback: Null, context: js.Any): this.type = js.native
  def unbind(eventName: Null, callback: EventCallback): this.type = js.native
  def unbind(eventName: Null, callback: EventCallback, context: js.Any): this.type = js.native
  
  def unbind_all(): this.type = js.native
  
  def unbind_global(): this.type = js.native
  def unbind_global(callback: EventCallback): this.type = js.native
}
