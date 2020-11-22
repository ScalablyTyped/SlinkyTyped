package typingsSlinky.maximMazurokGapiClientBooks

import typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books.BookshelvesResource
import typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books.CloudloadingResource
import typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books.DictionaryResource
import typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books.FamilysharingResource
import typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books.LayersResource
import typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books.MyconfigResource
import typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books.MylibraryResource
import typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books.NotificationResource
import typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books.OnboardingResource
import typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books.PersonalizedstreamResource
import typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books.PromoofferResource
import typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books.SeriesResource
import typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books.VolumesResource
import typingsSlinky.maximMazurokGapiClientBooks.maximMazurokGapiClientBooksStrings.books
import typingsSlinky.maximMazurokGapiClientBooks.maximMazurokGapiClientBooksStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Books API v1 */
      def load(name: books, version: v1): js.Thenable[Unit] = js.native
      def load(name: books, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object books extends js.Object {
        
        val bookshelves: BookshelvesResource = js.native
        
        val cloudloading: CloudloadingResource = js.native
        
        val dictionary: DictionaryResource = js.native
        
        val familysharing: FamilysharingResource = js.native
        
        val layers: LayersResource = js.native
        
        val myconfig: MyconfigResource = js.native
        
        val mylibrary: MylibraryResource = js.native
        
        val notification: NotificationResource = js.native
        
        val onboarding: OnboardingResource = js.native
        
        val personalizedstream: PersonalizedstreamResource = js.native
        
        val promooffer: PromoofferResource = js.native
        
        val series: SeriesResource = js.native
        
        val volumes: VolumesResource = js.native
      }
    }
  }
}
