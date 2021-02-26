package typingsSlinky.commangular

import typingsSlinky.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Extending the angular rootScope to include the dispatch function in all scopes.
  */
object angular {
  
  @js.native
  trait IRootScopeService extends StObject {
    
    /**
      * Commangular method to execute a command.
      * @param eventName Name of the even that will trigger a command sequence
      * @param data Data of any type that will be passed to the command.
      */
    def dispatch(eventName: String): IPromise[_] = js.native
    def dispatch(eventName: String, data: js.Any): IPromise[_] = js.native
  }
}
