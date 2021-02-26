package typingsSlinky.duckduckgoImagesApi

import typingsSlinky.duckduckgoImagesApi.anon.Iterations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("duckduckgo-images-api", "image_search")
  @js.native
  def imageSearch(params: Iterations): js.Promise[js.Array[DuckDuckGoImage]] = js.native
  
  @JSImport("duckduckgo-images-api", "image_search_generator")
  @js.native
  def imageSearchGenerator(params: Iterations): js.Promise[js.Array[DuckDuckGoImage]] = js.native
  
  @js.native
  trait DuckDuckGoImage extends StObject {
    
    var height: Double = js.native
    
    var image: String = js.native
    
    var source: String = js.native
    
    var thumbnail: String = js.native
    
    var title: String = js.native
    
    var url: String = js.native
    
    var width: Double = js.native
  }
  object DuckDuckGoImage {
    
    @scala.inline
    def apply(
      height: Double,
      image: String,
      source: String,
      thumbnail: String,
      title: String,
      url: String,
      width: Double
    ): DuckDuckGoImage = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[DuckDuckGoImage]
    }
    
    @scala.inline
    implicit class DuckDuckGoImageMutableBuilder[Self <: DuckDuckGoImage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
