package typingsSlinky.amqp.mod

import typingsSlinky.amqp.amqpStrings.ack
import typingsSlinky.amqp.amqpStrings.error
import typingsSlinky.amqp.amqpStrings.exchangeBindOk
import typingsSlinky.amqp.amqpStrings.exchangeUnbindOk
import typingsSlinky.amqp.amqpStrings.open
import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AMQPExchange extends EventEmitter {
  
  def bind(sourceExchange: String, routingKey: String): Unit = js.native
  def bind(sourceExchange: String, routingKey: String, callback: Callback[Unit]): Unit = js.native
  
  def bind_headers(exchange: String, routing: String): Unit = js.native
  def bind_headers(exchange: String, routing: String, callback: Callback[Unit]): Unit = js.native
  
  /**
    * ifUnused default: true
    *
    * Deletes an exchange.
    *
    * If the optional boolean second argument is set, the server will only delete the exchange if it has no queue bindings.
    *
    * If the exchange has queue bindings the server does not delete it but raises a channel exception instead
    */
  def destroy(ifUnused: Boolean): Unit = js.native
  
  @JSName("on")
  def on_ack(event: ack, callback: Callback[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, callback: Callback[Unit]): this.type = js.native
  @JSName("on")
  def on_exchangeBindOk(event: exchangeBindOk, callback: Callback[Unit]): this.type = js.native
  @JSName("on")
  def on_exchangeUnbindOk(event: exchangeUnbindOk, callback: Callback[Unit]): this.type = js.native
  @JSName("on")
  def on_open(event: open, callback: Callback[Unit]): this.type = js.native
  
  def publish(
    routingKey: String,
    message: js.Object,
    callback: js.Function2[/* err */ js.UndefOr[Boolean], /* msg */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def publish(routingKey: String, message: js.Object, options: ExchangePublishOptions): Unit = js.native
  def publish(
    routingKey: String,
    message: js.Object,
    options: ExchangePublishOptions,
    callback: js.Function2[/* err */ js.UndefOr[Boolean], /* msg */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def publish(
    routingKey: String,
    message: Buffer,
    callback: js.Function2[/* err */ js.UndefOr[Boolean], /* msg */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def publish(routingKey: String, message: Buffer, options: ExchangePublishOptions): Unit = js.native
  def publish(
    routingKey: String,
    message: Buffer,
    options: ExchangePublishOptions,
    callback: js.Function2[/* err */ js.UndefOr[Boolean], /* msg */ js.UndefOr[String], Unit]
  ): Unit = js.native
  
  def unbind(sourceExchange: String, routingKey: String): Unit = js.native
  def unbind(sourceExchange: String, routingKey: String, callback: Callback[Unit]): Unit = js.native
}
