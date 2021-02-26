package typingsSlinky.babylonjs.global.BABYLON

import org.scalajs.dom.raw.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebRequest")
@js.native
class WebRequest ()
  extends typingsSlinky.babylonjs.BABYLON.WebRequest
/* static members */
object WebRequest {
  
  @JSGlobal("BABYLON.WebRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Custom HTTP Request Headers to be sent with XMLHttpRequests
    * i.e. when loading files, where the server/service expects an Authorization header
    */
  @JSGlobal("BABYLON.WebRequest.CustomRequestHeaders")
  @js.native
  def CustomRequestHeaders: org.scalablytyped.runtime.StringDictionary[String] = js.native
  @scala.inline
  def CustomRequestHeaders_=(x: org.scalablytyped.runtime.StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CustomRequestHeaders")(x.asInstanceOf[js.Any])
  
  /**
    * Add callback functions in this array to update all the requests before they get sent to the network
    */
  @JSGlobal("BABYLON.WebRequest.CustomRequestModifiers")
  @js.native
  def CustomRequestModifiers: js.Array[js.Function2[/* request */ XMLHttpRequest, /* url */ String, Unit]] = js.native
  @scala.inline
  def CustomRequestModifiers_=(x: js.Array[js.Function2[/* request */ XMLHttpRequest, /* url */ String, Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CustomRequestModifiers")(x.asInstanceOf[js.Any])
}
