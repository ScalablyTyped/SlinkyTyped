package typingsSlinky.gapiTranslate

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiTranslate.anon.Cid
import typingsSlinky.gapiTranslate.anon.Fields
import typingsSlinky.gapiTranslate.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object language {
      
      @js.native
      trait detections extends StObject {
        
        /**
          * Detect the language of text.
          */
        def list(`object`: Fields): HttpRequest[GoogleApiTranslateDetectionListResponse] = js.native
      }
      object detections {
        
        @scala.inline
        def apply(list: Fields => HttpRequest[GoogleApiTranslateDetectionListResponse]): detections = {
          val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
          __obj.asInstanceOf[detections]
        }
        
        @scala.inline
        implicit class detectionsMutableBuilder[Self <: detections] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setList(value: Fields => HttpRequest[GoogleApiTranslateDetectionListResponse]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
        }
      }
      
      @js.native
      trait languages extends StObject {
        
        /**
          * List the source/target languages supported by the API
          */
        def list(`object`: Target): HttpRequest[GoogleApiTranslateLanguageListResponse] = js.native
      }
      object languages {
        
        @scala.inline
        def apply(list: Target => HttpRequest[GoogleApiTranslateLanguageListResponse]): languages = {
          val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
          __obj.asInstanceOf[languages]
        }
        
        @scala.inline
        implicit class languagesMutableBuilder[Self <: languages] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setList(value: Target => HttpRequest[GoogleApiTranslateLanguageListResponse]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
        }
      }
      
      @js.native
      trait translations extends StObject {
        
        /**
          * Returns text translations from one language to another.
          */
        def list(`object`: Cid): HttpRequest[GoogleApiTranslateTranslationListResponse] = js.native
      }
      object translations {
        
        @scala.inline
        def apply(list: Cid => HttpRequest[GoogleApiTranslateTranslationListResponse]): translations = {
          val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
          __obj.asInstanceOf[translations]
        }
        
        @scala.inline
        implicit class translationsMutableBuilder[Self <: translations] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setList(value: Cid => HttpRequest[GoogleApiTranslateTranslationListResponse]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
