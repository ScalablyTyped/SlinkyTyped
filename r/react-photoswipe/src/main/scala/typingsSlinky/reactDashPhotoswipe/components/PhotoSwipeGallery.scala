package typingsSlinky.reactDashPhotoswipe.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashPhotoswipe.reactDashPhotoswipeMod.PhotoSwipeGalleryItem
import typingsSlinky.reactDashPhotoswipe.reactDashPhotoswipeMod.PhotoSwipeGalleryProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PhotoSwipeGallery
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashPhotoswipe.reactDashPhotoswipeMod.PhotoSwipeGallery
    ] {
  @JSImport("react-photoswipe", "PhotoSwipeGallery")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    items: js.Array[PhotoSwipeGalleryItem],
    thumbnailContent: PhotoSwipeGalleryItem => TagMod[Any],
    isOpen: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashPhotoswipe.reactDashPhotoswipeMod.PhotoSwipeGallery
  ] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], thumbnailContent = js.Any.fromFunction1(thumbnailContent))
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PhotoSwipeGalleryProps
}

