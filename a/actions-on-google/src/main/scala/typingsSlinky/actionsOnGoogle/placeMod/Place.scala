package typingsSlinky.actionsOnGoogle.placeMod

import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotPLACE
import typingsSlinky.actionsOnGoogle.helperHelperMod.Helper
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2PlaceValueSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/place", "Place")
@js.native
class Place protected () extends Helper[actionsDotintentDotPLACE, GoogleActionsV2PlaceValueSpec] {
  /**
    * @param options Place options
    * @public
    */
  def this(options: PlaceOptions) = this()
}
