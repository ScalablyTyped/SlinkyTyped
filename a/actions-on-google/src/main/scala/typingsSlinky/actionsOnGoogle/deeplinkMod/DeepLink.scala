package typingsSlinky.actionsOnGoogle.deeplinkMod

import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotLINK
import typingsSlinky.actionsOnGoogle.helperHelperMod.Helper
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2LinkValueSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/deeplink", "DeepLink")
@js.native
class DeepLink protected () extends Helper[actionsDotintentDotLINK, GoogleActionsV2LinkValueSpec] {
  /**
    * @param options DeepLink options
    * @deprecated
    * @public
    */
  def this(options: DeepLinkOptions) = this()
}
