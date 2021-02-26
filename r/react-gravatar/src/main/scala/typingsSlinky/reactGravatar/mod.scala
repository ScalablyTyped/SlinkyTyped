package typingsSlinky.reactGravatar

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * React component for rendering a gravatar profile image. Adjusts automatically to HiDPI displays.
    */
  @JSImport("react-gravatar", JSImport.Namespace)
  @js.native
  class ^ () extends Gravatar
  
  /* static member */
  @JSImport("react-gravatar", "defaultProps")
  @js.native
  val defaultProps: Props = js.native
  
  /* static member */
  @JSImport("react-gravatar", "displayName")
  @js.native
  val displayName: String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactGravatar.reactGravatarStrings.`404`
    - typingsSlinky.reactGravatar.reactGravatarStrings.mm
    - typingsSlinky.reactGravatar.reactGravatarStrings.identicon
    - typingsSlinky.reactGravatar.reactGravatarStrings.monsterid
    - typingsSlinky.reactGravatar.reactGravatarStrings.wavatar
    - typingsSlinky.reactGravatar.reactGravatarStrings.retro
    - typingsSlinky.reactGravatar.reactGravatarStrings.blank
  */
  trait DefaultImage extends StObject
  object DefaultImage {
    
    @scala.inline
    def `404`: typingsSlinky.reactGravatar.reactGravatarStrings.`404` = "404".asInstanceOf[typingsSlinky.reactGravatar.reactGravatarStrings.`404`]
    
    @scala.inline
    def blank: typingsSlinky.reactGravatar.reactGravatarStrings.blank = "blank".asInstanceOf[typingsSlinky.reactGravatar.reactGravatarStrings.blank]
    
    @scala.inline
    def identicon: typingsSlinky.reactGravatar.reactGravatarStrings.identicon = "identicon".asInstanceOf[typingsSlinky.reactGravatar.reactGravatarStrings.identicon]
    
    @scala.inline
    def mm: typingsSlinky.reactGravatar.reactGravatarStrings.mm = "mm".asInstanceOf[typingsSlinky.reactGravatar.reactGravatarStrings.mm]
    
    @scala.inline
    def monsterid: typingsSlinky.reactGravatar.reactGravatarStrings.monsterid = "monsterid".asInstanceOf[typingsSlinky.reactGravatar.reactGravatarStrings.monsterid]
    
    @scala.inline
    def retro: typingsSlinky.reactGravatar.reactGravatarStrings.retro = "retro".asInstanceOf[typingsSlinky.reactGravatar.reactGravatarStrings.retro]
    
    @scala.inline
    def wavatar: typingsSlinky.reactGravatar.reactGravatarStrings.wavatar = "wavatar".asInstanceOf[typingsSlinky.reactGravatar.reactGravatarStrings.wavatar]
  }
  
  /**
    * React component for rendering a gravatar profile image. Adjusts automatically to HiDPI displays.
    */
  @js.native
  trait Gravatar
    extends Component[Props, js.Object, js.Any]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof react.react.DetailedHTMLProps<react.react.ImgHTMLAttributes<std.HTMLImageElement>, std.HTMLImageElement> ]:? react.react.DetailedHTMLProps<react.react.ImgHTMLAttributes<std.HTMLImageElement>, std.HTMLImageElement>[P]} */ @js.native
  trait Props extends StObject {
    
    /**
      * Gravatar has a number of built in options which you can use as defaults when an email address has no
      * matching Gravatar image.
      *
      * @default "retro"
      * @see https://gravatar.com/site/implement/images/#default-image
      */
    var default: js.UndefOr[DefaultImage] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    /**
      * The email address used to look up the Gravatar image.
      * If you wish to avoid sending an email address to the client, you can compute the md5 hash on the server and
      * pass the hash to the component using the `md5` prop instead of the `email` prop.
      */
    var email: js.UndefOr[String] = js.native
    
    /**
      * The md5 hash of the email address used to look up the Gravatar image.
      * If you wish to avoid sending an email address to the client, you can compute the md5 hash on the server and
      * pass the hash to the component using the `md5` prop instead of the `email` prop.
      */
    var md5: js.UndefOr[String] = js.native
    
    /**
      * The protocol used to fetch the Gravatar image. Should be one of `http://`, `https://` or `//` (default).
      *
      * @default "//"
      * @see https://gravatar.com/site/implement/images/#secure-images
      */
    var protocol: js.UndefOr[String] = js.native
    
    /**
      * Gravatar allows users to self-rate their images so that they can indicate if an image is appropriate for a
      * certain audience. By default, only `g` rated images are displayed unless you indicate that you would like
      * to see higher ratings.
      *
      * @default "g"
      * @see https://gravatar.com/site/implement/images/#rating
      */
    var rating: js.UndefOr[Rating] = js.native
    
    /**
      * By default, images are presented at 50px by 50px if no size prop is supplied.
      *
      * @default 50
      * @see https://gravatar.com/site/implement/images/#size
      */
    var size: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefault(value: DefaultImage): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setMd5(value: String): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMd5Undefined: Self = StObject.set(x, "md5", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setRating(value: Rating): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactGravatar.reactGravatarStrings.g
    - typingsSlinky.reactGravatar.reactGravatarStrings.pg
    - typingsSlinky.reactGravatar.reactGravatarStrings.r
    - typingsSlinky.reactGravatar.reactGravatarStrings.x
  */
  trait Rating extends StObject
  object Rating {
    
    @scala.inline
    def g: typingsSlinky.reactGravatar.reactGravatarStrings.g = "g".asInstanceOf[typingsSlinky.reactGravatar.reactGravatarStrings.g]
    
    @scala.inline
    def pg: typingsSlinky.reactGravatar.reactGravatarStrings.pg = "pg".asInstanceOf[typingsSlinky.reactGravatar.reactGravatarStrings.pg]
    
    @scala.inline
    def r: typingsSlinky.reactGravatar.reactGravatarStrings.r = "r".asInstanceOf[typingsSlinky.reactGravatar.reactGravatarStrings.r]
    
    @scala.inline
    def x: typingsSlinky.reactGravatar.reactGravatarStrings.x = "x".asInstanceOf[typingsSlinky.reactGravatar.reactGravatarStrings.x]
  }
}
