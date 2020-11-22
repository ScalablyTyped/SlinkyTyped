package typingsSlinky.reactNativeSnapCarousel.mod

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.mod.Animated.AnimatedValue
import typingsSlinky.reactNative.mod.Animated.DecayAnimationConfig
import typingsSlinky.reactNative.mod.Animated.SpringAnimationConfig
import typingsSlinky.reactNative.mod.Animated.TimingAnimationConfig
import typingsSlinky.reactNative.mod.NativeScrollEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSnapCarousel.anon.Index
import typingsSlinky.reactNativeSnapCarousel.anon.InputRange
import typingsSlinky.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.center
import typingsSlinky.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.decay
import typingsSlinky.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.end
import typingsSlinky.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.spring
import typingsSlinky.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.stack
import typingsSlinky.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.start
import typingsSlinky.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.timing
import typingsSlinky.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.tinder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CarouselProps[T] extends js.Object {
  
  // Style and animation
  /**
    * Custom animation options.
    * Note that useNativeDriver will be enabled by default and that opacity's easing will always be kept linear.
    * Setting this prop to something other than null will trigger custom animations and will completely change
    * the way items are animated: rather than having their opacity and scale interpolated based the scroll value (default behavior),
    * they will now play the custom animation you provide as soon as they become active.
    * This means you cannot use props layout, scrollInterpolator or slideInterpolatedStyle in conjunction with activeAnimationOptions
    */
  var activeAnimationOptions: js.UndefOr[DecayAnimationConfig | TimingAnimationConfig | SpringAnimationConfig] = js.native
  
  /**
    * Custom animation type: either 'decay, 'spring' or 'timing'.
    * Note that it will only be applied to the scale animation since opacity's animation type will always be set
    * to timing (no one wants the opacity to 'bounce' around)
    */
  var activeAnimationType: js.UndefOr[decay | spring | timing] = js.native
  
  /**
    * Determine active slide's alignment relative to the carousel
    */
  var activeSlideAlignment: js.UndefOr[start | center | end] = js.native
  
  // Behavior
  /**
    * From slider's center, minimum slide distance to be scrolled before being set to active
    */
  var activeSlideOffset: js.UndefOr[Double] = js.native
  
  /**
    * Duration of time while component is hidden after mounting. NOTE: May cause rendering
    * issues on Android. Defaults to 0
    */
  var apparitionDelay: js.UndefOr[Double] = js.native
  
  // Autoplay
  /**
    * Trigger autoplay on mount
    */
  var autoplay: js.UndefOr[Boolean] = js.native
  
  /**
    * Delay before enabling autoplay on startup & after releasing the touch
    */
  var autoplayDelay: js.UndefOr[Double] = js.native
  
  /**
    * Delay in ms until navigating to the next item
    */
  var autoplayInterval: js.UndefOr[Double] = js.native
  
  /**
    * Defines a small margin for callbacks firing from scroll events.  Increase this value
    * if you experience missed callbacks. Defaults to 5
    */
  var callbackOffsetMargin: js.UndefOr[Double] = js.native
  
  /**
    * Optional styles for Scrollview's global wrapper
    */
  var containerCustomStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Optional styles for Scrollview's items container
    */
  var contentContainerCustomStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  // Required
  /**
    * Array of items to loop over
    */
  var data: js.Array[T] = js.native
  
  /**
    * Since 1.5.0, the snapping effect can now be based on momentum instead of when you're
    * releasing your finger. It means that the component will wait until the ScrollView
    * isn't moving anymore to snap
    */
  var enableMomentum: js.UndefOr[Boolean] = js.native
  
  /**
    * If enabled, releasing the touch will scroll to the center of the nearest/active item
    */
  var enableSnap: js.UndefOr[Boolean] = js.native
  
  /**
    * Index of the first item to display
    */
  var firstItem: js.UndefOr[Double] = js.native
  
  /**
    * Flag to indicate whether the carousel contains `<ParallaxImage />`. Parallax data
    * will not be passed to carousel items if this is false
    */
  var hasParallaxImages: js.UndefOr[Boolean] = js.native
  
  /**
    * Value of the opacity effect applied to inactive slides
    */
  var inactiveSlideOpacity: js.UndefOr[Double] = js.native
  
  /**
    * Value of the 'scale' transform applied to inactive slides
    */
  var inactiveSlideScale: js.UndefOr[Double] = js.native
  
  /**
    * Value of the 'translate' transform applied to inactive slides. Not recommended with
    * `customAnimationOptions`
    */
  var inactiveSlideShift: js.UndefOr[Double] = js.native
  
  /**
    * How many items should be rendered at the start?
    */
  var initialNumToRender: js.UndefOr[Double] = js.native
  
  /**
    * Width in pixels of your slides, must be the same for all of them
    * Note: Required with horizontal carousel
    */
  /**
    * Reverses the direction of scroll. Uses scale transforms of -1.
    */
  var inverted: js.UndefOr[Boolean] = js.native
  
  /**
    * Height in pixels of carousel's items, must be the same for all of them
    * Note: Required with vertical carousel
    */
  var itemHeight: js.UndefOr[Double] = js.native
  
  var itemWidth: js.UndefOr[Double] = js.native
  
  /**
    * Define the way items are rendered and animated.
    * Possible values are 'default', 'stack' and 'tinder'.
    * See this for more info and visual examples.
    * WARNING: setting this prop to either 'stack' or 'tinder' will activate useScrollView to prevent rendering bugs with FlatList.
    * Therefore, those layouts will probably not be suited if you have a large data set.
    */
  var layout: js.UndefOr[
    typingsSlinky.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.default | stack | tinder
  ] = js.native
  
  /**
    * Use to increase or decrease the default card offset in both 'stack' and 'tinder' layouts.
    */
  var layoutCardOffset: js.UndefOr[Double] = js.native
  
  /**
    * Changes default lock's timeout duration in ms.
    */
  var lockScrollTimeoutDuration: js.UndefOr[Double] = js.native
  
  /**
    * Prevent the user from interacting with the carousel while it is snapping. Ignored
    * if `enableMomentum` is `true`
    */
  var lockScrollWhileSnapping: js.UndefOr[Boolean] = js.native
  
  // Loop
  /**
    * Enable infinite loop mode. Does not work if `enableSnap` is `false`
    */
  var loop: js.UndefOr[Boolean] = js.native
  
  /**
    * Number of clones to render at the beginning and end of the list. Default
    * is 3
    */
  var loopClonesPerSide: js.UndefOr[Double] = js.native
  
  /**
    * Callback fired before navigating to an item
    */
  var onBeforeSnapToItem: js.UndefOr[js.Function1[/* slideIndex */ Double, Unit]] = js.native
  
  // Callbacks
  /**
    * Exposed View callback; invoked on mount and layout changes
    */
  var onLayout: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Layout], Unit]] = js.native
  
  /**
    * Exposed ScrollView callback; fired while scrolling
    */
  var onScroll: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeScrollEvent], Unit]] = js.native
  
  /**
    * Callback fired when navigating to an item
    */
  var onSnapToItem: js.UndefOr[js.Function1[/* slideIndex */ Double, Unit]] = js.native
  
  /**
    * Function that takes an item from the `data` array and returns a React
    * Element. See `react-native`'s `FlatList`
    */
  def renderItem(item: Index[T]): ReactElement = js.native
  def renderItem(item: Index[T], parallaxProps: AdditionalParallaxProps): ReactElement = js.native
  
  /**
    * Allow scroll independently of user interaction on carousel. `false` as default.
    */
  var scrollEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * When momentum is disabled, this prop defines the timeframe during which multiple
    * callback calls should be "grouped" into a single one. This debounce also helps
    * smoothing the snap effect by providing a bit of inertia when touch is released..
    * Note that this will delay callback's execution.
    */
  var scrollEndDragDebounceValue: js.UndefOr[Double] = js.native
  
  /**
    * Used to define custom interpolations
    */
  var scrollInterpolator: js.UndefOr[
    js.Function2[/* index */ Double, /* carouselProps */ CarouselProps[_], InputRange]
  ] = js.native
  
  /**
    * Whether to implement a shouldComponentUpdate strategy to minimize updates
    */
  var shouldOptimizeUpdates: js.UndefOr[Boolean] = js.native
  
  /**
    * Used to define custom interpolations
    */
  var slideInterpolatedStyle: js.UndefOr[
    js.Function3[
      /* index */ Double, 
      /* animatedValue */ AnimatedValue, 
      /* carouselProps */ CarouselProps[_], 
      StyleProp[ViewStyle]
    ]
  ] = js.native
  
  /**
    * Optional style for each item's container (the one whose scale and opacity are animated)
    */
  var slideStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Height in pixels of the carousel itself
    * Note: Required with vertical carousel
    */
  var sliderHeight: js.UndefOr[Double] = js.native
  
  /**
    * Width in pixels of your slider
    * Note: Required with horizontal carousel
    */
  var sliderWidth: js.UndefOr[Double] = js.native
  
  /**
    * Delta x when swiping to trigger the snap
    */
  var swipeThreshold: js.UndefOr[Double] = js.native
  
  /**
    * Determines whether to use `ScrollView` instead of `FlatList`. May cause
    * rendering performance issues due to losing `FlatList`'s performance
    * optimizations
    */
  var useScrollView: js.UndefOr[Boolean] = js.native
  
  /*
    * Layout slides vertically instead of horizontally
    */
  var vertical: js.UndefOr[Boolean] = js.native
}
