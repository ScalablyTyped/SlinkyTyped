package typingsSlinky.jssip

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EventHandler[T] = js.Function1[/* e */ T, scala.Unit]
  
  type SessionCreateAnswerFailedEvent = typingsSlinky.std.DOMError
  
  type SessionCreateOfferFailedEvent = typingsSlinky.std.DOMError
  
  type SessionSetLocalDescriptionFailedEvent = typingsSlinky.std.DOMError
  
  type SessionSetRemoteDescriptionFailedEvent = typingsSlinky.std.DOMError
  
  type SessionUserMediaFailedEvent = typingsSlinky.std.DOMError
  
  @scala.inline
  def debug(namespace: java.lang.String): js.Any = typingsSlinky.jssip.mod.^.asInstanceOf[js.Dynamic].applyDynamic("debug")(namespace.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def name: java.lang.String = typingsSlinky.jssip.mod.^.asInstanceOf[js.Dynamic].selectDynamic("name").asInstanceOf[java.lang.String]
  
  @scala.inline
  def version: java.lang.String = typingsSlinky.jssip.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
