package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.igClientErrorMod.IgClientError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/errors/ig-network.error", JSImport.Namespace)
@js.native
object igNetworkErrorMod extends js.Object {
  @js.native
  class IgNetworkError protected () extends IgClientError {
    def this(e: js.Error) = this()
  }
  
}

