package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loginWithAmazonSdkBrowser {
  type AuthorizeScope = typingsSlinky.loginWithAmazonSdkBrowser.AuthorizationScopeOptions | js.Array[typingsSlinky.loginWithAmazonSdkBrowser.AuthorizationScopeOptions]
  /**
    * Type of callback invoked after `authorize` completes.
    */
  type NextCallback[T /* <: typingsSlinky.loginWithAmazonSdkBrowser.AuthorizeRequest */] = js.Function1[/* response */ T, scala.Unit]
  type RetrieveProfileCallback = js.Function1[
    /* response */ typingsSlinky.loginWithAmazonSdkBrowser.RetrieveProfileResponse, 
    scala.Unit
  ]
}
