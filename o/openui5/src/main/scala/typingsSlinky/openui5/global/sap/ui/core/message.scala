package typingsSlinky.openui5.global.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object message {
  
  @JSGlobal("sap.ui.core.message.ControlMessageProcessor")
  @js.native
  /**
    * Constructor for a new ControlMessageProcessor
    */
  class ControlMessageProcessor ()
    extends typingsSlinky.openui5.sap.ui.core.message.ControlMessageProcessor
  
  @JSGlobal("sap.ui.core.message.Message")
  @js.native
  class Message protected ()
    extends typingsSlinky.openui5.sap.ui.core.message.Message {
    /**
      * Constructor for a new Message.
      * @param mParameters (optional) a map which contains the following parameter properties:
      */
    def this(mParameters: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.core.message.MessageManager")
  @js.native
  /**
    * Constructor for a new MessageManager.
    */
  class MessageManager ()
    extends typingsSlinky.openui5.sap.ui.core.message.MessageManager
  
  @JSGlobal("sap.ui.core.message.MessageParser")
  @js.native
  /**
    * Abstract MessageParser class to be inherited in back-end specific implementations.
    */
  abstract class MessageParser ()
    extends typingsSlinky.openui5.sap.ui.core.message.MessageParser
  
  @JSGlobal("sap.ui.core.message.MessageProcessor")
  @js.native
  /**
    * Constructor for a new MessageProcessor
    */
  abstract class MessageProcessor ()
    extends typingsSlinky.openui5.sap.ui.core.message.MessageProcessor
}
