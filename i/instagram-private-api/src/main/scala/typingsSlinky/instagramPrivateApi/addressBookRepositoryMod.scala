package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.addressBookRepositoryLinkResponseMod.AddressBookRepositoryLinkResponseRootObject
import typingsSlinky.instagramPrivateApi.anon.Emailaddresses
import typingsSlinky.instagramPrivateApi.anon.Firstname
import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.commonTypesMod.IgAppModule
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import typingsSlinky.instagramPrivateApi.statusResponseMod.StatusResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressBookRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/address-book.repository", "AddressBookRepository")
  @js.native
  class AddressBookRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def acquireOwnerContacts(me: Firstname): js.Promise[StatusResponse] = js.native
    
    def link(contacts: js.Array[Emailaddresses]): js.Promise[AddressBookRepositoryLinkResponseRootObject] = js.native
    def link(contacts: js.Array[Emailaddresses], module: IgAppModule): js.Promise[AddressBookRepositoryLinkResponseRootObject] = js.native
  }
}
