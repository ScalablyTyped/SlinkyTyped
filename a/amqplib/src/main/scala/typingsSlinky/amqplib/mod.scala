package typingsSlinky.amqplib

import typingsSlinky.amqplib.amqplibBooleans.`false`
import typingsSlinky.amqplib.amqplibStrings.`match`
import typingsSlinky.amqplib.amqplibStrings.direct
import typingsSlinky.amqplib.amqplibStrings.fanout
import typingsSlinky.amqplib.amqplibStrings.headers
import typingsSlinky.amqplib.amqplibStrings.topic
import typingsSlinky.amqplib.anon.Mechanism
import typingsSlinky.amqplib.anon.Password
import typingsSlinky.amqplib.propertiesMod.ConsumeMessage
import typingsSlinky.amqplib.propertiesMod.GetMessage
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
import typingsSlinky.bluebird.mod.^
import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("amqplib", "connect")
  @js.native
  def connect(url: String): ^[Connection] = js.native
  @JSImport("amqplib", "connect")
  @js.native
  def connect(url: String, socketOptions: js.Any): ^[Connection] = js.native
  @JSImport("amqplib", "connect")
  @js.native
  def connect(url: Connect): ^[Connection] = js.native
  @JSImport("amqplib", "connect")
  @js.native
  def connect(url: Connect, socketOptions: js.Any): ^[Connection] = js.native
  
  object credentials {
    
    @JSImport("amqplib", "credentials.external")
    @js.native
    def external(): Mechanism = js.native
    
    @JSImport("amqplib", "credentials.plain")
    @js.native
    def plain(username: String, password: String): Password = js.native
  }
  
  @js.native
  trait Channel extends EventEmitter {
    
    def ack(message: Message): Unit = js.native
    def ack(message: Message, allUpTo: Boolean): Unit = js.native
    
    def ackAll(): Unit = js.native
    
    def assertExchange(exchange: String, `type`: String): ^[AssertExchange] = js.native
    def assertExchange(
      exchange: String,
      `type`: String,
      options: typingsSlinky.amqplib.propertiesMod.Options.AssertExchange
    ): ^[AssertExchange] = js.native
    @JSName("assertExchange")
    def assertExchange_direct(exchange: String, `type`: direct): ^[AssertExchange] = js.native
    @JSName("assertExchange")
    def assertExchange_direct(
      exchange: String,
      `type`: direct,
      options: typingsSlinky.amqplib.propertiesMod.Options.AssertExchange
    ): ^[AssertExchange] = js.native
    @JSName("assertExchange")
    def assertExchange_fanout(exchange: String, `type`: fanout): ^[AssertExchange] = js.native
    @JSName("assertExchange")
    def assertExchange_fanout(
      exchange: String,
      `type`: fanout,
      options: typingsSlinky.amqplib.propertiesMod.Options.AssertExchange
    ): ^[AssertExchange] = js.native
    @JSName("assertExchange")
    def assertExchange_headers(exchange: String, `type`: headers): ^[AssertExchange] = js.native
    @JSName("assertExchange")
    def assertExchange_headers(
      exchange: String,
      `type`: headers,
      options: typingsSlinky.amqplib.propertiesMod.Options.AssertExchange
    ): ^[AssertExchange] = js.native
    @JSName("assertExchange")
    def assertExchange_match(exchange: String, `type`: `match`): ^[AssertExchange] = js.native
    @JSName("assertExchange")
    def assertExchange_match(
      exchange: String,
      `type`: `match`,
      options: typingsSlinky.amqplib.propertiesMod.Options.AssertExchange
    ): ^[AssertExchange] = js.native
    @JSName("assertExchange")
    def assertExchange_topic(exchange: String, `type`: topic): ^[AssertExchange] = js.native
    @JSName("assertExchange")
    def assertExchange_topic(
      exchange: String,
      `type`: topic,
      options: typingsSlinky.amqplib.propertiesMod.Options.AssertExchange
    ): ^[AssertExchange] = js.native
    
    def assertQueue(queue: String): ^[AssertQueue] = js.native
    def assertQueue(queue: String, options: typingsSlinky.amqplib.propertiesMod.Options.AssertQueue): ^[AssertQueue] = js.native
    
    def bindExchange(destination: String, source: String, pattern: String): ^[Empty] = js.native
    def bindExchange(destination: String, source: String, pattern: String, args: js.Any): ^[Empty] = js.native
    
    def bindQueue(queue: String, source: String, pattern: String): ^[Empty] = js.native
    def bindQueue(queue: String, source: String, pattern: String, args: js.Any): ^[Empty] = js.native
    
    def cancel(consumerTag: String): ^[Empty] = js.native
    
    def checkExchange(exchange: String): ^[Empty] = js.native
    
    def checkQueue(queue: String): ^[AssertQueue] = js.native
    
    def close(): ^[Unit] = js.native
    
    def consume(queue: String, onMessage: js.Function1[/* msg */ ConsumeMessage | Null, Unit]): ^[Consume] = js.native
    def consume(
      queue: String,
      onMessage: js.Function1[/* msg */ ConsumeMessage | Null, Unit],
      options: typingsSlinky.amqplib.propertiesMod.Options.Consume
    ): ^[Consume] = js.native
    
    def deleteExchange(exchange: String): ^[Empty] = js.native
    def deleteExchange(exchange: String, options: DeleteExchange): ^[Empty] = js.native
    
    def deleteQueue(queue: String): ^[DeleteQueue] = js.native
    def deleteQueue(queue: String, options: typingsSlinky.amqplib.propertiesMod.Options.DeleteQueue): ^[DeleteQueue] = js.native
    
    def get(queue: String): ^[GetMessage | `false`] = js.native
    def get(queue: String, options: Get): ^[GetMessage | `false`] = js.native
    
    def nack(message: Message): Unit = js.native
    def nack(message: Message, allUpTo: js.UndefOr[scala.Nothing], requeue: Boolean): Unit = js.native
    def nack(message: Message, allUpTo: Boolean): Unit = js.native
    def nack(message: Message, allUpTo: Boolean, requeue: Boolean): Unit = js.native
    
    def nackAll(): Unit = js.native
    def nackAll(requeue: Boolean): Unit = js.native
    
    def prefetch(count: Double): ^[Empty] = js.native
    def prefetch(count: Double, global: Boolean): ^[Empty] = js.native
    
    def publish(exchange: String, routingKey: String, content: Buffer): Boolean = js.native
    def publish(exchange: String, routingKey: String, content: Buffer, options: Publish): Boolean = js.native
    
    def purgeQueue(queue: String): ^[PurgeQueue] = js.native
    
    def recover(): ^[Empty] = js.native
    
    def reject(message: Message): Unit = js.native
    def reject(message: Message, requeue: Boolean): Unit = js.native
    
    def sendToQueue(queue: String, content: Buffer): Boolean = js.native
    def sendToQueue(queue: String, content: Buffer, options: Publish): Boolean = js.native
    
    def unbindExchange(destination: String, source: String, pattern: String): ^[Empty] = js.native
    def unbindExchange(destination: String, source: String, pattern: String, args: js.Any): ^[Empty] = js.native
    
    def unbindQueue(queue: String, source: String, pattern: String): ^[Empty] = js.native
    def unbindQueue(queue: String, source: String, pattern: String, args: js.Any): ^[Empty] = js.native
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
    
    def waitForConfirms(): ^[Unit] = js.native
  }
  
  @js.native
  trait Connection extends EventEmitter {
    
    def close(): ^[Unit] = js.native
    
    def createChannel(): ^[Channel] = js.native
    
    def createConfirmChannel(): ^[ConfirmChannel] = js.native
    
    var serverProperties: ServerProperties = js.native
  }
}
