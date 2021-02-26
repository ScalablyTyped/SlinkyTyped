package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.checkpointResponseMod.CheckpointResponse
import typingsSlinky.instagramPrivateApi.commonTypesMod.IgResponse
import typingsSlinky.instagramPrivateApi.igResponseErrorMod.IgResponseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igCheckpointErrorMod {
  
  @JSImport("instagram-private-api/dist/errors/ig-checkpoint.error", "IgCheckpointError")
  @js.native
  class IgCheckpointError protected () extends IgResponseError[CheckpointResponse] {
    def this(response: IgResponse[CheckpointResponse]) = this()
    
    def apiUrl: String = js.native
    
    def url: String = js.native
  }
}
