package typingsSlinky.amqplib

import typingsSlinky.amqplib.amqplibBooleans.`false`
import typingsSlinky.amqplib.anon.Mechanism
import typingsSlinky.amqplib.anon.Password
import typingsSlinky.amqplib.propertiesMod.Message
import typingsSlinky.amqplib.propertiesMod.Options.Connect
import typingsSlinky.amqplib.propertiesMod.Options.DeleteExchange
import typingsSlinky.amqplib.propertiesMod.Options.Get
import typingsSlinky.amqplib.propertiesMod.Options.Publish
import typingsSlinky.amqplib.propertiesMod.Replies.AssertExchange
import typingsSlinky.amqplib.propertiesMod.Replies.AssertQueue
import typingsSlinky.amqplib.propertiesMod.Replies.Consume
import typingsSlinky.amqplib.propertiesMod.Replies.DeleteQueue
import typingsSlinky.amqplib.propertiesMod.Replies.Empty
import typingsSlinky.amqplib.propertiesMod.Replies.PurgeQueue
import typingsSlinky.amqplib.propertiesMod.ServerProperties
import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("amqplib/callback_api", JSImport.Namespace)
@js.native
object callbackApiMod extends js.Object {
  
  def connect(callback: js.Function2[/* err */ js.Any, /* connection */ Connection, Unit]): Unit = js.native
  def connect(url: String, callback: js.Function2[/* err */ js.Any, /* connection */ Connection, Unit]): Unit = js.native
  def connect(
    url: String,
    socketOptions: js.Any,
    callback: js.Function2[/* err */ js.Any, /* connection */ Connection, Unit]
  ): Unit = js.native
  def connect(url: Connect, callback: js.Function2[/* err */ js.Any, /* connection */ Connection, Unit]): Unit = js.native
  def connect(
    url: Connect,
    socketOptions: js.Any,
    callback: js.Function2[/* err */ js.Any, /* connection */ Connection, Unit]
  ): Unit = js.native
  
  @js.native
  trait Channel extends EventEmitter {
    
    def ack(message: Message): Unit = js.native
    def ack(message: Message, allUpTo: Boolean): Unit = js.native
    
    def ackAll(): Unit = js.native
    
    def assertExchange(exchange: String, `type`: String): Unit = js.native
    def assertExchange(
      exchange: String,
      `type`: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Any, /* ok */ AssertExchange, Unit]
    ): Unit = js.native
    def assertExchange(
      exchange: String,
      `type`: String,
      options: typingsSlinky.amqplib.propertiesMod.Options.AssertExchange
    ): Unit = js.native
    def assertExchange(
      exchange: String,
      `type`: String,
      options: typingsSlinky.amqplib.propertiesMod.Options.AssertExchange,
      callback: js.Function2[/* err */ js.Any, /* ok */ AssertExchange, Unit]
    ): Unit = js.native
    
