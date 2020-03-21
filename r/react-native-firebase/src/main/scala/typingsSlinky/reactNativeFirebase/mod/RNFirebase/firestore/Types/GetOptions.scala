package typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore.Types

import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.cache
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.default
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOptions extends js.Object {
  var source: default | server | cache
}

object GetOptions {
  @scala.inline
  def apply(source: default | server | cache): GetOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetOptions]
  }
}

