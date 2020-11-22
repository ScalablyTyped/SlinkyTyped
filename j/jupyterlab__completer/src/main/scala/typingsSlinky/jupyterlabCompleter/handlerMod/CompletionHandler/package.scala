package typingsSlinky.jupyterlabCompleter.handlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object CompletionHandler {
  
  /**
    * Type alias for ICompletionItem list.
    * Implementers of this interface should be responsible for
    * deduping and sorting the items in the list.
    */
  type ICompletionItems = js.Array[typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler.ICompletionItem]
  
  type ICompletionItemsConnector = (typingsSlinky.jupyterlabStatedb.interfacesMod.IDataConnector[
    typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler.ICompletionItemsReply, 
    scala.Unit, 
    typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest, 
    java.lang.String
  ]) with typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler.ICompleterConnecterResponseType
}
