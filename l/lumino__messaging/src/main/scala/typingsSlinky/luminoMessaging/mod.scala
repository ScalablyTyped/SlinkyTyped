package typingsSlinky.luminoMessaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lumino/messaging", "ConflatableMessage")
  @js.native
  class ConflatableMessage protected () extends Message {
    /**
      * Construct a new message.
      *
      * @param type - The type of the message.
      */
    def this(`type`: String) = this()
    
    /**
      * Conflate this message with another message of the same `type`.
      *
      * #### Notes
      * This method always returns `true`.
      */
    def conflate(other: ConflatableMessage): Boolean = js.native
  }
  
  @JSImport("@lumino/messaging", "Message")
  @js.native
  class Message protected () extends StObject {
    /**
      * Construct a new message.
      *
      * @param type - The type of the message.
      */
    def this(`type`: String) = this()
    
    /**
      * Conflate this message with another message of the same `type`.
      *
      * @param other - A conflatable message of the same `type`.
      *
      * @returns `true` if the message was successfully conflated, or
      *   `false` otherwise.
      *
      * #### Notes
      * Message conflation is an advanced topic. Most message types will
      * not make use of this feature.
      *
      * This method is called automatically by the message loop when the
      * given message is posted to the handler paired with this message.
      * This message will already be enqueued and conflatable, and the
      * given message will have the same `type` and also be conflatable.
      *
      * This method should merge the state of the other message into this
      * message as needed so that when this message is finally delivered
      * to the handler, it receives the most up-to-date information.
      *
      * If this method returns `true`, it signals that the other message
      * was successfully conflated and that message will not be enqueued.
      *
      * If this method returns `false`, the other message will be enqueued
      * for normal delivery.
      *
      * Custom message types may reimplement this method.
      *
      * The default implementation always returns `false`.
      */
    def conflate(other: Message): Boolean = js.native
    
    /**
      * Test whether the message is conflatable.
      *
      * #### Notes
      * Message conflation is an advanced topic. Most message types will
      * not make use of this feature.
      *
      * If a conflatable message is posted to a handler while another
      * conflatable message of the same `type` has already been posted
      * to the handler, the `conflate()` method of the existing message
      * will be invoked. If that method returns `true`, the new message
      * will not be enqueued. This allows messages to be compressed, so
      * that only a single instance of the message type is processed per
      * cycle, no matter how many times messages of that type are posted.
      *
      * Custom message types may reimplement this property.
      *
      * The default implementation is always `false`.
      */
    val isConflatable: Boolean = js.native
    
    /**
      * The type of the message.
      *
      * #### Notes
      * The `type` of a message should be related directly to its actual
      * runtime type. This means that `type` can and will be used to cast
      * the message to the relevant derived `Message` subtype.
      */
    val `type`: String = js.native
  }
  
  object MessageLoop {
    
    /**
      * Clear all message data associated with a message handler.
      *
      * @param handler - The message handler of interest.
      *
      * #### Notes
      * This will clear all posted messages and hooks for the handler.
      */
    @JSImport("@lumino/messaging", "MessageLoop.clearData")
    @js.native
    def clearData(handler: IMessageHandler): Unit = js.native
    
    /**
      * Process the pending posted messages in the queue immediately.
      *
      * #### Notes
      * This function is useful when posted messages must be processed
      * immediately, instead of on the next animation frame.
      *
      * This function should normally not be needed, but it may be
      * required to work around certain browser idiosyncrasies.
      *
      * Recursing into this function is a no-op.
      */
    @JSImport("@lumino/messaging", "MessageLoop.flush")
    @js.native
    def flush(): Unit = js.native
    
    /**
      * Get the message loop exception handler.
      *
      * @returns The current exception handler.
      *
      * #### Notes
      * The default exception handler is `console.error`.
      */
    @JSImport("@lumino/messaging", "MessageLoop.getExceptionHandler")
    @js.native
    def getExceptionHandler(): ExceptionHandler = js.native
    
    /**
      * Install a message hook for a message handler.
      *
      * @param handler - The message handler of interest.
      *
      * @param hook - The message hook to install.
      *
      * #### Notes
      * A message hook is invoked before a message is delivered to the
      * handler. If the hook returns `false`, no other hooks will be
      * invoked and the message will not be delivered to the handler.
      *
      * The most recently installed message hook is executed first.
      *
      * If the hook is already installed, this is a no-op.
      */
    @JSImport("@lumino/messaging", "MessageLoop.installMessageHook")
    @js.native
    def installMessageHook(handler: IMessageHandler, hook: MessageHook): Unit = js.native
    
    /**
      * Post a message to a message handler to process in the future.
      *
      * @param handler - The handler which should process the message.
      *
      * @param msg - The message to post to the handler.
      *
      * #### Notes
      * The message will be conflated with the pending posted messages for
      * the handler, if possible. If the message is not conflated, it will
      * be queued for normal delivery on the next cycle of the event loop.
      *
      * Exceptions in hooks and handlers will be caught and logged.
      */
    @JSImport("@lumino/messaging", "MessageLoop.postMessage")
    @js.native
    def postMessage(handler: IMessageHandler, msg: Message): Unit = js.native
    
    /**
      * Remove an installed message hook for a message handler.
      *
      * @param handler - The message handler of interest.
      *
      * @param hook - The message hook to remove.
      *
      * #### Notes
      * It is safe to call this function while the hook is executing.
      *
      * If the hook is not installed, this is a no-op.
      */
    @JSImport("@lumino/messaging", "MessageLoop.removeMessageHook")
    @js.native
    def removeMessageHook(handler: IMessageHandler, hook: MessageHook): Unit = js.native
    
    /**
      * Send a message to a message handler to process immediately.
      *
      * @param handler - The handler which should process the message.
      *
      * @param msg - The message to deliver to the handler.
      *
      * #### Notes
      * The message will first be sent through any installed message hooks
      * for the handler. If the message passes all hooks, it will then be
      * delivered to the `processMessage` method of the handler.
      *
      * The message will not be conflated with pending posted messages.
      *
      * Exceptions in hooks and handlers will be caught and logged.
      */
    @JSImport("@lumino/messaging", "MessageLoop.sendMessage")
    @js.native
    def sendMessage(handler: IMessageHandler, msg: Message): Unit = js.native
    
    /**
      * Set the message loop exception handler.
      *
      * @param handler - The function to use as the exception handler.
      *
      * @returns The old exception handler.
      *
      * #### Notes
      * The exception handler is invoked when a message handler or a
      * message hook throws an exception.
      */
    @JSImport("@lumino/messaging", "MessageLoop.setExceptionHandler")
    @js.native
    def setExceptionHandler(handler: ExceptionHandler): ExceptionHandler = js.native
    
    /**
      * A type alias for the exception handler function.
      */
    type ExceptionHandler = js.Function1[/* err */ js.Error, Unit]
  }
  
  @js.native
  trait IMessageHandler extends StObject {
    
    /**
      * Process a message sent to the handler.
      *
      * @param msg - The message to be processed.
      */
    def processMessage(msg: Message): Unit = js.native
  }
  object IMessageHandler {
    
    @scala.inline
    def apply(processMessage: Message => Unit): IMessageHandler = {
      val __obj = js.Dynamic.literal(processMessage = js.Any.fromFunction1(processMessage))
      __obj.asInstanceOf[IMessageHandler]
    }
    
    @scala.inline
    implicit class IMessageHandlerMutableBuilder[Self <: IMessageHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProcessMessage(value: Message => Unit): Self = StObject.set(x, "processMessage", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IMessageHook extends StObject {
    
    /**
      * Intercept a message sent to a message handler.
      *
      * @param handler - The target handler of the message.
      *
      * @param msg - The message to be sent to the handler.
      *
      * @returns `true` if the message should continue to be processed
      *   as normal, or `false` if processing should cease immediately.
      */
    def messageHook(handler: IMessageHandler, msg: Message): Boolean = js.native
  }
  object IMessageHook {
    
    @scala.inline
    def apply(messageHook: (IMessageHandler, Message) => Boolean): IMessageHook = {
      val __obj = js.Dynamic.literal(messageHook = js.Any.fromFunction2(messageHook))
      __obj.asInstanceOf[IMessageHook]
    }
    
    @scala.inline
    implicit class IMessageHookMutableBuilder[Self <: IMessageHook] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessageHook(value: (IMessageHandler, Message) => Boolean): Self = StObject.set(x, "messageHook", js.Any.fromFunction2(value))
    }
  }
  
  type MessageHook = IMessageHook | (js.Function2[/* handler */ IMessageHandler, /* msg */ Message, Boolean])
}
