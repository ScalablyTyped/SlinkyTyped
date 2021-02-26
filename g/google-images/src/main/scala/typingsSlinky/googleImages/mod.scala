package typingsSlinky.googleImages

import typingsSlinky.googleImages.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("google-images", JSImport.Namespace)
  @js.native
  class ^ protected () extends GoogleImages {
    def this(engineId: String, apiKey: String) = this()
  }
  
  @js.native
  trait GoogleImages extends StObject {
    
    def search(searchTerm: String): js.Promise[js.Array[Image]] = js.native
    def search(searchTerm: String, options: SearchOptions): js.Promise[js.Array[Image]] = js.native
  }
  
  @js.native
  trait Image extends StObject {
    
    var height: Double = js.native
    
    var size: Double = js.native
    
    var thumbnail: Height = js.native
    
    var `type`: String = js.native
    
    var url: String = js.native
    
    var width: Double = js.native
  }
  object Image {
    
    @scala.inline
    def apply(height: Double, size: Double, thumbnail: Height, `type`: String, url: String, width: Double): Image = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    @scala.inline
    implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnail(value: Height): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.googleImages.googleImagesStrings.color
    - typingsSlinky.googleImages.googleImagesStrings.gray
    - typingsSlinky.googleImages.googleImagesStrings.mono
  */
  trait SearchColorType extends StObject
  object SearchColorType {
    
    @scala.inline
    def color: typingsSlinky.googleImages.googleImagesStrings.color = "color".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.color]
    
    @scala.inline
    def gray: typingsSlinky.googleImages.googleImagesStrings.gray = "gray".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.gray]
    
    @scala.inline
    def mono: typingsSlinky.googleImages.googleImagesStrings.mono = "mono".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.mono]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.googleImages.googleImagesStrings.black
    - typingsSlinky.googleImages.googleImagesStrings.blue
    - typingsSlinky.googleImages.googleImagesStrings.brown
    - typingsSlinky.googleImages.googleImagesStrings.gray
    - typingsSlinky.googleImages.googleImagesStrings.green
    - typingsSlinky.googleImages.googleImagesStrings.pink
    - typingsSlinky.googleImages.googleImagesStrings.purple
    - typingsSlinky.googleImages.googleImagesStrings.teal
    - typingsSlinky.googleImages.googleImagesStrings.white
    - typingsSlinky.googleImages.googleImagesStrings.yellow
  */
  trait SearchDominantColor extends StObject
  object SearchDominantColor {
    
    @scala.inline
    def black: typingsSlinky.googleImages.googleImagesStrings.black = "black".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.black]
    
    @scala.inline
    def blue: typingsSlinky.googleImages.googleImagesStrings.blue = "blue".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.blue]
    
    @scala.inline
    def brown: typingsSlinky.googleImages.googleImagesStrings.brown = "brown".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.brown]
    
    @scala.inline
    def gray: typingsSlinky.googleImages.googleImagesStrings.gray = "gray".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.gray]
    
    @scala.inline
    def green: typingsSlinky.googleImages.googleImagesStrings.green = "green".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.green]
    
    @scala.inline
    def pink: typingsSlinky.googleImages.googleImagesStrings.pink = "pink".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.pink]
    
    @scala.inline
    def purple: typingsSlinky.googleImages.googleImagesStrings.purple = "purple".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.purple]
    
    @scala.inline
    def teal: typingsSlinky.googleImages.googleImagesStrings.teal = "teal".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.teal]
    
    @scala.inline
    def white: typingsSlinky.googleImages.googleImagesStrings.white = "white".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.white]
    
    @scala.inline
    def yellow: typingsSlinky.googleImages.googleImagesStrings.yellow = "yellow".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.yellow]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.googleImages.googleImagesStrings.icon
    - typingsSlinky.googleImages.googleImagesStrings.small
    - typingsSlinky.googleImages.googleImagesStrings.medium
    - typingsSlinky.googleImages.googleImagesStrings.large
    - typingsSlinky.googleImages.googleImagesStrings.xlarge
    - typingsSlinky.googleImages.googleImagesStrings.xxlarge
    - typingsSlinky.googleImages.googleImagesStrings.huge
  */
  trait SearchImageSize extends StObject
  object SearchImageSize {
    
    @scala.inline
    def huge: typingsSlinky.googleImages.googleImagesStrings.huge = "huge".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.huge]
    
    @scala.inline
    def icon: typingsSlinky.googleImages.googleImagesStrings.icon = "icon".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.icon]
    
    @scala.inline
    def large: typingsSlinky.googleImages.googleImagesStrings.large = "large".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.large]
    
    @scala.inline
    def medium: typingsSlinky.googleImages.googleImagesStrings.medium = "medium".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.medium]
    
    @scala.inline
    def small: typingsSlinky.googleImages.googleImagesStrings.small = "small".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.small]
    
    @scala.inline
    def xlarge: typingsSlinky.googleImages.googleImagesStrings.xlarge = "xlarge".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.xlarge]
    
    @scala.inline
    def xxlarge: typingsSlinky.googleImages.googleImagesStrings.xxlarge = "xxlarge".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.xxlarge]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.googleImages.googleImagesStrings.clipart
    - typingsSlinky.googleImages.googleImagesStrings.face
    - typingsSlinky.googleImages.googleImagesStrings.lineart
    - typingsSlinky.googleImages.googleImagesStrings.news
    - typingsSlinky.googleImages.googleImagesStrings.photo
  */
  trait SearchImageType extends StObject
  object SearchImageType {
    
    @scala.inline
    def clipart: typingsSlinky.googleImages.googleImagesStrings.clipart = "clipart".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.clipart]
    
    @scala.inline
    def face: typingsSlinky.googleImages.googleImagesStrings.face = "face".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.face]
    
    @scala.inline
    def lineart: typingsSlinky.googleImages.googleImagesStrings.lineart = "lineart".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.lineart]
    
    @scala.inline
    def news: typingsSlinky.googleImages.googleImagesStrings.news = "news".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.news]
    
    @scala.inline
    def photo: typingsSlinky.googleImages.googleImagesStrings.photo = "photo".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.photo]
  }
  
  @js.native
  trait SearchOptions extends StObject {
    
    var colorType: js.UndefOr[SearchColorType] = js.native
    
    var dominantColor: js.UndefOr[SearchDominantColor] = js.native
    
    var page: js.UndefOr[Double] = js.native
    
    var safe: js.UndefOr[SearchSafe] = js.native
    
    var size: js.UndefOr[SearchImageSize] = js.native
    
    var `type`: js.UndefOr[SearchImageType] = js.native
  }
  object SearchOptions {
    
    @scala.inline
    def apply(): SearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchOptions]
    }
    
    @scala.inline
    implicit class SearchOptionsMutableBuilder[Self <: SearchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorType(value: SearchColorType): Self = StObject.set(x, "colorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorTypeUndefined: Self = StObject.set(x, "colorType", js.undefined)
      
      @scala.inline
      def setDominantColor(value: SearchDominantColor): Self = StObject.set(x, "dominantColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDominantColorUndefined: Self = StObject.set(x, "dominantColor", js.undefined)
      
      @scala.inline
      def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      @scala.inline
      def setSafe(value: SearchSafe): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
      
      @scala.inline
      def setSize(value: SearchImageSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setType(value: SearchImageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.googleImages.googleImagesStrings.high
    - typingsSlinky.googleImages.googleImagesStrings.medium
    - typingsSlinky.googleImages.googleImagesStrings.off
  */
  trait SearchSafe extends StObject
  object SearchSafe {
    
    @scala.inline
    def high: typingsSlinky.googleImages.googleImagesStrings.high = "high".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.high]
    
    @scala.inline
    def medium: typingsSlinky.googleImages.googleImagesStrings.medium = "medium".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.medium]
    
    @scala.inline
    def off: typingsSlinky.googleImages.googleImagesStrings.off = "off".asInstanceOf[typingsSlinky.googleImages.googleImagesStrings.off]
  }
}
