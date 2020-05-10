package typingsSlinky.officeUiFabricReact.documentCardPreviewTypesMod

import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.officeUiFabricReact.imageTypesMod.ImageFit
import typingsSlinky.officeUiFabricReact.linkTypesMod.ILinkProps
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocumentCardPreviewImage extends js.Object {
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
  implicit class IDocumentCardPreviewImageOps[Self <: IDocumentCardPreviewImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccentColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accentColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccentColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accentColor")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ js.Object | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorImageSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorImageSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorImageSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorImageSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIconSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withImageFit(value: ImageFit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageFit")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkProps(value: ILinkProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkProps")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewIconContainerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewIconContainerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewIconContainerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewIconContainerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewIconProps(value: IIconProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewIconProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewIconProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewIconProps")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewImageSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewImageSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewImageSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewImageSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

