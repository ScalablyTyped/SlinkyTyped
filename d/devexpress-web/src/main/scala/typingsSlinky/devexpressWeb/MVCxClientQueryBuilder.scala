package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side counterpart of the Query Builder extension.
  */
@js.native
trait MVCxClientQueryBuilder extends ASPxClientQueryBuilder {
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientQueryBuilder: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientQueryBuilder]] = js.native
  
  /**
    * Sends a callback to the server and generates the server-side event passing it the specified argument.
    * @param arg A string value that represents any information that needs to be sent to the server-side event.
    */
  def PerformCallback(arg: js.Any): Unit = js.native
  
  /**
    * Occurs after executing the Save command on the client.
    */
  var SaveCommandExecuted: ASPxClientEvent[MVCxClientQueryBuilderSaveCommandExecutedEventHandler[MVCxClientQueryBuilder]] = js.native
}
