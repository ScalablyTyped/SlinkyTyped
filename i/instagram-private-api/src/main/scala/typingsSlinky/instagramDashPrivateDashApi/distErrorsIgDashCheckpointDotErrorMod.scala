package typingsSlinky.instagramDashPrivateDashApi

import typingsSlinky.instagramDashPrivateDashApi.distErrorsIgDashResponseDotErrorMod.IgResponseError
import typingsSlinky.instagramDashPrivateDashApi.distResponsesCheckpointDotResponseMod.CheckpointResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/errors/ig-checkpoint.error", JSImport.Namespace)
@js.native
object distErrorsIgDashCheckpointDotErrorMod extends js.Object {
  @js.native
  class IgCheckpointError () extends IgResponseError[CheckpointResponse] {
    val apiUrl: String = js.native
    val url: String = js.native
  }
  
}

