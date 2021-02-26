package typingsSlinky.officeUiFabricReact

import slinky.core.facade.ReactRef
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.officeUiFabricReact.imageTypesMod.ImageFit
import typingsSlinky.officeUiFabricReact.linkTypesMod.ILinkProps
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.baseComponentTypesMod.IBaseProps
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardPreviewTypesMod {
  
  @js.native
  trait IDocumentCardPreview extends StObject
  
  @js.native
  trait IDocumentCardPreviewImage extends StObject {
    
    /**
      * Hex color value of the line below the preview, which should correspond to the document type.
      *
      * Deprecated at v4.17.1, to be removed at \>= v5.0.0.
      * @deprecated To be removed at v5.0.0.
      */
    var accentColor: js.UndefOr[String] = js.native
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[js.Object]] = js.native
    
    /**
      * Deprecated at v1.3.6, to be removed at \>= v2.0.0.
      * @deprecated To be removed at v2.0.0.
      */
    var errorImageSrc: js.UndefOr[String] = js.native
    
    /**
      * If provided, forces the preview image to be this height.
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * Path to the icon associated with this document type.
      *
      */
    var iconSrc: js.UndefOr[String] = js.native
    
    /**
      * Used to determine how to size the image to fit the dimensions of the component.
      * If both dimensions are provided, then the image is fit using ImageFit.scale, otherwise ImageFit.none is used.
      */
    var imageFit: js.UndefOr[ImageFit] = js.native
    
    /**
      * Props to pass to Link component
      */
    var linkProps: js.UndefOr[ILinkProps] = js.native
    
    /**
      * File name for the document this preview represents.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * The props for the preview icon container classname.
      * If provided, icon container classname will be used..
      */
    var previewIconContainerClass: js.UndefOr[String] = js.native
    
    /**
      * The props for the preview icon.
      * If provided, icon will be rendered instead of image.
      */
    var previewIconProps: js.UndefOr[IIconProps] = js.native
    
    /**
      * Path to the preview image.
      */
    var previewImageSrc: js.UndefOr[String] = js.native
    
    /**
      * URL to view the file.
      * @deprecated Use `href` inside of `linkProps` instead.
      */
    var url: js.UndefOr[String] = js.native
    
    /**
      * If provided, forces the preview image to be this width.
      */
    var width: js.UndefOr[Double] = js.native
  }
  object IDocumentCardPreviewImage {
    
    @scala.inline
    def apply(): IDocumentCardPreviewImage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardPreviewImage]
    }
    
    @scala.inline
    implicit class IDocumentCardPreviewImageMutableBuilder[Self <: IDocumentCardPreviewImage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccentColor(value: String): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccentColorUndefined: Self = StObject.set(x, "accentColor", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[js.Object]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ js.Object | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefRefObject(value: ReactRef[js.Object]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setErrorImageSrc(value: String): Self = StObject.set(x, "errorImageSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorImageSrcUndefined: Self = StObject.set(x, "errorImageSrc", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIconSrc(value: String): Self = StObject.set(x, "iconSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSrcUndefined: Self = StObject.set(x, "iconSrc", js.undefined)
      
      @scala.inline
      def setImageFit(value: ImageFit): Self = StObject.set(x, "imageFit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageFitUndefined: Self = StObject.set(x, "imageFit", js.undefined)
      
      @scala.inline
      def setLinkProps(value: ILinkProps): Self = StObject.set(x, "linkProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkPropsUndefined: Self = StObject.set(x, "linkProps", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPreviewIconContainerClass(value: String): Self = StObject.set(x, "previewIconContainerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewIconContainerClassUndefined: Self = StObject.set(x, "previewIconContainerClass", js.undefined)
      
      @scala.inline
      def setPreviewIconProps(value: IIconProps): Self = StObject.set(x, "previewIconProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewIconPropsUndefined: Self = StObject.set(x, "previewIconProps", js.undefined)
      
      @scala.inline
      def setPreviewImageSrc(value: String): Self = StObject.set(x, "previewImageSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewImageSrcUndefined: Self = StObject.set(x, "previewImageSrc", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait IDocumentCardPreviewProps
    extends IBaseProps[js.Object] {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Gets the component ref.
      */
    @JSName("componentRef")
    var componentRef_IDocumentCardPreviewProps: js.UndefOr[IRefObject[IDocumentCardPreview]] = js.native
    
    /**
      * The function return string that will describe the number of overflow documents.
      * such as  (overflowCount: number) =\> `+${ overflowCount } more`,
      */
    var getOverflowDocumentCountText: js.UndefOr[js.Function1[/* overflowCount */ Double, String]] = js.native
    
    /**
      * One or more preview images to display.
      */
    var previewImages: js.Array[IDocumentCardPreviewImage] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[
        IStyleFunctionOrObject[IDocumentCardPreviewStyleProps, IDocumentCardPreviewStyles]
      ] = js.native
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.native
  }
  object IDocumentCardPreviewProps {
    
    @scala.inline
    def apply(previewImages: js.Array[IDocumentCardPreviewImage]): IDocumentCardPreviewProps = {
      val __obj = js.Dynamic.literal(previewImages = previewImages.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardPreviewProps]
    }
    
    @scala.inline
    implicit class IDocumentCardPreviewPropsMutableBuilder[Self <: IDocumentCardPreviewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IDocumentCardPreview]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IDocumentCardPreview | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefRefObject(value: ReactRef[IDocumentCardPreview]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setGetOverflowDocumentCountText(value: /* overflowCount */ Double => String): Self = StObject.set(x, "getOverflowDocumentCountText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOverflowDocumentCountTextUndefined: Self = StObject.set(x, "getOverflowDocumentCountText", js.undefined)
      
      @scala.inline
      def setPreviewImages(value: js.Array[IDocumentCardPreviewImage]): Self = StObject.set(x, "previewImages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewImagesVarargs(value: IDocumentCardPreviewImage*): Self = StObject.set(x, "previewImages", js.Array(value :_*))
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IDocumentCardPreviewStyleProps, IDocumentCardPreviewStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IDocumentCardPreviewStyleProps => DeepPartial[IDocumentCardPreviewStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait IDocumentCardPreviewStyleProps extends StObject {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Is it a list of files rather than a preview image?
      */
    var isFileList: js.UndefOr[Boolean] = js.native
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme = js.native
  }
  object IDocumentCardPreviewStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IDocumentCardPreviewStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardPreviewStyleProps]
    }
    
    @scala.inline
    implicit class IDocumentCardPreviewStylePropsMutableBuilder[Self <: IDocumentCardPreviewStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setIsFileList(value: Boolean): Self = StObject.set(x, "isFileList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFileListUndefined: Self = StObject.set(x, "isFileList", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDocumentCardPreviewStyles extends StObject {
    
    var fileList: IStyle = js.native
    
    var fileListIcon: IStyle = js.native
    
    var fileListLink: IStyle = js.native
    
    var fileListOverflowText: IStyle = js.native
    
    var icon: IStyle = js.native
    
    var previewIcon: IStyle = js.native
    
    var root: IStyle = js.native
  }
  object IDocumentCardPreviewStyles {
    
    @scala.inline
    def apply(): IDocumentCardPreviewStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardPreviewStyles]
    }
    
    @scala.inline
    implicit class IDocumentCardPreviewStylesMutableBuilder[Self <: IDocumentCardPreviewStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileList(value: IStyle): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileListIcon(value: IStyle): Self = StObject.set(x, "fileListIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileListIconNull: Self = StObject.set(x, "fileListIcon", null)
      
      @scala.inline
      def setFileListIconUndefined: Self = StObject.set(x, "fileListIcon", js.undefined)
      
      @scala.inline
      def setFileListLink(value: IStyle): Self = StObject.set(x, "fileListLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileListLinkNull: Self = StObject.set(x, "fileListLink", null)
      
      @scala.inline
      def setFileListLinkUndefined: Self = StObject.set(x, "fileListLink", js.undefined)
      
      @scala.inline
      def setFileListNull: Self = StObject.set(x, "fileList", null)
      
      @scala.inline
      def setFileListOverflowText(value: IStyle): Self = StObject.set(x, "fileListOverflowText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileListOverflowTextNull: Self = StObject.set(x, "fileListOverflowText", null)
      
      @scala.inline
      def setFileListOverflowTextUndefined: Self = StObject.set(x, "fileListOverflowText", js.undefined)
      
      @scala.inline
      def setFileListUndefined: Self = StObject.set(x, "fileList", js.undefined)
      
      @scala.inline
      def setIcon(value: IStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconNull: Self = StObject.set(x, "icon", null)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setPreviewIcon(value: IStyle): Self = StObject.set(x, "previewIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewIconNull: Self = StObject.set(x, "previewIcon", null)
      
      @scala.inline
      def setPreviewIconUndefined: Self = StObject.set(x, "previewIcon", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
