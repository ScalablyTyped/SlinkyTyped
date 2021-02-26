package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.entitiesMod.DirectThreadEntity
import typingsSlinky.instagramPrivateApi.entitiesMod.ProfileEntity
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityFactoryMod {
  
  @JSImport("instagram-private-api/dist/core/entity.factory", "EntityFactory")
  @js.native
  class EntityFactory protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def directThread(id: String): DirectThreadEntity = js.native
    def directThread(id: js.Array[String]): DirectThreadEntity = js.native
    
    def profile(pk: String): ProfileEntity = js.native
  }
}
