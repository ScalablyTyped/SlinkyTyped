package typingsSlinky.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SenderPlatform extends js.Object
@JSGlobal("chrome.cast.SenderPlatform")
@js.native
object SenderPlatform extends js.Object {
  
  @js.native
  sealed trait ANDROID extends SenderPlatform
  
  @js.native
  sealed trait CHROME extends SenderPlatform
  
  @js.native
  sealed trait IOS extends SenderPlatform
}
