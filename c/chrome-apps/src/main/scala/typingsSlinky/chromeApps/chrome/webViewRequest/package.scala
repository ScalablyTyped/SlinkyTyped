package typingsSlinky.chromeApps.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object webViewRequest {
  
  type DeclarativeWebRequestConditionsList = typingsSlinky.chromeApps.chromeAppsStrings.declarativeContentDotPageStateMatcher
  
  /**
    * Fired when a message is sent via **declarativeWebRequest.SendMessageToExtension**
    * from an action of the declarative web request API.
    */
  type OnMessageEvent = typingsSlinky.chromeApps.chrome.events.Event[
    js.Function1[
      /* details */ typingsSlinky.chromeApps.chrome.webViewRequest.OnMessageEventDetails, 
      scala.Unit
    ]
  ]
  
  /** Supported conditions */
  type OnRequestConditions = typingsSlinky.chromeApps.chrome.webViewRequest.RequestMatcher
  
  /**
    * Description of a declarative rule for handling events.
    * With correct types for the onRequest event.
    */
  type OnRequestRule = typingsSlinky.chromeApps.chrome.events.Rule[
    typingsSlinky.chromeApps.chrome.webViewRequest.OnRequestConditions, 
    typingsSlinky.chromeApps.chrome.webViewRequest.OnRequestActions
  ]
}
