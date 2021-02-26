package typingsSlinky.mongodbQueue

import typingsSlinky.mongodb.mod.Db
import typingsSlinky.mongodb.mod.MongoError
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mongodb-queue", JSImport.Namespace)
  @js.native
  def apply(db: Db, name: String): Queue = js.native
  @JSImport("mongodb-queue", JSImport.Namespace)
  @js.native
  def apply(db: Db, name: String, opts: QueueOptions): Queue = js.native
  
  @JSImport("mongodb-queue", "Queue")
  @js.native
  class Queue protected () extends StObject {
    def this(db: Db, name: String) = this()
    def this(db: Db, name: String, opts: QueueOptions) = this()
    
    def ack(ack: String, callback: QueueCallback[String]): Unit = js.native
    
    def add(payload: ArrayPayload, callback: QueueCallback[js.Array[String]]): Unit = js.native
    def add(payload: ArrayPayload, opts: QueueOptions, callback: QueueCallback[js.Array[String]]): Unit = js.native
    def add(payload: Payload, callback: QueueCallback[String]): Unit = js.native
    def add(payload: Payload, opts: QueueOptions, callback: QueueCallback[String]): Unit = js.native
    
    def clean(callback: QueueCallback[_]): Unit = js.native
    
    def createIndexes(callback: QueueCallback[String]): Unit = js.native
    
    def done(callback: QueueCallback[Double]): Unit = js.native
    
    def get(callback: QueueCallback[js.UndefOr[QueueMessage]]): Unit = js.native
    def get(opts: QueueOptions, callback: QueueCallback[js.UndefOr[QueueMessage]]): Unit = js.native
    
    def inflight(callback: QueueCallback[Double]): Unit = js.native
    
    def ping(ack: String, callback: QueueCallback[String]): Unit = js.native
    def ping(ack: String, opts: QueueOptions, callback: QueueCallback[String]): Unit = js.native
    
    def size(callback: QueueCallback[Double]): Unit = js.native
    
    def total(callback: QueueCallback[Double]): Unit = js.native
  }
  
  type ArrayPayload = js.Array[String | (Record[String, js.Any])]
  
  type Payload = String | (Record[String, js.Any])
  
  type QueueCallback[T] = js.Function2[/* err */ MongoError | js.Error, /* result */ T, Unit]
  
  @js.native
  trait QueueMessage extends StObject {
    
    var ack: String = js.native
    
    var id: String = js.native
    
    var payload: Payload | ArrayPayload = js.native
    
    var tries: Double = js.native
  }
  object QueueMessage {
    
    @scala.inline
    def apply(ack: String, id: String, payload: Payload | ArrayPayload, tries: Double): QueueMessage = {
      val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], tries = tries.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueMessage]
    }
    
    @scala.inline
    implicit class QueueMessageMutableBuilder[Self <: QueueMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAck(value: String): Self = StObject.set(x, "ack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: Payload | ArrayPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadVarargs(value: (String | (Record[String, js.Any]))*): Self = StObject.set(x, "payload", js.Array(value :_*))
      
      @scala.inline
      def setTries(value: Double): Self = StObject.set(x, "tries", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QueueOptions extends StObject {
    
    var deadQueue: js.UndefOr[Queue] = js.native
    
    var delay: js.UndefOr[Double] = js.native
    
    var maxRetries: js.UndefOr[Double] = js.native
    
    var visibility: js.UndefOr[Double] = js.native
  }
  object QueueOptions {
    
    @scala.inline
    def apply(): QueueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueueOptions]
    }
    
    @scala.inline
    implicit class QueueOptionsMutableBuilder[Self <: QueueOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeadQueue(value: Queue): Self = StObject.set(x, "deadQueue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeadQueueUndefined: Self = StObject.set(x, "deadQueue", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setVisibility(value: Double): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    }
  }
}
