package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.framework.XResource
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.framework.XResourceId
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface exists only because services do not directly support multiple inheritance and attributes.
  *
  * It provides the interfaces and attributes that every object that implements the {@link SlideSorter} service.
  */
@js.native
trait XSlideSorterBase
  extends XDrawView
     with XResource {
  var BackgroundColor: Color = js.native
  /**
    * The set of slides that are displayed by the implementing object.
    *
    * The default value is the set of all slides of the document for which a slide sorter is created.
    */
  var DocumentSlides: XIndexAccess = js.native
  var HighlightColor: Color = js.native
  /**
    * When this flag has the value `TRUE` then every time the current slide is changed the visual area is shifted so that the new current slide is display
    * in the center of the slide sorter window.
    *
    * It is not always possible to move the current slide into the exact center of the window, for example when slides are located near the start or end of
    * a document.
    *
    * The default value is `FALSE` .
    */
  var IsCenterSelection: Boolean = js.native
  /**
    * Set this flag to `TRUE` in order to have the current slide highlighted.
    *
    * The default value is `FALSE` .
    */
  var IsHighlightCurrentSlide: Boolean = js.native
  /** The orientation of a slide sorter can be either vertical ( `TRUE` ) or horizontal ( `FALSE` ). */
  var IsOrientationVertical: Boolean = js.native
  /**
    * Set this flag to `TRUE` to visualize to where the focus is by showing a dotted rectangle around the focused slide.
    *
    * The default value is `TRUE` .
    */
  var IsShowFocus: Boolean = js.native
  /**
    * Set this flag to `TRUE` in order to visualize the selection of slides (typically a bold frame around the selected slides).
    *
    * The default value is `TRUE` .
    */
  var IsShowSelection: Boolean = js.native
  /** This flag is a hint to make scrolling look smooth. */
  var IsSmoothScrolling: Boolean = js.native
  /**
    * This flag controls whether updates of previews are created during full screen presentations ( `FALSE` ) or not ( `TRUE` ). The suspension of preview
    * creations is an optimization for not slowing down a running presentation.
    *
    * The default value is `TRUE` .
    */
  var IsSuspendPreviewUpdatesDuringFullScreenPresentation: Boolean = js.native
  /**
    * This flag controls whether the model can be modified by using keyboard or mouse.
    *
    * The default value is `TRUE` .
    */
  var IsUIReadOnly: Boolean = js.native
  var SelectionColor: Color = js.native
  var TextColor: Color = js.native
}

object XSlideSorterBase {
  @scala.inline
  def apply(
    BackgroundColor: Color,
    CurrentPage: XDrawPage,
    DocumentSlides: XIndexAccess,
    HighlightColor: Color,
    IsCenterSelection: Boolean,
    IsHighlightCurrentSlide: Boolean,
    IsOrientationVertical: Boolean,
    IsShowFocus: Boolean,
    IsShowSelection: Boolean,
    IsSmoothScrolling: Boolean,
    IsSuspendPreviewUpdatesDuringFullScreenPresentation: Boolean,
    IsUIReadOnly: Boolean,
    ResourceId: XResourceId,
    SelectionColor: Color,
    TextColor: Color,
    acquire: () => Unit,
    getCurrentPage: () => XDrawPage,
    getResourceId: () => XResourceId,
    isAnchorOnly: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setCurrentPage: XDrawPage => Unit
  ): XSlideSorterBase = {
    val __obj = js.Dynamic.literal(BackgroundColor = BackgroundColor.asInstanceOf[js.Any], CurrentPage = CurrentPage.asInstanceOf[js.Any], DocumentSlides = DocumentSlides.asInstanceOf[js.Any], HighlightColor = HighlightColor.asInstanceOf[js.Any], IsCenterSelection = IsCenterSelection.asInstanceOf[js.Any], IsHighlightCurrentSlide = IsHighlightCurrentSlide.asInstanceOf[js.Any], IsOrientationVertical = IsOrientationVertical.asInstanceOf[js.Any], IsShowFocus = IsShowFocus.asInstanceOf[js.Any], IsShowSelection = IsShowSelection.asInstanceOf[js.Any], IsSmoothScrolling = IsSmoothScrolling.asInstanceOf[js.Any], IsSuspendPreviewUpdatesDuringFullScreenPresentation = IsSuspendPreviewUpdatesDuringFullScreenPresentation.asInstanceOf[js.Any], IsUIReadOnly = IsUIReadOnly.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], SelectionColor = SelectionColor.asInstanceOf[js.Any], TextColor = TextColor.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCurrentPage = js.Any.fromFunction0(getCurrentPage), getResourceId = js.Any.fromFunction0(getResourceId), isAnchorOnly = js.Any.fromFunction0(isAnchorOnly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCurrentPage = js.Any.fromFunction1(setCurrentPage))
    __obj.asInstanceOf[XSlideSorterBase]
  }
  @scala.inline
  implicit class XSlideSorterBaseOps[Self <: XSlideSorterBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentSlides(value: XIndexAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentSlides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HighlightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCenterSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCenterSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHighlightCurrentSlide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsHighlightCurrentSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOrientationVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsOrientationVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsShowFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsShowFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsShowSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsShowSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSmoothScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsSmoothScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSuspendPreviewUpdatesDuringFullScreenPresentation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsSuspendPreviewUpdatesDuringFullScreenPresentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsUIReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsUIReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectionColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

