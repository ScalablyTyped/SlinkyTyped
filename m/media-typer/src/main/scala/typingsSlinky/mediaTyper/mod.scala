package typingsSlinky.mediaTyper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("media-typer", "format")
  @js.native
  def format(mediaTypeDescriptor: MediaType): String = js.native
  
  @JSImport("media-typer", "parse")
  @js.native
  def parse(mediaType: String): MediaType = js.native
  
  @JSImport("media-typer", "test")
  @js.native
  def test(mediaType: String): Boolean = js.native
  
  @js.native
  trait MediaType extends StObject {
    
    /**
      * The subtype of the media type (always lower case). Example: `svg`
      */
    var subtype: String = js.native
    
    /**
      * The suffix of the media type (always lower case). Example: `xml`
      */
    var suffix: js.UndefOr[String] = js.native
    
    /**
      * The type of the media type (always lower case). Example: `image`
      */
    var `type`: String = js.native
  }
  object MediaType {
    
    @scala.inline
    def apply(subtype: String, `type`: String): MediaType = {
      val __obj = js.Dynamic.literal(subtype = subtype.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaType]
    }
    
    @scala.inline
    implicit class MediaTypeMutableBuilder[Self <: MediaType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