    def assertQueue(): Unit = js.native
    def assertQueue(
      queue: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Any, /* ok */ AssertQueue, Unit]
    ): Unit = js.native
    def assertQueue(queue: js.UndefOr[scala.Nothing], options: typingsSlinky.amqplib.propertiesMod.Options.AssertQueue): Unit = js.native
    def assertQueue(
      queue: js.UndefOr[scala.Nothing],
      options: typingsSlinky.amqplib.propertiesMod.Options.AssertQueue,
      callback: js.Function2[/* err */ js.Any, /* ok */ AssertQueue, Unit]
    ): Unit = js.native
    def assertQueue(queue: String): Unit = js.native
    def assertQueue(
      queue: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Any, /* ok */ AssertQueue, Unit]
    ): Unit = js.native
    def assertQueue(queue: String, options: typingsSlinky.amqplib.propertiesMod.Options.AssertQueue): Unit = js.native
    def assertQueue(
      queue: String,
      options: typingsSlinky.amqplib.propertiesMod.Options.AssertQueue,
      callback: js.Function2[/* err */ js.Any, /* ok */ AssertQueue, Unit]
    ): Unit = js.native
    
    def bindExchange(destination: String, source: String, pattern: String): Unit = js.native
    def bindExchange(
      destination: String,
      source: String,
      pattern: String,
      args: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Unit = js.native
    def bindExchange(destination: String, source: String, pattern: String, args: js.Any): Unit = js.native
    def bindExchange(
      destination: String,
      source: String,
      pattern: String,
      args: js.Any,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Unit = js.native
    
    def bindQueue(queue: String, source: String, pattern: String): Unit = js.native
    def bindQueue(
      queue: String,
      source: String,
      pattern: String,
      args: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Unit = js.native
    def bindQueue(queue: String, source: String, pattern: String, args: js.Any): Unit = js.native
    def bindQueue(
      queue: String,
      source: String,
      pattern: String,
      args: js.Any,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Unit = js.native
    
    def cancel(consumerTag: String): Unit = js.native
    def cancel(consumerTag: String, callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]): Unit = js.native
    
    def checkExchange(exchange: String): Unit = js.native
    def checkExchange(exchange: String, callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]): Unit = js.native
    
    def checkQueue(queue: String): Unit = js.native
    def checkQueue(queue: String, callback: js.Function2[/* err */ js.Any, /* ok */ AssertQueue, Unit]): Unit = js.native
    
    def close(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    def consume(queue: String, onMessage: js.Function1[/* msg */ Message | Null, Unit]): Unit = js.native
    def consume(
      queue: String,
      onMessage: js.Function1[/* msg */ Message | Null, Unit],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Any, /* ok */ Consume, Unit]
    ): Unit = js.native
    def consume(
      queue: String,
      onMessage: js.Function1[/* msg */ Message | Null, Unit],
      options: typingsSlinky.amqplib.propertiesMod.Options.Consume
    ): Unit = js.native
    def consume(
      queue: String,
      onMessage: js.Function1[/* msg */ Message | Null, Unit],
      options: typingsSlinky.amqplib.propertiesMod.Options.Consume,
      callback: js.Function2[/* err */ js.Any, /* ok */ Consume, Unit]
    ): Unit = js.native
    
    def deleteExchange(exchange: String): Unit = js.native
    def deleteExchange(
      exchange: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Unit = js.native
    def deleteExchange(exchange: String, options: DeleteExchange): Unit = js.native
    def deleteExchange(
      exchange: String,
      options: DeleteExchange,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Unit = js.native
    
    def deleteQueue(queue: String): Unit = js.native
    def deleteQueue(
      queue: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Any, /* ok */ DeleteQueue, Unit]
    ): Unit = js.native
    def deleteQueue(queue: String, options: typingsSlinky.amqplib.propertiesMod.Options.DeleteQueue): Unit = js.native
    def deleteQueue(
      queue: String,
      options: typingsSlinky.amqplib.propertiesMod.Options.DeleteQueue,
      callback: js.Function2[/* err */ js.Any, /* ok */ DeleteQueue, Unit]
    ): Unit = js.native
    
    def get(queue: String): Unit = js.native
    def get(queue: String, options: Get): Unit = js.native
    @JSName("get")
    def get_false(
      queue: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Any, /* ok */ Message | `false`, Unit]
    ): Unit = js.native
    @JSName("get")
    def get_false(
      queue: String,
      options: Get,
      callback: js.Function2[/* err */ js.Any, /* ok */ Message | `false`, Unit]
    ): Unit = js.native
    
    def nack(message: Message): Unit = js.native
    def nack(message: Message, allUpTo: js.UndefOr[scala.Nothing], requeue: Boolean): Unit = js.native
    def nack(message: Message, allUpTo: Boolean): Unit = js.native
    def nack(message: Message, allUpTo: Boolean, requeue: Boolean): Unit = js.native
    
    def nackAll(): Unit = js.native
    def nackAll(requeue: Boolean): Unit = js.native
    
    def prefetch(count: Double): Unit = js.native
    def prefetch(count: Double, global: Boolean): Unit = js.native
    
    def publish(exchange: String, routingKey: String, content: Buffer): Boolean = js.native
    def publish(exchange: String, routingKey: String, content: Buffer, options: Publish): Boolean = js.native
    
    def purgeQueue(queue: String): Unit = js.native
    def purgeQueue(queue: String, callback: js.Function2[/* err */ js.Any, /* ok */ PurgeQueue, Unit]): Unit = js.native
    
    def recover(): Unit = js.native
    def recover(callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]): Unit = js.native
    
    def reject(message: Message): Unit = js.native
    def reject(message: Message, requeue: Boolean): Unit = js.native
    
    def sendToQueue(queue: String, content: Buffer): Boolean = js.native
    def sendToQueue(queue: String, content: Buffer, options: Publish): Boolean = js.native
    
    def unbindExchange(destination: String, source: String, pattern: String): Unit = js.native
    def unbindExchange(
      destination: String,
      source: String,
      pattern: String,
      args: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Unit = js.native
    def unbindExchange(destination: String, source: String, pattern: String, args: js.Any): Unit = js.native
    def unbindExchange(
      destination: String,
      source: String,
      pattern: String,
      args: js.Any,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Unit = js.native
    
    def unbindQueue(queue: String, source: String, pattern: String): Unit = js.native
    def unbindQueue(
      queue: String,
      source: String,
      pattern: String,
      args: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Unit = js.native
    def unbindQueue(queue: String, source: String, pattern: String, args: js.Any): Unit = js.native
    def unbindQueue(
      queue: String,
      source: String,
      pattern: String,
      args: js.Any,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait ConfirmChannel extends Channel {
    
    def publish(
      exchange: String,
      routingKey: String,
      content: Buffer,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Boolean = js.native
    def publish(
      exchange: String,
      routingKey: String,
      content: Buffer,
      options: Publish,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Boolean = js.native
    
    def sendToQueue(
      queue: String,
      content: Buffer,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Boolean = js.native
    def sendToQueue(
      queue: String,
      content: Buffer,
      options: Publish,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): Boolean = js.native
    
    def waitForConfirms(): Unit = js.native
    def waitForConfirms(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  }
  
  @js.native
  trait Connection extends EventEmitter {
    
    def close(): Unit = js.native
    def close(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    def createChannel(callback: js.Function2[/* err */ js.Any, /* channel */ Channel, Unit]): Unit = js.native
    
    def createConfirmChannel(callback: js.Function2[/* err */ js.Any, /* confirmChannel */ ConfirmChannel, Unit]): Unit = js.native
    
    var serverProperties: ServerProperties = js.native
  }
  
  @js.native
  object credentials extends js.Object {
    
    def external(): Mechanism = js.native
    
    def plain(username: String, password: String): Password = js.native
  }
}
