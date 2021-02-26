package typingsSlinky.baseui

import org.scalajs.dom.raw.HTMLImageElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.baseui.anon.Thumbnail
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.ImgHTMLAttributes
import typingsSlinky.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod {
  
  @JSImport("baseui/card", "Card")
  @js.native
  val Card: ReactComponentClass[CardProps] = js.native
  
  @JSImport("baseui/card", "StyledAction")
  @js.native
  val StyledAction: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/card", "StyledBody")
  @js.native
  val StyledBody: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/card", "StyledContents")
  @js.native
  val StyledContents: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/card", "StyledHeaderImage")
  @js.native
  val StyledHeaderImage: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/card", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/card", "StyledThumbnail")
  @js.native
  val StyledThumbnail: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/card", "StyledTitle")
  @js.native
  val StyledTitle: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/card", "StyledWrapper")
  @js.native
  val StyledWrapper: StyletronComponent[js.Any] = js.native
  
  @js.native
  trait CardOverrides extends StObject {
    
    var Action: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Body: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Contents: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var HeaderImage: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Thumbnail: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Title: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
  }
  object CardOverrides {
    
    @scala.inline
    def apply(): CardOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardOverrides]
    }
    
    @scala.inline
    implicit class CardOverridesMutableBuilder[Self <: CardOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
      
      @scala.inline
      def setBody(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      @scala.inline
      def setContents(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentsUndefined: Self = StObject.set(x, "Contents", js.undefined)
      
      @scala.inline
      def setHeaderImage(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "HeaderImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderImageUndefined: Self = StObject.set(x, "HeaderImage", js.undefined)
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      @scala.inline
      def setThumbnail(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Thumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailUndefined: Self = StObject.set(x, "Thumbnail", js.undefined)
      
      @scala.inline
      def setTitle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    }
  }
  
  @js.native
  trait CardProps extends StObject {
    
    val action: js.UndefOr[ReactElement] = js.native
    
    val children: js.UndefOr[ReactElement] = js.native
    
    val hasThumbnail: js.UndefOr[js.Function1[/* props */ Thumbnail, Boolean]] = js.native
    
    val headerImage: js.UndefOr[
        String | (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement])
      ] = js.native
    
    val overrides: js.UndefOr[CardOverrides] = js.native
    
    val thumbnail: js.UndefOr[String] = js.native
    
    val title: js.UndefOr[ReactElement] = js.native
  }
  object CardProps {
    
    @scala.inline
    def apply(): CardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardProps]
    }
    
    @scala.inline
    implicit class CardPropsMutableBuilder[Self <: CardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: ReactElement): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionReactElement(value: ReactElement): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setHasThumbnail(value: /* props */ Thumbnail => Boolean): Self = StObject.set(x, "hasThumbnail", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasThumbnailUndefined: Self = StObject.set(x, "hasThumbnail", js.undefined)
      
      @scala.inline
      def setHeaderImage(value: String | (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement])): Self = StObject.set(x, "headerImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderImageUndefined: Self = StObject.set(x, "headerImage", js.undefined)
      
      @scala.inline
      def setOverrides(value: CardOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type hasThumbnail = js.Function1[/* props */ Thumbnail, Boolean]
}
