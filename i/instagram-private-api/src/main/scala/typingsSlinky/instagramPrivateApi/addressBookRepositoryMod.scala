package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.addressBookRepositoryLinkResponseMod.AddressBookRepositoryLinkResponseRootObject
import typingsSlinky.instagramPrivateApi.anon.Emailaddresses
import typingsSlinky.instagramPrivateApi.anon.Firstname
import typingsSlinky.instagramPrivateApi.commonTypesMod.IgAppModule
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import typingsSlinky.instagramPrivateApi.statusResponseMod.StatusResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/repositories/address-book.repository", JSImport.Namespace)
@js.native
object addressBookRepositoryMod extends js.Object {
  
  @js.native
  class AddressBookRepository () extends Repository {
    
    def acquireOwnerContacts(me: Firstname): js.Promise[StatusResponse] = js.native
    
    def link(contacts: js.Array[Emailaddresses]): js.Promise[AddressBookRepositoryLinkResponseRootObject] = js.native
    def link(contacts: js.Array[Emailaddresses], module: IgAppModule): js.Promise[AddressBookRepositoryLinkResponseRootObject] = js.native
  }
}
