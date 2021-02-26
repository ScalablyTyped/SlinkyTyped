package typingsSlinky.gravatarUrl

import typingsSlinky.gravatarUrl.gravatarUrlStrings.`404`
import typingsSlinky.gravatarUrl.gravatarUrlStrings.blank
import typingsSlinky.gravatarUrl.gravatarUrlStrings.g
import typingsSlinky.gravatarUrl.gravatarUrlStrings.identicon
import typingsSlinky.gravatarUrl.gravatarUrlStrings.mm
import typingsSlinky.gravatarUrl.gravatarUrlStrings.monsterid
import typingsSlinky.gravatarUrl.gravatarUrlStrings.pg
import typingsSlinky.gravatarUrl.gravatarUrlStrings.r
import typingsSlinky.gravatarUrl.gravatarUrlStrings.retro
import typingsSlinky.gravatarUrl.gravatarUrlStrings.wavatar
import typingsSlinky.gravatarUrl.gravatarUrlStrings.x
import typingsSlinky.typeFest.literalUnionMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Get the URL to a Gravatar image from an identifier, such as an email.
  @param identifier - Identifier for which to get the Gravatar image. This will typically be an email matching a Gravatar profile, but can technically be any string. The Gravatar service only sees a hash of the identifier, so you could actually use this to get pseudo-random avatars for any entity, e.g. based on its ID. Note that if the identifier contains an `@`, it is assumed to be an email, and will therefore be lower-cased and trimmed before hashing, as per the Gravatar instructions - otherwise it will be hashed as-is.
  @example
  ```
  import gravatarUrl = require('gravatar-url');
  gravatarUrl('sindresorhus@gmail.com', {size: 200});
  //=> 'https://gravatar.com/avatar/d36a92237c75c5337c17b60d90686bf9?size=200'
  ```
  */
  @JSImport("gravatar-url", JSImport.Namespace)
  @js.native
  def apply(identifier: String): String = js.native
  @JSImport("gravatar-url", JSImport.Namespace)
  @js.native
  def apply(identifier: String, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		[Image](https://en.gravatar.com/site/implement/images/#default-image) to return if the identifier didn't match any Gravatar profile. Either a ustom URL or [`404`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=404), [`mm`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=mm), [`identicon`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=identicon), [`monsterid`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=monsterid), [`wavatar`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=wavatar), [`retro`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=retro), [`blank`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=blank).
    		@default 'https://gravatar.com/avatar/00000000000000000000000000000000'
    		*/
    val default: js.UndefOr[
        LiteralUnion[`404` | mm | identicon | monsterid | wavatar | retro | blank, String]
      ] = js.native
    
    /**
    		Allowed [rating](https://en.gravatar.com/site/implement/images/#rating) of the image.
    		@default 'g'
    		*/
    val rating: js.UndefOr[g | pg | r | x] = js.native
    
    /**
    		[Size](https://en.gravatar.com/site/implement/images/#size) of the image. Values: `1..2048`.
    		@default 80
    		*/
    val size: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: LiteralUnion[`404` | mm | identicon | monsterid | wavatar | retro | blank, String]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setRating(value: g | pg | r | typingsSlinky.gravatarUrl.gravatarUrlStrings.x): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
