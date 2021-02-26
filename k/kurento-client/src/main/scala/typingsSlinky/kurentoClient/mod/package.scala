package typingsSlinky.kurentoClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback[T] = js.Function2[/* error */ typingsSlinky.kurentoClient.mod.Error, /* result */ T, scala.Unit]
  
  // interface Endpoint extends MediaElement {}
  type Endpoint = typingsSlinky.kurentoClient.mod.MediaElement
  
  type Event[T /* <: java.lang.String */, E /* <: js.Object */] = typingsSlinky.kurentoClient.mod.BaseEvent[T] with E
  
  type MediaServer = typingsSlinky.kurentoClient.mod.ServerManager
  
  // interface SdpEndpoint extends SessionEndpoint {}
  type SdpEndpoint = typingsSlinky.kurentoClient.mod.SessionEndpoint
  
  // interface SessionEndpoint extends Endpoint {}
  type SessionEndpoint = typingsSlinky.kurentoClient.mod.Endpoint
}
