package typingsSlinky.preact.jsxCsstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardLonghandPropertiesFallback[TLength] extends js.Object {
  
  /**
    * The CSS **`align-content`** property sets how the browser distributes space between and around content items along the cross-axis of a flexbox container, and the main-axis of a grid container.
    *
    * **Syntax**: `normal | <baseline-position> | <content-distribution> | <overflow-position>? <content-position>`
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :------: | :-----: | :-------: | :----: | :----: |
    * |  **29**  | **28**  |   **9**   | **12** | **11** |
    * | 21 _-x-_ |         | 6.1 _-x-_ |        |        |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/align-content
    */
  var alignContent: js.UndefOr[AlignContentProperty | js.Array[AlignContentProperty]] = js.native
  
  /**
    * The CSS **`align-items`** property sets the `align-self` value on all direct children as a group. The align-self property sets the alignment of an item within its containing block. In Flexbox it controls the alignment of items on the Cross Axis, in Grid Layout it controls the alignment of items on the Block Axis within their grid area.
    *
    * **Syntax**: `normal | stretch | <baseline-position> | [ <overflow-position>? <self-position> ]`
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :------: | :-----: | :-----: | :----: | :----: |
    * |  **52**  | **20**  |  **9**  | **12** | **11** |
    * | 21 _-x-_ |         | 7 _-x-_ |        |        |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/align-items
    */
  var alignItems: js.UndefOr[AlignItemsProperty | js.Array[AlignItemsProperty]] = js.native
  
  /**
    * The **`align-self`** CSS property aligns flex items of the current flex line overriding the `align-items` value. If any of the item's cross-axis margin is set to `auto`, then `align-self` is ignored. In Grid layout `align-self` aligns the item inside the grid area.
    *
    * **Syntax**: `auto | normal | stretch | <baseline-position> | <overflow-position>? <self-position>`
    *
    * **Initial value**: `auto`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :------: | :-----: | :-------: | :----: | :----: |
    * |  **36**  | **20**  |   **9**   | **12** | **11** |
    * | 21 _-x-_ |         | 6.1 _-x-_ |        |        |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  |      IE      |
    * | :----: | :-----: | :------: | :----: | :----------: |
    * | **57** | **52**  | **10.1** | **16** | **10** _-x-_ |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/align-self
    */
  var alignSelf: js.UndefOr[AlignSelfProperty | js.Array[AlignSelfProperty]] = js.native
  
  /**
    * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **43**  | **16**  |  **9**  | **12** | **10** |
    * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-delay
    */
  var animationDelay: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
    *
    * **Syntax**: `<single-animation-direction>#`
    *
    * **Initial value**: `normal`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **43**  | **16**  |  **9**  | **12** | **10** |
    * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-direction
    */
  var animationDirection: js.UndefOr[AnimationDirectionProperty | js.Array[AnimationDirectionProperty]] = js.native
  
  /**
    * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **43**  | **16**  |  **9**  | **12** | **10** |
    * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-duration
    */
  var animationDuration: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
    *
    * **Syntax**: `<single-animation-fill-mode>#`
    *
    * **Initial value**: `none`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **43**  | **16**  |  **9**  | **12** | **10** |
    * | 3 _-x-_ | 5 _-x-_ | 5 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-fill-mode
    */
  var animationFillMode: js.UndefOr[AnimationFillModeProperty | js.Array[AnimationFillModeProperty]] = js.native
  
  /**
    * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
    *
    * **Syntax**: `<single-animation-iteration-count>#`
    *
    * **Initial value**: `1`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **43**  | **16**  |  **9**  | **12** | **10** |
    * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-iteration-count
    */
  var animationIterationCount: js.UndefOr[AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]] = js.native
  
  /**
    * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
    *
    * **Syntax**: `[ none | <keyframes-name> ]#`
    *
    * **Initial value**: `none`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **43**  | **16**  |  **9**  | **12** | **10** |
    * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-name
    */
  var animationName: js.UndefOr[AnimationNameProperty | js.Array[AnimationNameProperty]] = js.native
  
  /**
    * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
    *
    * **Syntax**: `<single-animation-play-state>#`
    *
    * **Initial value**: `running`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **43**  | **16**  |  **9**  | **12** | **10** |
    * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-play-state
    */
  var animationPlayState: js.UndefOr[AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]] = js.native
  
  /**
    * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **43**  | **16**  |  **9**  | **12** | **10** |
    * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-timing-function
    */
  var animationTimingFunction: js.UndefOr[AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]] = js.native
  
  /**
    * The **`-moz-appearance`** CSS property is used in Gecko (Firefox) to display an element using platform-native styling based on the operating system's theme.
    *
    * **Syntax**: `none | auto | button | textfield | menulist-button | <compat-auto>`
    *
    * **Initial value**: `auto`
    *
    * |   Chrome    |   Firefox   |   Safari    |     Edge     | IE  |
    * | :---------: | :---------: | :---------: | :----------: | :-: |
    * | **1** _-x-_ | **1** _-x-_ | **3** _-x-_ | **12** _-x-_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/appearance
    */
  var appearance: js.UndefOr[AppearanceProperty | js.Array[AppearanceProperty]] = js.native
  
  /**
    * The **`aspect-ratio`**    CSS property sets a _**preferred aspect ratio**_ for the box, which will be used in the calculation of auto sizes and some other layout functions.
    *
    * **Syntax**: `auto | <ratio>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **79** | **71**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/aspect-ratio
    */
  var aspectRatio: js.UndefOr[AspectRatioProperty | js.Array[AspectRatioProperty]] = js.native
  
  /**
    * The **`backdrop-filter`** CSS property lets you apply graphical effects such as blurring or color shifting to the area behind an element. Because it applies to everything _behind_ the element, to see the effect you must make the element or its background at least partially transparent.
    *
    * **Syntax**: `none | <filter-function-list>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |   Safari    |  Edge  | IE  |
    * | :----: | :-----: | :---------: | :----: | :-: |
    * | **76** |   n/a   | **9** _-x-_ | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/backdrop-filter
    */
  var backdropFilter: js.UndefOr[BackdropFilterProperty | js.Array[BackdropFilterProperty]] = js.native
  
  /**
    * The **`backface-visibility`** CSS property sets whether the back face of an element is visible when turned towards the user.
    *
    * **Syntax**: `visible | hidden`
    *
    * **Initial value**: `visible`
    *
    * |  Chrome  | Firefox  |    Safari     |  Edge  |   IE   |
    * | :------: | :------: | :-----------: | :----: | :----: |
    * |  **36**  |  **16**  | **5.1** _-x-_ | **12** | **10** |
    * | 12 _-x-_ | 10 _-x-_ |               |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/backface-visibility
    */
  var backfaceVisibility: js.UndefOr[BackfaceVisibilityProperty | js.Array[BackfaceVisibilityProperty]] = js.native
  
  /**
    * The **`background-attachment`** CSS property sets whether a background image's position is fixed within the viewport, or scrolls with its containing block.
    *
    * **Syntax**: `<attachment>#`
    *
    * **Initial value**: `scroll`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-attachment
    */
  var backgroundAttachment: js.UndefOr[BackgroundAttachmentProperty | js.Array[BackgroundAttachmentProperty]] = js.native
  
  /**
    * The **`background-blend-mode`** CSS property sets how an element's background images should blend with each other and with the element's background color.
    *
    * **Syntax**: `<blend-mode>#`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **35** | **30**  | **8**  | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-blend-mode
    */
  var backgroundBlendMode: js.UndefOr[BackgroundBlendModeProperty | js.Array[BackgroundBlendModeProperty]] = js.native
  
  /**
    * The **`background-clip`** CSS property sets whether an element's background `<color>` or `<image>` extends underneath its border.
    *
    * **Syntax**: `<box>#`
    *
    * **Initial value**: `border-box`
    *
    * | Chrome | Firefox |   Safari    |  Edge  |  IE   |
    * | :----: | :-----: | :---------: | :----: | :---: |
    * | **1**  |  **4**  | **3** _-x-_ | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-clip
    */
  var backgroundClip: js.UndefOr[BackgroundClipProperty | js.Array[BackgroundClipProperty]] = js.native
  
  /**
    * The **`background-color`** CSS property sets the background color of an element.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `transparent`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-color
    */
  var backgroundColor: js.UndefOr[BackgroundColorProperty | js.Array[BackgroundColorProperty]] = js.native
  
  /**
    * The **`background-image`** CSS property sets one or more background images on an element.
    *
    * **Syntax**: `<bg-image>#`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-image
    */
  var backgroundImage: js.UndefOr[BackgroundImageProperty | js.Array[BackgroundImageProperty]] = js.native
  
  /**
    * The **`background-origin`** CSS property sets the _background positioning area_. In other words, it sets the origin position of an image set with the `background-image` property.
    *
    * **Syntax**: `<box>#`
    *
    * **Initial value**: `padding-box`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **4**  | **3**  | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-origin
    */
  var backgroundOrigin: js.UndefOr[BackgroundOriginProperty | js.Array[BackgroundOriginProperty]] = js.native
  
  /**
    * The **`background-position`** CSS property sets the initial position for each background image. The position is relative to the position layer set by `background-origin`.
    *
    * **Syntax**: `<bg-position>#`
    *
    * **Initial value**: `0% 0%`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-position
    */
  var backgroundPosition: js.UndefOr[
    BackgroundPositionProperty[TLength] | js.Array[BackgroundPositionProperty[TLength]]
  ] = js.native
  
  /**
    * The **`background-position-x`** CSS property sets the initial horizontal position for each background image. The position is relative to the position layer set by `background-origin`.
    *
    * **Syntax**: `[ center | [ [ left | right | x-start | x-end ]? <length-percentage>? ]! ]#`
    *
    * **Initial value**: `left`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  | **49**  | **1**  | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-position-x
    */
  var backgroundPositionX: js.UndefOr[
    BackgroundPositionXProperty[TLength] | js.Array[BackgroundPositionXProperty[TLength]]
  ] = js.native
  
  /**
    * The **`background-position-y`** CSS property sets the initial vertical position, relative to the background position layer defined by `background-origin`, for each defined background image.
    *
    * **Syntax**: `[ center | [ [ top | bottom | y-start | y-end ]? <length-percentage>? ]! ]#`
    *
    * **Initial value**: `top`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  | **49**  | **1**  | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-position-y
    */
  var backgroundPositionY: js.UndefOr[
    BackgroundPositionYProperty[TLength] | js.Array[BackgroundPositionYProperty[TLength]]
  ] = js.native
  
  /**
    * The **`background-repeat`** CSS property sets how background images are repeated. A background image can be repeated along the horizontal and vertical axes, or not repeated at all.
    *
    * **Syntax**: `<repeat-style>#`
    *
    * **Initial value**: `repeat`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-repeat
    */
  var backgroundRepeat: js.UndefOr[BackgroundRepeatProperty | js.Array[BackgroundRepeatProperty]] = js.native
  
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Syntax**: `<bg-size>#`
    *
    * **Initial value**: `auto auto`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **3**  |  **4**  |  **5**  | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-size
    */
  var backgroundSize: js.UndefOr[BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]] = js.native
  
  /**
    * **Syntax**: `clip | ellipsis | <string>`
    *
    * **Initial value**: `clip`
    */
  var blockOverflow: js.UndefOr[BlockOverflowProperty | js.Array[BlockOverflowProperty]] = js.native
  
  /**
    * The **`block-size`** CSS property defines the horizontal or vertical size of an element's block, depending on its writing mode. It corresponds to either the `width` or the `height` property, depending on the value of `writing-mode`.
    *
    * **Syntax**: `<'width'>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/block-size
    */
  var blockSize: js.UndefOr[BlockSizeProperty[TLength] | js.Array[BlockSizeProperty[TLength]]] = js.native
  
  /**
    * The **`border-block-color`** CSS property defines the color of the logical block borders of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color` and `border-bottom-color`, or `border-right-color` and `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-color'>{1,2}`
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-color
    */
  var borderBlockColor: js.UndefOr[BorderBlockColorProperty | js.Array[BorderBlockColorProperty]] = js.native
  
  /**
    * The **`border-block-end-color`** CSS property defines the color of the logical block-end border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-color'>`
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end-color
    */
  var borderBlockEndColor: js.UndefOr[BorderBlockEndColorProperty | js.Array[BorderBlockEndColorProperty]] = js.native
  
  /**
    * The **`border-block-end-style`** CSS property defines the style of the logical block end border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-style'>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end-style
    */
  var borderBlockEndStyle: js.UndefOr[BorderBlockEndStyleProperty | js.Array[BorderBlockEndStyleProperty]] = js.native
  
  /**
    * The **`border-block-end-width`** CSS property defines the width of the logical block-end border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-width'>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end-width
    */
  var borderBlockEndWidth: js.UndefOr[
    BorderBlockEndWidthProperty[TLength] | js.Array[BorderBlockEndWidthProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-block-start-color`** CSS property defines the color of the logical block-start border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-color'>`
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start-color
    */
  var borderBlockStartColor: js.UndefOr[BorderBlockStartColorProperty | js.Array[BorderBlockStartColorProperty]] = js.native
  
  /**
    * The **`border-block-start-style`** CSS property defines the style of the logical block start border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-style'>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start-style
    */
  var borderBlockStartStyle: js.UndefOr[BorderBlockStartStyleProperty | js.Array[BorderBlockStartStyleProperty]] = js.native
  
  /**
    * The **`border-block-start-width`** CSS property defines the width of the logical block-start border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-width'>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start-width
    */
  var borderBlockStartWidth: js.UndefOr[
    BorderBlockStartWidthProperty[TLength] | js.Array[BorderBlockStartWidthProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-block-style`** CSS property defines the style of the logical block borders of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style` and `border-bottom-style`, or `border-left-style` and `border-right-style` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-style'>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **66**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-style
    */
  var borderBlockStyle: js.UndefOr[BorderBlockStyleProperty | js.Array[BorderBlockStyleProperty]] = js.native
  
  /**
    * The **`border-block-width`** CSS property defines the width of the logical block borders of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width` and `border-bottom-width`, or `border-left-width`, and `border-right-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-width'>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **66**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-width
    */
  var borderBlockWidth: js.UndefOr[BorderBlockWidthProperty[TLength] | js.Array[BorderBlockWidthProperty[TLength]]] = js.native
  
  /**
    * The **`border-bottom-color`** CSS property sets the color of an element's bottom border. It can also be set with the shorthand CSS properties `border-color` or `border-bottom`.
    *
    * **Syntax**: `<'border-top-color'>`
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-color
    */
  var borderBottomColor: js.UndefOr[BorderBottomColorProperty | js.Array[BorderBottomColorProperty]] = js.native
  
  /**
    * The **`border-bottom-left-radius`** CSS property rounds the bottom-left corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **4**  |  **4**  |  **5**  | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-left-radius
    */
  var borderBottomLeftRadius: js.UndefOr[
    BorderBottomLeftRadiusProperty[TLength] | js.Array[BorderBottomLeftRadiusProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-bottom-right-radius`** CSS property rounds the bottom-right corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **4**  |  **4**  |  **5**  | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-right-radius
    */
  var borderBottomRightRadius: js.UndefOr[
    BorderBottomRightRadiusProperty[TLength] | js.Array[BorderBottomRightRadiusProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-bottom-style`** CSS property sets the line style of an element's bottom `border`.
    *
    * **Syntax**: `<line-style>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-style
    */
  var borderBottomStyle: js.UndefOr[BorderBottomStyleProperty | js.Array[BorderBottomStyleProperty]] = js.native
  
  /**
    * The **`border-bottom-width`** CSS property sets the width of the bottom border of a box.
    *
    * **Syntax**: `<line-width>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-width
    */
  var borderBottomWidth: js.UndefOr[
    BorderBottomWidthProperty[TLength] | js.Array[BorderBottomWidthProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-collapse`** CSS property sets whether cells inside a `<table>` have shared or separate borders.
    *
    * **Syntax**: `collapse | separate`
    *
    * **Initial value**: `separate`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-collapse
    */
  var borderCollapse: js.UndefOr[BorderCollapseProperty | js.Array[BorderCollapseProperty]] = js.native
  
  /**
    * The **`border-end-end-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius that depends on on the element's `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-end-end-radius
    */
  var borderEndEndRadius: js.UndefOr[
    BorderEndEndRadiusProperty[TLength] | js.Array[BorderEndEndRadiusProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-end-start-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius depending on the element's `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-end-start-radius
    */
  var borderEndStartRadius: js.UndefOr[
    BorderEndStartRadiusProperty[TLength] | js.Array[BorderEndStartRadiusProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-image-outset`** CSS property sets the distance by which an element's border image is set out from its border box.
    *
    * **Syntax**: `[ <length> | <number> ]{1,4}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-outset
    */
  var borderImageOutset: js.UndefOr[
    BorderImageOutsetProperty[TLength] | js.Array[BorderImageOutsetProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-image-repeat`** CSS property defines how the edge regions of a source image are adjusted to fit the dimensions of an element's border image.
    *
    * **Syntax**: `[ stretch | repeat | round | space ]{1,2}`
    *
    * **Initial value**: `stretch`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-repeat
    */
  var borderImageRepeat: js.UndefOr[BorderImageRepeatProperty | js.Array[BorderImageRepeatProperty]] = js.native
  
  /**
    * The **`border-image-slice`** CSS property divides the image specified by `border-image-source` into regions. These regions form the components of an element's border image.
    *
    * **Syntax**: `<number-percentage>{1,4} && fill?`
    *
    * **Initial value**: `100%`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-slice
    */
  var borderImageSlice: js.UndefOr[BorderImageSliceProperty | js.Array[BorderImageSliceProperty]] = js.native
  
  /**
    * The **`border-image-source`** CSS property sets the source image used to create an element's border image.
    *
    * **Syntax**: `none | <image>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-source
    */
  var borderImageSource: js.UndefOr[BorderImageSourceProperty | js.Array[BorderImageSourceProperty]] = js.native
  
  /**
    * The **`border-image-width`** CSS property sets the width of an element's border image.
    *
    * **Syntax**: `[ <length-percentage> | <number> | auto ]{1,4}`
    *
    * **Initial value**: `1`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **13**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-width
    */
  var borderImageWidth: js.UndefOr[BorderImageWidthProperty[TLength] | js.Array[BorderImageWidthProperty[TLength]]] = js.native
  
  /**
    * The **`border-inline-color`** CSS property defines the color of the logical inline borders of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color` and `border-bottom-color`, or `border-right-color` and `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-color'>{1,2}`
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **66**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-color
    */
  var borderInlineColor: js.UndefOr[BorderInlineColorProperty | js.Array[BorderInlineColorProperty]] = js.native
  
  /**
    * The **`border-inline-end-color`** CSS property defines the color of the logical inline-end border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-color'>`
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome |           Firefox           |  Safari  |  Edge  | IE  |
    * | :----: | :-------------------------: | :------: | :----: | :-: |
    * | **69** |           **41**            | **12.1** | **79** | No  |
    * |        | 3 _(-moz-border-end-color)_ |          |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end-color
    */
  var borderInlineEndColor: js.UndefOr[BorderInlineEndColorProperty | js.Array[BorderInlineEndColorProperty]] = js.native
  
  /**
    * The **`border-inline-end-style`** CSS property defines the style of the logical inline end border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-style'>`
    *
    * **Initial value**: `none`
    *
    * | Chrome |           Firefox           |  Safari  |  Edge  | IE  |
    * | :----: | :-------------------------: | :------: | :----: | :-: |
    * | **69** |           **41**            | **12.1** | **79** | No  |
    * |        | 3 _(-moz-border-end-style)_ |          |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end-style
    */
  var borderInlineEndStyle: js.UndefOr[BorderInlineEndStyleProperty | js.Array[BorderInlineEndStyleProperty]] = js.native
  
  /**
    * The **`border-inline-end-width`** CSS property defines the width of the logical inline-end border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-width'>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome |           Firefox           |  Safari  |  Edge  | IE  |
    * | :----: | :-------------------------: | :------: | :----: | :-: |
    * | **69** |           **41**            | **12.1** | **79** | No  |
    * |        | 3 _(-moz-border-end-width)_ |          |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end-width
    */
  var borderInlineEndWidth: js.UndefOr[
    BorderInlineEndWidthProperty[TLength] | js.Array[BorderInlineEndWidthProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-inline-start-color`** CSS property defines the color of the logical inline start border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-color'>`
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome |            Firefox            |  Safari  |  Edge  | IE  |
    * | :----: | :---------------------------: | :------: | :----: | :-: |
    * | **69** |            **41**             | **12.1** | **79** | No  |
    * |        | 3 _(-moz-border-start-color)_ |          |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start-color
    */
  var borderInlineStartColor: js.UndefOr[BorderInlineStartColorProperty | js.Array[BorderInlineStartColorProperty]] = js.native
  
  /**
    * The **`border-inline-start-style`** CSS property defines the style of the logical inline start border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-style'>`
    *
    * **Initial value**: `none`
    *
    * | Chrome |            Firefox            |  Safari  |  Edge  | IE  |
    * | :----: | :---------------------------: | :------: | :----: | :-: |
    * | **69** |            **41**             | **12.1** | **79** | No  |
    * |        | 3 _(-moz-border-start-style)_ |          |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start-style
    */
  var borderInlineStartStyle: js.UndefOr[BorderInlineStartStyleProperty | js.Array[BorderInlineStartStyleProperty]] = js.native
  
  /**
    * The **`border-inline-start-width`** CSS property defines the width of the logical inline-start border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-width'>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start-width
    */
  var borderInlineStartWidth: js.UndefOr[
    BorderInlineStartWidthProperty[TLength] | js.Array[BorderInlineStartWidthProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-inline-style`** CSS property defines the style of the logical inline borders of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style` and `border-bottom-style`, or `border-left-style` and `border-right-style` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-style'>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **66**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-style
    */
  var borderInlineStyle: js.UndefOr[BorderInlineStyleProperty | js.Array[BorderInlineStyleProperty]] = js.native
  
  /**
    * The **`border-inline-width`** CSS property defines the width of the logical inline borders of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width` and `border-bottom-width`, or `border-left-width`, and `border-right-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-width'>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **66**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-width
    */
  var borderInlineWidth: js.UndefOr[
    BorderInlineWidthProperty[TLength] | js.Array[BorderInlineWidthProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-left-color`** CSS property sets the color of an element's left border. It can also be set with the shorthand CSS properties `border-color` or `border-left`.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left-color
    */
  var borderLeftColor: js.UndefOr[BorderLeftColorProperty | js.Array[BorderLeftColorProperty]] = js.native
  
  /**
    * The **`border-left-style`** CSS property sets the line style of an element's left `border`.
    *
    * **Syntax**: `<line-style>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left-style
    */
  var borderLeftStyle: js.UndefOr[BorderLeftStyleProperty | js.Array[BorderLeftStyleProperty]] = js.native
  
  /**
    * The **`border-left-width`** CSS property sets the width of the left border of an element.
    *
    * **Syntax**: `<line-width>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left-width
    */
  var borderLeftWidth: js.UndefOr[BorderLeftWidthProperty[TLength] | js.Array[BorderLeftWidthProperty[TLength]]] = js.native
  
  /**
    * The **`border-right-color`** CSS property sets the color of an element's right border. It can also be set with the shorthand CSS properties `border-color` or `border-right`.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right-color
    */
  var borderRightColor: js.UndefOr[BorderRightColorProperty | js.Array[BorderRightColorProperty]] = js.native
  
  /**
    * The **`border-right-style`** CSS property sets the line style of an element's right `border`.
    *
    * **Syntax**: `<line-style>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right-style
    */
  var borderRightStyle: js.UndefOr[BorderRightStyleProperty | js.Array[BorderRightStyleProperty]] = js.native
  
  /**
    * The **`border-right-width`** CSS property sets the width of the right border of an element.
    *
    * **Syntax**: `<line-width>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right-width
    */
  var borderRightWidth: js.UndefOr[BorderRightWidthProperty[TLength] | js.Array[BorderRightWidthProperty[TLength]]] = js.native
  
  /**
    * The **`border-spacing`** CSS property sets the distance between the borders of adjacent `<table>` cells. This property applies only when `border-collapse` is `separate`.
    *
    * **Syntax**: `<length> <length>?`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-spacing
    */
  var borderSpacing: js.UndefOr[BorderSpacingProperty[TLength] | js.Array[BorderSpacingProperty[TLength]]] = js.native
  
  /**
    * The **`border-start-end-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius depending on the element's `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-start-end-radius
    */
  var borderStartEndRadius: js.UndefOr[
    BorderStartEndRadiusProperty[TLength] | js.Array[BorderStartEndRadiusProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-start-start-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius that depends on the element's `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-start-start-radius
    */
  var borderStartStartRadius: js.UndefOr[
    BorderStartStartRadiusProperty[TLength] | js.Array[BorderStartStartRadiusProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-top-color`** CSS property sets the color of an element's top border. It can also be set with the shorthand CSS properties `border-color` or `border-top`.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-color
    */
  var borderTopColor: js.UndefOr[BorderTopColorProperty | js.Array[BorderTopColorProperty]] = js.native
  
  /**
    * The **`border-top-left-radius`** CSS property rounds the top-left corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **4**  |  **4**  |  **5**  | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-left-radius
    */
  var borderTopLeftRadius: js.UndefOr[
    BorderTopLeftRadiusProperty[TLength] | js.Array[BorderTopLeftRadiusProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-top-right-radius`** CSS property rounds the top-right corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **4**  |  **4**  |  **5**  | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-right-radius
    */
  var borderTopRightRadius: js.UndefOr[
    BorderTopRightRadiusProperty[TLength] | js.Array[BorderTopRightRadiusProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-top-style`** CSS property sets the line style of an element's top `border`.
    *
    * **Syntax**: `<line-style>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-style
    */
  var borderTopStyle: js.UndefOr[BorderTopStyleProperty | js.Array[BorderTopStyleProperty]] = js.native
  
  /**
    * The **`border-top-width`** CSS property sets the width of the top border of an element.
    *
    * **Syntax**: `<line-width>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-width
    */
  var borderTopWidth: js.UndefOr[BorderTopWidthProperty[TLength] | js.Array[BorderTopWidthProperty[TLength]]] = js.native
  
  /**
    * The **`bottom`** CSS property participates in specifying the vertical position of a _positioned element_. It has no effect on non-positioned elements.
    *
    * **Syntax**: `<length> | <percentage> | auto`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/bottom
    */
  var bottom: js.UndefOr[BottomProperty[TLength] | js.Array[BottomProperty[TLength]]] = js.native
  
  /**
    * The **`box-decoration-break`** CSS property specifies how an element's fragments should be rendered when broken across multiple lines, columns, or pages.
    *
    * **Syntax**: `slice | clone`
    *
    * **Initial value**: `slice`
    *
    * |    Chrome    | Firefox |    Safari     |     Edge     | IE  |
    * | :----------: | :-----: | :-----------: | :----------: | :-: |
    * | **22** _-x-_ | **32**  | **6.1** _-x-_ | **79** _-x-_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/box-decoration-break
    */
  var boxDecorationBreak: js.UndefOr[BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty]] = js.native
  
  /**
    * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii, and color.
    *
    * **Syntax**: `none | <shadow>#`
    *
    * **Initial value**: `none`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * | **10**  |  **4**  | **5.1** | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/box-shadow
    */
  var boxShadow: js.UndefOr[BoxShadowProperty | js.Array[BoxShadowProperty]] = js.native
  
  /**
    * The **`box-sizing`** CSS property defines how the user agent should calculate the total width and height of an element.
    *
    * **Syntax**: `content-box | border-box`
    *
    * **Initial value**: `content-box`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * | **10**  | **29**  | **5.1** | **12** | **8** |
    * | 1 _-x-_ | 1 _-x-_ | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/box-sizing
    */
  var boxSizing: js.UndefOr[BoxSizingProperty | js.Array[BoxSizingProperty]] = js.native
  
  /**
    * The **`break-after`** CSS property defines how page, column, or region breaks should behave after a generated box. If there is no generated box, the property is ignored.
    *
    * **Syntax**: `auto | avoid | always | all | avoid-page | page | left | right | recto | verso | avoid-column | column | avoid-region | region`
    *
    * **Initial value**: `auto`
    *
    * ---
    *
    * _Supported in Multi-column Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** |   No    |   No   | **12** | **10** |
    *
    * ---
    *
    * _Supported in Paged Media_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** | **65**  | **10** | **12** | **10** |
    *
    * ---
    *
    * _Supported in CSS Regions_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    |   No   |  No  | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/break-after
    */
  var breakAfter: js.UndefOr[BreakAfterProperty | js.Array[BreakAfterProperty]] = js.native
  
  /**
    * The **`break-before`** CSS property sets how page, column, or region breaks should behave before a generated box. If there is no generated box, the property is ignored.
    *
    * **Syntax**: `auto | avoid | always | all | avoid-page | page | left | right | recto | verso | avoid-column | column | avoid-region | region`
    *
    * **Initial value**: `auto`
    *
    * ---
    *
    * _Supported in Multi-column Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** | **65**  |   No   | **12** | **10** |
    *
    * ---
    *
    * _Supported in Paged Media_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** | **65**  | **10** | **12** | **10** |
    *
    * ---
    *
    * _Supported in CSS Regions_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    |   No   |  No  | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/break-before
    */
  var breakBefore: js.UndefOr[BreakBeforeProperty | js.Array[BreakBeforeProperty]] = js.native
  
  /**
    * The **`break-inside`** CSS property defines how page, column, or region breaks should behave inside a generated box. If there is no generated box, the property is ignored.
    *
    * **Syntax**: `auto | avoid | avoid-page | avoid-column | avoid-region`
    *
    * **Initial value**: `auto`
    *
    * ---
    *
    * _Supported in Multi-column Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** | **65**  | **10** | **12** | **10** |
    *
    * ---
    *
    * _Supported in Paged Media_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** | **65**  | **10** | **12** | **10** |
    *
    * ---
    *
    * _Supported in CSS Regions_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    |   No   |  No  | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/break-inside
    */
  var breakInside: js.UndefOr[BreakInsideProperty | js.Array[BreakInsideProperty]] = js.native
  
  /**
    * The **`caption-side`** CSS property puts the content of a table's `<caption>` on the specified side. The values are relative to the `writing-mode` of the table.
    *
    * **Syntax**: `top | bottom | block-start | block-end | inline-start | inline-end`
    *
    * **Initial value**: `top`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/caption-side
    */
  var captionSide: js.UndefOr[CaptionSideProperty | js.Array[CaptionSideProperty]] = js.native
  
  /**
    * The **`caret-color`** CSS property sets the color of the insertion caret, the visible marker where the next character typed will be inserted. The caret appears in elements such as `<input>` or those with the `contenteditable` attribute. The caret is typically a thin vertical line that flashes to help make it more noticeable. By default, it is black, but its color can be altered with this property.
    *
    * **Syntax**: `auto | <color>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **53**  | **11.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/caret-color
    */
  var caretColor: js.UndefOr[CaretColorProperty | js.Array[CaretColorProperty]] = js.native
  
  /**
    * The **`clear`** CSS property sets whether an element must be moved below (cleared) floating elements that precede it. The `clear` property applies to floating and non-floating elements.
    *
    * **Syntax**: `none | left | right | both | inline-start | inline-end`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/clear
    */
  var clear: js.UndefOr[ClearProperty | js.Array[ClearProperty]] = js.native
  
  /**
    * The `**clip-path**` CSS property creates a clipping region that sets what part of an element should be shown. Parts that are inside the region are shown, while those outside are hidden.
    *
    * **Syntax**: `<clip-source> | [ <basic-shape> || <geometry-box> ] | none`
    *
    * **Initial value**: `none`
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :------: | :-----: | :-------: | :----: | :----: |
    * |  **55**  | **3.5** |  **9.1**  | **12** | **10** |
    * | 23 _-x-_ |         | 6.1 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/clip-path
    */
  var clipPath: js.UndefOr[ClipPathProperty | js.Array[ClipPathProperty]] = js.native
  
  /**
    * The **`color`** CSS property sets the foreground color value of an element's text and text decorations, and sets the `currentcolor` value. `currentcolor` may be used as an indirect value on _other_ properties and is the default for other color properties, such as `border-color`.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: Varies from one browser to another
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/color
    */
  var color: js.UndefOr[ColorProperty | js.Array[ColorProperty]] = js.native
  
  /**
    * The **`color-adjust`** CSS property sets what, if anything, the user agent may do to optimize the appearance of the element on the output device. By default, the browser is allowed to make any adjustments to the element's appearance it determines to be necessary and prudent given the type and capabilities of the output device.
    *
    * **Syntax**: `economy | exact`
    *
    * **Initial value**: `economy`
    *
    * |                Chrome                 | Firefox |                Safari                |                 Edge                  | IE  |
    * | :-----------------------------------: | :-----: | :----------------------------------: | :-----------------------------------: | :-: |
    * | **49** _(-webkit-print-color-adjust)_ | **48**  | **6** _(-webkit-print-color-adjust)_ | **79** _(-webkit-print-color-adjust)_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/color-adjust
    */
  var colorAdjust: js.UndefOr[ColorAdjustProperty | js.Array[ColorAdjustProperty]] = js.native
  
  /**
    * The **`column-count`** CSS property breaks an element's content into the specified number of columns.
    *
    * **Syntax**: `<integer> | auto`
    *
    * **Initial value**: `auto`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **50**  | **52**  |  **9**  | **12** | **10** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-count
    */
  var columnCount: js.UndefOr[ColumnCountProperty | js.Array[ColumnCountProperty]] = js.native
  
  /**
    * The **`column-fill`** CSS property controls how an element's contents are balanced when broken into columns.
    *
    * **Syntax**: `auto | balance | balance-all`
    *
    * **Initial value**: `balance`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE   |
    * | :----: | :-----: | :-----: | :----: | :----: |
    * | **50** | **52**  |  **9**  | **12** | **10** |
    * |        |         | 8 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-fill
    */
  var columnFill: js.UndefOr[ColumnFillProperty | js.Array[ColumnFillProperty]] = js.native
  
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * **Syntax**: `normal | <length-percentage>`
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox |   Safari    | Edge | IE  |
    * | :----: | :-----: | :---------: | :--: | :-: |
    * |   No   | **63**  | **3** _-x-_ |  No  | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * |     Chrome      |     Firefox     |        Safari         |  Edge  | IE  |
    * | :-------------: | :-------------: | :-------------------: | :----: | :-: |
    * |     **66**      |     **61**      | **10.1** _(grid-gap)_ | **16** | No  |
    * | 57 _(grid-gap)_ | 52 _(grid-gap)_ |                       |        |     |
    *
    * ---
    *
    * _Supported in Multi-column Layout_
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **50**  | **52**  | **10**  | **12** | **10** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |        |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-gap
    */
  var columnGap: js.UndefOr[ColumnGapProperty[TLength] | js.Array[ColumnGapProperty[TLength]]] = js.native
  
  /**
    * The **`column-rule-color`** CSS property sets the color of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **50**  | **52**  |  **9**  | **12** | **10** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule-color
    */
  var columnRuleColor: js.UndefOr[ColumnRuleColorProperty | js.Array[ColumnRuleColorProperty]] = js.native
  
  /**
    * The **`column-rule-style`** CSS property sets the style of the line drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'border-style'>`
    *
    * **Initial value**: `none`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **50**  | **52**  |  **9**  | **12** | **10** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule-style
    */
  var columnRuleStyle: js.UndefOr[ColumnRuleStyleProperty | js.Array[ColumnRuleStyleProperty]] = js.native
  
  /**
    * The **`column-rule-width`** CSS property sets the width of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'border-width'>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **50**  | **52**  |  **9**  | **12** | **10** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule-width
    */
  var columnRuleWidth: js.UndefOr[ColumnRuleWidthProperty[TLength] | js.Array[ColumnRuleWidthProperty[TLength]]] = js.native
  
  /**
    * The **`column-span`** CSS property makes it possible for an element to span across all columns when its value is set to `all`.
    *
    * **Syntax**: `none | all`
    *
    * **Initial value**: `none`
    *
    * | Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :-----: | :-----: | :-------: | :----: | :----: |
    * | **50**  | **71**  |   **9**   | **12** | **10** |
    * | 6 _-x-_ |         | 5.1 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-span
    */
  var columnSpan: js.UndefOr[ColumnSpanProperty | js.Array[ColumnSpanProperty]] = js.native
  
  /**
    * The **`column-width`** CSS property specifies the ideal column width in a multi-column layout. The container will have as many columns as can fit without any of them having a width less than the `column-width` value. If the width of the container is narrower than the specified value, the single column's width will be smaller than the declared column width.
    *
    * **Syntax**: `<length> | auto`
    *
    * **Initial value**: `auto`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **50**  | **50**  |  **9**  | **12** | **10** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-width
    */
  var columnWidth: js.UndefOr[ColumnWidthProperty[TLength] | js.Array[ColumnWidthProperty[TLength]]] = js.native
  
  /**
    * The **`contain`** CSS property allows an author to indicate that an element and its contents are, as much as possible, _independent_ of the rest of the document tree. This allows the browser to recalculate layout, style, paint, size, or any combination of them for a limited area of the DOM and not the entire page.
    *
    * **Syntax**: `none | strict | content | [ size || layout || style || paint ]`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **52** | **69**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/contain
    */
  var contain: js.UndefOr[ContainProperty | js.Array[ContainProperty]] = js.native
  
  /**
    * The **`content`** CSS property replaces an element with a generated value. Objects inserted using the `content` property are _anonymous replaced elements._
    *
    * **Syntax**: `normal | none | [ <content-replacement> | <content-list> ] [/ <string> ]?`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/content
    */
  var content: js.UndefOr[ContentProperty | js.Array[ContentProperty]] = js.native
  
  /**
    * The **`counter-increment`** CSS property increases or decreases the value of a CSS counter by a given value.
    *
    * **Syntax**: `[ <custom-ident> <integer>? ]+ | none`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **2**  |  **1**  | **3**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/counter-increment
    */
  var counterIncrement: js.UndefOr[CounterIncrementProperty | js.Array[CounterIncrementProperty]] = js.native
  
  /**
    * The **`counter-reset`** CSS property resets a CSS counter to a given value.
    *
    * **Syntax**: `[ <custom-ident> <integer>? ]+ | none`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **2**  |  **1**  | **3**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/counter-reset
    */
  var counterReset: js.UndefOr[CounterResetProperty | js.Array[CounterResetProperty]] = js.native
  
  /**
    * The **`counter-set`** CSS property sets a CSS counter to a given value. It manipulates the value of existing counters, and will only create new counters if there isn't already a counter of the given name on the element.
    *
    * **Syntax**: `[ <custom-ident> <integer>? ]+ | none`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **68**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/counter-set
    */
  var counterSet: js.UndefOr[CounterSetProperty | js.Array[CounterSetProperty]] = js.native
  
  /**
    * The **`cursor`** CSS property sets mouse cursor to display when the mouse pointer is over an element.
    *
    * **Syntax**: `[ [ <url> [ <x> <y> ]? , ]* [ auto | default | none | context-menu | help | pointer | progress | wait | cell | crosshair | text | vertical-text | alias | copy | move | no-drop | not-allowed | e-resize | n-resize | ne-resize | nw-resize | s-resize | se-resize | sw-resize | w-resize | ew-resize | ns-resize | nesw-resize | nwse-resize | col-resize | row-resize | all-scroll | zoom-in | zoom-out | grab | grabbing ] ]`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/cursor
    */
  var cursor: js.UndefOr[CursorProperty | js.Array[CursorProperty]] = js.native
  
  /**
    * The **`direction`** CSS property sets the direction of text, table columns, and horizontal overflow. Use `rtl` for languages written from right to left (like Hebrew or Arabic), and `ltr` for those written from left to right (like English and most other languages).
    *
    * **Syntax**: `ltr | rtl`
    *
    * **Initial value**: `ltr`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **2**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/direction
    */
  var direction: js.UndefOr[DirectionProperty | js.Array[DirectionProperty]] = js.native
  
  /**
    * The **`display`** CSS property defines the _display type_ of an element, which consists of the two basic qualities of how an element generates boxes — the **outer display type** defining how the box participates in flow layout, and the **inner display type** defining how the children of the box are laid out.
    *
    * **Syntax**: `[ <display-outside> || <display-inside> ] | <display-listitem> | <display-internal> | <display-box> | <display-legacy>`
    *
    * **Initial value**: `inline`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/display
    */
  var display: js.UndefOr[DisplayProperty | js.Array[DisplayProperty]] = js.native
  
  /**
    * The **`empty-cells`** CSS property sets whether borders and backgrounds appear around `<table>` cells that have no visible content.
    *
    * **Syntax**: `show | hide`
    *
    * **Initial value**: `show`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/empty-cells
    */
  var emptyCells: js.UndefOr[EmptyCellsProperty | js.Array[EmptyCellsProperty]] = js.native
  
  /**
    * The **`filter`** CSS property applies graphical effects like blur or color shift to an element. Filters are commonly used to adjust the rendering of images, backgrounds, and borders.
    *
    * **Syntax**: `none | <filter-function-list>`
    *
    * **Initial value**: `none`
    *
    * |  Chrome  | Firefox | Safari  |  Edge  | IE  |
    * | :------: | :-----: | :-----: | :----: | :-: |
    * |  **53**  | **35**  | **9.1** | **12** | No  |
    * | 18 _-x-_ |         | 6 _-x-_ |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/filter
    */
  var filter: js.UndefOr[FilterProperty | js.Array[FilterProperty]] = js.native
  
  /**
    * The **`flex-basis`** CSS property sets the initial main size of a flex item. It sets the size of the content box unless otherwise set with `box-sizing`.
    *
    * **Syntax**: `content | <'width'>`
    *
    * **Initial value**: `auto`
    *
    * |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :------: | :-----: | :-----: | :----: | :----: |
    * |  **29**  | **22**  |  **9**  | **12** | **11** |
    * | 22 _-x-_ |         | 7 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-basis
    */
  var flexBasis: js.UndefOr[FlexBasisProperty[TLength] | js.Array[FlexBasisProperty[TLength]]] = js.native
  
  /**
    * The **`flex-direction`** CSS property sets how flex items are placed in the flex container defining the main axis and the direction (normal or reversed).
    *
    * **Syntax**: `row | row-reverse | column | column-reverse`
    *
    * **Initial value**: `row`
    *
    * |  Chrome  | Firefox | Safari  |  Edge  |    IE    |
    * | :------: | :-----: | :-----: | :----: | :------: |
    * |  **29**  | **20**  |  **9**  | **12** |  **11**  |
    * | 21 _-x-_ |         | 7 _-x-_ |        | 10 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-direction
    */
  var flexDirection: js.UndefOr[FlexDirectionProperty | js.Array[FlexDirectionProperty]] = js.native
  
  /**
    * The **`flex-grow`** CSS property sets how much of the available space in the flex container should be assigned to that item (the flex grow factor). If all sibling items have the same flex grow factor, then all items will receive the same share of available space, otherwise it is distributed according to the ratio defined by the different flex grow factors.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |            IE            |
    * | :------: | :-----: | :-------: | :----: | :----------------------: |
    * |  **29**  | **20**  |   **9**   | **12** |          **11**          |
    * | 22 _-x-_ |         | 6.1 _-x-_ |        | 10 _(-ms-flex-positive)_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-grow
    */
  var flexGrow: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`flex-shrink`** CSS property sets the flex shrink factor of a flex item. If the size of flex items is larger than the flex container, items shrink to fit according to `flex-shrink`.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `1`
    *
    * |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :------: | :-----: | :-----: | :----: | :----: |
    * |  **29**  | **20**  |  **9**  | **12** | **10** |
    * | 22 _-x-_ |         | 8 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-shrink
    */
  var flexShrink: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`flex-wrap`** CSS property sets whether flex items are forced onto one line or can wrap onto multiple lines. If wrapping is allowed, it sets the direction that lines are stacked.
    *
    * **Syntax**: `nowrap | wrap | wrap-reverse`
    *
    * **Initial value**: `nowrap`
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :------: | :-----: | :-------: | :----: | :----: |
    * |  **29**  | **28**  |   **9**   | **12** | **11** |
    * | 21 _-x-_ |         | 6.1 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-wrap
    */
  var flexWrap: js.UndefOr[FlexWrapProperty | js.Array[FlexWrapProperty]] = js.native
  
  /**
    * The **`float`** CSS property places an element on the left or right side of its container, allowing text and inline elements to wrap around it. The element is removed from the normal flow of the page, though still remaining a part of the flow (in contrast to absolute positioning).
    *
    * **Syntax**: `left | right | none | inline-start | inline-end`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/float
    */
  var float: js.UndefOr[FloatProperty | js.Array[FloatProperty]] = js.native
  
  /**
    * The **`font-family`** CSS property specifies a prioritized list of one or more font family names and/or generic family names for the selected element.
    *
    * **Syntax**: `[ <family-name> | <generic-family> ]#`
    *
    * **Initial value**: depends on user agent
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-family
    */
  var fontFamily: js.UndefOr[FontFamilyProperty | js.Array[FontFamilyProperty]] = js.native
  
  /**
    * The **`font-feature-settings`** CSS property controls advanced typographic features in OpenType fonts.
    *
    * **Syntax**: `normal | <feature-tag-value>#`
    *
    * **Initial value**: `normal`
    *
    * |  Chrome  | Firefox  | Safari  |  Edge  |   IE   |
    * | :------: | :------: | :-----: | :----: | :----: |
    * |  **48**  |  **34**  | **9.1** | **15** | **10** |
    * | 16 _-x-_ | 15 _-x-_ |         |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-feature-settings
    */
  var fontFeatureSettings: js.UndefOr[FontFeatureSettingsProperty | js.Array[FontFeatureSettingsProperty]] = js.native
  
  /**
    * The **`font-kerning`** CSS property sets the use of the kerning information stored in a font.
    *
    * **Syntax**: `auto | normal | none`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  | IE  |
    * | :----: | :-----: | :-----: | :----: | :-: |
    * | **33** | **32**  |  **9**  | **79** | No  |
    * |        |         | 6 _-x-_ |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-kerning
    */
  var fontKerning: js.UndefOr[FontKerningProperty | js.Array[FontKerningProperty]] = js.native
  
  /**
    * The **`font-language-override`** CSS property controls the use of language-specific glyphs in a typeface.
    *
    * **Syntax**: `normal | <string>`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **34**  |   No   |  No  | No  |
    * |        | 4 _-x-_ |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-language-override
    */
  var fontLanguageOverride: js.UndefOr[FontLanguageOverrideProperty | js.Array[FontLanguageOverrideProperty]] = js.native
  
  /**
    * The **`font-optical-sizing`** CSS property sets whether text rendering is optimized for viewing at different sizes. This only works for fonts that have an optical size variation axis.
    *
    * **Syntax**: `auto | none`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **79** | **62**  | **11** | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-optical-sizing
    */
  var fontOpticalSizing: js.UndefOr[FontOpticalSizingProperty | js.Array[FontOpticalSizingProperty]] = js.native
  
  /**
    * The **`font-size`** CSS property sets the size of the font. This property is also used to compute the size of `em`, `ex`, and other relative `<length>` units.
    *
    * **Syntax**: `<absolute-size> | <relative-size> | <length-percentage>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-size
    */
  var fontSize: js.UndefOr[FontSizeProperty[TLength] | js.Array[FontSizeProperty[TLength]]] = js.native
  
  /**
    * The **`font-size-adjust`** CSS property sets how the font size should be chosen based on the height of lowercase rather than capital letters.
    *
    * **Syntax**: `none | <number>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   |  **1**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-size-adjust
    */
  var fontSizeAdjust: js.UndefOr[FontSizeAdjustProperty | js.Array[FontSizeAdjustProperty]] = js.native
  
  /**
    * The **`font-stretch`** CSS property selects a normal, condensed, or expanded face from a font.
    *
    * **Syntax**: `<font-stretch-absolute>`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **60** |  **9**  | **11** | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-stretch
    */
  var fontStretch: js.UndefOr[FontStretchProperty | js.Array[FontStretchProperty]] = js.native
  
  /**
    * The **`font-style`** CSS property sets whether a font should be styled with a normal, italic, or oblique face from its `font-family`.
    *
    * **Syntax**: `normal | italic | oblique <angle>?`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-style
    */
  var fontStyle: js.UndefOr[FontStyleProperty | js.Array[FontStyleProperty]] = js.native
  
  /**
    * The **`font-synthesis`** CSS property controls which missing typefaces, bold or italic, may be synthesized by the browser.
    *
    * **Syntax**: `none | [ weight || style ]`
    *
    * **Initial value**: `weight style`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **34**  | **9**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-synthesis
    */
  var fontSynthesis: js.UndefOr[FontSynthesisProperty | js.Array[FontSynthesisProperty]] = js.native
  
  /**
    * The **font-variant** CSS property is a shorthand for the longhand properties `font-variant-caps`, `font-variant-numeric`, `font-variant-alternates`, `font-variant-ligatures`, and `font-variant-east-asian`. You can also set the CSS Level 2 (Revision 1) values of `font-variant`, (that is, `normal` or `small-caps`), by using the `font` shorthand.
    *
    * **Syntax**: `normal | none | [ <common-lig-values> || <discretionary-lig-values> || <historical-lig-values> || <contextual-alt-values> || stylistic( <feature-value-name> ) || historical-forms || styleset( <feature-value-name># ) || character-variant( <feature-value-name># ) || swash( <feature-value-name> ) || ornaments( <feature-value-name> ) || annotation( <feature-value-name> ) || [ small-caps | all-small-caps | petite-caps | all-petite-caps | unicase | titling-caps ] || <numeric-figure-values> || <numeric-spacing-values> || <numeric-fraction-values> || ordinal || slashed-zero || <east-asian-variant-values> || <east-asian-width-values> || ruby ]`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant
    */
  var fontVariant: js.UndefOr[FontVariantProperty | js.Array[FontVariantProperty]] = js.native
  
  /**
    * The **`font-variant-caps`** CSS property controls the use of alternate glyphs for capital letters.
    *
    * **Syntax**: `normal | small-caps | all-small-caps | petite-caps | all-petite-caps | unicase | titling-caps`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **52** | **34**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-caps
    */
  var fontVariantCaps: js.UndefOr[FontVariantCapsProperty | js.Array[FontVariantCapsProperty]] = js.native
  
  /**
    * The **`font-variant-east-asian`** CSS property controls the use of alternate glyphs for East Asian scripts, like Japanese and Chinese.
    *
    * **Syntax**: `normal | [ <east-asian-variant-values> || <east-asian-width-values> || ruby ]`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **63** | **34**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-east-asian
    */
  var fontVariantEastAsian: js.UndefOr[FontVariantEastAsianProperty | js.Array[FontVariantEastAsianProperty]] = js.native
  
  /**
    * The **`font-variant-ligatures`** CSS property controls which ligatures and contextual forms are used in textual content of the elements it applies to. This leads to more harmonized forms in the resulting text.
    *
    * **Syntax**: `normal | none | [ <common-lig-values> || <discretionary-lig-values> || <historical-lig-values> || <contextual-alt-values> ]`
    *
    * **Initial value**: `normal`
    *
    * |  Chrome  | Firefox | Safari  |  Edge  | IE  |
    * | :------: | :-----: | :-----: | :----: | :-: |
    * |  **34**  | **34**  | **9.1** | **79** | No  |
    * | 31 _-x-_ |         | 7 _-x-_ |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-ligatures
    */
  var fontVariantLigatures: js.UndefOr[FontVariantLigaturesProperty | js.Array[FontVariantLigaturesProperty]] = js.native
  
  /**
    * The **`font-variant-numeric`** CSS property controls the usage of alternate glyphs for numbers, fractions, and ordinal markers.
    *
    * **Syntax**: `normal | [ <numeric-figure-values> || <numeric-spacing-values> || <numeric-fraction-values> || ordinal || slashed-zero ]`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari  |  Edge  | IE  |
    * | :----: | :-----: | :-----: | :----: | :-: |
    * | **52** | **34**  | **9.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-numeric
    */
  var fontVariantNumeric: js.UndefOr[FontVariantNumericProperty | js.Array[FontVariantNumericProperty]] = js.native
  
  /**
    * The **`font-variant-position`** CSS property controls the use of alternate, smaller glyphs that are positioned as superscript or subscript.
    *
    * **Syntax**: `normal | sub | super`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **34**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-position
    */
  var fontVariantPosition: js.UndefOr[FontVariantPositionProperty | js.Array[FontVariantPositionProperty]] = js.native
  
  /**
    * The **`font-variation-settings`** CSS property provides low-level control over variable font characteristics, by specifying the four letter axis names of the characteristics you want to vary, along with their values.
    *
    * **Syntax**: `normal | [ <string> <number> ]#`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **62** | **62**  | **11** | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variation-settings
    */
  var fontVariationSettings: js.UndefOr[FontVariationSettingsProperty | js.Array[FontVariationSettingsProperty]] = js.native
  
  /**
    * The **`font-weight`** CSS property specifies the weight (or boldness) of the font. The font weights available to you will depend on the `font-family` you are using. Some fonts are only available in `normal` and `bold`.
    *
    * **Syntax**: `<font-weight-absolute> | bolder | lighter`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **2**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-weight
    */
  var fontWeight: js.UndefOr[FontWeightProperty | js.Array[FontWeightProperty]] = js.native
  
  /**
    * The **`grid-auto-columns`** CSS property specifies the size of an implicitly-created grid column track.
    *
    * **Syntax**: `<track-size>+`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |          Edge           |             IE              |
    * | :----: | :-----: | :------: | :---------------------: | :-------------------------: |
    * | **57** | **70**  | **10.1** |         **16**          | **10** _(-ms-grid-columns)_ |
    * |        |         |          | 12 _(-ms-grid-columns)_ |                             |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-auto-columns
    */
  var gridAutoColumns: js.UndefOr[GridAutoColumnsProperty[TLength] | js.Array[GridAutoColumnsProperty[TLength]]] = js.native
  
  /**
    * The **`grid-auto-flow`** CSS property controls how the auto-placement algorithm works, specifying exactly how auto-placed items get flowed into the grid.
    *
    * **Syntax**: `[ row | column ] || dense`
    *
    * **Initial value**: `row`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-auto-flow
    */
  var gridAutoFlow: js.UndefOr[GridAutoFlowProperty | js.Array[GridAutoFlowProperty]] = js.native
  
  /**
    * The **`grid-auto-rows`** CSS property specifies the size of an implicitly-created grid row track.
    *
    * **Syntax**: `<track-size>+`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |         Edge         |            IE            |
    * | :----: | :-----: | :------: | :------------------: | :----------------------: |
    * | **57** | **70**  | **10.1** |        **16**        | **10** _(-ms-grid-rows)_ |
    * |        |         |          | 12 _(-ms-grid-rows)_ |                          |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-auto-rows
    */
  var gridAutoRows: js.UndefOr[GridAutoRowsProperty[TLength] | js.Array[GridAutoRowsProperty[TLength]]] = js.native
  
  /**
    * The **`grid-column-end`** CSS property specifies a grid item’s end position within the grid column by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the block-end edge of its grid area.
    *
    * **Syntax**: `<grid-line>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-column-end
    */
  var gridColumnEnd: js.UndefOr[GridColumnEndProperty | js.Array[GridColumnEndProperty]] = js.native
  
  /**
    * The **`grid-column-start`** CSS property specifies a grid item’s start position within the grid column by contributing a line, a span, or nothing (automatic) to its grid placement. This start position defines the block-start edge of the grid area.
    *
    * **Syntax**: `<grid-line>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-column-start
    */
  var gridColumnStart: js.UndefOr[GridColumnStartProperty | js.Array[GridColumnStartProperty]] = js.native
  
  /**
    * The **`grid-row-end`** CSS property specifies a grid item’s end position within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-end edge of its grid area.
    *
    * **Syntax**: `<grid-line>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-row-end
    */
  var gridRowEnd: js.UndefOr[GridRowEndProperty | js.Array[GridRowEndProperty]] = js.native
  
  /**
    * The **`grid-row-start`** CSS property specifies a grid item’s start position within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start edge of its grid area.
    *
    * **Syntax**: `<grid-line>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-row-start
    */
  var gridRowStart: js.UndefOr[GridRowStartProperty | js.Array[GridRowStartProperty]] = js.native
  
  /**
    * The **`grid-template-areas`** CSS property specifies named grid areas.
    *
    * **Syntax**: `none | <string>+`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template-areas
    */
  var gridTemplateAreas: js.UndefOr[GridTemplateAreasProperty | js.Array[GridTemplateAreasProperty]] = js.native
  
  /**
    * The **`grid-template-columns`** CSS property defines the line names and track sizing functions of the grid columns.
    *
    * **Syntax**: `none | <track-list> | <auto-track-list> | subgrid <line-name-list>?`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template-columns
    */
  var gridTemplateColumns: js.UndefOr[
    GridTemplateColumnsProperty[TLength] | js.Array[GridTemplateColumnsProperty[TLength]]
  ] = js.native
  
  /**
    * The **`grid-template-rows`** CSS property defines the line names and track sizing functions of the grid rows.
    *
    * **Syntax**: `none | <track-list> | <auto-track-list> | subgrid <line-name-list>?`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template-rows
    */
  var gridTemplateRows: js.UndefOr[GridTemplateRowsProperty[TLength] | js.Array[GridTemplateRowsProperty[TLength]]] = js.native
  
  /**
    * The **`hanging-punctuation`** CSS property specifies whether a punctuation mark should hang at the start or end of a line of text. Hanging punctuation may be placed outside the line box.
    *
    * **Syntax**: `none | [ first || [ force-end | allow-end ] || last ]`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    | **10** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/hanging-punctuation
    */
  var hangingPunctuation: js.UndefOr[HangingPunctuationProperty | js.Array[HangingPunctuationProperty]] = js.native
  
  /**
    * The **`height`** CSS property specifies the height of an element. By default, the property defines the height of the content area. If `box-sizing` is set to `border-box`, however, it instead determines the height of the border area.
    *
    * **Syntax**: `auto | <length> | <percentage> | min-content | max-content | fit-content(<length-percentage>)`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/height
    */
  var height: js.UndefOr[HeightProperty[TLength] | js.Array[HeightProperty[TLength]]] = js.native
  
  /**
    * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. You can prevent hyphenation entirely, use hyphenation in manually-specified points within the text, or let the browser automatically insert hyphens where appropriate.
    *
    * **Syntax**: `none | manual | auto`
    *
    * **Initial value**: `manual`
    *
    * |  Chrome  | Firefox |    Safari     |     Edge     |      IE      |
    * | :------: | :-----: | :-----------: | :----------: | :----------: |
    * |  **55**  | **43**  | **5.1** _-x-_ | **12** _-x-_ | **10** _-x-_ |
    * | 13 _-x-_ | 6 _-x-_ |               |              |              |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/hyphens
    */
  var hyphens: js.UndefOr[HyphensProperty | js.Array[HyphensProperty]] = js.native
  
  /**
    * The **`image-orientation`** CSS property specifies a layout-independent correction to the orientation of an image. It should _not_ be used for any other orientation adjustments; instead, the `transform` property should be used with the `rotate` `<transform-function>`.
    *
    * **Syntax**: `from-image | <angle> | [ <angle>? flip ]`
    *
    * **Initial value**: `0deg`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **81** | **26**  | **13.1** | **81** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/image-orientation
    */
  var imageOrientation: js.UndefOr[ImageOrientationProperty | js.Array[ImageOrientationProperty]] = js.native
  
  /**
    * The **`image-rendering`** CSS property sets an image scaling algorithm. The property applies to an element itself, to any images set in its other properties, and to its descendants.
    *
    * **Syntax**: `auto | crisp-edges | pixelated`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **13** | **3.6** | **6**  | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/image-rendering
    */
  var imageRendering: js.UndefOr[ImageRenderingProperty | js.Array[ImageRenderingProperty]] = js.native
  
  /**
    * **Syntax**: `[ from-image || <resolution> ] && snap?`
    *
    * **Initial value**: `1dppx`
    */
  var imageResolution: js.UndefOr[ImageResolutionProperty | js.Array[ImageResolutionProperty]] = js.native
  
  /**
    * The `initial-letter` CSS property sets styling for dropped, raised, and sunken initial letters.
    *
    * **Syntax**: `normal | [ <number> <integer>? ]`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    | **9**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/initial-letter
    */
  var initialLetter: js.UndefOr[InitialLetterProperty | js.Array[InitialLetterProperty]] = js.native
  
  /**
    * The **`inline-size`** CSS property defines the horizontal or vertical size of an element's block, depending on its writing mode. It corresponds to either the `width` or the `height` property, depending on the value of `writing-mode`.
    *
    * **Syntax**: `<'width'>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inline-size
    */
  var inlineSize: js.UndefOr[InlineSizeProperty[TLength] | js.Array[InlineSizeProperty[TLength]]] = js.native
  
  /**
    * The **`inset`** CSS property defines the logical block and inline start and end offsets of an element, which map to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>{1,4}`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset
    */
  var inset: js.UndefOr[InsetProperty[TLength] | js.Array[InsetProperty[TLength]]] = js.native
  
  /**
    * The **`inset-block`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>{1,2}`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-block
    */
  var insetBlock: js.UndefOr[InsetBlockProperty[TLength] | js.Array[InsetBlockProperty[TLength]]] = js.native
  
  /**
    * The **`inset-block-end`** CSS property defines the logical block end offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-block-end
    */
  var insetBlockEnd: js.UndefOr[InsetBlockEndProperty[TLength] | js.Array[InsetBlockEndProperty[TLength]]] = js.native
  
  /**
    * The **`inset-block-start`** CSS property defines the logical block start offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-block-start
    */
  var insetBlockStart: js.UndefOr[InsetBlockStartProperty[TLength] | js.Array[InsetBlockStartProperty[TLength]]] = js.native
  
  /**
    * The **`inset-inline`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>{1,2}`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-inline
    */
  var insetInline: js.UndefOr[InsetInlineProperty[TLength] | js.Array[InsetInlineProperty[TLength]]] = js.native
  
  /**
    * The **`inset-inline-end`** CSS property defines the logical inline end inset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-inline-end
    */
  var insetInlineEnd: js.UndefOr[InsetInlineEndProperty[TLength] | js.Array[InsetInlineEndProperty[TLength]]] = js.native
  
  /**
    * The **`inset-inline-start`** CSS property defines the logical inline start inset of an element, which maps to a physical offset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-inline-start
    */
  var insetInlineStart: js.UndefOr[InsetInlineStartProperty[TLength] | js.Array[InsetInlineStartProperty[TLength]]] = js.native
  
  /**
    * The **`isolation`** CSS property determines whether an element must create a new stacking context.
    *
    * **Syntax**: `auto | isolate`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **41** | **36**  | **8**  | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/isolation
    */
  var isolation: js.UndefOr[IsolationProperty | js.Array[IsolationProperty]] = js.native
  
  /**
    * The CSS **`justify-content`** property defines how the browser distributes space between and around content items along the main-axis of a flex container, and the inline axis of a grid container.
    *
    * **Syntax**: `normal | <content-distribution> | <overflow-position>? [ <content-position> | left | right ]`
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :------: | :-----: | :-------: | :----: | :----: |
    * |  **52**  | **20**  |   **9**   | **12** | **11** |
    * | 21 _-x-_ |         | 6.1 _-x-_ |        |        |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/justify-content
    */
  var justifyContent: js.UndefOr[JustifyContentProperty | js.Array[JustifyContentProperty]] = js.native
  
  /**
    * The CSS **`justify-items`** property defines the default `justify-self` for all items of the box, giving them all a default way of justifying each box along the appropriate axis.
    *
    * **Syntax**: `normal | stretch | <baseline-position> | <overflow-position>? [ <self-position> | left | right ] | legacy | legacy && [ left | right | center ]`
    *
    * **Initial value**: `legacy`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **52** | **20**  | **9**  | **12** | **11** |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **45**  | **10.1** | **16** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/justify-items
    */
  var justifyItems: js.UndefOr[JustifyItemsProperty | js.Array[JustifyItemsProperty]] = js.native
  
  /**
    * The CSS **`justify-self`** property set the way a box is justified inside its alignment container along the appropriate axis.
    *
    * **Syntax**: `auto | normal | stretch | <baseline-position> | <overflow-position>? [ <self-position> | left | right ]`
    *
    * **Initial value**: `auto`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **45**  | **10.1** | **16** | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **45**  | **10.1** | **16** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/justify-self
    */
  var justifySelf: js.UndefOr[JustifySelfProperty | js.Array[JustifySelfProperty]] = js.native
  
  /**
    * The **`left`** CSS property participates in specifying the horizontal position of a _positioned element_. It has no effect on non-positioned elements.
    *
    * **Syntax**: `<length> | <percentage> | auto`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/left
    */
  var left: js.UndefOr[LeftProperty[TLength] | js.Array[LeftProperty[TLength]]] = js.native
  
  /**
    * The **`letter-spacing`** CSS property sets the spacing behavior between text characters.
    *
    * **Syntax**: `normal | <length>`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/letter-spacing
    */
  var letterSpacing: js.UndefOr[LetterSpacingProperty[TLength] | js.Array[LetterSpacingProperty[TLength]]] = js.native
  
  /**
    * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
    *
    * **Syntax**: `auto | loose | normal | strict | anywhere`
    *
    * **Initial value**: `auto`
    *
    * | Chrome  | Firefox |   Safari    |  Edge  |   IE    |
    * | :-----: | :-----: | :---------: | :----: | :-----: |
    * | **58**  | **69**  | **3** _-x-_ | **14** | **5.5** |
    * | 1 _-x-_ |         |             |        |         |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/line-break
    */
  var lineBreak: js.UndefOr[LineBreakProperty | js.Array[LineBreakProperty]] = js.native
  
  /**
    * The **`line-height`** CSS property sets the amount of space used for lines, such as in text. On block-level elements, it specifies the minimum height of line boxes within the element. On non-replaced inline elements, it specifies the height that is used to calculate line box height.
    *
    * **Syntax**: `normal | <number> | <length> | <percentage>`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/line-height
    */
  var lineHeight: js.UndefOr[LineHeightProperty[TLength] | js.Array[LineHeightProperty[TLength]]] = js.native
  
  /**
    * The **`line-height-step`** CSS property sets the step unit for line box heights. When the property is set, line box heights are rounded up to the closest multiple of the unit.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   |   No    |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/line-height-step
    */
  var lineHeightStep: js.UndefOr[LineHeightStepProperty[TLength] | js.Array[LineHeightStepProperty[TLength]]] = js.native
  
  /**
    * The **`list-style-image`** CSS property sets an image to be used as the list item marker.
    *
    * **Syntax**: `<url> | none`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style-image
    */
  var listStyleImage: js.UndefOr[ListStyleImageProperty | js.Array[ListStyleImageProperty]] = js.native
  
  /**
    * The **`list-style-position`** CSS property sets the position of the `::marker` relative to a list item.
    *
    * **Syntax**: `inside | outside`
    *
    * **Initial value**: `outside`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style-position
    */
  var listStylePosition: js.UndefOr[ListStylePositionProperty | js.Array[ListStylePositionProperty]] = js.native
  
  /**
    * The **`list-style-type`** CSS property sets the marker (such as a disc, character, or custom counter style) of a list item element.
    *
    * **Syntax**: `<counter-style> | <string> | none`
    *
    * **Initial value**: `disc`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style-type
    */
  var listStyleType: js.UndefOr[ListStyleTypeProperty | js.Array[ListStyleTypeProperty]] = js.native
  
  /**
    * The **`margin-block`** CSS property defines the logical block start and end margins of an element, which maps to physical margins depending on the element's writing mode, directionality, and text orientation.
    *
    * **Syntax**: `<'margin-left'>{1,2}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-block
    */
  var marginBlock: js.UndefOr[MarginBlockProperty[TLength] | js.Array[MarginBlockProperty[TLength]]] = js.native
  
  /**
    * The **`margin-block-end`** CSS property defines the logical block end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation.
    *
    * **Syntax**: `<'margin-left'>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-block-end
    */
  var marginBlockEnd: js.UndefOr[MarginBlockEndProperty[TLength] | js.Array[MarginBlockEndProperty[TLength]]] = js.native
  
  /**
    * The **`margin-block-start`** CSS property defines the logical block start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation.
    *
    * **Syntax**: `<'margin-left'>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-block-start
    */
  var marginBlockStart: js.UndefOr[MarginBlockStartProperty[TLength] | js.Array[MarginBlockStartProperty[TLength]]] = js.native
  
  /**
    * The **`margin-bottom`** CSS property sets the margin area on the bottom of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Syntax**: `<length> | <percentage> | auto`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-bottom
    */
  var marginBottom: js.UndefOr[MarginBottomProperty[TLength] | js.Array[MarginBottomProperty[TLength]]] = js.native
  
  /**
    * The **`margin-inline`** CSS property defines the logical inline start and end margins of an element, which maps to physical margins depending on the element's writing mode, directionality, and text orientation.
    *
    * **Syntax**: `<'margin-left'>{1,2}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-inline
    */
  var marginInline: js.UndefOr[MarginInlineProperty[TLength] | js.Array[MarginInlineProperty[TLength]]] = js.native
  
  /**
    * The **`margin-inline-end`** CSS property defines the logical inline end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. In other words, it corresponds to the `margin-top`, `margin-right`, `margin-bottom` or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'margin-left'>`
    *
    * **Initial value**: `0`
    *
    * |          Chrome          |        Firefox        |          Safari          |  Edge  | IE  |
    * | :----------------------: | :-------------------: | :----------------------: | :----: | :-: |
    * |          **69**          |        **41**         |         **12.1**         | **79** | No  |
    * | 2 _(-webkit-margin-end)_ | 3 _(-moz-margin-end)_ | 3 _(-webkit-margin-end)_ |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-inline-end
    */
  var marginInlineEnd: js.UndefOr[MarginInlineEndProperty[TLength] | js.Array[MarginInlineEndProperty[TLength]]] = js.native
  
  /**
    * The **`margin-inline-start`** CSS property defines the logical inline start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. It corresponds to the `margin-top`, `margin-right`, `margin-bottom`, or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'margin-left'>`
    *
    * **Initial value**: `0`
    *
    * |           Chrome           |         Firefox         |           Safari           |  Edge  | IE  |
    * | :------------------------: | :---------------------: | :------------------------: | :----: | :-: |
    * |           **69**           |         **41**          |          **12.1**          | **79** | No  |
    * | 2 _(-webkit-margin-start)_ | 3 _(-moz-margin-start)_ | 3 _(-webkit-margin-start)_ |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-inline-start
    */
  var marginInlineStart: js.UndefOr[
    MarginInlineStartProperty[TLength] | js.Array[MarginInlineStartProperty[TLength]]
  ] = js.native
  
  /**
    * The **`margin-left`** CSS property sets the margin area on the left side of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Syntax**: `<length> | <percentage> | auto`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-left
    */
  var marginLeft: js.UndefOr[MarginLeftProperty[TLength] | js.Array[MarginLeftProperty[TLength]]] = js.native
  
  /**
    * The **`margin-right`** CSS property sets the margin area on the right side of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Syntax**: `<length> | <percentage> | auto`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-right
    */
  var marginRight: js.UndefOr[MarginRightProperty[TLength] | js.Array[MarginRightProperty[TLength]]] = js.native
  
  /**
    * The **`margin-top`** CSS property sets the margin area on the top of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Syntax**: `<length> | <percentage> | auto`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-top
    */
  var marginTop: js.UndefOr[MarginTopProperty[TLength] | js.Array[MarginTopProperty[TLength]]] = js.native
  
  /**
    * The **`mask-border-mode`** CSS property specifies the blending mode used in a mask border.
    *
    * **Syntax**: `luminance | alpha`
    *
    * **Initial value**: `alpha`
    */
  var maskBorderMode: js.UndefOr[MaskBorderModeProperty | js.Array[MaskBorderModeProperty]] = js.native
  
  /**
    * The **`mask-border-outset`** CSS property specifies the distance by which an element's mask border is set out from its border box.
    *
    * **Syntax**: `[ <length> | <number> ]{1,4}`
    *
    * **Initial value**: `0`
    */
  var maskBorderOutset: js.UndefOr[MaskBorderOutsetProperty[TLength] | js.Array[MaskBorderOutsetProperty[TLength]]] = js.native
  
  /**
    * The **`mask-border-repeat`** CSS property sets how the edge regions of a source image are adjusted to fit the dimensions of an element's mask border.
    *
    * **Syntax**: `[ stretch | repeat | round | space ]{1,2}`
    *
    * **Initial value**: `stretch`
    */
  var maskBorderRepeat: js.UndefOr[MaskBorderRepeatProperty | js.Array[MaskBorderRepeatProperty]] = js.native
  
  /**
    * The **`mask-border-slice`** CSS property divides the image set by `mask-border-source` into regions. These regions are used to form the components of an element's mask border.
    *
    * **Syntax**: `<number-percentage>{1,4} fill?`
    *
    * **Initial value**: `0`
    */
  var maskBorderSlice: js.UndefOr[MaskBorderSliceProperty | js.Array[MaskBorderSliceProperty]] = js.native
  
  /**
    * The **`mask-border-source`** CSS property sets the source image used to create an element's mask border.
    *
    * **Syntax**: `none | <image>`
    *
    * **Initial value**: `none`
    */
  var maskBorderSource: js.UndefOr[MaskBorderSourceProperty | js.Array[MaskBorderSourceProperty]] = js.native
  
  /**
    * The **`mask-border-width`** CSS property sets the width of an element's mask border.
    *
    * **Syntax**: `[ <length-percentage> | <number> | auto ]{1,4}`
    *
    * **Initial value**: `auto`
    */
  var maskBorderWidth: js.UndefOr[MaskBorderWidthProperty[TLength] | js.Array[MaskBorderWidthProperty[TLength]]] = js.native
  
  /**
    * The **`mask-clip`** CSS property determines the area, which is affected by a mask. The painted content of an element must be restricted to this area.
    *
    * **Syntax**: `[ <geometry-box> | no-clip ]#`
    *
    * **Initial value**: `border-box`
    *
    * |   Chrome    | Firefox |   Safari    |     Edge     | IE  |
    * | :---------: | :-----: | :---------: | :----------: | :-: |
    * | **1** _-x-_ | **53**  | **4** _-x-_ | **79** _-x-_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-clip
    */
  var maskClip: js.UndefOr[MaskClipProperty | js.Array[MaskClipProperty]] = js.native
  
  /**
    * The **`mask-composite`** CSS property represents a compositing operation used on the current mask layer with the mask layers below it.
    *
    * **Syntax**: `<compositing-operator>#`
    *
    * **Initial value**: `add`
    *
    * | Chrome | Firefox | Safari | Edge  | IE  |
    * | :----: | :-----: | :----: | :---: | :-: |
    * |   No   | **53**  |   No   | 18-79 | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-composite
    */
  var maskComposite: js.UndefOr[MaskCompositeProperty | js.Array[MaskCompositeProperty]] = js.native
  
  /**
    * The **`mask-image`** CSS property sets the image that is used as mask layer for an element.
    *
    * **Syntax**: `<mask-reference>#`
    *
    * **Initial value**: `none`
    *
    * |   Chrome    | Firefox |   Safari    |  Edge  | IE  |
    * | :---------: | :-----: | :---------: | :----: | :-: |
    * | **1** _-x-_ | **53**  | **4** _-x-_ | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-image
    */
  var maskImage: js.UndefOr[MaskImageProperty | js.Array[MaskImageProperty]] = js.native
  
  /**
    * The **`mask-mode`** CSS property sets whether the mask reference defined by `mask-image` is treated as a luminance or alpha mask.
    *
    * **Syntax**: `<masking-mode>#`
    *
    * **Initial value**: `match-source`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **53**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-mode
    */
  var maskMode: js.UndefOr[MaskModeProperty | js.Array[MaskModeProperty]] = js.native
  
  /**
    * The **`mask-origin`** CSS property sets the origin of a mask.
    *
    * **Syntax**: `<geometry-box>#`
    *
    * **Initial value**: `border-box`
    *
    * |   Chrome    | Firefox |   Safari    |     Edge     | IE  |
    * | :---------: | :-----: | :---------: | :----------: | :-: |
    * | **1** _-x-_ | **53**  | **4** _-x-_ | **79** _-x-_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-origin
    */
  var maskOrigin: js.UndefOr[MaskOriginProperty | js.Array[MaskOriginProperty]] = js.native
  
  /**
    * The **`mask-position`** CSS property sets the initial position, relative to the mask position layer set by `mask-origin`, for each defined mask image.
    *
    * **Syntax**: `<position>#`
    *
    * **Initial value**: `center`
    *
    * |   Chrome    | Firefox |    Safari     |  Edge  | IE  |
    * | :---------: | :-----: | :-----------: | :----: | :-: |
    * | **1** _-x-_ | **53**  | **3.2** _-x-_ | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-position
    */
  var maskPosition: js.UndefOr[MaskPositionProperty[TLength] | js.Array[MaskPositionProperty[TLength]]] = js.native
  
  /**
    * The **`mask-repeat`** CSS property sets how mask images are repeated. A mask image can be repeated along the horizontal axis, the vertical axis, both axes, or not repeated at all.
    *
    * **Syntax**: `<repeat-style>#`
    *
    * **Initial value**: `no-repeat`
    *
    * |   Chrome    | Firefox |    Safari     |  Edge  | IE  |
    * | :---------: | :-----: | :-----------: | :----: | :-: |
    * | **1** _-x-_ | **53**  | **3.2** _-x-_ | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-repeat
    */
  var maskRepeat: js.UndefOr[MaskRepeatProperty | js.Array[MaskRepeatProperty]] = js.native
  
  /**
    * The **`mask-size`** CSS property specifies the sizes of the mask images. The size of the image can be fully or partially constrained in order to preserve its intrinsic ratio.
    *
    * **Syntax**: `<bg-size>#`
    *
    * **Initial value**: `auto`
    *
    * |   Chrome    | Firefox |   Safari    |  Edge  | IE  |
    * | :---------: | :-----: | :---------: | :----: | :-: |
    * | **4** _-x-_ | **53**  | **4** _-x-_ | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-size
    */
  var maskSize: js.UndefOr[MaskSizeProperty[TLength] | js.Array[MaskSizeProperty[TLength]]] = js.native
  
  /**
    * The **`mask-type`** CSS property sets whether an SVG `<mask>` element is used as a _luminance_ or an _alpha_ mask. It applies to the `<mask>` element itself.
    *
    * **Syntax**: `luminance | alpha`
    *
    * **Initial value**: `luminance`
    *
    * | Chrome | Firefox | Safari  |  Edge  | IE  |
    * | :----: | :-----: | :-----: | :----: | :-: |
    * | **24** | **35**  | **6.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-type
    */
  var maskType: js.UndefOr[MaskTypeProperty | js.Array[MaskTypeProperty]] = js.native
  
  /**
    * The `**max-block-size**` CSS property specifies the maximum size of an element in the direction opposite that of the writing direction as specified by `writing-mode`. That is, if the writing direction is horizontal, then `max-block-size` is equivalent to `max-height`; if the writing direction is vertical, `max-block-size` is the same as `max-width`.
    *
    * **Syntax**: `<'max-width'>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-block-size
    */
  var maxBlockSize: js.UndefOr[MaxBlockSizeProperty[TLength] | js.Array[MaxBlockSizeProperty[TLength]]] = js.native
  
  /**
    * The **`max-height`** CSS property sets the maximum height of an element. It prevents the used value of the `height` property from becoming larger than the value specified for `max-height`.
    *
    * **Syntax**: `auto | <length> | <percentage> | min-content | max-content | fit-content(<length-percentage>)`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **18** |  **1**  | **1.3** | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-height
    */
  var maxHeight: js.UndefOr[MaxHeightProperty[TLength] | js.Array[MaxHeightProperty[TLength]]] = js.native
  
  /**
    * The **`max-inline-size`** CSS property defines the horizontal or vertical maximum size of an element's block depending on its writing mode. It corresponds to the `max-width` or the `max-height` property depending on the value defined for `writing-mode`. If the writing mode is vertically oriented, the value of `max-inline-size` relates to the maximal height of the element, otherwise it relates to the maximal width of the element. It relates to `max-block-size`, which defines the other dimension of the element.
    *
    * **Syntax**: `<'max-width'>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |   Safari   |  Edge  | IE  |
    * | :----: | :-----: | :--------: | :----: | :-: |
    * | **57** | **41**  |  **12.1**  | **79** | No  |
    * |        |         | 10.1 _-x-_ |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-inline-size
    */
  var maxInlineSize: js.UndefOr[MaxInlineSizeProperty[TLength] | js.Array[MaxInlineSizeProperty[TLength]]] = js.native
  
  /**
    * **Syntax**: `none | <integer>`
    *
    * **Initial value**: `none`
    */
  var maxLines: js.UndefOr[MaxLinesProperty | js.Array[MaxLinesProperty]] = js.native
  
  /**
    * The **`max-width`** CSS property sets the maximum width of an element. It prevents the used value of the `width` property from becoming larger than the value specified by `max-width`.
    *
    * **Syntax**: `auto | <length> | <percentage> | min-content | max-content | fit-content(<length-percentage>)`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-width
    */
  var maxWidth: js.UndefOr[MaxWidthProperty[TLength] | js.Array[MaxWidthProperty[TLength]]] = js.native
  
  /**
    * The **`min-block-size`** CSS property defines the minimum horizontal or vertical size of an element's block, depending on its writing mode. It corresponds to either the `min-width` or the `min-height` property, depending on the value of `writing-mode`.
    *
    * **Syntax**: `<'min-width'>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-block-size
    */
  var minBlockSize: js.UndefOr[MinBlockSizeProperty[TLength] | js.Array[MinBlockSizeProperty[TLength]]] = js.native
  
  /**
    * The **`min-height`** CSS property sets the minimum height of an element. It prevents the used value of the `height` property from becoming smaller than the value specified for `min-height`.
    *
    * **Syntax**: `auto | <length> | <percentage> | min-content | max-content | fit-content(<length-percentage>)`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **3**  | **1.3** | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-height
    */
  var minHeight: js.UndefOr[MinHeightProperty[TLength] | js.Array[MinHeightProperty[TLength]]] = js.native
  
  /**
    * The **`min-inline-size`** CSS property defines the horizontal or vertical minimal size of an element's block, depending on its writing mode. It corresponds to either the `min-width` or the `min-height` property, depending on the value of `writing-mode`.
    *
    * **Syntax**: `<'min-width'>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-inline-size
    */
  var minInlineSize: js.UndefOr[MinInlineSizeProperty[TLength] | js.Array[MinInlineSizeProperty[TLength]]] = js.native
  
  /**
    * The **`min-width`** CSS property sets the minimum width of an element. It prevents the used value of the `width` property from becoming smaller than the value specified for `min-width`.
    *
    * **Syntax**: `auto | <length> | <percentage> | min-content | max-content | fit-content(<length-percentage>)`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-width
    */
  var minWidth: js.UndefOr[MinWidthProperty[TLength] | js.Array[MinWidthProperty[TLength]]] = js.native
  
  /**
    * The **`mix-blend-mode`** CSS property sets how an element's content should blend with the content of the element's parent and the element's background.
    *
    * **Syntax**: `<blend-mode>`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **41** | **32**  | **8**  | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mix-blend-mode
    */
  var mixBlendMode: js.UndefOr[MixBlendModeProperty | js.Array[MixBlendModeProperty]] = js.native
  
  /**
    * The **`offset-distance`** CSS property specifies a position along an `offset-path`.
    *
    * **Syntax**: `<length-percentage>`
    *
    * **Initial value**: `0`
    *
    * |         Chrome         | Firefox | Safari |  Edge  | IE  |
    * | :--------------------: | :-----: | :----: | :----: | :-: |
    * |         **55**         | **72**  |   No   | **79** | No  |
    * | 46 _(motion-distance)_ |         |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-distance
    */
  var motionDistance: js.UndefOr[OffsetDistanceProperty[TLength] | js.Array[OffsetDistanceProperty[TLength]]] = js.native
  
  /**
    * The **`offset-path`** CSS property specifies a motion path for an element to follow and defines the element's positioning within the parent container or SVG coordinate system.
    *
    * **Syntax**: `none | ray( [ <angle> && <size>? && contain? ] ) | <path()> | <url> | [ <basic-shape> || <geometry-box> ]`
    *
    * **Initial value**: `none`
    *
    * |       Chrome       | Firefox | Safari |  Edge  | IE  |
    * | :----------------: | :-----: | :----: | :----: | :-: |
    * |       **55**       | **72**  |   No   | **79** | No  |
    * | 46 _(motion-path)_ |         |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-path
    */
  var motionPath: js.UndefOr[OffsetPathProperty | js.Array[OffsetPathProperty]] = js.native
  
  /**
    * The **`offset-rotate`** CSS property defines the direction of the element while positioning along the offset path.
    *
    * **Syntax**: `[ auto | reverse ] || <angle>`
    *
    * **Initial value**: `auto`
    *
    * |         Chrome         | Firefox | Safari |  Edge  | IE  |
    * | :--------------------: | :-----: | :----: | :----: | :-: |
    * |         **56**         | **72**  |   No   | **79** | No  |
    * | 46 _(motion-rotation)_ |         |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-rotate
    */
  var motionRotation: js.UndefOr[OffsetRotateProperty | js.Array[OffsetRotateProperty]] = js.native
  
  /**
    * The **`object-fit`** CSS property sets how the content of a replaced element, such as an `<img>` or `<video>`, should be resized to fit its container.
    *
    * **Syntax**: `fill | contain | cover | none | scale-down`
    *
    * **Initial value**: `fill`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **31** | **36**  | **10** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/object-fit
    */
  var objectFit: js.UndefOr[ObjectFitProperty | js.Array[ObjectFitProperty]] = js.native
  
  /**
    * The **`object-position`** CSS property specifies the alignment of the selected replaced element's contents within the element's box. Areas of the box which aren't covered by the replaced element's object will show the element's background.
    *
    * **Syntax**: `<position>`
    *
    * **Initial value**: `50% 50%`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **31** | **36**  | **10** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/object-position
    */
  var objectPosition: js.UndefOr[ObjectPositionProperty[TLength] | js.Array[ObjectPositionProperty[TLength]]] = js.native
  
  /**
    * **Syntax**: `auto | <position>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **79** | **72**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-anchor
    */
  var offsetAnchor: js.UndefOr[OffsetAnchorProperty[TLength] | js.Array[OffsetAnchorProperty[TLength]]] = js.native
  
  /**
    * The **`offset-distance`** CSS property specifies a position along an `offset-path`.
    *
    * **Syntax**: `<length-percentage>`
    *
    * **Initial value**: `0`
    *
    * |         Chrome         | Firefox | Safari |  Edge  | IE  |
    * | :--------------------: | :-----: | :----: | :----: | :-: |
    * |         **55**         | **72**  |   No   | **79** | No  |
    * | 46 _(motion-distance)_ |         |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-distance
    */
  var offsetDistance: js.UndefOr[OffsetDistanceProperty[TLength] | js.Array[OffsetDistanceProperty[TLength]]] = js.native
  
  /**
    * The **`offset-path`** CSS property specifies a motion path for an element to follow and defines the element's positioning within the parent container or SVG coordinate system.
    *
    * **Syntax**: `none | ray( [ <angle> && <size>? && contain? ] ) | <path()> | <url> | [ <basic-shape> || <geometry-box> ]`
    *
    * **Initial value**: `none`
    *
    * |       Chrome       | Firefox | Safari |  Edge  | IE  |
    * | :----------------: | :-----: | :----: | :----: | :-: |
    * |       **55**       | **72**  |   No   | **79** | No  |
    * | 46 _(motion-path)_ |         |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-path
    */
  var offsetPath: js.UndefOr[OffsetPathProperty | js.Array[OffsetPathProperty]] = js.native
  
  /**
    * The **`offset-rotate`** CSS property defines the direction of the element while positioning along the offset path.
    *
    * **Syntax**: `[ auto | reverse ] || <angle>`
    *
    * **Initial value**: `auto`
    *
    * |         Chrome         | Firefox | Safari |  Edge  | IE  |
    * | :--------------------: | :-----: | :----: | :----: | :-: |
    * |         **56**         | **72**  |   No   | **79** | No  |
    * | 46 _(motion-rotation)_ |         |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-rotate
    */
  var offsetRotate: js.UndefOr[OffsetRotateProperty | js.Array[OffsetRotateProperty]] = js.native
  
  /**
    * The **`offset-rotate`** CSS property defines the direction of the element while positioning along the offset path.
    *
    * **Syntax**: `[ auto | reverse ] || <angle>`
    *
    * **Initial value**: `auto`
    *
    * |         Chrome         | Firefox | Safari |  Edge  | IE  |
    * | :--------------------: | :-----: | :----: | :----: | :-: |
    * |         **56**         | **72**  |   No   | **79** | No  |
    * | 46 _(motion-rotation)_ |         |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-rotate
    */
  var offsetRotation: js.UndefOr[OffsetRotateProperty | js.Array[OffsetRotateProperty]] = js.native
  
  /**
    * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
    *
    * **Syntax**: `<alpha-value>`
    *
    * **Initial value**: `1.0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **2**  | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/opacity
    */
  var opacity: js.UndefOr[OpacityProperty | js.Array[OpacityProperty]] = js.native
  
  /**
    * The **`order`** CSS property sets the order to lay out an item in a flex or grid container. Items in a container are sorted by ascending `order` value and then by their source code order.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `0`
    *
    * |  Chrome  | Firefox | Safari  |  Edge  |    IE    |
    * | :------: | :-----: | :-----: | :----: | :------: |
    * |  **29**  | **20**  |  **9**  | **12** |  **11**  |
    * | 21 _-x-_ |         | 7 _-x-_ |        | 10 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/order
    */
  var order: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`orphans`** CSS property sets the minimum number of lines in a block container that must be shown at the _bottom_ of a page, region, or column.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `2`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **25** |   No    | **1.3** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/orphans
    */
  var orphans: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`outline-color`** CSS property sets the color of an element's outline.
    *
    * **Syntax**: `<color> | invert`
    *
    * **Initial value**: `invert`, for browsers supporting it, `currentColor` for the other
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-color
    */
  var outlineColor: js.UndefOr[OutlineColorProperty | js.Array[OutlineColorProperty]] = js.native
  
  /**
    * The **`outline-offset`** CSS property sets the amount of space between an outline and the edge or border of an element.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari  |  Edge  | IE  |
    * | :----: | :-----: | :-----: | :----: | :-: |
    * | **1**  | **1.5** | **1.2** | **15** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-offset
    */
  var outlineOffset: js.UndefOr[OutlineOffsetProperty[TLength] | js.Array[OutlineOffsetProperty[TLength]]] = js.native
  
  /**
    * The **`outline-style`** CSS property sets the style of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Syntax**: `auto | <'border-style'>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-style
    */
  var outlineStyle: js.UndefOr[OutlineStyleProperty | js.Array[OutlineStyleProperty]] = js.native
  
  /**
    * The **`outline-width`** CSS property sets the thickness of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Syntax**: `<line-width>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-width
    */
  var outlineWidth: js.UndefOr[OutlineWidthProperty[TLength] | js.Array[OutlineWidthProperty[TLength]]] = js.native
  
  /**
    * **Syntax**: `auto | none`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **56** | **66**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-anchor
    */
  var overflowAnchor: js.UndefOr[OverflowAnchorProperty | js.Array[OverflowAnchorProperty]] = js.native
  
  /**
    * **Syntax**: `visible | hidden | clip | scroll | auto`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **69**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-block
    */
  var overflowBlock: js.UndefOr[OverflowBlockProperty | js.Array[OverflowBlockProperty]] = js.native
  
  /**
    * The **`overflow-clip-box`** CSS property specifies relative to which box the clipping happens when there is an overflow. It is short hand for the `overflow-clip-box-inline` and `overflow-clip-box-block` properties.
    *
    * **Syntax**: `padding-box | content-box`
    *
    * **Initial value**: `padding-box`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **29**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Mozilla/Gecko/Chrome/CSS/overflow-clip-box
    */
  var overflowClipBox: js.UndefOr[OverflowClipBoxProperty | js.Array[OverflowClipBoxProperty]] = js.native
  
  /**
    * **Syntax**: `visible | hidden | clip | scroll | auto`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **69**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-inline
    */
  var overflowInline: js.UndefOr[OverflowInlineProperty | js.Array[OverflowInlineProperty]] = js.native
  
  /**
    * The `**overflow-wrap**` CSS property sets whether the browser should insert line breaks within words to prevent text from overflowing its content box.
    *
    * **Syntax**: `normal | break-word | anywhere`
    *
    * **Initial value**: `normal`
    *
    * |     Chrome      |      Firefox      |     Safari      |       Edge       |          IE           |
    * | :-------------: | :---------------: | :-------------: | :--------------: | :-------------------: |
    * |     **23**      |      **49**       |     **6.1**     |      **18**      | **5.5** _(word-wrap)_ |
    * | 1 _(word-wrap)_ | 3.5 _(word-wrap)_ | 1 _(word-wrap)_ | 12 _(word-wrap)_ |                       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-wrap
    */
  var overflowWrap: js.UndefOr[OverflowWrapProperty | js.Array[OverflowWrapProperty]] = js.native
  
  /**
    * The **`overflow-x`** CSS property sets what shows when content overflows a block-level element's left and right edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * **Syntax**: `visible | hidden | clip | scroll | auto`
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  | **3.5** | **3**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-x
    */
  var overflowX: js.UndefOr[OverflowXProperty | js.Array[OverflowXProperty]] = js.native
  
  /**
    * The **`overflow-y`** CSS property sets what shows when content overflows a block-level element's top and bottom edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * **Syntax**: `visible | hidden | clip | scroll | auto`
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  | **1.5** | **3**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-y
    */
  var overflowY: js.UndefOr[OverflowYProperty | js.Array[OverflowYProperty]] = js.native
  
  /**
    * The **`overscroll-behavior`** CSS property sets what a browser does when reaching the boundary of a scrolling area. It's a shorthand for `overscroll-behavior-x` and `overscroll-behavior-y`.
    *
    * **Syntax**: `[ contain | none | auto ]{1,2}`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **63** | **59**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior
    */
  var overscrollBehavior: js.UndefOr[OverscrollBehaviorProperty | js.Array[OverscrollBehaviorProperty]] = js.native
  
  /**
    * The **`overscroll-behavior-block`** CSS property sets the browser's behavior when the block direction boundary of a scrolling area is reached.
    *
    * **Syntax**: `contain | none | auto`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **77** | **73**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior-block
    */
  var overscrollBehaviorBlock: js.UndefOr[OverscrollBehaviorBlockProperty | js.Array[OverscrollBehaviorBlockProperty]] = js.native
  
  /**
    * The **`overscroll-behavior-inline`** CSS property sets the browser's behavior when the inline direction boundary of a scrolling area is reached.
    *
    * **Syntax**: `contain | none | auto`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **77** | **73**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior-inline
    */
  var overscrollBehaviorInline: js.UndefOr[OverscrollBehaviorInlineProperty | js.Array[OverscrollBehaviorInlineProperty]] = js.native
  
  /**
    * The **`overscroll-behavior-x`** CSS property sets the browser's behavior when the horizontal boundary of a scrolling area is reached.
    *
    * **Syntax**: `contain | none | auto`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **63** | **59**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior-x
    */
  var overscrollBehaviorX: js.UndefOr[OverscrollBehaviorXProperty | js.Array[OverscrollBehaviorXProperty]] = js.native
  
  /**
    * The **`overscroll-behavior-y`** CSS property sets the browser's behavior when the vertical boundary of a scrolling area is reached.
    *
    * **Syntax**: `contain | none | auto`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **63** | **59**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior-y
    */
  var overscrollBehaviorY: js.UndefOr[OverscrollBehaviorYProperty | js.Array[OverscrollBehaviorYProperty]] = js.native
  
  /**
    * The **`padding-block`** CSS property defines the logical block start and end padding of an element, which maps to physical padding properties depending on the element's writing mode, directionality, and text orientation.
    *
    * **Syntax**: `<'padding-left'>{1,2}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-block
    */
  var paddingBlock: js.UndefOr[PaddingBlockProperty[TLength] | js.Array[PaddingBlockProperty[TLength]]] = js.native
  
  /**
    * The **`padding-block-end`** CSS property defines the logical block end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'padding-left'>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-block-end
    */
  var paddingBlockEnd: js.UndefOr[PaddingBlockEndProperty[TLength] | js.Array[PaddingBlockEndProperty[TLength]]] = js.native
  
  /**
    * The **`padding-block-start`** CSS property defines the logical block start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'padding-left'>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-block-start
    */
  var paddingBlockStart: js.UndefOr[
    PaddingBlockStartProperty[TLength] | js.Array[PaddingBlockStartProperty[TLength]]
  ] = js.native
  
  /**
    * The **`padding-bottom`** CSS property sets the height of the padding area on the bottom of an element.
    *
    * **Syntax**: `<length> | <percentage>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-bottom
    */
  var paddingBottom: js.UndefOr[PaddingBottomProperty[TLength] | js.Array[PaddingBottomProperty[TLength]]] = js.native
  
  /**
    * The **`padding-inline`** CSS property defines the logical inline start and end padding of an element, which maps to physical padding properties depending on the element's writing mode, directionality, and text orientation.
    *
    * **Syntax**: `<'padding-left'>{1,2}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-inline
    */
  var paddingInline: js.UndefOr[PaddingInlineProperty[TLength] | js.Array[PaddingInlineProperty[TLength]]] = js.native
  
  /**
    * The **`padding-inline-end`** CSS property defines the logical inline end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'padding-left'>`
    *
    * **Initial value**: `0`
    *
    * |          Chrome           |        Firefox         |          Safari           |  Edge  | IE  |
    * | :-----------------------: | :--------------------: | :-----------------------: | :----: | :-: |
    * |          **69**           |         **41**         |         **12.1**          | **79** | No  |
    * | 2 _(-webkit-padding-end)_ | 3 _(-moz-padding-end)_ | 3 _(-webkit-padding-end)_ |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-inline-end
    */
  var paddingInlineEnd: js.UndefOr[PaddingInlineEndProperty[TLength] | js.Array[PaddingInlineEndProperty[TLength]]] = js.native
  
  /**
    * The **`padding-inline-start`** CSS property defines the logical inline start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'padding-left'>`
    *
    * **Initial value**: `0`
    *
    * |           Chrome            |         Firefox          |           Safari            |  Edge  | IE  |
    * | :-------------------------: | :----------------------: | :-------------------------: | :----: | :-: |
    * |           **69**            |          **41**          |          **12.1**           | **79** | No  |
    * | 2 _(-webkit-padding-start)_ | 3 _(-moz-padding-start)_ | 3 _(-webkit-padding-start)_ |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-inline-start
    */
  var paddingInlineStart: js.UndefOr[
    PaddingInlineStartProperty[TLength] | js.Array[PaddingInlineStartProperty[TLength]]
  ] = js.native
  
  /**
    * The **`padding-left`** CSS property sets the width of the padding area on the left side of an element.
    *
    * **Syntax**: `<length> | <percentage>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-left
    */
  var paddingLeft: js.UndefOr[PaddingLeftProperty[TLength] | js.Array[PaddingLeftProperty[TLength]]] = js.native
  
  /**
    * The **`padding-right`** CSS property sets the width of the padding area on the right side of an element.
    *
    * **Syntax**: `<length> | <percentage>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-right
    */
  var paddingRight: js.UndefOr[PaddingRightProperty[TLength] | js.Array[PaddingRightProperty[TLength]]] = js.native
  
  /**
    * The **`padding-top`** padding area on the top of an element.
    *
    * **Syntax**: `<length> | <percentage>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-top
    */
  var paddingTop: js.UndefOr[PaddingTopProperty[TLength] | js.Array[PaddingTopProperty[TLength]]] = js.native
  
  /**
    * The **`page-break-after`** CSS property adjusts page breaks _after_ the current element.
    *
    * **Syntax**: `auto | always | avoid | left | right | recto | verso`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/page-break-after
    */
  var pageBreakAfter: js.UndefOr[PageBreakAfterProperty | js.Array[PageBreakAfterProperty]] = js.native
  
  /**
    * The **`page-break-before`** CSS property adjusts page breaks _before_ the current element.
    *
    * **Syntax**: `auto | always | avoid | left | right | recto | verso`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/page-break-before
    */
  var pageBreakBefore: js.UndefOr[PageBreakBeforeProperty | js.Array[PageBreakBeforeProperty]] = js.native
  
  /**
    * The **`page-break-inside`** CSS property adjusts page breaks _inside_ the current element.
    *
    * **Syntax**: `auto | avoid`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **19**  | **1.3** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/page-break-inside
    */
  var pageBreakInside: js.UndefOr[PageBreakInsideProperty | js.Array[PageBreakInsideProperty]] = js.native
  
  /**
    * The **`paint-order`** CSS property lets you control the order in which the fill and stroke (and painting markers) of text content and shapes are drawn.
    *
    * **Syntax**: `normal | [ fill || stroke || markers ]`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **35** | **60**  | **8**  | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/paint-order
    */
  var paintOrder: js.UndefOr[PaintOrderProperty | js.Array[PaintOrderProperty]] = js.native
  
  /**
    * The **`perspective`** CSS property determines the distance between the z=0 plane and the user in order to give a 3D-positioned element some perspective. Each 3D element with z>0 becomes larger; each 3D-element with z<0 becomes smaller. The strength of the effect is determined by the value of this property.
    *
    * **Syntax**: `none | <length>`
    *
    * **Initial value**: `none`
    *
    * |  Chrome  | Firefox  | Safari  |  Edge  |   IE   |
    * | :------: | :------: | :-----: | :----: | :----: |
    * |  **36**  |  **16**  |  **9**  | **12** | **10** |
    * | 12 _-x-_ | 10 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/perspective
    */
  var perspective: js.UndefOr[PerspectiveProperty[TLength] | js.Array[PerspectiveProperty[TLength]]] = js.native
  
  /**
    * The **`perspective-origin`** CSS property determines the position at which the viewer is looking. It is used as the _vanishing point_ by the `perspective` property.
    *
    * **Syntax**: `<position>`
    *
    * **Initial value**: `50% 50%`
    *
    * |  Chrome  | Firefox  | Safari  |  Edge  |   IE   |
    * | :------: | :------: | :-----: | :----: | :----: |
    * |  **36**  |  **16**  |  **9**  | **12** | **10** |
    * | 12 _-x-_ | 10 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/perspective-origin
    */
  var perspectiveOrigin: js.UndefOr[
    PerspectiveOriginProperty[TLength] | js.Array[PerspectiveOriginProperty[TLength]]
  ] = js.native
  
  /**
    * The `**place-content**` CSS property is a shorthand for `align-content` and `justify-content`. It can be used in any layout method which utilizes both of these alignment values.
    *
    * **Syntax**: `<'align-content'> <'justify-content'>?`
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **59** | **45**  | **9**  | **79** | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **59** | **53**  | **11** | **79** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/place-content
    */
  var placeContent: js.UndefOr[PlaceContentProperty | js.Array[PlaceContentProperty]] = js.native
  
  /**
    * The **`pointer-events`** CSS property sets under what circumstances (if any) a particular graphic element can become the target of mouse events.
    *
    * **Syntax**: `auto | none | visiblePainted | visibleFill | visibleStroke | visible | painted | fill | stroke | all | inherit`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **1**  | **1.5** | **4**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/pointer-events
    */
  var pointerEvents: js.UndefOr[PointerEventsProperty | js.Array[PointerEventsProperty]] = js.native
  
  /**
    * The **`position`** CSS property sets how an element is positioned in a document. The `top`, `right`, `bottom`, and `left` properties determine the final location of positioned elements.
    *
    * **Syntax**: `static | relative | absolute | sticky | fixed`
    *
    * **Initial value**: `static`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/position
    */
  var position: js.UndefOr[PositionProperty | js.Array[PositionProperty]] = js.native
  
  /**
    * The **`quotes`** CSS property sets how quotation marks appear.
    *
    * **Syntax**: `none | auto | [ <string> <string> ]+`
    *
    * **Initial value**: depends on user agent
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **11** | **1.5** | **9**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/quotes
    */
  var quotes: js.UndefOr[QuotesProperty | js.Array[QuotesProperty]] = js.native
  
  /**
    * The **`resize`** CSS property sets whether an element is resizable, and if so, in which directions.
    *
    * **Syntax**: `none | both | horizontal | vertical | block | inline`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **1**  |  **4**  | **3**  | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/resize
    */
  var resize: js.UndefOr[ResizeProperty | js.Array[ResizeProperty]] = js.native
  
  /**
    * The **`right`** CSS property participates in specifying the horizontal position of a _positioned element_. It has no effect on non-positioned elements.
    *
    * **Syntax**: `<length> | <percentage> | auto`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/right
    */
  var right: js.UndefOr[RightProperty[TLength] | js.Array[RightProperty[TLength]]] = js.native
  
  /**
    * The **`rotate`** CSS property allows you to specify rotation transforms individually and independantly of the `transform` property. This maps better to typical user interface usage, and saves having to remember the exact order of transform functions to specify in the `transform` value.
    *
    * **Syntax**: `none | <angle> | [ x | y | z | <number>{3} ] && <angle>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **72**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/rotate
    */
  var rotate: js.UndefOr[RotateProperty | js.Array[RotateProperty]] = js.native
  
  /**
    * The **`row-gap`** CSS property sets the size of the gap (gutter) between an element's grid rows.
    *
    * **Syntax**: `normal | <length-percentage>`
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **63**  |   No   |  No  | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * |       Chrome        |       Firefox       |          Safari           |  Edge  | IE  |
    * | :-----------------: | :-----------------: | :-----------------------: | :----: | :-: |
    * |       **66**        |       **61**        | **10.1** _(grid-row-gap)_ | **16** | No  |
    * | 57 _(grid-row-gap)_ | 52 _(grid-row-gap)_ |                           |        |     |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/row-gap
    */
  var rowGap: js.UndefOr[RowGapProperty[TLength] | js.Array[RowGapProperty[TLength]]] = js.native
  
  /**
    * The `**ruby-align**` CSS property defines the distribution of the different ruby elements over the base.
    *
    * **Syntax**: `start | center | space-between | space-around`
    *
    * **Initial value**: `space-around`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **38**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/ruby-align
    */
  var rubyAlign: js.UndefOr[RubyAlignProperty | js.Array[RubyAlignProperty]] = js.native
  
  /**
    * **Syntax**: `separate | collapse | auto`
    *
    * **Initial value**: `separate`
    */
  var rubyMerge: js.UndefOr[RubyMergeProperty | js.Array[RubyMergeProperty]] = js.native
  
  /**
    * The `**ruby-position**` CSS property defines the position of a ruby element relatives to its base element. It can be position over the element (`over`), under it (`under`), or between the characters, on their right side (`inter-character`).
    *
    * **Syntax**: `over | under | inter-character`
    *
    * **Initial value**: `over`
    *
    * | Chrome | Firefox | Safari | Edge  | IE  |
    * | :----: | :-----: | :----: | :---: | :-: |
    * |   No   | **38**  |   No   | 12-79 | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/ruby-position
    */
  var rubyPosition: js.UndefOr[RubyPositionProperty | js.Array[RubyPositionProperty]] = js.native
  
  /**
    * The **`scale`** CSS property allows you to specify scale transforms individually and independantly of the `transform` property. This maps better to typical user interface usage, and saves having to remember the exact order of transform functions to specify in the `transform` value.
    *
    * **Syntax**: `none | <number>{1,3}`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **72**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scale
    */
  var scale: js.UndefOr[ScaleProperty | js.Array[ScaleProperty]] = js.native
  
  /**
    * The **`scroll-behavior`** CSS property sets the behavior for a scrolling box when scrolling is triggered by the navigation or CSSOM scrolling APIs.
    *
    * **Syntax**: `auto | smooth`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **61** | **36**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-behavior
    */
  var scrollBehavior: js.UndefOr[ScrollBehaviorProperty | js.Array[ScrollBehaviorProperty]] = js.native
  
  /**
    * The **`scroll-margin`** property is a shorthand property which sets all of the `scroll-margin` longhands, assigning values much like the `margin` property does for the `margin-*` longhands.
    *
    * **Syntax**: `<length>{1,4}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |            Safari             |  Edge  | IE  |
    * | :----: | :-----: | :---------------------------: | :----: | :-: |
    * | **69** | **68**  | **11** _(scroll-snap-margin)_ | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin
    */
  var scrollMargin: js.UndefOr[ScrollMarginProperty[TLength] | js.Array[ScrollMarginProperty[TLength]]] = js.native
  
  /**
    * The `scroll-margin-block` property is a shorthand property which sets the scroll-margin longhands in the block dimension.
    *
    * **Syntax**: `<length>{1,2}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block
    */
  var scrollMarginBlock: js.UndefOr[
    ScrollMarginBlockProperty[TLength] | js.Array[ScrollMarginBlockProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-margin-block-end` property defines the margin of the scroll snap area at the end of the block dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block-end
    */
  var scrollMarginBlockEnd: js.UndefOr[
    ScrollMarginBlockEndProperty[TLength] | js.Array[ScrollMarginBlockEndProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-margin-block-start` property defines the margin of the scroll snap area at the start of the block dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block-start
    */
  var scrollMarginBlockStart: js.UndefOr[
    ScrollMarginBlockStartProperty[TLength] | js.Array[ScrollMarginBlockStartProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-margin-bottom` property defines the bottom margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |                Safari                |  Edge  | IE  |
    * | :----: | :-----: | :----------------------------------: | :----: | :-: |
    * | **69** | **68**  | **11** _(scroll-snap-margin-bottom)_ | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-bottom
    */
  var scrollMarginBottom: js.UndefOr[
    ScrollMarginBottomProperty[TLength] | js.Array[ScrollMarginBottomProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-margin-inline` property is a shorthand property which sets the scroll-margin longhands in the inline dimension.
    *
    * **Syntax**: `<length>{1,2}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **68**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-inline
    */
  var scrollMarginInline: js.UndefOr[
    ScrollMarginInlineProperty[TLength] | js.Array[ScrollMarginInlineProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-margin-inline-end` property defines the margin of the scroll snap area at the end of the inline dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-inline-end
    */
  var scrollMarginInlineEnd: js.UndefOr[
    ScrollMarginInlineEndProperty[TLength] | js.Array[ScrollMarginInlineEndProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-margin-inline-start` property defines the margin of the scroll snap area at the start of the inline dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-inline-start
    */
  var scrollMarginInlineStart: js.UndefOr[
    ScrollMarginInlineStartProperty[TLength] | js.Array[ScrollMarginInlineStartProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-margin-left` property defines the left margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |               Safari               |  Edge  | IE  |
    * | :----: | :-----: | :--------------------------------: | :----: | :-: |
    * | **69** | **68**  | **11** _(scroll-snap-margin-left)_ | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-left
    */
  var scrollMarginLeft: js.UndefOr[ScrollMarginLeftProperty[TLength] | js.Array[ScrollMarginLeftProperty[TLength]]] = js.native
  
  /**
    * The `scroll-margin-right` property defines the right margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |               Safari                |  Edge  | IE  |
    * | :----: | :-----: | :---------------------------------: | :----: | :-: |
    * | **69** | **68**  | **11** _(scroll-snap-margin-right)_ | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-right
    */
  var scrollMarginRight: js.UndefOr[
    ScrollMarginRightProperty[TLength] | js.Array[ScrollMarginRightProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-margin-top` property defines the top margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |              Safari               |  Edge  | IE  |
    * | :----: | :-----: | :-------------------------------: | :----: | :-: |
    * | **69** | **68**  | **11** _(scroll-snap-margin-top)_ | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-top
    */
  var scrollMarginTop: js.UndefOr[ScrollMarginTopProperty[TLength] | js.Array[ScrollMarginTopProperty[TLength]]] = js.native
  
  /**
    * The scroll-padding property is a shorthand property which sets all of the scroll-padding longhands, assigning values much like the padding property does for the padding-\* longhands.  
    
  The scroll-padding properties define offsets for the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    * 
    * **Syntax**: `[ auto | <length-percentage> ]{1,4}`
    * 
    * **Initial value**: `auto`
    * 
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  | **11** | **79** | No  |
    * 
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding
    */
  var scrollPadding: js.UndefOr[ScrollPaddingProperty[TLength] | js.Array[ScrollPaddingProperty[TLength]]] = js.native
  
  /**
    * The `scroll-padding-block` property is a shorthand property which sets the scroll-padding longhands for the block dimension.  
    
  The scroll-padding properties define offsets for the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    * 
    * **Syntax**: `[ auto | <length-percentage> ]{1,2}`
    * 
    * **Initial value**: `auto`
    * 
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  |   No   | **79** | No  |
    * 
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block
    */
  var scrollPaddingBlock: js.UndefOr[
    ScrollPaddingBlockProperty[TLength] | js.Array[ScrollPaddingBlockProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-padding-block-end` property defines offsets for the end edge in the block dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Syntax**: `auto | <length-percentage>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block-end
    */
  var scrollPaddingBlockEnd: js.UndefOr[
    ScrollPaddingBlockEndProperty[TLength] | js.Array[ScrollPaddingBlockEndProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-padding-block-start` property defines offsets for the start edge in the block dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Syntax**: `auto | <length-percentage>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block-start
    */
  var scrollPaddingBlockStart: js.UndefOr[
    ScrollPaddingBlockStartProperty[TLength] | js.Array[ScrollPaddingBlockStartProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-padding-bottom` property defines offsets for the bottom of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Syntax**: `auto | <length-percentage>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  | **11** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-bottom
    */
  var scrollPaddingBottom: js.UndefOr[
    ScrollPaddingBottomProperty[TLength] | js.Array[ScrollPaddingBottomProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-padding-inline` property is a shorthand property which sets the scroll-padding longhands for the inline dimension.  
    
  The scroll-padding properties define offsets for the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    * 
    * **Syntax**: `[ auto | <length-percentage> ]{1,2}`
    * 
    * **Initial value**: `auto`
    * 
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  |   No   | **79** | No  |
    * 
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline
    */
  var scrollPaddingInline: js.UndefOr[
    ScrollPaddingInlineProperty[TLength] | js.Array[ScrollPaddingInlineProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-padding-inline-end` property defines offsets for the end edge in the inline dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Syntax**: `auto | <length-percentage>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline-end
    */
  var scrollPaddingInlineEnd: js.UndefOr[
    ScrollPaddingInlineEndProperty[TLength] | js.Array[ScrollPaddingInlineEndProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-padding-inline-start` property defines offsets for the start edge in the inline dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Syntax**: `auto | <length-percentage>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline-start
    */
  var scrollPaddingInlineStart: js.UndefOr[
    ScrollPaddingInlineStartProperty[TLength] | js.Array[ScrollPaddingInlineStartProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-padding-left` property defines offsets for the left of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Syntax**: `auto | <length-percentage>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  | **11** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-left
    */
  var scrollPaddingLeft: js.UndefOr[
    ScrollPaddingLeftProperty[TLength] | js.Array[ScrollPaddingLeftProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-padding-right` property defines offsets for the right of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Syntax**: `auto | <length-percentage>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  | **11** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-right
    */
  var scrollPaddingRight: js.UndefOr[
    ScrollPaddingRightProperty[TLength] | js.Array[ScrollPaddingRightProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-padding-top` property defines offsets for the top of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Syntax**: `auto | <length-percentage>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  | **11** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-top
    */
  var scrollPaddingTop: js.UndefOr[ScrollPaddingTopProperty[TLength] | js.Array[ScrollPaddingTopProperty[TLength]]] = js.native
  
  /**
    * The `scroll-snap-align` property specifies the box’s snap position as an alignment of its snap area (as the alignment subject) within its snap container’s snapport (as the alignment container). The two values specify the snapping alignment in the block axis and inline axis, respectively. If only one value is specified, the second value defaults to the same value.
    *
    * **Syntax**: `[ none | start | end | center ]{1,2}`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  | **11** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-snap-align
    */
  var scrollSnapAlign: js.UndefOr[ScrollSnapAlignProperty | js.Array[ScrollSnapAlignProperty]] = js.native
  
  /**
    * The **`scroll-margin`** property is a shorthand property which sets all of the `scroll-margin` longhands, assigning values much like the `margin` property does for the `margin-*` longhands.
    *
    * **Syntax**: `<length>{1,4}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |            Safari             |  Edge  | IE  |
    * | :----: | :-----: | :---------------------------: | :----: | :-: |
    * | **69** | **68**  | **11** _(scroll-snap-margin)_ | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin
    */
  var scrollSnapMargin: js.UndefOr[ScrollMarginProperty[TLength] | js.Array[ScrollMarginProperty[TLength]]] = js.native
  
  /**
    * The `scroll-margin-bottom` property defines the bottom margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |                Safari                |  Edge  | IE  |
    * | :----: | :-----: | :----------------------------------: | :----: | :-: |
    * | **69** | **68**  | **11** _(scroll-snap-margin-bottom)_ | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-bottom
    */
  var scrollSnapMarginBottom: js.UndefOr[
    ScrollMarginBottomProperty[TLength] | js.Array[ScrollMarginBottomProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-margin-left` property defines the left margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |               Safari               |  Edge  | IE  |
    * | :----: | :-----: | :--------------------------------: | :----: | :-: |
    * | **69** | **68**  | **11** _(scroll-snap-margin-left)_ | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-left
    */
  var scrollSnapMarginLeft: js.UndefOr[ScrollMarginLeftProperty[TLength] | js.Array[ScrollMarginLeftProperty[TLength]]] = js.native
  
  /**
    * The `scroll-margin-right` property defines the right margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |               Safari                |  Edge  | IE  |
    * | :----: | :-----: | :---------------------------------: | :----: | :-: |
    * | **69** | **68**  | **11** _(scroll-snap-margin-right)_ | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-right
    */
  var scrollSnapMarginRight: js.UndefOr[
    ScrollMarginRightProperty[TLength] | js.Array[ScrollMarginRightProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-margin-top` property defines the top margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |              Safari               |  Edge  | IE  |
    * | :----: | :-----: | :-------------------------------: | :----: | :-: |
    * | **69** | **68**  | **11** _(scroll-snap-margin-top)_ | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-top
    */
  var scrollSnapMarginTop: js.UndefOr[ScrollMarginTopProperty[TLength] | js.Array[ScrollMarginTopProperty[TLength]]] = js.native
  
  /**
    * The **`scroll-snap-stop`** CSS property defines whether the scroll container is allowed to "pass over" possible snap positions.
    *
    * **Syntax**: `normal | always`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **75** |   No    |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-snap-stop
    */
  var scrollSnapStop: js.UndefOr[ScrollSnapStopProperty | js.Array[ScrollSnapStopProperty]] = js.native
  
  /**
    * The **`scroll-snap-type`** CSS property sets how strictly snap points are enforced on the scroll container in case there is one.
    *
    * **Syntax**: `none | [ x | y | block | inline | both ] [ mandatory | proximity ]?`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |     Edge     |      IE      |
    * | :----: | :-----: | :-----: | :----------: | :----------: |
    * | **69** |  39-68  | **11**  | **12** _-x-_ | **10** _-x-_ |
    * |        |         | 9 _-x-_ |              |              |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-snap-type
    */
  var scrollSnapType: js.UndefOr[ScrollSnapTypeProperty | js.Array[ScrollSnapTypeProperty]] = js.native
  
  /**
    * The **`scrollbar-color`** CSS property sets the color of the scrollbar track and thumb.
    *
    * **Syntax**: `auto | dark | light | <color>{2}`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **64**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scrollbar-color
    */
  var scrollbarColor: js.UndefOr[ScrollbarColorProperty | js.Array[ScrollbarColorProperty]] = js.native
  
  /**
    * The `scrollbar-width` property allows the author to set the maximum thickness of an element’s scrollbars when they are shown.
    *
    * **Syntax**: `auto | thin | none`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **64**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scrollbar-width
    */
  var scrollbarWidth: js.UndefOr[ScrollbarWidthProperty | js.Array[ScrollbarWidthProperty]] = js.native
  
  /**
    * The **`shape-image-threshold`** CSS property sets the alpha channel threshold used to extract the shape using an image as the value for `shape-outside`.
    *
    * **Syntax**: `<alpha-value>`
    *
    * **Initial value**: `0.0`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **37** | **62**  | **10.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/shape-image-threshold
    */
  var shapeImageThreshold: js.UndefOr[ShapeImageThresholdProperty | js.Array[ShapeImageThresholdProperty]] = js.native
  
  /**
    * The **`shape-margin`** CSS property sets a margin for a CSS shape created using `shape-outside`.
    *
    * **Syntax**: `<length-percentage>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |     Safari     |  Edge  | IE  |
    * | :----: | :-----: | :------------: | :----: | :-: |
    * | **37** | **62**  | **10.1** _-x-_ | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/shape-margin
    */
  var shapeMargin: js.UndefOr[ShapeMarginProperty[TLength] | js.Array[ShapeMarginProperty[TLength]]] = js.native
  
  /**
    * The **`shape-outside`** CSS property defines a shape—which may be non-rectangular—around which adjacent inline content should wrap. By default, inline content wraps around its margin box; `shape-outside` provides a way to customize this wrapping, making it possible to wrap text around complex objects rather than simple boxes.
    *
    * **Syntax**: `none | <shape-box> || <basic-shape> | <image>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **37** | **62**  | **10.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/shape-outside
    */
  var shapeOutside: js.UndefOr[ShapeOutsideProperty | js.Array[ShapeOutsideProperty]] = js.native
  
  /**
    * The **`tab-size`** CSS property is used to customize the width of a tab (`U+0009`) character.
    *
    * **Syntax**: `<integer> | <length>`
    *
    * **Initial value**: `8`
    *
    * | Chrome |   Firefox   | Safari  |  Edge  | IE  |
    * | :----: | :---------: | :-----: | :----: | :-: |
    * | **21** | **4** _-x-_ | **6.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/tab-size
    */
  var tabSize: js.UndefOr[TabSizeProperty[TLength] | js.Array[TabSizeProperty[TLength]]] = js.native
  
  /**
    * The **`table-layout`** CSS property sets the algorithm used to lay out `<table>` cells, rows, and columns.
    *
    * **Syntax**: `auto | fixed`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **14** |  **1**  | **1**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/table-layout
    */
  var tableLayout: js.UndefOr[TableLayoutProperty | js.Array[TableLayoutProperty]] = js.native
  
  /**
    * The **`text-align`** CSS property sets the horizontal alignment of an inline or table-cell box. This means it works like `vertical-align` but in the horizontal direction.
    *
    * **Syntax**: `start | end | left | right | center | justify | match-parent`
    *
    * **Initial value**: `start`, or a nameless value that acts as `left` if _direction_ is `ltr`, `right` if _direction_ is `rtl` if `start` is not supported by the browser.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-align
    */
  var textAlign: js.UndefOr[TextAlignProperty | js.Array[TextAlignProperty]] = js.native
  
  /**
    * The **`text-align-last`** CSS property sets how the last line of a block or a line, right before a forced line break, is aligned.
    *
    * **Syntax**: `auto | start | end | left | right | center | justify`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **47** | **49**  |   No   | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-align-last
    */
  var textAlignLast: js.UndefOr[TextAlignLastProperty | js.Array[TextAlignLastProperty]] = js.native
  
  /**
    * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
    *
    * **Syntax**: `none | all | [ digits <integer>? ]`
    *
    * **Initial value**: `none`
    *
    * |           Chrome           | Firefox |              Safari              |                  Edge                  |                   IE                   |
    * | :------------------------: | :-----: | :------------------------------: | :------------------------------------: | :------------------------------------: |
    * |           **48**           | **48**  | **5.1** _(-webkit-text-combine)_ | **12** _(-ms-text-combine-horizontal)_ | **11** _(-ms-text-combine-horizontal)_ |
    * | 9 _(-webkit-text-combine)_ |         |                                  |                                        |                                        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-combine-upright
    */
  var textCombineUpright: js.UndefOr[TextCombineUprightProperty | js.Array[TextCombineUprightProperty]] = js.native
  
  /**
    * The **`text-decoration-color`** CSS property sets the color of decorations added to text by `text-decoration-line`.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **36**  | **12.1** | **79** | No  |
    * |        |         | 8 _-x-_  |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-color
    */
  var textDecorationColor: js.UndefOr[TextDecorationColorProperty | js.Array[TextDecorationColorProperty]] = js.native
  
  /**
    * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element, such as an underline or overline.
    *
    * **Syntax**: `none | [ underline || overline || line-through || blink ] | spelling-error | grammar-error`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **36**  | **12.1** | **79** | No  |
    * |        |         | 8 _-x-_  |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-line
    */
  var textDecorationLine: js.UndefOr[TextDecorationLineProperty | js.Array[TextDecorationLineProperty]] = js.native
  
  /**
    * The **`text-decoration-skip`** CSS property sets what parts of an element’s content any text decoration affecting the element must skip over. It controls all text decoration lines drawn by the element and also any text decoration lines drawn by its ancestors.
    *
    * **Syntax**: `none | [ objects || [ spaces | [ leading-spaces || trailing-spaces ] ] || edges || box-decoration ]`
    *
    * **Initial value**: `objects`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | 57-64  |   No    | **12.1** |  No  | No  |
    * |        |         | 8 _-x-_  |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-skip
    */
  var textDecorationSkip: js.UndefOr[TextDecorationSkipProperty | js.Array[TextDecorationSkipProperty]] = js.native
  
  /**
    * The **`text-decoration-skip-ink`** CSS property specifies how overlines and underlines are drawn when they pass over glyph ascenders and descenders.
    *
    * **Syntax**: `auto | all | none`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **64** | **70**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-skip-ink
    */
  var textDecorationSkipInk: js.UndefOr[TextDecorationSkipInkProperty | js.Array[TextDecorationSkipInkProperty]] = js.native
  
  /**
    * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are set with `text-decoration-line`.
    *
    * **Syntax**: `solid | double | dotted | dashed | wavy`
    *
    * **Initial value**: `solid`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **36**  | **12.1** | **79** | No  |
    * |        |         | 8 _-x-_  |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-style
    */
  var textDecorationStyle: js.UndefOr[TextDecorationStyleProperty | js.Array[TextDecorationStyleProperty]] = js.native
  
  /**
    * The **`text-decoration-thickness`** CSS property sets the thickness, or width, of the decoration line that is used on text in an element, such as a line-through, underline, or overline.
    *
    * **Syntax**: `auto | from-font | <length> | <percentage> `
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * |   No   | **70**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-thickness
    */
  var textDecorationThickness: js.UndefOr[
    TextDecorationThicknessProperty[TLength] | js.Array[TextDecorationThicknessProperty[TLength]]
  ] = js.native
  
  /**
    * The **`text-decoration-thickness`** CSS property sets the thickness, or width, of the decoration line that is used on text in an element, such as a line-through, underline, or overline.
    *
    * **Syntax**: `auto | from-font | <length> | <percentage> `
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * |   No   | **70**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-thickness
    */
  var textDecorationWidth: js.UndefOr[
    TextDecorationThicknessProperty[TLength] | js.Array[TextDecorationThicknessProperty[TLength]]
  ] = js.native
  
  /**
    * The **`text-emphasis-color`** CSS property sets the color of emphasis marks. This value can also be set using the `text-emphasis` shorthand.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    *
    * |    Chrome    | Firefox | Safari  |     Edge     | IE  |
    * | :----------: | :-----: | :-----: | :----------: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** | **79** _-x-_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis-color
    */
  var textEmphasisColor: js.UndefOr[TextEmphasisColorProperty | js.Array[TextEmphasisColorProperty]] = js.native
  
  /**
    * The **`text-emphasis-position`** CSS property sets where emphasis marks are drawn. Like ruby text, if there isn't enough room for emphasis marks, the line height is increased.
    *
    * **Syntax**: `[ over | under ] && [ right | left ]`
    *
    * **Initial value**: `over right`
    *
    * |    Chrome    | Firefox | Safari  |     Edge     | IE  |
    * | :----------: | :-----: | :-----: | :----------: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** | **79** _-x-_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis-position
    */
  var textEmphasisPosition: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`text-emphasis-style`** CSS property sets the appearance of emphasis marks. It can also be set, and reset, using the `text-emphasis` shorthand.
    *
    * **Syntax**: `none | [ [ filled | open ] || [ dot | circle | double-circle | triangle | sesame ] ] | <string>`
    *
    * **Initial value**: `none`
    *
    * |    Chrome    | Firefox | Safari  |     Edge     | IE  |
    * | :----------: | :-----: | :-----: | :----------: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** | **79** _-x-_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis-style
    */
  var textEmphasisStyle: js.UndefOr[TextEmphasisStyleProperty | js.Array[TextEmphasisStyleProperty]] = js.native
  
  /**
    * The **`text-indent`** CSS property sets the length of empty space (indentation) that is put before lines of text in a block.
    *
    * **Syntax**: `<length-percentage> && hanging? && each-line?`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-indent
    */
  var textIndent: js.UndefOr[TextIndentProperty[TLength] | js.Array[TextIndentProperty[TLength]]] = js.native
  
  /**
    * The **`text-justify`** CSS property sets what type of justification should be applied to text when `text-align``: justify;` is set on an element.
    *
    * **Syntax**: `auto | inter-character | inter-word | none`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * |  n/a   | **55**  |   No   | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-justify
    */
  var textJustify: js.UndefOr[TextJustifyProperty | js.Array[TextJustifyProperty]] = js.native
  
  /**
    * The **`text-orientation`** CSS property sets the orientation of the text characters in a line. It only affects text in vertical mode (when `writing-mode` is not `horizontal-tb`). It is useful for controlling the display of languages that use vertical script, and also for making vertical table headers.
    *
    * **Syntax**: `mixed | upright | sideways`
    *
    * **Initial value**: `mixed`
    *
    * |  Chrome  | Firefox |    Safari     |  Edge  | IE  |
    * | :------: | :-----: | :-----------: | :----: | :-: |
    * |  **48**  | **41**  | **5.1** _-x-_ | **79** | No  |
    * | 11 _-x-_ |         |               |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-orientation
    */
  var textOrientation: js.UndefOr[TextOrientationProperty | js.Array[TextOrientationProperty]] = js.native
  
  /**
    * The **`text-overflow`** CSS property sets how hidden overflow content is signaled to users. It can be clipped, display an ellipsis ('`…`'), or display a custom string.
    *
    * **Syntax**: `[ clip | ellipsis | <string> ]{1,2}`
    *
    * **Initial value**: `clip`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **7**  | **1.3** | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-overflow
    */
  var textOverflow: js.UndefOr[TextOverflowProperty | js.Array[TextOverflowProperty]] = js.native
  
  /**
    * The **`text-rendering`** CSS property provides information to the rendering engine about what to optimize for when rendering text.
    *
    * **Syntax**: `auto | optimizeSpeed | optimizeLegibility | geometricPrecision`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **4**  |  **1**  | **5**  | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-rendering
    */
  var textRendering: js.UndefOr[TextRenderingProperty | js.Array[TextRenderingProperty]] = js.native
  
  /**
    * The **`text-shadow`** CSS property adds shadows to text. It accepts a comma-separated list of shadows to be applied to the text and any of its `decorations`. Each shadow is described by some combination of X and Y offsets from the element, blur radius, and color.
    *
    * **Syntax**: `none | <shadow-t>#`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE   |
    * | :----: | :-----: | :-----: | :----: | :----: |
    * | **2**  | **3.5** | **1.1** | **12** | **10** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-shadow
    */
  var textShadow: js.UndefOr[TextShadowProperty | js.Array[TextShadowProperty]] = js.native
  
  /**
    * The **`text-size-adjust`** CSS property controls the text inflation algorithm used on some smartphones and tablets. Other browsers will ignore this property.
    *
    * **Syntax**: `none | auto | <percentage>`
    *
    * **Initial value**: `auto` for smartphone browsers supporting inflation, `none` in other cases (and then not modifiable).
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **54** |   No    |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-size-adjust
    */
  var textSizeAdjust: js.UndefOr[TextSizeAdjustProperty | js.Array[TextSizeAdjustProperty]] = js.native
  
  /**
    * The **`text-transform`** CSS property specifies how to capitalize an element's text. It can be used to make text appear in all-uppercase or all-lowercase, or with each word capitalized. It also can help improve legibility for ruby
    *
    * **Syntax**: `none | capitalize | uppercase | lowercase | full-width | full-size-kana`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-transform
    */
  var textTransform: js.UndefOr[TextTransformProperty | js.Array[TextTransformProperty]] = js.native
  
  /**
    * The **`text-underline-offset`** CSS property sets the offset distance of an underline text decoration line (applied using `text-decoration`) from its original position.
    *
    * **Syntax**: `auto | <length> | <percentage> `
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * |   No   | **70**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-underline-offset
    */
  var textUnderlineOffset: js.UndefOr[
    TextUnderlineOffsetProperty[TLength] | js.Array[TextUnderlineOffsetProperty[TLength]]
  ] = js.native
  
  /**
    * The **`text-underline-position`** CSS property specifies the position of the underline which is set using the `text-decoration` property's `underline` value.
    *
    * **Syntax**: `auto | from-font | [ under || [ left | right ] ]`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :------: | :----: | :---: |
    * | **33** | **74**  | **12.1** | **12** | **6** |
    * |        |         | 9 _-x-_  |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-underline-position
    */
  var textUnderlinePosition: js.UndefOr[TextUnderlinePositionProperty | js.Array[TextUnderlinePositionProperty]] = js.native
  
  /**
    * The **`top`** CSS property participates in specifying the vertical position of a _positioned element_. It has no effect on non-positioned elements.
    *
    * **Syntax**: `<length> | <percentage> | auto`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/top
    */
  var top: js.UndefOr[TopProperty[TLength] | js.Array[TopProperty[TLength]]] = js.native
  
  /**
    * The **`touch-action`** CSS property sets how a region can be manipulated by a touchscreen user (for example, by zooming features built into the browser).
    *
    * **Syntax**: `auto | none | [ [ pan-x | pan-left | pan-right ] || [ pan-y | pan-up | pan-down ] || pinch-zoom ] | manipulation`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |    IE    |
    * | :----: | :-----: | :----: | :----: | :------: |
    * | **36** | **52**  | **13** | **12** |  **11**  |
    * |        |         |        |        | 10 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/touch-action
    */
  var touchAction: js.UndefOr[TouchActionProperty | js.Array[TouchActionProperty]] = js.native
  
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
    *
    * **Syntax**: `none | <transform-list>`
    *
    * **Initial value**: `none`
    *
    * | Chrome  | Firefox |  Safari   |  Edge  |   IE    |
    * | :-----: | :-----: | :-------: | :----: | :-----: |
    * | **36**  | **16**  |   **9**   | **12** | **10**  |
    * | 1 _-x-_ |         | 3.1 _-x-_ |        | 9 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform
    */
  var transform: js.UndefOr[TransformProperty | js.Array[TransformProperty]] = js.native
  
  /**
    * The **`transform-box`** CSS property defines the layout box to which the `transform` and `transform-origin` properties relate.
    *
    * **Syntax**: `content-box | border-box | fill-box | stroke-box | view-box`
    *
    * **Initial value**: `view-box`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **64** | **55**  | **11** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform-box
    */
  var transformBox: js.UndefOr[TransformBoxProperty | js.Array[TransformBoxProperty]] = js.native
  
  /**
    * The **`transform-origin`** CSS property sets the origin for an element's transformations.
    *
    * **Syntax**: `[ <length-percentage> | left | center | right | top | bottom ] | [ [ <length-percentage> | left | center | right ] && [ <length-percentage> | top | center | bottom ] ] <length>?`
    *
    * **Initial value**: `50% 50% 0`
    *
    * | Chrome  |  Firefox  | Safari  |  Edge  |   IE    |
    * | :-----: | :-------: | :-----: | :----: | :-----: |
    * | **36**  |  **16**   |  **9**  | **12** | **10**  |
    * | 1 _-x-_ | 3.5 _-x-_ | 2 _-x-_ |        | 9 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform-origin
    */
  var transformOrigin: js.UndefOr[TransformOriginProperty[TLength] | js.Array[TransformOriginProperty[TLength]]] = js.native
  
  /**
    * The **`transform-style`** CSS property sets whether children of an element are positioned in the 3D space or are flattened in the plane of the element.
    *
    * **Syntax**: `flat | preserve-3d`
    *
    * **Initial value**: `flat`
    *
    * |  Chrome  | Firefox  | Safari  |  Edge  | IE  |
    * | :------: | :------: | :-----: | :----: | :-: |
    * |  **36**  |  **16**  |  **9**  | **12** | No  |
    * | 12 _-x-_ | 10 _-x-_ | 4 _-x-_ |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform-style
    */
  var transformStyle: js.UndefOr[TransformStyleProperty | js.Array[TransformStyleProperty]] = js.native
  
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **26**  | **16**  |  **9**  | **12** | **10** |
    * | 1 _-x-_ | 4 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition-delay
    */
  var transitionDelay: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * | Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :-----: | :-----: | :-------: | :----: | :----: |
    * | **26**  | **16**  |   **9**   | **12** | **10** |
    * | 1 _-x-_ | 4 _-x-_ | 3.1 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition-duration
    */
  var transitionDuration: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Syntax**: `none | <single-transition-property>#`
    *
    * **Initial value**: all
    *
    * | Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :-----: | :-----: | :-------: | :----: | :----: |
    * | **26**  | **16**  |   **9**   | **12** | **10** |
    * | 1 _-x-_ | 4 _-x-_ | 3.1 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition-property
    */
  var transitionProperty: js.UndefOr[TransitionPropertyProperty | js.Array[TransitionPropertyProperty]] = js.native
  
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    *
    * | Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :-----: | :-----: | :-------: | :----: | :----: |
    * | **26**  | **16**  |   **9**   | **12** | **10** |
    * | 1 _-x-_ | 4 _-x-_ | 3.1 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition-timing-function
    */
  var transitionTimingFunction: js.UndefOr[TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]] = js.native
  
  /**
    * The **`translate`** CSS property allows you to specify translation transforms individually and independantly of the `transform` property. This maps better to typical user interface usage, and saves having to remember the exact order of transform functions to specify in the `transform` value.
    *
    * **Syntax**: `none | <length-percentage> [ <length-percentage> <length>? ]?`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **72**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/translate
    */
  var translate: js.UndefOr[TranslateProperty[TLength] | js.Array[TranslateProperty[TLength]]] = js.native
  
  /**
    * The **`unicode-bidi`** CSS property, together with the `direction` property, determines how bidirectional text in a document is handled. For example, if a block of content contains both left-to-right and right-to-left text, the user-agent uses a complex Unicode algorithm to decide how to display the text. The `unicode-bidi` property overrides this algorithm and allows the developer to control the text embedding.
    *
    * **Syntax**: `normal | embed | isolate | bidi-override | isolate-override | plaintext`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE    |
    * | :----: | :-----: | :-----: | :----: | :-----: |
    * | **2**  |  **1**  | **1.3** | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/unicode-bidi
    */
  var unicodeBidi: js.UndefOr[UnicodeBidiProperty | js.Array[UnicodeBidiProperty]] = js.native
  
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Syntax**: `auto | text | none | contain | all`
    *
    * **Initial value**: `auto`
    *
    * | Chrome  | Firefox |   Safari    |     Edge     |      IE      |
    * | :-----: | :-----: | :---------: | :----------: | :----------: |
    * | **54**  | **69**  | **3** _-x-_ | **12** _-x-_ | **10** _-x-_ |
    * | 1 _-x-_ | 1 _-x-_ |             |              |              |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/user-select
    */
  var userSelect: js.UndefOr[UserSelectProperty | js.Array[UserSelectProperty]] = js.native
  
  /**
    * The **`vertical-align`** CSS property sets vertical alignment of an inline or table-cell box.
    *
    * **Syntax**: `baseline | sub | super | text-top | text-bottom | middle | top | bottom | <percentage> | <length>`
    *
    * **Initial value**: `baseline`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/vertical-align
    */
  var verticalAlign: js.UndefOr[VerticalAlignProperty[TLength] | js.Array[VerticalAlignProperty[TLength]]] = js.native
  
  /**
    * The **`visibility`** CSS property shows or hides an element without changing the layout of a document. The property can also hide rows or columns in a `<table>`.
    *
    * **Syntax**: `visible | hidden | collapse`
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/visibility
    */
  var visibility: js.UndefOr[VisibilityProperty | js.Array[VisibilityProperty]] = js.native
  
  /**
    * The **`white-space`** CSS property sets how white space inside an element is handled.
    *
    * **Syntax**: `normal | pre | nowrap | pre-wrap | pre-line | break-spaces`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/white-space
    */
  var whiteSpace: js.UndefOr[WhiteSpaceProperty | js.Array[WhiteSpaceProperty]] = js.native
  
  /**
    * The **`widows`** CSS property sets the minimum number of lines in a block container that must be shown at the _top_ of a page, region, or column.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `2`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **25** |   No    | **1.3** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/widows
    */
  var widows: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`width`** CSS property sets an element's width. By default it sets the width of the content area, but if `box-sizing` is set to `border-box`, it sets the width of the border area.
    *
    * **Syntax**: `auto | <length> | <percentage> | min-content | max-content | fit-content(<length-percentage>)`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/width
    */
  var width: js.UndefOr[WidthProperty[TLength] | js.Array[WidthProperty[TLength]]] = js.native
  
  /**
    * The **`will-change`** CSS property hints to browsers how an element is expected to change. Browsers may set up optimizations before an element is actually changed. These kinds of optimizations can increase the responsiveness of a page by doing potentially expensive work before they are actually required.
    *
    * **Syntax**: `auto | <animateable-feature>#`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  | IE  |
    * | :----: | :-----: | :-----: | :----: | :-: |
    * | **36** | **36**  | **9.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/will-change
    */
  var willChange: js.UndefOr[WillChangeProperty | js.Array[WillChangeProperty]] = js.native
  
  /**
    * The **`word-break`** CSS property sets whether line breaks appear wherever the text would otherwise overflow its content box.
    *
    * **Syntax**: `normal | break-all | keep-all | break-word`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  | **15**  | **3**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/word-break
    */
  var wordBreak: js.UndefOr[WordBreakProperty | js.Array[WordBreakProperty]] = js.native
  
  /**
    * The **`word-spacing`** CSS property sets the length of space between words and between tags.
    *
    * **Syntax**: `normal | <length-percentage>`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/word-spacing
    */
  var wordSpacing: js.UndefOr[WordSpacingProperty[TLength] | js.Array[WordSpacingProperty[TLength]]] = js.native
  
  /**
    * The `**overflow-wrap**` CSS property sets whether the browser should insert line breaks within words to prevent text from overflowing its content box.
    *
    * **Syntax**: `normal | break-word`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  | **3.5** | **2**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-wrap
    */
  var wordWrap: js.UndefOr[WordWrapProperty | js.Array[WordWrapProperty]] = js.native
  
  /**
    * The **`writing-mode`** CSS property sets whether lines of text are laid out horizontally or vertically, as well as the direction in which blocks progress.
    *
    * **Syntax**: `horizontal-tb | vertical-rl | vertical-lr | sideways-rl | sideways-lr`
    *
    * **Initial value**: `horizontal-tb`
    *
    * | Chrome  | Firefox |  Safari   |  Edge  |     IE      |
    * | :-----: | :-----: | :-------: | :----: | :---------: |
    * | **48**  | **41**  | **10.1**  | **12** | **9** _-x-_ |
    * | 8 _-x-_ |         | 5.1 _-x-_ |        |             |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/writing-mode
    */
  var writingMode: js.UndefOr[WritingModeProperty | js.Array[WritingModeProperty]] = js.native
  
  /**
    * The **`z-index`** CSS property sets the z-order of a positioned element and its descendants or flex items. Overlapping elements with a larger z-index cover those with a smaller one.
    *
    * **Syntax**: `auto | <integer>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/z-index
    */
  var zIndex: js.UndefOr[ZIndexProperty | js.Array[ZIndexProperty]] = js.native
  
  /**
    * The non-standard **`zoom`** CSS property can be used to control the magnification level of an element. `transform: scale()` should be used instead of this property, if possible. However, unlike CSS Transforms, `zoom` affects the layout size of the element.
    *
    * **Syntax**: `normal | reset | <number> | <percentage>`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE    |
    * | :----: | :-----: | :-----: | :----: | :-----: |
    * | **1**  |   No    | **3.1** | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/zoom
    */
  var zoom: js.UndefOr[ZoomProperty | js.Array[ZoomProperty]] = js.native
}
object StandardLonghandPropertiesFallback {
  
  @scala.inline
  def apply[TLength](): StandardLonghandPropertiesFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardLonghandPropertiesFallback[TLength]]
  }
  
  @scala.inline
  implicit class StandardLonghandPropertiesFallbackOps[Self <: StandardLonghandPropertiesFallback[_], TLength] (val x: Self with StandardLonghandPropertiesFallback[TLength]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlignContentVarargs(value: AlignContentProperty*): Self = this.set("alignContent", js.Array(value :_*))
    
    @scala.inline
    def setAlignContent(value: AlignContentProperty | js.Array[AlignContentProperty]): Self = this.set("alignContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignContent: Self = this.set("alignContent", js.undefined)
    
    @scala.inline
    def setAlignItemsVarargs(value: AlignItemsProperty*): Self = this.set("alignItems", js.Array(value :_*))
    
    @scala.inline
    def setAlignItems(value: AlignItemsProperty | js.Array[AlignItemsProperty]): Self = this.set("alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignItems: Self = this.set("alignItems", js.undefined)
    
    @scala.inline
    def setAlignSelfVarargs(value: AlignSelfProperty*): Self = this.set("alignSelf", js.Array(value :_*))
    
    @scala.inline
    def setAlignSelf(value: AlignSelfProperty | js.Array[AlignSelfProperty]): Self = this.set("alignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignSelf: Self = this.set("alignSelf", js.undefined)
    
    @scala.inline
    def setAnimationDelayVarargs(value: GlobalsString*): Self = this.set("animationDelay", js.Array(value :_*))
    
    @scala.inline
    def setAnimationDelay(value: GlobalsString | js.Array[GlobalsString]): Self = this.set("animationDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDelay: Self = this.set("animationDelay", js.undefined)
    
    @scala.inline
    def setAnimationDirectionVarargs(value: AnimationDirectionProperty*): Self = this.set("animationDirection", js.Array(value :_*))
    
    @scala.inline
    def setAnimationDirection(value: AnimationDirectionProperty | js.Array[AnimationDirectionProperty]): Self = this.set("animationDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDirection: Self = this.set("animationDirection", js.undefined)
    
    @scala.inline
    def setAnimationDurationVarargs(value: GlobalsString*): Self = this.set("animationDuration", js.Array(value :_*))
    
    @scala.inline
    def setAnimationDuration(value: GlobalsString | js.Array[GlobalsString]): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationFillModeVarargs(value: AnimationFillModeProperty*): Self = this.set("animationFillMode", js.Array(value :_*))
    
    @scala.inline
    def setAnimationFillMode(value: AnimationFillModeProperty | js.Array[AnimationFillModeProperty]): Self = this.set("animationFillMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationFillMode: Self = this.set("animationFillMode", js.undefined)
    
    @scala.inline
    def setAnimationIterationCountVarargs(value: AnimationIterationCountProperty*): Self = this.set("animationIterationCount", js.Array(value :_*))
    
    @scala.inline
    def setAnimationIterationCount(value: AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]): Self = this.set("animationIterationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationIterationCount: Self = this.set("animationIterationCount", js.undefined)
    
    @scala.inline
    def setAnimationNameVarargs(value: AnimationNameProperty*): Self = this.set("animationName", js.Array(value :_*))
    
    @scala.inline
    def setAnimationName(value: AnimationNameProperty | js.Array[AnimationNameProperty]): Self = this.set("animationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationName: Self = this.set("animationName", js.undefined)
    
    @scala.inline
    def setAnimationPlayStateVarargs(value: AnimationPlayStateProperty*): Self = this.set("animationPlayState", js.Array(value :_*))
    
    @scala.inline
    def setAnimationPlayState(value: AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]): Self = this.set("animationPlayState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationPlayState: Self = this.set("animationPlayState", js.undefined)
    
    @scala.inline
    def setAnimationTimingFunctionVarargs(value: AnimationTimingFunctionProperty*): Self = this.set("animationTimingFunction", js.Array(value :_*))
    
    @scala.inline
    def setAnimationTimingFunction(value: AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]): Self = this.set("animationTimingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationTimingFunction: Self = this.set("animationTimingFunction", js.undefined)
    
    @scala.inline
    def setAppearanceVarargs(value: AppearanceProperty*): Self = this.set("appearance", js.Array(value :_*))
    
    @scala.inline
    def setAppearance(value: AppearanceProperty | js.Array[AppearanceProperty]): Self = this.set("appearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppearance: Self = this.set("appearance", js.undefined)
    
    @scala.inline
    def setAspectRatioVarargs(value: AspectRatioProperty*): Self = this.set("aspectRatio", js.Array(value :_*))
    
    @scala.inline
    def setAspectRatio(value: AspectRatioProperty | js.Array[AspectRatioProperty]): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    
    @scala.inline
    def setBackdropFilterVarargs(value: BackdropFilterProperty*): Self = this.set("backdropFilter", js.Array(value :_*))
    
    @scala.inline
    def setBackdropFilter(value: BackdropFilterProperty | js.Array[BackdropFilterProperty]): Self = this.set("backdropFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdropFilter: Self = this.set("backdropFilter", js.undefined)
    
    @scala.inline
    def setBackfaceVisibilityVarargs(value: BackfaceVisibilityProperty*): Self = this.set("backfaceVisibility", js.Array(value :_*))
    
    @scala.inline
    def setBackfaceVisibility(value: BackfaceVisibilityProperty | js.Array[BackfaceVisibilityProperty]): Self = this.set("backfaceVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackfaceVisibility: Self = this.set("backfaceVisibility", js.undefined)
    
    @scala.inline
    def setBackgroundAttachmentVarargs(value: BackgroundAttachmentProperty*): Self = this.set("backgroundAttachment", js.Array(value :_*))
    
    @scala.inline
    def setBackgroundAttachment(value: BackgroundAttachmentProperty | js.Array[BackgroundAttachmentProperty]): Self = this.set("backgroundAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundAttachment: Self = this.set("backgroundAttachment", js.undefined)
    
    @scala.inline
    def setBackgroundBlendModeVarargs(value: BackgroundBlendModeProperty*): Self = this.set("backgroundBlendMode", js.Array(value :_*))
    
    @scala.inline
    def setBackgroundBlendMode(value: BackgroundBlendModeProperty | js.Array[BackgroundBlendModeProperty]): Self = this.set("backgroundBlendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundBlendMode: Self = this.set("backgroundBlendMode", js.undefined)
    
    @scala.inline
    def setBackgroundClipVarargs(value: BackgroundClipProperty*): Self = this.set("backgroundClip", js.Array(value :_*))
    
    @scala.inline
    def setBackgroundClip(value: BackgroundClipProperty | js.Array[BackgroundClipProperty]): Self = this.set("backgroundClip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundClip: Self = this.set("backgroundClip", js.undefined)
    
    @scala.inline
    def setBackgroundColorVarargs(value: BackgroundColorProperty*): Self = this.set("backgroundColor", js.Array(value :_*))
    
    @scala.inline
    def setBackgroundColor(value: BackgroundColorProperty | js.Array[BackgroundColorProperty]): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundImageVarargs(value: BackgroundImageProperty*): Self = this.set("backgroundImage", js.Array(value :_*))
    
    @scala.inline
    def setBackgroundImage(value: BackgroundImageProperty | js.Array[BackgroundImageProperty]): Self = this.set("backgroundImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundImage: Self = this.set("backgroundImage", js.undefined)
    
    @scala.inline
    def setBackgroundOriginVarargs(value: BackgroundOriginProperty*): Self = this.set("backgroundOrigin", js.Array(value :_*))
    
    @scala.inline
    def setBackgroundOrigin(value: BackgroundOriginProperty | js.Array[BackgroundOriginProperty]): Self = this.set("backgroundOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundOrigin: Self = this.set("backgroundOrigin", js.undefined)
    
    @scala.inline
    def setBackgroundPositionVarargs(value: BackgroundPositionProperty[TLength]*): Self = this.set("backgroundPosition", js.Array(value :_*))
    
    @scala.inline
    def setBackgroundPosition(value: BackgroundPositionProperty[TLength] | js.Array[BackgroundPositionProperty[TLength]]): Self = this.set("backgroundPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundPosition: Self = this.set("backgroundPosition", js.undefined)
    
    @scala.inline
    def setBackgroundPositionXVarargs(value: BackgroundPositionXProperty[TLength]*): Self = this.set("backgroundPositionX", js.Array(value :_*))
    
    @scala.inline
    def setBackgroundPositionX(value: BackgroundPositionXProperty[TLength] | js.Array[BackgroundPositionXProperty[TLength]]): Self = this.set("backgroundPositionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundPositionX: Self = this.set("backgroundPositionX", js.undefined)
    
    @scala.inline
    def setBackgroundPositionYVarargs(value: BackgroundPositionYProperty[TLength]*): Self = this.set("backgroundPositionY", js.Array(value :_*))
    
    @scala.inline
    def setBackgroundPositionY(value: BackgroundPositionYProperty[TLength] | js.Array[BackgroundPositionYProperty[TLength]]): Self = this.set("backgroundPositionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundPositionY: Self = this.set("backgroundPositionY", js.undefined)
    
    @scala.inline
    def setBackgroundRepeatVarargs(value: BackgroundRepeatProperty*): Self = this.set("backgroundRepeat", js.Array(value :_*))
    
    @scala.inline
    def setBackgroundRepeat(value: BackgroundRepeatProperty | js.Array[BackgroundRepeatProperty]): Self = this.set("backgroundRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundRepeat: Self = this.set("backgroundRepeat", js.undefined)
    
    @scala.inline
    def setBackgroundSizeVarargs(value: BackgroundSizeProperty[TLength]*): Self = this.set("backgroundSize", js.Array(value :_*))
    
    @scala.inline
    def setBackgroundSize(value: BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]): Self = this.set("backgroundSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundSize: Self = this.set("backgroundSize", js.undefined)
    
    @scala.inline
    def setBlockOverflowVarargs(value: BlockOverflowProperty*): Self = this.set("blockOverflow", js.Array(value :_*))
    
    @scala.inline
    def setBlockOverflow(value: BlockOverflowProperty | js.Array[BlockOverflowProperty]): Self = this.set("blockOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockOverflow: Self = this.set("blockOverflow", js.undefined)
    
    @scala.inline
    def setBlockSizeVarargs(value: BlockSizeProperty[TLength]*): Self = this.set("blockSize", js.Array(value :_*))
    
    @scala.inline
    def setBlockSize(value: BlockSizeProperty[TLength] | js.Array[BlockSizeProperty[TLength]]): Self = this.set("blockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockSize: Self = this.set("blockSize", js.undefined)
    
    @scala.inline
    def setBorderBlockColorVarargs(value: BorderBlockColorProperty*): Self = this.set("borderBlockColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderBlockColor(value: BorderBlockColorProperty | js.Array[BorderBlockColorProperty]): Self = this.set("borderBlockColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBlockColor: Self = this.set("borderBlockColor", js.undefined)
    
    @scala.inline
    def setBorderBlockEndColorVarargs(value: BorderBlockEndColorProperty*): Self = this.set("borderBlockEndColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderBlockEndColor(value: BorderBlockEndColorProperty | js.Array[BorderBlockEndColorProperty]): Self = this.set("borderBlockEndColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBlockEndColor: Self = this.set("borderBlockEndColor", js.undefined)
    
    @scala.inline
    def setBorderBlockEndStyleVarargs(value: BorderBlockEndStyleProperty*): Self = this.set("borderBlockEndStyle", js.Array(value :_*))
    
    @scala.inline
    def setBorderBlockEndStyle(value: BorderBlockEndStyleProperty | js.Array[BorderBlockEndStyleProperty]): Self = this.set("borderBlockEndStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBlockEndStyle: Self = this.set("borderBlockEndStyle", js.undefined)
    
    @scala.inline
    def setBorderBlockEndWidthVarargs(value: BorderBlockEndWidthProperty[TLength]*): Self = this.set("borderBlockEndWidth", js.Array(value :_*))
    
    @scala.inline
    def setBorderBlockEndWidth(value: BorderBlockEndWidthProperty[TLength] | js.Array[BorderBlockEndWidthProperty[TLength]]): Self = this.set("borderBlockEndWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBlockEndWidth: Self = this.set("borderBlockEndWidth", js.undefined)
    
    @scala.inline
    def setBorderBlockStartColorVarargs(value: BorderBlockStartColorProperty*): Self = this.set("borderBlockStartColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderBlockStartColor(value: BorderBlockStartColorProperty | js.Array[BorderBlockStartColorProperty]): Self = this.set("borderBlockStartColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBlockStartColor: Self = this.set("borderBlockStartColor", js.undefined)
    
    @scala.inline
    def setBorderBlockStartStyleVarargs(value: BorderBlockStartStyleProperty*): Self = this.set("borderBlockStartStyle", js.Array(value :_*))
    
    @scala.inline
    def setBorderBlockStartStyle(value: BorderBlockStartStyleProperty | js.Array[BorderBlockStartStyleProperty]): Self = this.set("borderBlockStartStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBlockStartStyle: Self = this.set("borderBlockStartStyle", js.undefined)
    
    @scala.inline
    def setBorderBlockStartWidthVarargs(value: BorderBlockStartWidthProperty[TLength]*): Self = this.set("borderBlockStartWidth", js.Array(value :_*))
    
    @scala.inline
    def setBorderBlockStartWidth(value: BorderBlockStartWidthProperty[TLength] | js.Array[BorderBlockStartWidthProperty[TLength]]): Self = this.set("borderBlockStartWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBlockStartWidth: Self = this.set("borderBlockStartWidth", js.undefined)
    
    @scala.inline
    def setBorderBlockStyleVarargs(value: BorderBlockStyleProperty*): Self = this.set("borderBlockStyle", js.Array(value :_*))
    
    @scala.inline
    def setBorderBlockStyle(value: BorderBlockStyleProperty | js.Array[BorderBlockStyleProperty]): Self = this.set("borderBlockStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBlockStyle: Self = this.set("borderBlockStyle", js.undefined)
    
    @scala.inline
    def setBorderBlockWidthVarargs(value: BorderBlockWidthProperty[TLength]*): Self = this.set("borderBlockWidth", js.Array(value :_*))
    
    @scala.inline
    def setBorderBlockWidth(value: BorderBlockWidthProperty[TLength] | js.Array[BorderBlockWidthProperty[TLength]]): Self = this.set("borderBlockWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBlockWidth: Self = this.set("borderBlockWidth", js.undefined)
    
    @scala.inline
    def setBorderBottomColorVarargs(value: BorderBottomColorProperty*): Self = this.set("borderBottomColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderBottomColor(value: BorderBottomColorProperty | js.Array[BorderBottomColorProperty]): Self = this.set("borderBottomColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBottomColor: Self = this.set("borderBottomColor", js.undefined)
    
    @scala.inline
    def setBorderBottomLeftRadiusVarargs(value: BorderBottomLeftRadiusProperty[TLength]*): Self = this.set("borderBottomLeftRadius", js.Array(value :_*))
    
    @scala.inline
    def setBorderBottomLeftRadius(value: BorderBottomLeftRadiusProperty[TLength] | js.Array[BorderBottomLeftRadiusProperty[TLength]]): Self = this.set("borderBottomLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBottomLeftRadius: Self = this.set("borderBottomLeftRadius", js.undefined)
    
    @scala.inline
    def setBorderBottomRightRadiusVarargs(value: BorderBottomRightRadiusProperty[TLength]*): Self = this.set("borderBottomRightRadius", js.Array(value :_*))
    
    @scala.inline
    def setBorderBottomRightRadius(
      value: BorderBottomRightRadiusProperty[TLength] | js.Array[BorderBottomRightRadiusProperty[TLength]]
    ): Self = this.set("borderBottomRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBottomRightRadius: Self = this.set("borderBottomRightRadius", js.undefined)
    
    @scala.inline
    def setBorderBottomStyleVarargs(value: BorderBottomStyleProperty*): Self = this.set("borderBottomStyle", js.Array(value :_*))
    
    @scala.inline
    def setBorderBottomStyle(value: BorderBottomStyleProperty | js.Array[BorderBottomStyleProperty]): Self = this.set("borderBottomStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBottomStyle: Self = this.set("borderBottomStyle", js.undefined)
    
    @scala.inline
    def setBorderBottomWidthVarargs(value: BorderBottomWidthProperty[TLength]*): Self = this.set("borderBottomWidth", js.Array(value :_*))
    
    @scala.inline
    def setBorderBottomWidth(value: BorderBottomWidthProperty[TLength] | js.Array[BorderBottomWidthProperty[TLength]]): Self = this.set("borderBottomWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBottomWidth: Self = this.set("borderBottomWidth", js.undefined)
    
    @scala.inline
    def setBorderCollapseVarargs(value: BorderCollapseProperty*): Self = this.set("borderCollapse", js.Array(value :_*))
    
    @scala.inline
    def setBorderCollapse(value: BorderCollapseProperty | js.Array[BorderCollapseProperty]): Self = this.set("borderCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderCollapse: Self = this.set("borderCollapse", js.undefined)
    
    @scala.inline
    def setBorderEndEndRadiusVarargs(value: BorderEndEndRadiusProperty[TLength]*): Self = this.set("borderEndEndRadius", js.Array(value :_*))
    
    @scala.inline
    def setBorderEndEndRadius(value: BorderEndEndRadiusProperty[TLength] | js.Array[BorderEndEndRadiusProperty[TLength]]): Self = this.set("borderEndEndRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderEndEndRadius: Self = this.set("borderEndEndRadius", js.undefined)
    
    @scala.inline
    def setBorderEndStartRadiusVarargs(value: BorderEndStartRadiusProperty[TLength]*): Self = this.set("borderEndStartRadius", js.Array(value :_*))
    
    @scala.inline
    def setBorderEndStartRadius(value: BorderEndStartRadiusProperty[TLength] | js.Array[BorderEndStartRadiusProperty[TLength]]): Self = this.set("borderEndStartRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderEndStartRadius: Self = this.set("borderEndStartRadius", js.undefined)
    
    @scala.inline
    def setBorderImageOutsetVarargs(value: BorderImageOutsetProperty[TLength]*): Self = this.set("borderImageOutset", js.Array(value :_*))
    
    @scala.inline
    def setBorderImageOutset(value: BorderImageOutsetProperty[TLength] | js.Array[BorderImageOutsetProperty[TLength]]): Self = this.set("borderImageOutset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderImageOutset: Self = this.set("borderImageOutset", js.undefined)
    
    @scala.inline
    def setBorderImageRepeatVarargs(value: BorderImageRepeatProperty*): Self = this.set("borderImageRepeat", js.Array(value :_*))
    
    @scala.inline
    def setBorderImageRepeat(value: BorderImageRepeatProperty | js.Array[BorderImageRepeatProperty]): Self = this.set("borderImageRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderImageRepeat: Self = this.set("borderImageRepeat", js.undefined)
    
    @scala.inline
    def setBorderImageSliceVarargs(value: BorderImageSliceProperty*): Self = this.set("borderImageSlice", js.Array(value :_*))
    
    @scala.inline
    def setBorderImageSlice(value: BorderImageSliceProperty | js.Array[BorderImageSliceProperty]): Self = this.set("borderImageSlice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderImageSlice: Self = this.set("borderImageSlice", js.undefined)
    
    @scala.inline
    def setBorderImageSourceVarargs(value: BorderImageSourceProperty*): Self = this.set("borderImageSource", js.Array(value :_*))
    
    @scala.inline
    def setBorderImageSource(value: BorderImageSourceProperty | js.Array[BorderImageSourceProperty]): Self = this.set("borderImageSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderImageSource: Self = this.set("borderImageSource", js.undefined)
    
    @scala.inline
    def setBorderImageWidthVarargs(value: BorderImageWidthProperty[TLength]*): Self = this.set("borderImageWidth", js.Array(value :_*))
    
    @scala.inline
    def setBorderImageWidth(value: BorderImageWidthProperty[TLength] | js.Array[BorderImageWidthProperty[TLength]]): Self = this.set("borderImageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderImageWidth: Self = this.set("borderImageWidth", js.undefined)
    
    @scala.inline
    def setBorderInlineColorVarargs(value: BorderInlineColorProperty*): Self = this.set("borderInlineColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderInlineColor(value: BorderInlineColorProperty | js.Array[BorderInlineColorProperty]): Self = this.set("borderInlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderInlineColor: Self = this.set("borderInlineColor", js.undefined)
    
    @scala.inline
    def setBorderInlineEndColorVarargs(value: BorderInlineEndColorProperty*): Self = this.set("borderInlineEndColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderInlineEndColor(value: BorderInlineEndColorProperty | js.Array[BorderInlineEndColorProperty]): Self = this.set("borderInlineEndColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderInlineEndColor: Self = this.set("borderInlineEndColor", js.undefined)
    
    @scala.inline
    def setBorderInlineEndStyleVarargs(value: BorderInlineEndStyleProperty*): Self = this.set("borderInlineEndStyle", js.Array(value :_*))
    
    @scala.inline
    def setBorderInlineEndStyle(value: BorderInlineEndStyleProperty | js.Array[BorderInlineEndStyleProperty]): Self = this.set("borderInlineEndStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderInlineEndStyle: Self = this.set("borderInlineEndStyle", js.undefined)
    
    @scala.inline
    def setBorderInlineEndWidthVarargs(value: BorderInlineEndWidthProperty[TLength]*): Self = this.set("borderInlineEndWidth", js.Array(value :_*))
    
    @scala.inline
    def setBorderInlineEndWidth(value: BorderInlineEndWidthProperty[TLength] | js.Array[BorderInlineEndWidthProperty[TLength]]): Self = this.set("borderInlineEndWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderInlineEndWidth: Self = this.set("borderInlineEndWidth", js.undefined)
    
    @scala.inline
    def setBorderInlineStartColorVarargs(value: BorderInlineStartColorProperty*): Self = this.set("borderInlineStartColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderInlineStartColor(value: BorderInlineStartColorProperty | js.Array[BorderInlineStartColorProperty]): Self = this.set("borderInlineStartColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderInlineStartColor: Self = this.set("borderInlineStartColor", js.undefined)
    
    @scala.inline
    def setBorderInlineStartStyleVarargs(value: BorderInlineStartStyleProperty*): Self = this.set("borderInlineStartStyle", js.Array(value :_*))
    
    @scala.inline
    def setBorderInlineStartStyle(value: BorderInlineStartStyleProperty | js.Array[BorderInlineStartStyleProperty]): Self = this.set("borderInlineStartStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderInlineStartStyle: Self = this.set("borderInlineStartStyle", js.undefined)
    
    @scala.inline
    def setBorderInlineStartWidthVarargs(value: BorderInlineStartWidthProperty[TLength]*): Self = this.set("borderInlineStartWidth", js.Array(value :_*))
    
    @scala.inline
    def setBorderInlineStartWidth(value: BorderInlineStartWidthProperty[TLength] | js.Array[BorderInlineStartWidthProperty[TLength]]): Self = this.set("borderInlineStartWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderInlineStartWidth: Self = this.set("borderInlineStartWidth", js.undefined)
    
    @scala.inline
    def setBorderInlineStyleVarargs(value: BorderInlineStyleProperty*): Self = this.set("borderInlineStyle", js.Array(value :_*))
    
    @scala.inline
    def setBorderInlineStyle(value: BorderInlineStyleProperty | js.Array[BorderInlineStyleProperty]): Self = this.set("borderInlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderInlineStyle: Self = this.set("borderInlineStyle", js.undefined)
    
    @scala.inline
    def setBorderInlineWidthVarargs(value: BorderInlineWidthProperty[TLength]*): Self = this.set("borderInlineWidth", js.Array(value :_*))
    
    @scala.inline
    def setBorderInlineWidth(value: BorderInlineWidthProperty[TLength] | js.Array[BorderInlineWidthProperty[TLength]]): Self = this.set("borderInlineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderInlineWidth: Self = this.set("borderInlineWidth", js.undefined)
    
    @scala.inline
    def setBorderLeftColorVarargs(value: BorderLeftColorProperty*): Self = this.set("borderLeftColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderLeftColor(value: BorderLeftColorProperty | js.Array[BorderLeftColorProperty]): Self = this.set("borderLeftColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderLeftColor: Self = this.set("borderLeftColor", js.undefined)
    
    @scala.inline
    def setBorderLeftStyleVarargs(value: BorderLeftStyleProperty*): Self = this.set("borderLeftStyle", js.Array(value :_*))
    
    @scala.inline
    def setBorderLeftStyle(value: BorderLeftStyleProperty | js.Array[BorderLeftStyleProperty]): Self = this.set("borderLeftStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderLeftStyle: Self = this.set("borderLeftStyle", js.undefined)
    
    @scala.inline
    def setBorderLeftWidthVarargs(value: BorderLeftWidthProperty[TLength]*): Self = this.set("borderLeftWidth", js.Array(value :_*))
    
    @scala.inline
    def setBorderLeftWidth(value: BorderLeftWidthProperty[TLength] | js.Array[BorderLeftWidthProperty[TLength]]): Self = this.set("borderLeftWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderLeftWidth: Self = this.set("borderLeftWidth", js.undefined)
    
    @scala.inline
    def setBorderRightColorVarargs(value: BorderRightColorProperty*): Self = this.set("borderRightColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderRightColor(value: BorderRightColorProperty | js.Array[BorderRightColorProperty]): Self = this.set("borderRightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRightColor: Self = this.set("borderRightColor", js.undefined)
    
    @scala.inline
    def setBorderRightStyleVarargs(value: BorderRightStyleProperty*): Self = this.set("borderRightStyle", js.Array(value :_*))
    
    @scala.inline
    def setBorderRightStyle(value: BorderRightStyleProperty | js.Array[BorderRightStyleProperty]): Self = this.set("borderRightStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRightStyle: Self = this.set("borderRightStyle", js.undefined)
    
    @scala.inline
    def setBorderRightWidthVarargs(value: BorderRightWidthProperty[TLength]*): Self = this.set("borderRightWidth", js.Array(value :_*))
    
    @scala.inline
    def setBorderRightWidth(value: BorderRightWidthProperty[TLength] | js.Array[BorderRightWidthProperty[TLength]]): Self = this.set("borderRightWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRightWidth: Self = this.set("borderRightWidth", js.undefined)
    
    @scala.inline
    def setBorderSpacingVarargs(value: BorderSpacingProperty[TLength]*): Self = this.set("borderSpacing", js.Array(value :_*))
    
    @scala.inline
    def setBorderSpacing(value: BorderSpacingProperty[TLength] | js.Array[BorderSpacingProperty[TLength]]): Self = this.set("borderSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderSpacing: Self = this.set("borderSpacing", js.undefined)
    
    @scala.inline
    def setBorderStartEndRadiusVarargs(value: BorderStartEndRadiusProperty[TLength]*): Self = this.set("borderStartEndRadius", js.Array(value :_*))
    
    @scala.inline
    def setBorderStartEndRadius(value: BorderStartEndRadiusProperty[TLength] | js.Array[BorderStartEndRadiusProperty[TLength]]): Self = this.set("borderStartEndRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderStartEndRadius: Self = this.set("borderStartEndRadius", js.undefined)
    
    @scala.inline
    def setBorderStartStartRadiusVarargs(value: BorderStartStartRadiusProperty[TLength]*): Self = this.set("borderStartStartRadius", js.Array(value :_*))
    
    @scala.inline
    def setBorderStartStartRadius(value: BorderStartStartRadiusProperty[TLength] | js.Array[BorderStartStartRadiusProperty[TLength]]): Self = this.set("borderStartStartRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderStartStartRadius: Self = this.set("borderStartStartRadius", js.undefined)
    
    @scala.inline
    def setBorderTopColorVarargs(value: BorderTopColorProperty*): Self = this.set("borderTopColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderTopColor(value: BorderTopColorProperty | js.Array[BorderTopColorProperty]): Self = this.set("borderTopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderTopColor: Self = this.set("borderTopColor", js.undefined)
    
    @scala.inline
    def setBorderTopLeftRadiusVarargs(value: BorderTopLeftRadiusProperty[TLength]*): Self = this.set("borderTopLeftRadius", js.Array(value :_*))
    
    @scala.inline
    def setBorderTopLeftRadius(value: BorderTopLeftRadiusProperty[TLength] | js.Array[BorderTopLeftRadiusProperty[TLength]]): Self = this.set("borderTopLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderTopLeftRadius: Self = this.set("borderTopLeftRadius", js.undefined)
    
    @scala.inline
    def setBorderTopRightRadiusVarargs(value: BorderTopRightRadiusProperty[TLength]*): Self = this.set("borderTopRightRadius", js.Array(value :_*))
    
    @scala.inline
    def setBorderTopRightRadius(value: BorderTopRightRadiusProperty[TLength] | js.Array[BorderTopRightRadiusProperty[TLength]]): Self = this.set("borderTopRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderTopRightRadius: Self = this.set("borderTopRightRadius", js.undefined)
    
    @scala.inline
    def setBorderTopStyleVarargs(value: BorderTopStyleProperty*): Self = this.set("borderTopStyle", js.Array(value :_*))
    
    @scala.inline
    def setBorderTopStyle(value: BorderTopStyleProperty | js.Array[BorderTopStyleProperty]): Self = this.set("borderTopStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderTopStyle: Self = this.set("borderTopStyle", js.undefined)
    
    @scala.inline
    def setBorderTopWidthVarargs(value: BorderTopWidthProperty[TLength]*): Self = this.set("borderTopWidth", js.Array(value :_*))
    
    @scala.inline
    def setBorderTopWidth(value: BorderTopWidthProperty[TLength] | js.Array[BorderTopWidthProperty[TLength]]): Self = this.set("borderTopWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderTopWidth: Self = this.set("borderTopWidth", js.undefined)
    
    @scala.inline
    def setBottomVarargs(value: BottomProperty[TLength]*): Self = this.set("bottom", js.Array(value :_*))
    
    @scala.inline
    def setBottom(value: BottomProperty[TLength] | js.Array[BottomProperty[TLength]]): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setBoxDecorationBreakVarargs(value: BoxDecorationBreakProperty*): Self = this.set("boxDecorationBreak", js.Array(value :_*))
    
    @scala.inline
    def setBoxDecorationBreak(value: BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty]): Self = this.set("boxDecorationBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxDecorationBreak: Self = this.set("boxDecorationBreak", js.undefined)
    
    @scala.inline
    def setBoxShadowVarargs(value: BoxShadowProperty*): Self = this.set("boxShadow", js.Array(value :_*))
    
    @scala.inline
    def setBoxShadow(value: BoxShadowProperty | js.Array[BoxShadowProperty]): Self = this.set("boxShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxShadow: Self = this.set("boxShadow", js.undefined)
    
    @scala.inline
    def setBoxSizingVarargs(value: BoxSizingProperty*): Self = this.set("boxSizing", js.Array(value :_*))
    
    @scala.inline
    def setBoxSizing(value: BoxSizingProperty | js.Array[BoxSizingProperty]): Self = this.set("boxSizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxSizing: Self = this.set("boxSizing", js.undefined)
    
    @scala.inline
    def setBreakAfterVarargs(value: BreakAfterProperty*): Self = this.set("breakAfter", js.Array(value :_*))
    
    @scala.inline
    def setBreakAfter(value: BreakAfterProperty | js.Array[BreakAfterProperty]): Self = this.set("breakAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakAfter: Self = this.set("breakAfter", js.undefined)
    
    @scala.inline
    def setBreakBeforeVarargs(value: BreakBeforeProperty*): Self = this.set("breakBefore", js.Array(value :_*))
    
    @scala.inline
    def setBreakBefore(value: BreakBeforeProperty | js.Array[BreakBeforeProperty]): Self = this.set("breakBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakBefore: Self = this.set("breakBefore", js.undefined)
    
    @scala.inline
    def setBreakInsideVarargs(value: BreakInsideProperty*): Self = this.set("breakInside", js.Array(value :_*))
    
    @scala.inline
    def setBreakInside(value: BreakInsideProperty | js.Array[BreakInsideProperty]): Self = this.set("breakInside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakInside: Self = this.set("breakInside", js.undefined)
    
    @scala.inline
    def setCaptionSideVarargs(value: CaptionSideProperty*): Self = this.set("captionSide", js.Array(value :_*))
    
    @scala.inline
    def setCaptionSide(value: CaptionSideProperty | js.Array[CaptionSideProperty]): Self = this.set("captionSide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptionSide: Self = this.set("captionSide", js.undefined)
    
    @scala.inline
    def setCaretColorVarargs(value: CaretColorProperty*): Self = this.set("caretColor", js.Array(value :_*))
    
    @scala.inline
    def setCaretColor(value: CaretColorProperty | js.Array[CaretColorProperty]): Self = this.set("caretColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaretColor: Self = this.set("caretColor", js.undefined)
    
    @scala.inline
    def setClearVarargs(value: ClearProperty*): Self = this.set("clear", js.Array(value :_*))
    
    @scala.inline
    def setClear(value: ClearProperty | js.Array[ClearProperty]): Self = this.set("clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    
    @scala.inline
    def setClipPathVarargs(value: ClipPathProperty*): Self = this.set("clipPath", js.Array(value :_*))
    
    @scala.inline
    def setClipPath(value: ClipPathProperty | js.Array[ClipPathProperty]): Self = this.set("clipPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipPath: Self = this.set("clipPath", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: ColorProperty*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: ColorProperty | js.Array[ColorProperty]): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorAdjustVarargs(value: ColorAdjustProperty*): Self = this.set("colorAdjust", js.Array(value :_*))
    
    @scala.inline
    def setColorAdjust(value: ColorAdjustProperty | js.Array[ColorAdjustProperty]): Self = this.set("colorAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorAdjust: Self = this.set("colorAdjust", js.undefined)
    
    @scala.inline
    def setColumnCountVarargs(value: ColumnCountProperty*): Self = this.set("columnCount", js.Array(value :_*))
    
    @scala.inline
    def setColumnCount(value: ColumnCountProperty | js.Array[ColumnCountProperty]): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnCount: Self = this.set("columnCount", js.undefined)
    
    @scala.inline
    def setColumnFillVarargs(value: ColumnFillProperty*): Self = this.set("columnFill", js.Array(value :_*))
    
    @scala.inline
    def setColumnFill(value: ColumnFillProperty | js.Array[ColumnFillProperty]): Self = this.set("columnFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnFill: Self = this.set("columnFill", js.undefined)
    
    @scala.inline
    def setColumnGapVarargs(value: ColumnGapProperty[TLength]*): Self = this.set("columnGap", js.Array(value :_*))
    
    @scala.inline
    def setColumnGap(value: ColumnGapProperty[TLength] | js.Array[ColumnGapProperty[TLength]]): Self = this.set("columnGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnGap: Self = this.set("columnGap", js.undefined)
    
    @scala.inline
    def setColumnRuleColorVarargs(value: ColumnRuleColorProperty*): Self = this.set("columnRuleColor", js.Array(value :_*))
    
    @scala.inline
    def setColumnRuleColor(value: ColumnRuleColorProperty | js.Array[ColumnRuleColorProperty]): Self = this.set("columnRuleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnRuleColor: Self = this.set("columnRuleColor", js.undefined)
    
    @scala.inline
    def setColumnRuleStyleVarargs(value: ColumnRuleStyleProperty*): Self = this.set("columnRuleStyle", js.Array(value :_*))
    
    @scala.inline
    def setColumnRuleStyle(value: ColumnRuleStyleProperty | js.Array[ColumnRuleStyleProperty]): Self = this.set("columnRuleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnRuleStyle: Self = this.set("columnRuleStyle", js.undefined)
    
    @scala.inline
    def setColumnRuleWidthVarargs(value: ColumnRuleWidthProperty[TLength]*): Self = this.set("columnRuleWidth", js.Array(value :_*))
    
    @scala.inline
    def setColumnRuleWidth(value: ColumnRuleWidthProperty[TLength] | js.Array[ColumnRuleWidthProperty[TLength]]): Self = this.set("columnRuleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnRuleWidth: Self = this.set("columnRuleWidth", js.undefined)
    
    @scala.inline
    def setColumnSpanVarargs(value: ColumnSpanProperty*): Self = this.set("columnSpan", js.Array(value :_*))
    
    @scala.inline
    def setColumnSpan(value: ColumnSpanProperty | js.Array[ColumnSpanProperty]): Self = this.set("columnSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnSpan: Self = this.set("columnSpan", js.undefined)
    
    @scala.inline
    def setColumnWidthVarargs(value: ColumnWidthProperty[TLength]*): Self = this.set("columnWidth", js.Array(value :_*))
    
    @scala.inline
    def setColumnWidth(value: ColumnWidthProperty[TLength] | js.Array[ColumnWidthProperty[TLength]]): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    
    @scala.inline
    def setContainVarargs(value: ContainProperty*): Self = this.set("contain", js.Array(value :_*))
    
    @scala.inline
    def setContain(value: ContainProperty | js.Array[ContainProperty]): Self = this.set("contain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContain: Self = this.set("contain", js.undefined)
    
    @scala.inline
    def setContentVarargs(value: ContentProperty*): Self = this.set("content", js.Array(value :_*))
    
    @scala.inline
    def setContent(value: ContentProperty | js.Array[ContentProperty]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setCounterIncrementVarargs(value: CounterIncrementProperty*): Self = this.set("counterIncrement", js.Array(value :_*))
    
    @scala.inline
    def setCounterIncrement(value: CounterIncrementProperty | js.Array[CounterIncrementProperty]): Self = this.set("counterIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounterIncrement: Self = this.set("counterIncrement", js.undefined)
    
    @scala.inline
    def setCounterResetVarargs(value: CounterResetProperty*): Self = this.set("counterReset", js.Array(value :_*))
    
    @scala.inline
    def setCounterReset(value: CounterResetProperty | js.Array[CounterResetProperty]): Self = this.set("counterReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounterReset: Self = this.set("counterReset", js.undefined)
    
    @scala.inline
    def setCounterSetVarargs(value: CounterSetProperty*): Self = this.set("counterSet", js.Array(value :_*))
    
    @scala.inline
    def setCounterSet(value: CounterSetProperty | js.Array[CounterSetProperty]): Self = this.set("counterSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounterSet: Self = this.set("counterSet", js.undefined)
    
    @scala.inline
    def setCursorVarargs(value: CursorProperty*): Self = this.set("cursor", js.Array(value :_*))
    
    @scala.inline
    def setCursor(value: CursorProperty | js.Array[CursorProperty]): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setDirectionVarargs(value: DirectionProperty*): Self = this.set("direction", js.Array(value :_*))
    
    @scala.inline
    def setDirection(value: DirectionProperty | js.Array[DirectionProperty]): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisplayVarargs(value: DisplayProperty*): Self = this.set("display", js.Array(value :_*))
    
    @scala.inline
    def setDisplay(value: DisplayProperty | js.Array[DisplayProperty]): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setEmptyCellsVarargs(value: EmptyCellsProperty*): Self = this.set("emptyCells", js.Array(value :_*))
    
    @scala.inline
    def setEmptyCells(value: EmptyCellsProperty | js.Array[EmptyCellsProperty]): Self = this.set("emptyCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyCells: Self = this.set("emptyCells", js.undefined)
    
    @scala.inline
    def setFilterVarargs(value: FilterProperty*): Self = this.set("filter", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: FilterProperty | js.Array[FilterProperty]): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFlexBasisVarargs(value: FlexBasisProperty[TLength]*): Self = this.set("flexBasis", js.Array(value :_*))
    
    @scala.inline
    def setFlexBasis(value: FlexBasisProperty[TLength] | js.Array[FlexBasisProperty[TLength]]): Self = this.set("flexBasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexBasis: Self = this.set("flexBasis", js.undefined)
    
    @scala.inline
    def setFlexDirectionVarargs(value: FlexDirectionProperty*): Self = this.set("flexDirection", js.Array(value :_*))
    
    @scala.inline
    def setFlexDirection(value: FlexDirectionProperty | js.Array[FlexDirectionProperty]): Self = this.set("flexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexDirection: Self = this.set("flexDirection", js.undefined)
    
    @scala.inline
    def setFlexGrowVarargs(value: GlobalsNumber*): Self = this.set("flexGrow", js.Array(value :_*))
    
    @scala.inline
    def setFlexGrow(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("flexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexGrow: Self = this.set("flexGrow", js.undefined)
    
    @scala.inline
    def setFlexShrinkVarargs(value: GlobalsNumber*): Self = this.set("flexShrink", js.Array(value :_*))
    
    @scala.inline
    def setFlexShrink(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("flexShrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexShrink: Self = this.set("flexShrink", js.undefined)
    
    @scala.inline
    def setFlexWrapVarargs(value: FlexWrapProperty*): Self = this.set("flexWrap", js.Array(value :_*))
    
    @scala.inline
    def setFlexWrap(value: FlexWrapProperty | js.Array[FlexWrapProperty]): Self = this.set("flexWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexWrap: Self = this.set("flexWrap", js.undefined)
    
    @scala.inline
    def setFloatVarargs(value: FloatProperty*): Self = this.set("float", js.Array(value :_*))
    
    @scala.inline
    def setFloat(value: FloatProperty | js.Array[FloatProperty]): Self = this.set("float", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloat: Self = this.set("float", js.undefined)
    
    @scala.inline
    def setFontFamilyVarargs(value: FontFamilyProperty*): Self = this.set("fontFamily", js.Array(value :_*))
    
    @scala.inline
    def setFontFamily(value: FontFamilyProperty | js.Array[FontFamilyProperty]): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontFeatureSettingsVarargs(value: FontFeatureSettingsProperty*): Self = this.set("fontFeatureSettings", js.Array(value :_*))
    
    @scala.inline
    def setFontFeatureSettings(value: FontFeatureSettingsProperty | js.Array[FontFeatureSettingsProperty]): Self = this.set("fontFeatureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFeatureSettings: Self = this.set("fontFeatureSettings", js.undefined)
    
    @scala.inline
    def setFontKerningVarargs(value: FontKerningProperty*): Self = this.set("fontKerning", js.Array(value :_*))
    
    @scala.inline
    def setFontKerning(value: FontKerningProperty | js.Array[FontKerningProperty]): Self = this.set("fontKerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontKerning: Self = this.set("fontKerning", js.undefined)
    
    @scala.inline
    def setFontLanguageOverrideVarargs(value: FontLanguageOverrideProperty*): Self = this.set("fontLanguageOverride", js.Array(value :_*))
    
    @scala.inline
    def setFontLanguageOverride(value: FontLanguageOverrideProperty | js.Array[FontLanguageOverrideProperty]): Self = this.set("fontLanguageOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontLanguageOverride: Self = this.set("fontLanguageOverride", js.undefined)
    
    @scala.inline
    def setFontOpticalSizingVarargs(value: FontOpticalSizingProperty*): Self = this.set("fontOpticalSizing", js.Array(value :_*))
    
    @scala.inline
    def setFontOpticalSizing(value: FontOpticalSizingProperty | js.Array[FontOpticalSizingProperty]): Self = this.set("fontOpticalSizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontOpticalSizing: Self = this.set("fontOpticalSizing", js.undefined)
    
    @scala.inline
    def setFontSizeVarargs(value: FontSizeProperty[TLength]*): Self = this.set("fontSize", js.Array(value :_*))
    
    @scala.inline
    def setFontSize(value: FontSizeProperty[TLength] | js.Array[FontSizeProperty[TLength]]): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontSizeAdjustVarargs(value: FontSizeAdjustProperty*): Self = this.set("fontSizeAdjust", js.Array(value :_*))
    
    @scala.inline
    def setFontSizeAdjust(value: FontSizeAdjustProperty | js.Array[FontSizeAdjustProperty]): Self = this.set("fontSizeAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSizeAdjust: Self = this.set("fontSizeAdjust", js.undefined)
    
    @scala.inline
    def setFontStretchVarargs(value: FontStretchProperty*): Self = this.set("fontStretch", js.Array(value :_*))
    
    @scala.inline
    def setFontStretch(value: FontStretchProperty | js.Array[FontStretchProperty]): Self = this.set("fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStretch: Self = this.set("fontStretch", js.undefined)
    
    @scala.inline
    def setFontStyleVarargs(value: FontStyleProperty*): Self = this.set("fontStyle", js.Array(value :_*))
    
    @scala.inline
    def setFontStyle(value: FontStyleProperty | js.Array[FontStyleProperty]): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontSynthesisVarargs(value: FontSynthesisProperty*): Self = this.set("fontSynthesis", js.Array(value :_*))
    
    @scala.inline
    def setFontSynthesis(value: FontSynthesisProperty | js.Array[FontSynthesisProperty]): Self = this.set("fontSynthesis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSynthesis: Self = this.set("fontSynthesis", js.undefined)
    
    @scala.inline
    def setFontVariantVarargs(value: FontVariantProperty*): Self = this.set("fontVariant", js.Array(value :_*))
    
    @scala.inline
    def setFontVariant(value: FontVariantProperty | js.Array[FontVariantProperty]): Self = this.set("fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariant: Self = this.set("fontVariant", js.undefined)
    
    @scala.inline
    def setFontVariantCapsVarargs(value: FontVariantCapsProperty*): Self = this.set("fontVariantCaps", js.Array(value :_*))
    
    @scala.inline
    def setFontVariantCaps(value: FontVariantCapsProperty | js.Array[FontVariantCapsProperty]): Self = this.set("fontVariantCaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariantCaps: Self = this.set("fontVariantCaps", js.undefined)
    
    @scala.inline
    def setFontVariantEastAsianVarargs(value: FontVariantEastAsianProperty*): Self = this.set("fontVariantEastAsian", js.Array(value :_*))
    
    @scala.inline
    def setFontVariantEastAsian(value: FontVariantEastAsianProperty | js.Array[FontVariantEastAsianProperty]): Self = this.set("fontVariantEastAsian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariantEastAsian: Self = this.set("fontVariantEastAsian", js.undefined)
    
    @scala.inline
    def setFontVariantLigaturesVarargs(value: FontVariantLigaturesProperty*): Self = this.set("fontVariantLigatures", js.Array(value :_*))
    
    @scala.inline
    def setFontVariantLigatures(value: FontVariantLigaturesProperty | js.Array[FontVariantLigaturesProperty]): Self = this.set("fontVariantLigatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariantLigatures: Self = this.set("fontVariantLigatures", js.undefined)
    
    @scala.inline
    def setFontVariantNumericVarargs(value: FontVariantNumericProperty*): Self = this.set("fontVariantNumeric", js.Array(value :_*))
    
    @scala.inline
    def setFontVariantNumeric(value: FontVariantNumericProperty | js.Array[FontVariantNumericProperty]): Self = this.set("fontVariantNumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariantNumeric: Self = this.set("fontVariantNumeric", js.undefined)
    
    @scala.inline
    def setFontVariantPositionVarargs(value: FontVariantPositionProperty*): Self = this.set("fontVariantPosition", js.Array(value :_*))
    
    @scala.inline
    def setFontVariantPosition(value: FontVariantPositionProperty | js.Array[FontVariantPositionProperty]): Self = this.set("fontVariantPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariantPosition: Self = this.set("fontVariantPosition", js.undefined)
    
    @scala.inline
    def setFontVariationSettingsVarargs(value: FontVariationSettingsProperty*): Self = this.set("fontVariationSettings", js.Array(value :_*))
    
    @scala.inline
    def setFontVariationSettings(value: FontVariationSettingsProperty | js.Array[FontVariationSettingsProperty]): Self = this.set("fontVariationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariationSettings: Self = this.set("fontVariationSettings", js.undefined)
    
    @scala.inline
    def setFontWeightVarargs(value: FontWeightProperty*): Self = this.set("fontWeight", js.Array(value :_*))
    
    @scala.inline
    def setFontWeight(value: FontWeightProperty | js.Array[FontWeightProperty]): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setGridAutoColumnsVarargs(value: GridAutoColumnsProperty[TLength]*): Self = this.set("gridAutoColumns", js.Array(value :_*))
    
    @scala.inline
    def setGridAutoColumns(value: GridAutoColumnsProperty[TLength] | js.Array[GridAutoColumnsProperty[TLength]]): Self = this.set("gridAutoColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridAutoColumns: Self = this.set("gridAutoColumns", js.undefined)
    
    @scala.inline
    def setGridAutoFlowVarargs(value: GridAutoFlowProperty*): Self = this.set("gridAutoFlow", js.Array(value :_*))
    
    @scala.inline
    def setGridAutoFlow(value: GridAutoFlowProperty | js.Array[GridAutoFlowProperty]): Self = this.set("gridAutoFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridAutoFlow: Self = this.set("gridAutoFlow", js.undefined)
    
    @scala.inline
    def setGridAutoRowsVarargs(value: GridAutoRowsProperty[TLength]*): Self = this.set("gridAutoRows", js.Array(value :_*))
    
    @scala.inline
    def setGridAutoRows(value: GridAutoRowsProperty[TLength] | js.Array[GridAutoRowsProperty[TLength]]): Self = this.set("gridAutoRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridAutoRows: Self = this.set("gridAutoRows", js.undefined)
    
    @scala.inline
    def setGridColumnEndVarargs(value: GridColumnEndProperty*): Self = this.set("gridColumnEnd", js.Array(value :_*))
    
    @scala.inline
    def setGridColumnEnd(value: GridColumnEndProperty | js.Array[GridColumnEndProperty]): Self = this.set("gridColumnEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridColumnEnd: Self = this.set("gridColumnEnd", js.undefined)
    
    @scala.inline
    def setGridColumnStartVarargs(value: GridColumnStartProperty*): Self = this.set("gridColumnStart", js.Array(value :_*))
    
    @scala.inline
    def setGridColumnStart(value: GridColumnStartProperty | js.Array[GridColumnStartProperty]): Self = this.set("gridColumnStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridColumnStart: Self = this.set("gridColumnStart", js.undefined)
    
    @scala.inline
    def setGridRowEndVarargs(value: GridRowEndProperty*): Self = this.set("gridRowEnd", js.Array(value :_*))
    
    @scala.inline
    def setGridRowEnd(value: GridRowEndProperty | js.Array[GridRowEndProperty]): Self = this.set("gridRowEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridRowEnd: Self = this.set("gridRowEnd", js.undefined)
    
    @scala.inline
    def setGridRowStartVarargs(value: GridRowStartProperty*): Self = this.set("gridRowStart", js.Array(value :_*))
    
    @scala.inline
    def setGridRowStart(value: GridRowStartProperty | js.Array[GridRowStartProperty]): Self = this.set("gridRowStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridRowStart: Self = this.set("gridRowStart", js.undefined)
    
    @scala.inline
    def setGridTemplateAreasVarargs(value: GridTemplateAreasProperty*): Self = this.set("gridTemplateAreas", js.Array(value :_*))
    
    @scala.inline
    def setGridTemplateAreas(value: GridTemplateAreasProperty | js.Array[GridTemplateAreasProperty]): Self = this.set("gridTemplateAreas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridTemplateAreas: Self = this.set("gridTemplateAreas", js.undefined)
    
    @scala.inline
    def setGridTemplateColumnsVarargs(value: GridTemplateColumnsProperty[TLength]*): Self = this.set("gridTemplateColumns", js.Array(value :_*))
    
    @scala.inline
    def setGridTemplateColumns(value: GridTemplateColumnsProperty[TLength] | js.Array[GridTemplateColumnsProperty[TLength]]): Self = this.set("gridTemplateColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridTemplateColumns: Self = this.set("gridTemplateColumns", js.undefined)
    
    @scala.inline
    def setGridTemplateRowsVarargs(value: GridTemplateRowsProperty[TLength]*): Self = this.set("gridTemplateRows", js.Array(value :_*))
    
    @scala.inline
    def setGridTemplateRows(value: GridTemplateRowsProperty[TLength] | js.Array[GridTemplateRowsProperty[TLength]]): Self = this.set("gridTemplateRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridTemplateRows: Self = this.set("gridTemplateRows", js.undefined)
    
    @scala.inline
    def setHangingPunctuationVarargs(value: HangingPunctuationProperty*): Self = this.set("hangingPunctuation", js.Array(value :_*))
    
    @scala.inline
    def setHangingPunctuation(value: HangingPunctuationProperty | js.Array[HangingPunctuationProperty]): Self = this.set("hangingPunctuation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHangingPunctuation: Self = this.set("hangingPunctuation", js.undefined)
    
    @scala.inline
    def setHeightVarargs(value: HeightProperty[TLength]*): Self = this.set("height", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: HeightProperty[TLength] | js.Array[HeightProperty[TLength]]): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHyphensVarargs(value: HyphensProperty*): Self = this.set("hyphens", js.Array(value :_*))
    
    @scala.inline
    def setHyphens(value: HyphensProperty | js.Array[HyphensProperty]): Self = this.set("hyphens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHyphens: Self = this.set("hyphens", js.undefined)
    
    @scala.inline
    def setImageOrientationVarargs(value: ImageOrientationProperty*): Self = this.set("imageOrientation", js.Array(value :_*))
    
    @scala.inline
    def setImageOrientation(value: ImageOrientationProperty | js.Array[ImageOrientationProperty]): Self = this.set("imageOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageOrientation: Self = this.set("imageOrientation", js.undefined)
    
    @scala.inline
    def setImageRenderingVarargs(value: ImageRenderingProperty*): Self = this.set("imageRendering", js.Array(value :_*))
    
    @scala.inline
    def setImageRendering(value: ImageRenderingProperty | js.Array[ImageRenderingProperty]): Self = this.set("imageRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageRendering: Self = this.set("imageRendering", js.undefined)
    
    @scala.inline
    def setImageResolutionVarargs(value: ImageResolutionProperty*): Self = this.set("imageResolution", js.Array(value :_*))
    
    @scala.inline
    def setImageResolution(value: ImageResolutionProperty | js.Array[ImageResolutionProperty]): Self = this.set("imageResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageResolution: Self = this.set("imageResolution", js.undefined)
    
    @scala.inline
    def setInitialLetterVarargs(value: InitialLetterProperty*): Self = this.set("initialLetter", js.Array(value :_*))
    
    @scala.inline
    def setInitialLetter(value: InitialLetterProperty | js.Array[InitialLetterProperty]): Self = this.set("initialLetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialLetter: Self = this.set("initialLetter", js.undefined)
    
    @scala.inline
    def setInlineSizeVarargs(value: InlineSizeProperty[TLength]*): Self = this.set("inlineSize", js.Array(value :_*))
    
    @scala.inline
    def setInlineSize(value: InlineSizeProperty[TLength] | js.Array[InlineSizeProperty[TLength]]): Self = this.set("inlineSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineSize: Self = this.set("inlineSize", js.undefined)
    
    @scala.inline
    def setInsetVarargs(value: InsetProperty[TLength]*): Self = this.set("inset", js.Array(value :_*))
    
    @scala.inline
    def setInset(value: InsetProperty[TLength] | js.Array[InsetProperty[TLength]]): Self = this.set("inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInset: Self = this.set("inset", js.undefined)
    
    @scala.inline
    def setInsetBlockVarargs(value: InsetBlockProperty[TLength]*): Self = this.set("insetBlock", js.Array(value :_*))
    
    @scala.inline
    def setInsetBlock(value: InsetBlockProperty[TLength] | js.Array[InsetBlockProperty[TLength]]): Self = this.set("insetBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsetBlock: Self = this.set("insetBlock", js.undefined)
    
    @scala.inline
    def setInsetBlockEndVarargs(value: InsetBlockEndProperty[TLength]*): Self = this.set("insetBlockEnd", js.Array(value :_*))
    
    @scala.inline
    def setInsetBlockEnd(value: InsetBlockEndProperty[TLength] | js.Array[InsetBlockEndProperty[TLength]]): Self = this.set("insetBlockEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsetBlockEnd: Self = this.set("insetBlockEnd", js.undefined)
    
    @scala.inline
    def setInsetBlockStartVarargs(value: InsetBlockStartProperty[TLength]*): Self = this.set("insetBlockStart", js.Array(value :_*))
    
    @scala.inline
    def setInsetBlockStart(value: InsetBlockStartProperty[TLength] | js.Array[InsetBlockStartProperty[TLength]]): Self = this.set("insetBlockStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsetBlockStart: Self = this.set("insetBlockStart", js.undefined)
    
    @scala.inline
    def setInsetInlineVarargs(value: InsetInlineProperty[TLength]*): Self = this.set("insetInline", js.Array(value :_*))
    
    @scala.inline
    def setInsetInline(value: InsetInlineProperty[TLength] | js.Array[InsetInlineProperty[TLength]]): Self = this.set("insetInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsetInline: Self = this.set("insetInline", js.undefined)
    
    @scala.inline
    def setInsetInlineEndVarargs(value: InsetInlineEndProperty[TLength]*): Self = this.set("insetInlineEnd", js.Array(value :_*))
    
    @scala.inline
    def setInsetInlineEnd(value: InsetInlineEndProperty[TLength] | js.Array[InsetInlineEndProperty[TLength]]): Self = this.set("insetInlineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsetInlineEnd: Self = this.set("insetInlineEnd", js.undefined)
    
    @scala.inline
    def setInsetInlineStartVarargs(value: InsetInlineStartProperty[TLength]*): Self = this.set("insetInlineStart", js.Array(value :_*))
    
    @scala.inline
    def setInsetInlineStart(value: InsetInlineStartProperty[TLength] | js.Array[InsetInlineStartProperty[TLength]]): Self = this.set("insetInlineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsetInlineStart: Self = this.set("insetInlineStart", js.undefined)
    
    @scala.inline
    def setIsolationVarargs(value: IsolationProperty*): Self = this.set("isolation", js.Array(value :_*))
    
    @scala.inline
    def setIsolation(value: IsolationProperty | js.Array[IsolationProperty]): Self = this.set("isolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsolation: Self = this.set("isolation", js.undefined)
    
    @scala.inline
    def setJustifyContentVarargs(value: JustifyContentProperty*): Self = this.set("justifyContent", js.Array(value :_*))
    
    @scala.inline
    def setJustifyContent(value: JustifyContentProperty | js.Array[JustifyContentProperty]): Self = this.set("justifyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJustifyContent: Self = this.set("justifyContent", js.undefined)
    
    @scala.inline
    def setJustifyItemsVarargs(value: JustifyItemsProperty*): Self = this.set("justifyItems", js.Array(value :_*))
    
    @scala.inline
    def setJustifyItems(value: JustifyItemsProperty | js.Array[JustifyItemsProperty]): Self = this.set("justifyItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJustifyItems: Self = this.set("justifyItems", js.undefined)
    
    @scala.inline
    def setJustifySelfVarargs(value: JustifySelfProperty*): Self = this.set("justifySelf", js.Array(value :_*))
    
    @scala.inline
    def setJustifySelf(value: JustifySelfProperty | js.Array[JustifySelfProperty]): Self = this.set("justifySelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJustifySelf: Self = this.set("justifySelf", js.undefined)
    
    @scala.inline
    def setLeftVarargs(value: LeftProperty[TLength]*): Self = this.set("left", js.Array(value :_*))
    
    @scala.inline
    def setLeft(value: LeftProperty[TLength] | js.Array[LeftProperty[TLength]]): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setLetterSpacingVarargs(value: LetterSpacingProperty[TLength]*): Self = this.set("letterSpacing", js.Array(value :_*))
    
    @scala.inline
    def setLetterSpacing(value: LetterSpacingProperty[TLength] | js.Array[LetterSpacingProperty[TLength]]): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    
    @scala.inline
    def setLineBreakVarargs(value: LineBreakProperty*): Self = this.set("lineBreak", js.Array(value :_*))
    
    @scala.inline
    def setLineBreak(value: LineBreakProperty | js.Array[LineBreakProperty]): Self = this.set("lineBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineBreak: Self = this.set("lineBreak", js.undefined)
    
    @scala.inline
    def setLineHeightVarargs(value: LineHeightProperty[TLength]*): Self = this.set("lineHeight", js.Array(value :_*))
    
    @scala.inline
    def setLineHeight(value: LineHeightProperty[TLength] | js.Array[LineHeightProperty[TLength]]): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setLineHeightStepVarargs(value: LineHeightStepProperty[TLength]*): Self = this.set("lineHeightStep", js.Array(value :_*))
    
    @scala.inline
    def setLineHeightStep(value: LineHeightStepProperty[TLength] | js.Array[LineHeightStepProperty[TLength]]): Self = this.set("lineHeightStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeightStep: Self = this.set("lineHeightStep", js.undefined)
    
    @scala.inline
    def setListStyleImageVarargs(value: ListStyleImageProperty*): Self = this.set("listStyleImage", js.Array(value :_*))
    
    @scala.inline
    def setListStyleImage(value: ListStyleImageProperty | js.Array[ListStyleImageProperty]): Self = this.set("listStyleImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListStyleImage: Self = this.set("listStyleImage", js.undefined)
    
    @scala.inline
    def setListStylePositionVarargs(value: ListStylePositionProperty*): Self = this.set("listStylePosition", js.Array(value :_*))
    
    @scala.inline
    def setListStylePosition(value: ListStylePositionProperty | js.Array[ListStylePositionProperty]): Self = this.set("listStylePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListStylePosition: Self = this.set("listStylePosition", js.undefined)
    
    @scala.inline
    def setListStyleTypeVarargs(value: ListStyleTypeProperty*): Self = this.set("listStyleType", js.Array(value :_*))
    
    @scala.inline
    def setListStyleType(value: ListStyleTypeProperty | js.Array[ListStyleTypeProperty]): Self = this.set("listStyleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListStyleType: Self = this.set("listStyleType", js.undefined)
    
    @scala.inline
    def setMarginBlockVarargs(value: MarginBlockProperty[TLength]*): Self = this.set("marginBlock", js.Array(value :_*))
    
    @scala.inline
    def setMarginBlock(value: MarginBlockProperty[TLength] | js.Array[MarginBlockProperty[TLength]]): Self = this.set("marginBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginBlock: Self = this.set("marginBlock", js.undefined)
    
    @scala.inline
    def setMarginBlockEndVarargs(value: MarginBlockEndProperty[TLength]*): Self = this.set("marginBlockEnd", js.Array(value :_*))
    
    @scala.inline
    def setMarginBlockEnd(value: MarginBlockEndProperty[TLength] | js.Array[MarginBlockEndProperty[TLength]]): Self = this.set("marginBlockEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginBlockEnd: Self = this.set("marginBlockEnd", js.undefined)
    
    @scala.inline
    def setMarginBlockStartVarargs(value: MarginBlockStartProperty[TLength]*): Self = this.set("marginBlockStart", js.Array(value :_*))
    
    @scala.inline
    def setMarginBlockStart(value: MarginBlockStartProperty[TLength] | js.Array[MarginBlockStartProperty[TLength]]): Self = this.set("marginBlockStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginBlockStart: Self = this.set("marginBlockStart", js.undefined)
    
    @scala.inline
    def setMarginBottomVarargs(value: MarginBottomProperty[TLength]*): Self = this.set("marginBottom", js.Array(value :_*))
    
    @scala.inline
    def setMarginBottom(value: MarginBottomProperty[TLength] | js.Array[MarginBottomProperty[TLength]]): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    
    @scala.inline
    def setMarginInlineVarargs(value: MarginInlineProperty[TLength]*): Self = this.set("marginInline", js.Array(value :_*))
    
    @scala.inline
    def setMarginInline(value: MarginInlineProperty[TLength] | js.Array[MarginInlineProperty[TLength]]): Self = this.set("marginInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginInline: Self = this.set("marginInline", js.undefined)
    
    @scala.inline
    def setMarginInlineEndVarargs(value: MarginInlineEndProperty[TLength]*): Self = this.set("marginInlineEnd", js.Array(value :_*))
    
    @scala.inline
    def setMarginInlineEnd(value: MarginInlineEndProperty[TLength] | js.Array[MarginInlineEndProperty[TLength]]): Self = this.set("marginInlineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginInlineEnd: Self = this.set("marginInlineEnd", js.undefined)
    
    @scala.inline
    def setMarginInlineStartVarargs(value: MarginInlineStartProperty[TLength]*): Self = this.set("marginInlineStart", js.Array(value :_*))
    
    @scala.inline
    def setMarginInlineStart(value: MarginInlineStartProperty[TLength] | js.Array[MarginInlineStartProperty[TLength]]): Self = this.set("marginInlineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginInlineStart: Self = this.set("marginInlineStart", js.undefined)
    
    @scala.inline
    def setMarginLeftVarargs(value: MarginLeftProperty[TLength]*): Self = this.set("marginLeft", js.Array(value :_*))
    
    @scala.inline
    def setMarginLeft(value: MarginLeftProperty[TLength] | js.Array[MarginLeftProperty[TLength]]): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    
    @scala.inline
    def setMarginRightVarargs(value: MarginRightProperty[TLength]*): Self = this.set("marginRight", js.Array(value :_*))
    
    @scala.inline
    def setMarginRight(value: MarginRightProperty[TLength] | js.Array[MarginRightProperty[TLength]]): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    
    @scala.inline
    def setMarginTopVarargs(value: MarginTopProperty[TLength]*): Self = this.set("marginTop", js.Array(value :_*))
    
    @scala.inline
    def setMarginTop(value: MarginTopProperty[TLength] | js.Array[MarginTopProperty[TLength]]): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    
    @scala.inline
    def setMaskBorderModeVarargs(value: MaskBorderModeProperty*): Self = this.set("maskBorderMode", js.Array(value :_*))
    
    @scala.inline
    def setMaskBorderMode(value: MaskBorderModeProperty | js.Array[MaskBorderModeProperty]): Self = this.set("maskBorderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskBorderMode: Self = this.set("maskBorderMode", js.undefined)
    
    @scala.inline
    def setMaskBorderOutsetVarargs(value: MaskBorderOutsetProperty[TLength]*): Self = this.set("maskBorderOutset", js.Array(value :_*))
    
    @scala.inline
    def setMaskBorderOutset(value: MaskBorderOutsetProperty[TLength] | js.Array[MaskBorderOutsetProperty[TLength]]): Self = this.set("maskBorderOutset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskBorderOutset: Self = this.set("maskBorderOutset", js.undefined)
    
    @scala.inline
    def setMaskBorderRepeatVarargs(value: MaskBorderRepeatProperty*): Self = this.set("maskBorderRepeat", js.Array(value :_*))
    
    @scala.inline
    def setMaskBorderRepeat(value: MaskBorderRepeatProperty | js.Array[MaskBorderRepeatProperty]): Self = this.set("maskBorderRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskBorderRepeat: Self = this.set("maskBorderRepeat", js.undefined)
    
    @scala.inline
    def setMaskBorderSliceVarargs(value: MaskBorderSliceProperty*): Self = this.set("maskBorderSlice", js.Array(value :_*))
    
    @scala.inline
    def setMaskBorderSlice(value: MaskBorderSliceProperty | js.Array[MaskBorderSliceProperty]): Self = this.set("maskBorderSlice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskBorderSlice: Self = this.set("maskBorderSlice", js.undefined)
    
    @scala.inline
    def setMaskBorderSourceVarargs(value: MaskBorderSourceProperty*): Self = this.set("maskBorderSource", js.Array(value :_*))
    
    @scala.inline
    def setMaskBorderSource(value: MaskBorderSourceProperty | js.Array[MaskBorderSourceProperty]): Self = this.set("maskBorderSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskBorderSource: Self = this.set("maskBorderSource", js.undefined)
    
    @scala.inline
    def setMaskBorderWidthVarargs(value: MaskBorderWidthProperty[TLength]*): Self = this.set("maskBorderWidth", js.Array(value :_*))
    
    @scala.inline
    def setMaskBorderWidth(value: MaskBorderWidthProperty[TLength] | js.Array[MaskBorderWidthProperty[TLength]]): Self = this.set("maskBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskBorderWidth: Self = this.set("maskBorderWidth", js.undefined)
    
    @scala.inline
    def setMaskClipVarargs(value: MaskClipProperty*): Self = this.set("maskClip", js.Array(value :_*))
    
    @scala.inline
    def setMaskClip(value: MaskClipProperty | js.Array[MaskClipProperty]): Self = this.set("maskClip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskClip: Self = this.set("maskClip", js.undefined)
    
    @scala.inline
    def setMaskCompositeVarargs(value: MaskCompositeProperty*): Self = this.set("maskComposite", js.Array(value :_*))
    
    @scala.inline
    def setMaskComposite(value: MaskCompositeProperty | js.Array[MaskCompositeProperty]): Self = this.set("maskComposite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskComposite: Self = this.set("maskComposite", js.undefined)
    
    @scala.inline
    def setMaskImageVarargs(value: MaskImageProperty*): Self = this.set("maskImage", js.Array(value :_*))
    
    @scala.inline
    def setMaskImage(value: MaskImageProperty | js.Array[MaskImageProperty]): Self = this.set("maskImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskImage: Self = this.set("maskImage", js.undefined)
    
    @scala.inline
    def setMaskModeVarargs(value: MaskModeProperty*): Self = this.set("maskMode", js.Array(value :_*))
    
    @scala.inline
    def setMaskMode(value: MaskModeProperty | js.Array[MaskModeProperty]): Self = this.set("maskMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskMode: Self = this.set("maskMode", js.undefined)
    
    @scala.inline
    def setMaskOriginVarargs(value: MaskOriginProperty*): Self = this.set("maskOrigin", js.Array(value :_*))
    
    @scala.inline
    def setMaskOrigin(value: MaskOriginProperty | js.Array[MaskOriginProperty]): Self = this.set("maskOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskOrigin: Self = this.set("maskOrigin", js.undefined)
    
    @scala.inline
    def setMaskPositionVarargs(value: MaskPositionProperty[TLength]*): Self = this.set("maskPosition", js.Array(value :_*))
    
    @scala.inline
    def setMaskPosition(value: MaskPositionProperty[TLength] | js.Array[MaskPositionProperty[TLength]]): Self = this.set("maskPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskPosition: Self = this.set("maskPosition", js.undefined)
    
    @scala.inline
    def setMaskRepeatVarargs(value: MaskRepeatProperty*): Self = this.set("maskRepeat", js.Array(value :_*))
    
    @scala.inline
    def setMaskRepeat(value: MaskRepeatProperty | js.Array[MaskRepeatProperty]): Self = this.set("maskRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskRepeat: Self = this.set("maskRepeat", js.undefined)
    
    @scala.inline
    def setMaskSizeVarargs(value: MaskSizeProperty[TLength]*): Self = this.set("maskSize", js.Array(value :_*))
    
    @scala.inline
    def setMaskSize(value: MaskSizeProperty[TLength] | js.Array[MaskSizeProperty[TLength]]): Self = this.set("maskSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskSize: Self = this.set("maskSize", js.undefined)
    
    @scala.inline
    def setMaskTypeVarargs(value: MaskTypeProperty*): Self = this.set("maskType", js.Array(value :_*))
    
    @scala.inline
    def setMaskType(value: MaskTypeProperty | js.Array[MaskTypeProperty]): Self = this.set("maskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskType: Self = this.set("maskType", js.undefined)
    
    @scala.inline
    def setMaxBlockSizeVarargs(value: MaxBlockSizeProperty[TLength]*): Self = this.set("maxBlockSize", js.Array(value :_*))
    
    @scala.inline
    def setMaxBlockSize(value: MaxBlockSizeProperty[TLength] | js.Array[MaxBlockSizeProperty[TLength]]): Self = this.set("maxBlockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBlockSize: Self = this.set("maxBlockSize", js.undefined)
    
    @scala.inline
    def setMaxHeightVarargs(value: MaxHeightProperty[TLength]*): Self = this.set("maxHeight", js.Array(value :_*))
    
    @scala.inline
    def setMaxHeight(value: MaxHeightProperty[TLength] | js.Array[MaxHeightProperty[TLength]]): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxInlineSizeVarargs(value: MaxInlineSizeProperty[TLength]*): Self = this.set("maxInlineSize", js.Array(value :_*))
    
    @scala.inline
    def setMaxInlineSize(value: MaxInlineSizeProperty[TLength] | js.Array[MaxInlineSizeProperty[TLength]]): Self = this.set("maxInlineSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxInlineSize: Self = this.set("maxInlineSize", js.undefined)
    
    @scala.inline
    def setMaxLinesVarargs(value: MaxLinesProperty*): Self = this.set("maxLines", js.Array(value :_*))
    
    @scala.inline
    def setMaxLines(value: MaxLinesProperty | js.Array[MaxLinesProperty]): Self = this.set("maxLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLines: Self = this.set("maxLines", js.undefined)
    
    @scala.inline
    def setMaxWidthVarargs(value: MaxWidthProperty[TLength]*): Self = this.set("maxWidth", js.Array(value :_*))
    
    @scala.inline
    def setMaxWidth(value: MaxWidthProperty[TLength] | js.Array[MaxWidthProperty[TLength]]): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMinBlockSizeVarargs(value: MinBlockSizeProperty[TLength]*): Self = this.set("minBlockSize", js.Array(value :_*))
    
    @scala.inline
    def setMinBlockSize(value: MinBlockSizeProperty[TLength] | js.Array[MinBlockSizeProperty[TLength]]): Self = this.set("minBlockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinBlockSize: Self = this.set("minBlockSize", js.undefined)
    
    @scala.inline
    def setMinHeightVarargs(value: MinHeightProperty[TLength]*): Self = this.set("minHeight", js.Array(value :_*))
    
    @scala.inline
    def setMinHeight(value: MinHeightProperty[TLength] | js.Array[MinHeightProperty[TLength]]): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinInlineSizeVarargs(value: MinInlineSizeProperty[TLength]*): Self = this.set("minInlineSize", js.Array(value :_*))
    
    @scala.inline
    def setMinInlineSize(value: MinInlineSizeProperty[TLength] | js.Array[MinInlineSizeProperty[TLength]]): Self = this.set("minInlineSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinInlineSize: Self = this.set("minInlineSize", js.undefined)
    
    @scala.inline
    def setMinWidthVarargs(value: MinWidthProperty[TLength]*): Self = this.set("minWidth", js.Array(value :_*))
    
    @scala.inline
    def setMinWidth(value: MinWidthProperty[TLength] | js.Array[MinWidthProperty[TLength]]): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setMixBlendModeVarargs(value: MixBlendModeProperty*): Self = this.set("mixBlendMode", js.Array(value :_*))
    
    @scala.inline
    def setMixBlendMode(value: MixBlendModeProperty | js.Array[MixBlendModeProperty]): Self = this.set("mixBlendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMixBlendMode: Self = this.set("mixBlendMode", js.undefined)
    
    @scala.inline
    def setMotionDistanceVarargs(value: OffsetDistanceProperty[TLength]*): Self = this.set("motionDistance", js.Array(value :_*))
    
    @scala.inline
    def setMotionDistance(value: OffsetDistanceProperty[TLength] | js.Array[OffsetDistanceProperty[TLength]]): Self = this.set("motionDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotionDistance: Self = this.set("motionDistance", js.undefined)
    
    @scala.inline
    def setMotionPathVarargs(value: OffsetPathProperty*): Self = this.set("motionPath", js.Array(value :_*))
    
    @scala.inline
    def setMotionPath(value: OffsetPathProperty | js.Array[OffsetPathProperty]): Self = this.set("motionPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotionPath: Self = this.set("motionPath", js.undefined)
    
    @scala.inline
    def setMotionRotationVarargs(value: OffsetRotateProperty*): Self = this.set("motionRotation", js.Array(value :_*))
    
    @scala.inline
    def setMotionRotation(value: OffsetRotateProperty | js.Array[OffsetRotateProperty]): Self = this.set("motionRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotionRotation: Self = this.set("motionRotation", js.undefined)
    
    @scala.inline
    def setObjectFitVarargs(value: ObjectFitProperty*): Self = this.set("objectFit", js.Array(value :_*))
    
    @scala.inline
    def setObjectFit(value: ObjectFitProperty | js.Array[ObjectFitProperty]): Self = this.set("objectFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectFit: Self = this.set("objectFit", js.undefined)
    
    @scala.inline
    def setObjectPositionVarargs(value: ObjectPositionProperty[TLength]*): Self = this.set("objectPosition", js.Array(value :_*))
    
    @scala.inline
    def setObjectPosition(value: ObjectPositionProperty[TLength] | js.Array[ObjectPositionProperty[TLength]]): Self = this.set("objectPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectPosition: Self = this.set("objectPosition", js.undefined)
    
    @scala.inline
    def setOffsetAnchorVarargs(value: OffsetAnchorProperty[TLength]*): Self = this.set("offsetAnchor", js.Array(value :_*))
    
    @scala.inline
    def setOffsetAnchor(value: OffsetAnchorProperty[TLength] | js.Array[OffsetAnchorProperty[TLength]]): Self = this.set("offsetAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetAnchor: Self = this.set("offsetAnchor", js.undefined)
    
    @scala.inline
    def setOffsetDistanceVarargs(value: OffsetDistanceProperty[TLength]*): Self = this.set("offsetDistance", js.Array(value :_*))
    
    @scala.inline
    def setOffsetDistance(value: OffsetDistanceProperty[TLength] | js.Array[OffsetDistanceProperty[TLength]]): Self = this.set("offsetDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetDistance: Self = this.set("offsetDistance", js.undefined)
    
    @scala.inline
    def setOffsetPathVarargs(value: OffsetPathProperty*): Self = this.set("offsetPath", js.Array(value :_*))
    
    @scala.inline
    def setOffsetPath(value: OffsetPathProperty | js.Array[OffsetPathProperty]): Self = this.set("offsetPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetPath: Self = this.set("offsetPath", js.undefined)
    
    @scala.inline
    def setOffsetRotateVarargs(value: OffsetRotateProperty*): Self = this.set("offsetRotate", js.Array(value :_*))
    
    @scala.inline
    def setOffsetRotate(value: OffsetRotateProperty | js.Array[OffsetRotateProperty]): Self = this.set("offsetRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetRotate: Self = this.set("offsetRotate", js.undefined)
    
    @scala.inline
    def setOffsetRotationVarargs(value: OffsetRotateProperty*): Self = this.set("offsetRotation", js.Array(value :_*))
    
    @scala.inline
    def setOffsetRotation(value: OffsetRotateProperty | js.Array[OffsetRotateProperty]): Self = this.set("offsetRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetRotation: Self = this.set("offsetRotation", js.undefined)
    
    @scala.inline
    def setOpacityVarargs(value: OpacityProperty*): Self = this.set("opacity", js.Array(value :_*))
    
    @scala.inline
    def setOpacity(value: OpacityProperty | js.Array[OpacityProperty]): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setOrderVarargs(value: GlobalsNumber*): Self = this.set("order", js.Array(value :_*))
    
    @scala.inline
    def setOrder(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setOrphansVarargs(value: GlobalsNumber*): Self = this.set("orphans", js.Array(value :_*))
    
    @scala.inline
    def setOrphans(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("orphans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrphans: Self = this.set("orphans", js.undefined)
    
    @scala.inline
    def setOutlineColorVarargs(value: OutlineColorProperty*): Self = this.set("outlineColor", js.Array(value :_*))
    
    @scala.inline
    def setOutlineColor(value: OutlineColorProperty | js.Array[OutlineColorProperty]): Self = this.set("outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineColor: Self = this.set("outlineColor", js.undefined)
    
    @scala.inline
    def setOutlineOffsetVarargs(value: OutlineOffsetProperty[TLength]*): Self = this.set("outlineOffset", js.Array(value :_*))
    
    @scala.inline
    def setOutlineOffset(value: OutlineOffsetProperty[TLength] | js.Array[OutlineOffsetProperty[TLength]]): Self = this.set("outlineOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineOffset: Self = this.set("outlineOffset", js.undefined)
    
    @scala.inline
    def setOutlineStyleVarargs(value: OutlineStyleProperty*): Self = this.set("outlineStyle", js.Array(value :_*))
    
    @scala.inline
    def setOutlineStyle(value: OutlineStyleProperty | js.Array[OutlineStyleProperty]): Self = this.set("outlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineStyle: Self = this.set("outlineStyle", js.undefined)
    
    @scala.inline
    def setOutlineWidthVarargs(value: OutlineWidthProperty[TLength]*): Self = this.set("outlineWidth", js.Array(value :_*))
    
    @scala.inline
    def setOutlineWidth(value: OutlineWidthProperty[TLength] | js.Array[OutlineWidthProperty[TLength]]): Self = this.set("outlineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineWidth: Self = this.set("outlineWidth", js.undefined)
    
    @scala.inline
    def setOverflowAnchorVarargs(value: OverflowAnchorProperty*): Self = this.set("overflowAnchor", js.Array(value :_*))
    
    @scala.inline
    def setOverflowAnchor(value: OverflowAnchorProperty | js.Array[OverflowAnchorProperty]): Self = this.set("overflowAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowAnchor: Self = this.set("overflowAnchor", js.undefined)
    
    @scala.inline
    def setOverflowBlockVarargs(value: OverflowBlockProperty*): Self = this.set("overflowBlock", js.Array(value :_*))
    
    @scala.inline
    def setOverflowBlock(value: OverflowBlockProperty | js.Array[OverflowBlockProperty]): Self = this.set("overflowBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowBlock: Self = this.set("overflowBlock", js.undefined)
    
    @scala.inline
    def setOverflowClipBoxVarargs(value: OverflowClipBoxProperty*): Self = this.set("overflowClipBox", js.Array(value :_*))
    
    @scala.inline
    def setOverflowClipBox(value: OverflowClipBoxProperty | js.Array[OverflowClipBoxProperty]): Self = this.set("overflowClipBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowClipBox: Self = this.set("overflowClipBox", js.undefined)
    
    @scala.inline
    def setOverflowInlineVarargs(value: OverflowInlineProperty*): Self = this.set("overflowInline", js.Array(value :_*))
    
    @scala.inline
    def setOverflowInline(value: OverflowInlineProperty | js.Array[OverflowInlineProperty]): Self = this.set("overflowInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowInline: Self = this.set("overflowInline", js.undefined)
    
    @scala.inline
    def setOverflowWrapVarargs(value: OverflowWrapProperty*): Self = this.set("overflowWrap", js.Array(value :_*))
    
    @scala.inline
    def setOverflowWrap(value: OverflowWrapProperty | js.Array[OverflowWrapProperty]): Self = this.set("overflowWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowWrap: Self = this.set("overflowWrap", js.undefined)
    
    @scala.inline
    def setOverflowXVarargs(value: OverflowXProperty*): Self = this.set("overflowX", js.Array(value :_*))
    
    @scala.inline
    def setOverflowX(value: OverflowXProperty | js.Array[OverflowXProperty]): Self = this.set("overflowX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowX: Self = this.set("overflowX", js.undefined)
    
    @scala.inline
    def setOverflowYVarargs(value: OverflowYProperty*): Self = this.set("overflowY", js.Array(value :_*))
    
    @scala.inline
    def setOverflowY(value: OverflowYProperty | js.Array[OverflowYProperty]): Self = this.set("overflowY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowY: Self = this.set("overflowY", js.undefined)
    
    @scala.inline
    def setOverscrollBehaviorVarargs(value: OverscrollBehaviorProperty*): Self = this.set("overscrollBehavior", js.Array(value :_*))
    
    @scala.inline
    def setOverscrollBehavior(value: OverscrollBehaviorProperty | js.Array[OverscrollBehaviorProperty]): Self = this.set("overscrollBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverscrollBehavior: Self = this.set("overscrollBehavior", js.undefined)
    
    @scala.inline
    def setOverscrollBehaviorBlockVarargs(value: OverscrollBehaviorBlockProperty*): Self = this.set("overscrollBehaviorBlock", js.Array(value :_*))
    
    @scala.inline
    def setOverscrollBehaviorBlock(value: OverscrollBehaviorBlockProperty | js.Array[OverscrollBehaviorBlockProperty]): Self = this.set("overscrollBehaviorBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverscrollBehaviorBlock: Self = this.set("overscrollBehaviorBlock", js.undefined)
    
    @scala.inline
    def setOverscrollBehaviorInlineVarargs(value: OverscrollBehaviorInlineProperty*): Self = this.set("overscrollBehaviorInline", js.Array(value :_*))
    
    @scala.inline
    def setOverscrollBehaviorInline(value: OverscrollBehaviorInlineProperty | js.Array[OverscrollBehaviorInlineProperty]): Self = this.set("overscrollBehaviorInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverscrollBehaviorInline: Self = this.set("overscrollBehaviorInline", js.undefined)
    
    @scala.inline
    def setOverscrollBehaviorXVarargs(value: OverscrollBehaviorXProperty*): Self = this.set("overscrollBehaviorX", js.Array(value :_*))
    
    @scala.inline
    def setOverscrollBehaviorX(value: OverscrollBehaviorXProperty | js.Array[OverscrollBehaviorXProperty]): Self = this.set("overscrollBehaviorX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverscrollBehaviorX: Self = this.set("overscrollBehaviorX", js.undefined)
    
    @scala.inline
    def setOverscrollBehaviorYVarargs(value: OverscrollBehaviorYProperty*): Self = this.set("overscrollBehaviorY", js.Array(value :_*))
    
    @scala.inline
    def setOverscrollBehaviorY(value: OverscrollBehaviorYProperty | js.Array[OverscrollBehaviorYProperty]): Self = this.set("overscrollBehaviorY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverscrollBehaviorY: Self = this.set("overscrollBehaviorY", js.undefined)
    
    @scala.inline
    def setPaddingBlockVarargs(value: PaddingBlockProperty[TLength]*): Self = this.set("paddingBlock", js.Array(value :_*))
    
    @scala.inline
    def setPaddingBlock(value: PaddingBlockProperty[TLength] | js.Array[PaddingBlockProperty[TLength]]): Self = this.set("paddingBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingBlock: Self = this.set("paddingBlock", js.undefined)
    
    @scala.inline
    def setPaddingBlockEndVarargs(value: PaddingBlockEndProperty[TLength]*): Self = this.set("paddingBlockEnd", js.Array(value :_*))
    
    @scala.inline
    def setPaddingBlockEnd(value: PaddingBlockEndProperty[TLength] | js.Array[PaddingBlockEndProperty[TLength]]): Self = this.set("paddingBlockEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingBlockEnd: Self = this.set("paddingBlockEnd", js.undefined)
    
    @scala.inline
    def setPaddingBlockStartVarargs(value: PaddingBlockStartProperty[TLength]*): Self = this.set("paddingBlockStart", js.Array(value :_*))
    
    @scala.inline
    def setPaddingBlockStart(value: PaddingBlockStartProperty[TLength] | js.Array[PaddingBlockStartProperty[TLength]]): Self = this.set("paddingBlockStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingBlockStart: Self = this.set("paddingBlockStart", js.undefined)
    
    @scala.inline
    def setPaddingBottomVarargs(value: PaddingBottomProperty[TLength]*): Self = this.set("paddingBottom", js.Array(value :_*))
    
    @scala.inline
    def setPaddingBottom(value: PaddingBottomProperty[TLength] | js.Array[PaddingBottomProperty[TLength]]): Self = this.set("paddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingBottom: Self = this.set("paddingBottom", js.undefined)
    
    @scala.inline
    def setPaddingInlineVarargs(value: PaddingInlineProperty[TLength]*): Self = this.set("paddingInline", js.Array(value :_*))
    
    @scala.inline
    def setPaddingInline(value: PaddingInlineProperty[TLength] | js.Array[PaddingInlineProperty[TLength]]): Self = this.set("paddingInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingInline: Self = this.set("paddingInline", js.undefined)
    
    @scala.inline
    def setPaddingInlineEndVarargs(value: PaddingInlineEndProperty[TLength]*): Self = this.set("paddingInlineEnd", js.Array(value :_*))
    
    @scala.inline
    def setPaddingInlineEnd(value: PaddingInlineEndProperty[TLength] | js.Array[PaddingInlineEndProperty[TLength]]): Self = this.set("paddingInlineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingInlineEnd: Self = this.set("paddingInlineEnd", js.undefined)
    
    @scala.inline
    def setPaddingInlineStartVarargs(value: PaddingInlineStartProperty[TLength]*): Self = this.set("paddingInlineStart", js.Array(value :_*))
    
    @scala.inline
    def setPaddingInlineStart(value: PaddingInlineStartProperty[TLength] | js.Array[PaddingInlineStartProperty[TLength]]): Self = this.set("paddingInlineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingInlineStart: Self = this.set("paddingInlineStart", js.undefined)
    
    @scala.inline
    def setPaddingLeftVarargs(value: PaddingLeftProperty[TLength]*): Self = this.set("paddingLeft", js.Array(value :_*))
    
    @scala.inline
    def setPaddingLeft(value: PaddingLeftProperty[TLength] | js.Array[PaddingLeftProperty[TLength]]): Self = this.set("paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingLeft: Self = this.set("paddingLeft", js.undefined)
    
    @scala.inline
    def setPaddingRightVarargs(value: PaddingRightProperty[TLength]*): Self = this.set("paddingRight", js.Array(value :_*))
    
    @scala.inline
    def setPaddingRight(value: PaddingRightProperty[TLength] | js.Array[PaddingRightProperty[TLength]]): Self = this.set("paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingRight: Self = this.set("paddingRight", js.undefined)
    
    @scala.inline
    def setPaddingTopVarargs(value: PaddingTopProperty[TLength]*): Self = this.set("paddingTop", js.Array(value :_*))
    
    @scala.inline
    def setPaddingTop(value: PaddingTopProperty[TLength] | js.Array[PaddingTopProperty[TLength]]): Self = this.set("paddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingTop: Self = this.set("paddingTop", js.undefined)
    
    @scala.inline
    def setPageBreakAfterVarargs(value: PageBreakAfterProperty*): Self = this.set("pageBreakAfter", js.Array(value :_*))
    
    @scala.inline
    def setPageBreakAfter(value: PageBreakAfterProperty | js.Array[PageBreakAfterProperty]): Self = this.set("pageBreakAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageBreakAfter: Self = this.set("pageBreakAfter", js.undefined)
    
    @scala.inline
    def setPageBreakBeforeVarargs(value: PageBreakBeforeProperty*): Self = this.set("pageBreakBefore", js.Array(value :_*))
    
    @scala.inline
    def setPageBreakBefore(value: PageBreakBeforeProperty | js.Array[PageBreakBeforeProperty]): Self = this.set("pageBreakBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageBreakBefore: Self = this.set("pageBreakBefore", js.undefined)
    
    @scala.inline
    def setPageBreakInsideVarargs(value: PageBreakInsideProperty*): Self = this.set("pageBreakInside", js.Array(value :_*))
    
    @scala.inline
    def setPageBreakInside(value: PageBreakInsideProperty | js.Array[PageBreakInsideProperty]): Self = this.set("pageBreakInside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageBreakInside: Self = this.set("pageBreakInside", js.undefined)
    
    @scala.inline
    def setPaintOrderVarargs(value: PaintOrderProperty*): Self = this.set("paintOrder", js.Array(value :_*))
    
    @scala.inline
    def setPaintOrder(value: PaintOrderProperty | js.Array[PaintOrderProperty]): Self = this.set("paintOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaintOrder: Self = this.set("paintOrder", js.undefined)
    
    @scala.inline
    def setPerspectiveVarargs(value: PerspectiveProperty[TLength]*): Self = this.set("perspective", js.Array(value :_*))
    
    @scala.inline
    def setPerspective(value: PerspectiveProperty[TLength] | js.Array[PerspectiveProperty[TLength]]): Self = this.set("perspective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerspective: Self = this.set("perspective", js.undefined)
    
    @scala.inline
    def setPerspectiveOriginVarargs(value: PerspectiveOriginProperty[TLength]*): Self = this.set("perspectiveOrigin", js.Array(value :_*))
    
    @scala.inline
    def setPerspectiveOrigin(value: PerspectiveOriginProperty[TLength] | js.Array[PerspectiveOriginProperty[TLength]]): Self = this.set("perspectiveOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerspectiveOrigin: Self = this.set("perspectiveOrigin", js.undefined)
    
    @scala.inline
    def setPlaceContentVarargs(value: PlaceContentProperty*): Self = this.set("placeContent", js.Array(value :_*))
    
    @scala.inline
    def setPlaceContent(value: PlaceContentProperty | js.Array[PlaceContentProperty]): Self = this.set("placeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceContent: Self = this.set("placeContent", js.undefined)
    
    @scala.inline
    def setPointerEventsVarargs(value: PointerEventsProperty*): Self = this.set("pointerEvents", js.Array(value :_*))
    
    @scala.inline
    def setPointerEvents(value: PointerEventsProperty | js.Array[PointerEventsProperty]): Self = this.set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerEvents: Self = this.set("pointerEvents", js.undefined)
    
    @scala.inline
    def setPositionVarargs(value: PositionProperty*): Self = this.set("position", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: PositionProperty | js.Array[PositionProperty]): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setQuotesVarargs(value: QuotesProperty*): Self = this.set("quotes", js.Array(value :_*))
    
    @scala.inline
    def setQuotes(value: QuotesProperty | js.Array[QuotesProperty]): Self = this.set("quotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotes: Self = this.set("quotes", js.undefined)
    
    @scala.inline
    def setResizeVarargs(value: ResizeProperty*): Self = this.set("resize", js.Array(value :_*))
    
    @scala.inline
    def setResize(value: ResizeProperty | js.Array[ResizeProperty]): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setRightVarargs(value: RightProperty[TLength]*): Self = this.set("right", js.Array(value :_*))
    
    @scala.inline
    def setRight(value: RightProperty[TLength] | js.Array[RightProperty[TLength]]): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setRotateVarargs(value: RotateProperty*): Self = this.set("rotate", js.Array(value :_*))
    
    @scala.inline
    def setRotate(value: RotateProperty | js.Array[RotateProperty]): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    
    @scala.inline
    def setRowGapVarargs(value: RowGapProperty[TLength]*): Self = this.set("rowGap", js.Array(value :_*))
    
    @scala.inline
    def setRowGap(value: RowGapProperty[TLength] | js.Array[RowGapProperty[TLength]]): Self = this.set("rowGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowGap: Self = this.set("rowGap", js.undefined)
    
    @scala.inline
    def setRubyAlignVarargs(value: RubyAlignProperty*): Self = this.set("rubyAlign", js.Array(value :_*))
    
    @scala.inline
    def setRubyAlign(value: RubyAlignProperty | js.Array[RubyAlignProperty]): Self = this.set("rubyAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRubyAlign: Self = this.set("rubyAlign", js.undefined)
    
    @scala.inline
    def setRubyMergeVarargs(value: RubyMergeProperty*): Self = this.set("rubyMerge", js.Array(value :_*))
    
    @scala.inline
    def setRubyMerge(value: RubyMergeProperty | js.Array[RubyMergeProperty]): Self = this.set("rubyMerge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRubyMerge: Self = this.set("rubyMerge", js.undefined)
    
    @scala.inline
    def setRubyPositionVarargs(value: RubyPositionProperty*): Self = this.set("rubyPosition", js.Array(value :_*))
    
    @scala.inline
    def setRubyPosition(value: RubyPositionProperty | js.Array[RubyPositionProperty]): Self = this.set("rubyPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRubyPosition: Self = this.set("rubyPosition", js.undefined)
    
    @scala.inline
    def setScaleVarargs(value: ScaleProperty*): Self = this.set("scale", js.Array(value :_*))
    
    @scala.inline
    def setScale(value: ScaleProperty | js.Array[ScaleProperty]): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setScrollBehaviorVarargs(value: ScrollBehaviorProperty*): Self = this.set("scrollBehavior", js.Array(value :_*))
    
    @scala.inline
    def setScrollBehavior(value: ScrollBehaviorProperty | js.Array[ScrollBehaviorProperty]): Self = this.set("scrollBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollBehavior: Self = this.set("scrollBehavior", js.undefined)
    
    @scala.inline
    def setScrollMarginVarargs(value: ScrollMarginProperty[TLength]*): Self = this.set("scrollMargin", js.Array(value :_*))
    
    @scala.inline
    def setScrollMargin(value: ScrollMarginProperty[TLength] | js.Array[ScrollMarginProperty[TLength]]): Self = this.set("scrollMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollMargin: Self = this.set("scrollMargin", js.undefined)
    
    @scala.inline
    def setScrollMarginBlockVarargs(value: ScrollMarginBlockProperty[TLength]*): Self = this.set("scrollMarginBlock", js.Array(value :_*))
    
    @scala.inline
    def setScrollMarginBlock(value: ScrollMarginBlockProperty[TLength] | js.Array[ScrollMarginBlockProperty[TLength]]): Self = this.set("scrollMarginBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollMarginBlock: Self = this.set("scrollMarginBlock", js.undefined)
    
    @scala.inline
    def setScrollMarginBlockEndVarargs(value: ScrollMarginBlockEndProperty[TLength]*): Self = this.set("scrollMarginBlockEnd", js.Array(value :_*))
    
    @scala.inline
    def setScrollMarginBlockEnd(value: ScrollMarginBlockEndProperty[TLength] | js.Array[ScrollMarginBlockEndProperty[TLength]]): Self = this.set("scrollMarginBlockEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollMarginBlockEnd: Self = this.set("scrollMarginBlockEnd", js.undefined)
    
    @scala.inline
    def setScrollMarginBlockStartVarargs(value: ScrollMarginBlockStartProperty[TLength]*): Self = this.set("scrollMarginBlockStart", js.Array(value :_*))
    
    @scala.inline
    def setScrollMarginBlockStart(value: ScrollMarginBlockStartProperty[TLength] | js.Array[ScrollMarginBlockStartProperty[TLength]]): Self = this.set("scrollMarginBlockStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollMarginBlockStart: Self = this.set("scrollMarginBlockStart", js.undefined)
    
    @scala.inline
    def setScrollMarginBottomVarargs(value: ScrollMarginBottomProperty[TLength]*): Self = this.set("scrollMarginBottom", js.Array(value :_*))
    
    @scala.inline
    def setScrollMarginBottom(value: ScrollMarginBottomProperty[TLength] | js.Array[ScrollMarginBottomProperty[TLength]]): Self = this.set("scrollMarginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollMarginBottom: Self = this.set("scrollMarginBottom", js.undefined)
    
    @scala.inline
    def setScrollMarginInlineVarargs(value: ScrollMarginInlineProperty[TLength]*): Self = this.set("scrollMarginInline", js.Array(value :_*))
    
    @scala.inline
    def setScrollMarginInline(value: ScrollMarginInlineProperty[TLength] | js.Array[ScrollMarginInlineProperty[TLength]]): Self = this.set("scrollMarginInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollMarginInline: Self = this.set("scrollMarginInline", js.undefined)
    
    @scala.inline
    def setScrollMarginInlineEndVarargs(value: ScrollMarginInlineEndProperty[TLength]*): Self = this.set("scrollMarginInlineEnd", js.Array(value :_*))
    
    @scala.inline
    def setScrollMarginInlineEnd(value: ScrollMarginInlineEndProperty[TLength] | js.Array[ScrollMarginInlineEndProperty[TLength]]): Self = this.set("scrollMarginInlineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollMarginInlineEnd: Self = this.set("scrollMarginInlineEnd", js.undefined)
    
    @scala.inline
    def setScrollMarginInlineStartVarargs(value: ScrollMarginInlineStartProperty[TLength]*): Self = this.set("scrollMarginInlineStart", js.Array(value :_*))
    
    @scala.inline
    def setScrollMarginInlineStart(
      value: ScrollMarginInlineStartProperty[TLength] | js.Array[ScrollMarginInlineStartProperty[TLength]]
    ): Self = this.set("scrollMarginInlineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollMarginInlineStart: Self = this.set("scrollMarginInlineStart", js.undefined)
    
    @scala.inline
    def setScrollMarginLeftVarargs(value: ScrollMarginLeftProperty[TLength]*): Self = this.set("scrollMarginLeft", js.Array(value :_*))
    
    @scala.inline
    def setScrollMarginLeft(value: ScrollMarginLeftProperty[TLength] | js.Array[ScrollMarginLeftProperty[TLength]]): Self = this.set("scrollMarginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollMarginLeft: Self = this.set("scrollMarginLeft", js.undefined)
    
    @scala.inline
    def setScrollMarginRightVarargs(value: ScrollMarginRightProperty[TLength]*): Self = this.set("scrollMarginRight", js.Array(value :_*))
    
    @scala.inline
    def setScrollMarginRight(value: ScrollMarginRightProperty[TLength] | js.Array[ScrollMarginRightProperty[TLength]]): Self = this.set("scrollMarginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollMarginRight: Self = this.set("scrollMarginRight", js.undefined)
    
    @scala.inline
    def setScrollMarginTopVarargs(value: ScrollMarginTopProperty[TLength]*): Self = this.set("scrollMarginTop", js.Array(value :_*))
    
    @scala.inline
    def setScrollMarginTop(value: ScrollMarginTopProperty[TLength] | js.Array[ScrollMarginTopProperty[TLength]]): Self = this.set("scrollMarginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollMarginTop: Self = this.set("scrollMarginTop", js.undefined)
    
    @scala.inline
    def setScrollPaddingVarargs(value: ScrollPaddingProperty[TLength]*): Self = this.set("scrollPadding", js.Array(value :_*))
    
    @scala.inline
    def setScrollPadding(value: ScrollPaddingProperty[TLength] | js.Array[ScrollPaddingProperty[TLength]]): Self = this.set("scrollPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPadding: Self = this.set("scrollPadding", js.undefined)
    
    @scala.inline
    def setScrollPaddingBlockVarargs(value: ScrollPaddingBlockProperty[TLength]*): Self = this.set("scrollPaddingBlock", js.Array(value :_*))
    
    @scala.inline
    def setScrollPaddingBlock(value: ScrollPaddingBlockProperty[TLength] | js.Array[ScrollPaddingBlockProperty[TLength]]): Self = this.set("scrollPaddingBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPaddingBlock: Self = this.set("scrollPaddingBlock", js.undefined)
    
    @scala.inline
    def setScrollPaddingBlockEndVarargs(value: ScrollPaddingBlockEndProperty[TLength]*): Self = this.set("scrollPaddingBlockEnd", js.Array(value :_*))
    
    @scala.inline
    def setScrollPaddingBlockEnd(value: ScrollPaddingBlockEndProperty[TLength] | js.Array[ScrollPaddingBlockEndProperty[TLength]]): Self = this.set("scrollPaddingBlockEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPaddingBlockEnd: Self = this.set("scrollPaddingBlockEnd", js.undefined)
    
    @scala.inline
    def setScrollPaddingBlockStartVarargs(value: ScrollPaddingBlockStartProperty[TLength]*): Self = this.set("scrollPaddingBlockStart", js.Array(value :_*))
    
    @scala.inline
    def setScrollPaddingBlockStart(
      value: ScrollPaddingBlockStartProperty[TLength] | js.Array[ScrollPaddingBlockStartProperty[TLength]]
    ): Self = this.set("scrollPaddingBlockStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPaddingBlockStart: Self = this.set("scrollPaddingBlockStart", js.undefined)
    
    @scala.inline
    def setScrollPaddingBottomVarargs(value: ScrollPaddingBottomProperty[TLength]*): Self = this.set("scrollPaddingBottom", js.Array(value :_*))
    
    @scala.inline
    def setScrollPaddingBottom(value: ScrollPaddingBottomProperty[TLength] | js.Array[ScrollPaddingBottomProperty[TLength]]): Self = this.set("scrollPaddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPaddingBottom: Self = this.set("scrollPaddingBottom", js.undefined)
    
    @scala.inline
    def setScrollPaddingInlineVarargs(value: ScrollPaddingInlineProperty[TLength]*): Self = this.set("scrollPaddingInline", js.Array(value :_*))
    
    @scala.inline
    def setScrollPaddingInline(value: ScrollPaddingInlineProperty[TLength] | js.Array[ScrollPaddingInlineProperty[TLength]]): Self = this.set("scrollPaddingInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPaddingInline: Self = this.set("scrollPaddingInline", js.undefined)
    
    @scala.inline
    def setScrollPaddingInlineEndVarargs(value: ScrollPaddingInlineEndProperty[TLength]*): Self = this.set("scrollPaddingInlineEnd", js.Array(value :_*))
    
    @scala.inline
    def setScrollPaddingInlineEnd(value: ScrollPaddingInlineEndProperty[TLength] | js.Array[ScrollPaddingInlineEndProperty[TLength]]): Self = this.set("scrollPaddingInlineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPaddingInlineEnd: Self = this.set("scrollPaddingInlineEnd", js.undefined)
    
    @scala.inline
    def setScrollPaddingInlineStartVarargs(value: ScrollPaddingInlineStartProperty[TLength]*): Self = this.set("scrollPaddingInlineStart", js.Array(value :_*))
    
    @scala.inline
    def setScrollPaddingInlineStart(
      value: ScrollPaddingInlineStartProperty[TLength] | js.Array[ScrollPaddingInlineStartProperty[TLength]]
    ): Self = this.set("scrollPaddingInlineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPaddingInlineStart: Self = this.set("scrollPaddingInlineStart", js.undefined)
    
    @scala.inline
    def setScrollPaddingLeftVarargs(value: ScrollPaddingLeftProperty[TLength]*): Self = this.set("scrollPaddingLeft", js.Array(value :_*))
    
    @scala.inline
    def setScrollPaddingLeft(value: ScrollPaddingLeftProperty[TLength] | js.Array[ScrollPaddingLeftProperty[TLength]]): Self = this.set("scrollPaddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPaddingLeft: Self = this.set("scrollPaddingLeft", js.undefined)
    
    @scala.inline
    def setScrollPaddingRightVarargs(value: ScrollPaddingRightProperty[TLength]*): Self = this.set("scrollPaddingRight", js.Array(value :_*))
    
    @scala.inline
    def setScrollPaddingRight(value: ScrollPaddingRightProperty[TLength] | js.Array[ScrollPaddingRightProperty[TLength]]): Self = this.set("scrollPaddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPaddingRight: Self = this.set("scrollPaddingRight", js.undefined)
    
    @scala.inline
    def setScrollPaddingTopVarargs(value: ScrollPaddingTopProperty[TLength]*): Self = this.set("scrollPaddingTop", js.Array(value :_*))
    
    @scala.inline
    def setScrollPaddingTop(value: ScrollPaddingTopProperty[TLength] | js.Array[ScrollPaddingTopProperty[TLength]]): Self = this.set("scrollPaddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPaddingTop: Self = this.set("scrollPaddingTop", js.undefined)
    
    @scala.inline
    def setScrollSnapAlignVarargs(value: ScrollSnapAlignProperty*): Self = this.set("scrollSnapAlign", js.Array(value :_*))
    
    @scala.inline
    def setScrollSnapAlign(value: ScrollSnapAlignProperty | js.Array[ScrollSnapAlignProperty]): Self = this.set("scrollSnapAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSnapAlign: Self = this.set("scrollSnapAlign", js.undefined)
    
    @scala.inline
    def setScrollSnapMarginVarargs(value: ScrollMarginProperty[TLength]*): Self = this.set("scrollSnapMargin", js.Array(value :_*))
    
    @scala.inline
    def setScrollSnapMargin(value: ScrollMarginProperty[TLength] | js.Array[ScrollMarginProperty[TLength]]): Self = this.set("scrollSnapMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSnapMargin: Self = this.set("scrollSnapMargin", js.undefined)
    
    @scala.inline
    def setScrollSnapMarginBottomVarargs(value: ScrollMarginBottomProperty[TLength]*): Self = this.set("scrollSnapMarginBottom", js.Array(value :_*))
    
    @scala.inline
    def setScrollSnapMarginBottom(value: ScrollMarginBottomProperty[TLength] | js.Array[ScrollMarginBottomProperty[TLength]]): Self = this.set("scrollSnapMarginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSnapMarginBottom: Self = this.set("scrollSnapMarginBottom", js.undefined)
    
    @scala.inline
    def setScrollSnapMarginLeftVarargs(value: ScrollMarginLeftProperty[TLength]*): Self = this.set("scrollSnapMarginLeft", js.Array(value :_*))
    
    @scala.inline
    def setScrollSnapMarginLeft(value: ScrollMarginLeftProperty[TLength] | js.Array[ScrollMarginLeftProperty[TLength]]): Self = this.set("scrollSnapMarginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSnapMarginLeft: Self = this.set("scrollSnapMarginLeft", js.undefined)
    
    @scala.inline
    def setScrollSnapMarginRightVarargs(value: ScrollMarginRightProperty[TLength]*): Self = this.set("scrollSnapMarginRight", js.Array(value :_*))
    
    @scala.inline
    def setScrollSnapMarginRight(value: ScrollMarginRightProperty[TLength] | js.Array[ScrollMarginRightProperty[TLength]]): Self = this.set("scrollSnapMarginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSnapMarginRight: Self = this.set("scrollSnapMarginRight", js.undefined)
    
    @scala.inline
    def setScrollSnapMarginTopVarargs(value: ScrollMarginTopProperty[TLength]*): Self = this.set("scrollSnapMarginTop", js.Array(value :_*))
    
    @scala.inline
    def setScrollSnapMarginTop(value: ScrollMarginTopProperty[TLength] | js.Array[ScrollMarginTopProperty[TLength]]): Self = this.set("scrollSnapMarginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSnapMarginTop: Self = this.set("scrollSnapMarginTop", js.undefined)
    
    @scala.inline
    def setScrollSnapStopVarargs(value: ScrollSnapStopProperty*): Self = this.set("scrollSnapStop", js.Array(value :_*))
    
    @scala.inline
    def setScrollSnapStop(value: ScrollSnapStopProperty | js.Array[ScrollSnapStopProperty]): Self = this.set("scrollSnapStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSnapStop: Self = this.set("scrollSnapStop", js.undefined)
    
    @scala.inline
    def setScrollSnapTypeVarargs(value: ScrollSnapTypeProperty*): Self = this.set("scrollSnapType", js.Array(value :_*))
    
    @scala.inline
    def setScrollSnapType(value: ScrollSnapTypeProperty | js.Array[ScrollSnapTypeProperty]): Self = this.set("scrollSnapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSnapType: Self = this.set("scrollSnapType", js.undefined)
    
    @scala.inline
    def setScrollbarColorVarargs(value: ScrollbarColorProperty*): Self = this.set("scrollbarColor", js.Array(value :_*))
    
    @scala.inline
    def setScrollbarColor(value: ScrollbarColorProperty | js.Array[ScrollbarColorProperty]): Self = this.set("scrollbarColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollbarColor: Self = this.set("scrollbarColor", js.undefined)
    
    @scala.inline
    def setScrollbarWidthVarargs(value: ScrollbarWidthProperty*): Self = this.set("scrollbarWidth", js.Array(value :_*))
    
    @scala.inline
    def setScrollbarWidth(value: ScrollbarWidthProperty | js.Array[ScrollbarWidthProperty]): Self = this.set("scrollbarWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollbarWidth: Self = this.set("scrollbarWidth", js.undefined)
    
    @scala.inline
    def setShapeImageThresholdVarargs(value: ShapeImageThresholdProperty*): Self = this.set("shapeImageThreshold", js.Array(value :_*))
    
    @scala.inline
    def setShapeImageThreshold(value: ShapeImageThresholdProperty | js.Array[ShapeImageThresholdProperty]): Self = this.set("shapeImageThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeImageThreshold: Self = this.set("shapeImageThreshold", js.undefined)
    
    @scala.inline
    def setShapeMarginVarargs(value: ShapeMarginProperty[TLength]*): Self = this.set("shapeMargin", js.Array(value :_*))
    
    @scala.inline
    def setShapeMargin(value: ShapeMarginProperty[TLength] | js.Array[ShapeMarginProperty[TLength]]): Self = this.set("shapeMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeMargin: Self = this.set("shapeMargin", js.undefined)
    
    @scala.inline
    def setShapeOutsideVarargs(value: ShapeOutsideProperty*): Self = this.set("shapeOutside", js.Array(value :_*))
    
    @scala.inline
    def setShapeOutside(value: ShapeOutsideProperty | js.Array[ShapeOutsideProperty]): Self = this.set("shapeOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeOutside: Self = this.set("shapeOutside", js.undefined)
    
    @scala.inline
    def setTabSizeVarargs(value: TabSizeProperty[TLength]*): Self = this.set("tabSize", js.Array(value :_*))
    
    @scala.inline
    def setTabSize(value: TabSizeProperty[TLength] | js.Array[TabSizeProperty[TLength]]): Self = this.set("tabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabSize: Self = this.set("tabSize", js.undefined)
    
    @scala.inline
    def setTableLayoutVarargs(value: TableLayoutProperty*): Self = this.set("tableLayout", js.Array(value :_*))
    
    @scala.inline
    def setTableLayout(value: TableLayoutProperty | js.Array[TableLayoutProperty]): Self = this.set("tableLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableLayout: Self = this.set("tableLayout", js.undefined)
    
    @scala.inline
    def setTextAlignVarargs(value: TextAlignProperty*): Self = this.set("textAlign", js.Array(value :_*))
    
    @scala.inline
    def setTextAlign(value: TextAlignProperty | js.Array[TextAlignProperty]): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setTextAlignLastVarargs(value: TextAlignLastProperty*): Self = this.set("textAlignLast", js.Array(value :_*))
    
    @scala.inline
    def setTextAlignLast(value: TextAlignLastProperty | js.Array[TextAlignLastProperty]): Self = this.set("textAlignLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlignLast: Self = this.set("textAlignLast", js.undefined)
    
    @scala.inline
    def setTextCombineUprightVarargs(value: TextCombineUprightProperty*): Self = this.set("textCombineUpright", js.Array(value :_*))
    
    @scala.inline
    def setTextCombineUpright(value: TextCombineUprightProperty | js.Array[TextCombineUprightProperty]): Self = this.set("textCombineUpright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextCombineUpright: Self = this.set("textCombineUpright", js.undefined)
    
    @scala.inline
    def setTextDecorationColorVarargs(value: TextDecorationColorProperty*): Self = this.set("textDecorationColor", js.Array(value :_*))
    
    @scala.inline
    def setTextDecorationColor(value: TextDecorationColorProperty | js.Array[TextDecorationColorProperty]): Self = this.set("textDecorationColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDecorationColor: Self = this.set("textDecorationColor", js.undefined)
    
    @scala.inline
    def setTextDecorationLineVarargs(value: TextDecorationLineProperty*): Self = this.set("textDecorationLine", js.Array(value :_*))
    
    @scala.inline
    def setTextDecorationLine(value: TextDecorationLineProperty | js.Array[TextDecorationLineProperty]): Self = this.set("textDecorationLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDecorationLine: Self = this.set("textDecorationLine", js.undefined)
    
    @scala.inline
    def setTextDecorationSkipVarargs(value: TextDecorationSkipProperty*): Self = this.set("textDecorationSkip", js.Array(value :_*))
    
    @scala.inline
    def setTextDecorationSkip(value: TextDecorationSkipProperty | js.Array[TextDecorationSkipProperty]): Self = this.set("textDecorationSkip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDecorationSkip: Self = this.set("textDecorationSkip", js.undefined)
    
    @scala.inline
    def setTextDecorationSkipInkVarargs(value: TextDecorationSkipInkProperty*): Self = this.set("textDecorationSkipInk", js.Array(value :_*))
    
    @scala.inline
    def setTextDecorationSkipInk(value: TextDecorationSkipInkProperty | js.Array[TextDecorationSkipInkProperty]): Self = this.set("textDecorationSkipInk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDecorationSkipInk: Self = this.set("textDecorationSkipInk", js.undefined)
    
    @scala.inline
    def setTextDecorationStyleVarargs(value: TextDecorationStyleProperty*): Self = this.set("textDecorationStyle", js.Array(value :_*))
    
    @scala.inline
    def setTextDecorationStyle(value: TextDecorationStyleProperty | js.Array[TextDecorationStyleProperty]): Self = this.set("textDecorationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDecorationStyle: Self = this.set("textDecorationStyle", js.undefined)
    
    @scala.inline
    def setTextDecorationThicknessVarargs(value: TextDecorationThicknessProperty[TLength]*): Self = this.set("textDecorationThickness", js.Array(value :_*))
    
    @scala.inline
    def setTextDecorationThickness(
      value: TextDecorationThicknessProperty[TLength] | js.Array[TextDecorationThicknessProperty[TLength]]
    ): Self = this.set("textDecorationThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDecorationThickness: Self = this.set("textDecorationThickness", js.undefined)
    
    @scala.inline
    def setTextDecorationWidthVarargs(value: TextDecorationThicknessProperty[TLength]*): Self = this.set("textDecorationWidth", js.Array(value :_*))
    
    @scala.inline
    def setTextDecorationWidth(
      value: TextDecorationThicknessProperty[TLength] | js.Array[TextDecorationThicknessProperty[TLength]]
    ): Self = this.set("textDecorationWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDecorationWidth: Self = this.set("textDecorationWidth", js.undefined)
    
    @scala.inline
    def setTextEmphasisColorVarargs(value: TextEmphasisColorProperty*): Self = this.set("textEmphasisColor", js.Array(value :_*))
    
    @scala.inline
    def setTextEmphasisColor(value: TextEmphasisColorProperty | js.Array[TextEmphasisColorProperty]): Self = this.set("textEmphasisColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextEmphasisColor: Self = this.set("textEmphasisColor", js.undefined)
    
    @scala.inline
    def setTextEmphasisPositionVarargs(value: GlobalsString*): Self = this.set("textEmphasisPosition", js.Array(value :_*))
    
    @scala.inline
    def setTextEmphasisPosition(value: GlobalsString | js.Array[GlobalsString]): Self = this.set("textEmphasisPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextEmphasisPosition: Self = this.set("textEmphasisPosition", js.undefined)
    
    @scala.inline
    def setTextEmphasisStyleVarargs(value: TextEmphasisStyleProperty*): Self = this.set("textEmphasisStyle", js.Array(value :_*))
    
    @scala.inline
    def setTextEmphasisStyle(value: TextEmphasisStyleProperty | js.Array[TextEmphasisStyleProperty]): Self = this.set("textEmphasisStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextEmphasisStyle: Self = this.set("textEmphasisStyle", js.undefined)
    
    @scala.inline
    def setTextIndentVarargs(value: TextIndentProperty[TLength]*): Self = this.set("textIndent", js.Array(value :_*))
    
    @scala.inline
    def setTextIndent(value: TextIndentProperty[TLength] | js.Array[TextIndentProperty[TLength]]): Self = this.set("textIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextIndent: Self = this.set("textIndent", js.undefined)
    
    @scala.inline
    def setTextJustifyVarargs(value: TextJustifyProperty*): Self = this.set("textJustify", js.Array(value :_*))
    
    @scala.inline
    def setTextJustify(value: TextJustifyProperty | js.Array[TextJustifyProperty]): Self = this.set("textJustify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextJustify: Self = this.set("textJustify", js.undefined)
    
    @scala.inline
    def setTextOrientationVarargs(value: TextOrientationProperty*): Self = this.set("textOrientation", js.Array(value :_*))
    
    @scala.inline
    def setTextOrientation(value: TextOrientationProperty | js.Array[TextOrientationProperty]): Self = this.set("textOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextOrientation: Self = this.set("textOrientation", js.undefined)
    
    @scala.inline
    def setTextOverflowVarargs(value: TextOverflowProperty*): Self = this.set("textOverflow", js.Array(value :_*))
    
    @scala.inline
    def setTextOverflow(value: TextOverflowProperty | js.Array[TextOverflowProperty]): Self = this.set("textOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextOverflow: Self = this.set("textOverflow", js.undefined)
    
    @scala.inline
    def setTextRenderingVarargs(value: TextRenderingProperty*): Self = this.set("textRendering", js.Array(value :_*))
    
    @scala.inline
    def setTextRendering(value: TextRenderingProperty | js.Array[TextRenderingProperty]): Self = this.set("textRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextRendering: Self = this.set("textRendering", js.undefined)
    
    @scala.inline
    def setTextShadowVarargs(value: TextShadowProperty*): Self = this.set("textShadow", js.Array(value :_*))
    
    @scala.inline
    def setTextShadow(value: TextShadowProperty | js.Array[TextShadowProperty]): Self = this.set("textShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextShadow: Self = this.set("textShadow", js.undefined)
    
    @scala.inline
    def setTextSizeAdjustVarargs(value: TextSizeAdjustProperty*): Self = this.set("textSizeAdjust", js.Array(value :_*))
    
    @scala.inline
    def setTextSizeAdjust(value: TextSizeAdjustProperty | js.Array[TextSizeAdjustProperty]): Self = this.set("textSizeAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextSizeAdjust: Self = this.set("textSizeAdjust", js.undefined)
    
    @scala.inline
    def setTextTransformVarargs(value: TextTransformProperty*): Self = this.set("textTransform", js.Array(value :_*))
    
    @scala.inline
    def setTextTransform(value: TextTransformProperty | js.Array[TextTransformProperty]): Self = this.set("textTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextTransform: Self = this.set("textTransform", js.undefined)
    
    @scala.inline
    def setTextUnderlineOffsetVarargs(value: TextUnderlineOffsetProperty[TLength]*): Self = this.set("textUnderlineOffset", js.Array(value :_*))
    
    @scala.inline
    def setTextUnderlineOffset(value: TextUnderlineOffsetProperty[TLength] | js.Array[TextUnderlineOffsetProperty[TLength]]): Self = this.set("textUnderlineOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextUnderlineOffset: Self = this.set("textUnderlineOffset", js.undefined)
    
    @scala.inline
    def setTextUnderlinePositionVarargs(value: TextUnderlinePositionProperty*): Self = this.set("textUnderlinePosition", js.Array(value :_*))
    
    @scala.inline
    def setTextUnderlinePosition(value: TextUnderlinePositionProperty | js.Array[TextUnderlinePositionProperty]): Self = this.set("textUnderlinePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextUnderlinePosition: Self = this.set("textUnderlinePosition", js.undefined)
    
    @scala.inline
    def setTopVarargs(value: TopProperty[TLength]*): Self = this.set("top", js.Array(value :_*))
    
    @scala.inline
    def setTop(value: TopProperty[TLength] | js.Array[TopProperty[TLength]]): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setTouchActionVarargs(value: TouchActionProperty*): Self = this.set("touchAction", js.Array(value :_*))
    
    @scala.inline
    def setTouchAction(value: TouchActionProperty | js.Array[TouchActionProperty]): Self = this.set("touchAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchAction: Self = this.set("touchAction", js.undefined)
    
    @scala.inline
    def setTransformVarargs(value: TransformProperty*): Self = this.set("transform", js.Array(value :_*))
    
    @scala.inline
    def setTransform(value: TransformProperty | js.Array[TransformProperty]): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setTransformBoxVarargs(value: TransformBoxProperty*): Self = this.set("transformBox", js.Array(value :_*))
    
    @scala.inline
    def setTransformBox(value: TransformBoxProperty | js.Array[TransformBoxProperty]): Self = this.set("transformBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformBox: Self = this.set("transformBox", js.undefined)
    
    @scala.inline
    def setTransformOriginVarargs(value: TransformOriginProperty[TLength]*): Self = this.set("transformOrigin", js.Array(value :_*))
    
    @scala.inline
    def setTransformOrigin(value: TransformOriginProperty[TLength] | js.Array[TransformOriginProperty[TLength]]): Self = this.set("transformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformOrigin: Self = this.set("transformOrigin", js.undefined)
    
    @scala.inline
    def setTransformStyleVarargs(value: TransformStyleProperty*): Self = this.set("transformStyle", js.Array(value :_*))
    
    @scala.inline
    def setTransformStyle(value: TransformStyleProperty | js.Array[TransformStyleProperty]): Self = this.set("transformStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformStyle: Self = this.set("transformStyle", js.undefined)
    
    @scala.inline
    def setTransitionDelayVarargs(value: GlobalsString*): Self = this.set("transitionDelay", js.Array(value :_*))
    
    @scala.inline
    def setTransitionDelay(value: GlobalsString | js.Array[GlobalsString]): Self = this.set("transitionDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDelay: Self = this.set("transitionDelay", js.undefined)
    
    @scala.inline
    def setTransitionDurationVarargs(value: GlobalsString*): Self = this.set("transitionDuration", js.Array(value :_*))
    
    @scala.inline
    def setTransitionDuration(value: GlobalsString | js.Array[GlobalsString]): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    
    @scala.inline
    def setTransitionPropertyVarargs(value: TransitionPropertyProperty*): Self = this.set("transitionProperty", js.Array(value :_*))
    
    @scala.inline
    def setTransitionProperty(value: TransitionPropertyProperty | js.Array[TransitionPropertyProperty]): Self = this.set("transitionProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionProperty: Self = this.set("transitionProperty", js.undefined)
    
    @scala.inline
    def setTransitionTimingFunctionVarargs(value: TransitionTimingFunctionProperty*): Self = this.set("transitionTimingFunction", js.Array(value :_*))
    
    @scala.inline
    def setTransitionTimingFunction(value: TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]): Self = this.set("transitionTimingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionTimingFunction: Self = this.set("transitionTimingFunction", js.undefined)
    
    @scala.inline
    def setTranslateVarargs(value: TranslateProperty[TLength]*): Self = this.set("translate", js.Array(value :_*))
    
    @scala.inline
    def setTranslate(value: TranslateProperty[TLength] | js.Array[TranslateProperty[TLength]]): Self = this.set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    
    @scala.inline
    def setUnicodeBidiVarargs(value: UnicodeBidiProperty*): Self = this.set("unicodeBidi", js.Array(value :_*))
    
    @scala.inline
    def setUnicodeBidi(value: UnicodeBidiProperty | js.Array[UnicodeBidiProperty]): Self = this.set("unicodeBidi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnicodeBidi: Self = this.set("unicodeBidi", js.undefined)
    
    @scala.inline
    def setUserSelectVarargs(value: UserSelectProperty*): Self = this.set("userSelect", js.Array(value :_*))
    
    @scala.inline
    def setUserSelect(value: UserSelectProperty | js.Array[UserSelectProperty]): Self = this.set("userSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserSelect: Self = this.set("userSelect", js.undefined)
    
    @scala.inline
    def setVerticalAlignVarargs(value: VerticalAlignProperty[TLength]*): Self = this.set("verticalAlign", js.Array(value :_*))
    
    @scala.inline
    def setVerticalAlign(value: VerticalAlignProperty[TLength] | js.Array[VerticalAlignProperty[TLength]]): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    
    @scala.inline
    def setVisibilityVarargs(value: VisibilityProperty*): Self = this.set("visibility", js.Array(value :_*))
    
    @scala.inline
    def setVisibility(value: VisibilityProperty | js.Array[VisibilityProperty]): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
    
    @scala.inline
    def setWhiteSpaceVarargs(value: WhiteSpaceProperty*): Self = this.set("whiteSpace", js.Array(value :_*))
    
    @scala.inline
    def setWhiteSpace(value: WhiteSpaceProperty | js.Array[WhiteSpaceProperty]): Self = this.set("whiteSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhiteSpace: Self = this.set("whiteSpace", js.undefined)
    
    @scala.inline
    def setWidowsVarargs(value: GlobalsNumber*): Self = this.set("widows", js.Array(value :_*))
    
    @scala.inline
    def setWidows(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("widows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidows: Self = this.set("widows", js.undefined)
    
    @scala.inline
    def setWidthVarargs(value: WidthProperty[TLength]*): Self = this.set("width", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: WidthProperty[TLength] | js.Array[WidthProperty[TLength]]): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWillChangeVarargs(value: WillChangeProperty*): Self = this.set("willChange", js.Array(value :_*))
    
    @scala.inline
    def setWillChange(value: WillChangeProperty | js.Array[WillChangeProperty]): Self = this.set("willChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWillChange: Self = this.set("willChange", js.undefined)
    
    @scala.inline
    def setWordBreakVarargs(value: WordBreakProperty*): Self = this.set("wordBreak", js.Array(value :_*))
    
    @scala.inline
    def setWordBreak(value: WordBreakProperty | js.Array[WordBreakProperty]): Self = this.set("wordBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordBreak: Self = this.set("wordBreak", js.undefined)
    
    @scala.inline
    def setWordSpacingVarargs(value: WordSpacingProperty[TLength]*): Self = this.set("wordSpacing", js.Array(value :_*))
    
    @scala.inline
    def setWordSpacing(value: WordSpacingProperty[TLength] | js.Array[WordSpacingProperty[TLength]]): Self = this.set("wordSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordSpacing: Self = this.set("wordSpacing", js.undefined)
    
    @scala.inline
    def setWordWrapVarargs(value: WordWrapProperty*): Self = this.set("wordWrap", js.Array(value :_*))
    
    @scala.inline
    def setWordWrap(value: WordWrapProperty | js.Array[WordWrapProperty]): Self = this.set("wordWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordWrap: Self = this.set("wordWrap", js.undefined)
    
    @scala.inline
    def setWritingModeVarargs(value: WritingModeProperty*): Self = this.set("writingMode", js.Array(value :_*))
    
    @scala.inline
    def setWritingMode(value: WritingModeProperty | js.Array[WritingModeProperty]): Self = this.set("writingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWritingMode: Self = this.set("writingMode", js.undefined)
    
    @scala.inline
    def setZIndexVarargs(value: ZIndexProperty*): Self = this.set("zIndex", js.Array(value :_*))
    
    @scala.inline
    def setZIndex(value: ZIndexProperty | js.Array[ZIndexProperty]): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
    
    @scala.inline
    def setZoomVarargs(value: ZoomProperty*): Self = this.set("zoom", js.Array(value :_*))
    
    @scala.inline
    def setZoom(value: ZoomProperty | js.Array[ZoomProperty]): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
