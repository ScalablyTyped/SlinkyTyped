package typingsSlinky.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Every Parse application installed on a device registered for
  * push notifications has an associated Installation object.
  */
@js.native
trait Installation[T /* <: Attributes */] extends Object[T] {
  
  var appIdentifier: String = js.native
  
  var appName: String = js.native
  
  var appVersion: String = js.native
  
  var badge: js.Any = js.native
  
  var channelUris: String = js.native
  
  var channels: js.Array[String] = js.native
  
  var deviceToken: String = js.native
  
  var deviceType: String = js.native
  
  var installationId: String = js.native
  
  var parseVersion: String = js.native
  
  var pushType: String = js.native
  
  var timeZone: js.Any = js.native
}
