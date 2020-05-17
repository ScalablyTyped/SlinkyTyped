package typingsSlinky.gapiClientBooks

import typingsSlinky.gapiClientBooks.gapi.client.books.BookshelvesResource
import typingsSlinky.gapiClientBooks.gapi.client.books.CloudloadingResource
import typingsSlinky.gapiClientBooks.gapi.client.books.DictionaryResource
import typingsSlinky.gapiClientBooks.gapi.client.books.LayersResource
import typingsSlinky.gapiClientBooks.gapi.client.books.MyconfigResource
import typingsSlinky.gapiClientBooks.gapi.client.books.MylibraryResource
import typingsSlinky.gapiClientBooks.gapi.client.books.NotificationResource
import typingsSlinky.gapiClientBooks.gapi.client.books.OnboardingResource
import typingsSlinky.gapiClientBooks.gapi.client.books.PersonalizedstreamResource
import typingsSlinky.gapiClientBooks.gapi.client.books.PromoofferResource
import typingsSlinky.gapiClientBooks.gapi.client.books.SeriesResource
import typingsSlinky.gapiClientBooks.gapi.client.books.VolumesResource
import typingsSlinky.gapiClientBooks.gapiClientBooksStrings.books
import typingsSlinky.gapiClientBooks.gapiClientBooksStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val bookshelves: BookshelvesResource = js.native
      val cloudloading: CloudloadingResource = js.native
      val dictionary: DictionaryResource = js.native
      val layers: LayersResource = js.native
      val myconfig: MyconfigResource = js.native
      val mylibrary: MylibraryResource = js.native
      val notification: NotificationResource = js.native
      val onboarding: OnboardingResource = js.native
      val personalizedstream: PersonalizedstreamResource = js.native
      val promooffer: PromoofferResource = js.native
      val series: SeriesResource = js.native
      val volumes: VolumesResource = js.native
      /** Load Books API v1 */
      def load(name: books, version: v1): js.Thenable[Unit] = js.native
      def load(name: books, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

