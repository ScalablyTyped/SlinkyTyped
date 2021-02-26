package typingsSlinky.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rotator extends Widget_ {
  
  var defaults: Model = js.native
  
  /** Disables the Rotator control.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** Enables the Rotator control.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** This method is used to get the current slide index.
    * @returns {number}
    */
  def getIndex(): Double = js.native
  
  /** This method is used to move a slide to the specified index.
    * @param {number} index of an slide
    * @returns {void}
    */
  def gotoIndex(index: Double): Unit = js.native
  
  @JSName("model")
  var model_Rotator: Model = js.native
  
  /** This method is used to pause autoplay.
    * @returns {void}
    */
  def pause(): Unit = js.native
  
  /** This method is used to move slides continuously (or start autoplay) in the specified autoplay direction.
    * @returns {void}
    */
  def play(): Unit = js.native
  
  /** This method is used to move to the next slide from the current slide. If the current slide is the last slide, then the first slide will be treated as the next slide.
    * @returns {void}
    */
  def slideNext(): Unit = js.native
  
  /** This method is used to move to the previous slide from the current slide. If the current slide is the first slide, then the last slide will be treated as the previous slide.
    * @returns {void}
    */
  def slidePrevious(): Unit = js.native
  
  /** This method is used to update/modify the slide content of template rotator by using id based on index value.
    * @param {number} index of an slide
    * @param {string} id of a new updated slide
    * @returns {void}
    */
  def updateTemplateById(index: Double, id: String): Unit = js.native
}
object Rotator {
  
  @js.native
  sealed trait PagerPosition extends StObject
  @JSGlobal("ej.Rotator.PagerPosition")
  @js.native
  object PagerPosition extends StObject {
    
    ///string
    @js.native
    sealed trait BottomLeft extends PagerPosition
    
    ///string
    @js.native
    sealed trait BottomRight extends PagerPosition
    
    ///string
    @js.native
    sealed trait Outside extends PagerPosition
    
    ///string
    @js.native
    sealed trait TopCenter extends PagerPosition
    
    ///string
    @js.native
    sealed trait TopLeft extends PagerPosition
    
    ///string
    @js.native
    sealed trait TopRight extends PagerPosition
  }
  
  @js.native
  trait ChangeEventArgs extends StObject {
    
    /** returns the current slide index.
      */
    var activeItemIndex: js.UndefOr[Double] = js.native
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** the current rotator id.
      */
    var itemId: js.UndefOr[String] = js.native
    
    /** returns the rotator model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ChangeEventArgs {
    
    @scala.inline
    def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    @scala.inline
    implicit class ChangeEventArgsMutableBuilder[Self <: ChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveItemIndex(value: Double): Self = StObject.set(x, "activeItemIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveItemIndexUndefined: Self = StObject.set(x, "activeItemIndex", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CreateEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the rotator model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CreateEventArgs {
    
    @scala.inline
    def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit class CreateEventArgsMutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DestroyEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the rotator model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DestroyEventArgs {
    
    @scala.inline
    def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit class DestroyEventArgsMutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Fields extends StObject {
    
    /** Specifies a link for the image.
      */
    var linkAttribute: js.UndefOr[String] = js.native
    
    /** Specifies where to open a given link.
      */
    var targetAttribute: js.UndefOr[String] = js.native
    
    /** Specifies a caption for the image.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Specifies a caption for the thumbnail image.
      */
    var thumbnailText: js.UndefOr[String] = js.native
    
    /** Specifies the URL for an thumbnail image.
      */
    var thumbnailUrl: js.UndefOr[String] = js.native
    
    /** Specifies the URL for an image.
      */
    var url: js.UndefOr[String] = js.native
  }
  object Fields {
    
