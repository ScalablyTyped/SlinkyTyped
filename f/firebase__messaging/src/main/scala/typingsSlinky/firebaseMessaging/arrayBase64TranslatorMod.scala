package typingsSlinky.firebaseMessaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/messaging/dist/helpers/array-base64-translator", JSImport.Namespace)
@js.native
object arrayBase64TranslatorMod extends js.Object {
  
  def arrayToBase64(array: js.typedarray.ArrayBuffer): String = js.native
  def arrayToBase64(array: js.typedarray.Uint8Array): String = js.native
  
  def base64ToArray(base64String: String): js.typedarray.Uint8Array = js.native
}
