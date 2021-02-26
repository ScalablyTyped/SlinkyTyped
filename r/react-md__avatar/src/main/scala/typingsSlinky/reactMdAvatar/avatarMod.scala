package typingsSlinky.reactMdAvatar

import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributeReferrerPolicy
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.ImgHTMLAttributes
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdUtils.typesTypesMod.PropsWithRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarMod {
  
  @JSImport("@react-md/avatar/types/Avatar", "Avatar")
  @js.native
  val Avatar: ForwardRefExoticComponent[AvatarProps with RefAttributes[HTMLSpanElement]] = js.native
  
  @js.native
  trait AvatarProps extends HTMLAttributes[HTMLSpanElement] {
    
    /**
      * An optional alt tag to display on the `<img>` when the `src` prop is also
      * applied.
      *
      * For accessibility and screen readers, you normally do not want to actually
      * provide this prop. This should only be used if the `Avatar` is not
      * accompanied by some other component or main content as it will be extra
      * noise for screen readers.
      */
    var alt: js.UndefOr[String] = js.native
    
    /**
      * An optional object of image props and ref that can be used to create an
      * image within the `Avatar`. This can be useful to add a custom `style`
      * or`className` to the `<img>` element if that additional customization is
      * needed.
      *
      * Note: The values in this object will override the `src`, `alt`, and
      * `referrerPolicy` root level avatar props if they exist on this object.
      *
      * @since 2.2.0
      */
    var imgProps: js.UndefOr[PropsWithRef[ImgAttributes, HTMLImageElement]] = js.native
    
    /**
      * An optional `referrerPolicy` to provide to the `<img>` element if the `src`
      * or `imgProps` props are provided.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img#attr-referrerpolicy
      *
      * @since 2.2.0
      */
    var referrerPolicy: js.UndefOr[HTMLAttributeReferrerPolicy] = js.native
    
    /**
      * This should be an image `src` attribute to create an avatar from. When this
      * prop is defined, you should not add any children to the avatar as the
      * positioning will break.
      */
    var src: js.UndefOr[String] = js.native
  }
  object AvatarProps {
    
    @scala.inline
    def apply(): AvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarProps]
    }
    
    @scala.inline
    implicit class AvatarPropsMutableBuilder[Self <: AvatarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setImgProps(value: PropsWithRef[ImgAttributes, HTMLImageElement]): Self = StObject.set(x, "imgProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgPropsUndefined: Self = StObject.set(x, "imgProps", js.undefined)
      
      @scala.inline
      def setReferrerPolicy(value: HTMLAttributeReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
  
  type ImgAttributes = ImgHTMLAttributes[HTMLImageElement]
}
