package typingsSlinky.ejWebAll.ej.Rotator

import typingsSlinky.ejWebAll.ej.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Turns on keyboard interaction with the Rotator items. You must set this property to true to access the following keyboard shortcuts:
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /** Sets the animationSpeed of slide transition.
    * @Default {600}
    */
  var animationSpeed: js.UndefOr[String | Double] = js.native
  /** Specifies the animationType type for the Rotator Item. animationType options include slide, fastSlide, slowSlide, and other custom easing animationTypes.
    * @Default {slide}
    */
  var animationType: js.UndefOr[String] = js.native
  /** This event is fired when the Rotator slides are changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Enables the circular mode item rotation.
    * @Default {true}
    */
  var circularMode: js.UndefOr[Boolean] = js.native
  /** This event is fired when the Rotator control is initialized.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Specify the CSS class to Rotator to achieve custom theme.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Specify the list of data which contains a set of data fields. Each data value is used to render an item for the Rotator.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Sets the delay between the Rotator Items move after the slide transition.
    * @Default {500}
    */
  var delay: js.UndefOr[Double] = js.native
  /** This event is fired when the Rotator control is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Specifies the number of Rotator Items to be displayed.
    * @Default {1}
    */
  var displayItemsCount: js.UndefOr[String | Double] = js.native
  /** Rotates the Rotator Items continuously without user interference.
    * @Default {false}
    */
  var enableAutoPlay: js.UndefOr[Boolean] = js.native
  /** Specifies right to left transition of slides.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Enables or disables the Rotator control.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Defines mapping fields for the data items of the Rotator.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.native
  /** Sets the space between the Rotator Items.
    */
  var frameSpace: js.UndefOr[String | Double] = js.native
  /** Resizes the Rotator when the browser is resized.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Specifies the number of Rotator Items to navigate on a single click (next/previous/play buttons). The navigateSteps property value must be less than or equal to the
    * displayItemsCount property value.
    * @Default {1}
    */
  var navigateSteps: js.UndefOr[String | Double] = js.native
  /** Specifies the orientation for the Rotator control, that is, whether it must be rendered horizontally or vertically. See Orientation
    * @Default {ej.Orientation.Horizontal}
    */
  var orientation: js.UndefOr[Orientation | String] = js.native
  /** This event is fired when a pager is clicked.
    */
  var pagerClick: js.UndefOr[js.Function1[/* e */ PagerClickEventArgs, Unit]] = js.native
  /** Specifies the position of the showPager in the Rotator Item. See PagerPosition
    * @Default {outside}
    */
  var pagerPosition: js.UndefOr[String | PagerPosition] = js.native
  /** Retrieves data from remote data. This property is applicable only when a remote data source is used.
    * @Default {null}
    */
  var query: js.UndefOr[String] = js.native
  /** If the Rotator Item is an image, you can specify a caption for the Rotator Item. The caption text for each Rotator Item must be set by using the title attribute of the respective
    * tag. The caption cannot be displayed if multiple Rotator Items are present.
    * @Default {false}
    */
  var showCaption: js.UndefOr[Boolean] = js.native
  /** Turns on or off the slide buttons (next and previous) in the Rotator Items. Slide buttons are used to navigate the Rotator Items.
    * @Default {true}
    */
  var showNavigateButton: js.UndefOr[Boolean] = js.native
  /** Turns on or off the pager support in the Rotator control. The Pager is used to navigate the Rotator Items.
    * @Default {true}
    */
  var showPager: js.UndefOr[Boolean] = js.native
  /** Enable play / pause button on rotator.
    * @Default {false}
    */
  var showPlayButton: js.UndefOr[Boolean] = js.native
  /** Turns on or off thumbnail support in the Rotator control. Thumbnail is used to navigate between slides. Thumbnail supports only single slide transition You must specify the source
    * for thumbnail elements through the thumbnailSourceID property.
    * @Default {false}
    */
  var showThumbnail: js.UndefOr[Boolean] = js.native
  /** Sets the height of a Rotator Item.
    */
  var slideHeight: js.UndefOr[String | Double] = js.native
  /** Sets the width of a Rotator Item.
    */
  var slideWidth: js.UndefOr[String | Double] = js.native
  /** This event is fired when enableAutoPlay is started.
    */
  var start: js.UndefOr[js.Function1[/* e */ StartEventArgs, Unit]] = js.native
  /** Sets the index of the slide that must be displayed first.
    * @Default {0}
    */
  var startIndex: js.UndefOr[String | Double] = js.native
  /** This event is fired when autoplay is stopped or paused.
    */
  var stop: js.UndefOr[js.Function1[/* e */ StopEventArgs, Unit]] = js.native
  /** Pause the auto play while hover on the rotator content.
    * @Default {false}
    */
  var stopOnHover: js.UndefOr[Boolean] = js.native
  /** The template to display the Rotator widget with customized appearance.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  /** The templateId enables to bind multiple customized template items in Rotator.
    * @Default {null}
    */
  var templateId: js.UndefOr[js.Array[_]] = js.native
  /** This event is fired when a thumbnail pager is clicked.
    */
  var thumbItemClick: js.UndefOr[js.Function1[/* e */ ThumbItemClickEventArgs, Unit]] = js.native
  /** Specifies the source for thumbnail elements.
    * @Default {null}
    */
  var thumbnailSourceID: js.UndefOr[js.Any] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowKeyboardNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowKeyboardNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowKeyboardNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowKeyboardNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationSpeed(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationType")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* e */ ChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withCircularMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circularMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircularMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circularMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: /* e */ CreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* e */ DestroyEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayItemsCount(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayItemsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayItemsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayItemsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAutoPlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoPlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAutoPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: Fields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameSpace(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigateSteps(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigateSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: Orientation | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPagerClick(value: /* e */ PagerClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPagerClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPagerPosition(value: String | PagerPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagerPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCaption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCaption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCaption")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNavigateButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNavigateButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNavigateButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNavigateButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPager(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPager")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPlayButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPlayButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPlayButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPlayButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowThumbnail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showThumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowThumbnail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showThumbnail")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: /* e */ StartEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStartIndex(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withStop(value: /* e */ StopEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.undefined)
        ret
    }
    @scala.inline
    def withStopOnHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOnHover")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateId(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateId")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbItemClick(value: /* e */ ThumbItemClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbItemClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutThumbItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailSourceID(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailSourceID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailSourceID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailSourceID")(js.undefined)
        ret
    }
  }
  
}

