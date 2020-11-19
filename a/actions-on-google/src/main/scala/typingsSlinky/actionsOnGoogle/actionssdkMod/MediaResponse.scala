package typingsSlinky.actionsOnGoogle.actionssdkMod

import typingsSlinky.actionsOnGoogle.responseMediaMod.MediaObjectString
import typingsSlinky.actionsOnGoogle.responseMediaMod.MediaResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/service/actionssdk", "MediaResponse")
@js.native
class MediaResponse protected ()
  extends typingsSlinky.actionsOnGoogle.conversationMod.MediaResponse {
  /**
    * @param objects MediaObjects
    * @public
    */
  def this(objects: MediaObjectString*) = this()
  /**
    * @param objects MediaObjects
    * @public
    */
  def this(objects: js.Array[MediaObjectString]) = this()
  /**
    * @param options MediaResponse options
    * @public
    */
  def this(options: MediaResponseOptions) = this()
}