    @scala.inline
    def apply(): Fields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLinkAttribute(value: String): Self = StObject.set(x, "linkAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkAttributeUndefined: Self = StObject.set(x, "linkAttribute", js.undefined)
      
      @scala.inline
      def setTargetAttribute(value: String): Self = StObject.set(x, "targetAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetAttributeUndefined: Self = StObject.set(x, "targetAttribute", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setThumbnailText(value: String): Self = StObject.set(x, "thumbnailText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailTextUndefined: Self = StObject.set(x, "thumbnailText", js.undefined)
      
      @scala.inline
      def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
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
    def apply(): typingsSlinky.ejWebAll.ej.Rotator.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.ejWebAll.ej.Rotator.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typingsSlinky.ejWebAll.ej.Rotator.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowKeyboardNavigation(value: Boolean): Self = StObject.set(x, "allowKeyboardNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowKeyboardNavigationUndefined: Self = StObject.set(x, "allowKeyboardNavigation", js.undefined)
      
      @scala.inline
      def setAnimationSpeed(value: String | Double): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationSpeedUndefined: Self = StObject.set(x, "animationSpeed", js.undefined)
      
      @scala.inline
      def setAnimationType(value: String): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
      
      @scala.inline
      def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setCircularMode(value: Boolean): Self = StObject.set(x, "circularMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircularModeUndefined: Self = StObject.set(x, "circularMode", js.undefined)
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setDisplayItemsCount(value: String | Double): Self = StObject.set(x, "displayItemsCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayItemsCountUndefined: Self = StObject.set(x, "displayItemsCount", js.undefined)
      
      @scala.inline
      def setEnableAutoPlay(value: Boolean): Self = StObject.set(x, "enableAutoPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAutoPlayUndefined: Self = StObject.set(x, "enableAutoPlay", js.undefined)
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFrameSpace(value: String | Double): Self = StObject.set(x, "frameSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameSpaceUndefined: Self = StObject.set(x, "frameSpace", js.undefined)
      
      @scala.inline
      def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      @scala.inline
      def setNavigateSteps(value: String | Double): Self = StObject.set(x, "navigateSteps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigateStepsUndefined: Self = StObject.set(x, "navigateSteps", js.undefined)
      
      @scala.inline
      def setOrientation(value: Orientation | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setPagerClick(value: /* e */ PagerClickEventArgs => Unit): Self = StObject.set(x, "pagerClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPagerClickUndefined: Self = StObject.set(x, "pagerClick", js.undefined)
      
      @scala.inline
      def setPagerPosition(value: String | PagerPosition): Self = StObject.set(x, "pagerPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagerPositionUndefined: Self = StObject.set(x, "pagerPosition", js.undefined)
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setShowCaption(value: Boolean): Self = StObject.set(x, "showCaption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCaptionUndefined: Self = StObject.set(x, "showCaption", js.undefined)
      
      @scala.inline
      def setShowNavigateButton(value: Boolean): Self = StObject.set(x, "showNavigateButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNavigateButtonUndefined: Self = StObject.set(x, "showNavigateButton", js.undefined)
      
      @scala.inline
      def setShowPager(value: Boolean): Self = StObject.set(x, "showPager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPagerUndefined: Self = StObject.set(x, "showPager", js.undefined)
      
      @scala.inline
      def setShowPlayButton(value: Boolean): Self = StObject.set(x, "showPlayButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPlayButtonUndefined: Self = StObject.set(x, "showPlayButton", js.undefined)
      
      @scala.inline
      def setShowThumbnail(value: Boolean): Self = StObject.set(x, "showThumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowThumbnailUndefined: Self = StObject.set(x, "showThumbnail", js.undefined)
      
      @scala.inline
      def setSlideHeight(value: String | Double): Self = StObject.set(x, "slideHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideHeightUndefined: Self = StObject.set(x, "slideHeight", js.undefined)
      
      @scala.inline
      def setSlideWidth(value: String | Double): Self = StObject.set(x, "slideWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideWidthUndefined: Self = StObject.set(x, "slideWidth", js.undefined)
      
      @scala.inline
      def setStart(value: /* e */ StartEventArgs => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartIndex(value: String | Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStop(value: /* e */ StopEventArgs => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStopOnHover(value: Boolean): Self = StObject.set(x, "stopOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopOnHoverUndefined: Self = StObject.set(x, "stopOnHover", js.undefined)
      
      @scala.inline
      def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateId(value: js.Array[_]): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
      
      @scala.inline
      def setTemplateIdVarargs(value: js.Any*): Self = StObject.set(x, "templateId", js.Array(value :_*))
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setThumbItemClick(value: /* e */ ThumbItemClickEventArgs => Unit): Self = StObject.set(x, "thumbItemClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setThumbItemClickUndefined: Self = StObject.set(x, "thumbItemClick", js.undefined)
      
      @scala.inline
      def setThumbnailSourceID(value: js.Any): Self = StObject.set(x, "thumbnailSourceID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailSourceIDUndefined: Self = StObject.set(x, "thumbnailSourceID", js.undefined)
    }
  }
  
  @js.native
  trait PagerClickEventArgs extends StObject {
    
    /** returns the current slide index.
      */
    var activeItemIndex: js.UndefOr[Double] = js.native
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** the current rotator id.
      */
    var itemId: js.UndefOr[String] = js.native
    
    /** returns the rotator model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object PagerClickEventArgs {
    
    @scala.inline
    def apply(): PagerClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagerClickEventArgs]
    }
    
    @scala.inline
    implicit class PagerClickEventArgsMutableBuilder[Self <: PagerClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveItemIndex(value: Double): Self = StObject.set(x, "activeItemIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveItemIndexUndefined: Self = StObject.set(x, "activeItemIndex", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait StartEventArgs extends StObject {
    
    /** returns the current slide index.
      */
    var activeItemIndex: js.UndefOr[Double] = js.native
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** the current rotator id.
      */
    var itemId: js.UndefOr[String] = js.native
    
    /** returns the rotator model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object StartEventArgs {
    
    @scala.inline
    def apply(): StartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartEventArgs]
    }
    
    @scala.inline
    implicit class StartEventArgsMutableBuilder[Self <: StartEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveItemIndex(value: Double): Self = StObject.set(x, "activeItemIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveItemIndexUndefined: Self = StObject.set(x, "activeItemIndex", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait StopEventArgs extends StObject {
    
    /** returns the current slide index.
      */
    var activeItemIndex: js.UndefOr[Double] = js.native
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** the current rotator id.
      */
    var itemId: js.UndefOr[String] = js.native
    
    /** returns the rotator model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object StopEventArgs {
    
    @scala.inline
    def apply(): StopEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopEventArgs]
    }
    
    @scala.inline
    implicit class StopEventArgsMutableBuilder[Self <: StopEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveItemIndex(value: Double): Self = StObject.set(x, "activeItemIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveItemIndexUndefined: Self = StObject.set(x, "activeItemIndex", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ThumbItemClickEventArgs extends StObject {
    
    /** returns the current slide index.
      */
    var activeItemIndex: js.UndefOr[Double] = js.native
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** the current rotator id.
      */
    var itemId: js.UndefOr[String] = js.native
    
    /** returns the rotator model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ThumbItemClickEventArgs {
    
    @scala.inline
    def apply(): ThumbItemClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThumbItemClickEventArgs]
    }
    
    @scala.inline
    implicit class ThumbItemClickEventArgsMutableBuilder[Self <: ThumbItemClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveItemIndex(value: Double): Self = StObject.set(x, "activeItemIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveItemIndexUndefined: Self = StObject.set(x, "activeItemIndex", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
