package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityMod {
  
  @JSImport("instagram-private-api/dist/core/entity", "Entity")
  @js.native
  abstract class Entity protected () extends Repository {
    def this(client: IgApiClient) = this()
  }
}
