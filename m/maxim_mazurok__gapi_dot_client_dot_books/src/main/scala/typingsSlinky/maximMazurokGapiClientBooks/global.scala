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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object books {
        
        @JSGlobal("gapi.client.books.bookshelves")
        @js.native
        val bookshelves: BookshelvesResource = js.native
        
        @JSGlobal("gapi.client.books.cloudloading")
        @js.native
        val cloudloading: CloudloadingResource = js.native
        
        @JSGlobal("gapi.client.books.dictionary")
        @js.native
        val dictionary: DictionaryResource = js.native
        
        @JSGlobal("gapi.client.books.familysharing")
        @js.native
        val familysharing: FamilysharingResource = js.native
        
        @JSGlobal("gapi.client.books.layers")
        @js.native
        val layers: LayersResource = js.native
        
        @JSGlobal("gapi.client.books.myconfig")
        @js.native
        val myconfig: MyconfigResource = js.native
        
        @JSGlobal("gapi.client.books.mylibrary")
        @js.native
        val mylibrary: MylibraryResource = js.native
        
        @JSGlobal("gapi.client.books.notification")
        @js.native
        val notification: NotificationResource = js.native
        
        @JSGlobal("gapi.client.books.onboarding")
        @js.native
        val onboarding: OnboardingResource = js.native
        
        @JSGlobal("gapi.client.books.personalizedstream")
        @js.native
        val personalizedstream: PersonalizedstreamResource = js.native
        
        @JSGlobal("gapi.client.books.promooffer")
        @js.native
        val promooffer: PromoofferResource = js.native
        
        @JSGlobal("gapi.client.books.series")
        @js.native
        val series: SeriesResource = js.native
        
        @JSGlobal("gapi.client.books.volumes")
        @js.native
        val volumes: VolumesResource = js.native
      }
      
      /** Load Books API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: books, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: books, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
