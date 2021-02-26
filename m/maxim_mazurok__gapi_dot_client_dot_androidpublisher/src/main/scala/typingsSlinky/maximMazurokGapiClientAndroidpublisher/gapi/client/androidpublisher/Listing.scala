package typingsSlinky.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Listing extends StObject {
  
  /** Full description of the app. */
  var fullDescription: js.UndefOr[String] = js.native
  
  /** Language localization code (a BCP-47 language tag; for example, "de-AT" for Austrian German). */
  var language: js.UndefOr[String] = js.native
  
  /** Short description of the app. */
  var shortDescription: js.UndefOr[String] = js.native
  
  /** Localized title of the app. */
  var title: js.UndefOr[String] = js.native
  
  /** URL of a promotional YouTube video for the app. */
  var video: js.UndefOr[String] = js.native
}
object Listing {
  
  @scala.inline
  def apply(): Listing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Listing]
  }
  
  @scala.inline
  implicit class ListingMutableBuilder[Self <: Listing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullDescription(value: String): Self = StObject.set(x, "fullDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullDescriptionUndefined: Self = StObject.set(x, "fullDescription", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setShortDescription(value: String): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDescriptionUndefined: Self = StObject.set(x, "shortDescription", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVideo(value: String): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
