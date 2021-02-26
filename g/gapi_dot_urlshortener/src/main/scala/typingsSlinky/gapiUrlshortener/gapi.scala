package typingsSlinky.gapiUrlshortener

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiUrlshortener.anon.Fields
import typingsSlinky.gapiUrlshortener.anon.Projection
import typingsSlinky.gapiUrlshortener.anon.RequestBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object urlshortener {
      
      @js.native
      trait url extends StObject {
        
        /**
          * Expands a short URL or gets creation time and analytics.
          */
        def get(`object`: Fields): HttpRequest[GoogleApiUrlShortenerUrlResource] = js.native
        
        /**
          * Creates a new short URL.
          */
        def insert(`object`: RequestBody): HttpRequest[GoogleApiUrlShortenerUrlResource] = js.native
        
        /**
          * Retrieves a list of URLs shortened by a user.
          */
        def list(`object`: Projection): HttpRequest[GoogleApiUrlShortenerUrlResource] = js.native
      }
      object url {
        
        @scala.inline
        def apply(
          get: Fields => HttpRequest[GoogleApiUrlShortenerUrlResource],
          insert: RequestBody => HttpRequest[GoogleApiUrlShortenerUrlResource],
          list: Projection => HttpRequest[GoogleApiUrlShortenerUrlResource]
        ): url = {
          val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
          __obj.asInstanceOf[url]
        }
        
        @scala.inline
        implicit class urlMutableBuilder[Self <: url] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setGet(value: Fields => HttpRequest[GoogleApiUrlShortenerUrlResource]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
          
          @scala.inline
          def setInsert(value: RequestBody => HttpRequest[GoogleApiUrlShortenerUrlResource]): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
          
          @scala.inline
          def setList(value: Projection => HttpRequest[GoogleApiUrlShortenerUrlResource]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
