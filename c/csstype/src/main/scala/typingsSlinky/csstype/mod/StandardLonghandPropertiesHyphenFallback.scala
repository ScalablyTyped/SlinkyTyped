package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardLonghandPropertiesHyphenFallback[TLength] extends js.Object {
  /**
    * The CSS **`align-content`** property sets how the browser distributes space between and around content items along the cross-axis of a flexbox container, and the main-axis of a grid container.
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
  var `align-content`: js.UndefOr[AlignContentProperty | js.Array[AlignContentProperty]] = js.native
  /**
    * The CSS **`align-items`** property sets the `align-self` value on all direct children as a group. The align-self property sets the alignment of an item within its containing block. In Flexbox it controls the alignment of items on the Cross Axis, in Grid Layout it controls the alignment of items on the Block Axis within their grid area.
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
  var `align-items`: js.UndefOr[AlignItemsProperty | js.Array[AlignItemsProperty]] = js.native
  /**
    * The **`align-self`** CSS property aligns flex items of the current flex line overriding the `align-items` value. If any of the item's cross-axis margin is set to `auto`, then `align-self` is ignored. In Grid layout `align-self` aligns the item inside the grid area.
    *
    * **Initial value**: `auto`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * |  Chrome  | Firefox | Safari |  Edge  |   IE   |
    * | :------: | :-----: | :----: | :----: | :----: |
    * |  **36**  | **20**  | **9**  | **12** | **11** |
    * | 21 _-x-_ |         |        |        |        |
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
  var `align-self`: js.UndefOr[AlignSelfProperty | js.Array[AlignSelfProperty]] = js.native
  /**
    * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
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
  var `animation-delay`: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  /**
    * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
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
  var `animation-direction`: js.UndefOr[AnimationDirectionProperty | js.Array[AnimationDirectionProperty]] = js.native
  /**
    * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
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
  var `animation-duration`: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  /**
    * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
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
  var `animation-fill-mode`: js.UndefOr[AnimationFillModeProperty | js.Array[AnimationFillModeProperty]] = js.native
  /**
    * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
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
  var `animation-iteration-count`: js.UndefOr[AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]] = js.native
  /**
    * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
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
  var `animation-name`: js.UndefOr[AnimationNameProperty | js.Array[AnimationNameProperty]] = js.native
  /**
    * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
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
  var `animation-play-state`: js.UndefOr[AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]] = js.native
  /**
    * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
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
  var `animation-timing-function`: js.UndefOr[AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]] = js.native
  /**
    * The **`-moz-appearance`** CSS property is used in Gecko (Firefox) to display an element using platform-native styling based on the operating system's theme.
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
    * The **`backdrop-filter`** CSS property lets you apply graphical effects such as blurring or color shifting to the area behind an element. Because it applies to everything _behind_ the element, to see the effect you must make the element or its background at least partially transparent.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |   Safari    |  Edge  | IE  |
    * | :----: | :-----: | :---------: | :----: | :-: |
    * | **76** |   No    | **9** _-x-_ | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/backdrop-filter
    */
  var `backdrop-filter`: js.UndefOr[BackdropFilterProperty | js.Array[BackdropFilterProperty]] = js.native
  /**
    * The **`backface-visibility`** CSS property sets whether the back face of an element is visible when turned towards the user.
    *
    * **Initial value**: `visible`
    *
    * |  Chrome  | Firefox  | Safari |  Edge  |   IE   |
    * | :------: | :------: | :----: | :----: | :----: |
    * |  **36**  |  **16**  |  Yes   | **12** | **10** |
    * | 12 _-x-_ | 10 _-x-_ |        |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/backface-visibility
    */
  var `backface-visibility`: js.UndefOr[BackfaceVisibilityProperty | js.Array[BackfaceVisibilityProperty]] = js.native
  /**
    * The **`background-attachment`** CSS property sets whether a background image's position is fixed within the viewport, or scrolls with its containing block.
    *
    * **Initial value**: `scroll`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-attachment
    */
  var `background-attachment`: js.UndefOr[BackgroundAttachmentProperty | js.Array[BackgroundAttachmentProperty]] = js.native
  /**
    * The **`background-blend-mode`** CSS property sets how an element's background images should blend with each other and with the element's background color.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **35** | **30**  | **8**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-blend-mode
    */
  var `background-blend-mode`: js.UndefOr[BackgroundBlendModeProperty | js.Array[BackgroundBlendModeProperty]] = js.native
  /**
    * The **`background-clip`** CSS property sets whether an element's background `<color>` or `<image>` extends underneath its border.
    *
    * **Initial value**: `border-box`
    *
    * | Chrome | Firefox |   Safari    |  Edge  |  IE   |
    * | :----: | :-----: | :---------: | :----: | :---: |
    * | **1**  |  **4**  | **3** _-x-_ | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-clip
    */
  var `background-clip`: js.UndefOr[BackgroundClipProperty | js.Array[BackgroundClipProperty]] = js.native
  /**
    * The **`background-color`** CSS property sets the background color of an element.
    *
    * **Initial value**: `transparent`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-color
    */
  var `background-color`: js.UndefOr[BackgroundColorProperty | js.Array[BackgroundColorProperty]] = js.native
  /**
    * The **`background-image`** CSS property sets one or more background images on an element.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-image
    */
  var `background-image`: js.UndefOr[BackgroundImageProperty | js.Array[BackgroundImageProperty]] = js.native
  /**
    * The **`background-origin`** CSS property sets the _background positioning area_. In other words, it sets the origin position of an image set with the `background-image` property.
    *
    * **Initial value**: `padding-box`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **4**  | **3**  | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-origin
    */
  var `background-origin`: js.UndefOr[BackgroundOriginProperty | js.Array[BackgroundOriginProperty]] = js.native
  /**
    * The **`background-position`** CSS property sets the initial position for each background image. The position is relative to the position layer set by `background-origin`.
    *
    * **Initial value**: `0% 0%`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-position
    */
  var `background-position`: js.UndefOr[
    BackgroundPositionProperty[TLength] | js.Array[BackgroundPositionProperty[TLength]]
  ] = js.native
  /**
    * The **`background-position-x`** CSS property sets the initial horizontal position for each background image. The position is relative to the position layer set by `background-origin`.
    *
    * **Initial value**: `left`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  | **49**  | **1**  | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-position-x
    */
  var `background-position-x`: js.UndefOr[
    BackgroundPositionXProperty[TLength] | js.Array[BackgroundPositionXProperty[TLength]]
  ] = js.native
  /**
    * The **`background-position-y`** CSS property sets the initial vertical position, relative to the background position layer defined by `background-origin`, for each defined background image.
    *
    * **Initial value**: `top`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  | **49**  | **1**  | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-position-y
    */
  var `background-position-y`: js.UndefOr[
    BackgroundPositionYProperty[TLength] | js.Array[BackgroundPositionYProperty[TLength]]
  ] = js.native
  /**
    * The **`background-repeat`** CSS property sets how background images are repeated. A background image can be repeated along the horizontal and vertical axes, or not repeated at all.
    *
    * **Initial value**: `repeat`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-repeat
    */
  var `background-repeat`: js.UndefOr[BackgroundRepeatProperty | js.Array[BackgroundRepeatProperty]] = js.native
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Initial value**: `auto auto`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **3**  |  **4**  | **4.1** | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-size
    */
  var `background-size`: js.UndefOr[BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]] = js.native
  /** **Initial value**: `clip` */
  var `block-overflow`: js.UndefOr[BlockOverflowProperty | js.Array[BlockOverflowProperty]] = js.native
  /**
    * The **`block-size`** CSS property defines the horizontal or vertical size of an element's block, depending on its writing mode. It corresponds to either the `width` or the `height` property, depending on the value of `writing-mode`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/block-size
    */
  var `block-size`: js.UndefOr[BlockSizeProperty[TLength] | js.Array[BlockSizeProperty[TLength]]] = js.native
  /**
    * The **`border-block-color`** CSS property defines the color of the logical block borders of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color` and `border-bottom-color`, or `border-right-color` and `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-color
    */
  var `border-block-color`: js.UndefOr[BorderBlockColorProperty | js.Array[BorderBlockColorProperty]] = js.native
  /**
    * The **`border-block-end-color`** CSS property defines the color of the logical block-end border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end-color
    */
  var `border-block-end-color`: js.UndefOr[BorderBlockEndColorProperty | js.Array[BorderBlockEndColorProperty]] = js.native
  /**
    * The **`border-block-end-style`** CSS property defines the style of the logical block end border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end-style
    */
  var `border-block-end-style`: js.UndefOr[BorderBlockEndStyleProperty | js.Array[BorderBlockEndStyleProperty]] = js.native
  /**
    * The **`border-block-end-width`** CSS property defines the width of the logical block-end border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end-width
    */
  var `border-block-end-width`: js.UndefOr[
    BorderBlockEndWidthProperty[TLength] | js.Array[BorderBlockEndWidthProperty[TLength]]
  ] = js.native
  /**
    * The **`border-block-start-color`** CSS property defines the color of the logical block-start border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start-color
    */
  var `border-block-start-color`: js.UndefOr[BorderBlockStartColorProperty | js.Array[BorderBlockStartColorProperty]] = js.native
  /**
    * The **`border-block-start-style`** CSS property defines the style of the logical block start border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start-style
    */
  var `border-block-start-style`: js.UndefOr[BorderBlockStartStyleProperty | js.Array[BorderBlockStartStyleProperty]] = js.native
  /**
    * The **`border-block-start-width`** CSS property defines the width of the logical block-start border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start-width
    */
  var `border-block-start-width`: js.UndefOr[
    BorderBlockStartWidthProperty[TLength] | js.Array[BorderBlockStartWidthProperty[TLength]]
  ] = js.native
  /**
    * The **`border-block-style`** CSS property defines the style of the logical block borders of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style` and `border-bottom-style`, or `border-left-style` and `border-right-style` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-style
    */
  var `border-block-style`: js.UndefOr[BorderBlockStyleProperty | js.Array[BorderBlockStyleProperty]] = js.native
  /**
    * The **`border-block-width`** CSS property defines the width of the logical block borders of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width` and `border-bottom-width`, or `border-left-width`, and `border-right-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-width
    */
  var `border-block-width`: js.UndefOr[BorderBlockWidthProperty[TLength] | js.Array[BorderBlockWidthProperty[TLength]]] = js.native
  /**
    * The **`border-bottom-color`** CSS property sets the color of an element's bottom border. It can also be set with the shorthand CSS properties `border-color` or `border-bottom`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-color
    */
  var `border-bottom-color`: js.UndefOr[BorderBottomColorProperty | js.Array[BorderBottomColorProperty]] = js.native
  /**
    * The **`border-bottom-left-radius`** CSS property rounds the bottom-left corner of an element.
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
  var `border-bottom-left-radius`: js.UndefOr[
    BorderBottomLeftRadiusProperty[TLength] | js.Array[BorderBottomLeftRadiusProperty[TLength]]
  ] = js.native
  /**
    * The **`border-bottom-right-radius`** CSS property rounds the bottom-right corner of an element.
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
  var `border-bottom-right-radius`: js.UndefOr[
    BorderBottomRightRadiusProperty[TLength] | js.Array[BorderBottomRightRadiusProperty[TLength]]
  ] = js.native
  /**
    * The **`border-bottom-style`** CSS property sets the line style of an element's bottom `border`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-style
    */
  var `border-bottom-style`: js.UndefOr[BorderBottomStyleProperty | js.Array[BorderBottomStyleProperty]] = js.native
  /**
    * The **`border-bottom-width`** CSS property sets the width of the bottom border of a box.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-width
    */
  var `border-bottom-width`: js.UndefOr[
    BorderBottomWidthProperty[TLength] | js.Array[BorderBottomWidthProperty[TLength]]
  ] = js.native
  /**
    * The **`border-collapse`** CSS property sets whether cells inside a `<table>` have shared or separate borders.
    *
    * **Initial value**: `separate`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-collapse
    */
  var `border-collapse`: js.UndefOr[BorderCollapseProperty | js.Array[BorderCollapseProperty]] = js.native
  /**
    * The **`border-end-end-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius that depends on on the element's `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-end-end-radius
    */
  var `border-end-end-radius`: js.UndefOr[
    BorderEndEndRadiusProperty[TLength] | js.Array[BorderEndEndRadiusProperty[TLength]]
  ] = js.native
  /**
    * The **`border-end-start-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius depending on the element's `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-end-start-radius
    */
  var `border-end-start-radius`: js.UndefOr[
    BorderEndStartRadiusProperty[TLength] | js.Array[BorderEndStartRadiusProperty[TLength]]
  ] = js.native
  /**
    * The **`border-image-outset`** CSS property sets the distance by which an element's border image is set out from its border box.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-outset
    */
  var `border-image-outset`: js.UndefOr[
    BorderImageOutsetProperty[TLength] | js.Array[BorderImageOutsetProperty[TLength]]
  ] = js.native
  /**
    * The **`border-image-repeat`** CSS property defines how the edge regions of a source image are adjusted to fit the dimensions of an element's border image.
    *
    * **Initial value**: `stretch`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-repeat
    */
  var `border-image-repeat`: js.UndefOr[BorderImageRepeatProperty | js.Array[BorderImageRepeatProperty]] = js.native
  /**
    * The **`border-image-slice`** CSS property divides the image specified by `border-image-source` into regions. These regions form the components of an element's border image.
    *
    * **Initial value**: `100%`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-slice
    */
  var `border-image-slice`: js.UndefOr[BorderImageSliceProperty | js.Array[BorderImageSliceProperty]] = js.native
  /**
    * The **`border-image-source`** CSS property sets the source image used to create an element's border image.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-source
    */
  var `border-image-source`: js.UndefOr[BorderImageSourceProperty | js.Array[BorderImageSourceProperty]] = js.native
  /**
    * The **`border-image-width`** CSS property sets the width of an element's border image.
    *
    * **Initial value**: `1`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **13**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-width
    */
  var `border-image-width`: js.UndefOr[BorderImageWidthProperty[TLength] | js.Array[BorderImageWidthProperty[TLength]]] = js.native
  /**
    * The **`border-inline-color`** CSS property defines the color of the logical inline borders of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color` and `border-bottom-color`, or `border-right-color` and `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-color
    */
  var `border-inline-color`: js.UndefOr[BorderInlineColorProperty | js.Array[BorderInlineColorProperty]] = js.native
  /**
    * The **`border-inline-end-color`** CSS property defines the color of the logical inline-end border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome |           Firefox           |  Safari  | Edge | IE  |
    * | :----: | :-------------------------: | :------: | :--: | :-: |
    * | **69** |           **41**            | **12.1** |  No  | No  |
    * |        | 3 _(-moz-border-end-color)_ |          |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end-color
    */
  var `border-inline-end-color`: js.UndefOr[BorderInlineEndColorProperty | js.Array[BorderInlineEndColorProperty]] = js.native
  /**
    * The **`border-inline-end-style`** CSS property defines the style of the logical inline end border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome |           Firefox           |  Safari  | Edge | IE  |
    * | :----: | :-------------------------: | :------: | :--: | :-: |
    * | **69** |           **41**            | **12.1** |  No  | No  |
    * |        | 3 _(-moz-border-end-style)_ |          |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end-style
    */
  var `border-inline-end-style`: js.UndefOr[BorderInlineEndStyleProperty | js.Array[BorderInlineEndStyleProperty]] = js.native
  /**
    * The **`border-inline-end-width`** CSS property defines the width of the logical inline-end border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome |           Firefox           |  Safari  | Edge | IE  |
    * | :----: | :-------------------------: | :------: | :--: | :-: |
    * | **69** |           **41**            | **12.1** |  No  | No  |
    * |        | 3 _(-moz-border-end-width)_ |          |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end-width
    */
  var `border-inline-end-width`: js.UndefOr[
    BorderInlineEndWidthProperty[TLength] | js.Array[BorderInlineEndWidthProperty[TLength]]
  ] = js.native
  /**
    * The **`border-inline-start-color`** CSS property defines the color of the logical inline start border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome |            Firefox            |  Safari  | Edge | IE  |
    * | :----: | :---------------------------: | :------: | :--: | :-: |
    * | **69** |            **41**             | **12.1** |  No  | No  |
    * |        | 3 _(-moz-border-start-color)_ |          |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start-color
    */
  var `border-inline-start-color`: js.UndefOr[BorderInlineStartColorProperty | js.Array[BorderInlineStartColorProperty]] = js.native
  /**
    * The **`border-inline-start-style`** CSS property defines the style of the logical inline start border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome |            Firefox            |  Safari  | Edge | IE  |
    * | :----: | :---------------------------: | :------: | :--: | :-: |
    * | **69** |            **41**             | **12.1** |  No  | No  |
    * |        | 3 _(-moz-border-start-style)_ |          |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start-style
    */
  var `border-inline-start-style`: js.UndefOr[BorderInlineStartStyleProperty | js.Array[BorderInlineStartStyleProperty]] = js.native
  /**
    * The **`border-inline-start-width`** CSS property defines the width of the logical inline-start border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start-width
    */
  var `border-inline-start-width`: js.UndefOr[
    BorderInlineStartWidthProperty[TLength] | js.Array[BorderInlineStartWidthProperty[TLength]]
  ] = js.native
  /**
    * The **`border-inline-style`** CSS property defines the style of the logical inline borders of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style` and `border-bottom-style`, or `border-left-style` and `border-right-style` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-style
    */
  var `border-inline-style`: js.UndefOr[BorderInlineStyleProperty | js.Array[BorderInlineStyleProperty]] = js.native
  /**
    * The **`border-inline-width`** CSS property defines the width of the logical inline borders of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width` and `border-bottom-width`, or `border-left-width`, and `border-right-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-width
    */
  var `border-inline-width`: js.UndefOr[
    BorderInlineWidthProperty[TLength] | js.Array[BorderInlineWidthProperty[TLength]]
  ] = js.native
  /**
    * The **`border-left-color`** CSS property sets the color of an element's left border. It can also be set with the shorthand CSS properties `border-color` or `border-left`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left-color
    */
  var `border-left-color`: js.UndefOr[BorderLeftColorProperty | js.Array[BorderLeftColorProperty]] = js.native
  /**
    * The **`border-left-style`** CSS property sets the line style of an element's left `border`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left-style
    */
  var `border-left-style`: js.UndefOr[BorderLeftStyleProperty | js.Array[BorderLeftStyleProperty]] = js.native
  /**
    * The **`border-left-width`** CSS property sets the width of the left border of an element.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left-width
    */
  var `border-left-width`: js.UndefOr[BorderLeftWidthProperty[TLength] | js.Array[BorderLeftWidthProperty[TLength]]] = js.native
  /**
    * The **`border-right-color`** CSS property sets the color of an element's right border. It can also be set with the shorthand CSS properties `border-color` or `border-right`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right-color
    */
  var `border-right-color`: js.UndefOr[BorderRightColorProperty | js.Array[BorderRightColorProperty]] = js.native
  /**
    * The **`border-right-style`** CSS property sets the line style of an element's right `border`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right-style
    */
  var `border-right-style`: js.UndefOr[BorderRightStyleProperty | js.Array[BorderRightStyleProperty]] = js.native
  /**
    * The **`border-right-width`** CSS property sets the width of the right border of an element.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right-width
    */
  var `border-right-width`: js.UndefOr[BorderRightWidthProperty[TLength] | js.Array[BorderRightWidthProperty[TLength]]] = js.native
  /**
    * The **`border-spacing`** CSS property sets the distance between the borders of adjacent `<table>` cells. This property applies only when `border-collapse` is `separate`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-spacing
    */
  var `border-spacing`: js.UndefOr[BorderSpacingProperty[TLength] | js.Array[BorderSpacingProperty[TLength]]] = js.native
  /**
    * The **`border-start-end-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius depending on the element's `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-start-end-radius
    */
  var `border-start-end-radius`: js.UndefOr[
    BorderStartEndRadiusProperty[TLength] | js.Array[BorderStartEndRadiusProperty[TLength]]
  ] = js.native
  /**
    * The **`border-start-start-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius that depends on the element's `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-start-start-radius
    */
  var `border-start-start-radius`: js.UndefOr[
    BorderStartStartRadiusProperty[TLength] | js.Array[BorderStartStartRadiusProperty[TLength]]
  ] = js.native
  /**
    * The **`border-top-color`** CSS property sets the color of an element's top border. It can also be set with the shorthand CSS properties `border-color` or `border-top`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-color
    */
  var `border-top-color`: js.UndefOr[BorderTopColorProperty | js.Array[BorderTopColorProperty]] = js.native
  /**
    * The **`border-top-left-radius`** CSS property rounds the top-left corner of an element.
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
  var `border-top-left-radius`: js.UndefOr[
    BorderTopLeftRadiusProperty[TLength] | js.Array[BorderTopLeftRadiusProperty[TLength]]
  ] = js.native
  /**
    * The **`border-top-right-radius`** CSS property rounds the top-right corner of an element.
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
  var `border-top-right-radius`: js.UndefOr[
    BorderTopRightRadiusProperty[TLength] | js.Array[BorderTopRightRadiusProperty[TLength]]
  ] = js.native
  /**
    * The **`border-top-style`** CSS property sets the line style of an element's top `border`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-style
    */
  var `border-top-style`: js.UndefOr[BorderTopStyleProperty | js.Array[BorderTopStyleProperty]] = js.native
  /**
    * The **`border-top-width`** CSS property sets the width of the top border of an element.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-width
    */
  var `border-top-width`: js.UndefOr[BorderTopWidthProperty[TLength] | js.Array[BorderTopWidthProperty[TLength]]] = js.native
  /**
    * The **`bottom`** CSS property participates in specifying the vertical position of a _positioned element_. It has no effect on non-positioned elements.
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
    * **Initial value**: `slice`
    *
    * |    Chrome    | Firefox | Safari  | Edge | IE  |
    * | :----------: | :-----: | :-----: | :--: | :-: |
    * | **22** _-x-_ | **32**  | **6.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/box-decoration-break
    */
  var `box-decoration-break`: js.UndefOr[BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty]] = js.native
  /**
    * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii, and color.
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
  var `box-shadow`: js.UndefOr[BoxShadowProperty | js.Array[BoxShadowProperty]] = js.native
  /**
    * The **`box-sizing`** CSS property defines how the user agent should calculate the total width and height of an element.
    *
    * **Initial value**: `content-box`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * | **10**  | **29**  | **5.1** | **12** | **8** |
    * | 1 _-x-_ | 1 _-x-_ |         |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/box-sizing
    */
  var `box-sizing`: js.UndefOr[BoxSizingProperty | js.Array[BoxSizingProperty]] = js.native
  /**
    * The **`break-after`** CSS property defines how page, column, or region breaks should behave after a generated box. If there is no generated box, the property is ignored.
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
  var `break-after`: js.UndefOr[BreakAfterProperty | js.Array[BreakAfterProperty]] = js.native
  /**
    * The **`break-before`** CSS property sets how page, column, or region breaks should behave before a generated box. If there is no generated box, the property is ignored.
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
  var `break-before`: js.UndefOr[BreakBeforeProperty | js.Array[BreakBeforeProperty]] = js.native
  /**
    * The **`break-inside`** CSS property defines how page, column, or region breaks should behave inside a generated box. If there is no generated box, the property is ignored.
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
  var `break-inside`: js.UndefOr[BreakInsideProperty | js.Array[BreakInsideProperty]] = js.native
  /**
    * The **`caption-side`** CSS property puts the content of a table's `<caption>` on the specified side. The values are relative to the `writing-mode` of the table.
    *
    * **Initial value**: `top`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/caption-side
    */
  var `caption-side`: js.UndefOr[CaptionSideProperty | js.Array[CaptionSideProperty]] = js.native
  /**
    * The **`caret-color`** CSS property sets the color of the insertion caret, the visible marker where the next character typed will be inserted. The caret appears in elements such as `<input>` or those with the `contenteditable` attribute. The caret is typically a thin vertical line that flashes to help make it more noticeable. By default, it is black, but its color can be altered with this property.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **53**  | **11.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/caret-color
    */
  var `caret-color`: js.UndefOr[CaretColorProperty | js.Array[CaretColorProperty]] = js.native
  /**
    * The **`clear`** CSS property sets whether an element must be moved below (cleared) floating elements that precede it. The `clear` property applies to floating and non-floating elements.
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
    * **Initial value**: `none`
    *
    * |  Chrome  | Firefox |   Safari    |  Edge  |   IE   |
    * | :------: | :-----: | :---------: | :----: | :----: |
    * |  **55**  | **3.5** | **7** _-x-_ | **12** | **10** |
    * | 24 _-x-_ |         |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/clip-path
    */
  var `clip-path`: js.UndefOr[ClipPathProperty | js.Array[ClipPathProperty]] = js.native
  /**
    * The **`color`** CSS property sets the foreground color value of an element's text and text decorations, and sets the `currentcolor` value. `currentcolor` may be used as an indirect value on _other_ properties and is the default for other color properties, such as `border-color`.
    *
    * **Initial value**: Varies from one browser to another
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  |  Yes   | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/color
    */
  var color: js.UndefOr[ColorProperty | js.Array[ColorProperty]] = js.native
  /**
    * The **`color-adjust`** CSS property sets what, if anything, the user agent may do to optimize the appearance of the element on the output device. By default, the browser is allowed to make any adjustments to the element's appearance it determines to be necessary and prudent given the type and capabilities of the output device.
    *
    * **Initial value**: `economy`
    *
    * |    Chrome    | Firefox |   Safari    | Edge | IE  |
    * | :----------: | :-----: | :---------: | :--: | :-: |
    * | **49** _-x-_ | **48**  | **6** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/color-adjust
    */
  var `color-adjust`: js.UndefOr[ColorAdjustProperty | js.Array[ColorAdjustProperty]] = js.native
  /**
    * The **`column-count`** CSS property breaks an element's content into the specified number of columns.
    *
    * **Initial value**: `auto`
    *
    * | Chrome |  Firefox  | Safari  |  Edge  |   IE   |
    * | :----: | :-------: | :-----: | :----: | :----: |
    * | **50** |  **52**   |  **9**  | **12** | **10** |
    * |        | 1.5 _-x-_ | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-count
    */
  var `column-count`: js.UndefOr[ColumnCountProperty | js.Array[ColumnCountProperty]] = js.native
  /**
    * The **`column-fill`** CSS property controls how an element's contents are balanced when broken into columns.
    *
    * **Initial value**: `balance`
    *
    * | Chrome | Firefox  | Safari  |  Edge  |   IE   |
    * | :----: | :------: | :-----: | :----: | :----: |
    * | **50** |  **52**  |  **9**  | **12** | **10** |
    * |        | 13 _-x-_ | 8 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-fill
    */
  var `column-fill`: js.UndefOr[ColumnFillProperty | js.Array[ColumnFillProperty]] = js.native
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
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
    * | Chrome |  Firefox  | Safari  |  Edge  |   IE   |
    * | :----: | :-------: | :-----: | :----: | :----: |
    * | **50** |  **52**   | **10**  | **12** | **10** |
    * |        | 1.5 _-x-_ | 3 _-x-_ |        |        |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-gap
    */
  var `column-gap`: js.UndefOr[ColumnGapProperty[TLength] | js.Array[ColumnGapProperty[TLength]]] = js.native
  /**
    * The **`column-rule-color`** CSS property sets the color of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome |  Firefox  | Safari  |  Edge  |   IE   |
    * | :----: | :-------: | :-----: | :----: | :----: |
    * | **50** |  **52**   |  **9**  | **12** | **10** |
    * |        | 3.5 _-x-_ | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule-color
    */
  var `column-rule-color`: js.UndefOr[ColumnRuleColorProperty | js.Array[ColumnRuleColorProperty]] = js.native
  /**
    * The **`column-rule-style`** CSS property sets the style of the line drawn between columns in a multi-column layout.
    *
    * **Initial value**: `none`
    *
    * | Chrome |  Firefox  | Safari  |  Edge  |   IE   |
    * | :----: | :-------: | :-----: | :----: | :----: |
    * | **50** |  **52**   |  **9**  | **12** | **10** |
    * |        | 3.5 _-x-_ | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule-style
    */
  var `column-rule-style`: js.UndefOr[ColumnRuleStyleProperty | js.Array[ColumnRuleStyleProperty]] = js.native
  /**
    * The **`column-rule-width`** CSS property sets the width of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Initial value**: `medium`
    *
    * | Chrome |  Firefox  | Safari  |  Edge  |   IE   |
    * | :----: | :-------: | :-----: | :----: | :----: |
    * | **50** |  **50**   |  **9**  | **12** | **10** |
    * |        | 3.5 _-x-_ | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule-width
    */
  var `column-rule-width`: js.UndefOr[ColumnRuleWidthProperty[TLength] | js.Array[ColumnRuleWidthProperty[TLength]]] = js.native
  /**
    * The **`column-span`** CSS property makes it possible for an element to span across all columns when its value is set to `all`.
    *
    * **Initial value**: `none`
    *
    * | Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :-----: | :-----: | :-------: | :----: | :----: |
    * | **50**  |   n/a   |   **9**   | **12** | **10** |
    * | 6 _-x-_ |         | 5.1 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-span
    */
  var `column-span`: js.UndefOr[ColumnSpanProperty | js.Array[ColumnSpanProperty]] = js.native
  /**
    * The **`column-width`** CSS property specifies the ideal column width in a multi-column layout. The container will have as many columns as can fit without any of them having a width less than the `column-width` value. If the width of the container is narrower than the specified value, the single column's width will be smaller than the declared column width.
    *
    * **Initial value**: `auto`
    *
    * | Chrome |  Firefox  | Safari  |  Edge  |   IE   |
    * | :----: | :-------: | :-----: | :----: | :----: |
    * | **50** |  **50**   |  **9**  | **12** | **10** |
    * |        | 1.5 _-x-_ | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-width
    */
  var `column-width`: js.UndefOr[ColumnWidthProperty[TLength] | js.Array[ColumnWidthProperty[TLength]]] = js.native
  /**
    * The **`contain`** CSS property allows an author to indicate that an element and its contents are, as much as possible, _independent_ of the rest of the document tree. This allows the browser to recalculate layout, style, paint, size, or any combination of them for a limited area of the DOM and not the entire page.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **52** |   n/a   |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/contain
    */
  var contain: js.UndefOr[ContainProperty | js.Array[ContainProperty]] = js.native
  /**
    * The **`content`** CSS property replaces an element with a generated value. Objects inserted using the `content` property are _anonymous replaced elements._
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
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **2**  |  **1**  | **3**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/counter-increment
    */
  var `counter-increment`: js.UndefOr[CounterIncrementProperty | js.Array[CounterIncrementProperty]] = js.native
  /**
    * The **`counter-reset`** CSS property resets a CSS counter to a given value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **2**  |  **1**  | **3**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/counter-reset
    */
  var `counter-reset`: js.UndefOr[CounterResetProperty | js.Array[CounterResetProperty]] = js.native
  /**
    * The **`counter-set`** CSS property sets a CSS counter to a given value. It manipulates the value of existing counters, and will only create new counters if there isn't already a counter of the given name on the element.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **68**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/counter-set
    */
  var `counter-set`: js.UndefOr[CounterSetProperty | js.Array[CounterSetProperty]] = js.native
  /**
    * The **`cursor`** CSS property sets mouse cursor to display when the mouse pointer is over an element.
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
    * **Initial value**: `show`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/empty-cells
    */
  var `empty-cells`: js.UndefOr[EmptyCellsProperty | js.Array[EmptyCellsProperty]] = js.native
  /**
    * The **`filter`** CSS property applies graphical effects like blur or color shift to an element. Filters are commonly used to adjust the rendering of images, backgrounds, and borders.
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
    * **Initial value**: `auto`
    *
    * |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :------: | :-----: | :-----: | :----: | :----: |
    * |  **29**  | **22**  |  **9**  | **12** | **11** |
    * | 21 _-x-_ |         | 7 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-basis
    */
  var `flex-basis`: js.UndefOr[FlexBasisProperty[TLength] | js.Array[FlexBasisProperty[TLength]]] = js.native
  /**
    * The **`flex-direction`** CSS property sets how flex items are placed in the flex container defining the main axis and the direction (normal or reversed).
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
  var `flex-direction`: js.UndefOr[FlexDirectionProperty | js.Array[FlexDirectionProperty]] = js.native
  /**
    * The **`flex-grow`** CSS property sets how much of the available space in the flex container should be assigned to that item (the flex grow factor). If all sibling items have the same flex grow factor, then all items will receive the same share of available space, otherwise it is distributed according to the ratio defined by the different flex grow factors.
    *
    * **Initial value**: `0`
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |            IE            |
    * | :------: | :-----: | :-------: | :----: | :----------------------: |
    * |  **29**  | **20**  |   **9**   | **12** |          **11**          |
    * | 21 _-x-_ |         | 6.1 _-x-_ |        | 10 _(-ms-flex-positive)_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-grow
    */
  var `flex-grow`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`flex-shrink`** CSS property sets the flex shrink factor of a flex item. If the size of flex items is larger than the flex container, items shrink to fit according to `flex-shrink`.
    *
    * **Initial value**: `1`
    *
    * |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :------: | :-----: | :-----: | :----: | :----: |
    * |  **29**  | **20**  |  **9**  | **12** | **10** |
    * | 21 _-x-_ |         | 8 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-shrink
    */
  var `flex-shrink`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`flex-wrap`** CSS property sets whether flex items are forced onto one line or can wrap onto multiple lines. If wrapping is allowed, it sets the direction that lines are stacked.
    *
    * **Initial value**: `nowrap`
    *
    * |  Chrome  | Firefox | Safari |  Edge  |   IE   |
    * | :------: | :-----: | :----: | :----: | :----: |
    * |  **29**  | **28**  | **9**  | **12** | **11** |
    * | 21 _-x-_ |         |        |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-wrap
    */
  var `flex-wrap`: js.UndefOr[FlexWrapProperty | js.Array[FlexWrapProperty]] = js.native
  /**
    * The **`float`** CSS property places an element on the left or right side of its container, allowing text and inline elements to wrap around it. The element is removed from the normal flow of the page, though still remaining a part of the flow (in contrast to absolute positioning).
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
    * **Initial value**: depends on user agent
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-family
    */
  var `font-family`: js.UndefOr[FontFamilyProperty | js.Array[FontFamilyProperty]] = js.native
  /**
    * The **`font-feature-settings`** CSS property controls advanced typographic features in OpenType fonts.
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
  var `font-feature-settings`: js.UndefOr[FontFeatureSettingsProperty | js.Array[FontFeatureSettingsProperty]] = js.native
  /**
    * The **`font-kerning`** CSS property sets the use of the kerning information stored in a font.
    *
    * **Initial value**: `auto`
    *
    * |    Chrome    | Firefox | Safari | Edge | IE  |
    * | :----------: | :-----: | :----: | :--: | :-: |
    * | **32** _-x-_ | **32**  | **7**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-kerning
    */
  var `font-kerning`: js.UndefOr[FontKerningProperty | js.Array[FontKerningProperty]] = js.native
  /**
    * The **`font-language-override`** CSS property controls the use of language-specific glyphs in a typeface.
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
  var `font-language-override`: js.UndefOr[FontLanguageOverrideProperty | js.Array[FontLanguageOverrideProperty]] = js.native
  /**
    * The **`font-optical-sizing`** CSS property sets whether text rendering is optimized for viewing at different sizes. This only works for fonts that have an optical size variation axis.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * |   No   | **62**  |  n/a   | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-optical-sizing
    */
  var `font-optical-sizing`: js.UndefOr[FontOpticalSizingProperty | js.Array[FontOpticalSizingProperty]] = js.native
  /**
    * The **`font-size`** CSS property sets the size of the font. This property is also used to compute the size of `em`, `ex`, and other relative `<length>` units.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-size
    */
  var `font-size`: js.UndefOr[FontSizeProperty[TLength] | js.Array[FontSizeProperty[TLength]]] = js.native
  /**
    * The **`font-size-adjust`** CSS property sets how the font size should be chosen based on the height of lowercase rather than capital letters.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   |  **1**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-size-adjust
    */
  var `font-size-adjust`: js.UndefOr[FontSizeAdjustProperty | js.Array[FontSizeAdjustProperty]] = js.native
  /**
    * The **`font-stretch`** CSS property selects a normal, condensed, or expanded face from a font.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **60** |  **9**  | **11** | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-stretch
    */
  var `font-stretch`: js.UndefOr[FontStretchProperty | js.Array[FontStretchProperty]] = js.native
  /**
    * The **`font-style`** CSS property sets whether a font should be styled with a normal, italic, or oblique face from its `font-family`.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-style
    */
  var `font-style`: js.UndefOr[FontStyleProperty | js.Array[FontStyleProperty]] = js.native
  /**
    * The **`font-synthesis`** CSS property controls which missing typefaces, bold or italic, may be synthesized by the browser.
    *
    * **Initial value**: `weight style`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **34**  | **9**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-synthesis
    */
  var `font-synthesis`: js.UndefOr[FontSynthesisProperty | js.Array[FontSynthesisProperty]] = js.native
  /**
    * The **font-variant** CSS property is a shorthand for the longhand properties `font-variant-caps`, `font-variant-numeric`, `font-variant-alternates`, `font-variant-ligatures`, and `font-variant-east-asian`. You can also set the CSS Level 2 (Revision 1) values of `font-variant`, (that is, `normal` or `small-caps`), by using the `font` shorthand.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant
    */
  var `font-variant`: js.UndefOr[FontVariantProperty | js.Array[FontVariantProperty]] = js.native
  /**
    * The **`font-variant-caps`** CSS property controls the use of alternate glyphs for capital letters.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **52** | **34**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-caps
    */
  var `font-variant-caps`: js.UndefOr[FontVariantCapsProperty | js.Array[FontVariantCapsProperty]] = js.native
  /**
    * The **`font-variant-east-asian`** CSS property controls the use of alternate glyphs for East Asian scripts, like Japanese and Chinese.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **63** | **34**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-east-asian
    */
  var `font-variant-east-asian`: js.UndefOr[FontVariantEastAsianProperty | js.Array[FontVariantEastAsianProperty]] = js.native
  /**
    * The **`font-variant-ligatures`** CSS property controls which ligatures and contextual forms are used in textual content of the elements it applies to. This leads to more harmonized forms in the resulting text.
    *
    * **Initial value**: `normal`
    *
    * |  Chrome  | Firefox | Safari  | Edge | IE  |
    * | :------: | :-----: | :-----: | :--: | :-: |
    * |  **34**  | **34**  | **9.1** |  No  | No  |
    * | 31 _-x-_ |         | 7 _-x-_ |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-ligatures
    */
  var `font-variant-ligatures`: js.UndefOr[FontVariantLigaturesProperty | js.Array[FontVariantLigaturesProperty]] = js.native
  /**
    * The **`font-variant-numeric`** CSS property controls the usage of alternate glyphs for numbers, fractions, and ordinal markers.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari  | Edge | IE  |
    * | :----: | :-----: | :-----: | :--: | :-: |
    * | **52** | **34**  | **9.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-numeric
    */
  var `font-variant-numeric`: js.UndefOr[FontVariantNumericProperty | js.Array[FontVariantNumericProperty]] = js.native
  /**
    * The **`font-variant-position`** CSS property controls the use of alternate, smaller glyphs that are positioned as superscript or subscript.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **34**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-position
    */
  var `font-variant-position`: js.UndefOr[FontVariantPositionProperty | js.Array[FontVariantPositionProperty]] = js.native
  /**
    * The **`font-variation-settings`** CSS property provides low-level control over variable font characteristics, by specifying the four letter axis names of the characteristics you want to vary, along with their values.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **62** | **62**  | **11** | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variation-settings
    */
  var `font-variation-settings`: js.UndefOr[FontVariationSettingsProperty | js.Array[FontVariationSettingsProperty]] = js.native
  /**
    * The **`font-weight`** CSS property specifies the weight (or boldness) of the font. The font weights available to you will depend on the `font-family` you are using. Some fonts are only available in `normal` and `bold`.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **2**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-weight
    */
  var `font-weight`: js.UndefOr[FontWeightProperty | js.Array[FontWeightProperty]] = js.native
  /**
    * The **`grid-auto-columns`** CSS property specifies the size of an implicitly-created grid column track.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |          Edge           |             IE              |
    * | :----: | :-----: | :------: | :---------------------: | :-------------------------: |
    * | **57** | **52**  | **10.1** |         **16**          | **10** _(-ms-grid-columns)_ |
    * |        |         |          | 12 _(-ms-grid-columns)_ |                             |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-auto-columns
    */
  var `grid-auto-columns`: js.UndefOr[GridAutoColumnsProperty[TLength] | js.Array[GridAutoColumnsProperty[TLength]]] = js.native
  /**
    * The **`grid-auto-flow`** CSS property controls how the auto-placement algorithm works, specifying exactly how auto-placed items get flowed into the grid.
    *
    * **Initial value**: `row`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-auto-flow
    */
  var `grid-auto-flow`: js.UndefOr[GridAutoFlowProperty | js.Array[GridAutoFlowProperty]] = js.native
  /**
    * The **`grid-auto-rows`** CSS property specifies the size of an implicitly-created grid row track.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |         Edge         |            IE            |
    * | :----: | :-----: | :------: | :------------------: | :----------------------: |
    * | **57** | **52**  | **10.1** |        **16**        | **10** _(-ms-grid-rows)_ |
    * |        |         |          | 12 _(-ms-grid-rows)_ |                          |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-auto-rows
    */
  var `grid-auto-rows`: js.UndefOr[GridAutoRowsProperty[TLength] | js.Array[GridAutoRowsProperty[TLength]]] = js.native
  /**
    * The **`grid-column-end`** CSS property specifies a grid item’s end position within the grid column by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the block-end edge of its grid area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-column-end
    */
  var `grid-column-end`: js.UndefOr[GridColumnEndProperty | js.Array[GridColumnEndProperty]] = js.native
  /**
    * The **`grid-column-start`** CSS property specifies a grid item’s start position within the grid column by contributing a line, a span, or nothing (automatic) to its grid placement. This start position defines the block-start edge of the grid area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-column-start
    */
  var `grid-column-start`: js.UndefOr[GridColumnStartProperty | js.Array[GridColumnStartProperty]] = js.native
  /**
    * The **`grid-row-end`** CSS property specifies a grid item’s end position within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-end edge of its grid area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-row-end
    */
  var `grid-row-end`: js.UndefOr[GridRowEndProperty | js.Array[GridRowEndProperty]] = js.native
  /**
    * The **`grid-row-start`** CSS property specifies a grid item’s start position within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start edge of its grid area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-row-start
    */
  var `grid-row-start`: js.UndefOr[GridRowStartProperty | js.Array[GridRowStartProperty]] = js.native
  /**
    * The **`grid-template-areas`** CSS property specifies named grid areas.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template-areas
    */
  var `grid-template-areas`: js.UndefOr[GridTemplateAreasProperty | js.Array[GridTemplateAreasProperty]] = js.native
  /**
    * The **`grid-template-columns`** CSS property defines the line names and track sizing functions of the grid columns.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template-columns
    */
  var `grid-template-columns`: js.UndefOr[
    GridTemplateColumnsProperty[TLength] | js.Array[GridTemplateColumnsProperty[TLength]]
  ] = js.native
  /**
    * The **`grid-template-rows`** CSS property defines the line names and track sizing functions of the grid rows.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template-rows
    */
  var `grid-template-rows`: js.UndefOr[GridTemplateRowsProperty[TLength] | js.Array[GridTemplateRowsProperty[TLength]]] = js.native
  /**
    * The **`hanging-punctuation`** CSS property specifies whether a punctuation mark should hang at the start or end of a line of text. Hanging punctuation may be placed outside the line box.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    | **10** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/hanging-punctuation
    */
  var `hanging-punctuation`: js.UndefOr[HangingPunctuationProperty | js.Array[HangingPunctuationProperty]] = js.native
  /**
    * The **`height`** CSS property specifies the height of an element. By default, the property defines the height of the content area. If `box-sizing` is set to `border-box`, however, it instead determines the height of the border area.
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
    * **Initial value**: `0deg`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **26**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/image-orientation
    */
  var `image-orientation`: js.UndefOr[ImageOrientationProperty | js.Array[ImageOrientationProperty]] = js.native
  /**
    * The **`image-rendering`** CSS property sets an image scaling algorithm. The property applies to an element itself, to any images set in its other properties, and to its descendants.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   | **3.6** |  Yes   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/image-rendering
    */
  var `image-rendering`: js.UndefOr[ImageRenderingProperty | js.Array[ImageRenderingProperty]] = js.native
  /** **Initial value**: `1dppx` */
  var `image-resolution`: js.UndefOr[ImageResolutionProperty | js.Array[ImageResolutionProperty]] = js.native
  /**
    * The `initial-letter` CSS property sets styling for dropped, raised, and sunken initial letters.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    | **9**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/initial-letter
    */
  var `initial-letter`: js.UndefOr[InitialLetterProperty | js.Array[InitialLetterProperty]] = js.native
  /**
    * The **`inline-size`** CSS property defines the horizontal or vertical size of an element's block, depending on its writing mode. It corresponds to either the `width` or the `height` property, depending on the value of `writing-mode`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inline-size
    */
  var `inline-size`: js.UndefOr[InlineSizeProperty[TLength] | js.Array[InlineSizeProperty[TLength]]] = js.native
  /**
    * The **`inset`** CSS property defines the logical block and inline start and end offsets of an element, which map to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
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
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-block
    */
  var `inset-block`: js.UndefOr[InsetBlockProperty[TLength] | js.Array[InsetBlockProperty[TLength]]] = js.native
  /**
    * The **`inset-block-end`** CSS property defines the logical block end offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-block-end
    */
  var `inset-block-end`: js.UndefOr[InsetBlockEndProperty[TLength] | js.Array[InsetBlockEndProperty[TLength]]] = js.native
  /**
    * The **`inset-block-start`** CSS property defines the logical block start offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-block-start
    */
  var `inset-block-start`: js.UndefOr[InsetBlockStartProperty[TLength] | js.Array[InsetBlockStartProperty[TLength]]] = js.native
  /**
    * The **`inset-inline`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-inline
    */
  var `inset-inline`: js.UndefOr[InsetInlineProperty[TLength] | js.Array[InsetInlineProperty[TLength]]] = js.native
  /**
    * The **`inset-inline-end`** CSS property defines the logical inline end inset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-inline-end
    */
  var `inset-inline-end`: js.UndefOr[InsetInlineEndProperty[TLength] | js.Array[InsetInlineEndProperty[TLength]]] = js.native
  /**
    * The **`inset-inline-start`** CSS property defines the logical inline start inset of an element, which maps to a physical offset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-inline-start
    */
  var `inset-inline-start`: js.UndefOr[InsetInlineStartProperty[TLength] | js.Array[InsetInlineStartProperty[TLength]]] = js.native
  /**
    * The **`isolation`** CSS property determines whether an element must create a new stacking context.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **41** | **36**  |  Yes   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/isolation
    */
  var isolation: js.UndefOr[IsolationProperty | js.Array[IsolationProperty]] = js.native
  /**
    * The CSS **`justify-content`** property defines how the browser distributes space between and around content items along the main-axis of a flex container, and the inline axis of a grid container.
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * |  Chrome  | Firefox | Safari |  Edge  |   IE   |
    * | :------: | :-----: | :----: | :----: | :----: |
    * |  **52**  | **20**  | **9**  | **12** | **11** |
    * | 21 _-x-_ |         |        |        |        |
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
  var `justify-content`: js.UndefOr[JustifyContentProperty | js.Array[JustifyContentProperty]] = js.native
  /**
    * The CSS **`justify-items`** property defines the default `justify-self` for all items of the box, giving them all a default way of justifying each box along the appropriate axis.
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
  var `justify-items`: js.UndefOr[JustifyItemsProperty | js.Array[JustifyItemsProperty]] = js.native
  /**
    * The CSS **`justify-self`** property set the way a box is justified inside its alignment container along the appropriate axis.
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
  var `justify-self`: js.UndefOr[JustifySelfProperty | js.Array[JustifySelfProperty]] = js.native
  /**
    * The **`left`** CSS property participates in specifying the horizontal position of a _positioned element_. It has no effect on non-positioned elements.
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
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/letter-spacing
    */
  var `letter-spacing`: js.UndefOr[LetterSpacingProperty[TLength] | js.Array[LetterSpacingProperty[TLength]]] = js.native
  /**
    * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
    *
    * **Initial value**: `auto`
    *
    * | Chrome  | Firefox |   Safari    |  Edge  |   IE    |
    * | :-----: | :-----: | :---------: | :----: | :-----: |
    * | **58**  |   No    | **3** _-x-_ | **14** | **5.5** |
    * | 1 _-x-_ |         |             |        |         |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/line-break
    */
  var `line-break`: js.UndefOr[LineBreakProperty | js.Array[LineBreakProperty]] = js.native
  /**
    * The **`line-height`** CSS property sets the amount of space used for lines, such as in text. On block-level elements, it specifies the minimum height of line boxes within the element. On non-replaced inline elements, it specifies the height that is used to calculate line box height.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/line-height
    */
  var `line-height`: js.UndefOr[LineHeightProperty[TLength] | js.Array[LineHeightProperty[TLength]]] = js.native
  /**
    * The **`line-height-step`** CSS property sets the step unit for line box heights. When the property is set, line box heights are rounded up to the closest multiple of the unit.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   |   No    |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/line-height-step
    */
  var `line-height-step`: js.UndefOr[LineHeightStepProperty[TLength] | js.Array[LineHeightStepProperty[TLength]]] = js.native
  /**
    * The **`list-style-image`** CSS property sets an image to be used as the list item marker.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style-image
    */
  var `list-style-image`: js.UndefOr[ListStyleImageProperty | js.Array[ListStyleImageProperty]] = js.native
  /**
    * The **`list-style-position`** CSS property sets the position of the `::marker` relative to a list item.
    *
    * **Initial value**: `outside`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style-position
    */
  var `list-style-position`: js.UndefOr[ListStylePositionProperty | js.Array[ListStylePositionProperty]] = js.native
  /**
    * The **`list-style-type`** CSS property sets the marker (such as a disc, character, or custom counter style) of a list item element.
    *
    * **Initial value**: `disc`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style-type
    */
  var `list-style-type`: js.UndefOr[ListStyleTypeProperty | js.Array[ListStyleTypeProperty]] = js.native
  /**
    * The **`margin-block`** CSS property defines the logical block start and end margins of an element, which maps to physical margins depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-block
    */
  var `margin-block`: js.UndefOr[MarginBlockProperty[TLength] | js.Array[MarginBlockProperty[TLength]]] = js.native
  /**
    * The **`margin-block-end`** CSS property defines the logical block end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-block-end
    */
  var `margin-block-end`: js.UndefOr[MarginBlockEndProperty[TLength] | js.Array[MarginBlockEndProperty[TLength]]] = js.native
  /**
    * The **`margin-block-start`** CSS property defines the logical block start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-block-start
    */
  var `margin-block-start`: js.UndefOr[MarginBlockStartProperty[TLength] | js.Array[MarginBlockStartProperty[TLength]]] = js.native
  /**
    * The **`margin-bottom`** CSS property sets the margin area on the bottom of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-bottom
    */
  var `margin-bottom`: js.UndefOr[MarginBottomProperty[TLength] | js.Array[MarginBottomProperty[TLength]]] = js.native
  /**
    * The **`margin-inline`** CSS property defines the logical inline start and end margins of an element, which maps to physical margins depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-inline
    */
  var `margin-inline`: js.UndefOr[MarginInlineProperty[TLength] | js.Array[MarginInlineProperty[TLength]]] = js.native
  /**
    * The **`margin-inline-end`** CSS property defines the logical inline end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. In other words, it corresponds to the `margin-top`, `margin-right`, `margin-bottom` or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * |          Chrome          |        Firefox        |          Safari          | Edge | IE  |
    * | :----------------------: | :-------------------: | :----------------------: | :--: | :-: |
    * |          **69**          |        **41**         |         **12.1**         |  No  | No  |
    * | 2 _(-webkit-margin-end)_ | 3 _(-moz-margin-end)_ | 3 _(-webkit-margin-end)_ |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-inline-end
    */
  var `margin-inline-end`: js.UndefOr[MarginInlineEndProperty[TLength] | js.Array[MarginInlineEndProperty[TLength]]] = js.native
  /**
    * The **`margin-inline-start`** CSS property defines the logical inline start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. It corresponds to the `margin-top`, `margin-right`, `margin-bottom`, or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * |           Chrome           |         Firefox         |           Safari           | Edge | IE  |
    * | :------------------------: | :---------------------: | :------------------------: | :--: | :-: |
    * |           **69**           |         **41**          |          **12.1**          |  No  | No  |
    * | 2 _(-webkit-margin-start)_ | 3 _(-moz-margin-start)_ | 3 _(-webkit-margin-start)_ |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-inline-start
    */
  var `margin-inline-start`: js.UndefOr[
    MarginInlineStartProperty[TLength] | js.Array[MarginInlineStartProperty[TLength]]
  ] = js.native
  /**
    * The **`margin-left`** CSS property sets the margin area on the left side of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-left
    */
  var `margin-left`: js.UndefOr[MarginLeftProperty[TLength] | js.Array[MarginLeftProperty[TLength]]] = js.native
  /**
    * The **`margin-right`** CSS property sets the margin area on the right side of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-right
    */
  var `margin-right`: js.UndefOr[MarginRightProperty[TLength] | js.Array[MarginRightProperty[TLength]]] = js.native
  /**
    * The **`margin-top`** CSS property sets the margin area on the top of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-top
    */
  var `margin-top`: js.UndefOr[MarginTopProperty[TLength] | js.Array[MarginTopProperty[TLength]]] = js.native
  /**
    * The **`mask-border-mode`** CSS property specifies the blending mode used in a mask border.
    *
    * **Initial value**: `alpha`
    */
  var `mask-border-mode`: js.UndefOr[MaskBorderModeProperty | js.Array[MaskBorderModeProperty]] = js.native
  /**
    * The **`mask-border-outset`** CSS property specifies the distance by which an element's mask border is set out from its border box.
    *
    * **Initial value**: `0`
    */
  var `mask-border-outset`: js.UndefOr[MaskBorderOutsetProperty[TLength] | js.Array[MaskBorderOutsetProperty[TLength]]] = js.native
  /**
    * The **`mask-border-repeat`** CSS property sets how the edge regions of a source image are adjusted to fit the dimensions of an element's mask border.
    *
    * **Initial value**: `stretch`
    */
  var `mask-border-repeat`: js.UndefOr[MaskBorderRepeatProperty | js.Array[MaskBorderRepeatProperty]] = js.native
  /**
    * The **`mask-border-slice`** CSS property divides the image set by `mask-border-source` into regions. These regions are used to form the components of an element's mask border.
    *
    * **Initial value**: `0`
    */
  var `mask-border-slice`: js.UndefOr[MaskBorderSliceProperty | js.Array[MaskBorderSliceProperty]] = js.native
  /**
    * The **`mask-border-source`** CSS property sets the source image used to create an element's mask border.
    *
    * **Initial value**: `none`
    */
  var `mask-border-source`: js.UndefOr[MaskBorderSourceProperty | js.Array[MaskBorderSourceProperty]] = js.native
  /**
    * The **`mask-border-width`** CSS property sets the width of an element's mask border.
    *
    * **Initial value**: `auto`
    */
  var `mask-border-width`: js.UndefOr[MaskBorderWidthProperty[TLength] | js.Array[MaskBorderWidthProperty[TLength]]] = js.native
  /**
    * The **`mask-clip`** CSS property determines the area, which is affected by a mask. The painted content of an element must be restricted to this area.
    *
    * **Initial value**: `border-box`
    *
    * |   Chrome    | Firefox |   Safari    | Edge | IE  |
    * | :---------: | :-----: | :---------: | :--: | :-: |
    * | **1** _-x-_ | **53**  | **4** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-clip
    */
  var `mask-clip`: js.UndefOr[MaskClipProperty | js.Array[MaskClipProperty]] = js.native
  /**
    * The **`mask-composite`** CSS property represents a compositing operation used on the current mask layer with the mask layers below it.
    *
    * **Initial value**: `add`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * |   No   | **53**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-composite
    */
  var `mask-composite`: js.UndefOr[MaskCompositeProperty | js.Array[MaskCompositeProperty]] = js.native
  /**
    * The **`mask-image`** CSS property sets the image that is used as mask layer for an element.
    *
    * **Initial value**: `none`
    *
    * |   Chrome    | Firefox |   Safari    |  Edge  | IE  |
    * | :---------: | :-----: | :---------: | :----: | :-: |
    * | **1** _-x-_ | **53**  | **4** _-x-_ | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-image
    */
  var `mask-image`: js.UndefOr[MaskImageProperty | js.Array[MaskImageProperty]] = js.native
  /**
    * The **`mask-mode`** CSS property sets whether the mask reference defined by `mask-image` is treated as a luminance or alpha mask.
    *
    * **Initial value**: `match-source`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **53**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-mode
    */
  var `mask-mode`: js.UndefOr[MaskModeProperty | js.Array[MaskModeProperty]] = js.native
  /**
    * The **`mask-origin`** CSS property sets the origin of a mask.
    *
    * **Initial value**: `border-box`
    *
    * |   Chrome    | Firefox |   Safari    | Edge | IE  |
    * | :---------: | :-----: | :---------: | :--: | :-: |
    * | **1** _-x-_ | **53**  | **4** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-origin
    */
  var `mask-origin`: js.UndefOr[MaskOriginProperty | js.Array[MaskOriginProperty]] = js.native
  /**
    * The **`mask-position`** CSS property sets the initial position, relative to the mask position layer set by `mask-origin`, for each defined mask image.
    *
    * **Initial value**: `center`
    *
    * |   Chrome    | Firefox |    Safari     |  Edge  | IE  |
    * | :---------: | :-----: | :-----------: | :----: | :-: |
    * | **1** _-x-_ | **53**  | **3.2** _-x-_ | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-position
    */
  var `mask-position`: js.UndefOr[MaskPositionProperty[TLength] | js.Array[MaskPositionProperty[TLength]]] = js.native
  /**
    * The **`mask-repeat`** CSS property sets how mask images are repeated. A mask image can be repeated along the horizontal axis, the vertical axis, both axes, or not repeated at all.
    *
    * **Initial value**: `no-repeat`
    *
    * |   Chrome    | Firefox |    Safari     |  Edge  | IE  |
    * | :---------: | :-----: | :-----------: | :----: | :-: |
    * | **1** _-x-_ | **53**  | **3.2** _-x-_ | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-repeat
    */
  var `mask-repeat`: js.UndefOr[MaskRepeatProperty | js.Array[MaskRepeatProperty]] = js.native
  /**
    * The **`mask-size`** CSS property specifies the sizes of the mask images. The size of the image can be fully or partially constrained in order to preserve its intrinsic ratio.
    *
    * **Initial value**: `auto`
    *
    * |   Chrome    | Firefox |   Safari    |  Edge  | IE  |
    * | :---------: | :-----: | :---------: | :----: | :-: |
    * | **4** _-x-_ | **53**  | **4** _-x-_ | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-size
    */
  var `mask-size`: js.UndefOr[MaskSizeProperty[TLength] | js.Array[MaskSizeProperty[TLength]]] = js.native
  /**
    * The **`mask-type`** CSS property sets whether an SVG `<mask>` element is used as a _luminance_ or an _alpha_ mask. It applies to the `<mask>` element itself.
    *
    * **Initial value**: `luminance`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **24** | **35**  |  n/a   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-type
    */
  var `mask-type`: js.UndefOr[MaskTypeProperty | js.Array[MaskTypeProperty]] = js.native
  /**
    * The `**max-block-size**` CSS property specifies the maximum size of an element in the direction opposite that of the writing direction as specified by `writing-mode`. That is, if the writing direction is horizontal, then `max-block-size` is equivalent to `max-height`; if the writing direction is vertical, `max-block-size` is the same as `max-width`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-block-size
    */
  var `max-block-size`: js.UndefOr[MaxBlockSizeProperty[TLength] | js.Array[MaxBlockSizeProperty[TLength]]] = js.native
  /**
    * The **`max-height`** CSS property sets the maximum height of an element. It prevents the used value of the `height` property from becoming larger than the value specified for `max-height`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **18** |  **1**  | **1.3** | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-height
    */
  var `max-height`: js.UndefOr[MaxHeightProperty[TLength] | js.Array[MaxHeightProperty[TLength]]] = js.native
  /**
    * The **`max-inline-size`** CSS property defines the horizontal or vertical maximum size of an element's block depending on its writing mode. It corresponds to the `max-width` or the `max-height` property depending on the value defined for `writing-mode`. If the writing mode is vertically oriented, the value of `max-inline-size` relates to the maximal height of the element, otherwise it relates to the maximal width of the element. It relates to `max-block-size`, which defines the other dimension of the element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |   Safari   | Edge | IE  |
    * | :----: | :-----: | :--------: | :--: | :-: |
    * | **57** | **41**  |  **12.1**  |  No  | No  |
    * |        |         | 10.1 _-x-_ |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-inline-size
    */
  var `max-inline-size`: js.UndefOr[MaxInlineSizeProperty[TLength] | js.Array[MaxInlineSizeProperty[TLength]]] = js.native
  /** **Initial value**: `none` */
  var `max-lines`: js.UndefOr[MaxLinesProperty | js.Array[MaxLinesProperty]] = js.native
  /**
    * The **`max-width`** CSS property sets the maximum width of an element. It prevents the used value of the `width` property from becoming larger than the value specified by `max-width`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-width
    */
  var `max-width`: js.UndefOr[MaxWidthProperty[TLength] | js.Array[MaxWidthProperty[TLength]]] = js.native
  /**
    * The **`min-block-size`** CSS property defines the minimum horizontal or vertical size of an element's block, depending on its writing mode. It corresponds to either the `min-width` or the `min-height` property, depending on the value of `writing-mode`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-block-size
    */
  var `min-block-size`: js.UndefOr[MinBlockSizeProperty[TLength] | js.Array[MinBlockSizeProperty[TLength]]] = js.native
  /**
    * The **`min-height`** CSS property sets the minimum height of an element. It prevents the used value of the `height` property from becoming smaller than the value specified for `min-height`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **3**  | **1.3** | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-height
    */
  var `min-height`: js.UndefOr[MinHeightProperty[TLength] | js.Array[MinHeightProperty[TLength]]] = js.native
  /**
    * The **`min-inline-size`** CSS property defines the horizontal or vertical minimal size of an element's block, depending on its writing mode. It corresponds to either the `min-width` or the `min-height` property, depending on the value of `writing-mode`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-inline-size
    */
  var `min-inline-size`: js.UndefOr[MinInlineSizeProperty[TLength] | js.Array[MinInlineSizeProperty[TLength]]] = js.native
  /**
    * The **`min-width`** CSS property sets the minimum width of an element. It prevents the used value of the `width` property from becoming smaller than the value specified for `min-width`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-width
    */
  var `min-width`: js.UndefOr[MinWidthProperty[TLength] | js.Array[MinWidthProperty[TLength]]] = js.native
  /**
    * The **`mix-blend-mode`** CSS property sets how an element's content should blend with the content of the element's parent and the element's background.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **41** | **32**  | **8**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mix-blend-mode
    */
  var `mix-blend-mode`: js.UndefOr[MixBlendModeProperty | js.Array[MixBlendModeProperty]] = js.native
  /**
    * The **`offset-distance`** CSS property specifies a position along an `offset-path`.
    *
    * **Initial value**: `0`
    *
    * |         Chrome         | Firefox | Safari | Edge | IE  |
    * | :--------------------: | :-----: | :----: | :--: | :-: |
    * |         **55**         |   No    |   No   |  No  | No  |
    * | 46 _(motion-distance)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-distance
    */
  var `motion-distance`: js.UndefOr[OffsetDistanceProperty[TLength] | js.Array[OffsetDistanceProperty[TLength]]] = js.native
  /**
    * The **`offset-path`** CSS property specifies a motion path for an element to follow and defines the element's positioning within the parent container or SVG coordinate system.
    *
    * **Initial value**: `none`
    *
    * |       Chrome       | Firefox | Safari | Edge | IE  |
    * | :----------------: | :-----: | :----: | :--: | :-: |
    * |       **55**       |   n/a   |   No   |  No  | No  |
    * | 46 _(motion-path)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-path
    */
  var `motion-path`: js.UndefOr[OffsetPathProperty | js.Array[OffsetPathProperty]] = js.native
  /**
    * The **`offset-rotate`** CSS property defines the direction of the element while positioning along the offset path.
    *
    * **Initial value**: `auto`
    *
    * |         Chrome         | Firefox | Safari | Edge | IE  |
    * | :--------------------: | :-----: | :----: | :--: | :-: |
    * |         **56**         |   No    |   No   |  No  | No  |
    * | 46 _(motion-rotation)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-rotate
    */
  var `motion-rotation`: js.UndefOr[OffsetRotateProperty | js.Array[OffsetRotateProperty]] = js.native
  /**
    * The **`object-fit`** CSS property sets how the content of a replaced element, such as an `<img>` or `<video>`, should be resized to fit its container.
    *
    * **Initial value**: `fill`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **31** | **36**  | **10** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/object-fit
    */
  var `object-fit`: js.UndefOr[ObjectFitProperty | js.Array[ObjectFitProperty]] = js.native
  /**
    * The **`object-position`** CSS property specifies the alignment of the selected replaced element's contents within the element's box. Areas of the box which aren't covered by the replaced element's object will show the element's background.
    *
    * **Initial value**: `50% 50%`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **31** | **36**  | **10** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/object-position
    */
  var `object-position`: js.UndefOr[ObjectPositionProperty[TLength] | js.Array[ObjectPositionProperty[TLength]]] = js.native
  /** **Initial value**: `auto` */
  var `offset-anchor`: js.UndefOr[OffsetAnchorProperty[TLength] | js.Array[OffsetAnchorProperty[TLength]]] = js.native
  /**
    * The **`offset-distance`** CSS property specifies a position along an `offset-path`.
    *
    * **Initial value**: `0`
    *
    * |         Chrome         | Firefox | Safari | Edge | IE  |
    * | :--------------------: | :-----: | :----: | :--: | :-: |
    * |         **55**         |   No    |   No   |  No  | No  |
    * | 46 _(motion-distance)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-distance
    */
  var `offset-distance`: js.UndefOr[OffsetDistanceProperty[TLength] | js.Array[OffsetDistanceProperty[TLength]]] = js.native
  /**
    * The **`offset-path`** CSS property specifies a motion path for an element to follow and defines the element's positioning within the parent container or SVG coordinate system.
    *
    * **Initial value**: `none`
    *
    * |       Chrome       | Firefox | Safari | Edge | IE  |
    * | :----------------: | :-----: | :----: | :--: | :-: |
    * |       **55**       |   n/a   |   No   |  No  | No  |
    * | 46 _(motion-path)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-path
    */
  var `offset-path`: js.UndefOr[OffsetPathProperty | js.Array[OffsetPathProperty]] = js.native
  /** **Initial value**: `auto` */
  var `offset-position`: js.UndefOr[OffsetPositionProperty[TLength] | js.Array[OffsetPositionProperty[TLength]]] = js.native
  /**
    * The **`offset-rotate`** CSS property defines the direction of the element while positioning along the offset path.
    *
    * **Initial value**: `auto`
    *
    * |         Chrome         | Firefox | Safari | Edge | IE  |
    * | :--------------------: | :-----: | :----: | :--: | :-: |
    * |         **56**         |   No    |   No   |  No  | No  |
    * | 46 _(motion-rotation)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-rotate
    */
  var `offset-rotate`: js.UndefOr[OffsetRotateProperty | js.Array[OffsetRotateProperty]] = js.native
  /**
    * The **`offset-rotate`** CSS property defines the direction of the element while positioning along the offset path.
    *
    * **Initial value**: `auto`
    *
    * |         Chrome         | Firefox | Safari | Edge | IE  |
    * | :--------------------: | :-----: | :----: | :--: | :-: |
    * |         **56**         |   No    |   No   |  No  | No  |
    * | 46 _(motion-rotation)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-rotate
    */
  var `offset-rotation`: js.UndefOr[OffsetRotateProperty | js.Array[OffsetRotateProperty]] = js.native
  /**
    * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
    *
    * **Initial value**: `1.0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **2**  | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/opacity
    */
  var opacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`order`** CSS property sets the order to lay out an item in a flex or grid container. Items in a container are sorted by ascending `order` value and then by their source code order.
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
    * **Initial value**: `invert`, for browsers supporting it, `currentColor` for the other
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-color
    */
  var `outline-color`: js.UndefOr[OutlineColorProperty | js.Array[OutlineColorProperty]] = js.native
  /**
    * The **`outline-offset`** CSS property sets the amount of space between an outline and the edge or border of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari  |  Edge  | IE  |
    * | :----: | :-----: | :-----: | :----: | :-: |
    * | **1**  | **1.5** | **1.2** | **15** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-offset
    */
  var `outline-offset`: js.UndefOr[OutlineOffsetProperty[TLength] | js.Array[OutlineOffsetProperty[TLength]]] = js.native
  /**
    * The **`outline-style`** CSS property sets the style of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-style
    */
  var `outline-style`: js.UndefOr[OutlineStyleProperty | js.Array[OutlineStyleProperty]] = js.native
  /**
    * The **`outline-width`** CSS property sets the thickness of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-width
    */
  var `outline-width`: js.UndefOr[OutlineWidthProperty[TLength] | js.Array[OutlineWidthProperty[TLength]]] = js.native
  /**
    * The **`overflow`** CSS property sets what to do when an element's content is too big to fit in its block formatting context. It is a shorthand for `overflow-x` and `overflow-y`.
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow
    */
  var overflow: js.UndefOr[OverflowProperty | js.Array[OverflowProperty]] = js.native
  /**
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **56** | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-anchor
    */
  var `overflow-anchor`: js.UndefOr[OverflowAnchorProperty | js.Array[OverflowAnchorProperty]] = js.native
  /**
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **69**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-block
    */
  var `overflow-block`: js.UndefOr[OverflowBlockProperty | js.Array[OverflowBlockProperty]] = js.native
  /**
    * The **`overflow-clip-box`** CSS property specifies relative to which box the clipping happens when there is an overflow. It is short hand for the `overflow-clip-box-inline` and `overflow-clip-box-block` properties.
    *
    * **Initial value**: `padding-box`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **29**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Mozilla/CSS/overflow-clip-box
    */
  var `overflow-clip-box`: js.UndefOr[OverflowClipBoxProperty | js.Array[OverflowClipBoxProperty]] = js.native
  /**
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **69**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-inline
    */
  var `overflow-inline`: js.UndefOr[OverflowInlineProperty | js.Array[OverflowInlineProperty]] = js.native
  /**
    * The `**overflow-wrap**` CSS property sets whether the browser should insert line breaks within words to prevent text from overflowing its content box.
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
  var `overflow-wrap`: js.UndefOr[OverflowWrapProperty | js.Array[OverflowWrapProperty]] = js.native
  /**
    * The **`overflow-x`** CSS property sets what shows when content overflows a block-level element's left and right edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  | **3.5** | **3**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-x
    */
  var `overflow-x`: js.UndefOr[OverflowXProperty | js.Array[OverflowXProperty]] = js.native
  /**
    * The **`overflow-y`** CSS property sets what shows when content overflows a block-level element's top and bottom edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  | **1.5** | **3**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-y
    */
  var `overflow-y`: js.UndefOr[OverflowYProperty | js.Array[OverflowYProperty]] = js.native
  /**
    * The **`overscroll-behavior`** CSS property sets what a browser does when reaching the boundary of a scrolling area. It's a shorthand for `overscroll-behavior-x` and `overscroll-behavior-y`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **63** | **59**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior
    */
  var `overscroll-behavior`: js.UndefOr[OverscrollBehaviorProperty | js.Array[OverscrollBehaviorProperty]] = js.native
  /**
    * The **`overscroll-behavior-x`** CSS property sets the browser's behavior when the horizontal boundary of a scrolling area is reached.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **63** | **59**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior-x
    */
  var `overscroll-behavior-x`: js.UndefOr[OverscrollBehaviorXProperty | js.Array[OverscrollBehaviorXProperty]] = js.native
  /**
    * The **`overscroll-behavior-y`** CSS property sets the browser's behavior when the vertical boundary of a scrolling area is reached.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **63** | **59**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior-y
    */
  var `overscroll-behavior-y`: js.UndefOr[OverscrollBehaviorYProperty | js.Array[OverscrollBehaviorYProperty]] = js.native
  /**
    * The **`padding-block`** CSS property defines the logical block start and end padding of an element, which maps to physical padding properties depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-block
    */
  var `padding-block`: js.UndefOr[PaddingBlockProperty[TLength] | js.Array[PaddingBlockProperty[TLength]]] = js.native
  /**
    * The **`padding-block-end`** CSS property defines the logical block end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-block-end
    */
  var `padding-block-end`: js.UndefOr[PaddingBlockEndProperty[TLength] | js.Array[PaddingBlockEndProperty[TLength]]] = js.native
  /**
    * The **`padding-block-start`** CSS property defines the logical block start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-block-start
    */
  var `padding-block-start`: js.UndefOr[
    PaddingBlockStartProperty[TLength] | js.Array[PaddingBlockStartProperty[TLength]]
  ] = js.native
  /**
    * The **`padding-bottom`** CSS property sets the height of the padding area on the bottom of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-bottom
    */
  var `padding-bottom`: js.UndefOr[PaddingBottomProperty[TLength] | js.Array[PaddingBottomProperty[TLength]]] = js.native
  /**
    * The **`padding-inline`** CSS property defines the logical inline start and end padding of an element, which maps to physical padding properties depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-inline
    */
  var `padding-inline`: js.UndefOr[PaddingInlineProperty[TLength] | js.Array[PaddingInlineProperty[TLength]]] = js.native
  /**
    * The **`padding-inline-end`** CSS property defines the logical inline end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * |          Chrome           |        Firefox         |          Safari           | Edge | IE  |
    * | :-----------------------: | :--------------------: | :-----------------------: | :--: | :-: |
    * |          **69**           |         **41**         |         **12.1**          |  No  | No  |
    * | 2 _(-webkit-padding-end)_ | 3 _(-moz-padding-end)_ | 3 _(-webkit-padding-end)_ |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-inline-end
    */
  var `padding-inline-end`: js.UndefOr[PaddingInlineEndProperty[TLength] | js.Array[PaddingInlineEndProperty[TLength]]] = js.native
  /**
    * The **`padding-inline-start`** CSS property defines the logical inline start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * |           Chrome            |         Firefox          |           Safari            | Edge | IE  |
    * | :-------------------------: | :----------------------: | :-------------------------: | :--: | :-: |
    * |           **69**            |          **41**          |          **12.1**           |  No  | No  |
    * | 2 _(-webkit-padding-start)_ | 3 _(-moz-padding-start)_ | 3 _(-webkit-padding-start)_ |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-inline-start
    */
  var `padding-inline-start`: js.UndefOr[
    PaddingInlineStartProperty[TLength] | js.Array[PaddingInlineStartProperty[TLength]]
  ] = js.native
  /**
    * The **`padding-left`** CSS property sets the width of the padding area on the left side of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-left
    */
  var `padding-left`: js.UndefOr[PaddingLeftProperty[TLength] | js.Array[PaddingLeftProperty[TLength]]] = js.native
  /**
    * The **`padding-right`** CSS property sets the width of the padding area on the right side of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-right
    */
  var `padding-right`: js.UndefOr[PaddingRightProperty[TLength] | js.Array[PaddingRightProperty[TLength]]] = js.native
  /**
    * The **`padding-top`** padding area on the top of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-top
    */
  var `padding-top`: js.UndefOr[PaddingTopProperty[TLength] | js.Array[PaddingTopProperty[TLength]]] = js.native
  /**
    * The **`page-break-after`** CSS property adjusts page breaks _after_ the current element.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/page-break-after
    */
  var `page-break-after`: js.UndefOr[PageBreakAfterProperty | js.Array[PageBreakAfterProperty]] = js.native
  /**
    * The **`page-break-before`** CSS property adjusts page breaks _before_ the current element.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/page-break-before
    */
  var `page-break-before`: js.UndefOr[PageBreakBeforeProperty | js.Array[PageBreakBeforeProperty]] = js.native
  /**
    * The **`page-break-inside`** CSS property adjusts page breaks _inside_ the current element.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **19**  | **1.3** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/page-break-inside
    */
  var `page-break-inside`: js.UndefOr[PageBreakInsideProperty | js.Array[PageBreakInsideProperty]] = js.native
  /**
    * The **`paint-order`** CSS property lets you control the order in which the fill and stroke (and painting markers) of text content and shapes are drawn.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **35** | **60**  |  Yes   | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/paint-order
    */
  var `paint-order`: js.UndefOr[PaintOrderProperty | js.Array[PaintOrderProperty]] = js.native
  /**
    * The **`perspective`** CSS property determines the distance between the z=0 plane and the user in order to give a 3D-positioned element some perspective. Each 3D element with z>0 becomes larger; each 3D-element with z<0 becomes smaller. The strength of the effect is determined by the value of this property.
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
    * **Initial value**: `50% 50%`
    *
    * |  Chrome  | Firefox  | Safari  |  Edge  |   IE   |
    * | :------: | :------: | :-----: | :----: | :----: |
    * |  **36**  |  **16**  |  **9**  | **12** | **10** |
    * | 12 _-x-_ | 10 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/perspective-origin
    */
  var `perspective-origin`: js.UndefOr[
    PerspectiveOriginProperty[TLength] | js.Array[PerspectiveOriginProperty[TLength]]
  ] = js.native
  /**
    * The `**place-content**` CSS property is a shorthand for `align-content` and `justify-content`. It can be used in any layout method which utilizes both of these alignment values.
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **59** | **45**  |  Yes   |  No  | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **59** | **53**  |  Yes   |  No  | No  |
    *
    * ---
    *
    * _You can only specify a single value if it is valid for both <code>align-content</code> and <code>justify-content</code>_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   | **60**  |  Yes   |  No  | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/place-content
    */
  var `place-content`: js.UndefOr[PlaceContentProperty | js.Array[PlaceContentProperty]] = js.native
  /**
    * The **`pointer-events`** CSS property sets under what circumstances (if any) a particular graphic element can become the target of mouse events.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **1**  | **1.5** | **4**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/pointer-events
    */
  var `pointer-events`: js.UndefOr[PointerEventsProperty | js.Array[PointerEventsProperty]] = js.native
  /**
    * The **`position`** CSS property sets how an element is positioned in a document. The `top`, `right`, `bottom`, and `left` properties determine the final location of positioned elements.
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
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **1**  |  **4**  | **3**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/resize
    */
  var resize: js.UndefOr[ResizeProperty | js.Array[ResizeProperty]] = js.native
  /**
    * The **`right`** CSS property participates in specifying the horizontal position of a _positioned element_. It has no effect on non-positioned elements.
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
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   n/a   |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/rotate
    */
  var rotate: js.UndefOr[RotateProperty | js.Array[RotateProperty]] = js.native
  /**
    * The **`row-gap`** CSS property sets the size of the gap (gutter) between an element's grid rows.
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
  var `row-gap`: js.UndefOr[RowGapProperty[TLength] | js.Array[RowGapProperty[TLength]]] = js.native
  /**
    * The `**ruby-align**` CSS property defines the distribution of the different ruby elements over the base.
    *
    * **Initial value**: `space-around`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **38**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/ruby-align
    */
  var `ruby-align`: js.UndefOr[RubyAlignProperty | js.Array[RubyAlignProperty]] = js.native
  /** **Initial value**: `separate` */
  var `ruby-merge`: js.UndefOr[RubyMergeProperty | js.Array[RubyMergeProperty]] = js.native
  /**
    * The `**ruby-position**` CSS property defines the position of a ruby element relatives to its base element. It can be position over the element (`over`), under it (`under`), or between the characters, on their right side (`inter-character`).
    *
    * **Initial value**: `over`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * |   No   | **38**  |   No   | **12** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/ruby-position
    */
  var `ruby-position`: js.UndefOr[RubyPositionProperty | js.Array[RubyPositionProperty]] = js.native
  /**
    * The **`scale`** CSS property allows you to specify scale transforms individually and independantly of the `transform` property. This maps better to typical user interface usage, and saves having to remember the exact order of transform functions to specify in the `transform` value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   n/a   |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scale
    */
  var scale: js.UndefOr[ScaleProperty | js.Array[ScaleProperty]] = js.native
  /**
    * The **`scroll-behavior`** CSS property sets the behavior for a scrolling box when scrolling is triggered by the navigation or CSSOM scrolling APIs.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **61** | **36**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-behavior
    */
  var `scroll-behavior`: js.UndefOr[ScrollBehaviorProperty | js.Array[ScrollBehaviorProperty]] = js.native
  /**
    * The **`scroll-margin`** property is a shorthand property which sets all of the `scroll-margin` longhands, assigning values much like the `margin` property does for the `margin-*` longhands.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin
    */
  var `scroll-margin`: js.UndefOr[ScrollMarginProperty[TLength] | js.Array[ScrollMarginProperty[TLength]]] = js.native
  /**
    * The `scroll-margin-block` property is a shorthand property which sets the scroll-margin longhands in the block dimension.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block
    */
  var `scroll-margin-block`: js.UndefOr[
    ScrollMarginBlockProperty[TLength] | js.Array[ScrollMarginBlockProperty[TLength]]
  ] = js.native
  /**
    * The `scroll-margin-block-end` property defines the margin of the scroll snap area at the end of the block dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block-end
    */
  var `scroll-margin-block-end`: js.UndefOr[
    ScrollMarginBlockEndProperty[TLength] | js.Array[ScrollMarginBlockEndProperty[TLength]]
  ] = js.native
  /**
    * The `scroll-margin-block-start` property defines the margin of the scroll snap area at the start of the block dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block-start
    */
  var `scroll-margin-block-start`: js.UndefOr[
    ScrollMarginBlockStartProperty[TLength] | js.Array[ScrollMarginBlockStartProperty[TLength]]
  ] = js.native
  /**
    * The `scroll-margin-bottom` property defines the bottom margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-bottom
    */
  var `scroll-margin-bottom`: js.UndefOr[
    ScrollMarginBottomProperty[TLength] | js.Array[ScrollMarginBottomProperty[TLength]]
  ] = js.native
  /**
    * The `scroll-margin-inline` property is a shorthand property which sets the scroll-margin longhands in the inline dimension.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **68**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-inline
    */
  var `scroll-margin-inline`: js.UndefOr[
    ScrollMarginInlineProperty[TLength] | js.Array[ScrollMarginInlineProperty[TLength]]
  ] = js.native
  /**
    * The `scroll-margin-inline-end` property defines the margin of the scroll snap area at the end of the inline dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-inline-end
    */
  var `scroll-margin-inline-end`: js.UndefOr[
    ScrollMarginInlineEndProperty[TLength] | js.Array[ScrollMarginInlineEndProperty[TLength]]
  ] = js.native
  /**
    * The `scroll-margin-inline-start` property defines the margin of the scroll snap area at the start of the inline dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-inline-start
    */
  var `scroll-margin-inline-start`: js.UndefOr[
    ScrollMarginInlineStartProperty[TLength] | js.Array[ScrollMarginInlineStartProperty[TLength]]
  ] = js.native
  /**
    * The `scroll-margin-left` property defines the left margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-left
    */
  var `scroll-margin-left`: js.UndefOr[ScrollMarginLeftProperty[TLength] | js.Array[ScrollMarginLeftProperty[TLength]]] = js.native
  /**
    * The `scroll-margin-right` property defines the right margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-right
    */
  var `scroll-margin-right`: js.UndefOr[
    ScrollMarginRightProperty[TLength] | js.Array[ScrollMarginRightProperty[TLength]]
  ] = js.native
  /**
    * The `scroll-margin-top` property defines the top margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-top
    */
  var `scroll-margin-top`: js.UndefOr[ScrollMarginTopProperty[TLength] | js.Array[ScrollMarginTopProperty[TLength]]] = js.native
  /**
    * The scroll-padding property is a shorthand property which sets all of the scroll-padding longhands, assigning values much like the padding property does for the padding-\* longhands.  
    
  The scroll-padding properties define offsets for the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    * 
    * **Initial value**: `auto`
    * 
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    * 
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding
    */
  var `scroll-padding`: js.UndefOr[ScrollPaddingProperty[TLength] | js.Array[ScrollPaddingProperty[TLength]]] = js.native
  /**
    * The `scroll-padding-block` property is a shorthand property which sets the scroll-padding longhands for the block dimension.  
    
  The scroll-padding properties define offsets for the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    * 
    * **Initial value**: `auto`
    * 
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  |   No   |  No  | No  |
    * 
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block
    */
  var `scroll-padding-block`: js.UndefOr[
    ScrollPaddingBlockProperty[TLength] | js.Array[ScrollPaddingBlockProperty[TLength]]
  ] = js.native
  /**
    * The `scroll-padding-block-end` property defines offsets for the end edge in the block dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block-end
    */
  var `scroll-padding-block-end`: js.UndefOr[
    ScrollPaddingBlockEndProperty[TLength] | js.Array[ScrollPaddingBlockEndProperty[TLength]]
  ] = js.native
  /**
    * The `scroll-padding-block-start` property defines offsets for the start edge in the block dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block-start
    */
  var `scroll-padding-block-start`: js.UndefOr[
    ScrollPaddingBlockStartProperty[TLength] | js.Array[ScrollPaddingBlockStartProperty[TLength]]
  ] = js.native
  /**
    * The `scroll-padding-bottom` property defines offsets for the bottom of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-bottom
    */
  var `scroll-padding-bottom`: js.UndefOr[
    ScrollPaddingBottomProperty[TLength] | js.Array[ScrollPaddingBottomProperty[TLength]]
  ] = js.native
  /**
    * The `scroll-padding-inline` property is a shorthand property which sets the scroll-padding longhands for the inline dimension.  
    
  The scroll-padding properties define offsets for the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    * 
    * **Initial value**: `auto`
    * 
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  |   No   |  No  | No  |
    * 
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline
    */
  var `scroll-padding-inline`: js.UndefOr[
    ScrollPaddingInlineProperty[TLength] | js.Array[ScrollPaddingInlineProperty[TLength]]
  ] = js.native
  /**
    * The `scroll-padding-inline-end` property defines offsets for the end edge in the inline dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline-end
    */
  var `scroll-padding-inline-end`: js.UndefOr[
    ScrollPaddingInlineEndProperty[TLength] | js.Array[ScrollPaddingInlineEndProperty[TLength]]
  ] = js.native
  /**
    * The `scroll-padding-inline-start` property defines offsets for the start edge in the inline dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline-start
    */
  var `scroll-padding-inline-start`: js.UndefOr[
    ScrollPaddingInlineStartProperty[TLength] | js.Array[ScrollPaddingInlineStartProperty[TLength]]
  ] = js.native
  /**
    * The `scroll-padding-left` property defines offsets for the left of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-left
    */
  var `scroll-padding-left`: js.UndefOr[
    ScrollPaddingLeftProperty[TLength] | js.Array[ScrollPaddingLeftProperty[TLength]]
  ] = js.native
  /**
    * The `scroll-padding-right` property defines offsets for the right of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-right
    */
  var `scroll-padding-right`: js.UndefOr[
    ScrollPaddingRightProperty[TLength] | js.Array[ScrollPaddingRightProperty[TLength]]
  ] = js.native
  /**
    * The `scroll-padding-top` property defines offsets for the top of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-top
    */
  var `scroll-padding-top`: js.UndefOr[ScrollPaddingTopProperty[TLength] | js.Array[ScrollPaddingTopProperty[TLength]]] = js.native
  /**
    * The `scroll-snap-align` property specifies the box’s snap position as an alignment of its snap area (as the alignment subject) within its snap container’s snapport (as the alignment container). The two values specify the snapping alignment in the block axis and inline axis, respectively. If only one value is specified, the second value defaults to the same value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-snap-align
    */
  var `scroll-snap-align`: js.UndefOr[ScrollSnapAlignProperty | js.Array[ScrollSnapAlignProperty]] = js.native
  /**
    * The **`scroll-snap-stop`** CSS property defines whether the scroll container is allowed to "pass over" possible snap positions.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **75** |   No    |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-snap-stop
    */
  var `scroll-snap-stop`: js.UndefOr[ScrollSnapStopProperty | js.Array[ScrollSnapStopProperty]] = js.native
  /**
    * The **`scroll-snap-type`** CSS property sets how strictly snap points are enforced on the scroll container in case there is one.
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
  var `scroll-snap-type`: js.UndefOr[ScrollSnapTypeProperty | js.Array[ScrollSnapTypeProperty]] = js.native
  /**
    * The **`scrollbar-color`** CSS property sets the color of the scrollbar track and thumb.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **64**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scrollbar-color
    */
  var `scrollbar-color`: js.UndefOr[ScrollbarColorProperty | js.Array[ScrollbarColorProperty]] = js.native
  /**
    * The `scrollbar-width` property allows the author to set the maximum thickness of an element’s scrollbars when they are shown.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **64**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scrollbar-width
    */
  var `scrollbar-width`: js.UndefOr[ScrollbarWidthProperty | js.Array[ScrollbarWidthProperty]] = js.native
  /**
    * The **`shape-image-threshold`** CSS property sets the alpha channel threshold used to extract the shape using an image as the value for `shape-outside`.
    *
    * **Initial value**: `0.0`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **37** | **62**  | **10.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/shape-image-threshold
    */
  var `shape-image-threshold`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`shape-margin`** CSS property sets a margin for a CSS shape created using `shape-outside`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |     Safari     | Edge | IE  |
    * | :----: | :-----: | :------------: | :--: | :-: |
    * | **37** | **62**  | **10.1** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/shape-margin
    */
  var `shape-margin`: js.UndefOr[ShapeMarginProperty[TLength] | js.Array[ShapeMarginProperty[TLength]]] = js.native
  /**
    * The **`shape-outside`** CSS property defines a shape—which may be non-rectangular—around which adjacent inline content should wrap. By default, inline content wraps around its margin box; `shape-outside` provides a way to customize this wrapping, making it possible to wrap text around complex objects rather than simple boxes.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **37** | **62**  | **10.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/shape-outside
    */
  var `shape-outside`: js.UndefOr[ShapeOutsideProperty | js.Array[ShapeOutsideProperty]] = js.native
  /**
    * The **`tab-size`** CSS property is used to customize the width of a tab (`U+0009`) character.
    *
    * **Initial value**: `8`
    *
    * | Chrome |   Firefox   | Safari  | Edge | IE  |
    * | :----: | :---------: | :-----: | :--: | :-: |
    * | **21** | **4** _-x-_ | **6.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/tab-size
    */
  var `tab-size`: js.UndefOr[TabSizeProperty[TLength] | js.Array[TabSizeProperty[TLength]]] = js.native
  /**
    * The **`table-layout`** CSS property sets the algorithm used to lay out `<table>` cells, rows, and columns.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **14** |  **1**  | **1**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/table-layout
    */
  var `table-layout`: js.UndefOr[TableLayoutProperty | js.Array[TableLayoutProperty]] = js.native
  /**
    * The **`text-align`** CSS property sets the horizontal alignment of an inline or table-cell box. This means it works like `vertical-align` but in the horizontal direction.
    *
    * **Initial value**: `start`, or a nameless value that acts as `left` if _direction_ is `ltr`, `right` if _direction_ is `rtl` if `start` is not supported by the browser.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-align
    */
  var `text-align`: js.UndefOr[TextAlignProperty | js.Array[TextAlignProperty]] = js.native
  /**
    * The **`text-align-last`** CSS property sets how the last line of a block or a line, right before a forced line break, is aligned.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **47** | **49**  |   No   | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-align-last
    */
  var `text-align-last`: js.UndefOr[TextAlignLastProperty | js.Array[TextAlignLastProperty]] = js.native
  /**
    * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |                  Edge                  |                   IE                   |
    * | :----: | :-----: | :----: | :------------------------------------: | :------------------------------------: |
    * | **48** | **48**  |  Yes   | **12** _(-ms-text-combine-horizontal)_ | **11** _(-ms-text-combine-horizontal)_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-combine-upright
    */
  var `text-combine-upright`: js.UndefOr[TextCombineUprightProperty | js.Array[TextCombineUprightProperty]] = js.native
  /**
    * The **`text-decoration-color`** CSS property sets the color of decorations added to text by `text-decoration-line`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **36**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-color
    */
  var `text-decoration-color`: js.UndefOr[TextDecorationColorProperty | js.Array[TextDecorationColorProperty]] = js.native
  /**
    * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element, such as an underline or overline.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **36**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-line
    */
  var `text-decoration-line`: js.UndefOr[TextDecorationLineProperty | js.Array[TextDecorationLineProperty]] = js.native
  /**
    * The **`text-decoration-skip`** CSS property sets what parts of an element’s content any text decoration affecting the element must skip over. It controls all text decoration lines drawn by the element and also any text decoration lines drawn by its ancestors.
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
  var `text-decoration-skip`: js.UndefOr[TextDecorationSkipProperty | js.Array[TextDecorationSkipProperty]] = js.native
  /**
    * The **`text-decoration-skip-ink`** CSS property specifies how overlines and underlines are drawn when they pass over glyph ascenders and descenders.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **64** |   No    |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-skip-ink
    */
  var `text-decoration-skip-ink`: js.UndefOr[TextDecorationSkipInkProperty | js.Array[TextDecorationSkipInkProperty]] = js.native
  /**
    * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are set with `text-decoration-line`.
    *
    * **Initial value**: `solid`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **36**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-style
    */
  var `text-decoration-style`: js.UndefOr[TextDecorationStyleProperty | js.Array[TextDecorationStyleProperty]] = js.native
  /**
    * The **`text-emphasis-color`** CSS property sets the color of emphasis marks. This value can also be set using the `text-emphasis` shorthand.
    *
    * **Initial value**: `currentcolor`
    *
    * |    Chrome    | Firefox |    Safari     | Edge | IE  |
    * | :----------: | :-----: | :-----------: | :--: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis-color
    */
  var `text-emphasis-color`: js.UndefOr[TextEmphasisColorProperty | js.Array[TextEmphasisColorProperty]] = js.native
  /**
    * The **`text-emphasis-position`** CSS property sets where emphasis marks are drawn. Like ruby text, if there isn't enough room for emphasis marks, the line height is increased.
    *
    * **Initial value**: `over right`
    *
    * |    Chrome    | Firefox |    Safari     | Edge | IE  |
    * | :----------: | :-----: | :-----------: | :--: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis-position
    */
  var `text-emphasis-position`: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  /**
    * The **`text-emphasis-style`** CSS property sets the appearance of emphasis marks. It can also be set, and reset, using the `text-emphasis` shorthand.
    *
    * **Initial value**: `none`
    *
    * |    Chrome    | Firefox |    Safari     | Edge | IE  |
    * | :----------: | :-----: | :-----------: | :--: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis-style
    */
  var `text-emphasis-style`: js.UndefOr[TextEmphasisStyleProperty | js.Array[TextEmphasisStyleProperty]] = js.native
  /**
    * The **`text-indent`** CSS property sets the length of empty space (indentation) that is put before lines of text in a block.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-indent
    */
  var `text-indent`: js.UndefOr[TextIndentProperty[TLength] | js.Array[TextIndentProperty[TLength]]] = js.native
  /**
    * The **`text-justify`** CSS property sets what type of justification should be applied to text when `text-align``: justify;` is set on an element.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * |  n/a   | **55**  |   No   | **14** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-justify
    */
  var `text-justify`: js.UndefOr[TextJustifyProperty | js.Array[TextJustifyProperty]] = js.native
  /**
    * The **`text-orientation`** CSS property sets the orientation of the text characters in a line. It only affects text in vertical mode (when `writing-mode` is not `horizontal-tb`). It is useful for controlling the display of languages that use vertical script, and also for making vertical table headers.
    *
    * **Initial value**: `mixed`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **48** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-orientation
    */
  var `text-orientation`: js.UndefOr[TextOrientationProperty | js.Array[TextOrientationProperty]] = js.native
  /**
    * The **`text-overflow`** CSS property sets how hidden overflow content is signaled to users. It can be clipped, display an ellipsis ('`…`'), or display a custom string.
    *
    * **Initial value**: `clip`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **7**  | **1.3** | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-overflow
    */
  var `text-overflow`: js.UndefOr[TextOverflowProperty | js.Array[TextOverflowProperty]] = js.native
  /**
    * The **`text-rendering`** CSS property provides information to the rendering engine about what to optimize for when rendering text.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **4**  |  **1**  | **5**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-rendering
    */
  var `text-rendering`: js.UndefOr[TextRenderingProperty | js.Array[TextRenderingProperty]] = js.native
  /**
    * The **`text-shadow`** CSS property adds shadows to text. It accepts a comma-separated list of shadows to be applied to the text and any of its `decorations`. Each shadow is described by some combination of X and Y offsets from the element, blur radius, and color.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE   |
    * | :----: | :-----: | :-----: | :----: | :----: |
    * | **2**  | **3.5** | **1.1** | **12** | **10** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-shadow
    */
  var `text-shadow`: js.UndefOr[TextShadowProperty | js.Array[TextShadowProperty]] = js.native
  /**
    * The **`text-size-adjust`** CSS property controls the text inflation algorithm used on some smartphones and tablets. Other browsers will ignore this property.
    *
    * **Initial value**: `auto` for smartphone browsers supporting inflation, `none` in other cases (and then not modifiable).
    *
    * | Chrome | Firefox | Safari |     Edge     | IE  |
    * | :----: | :-----: | :----: | :----------: | :-: |
    * | **54** |   No    |   No   | **12** _-x-_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-size-adjust
    */
  var `text-size-adjust`: js.UndefOr[TextSizeAdjustProperty | js.Array[TextSizeAdjustProperty]] = js.native
  /**
    * The **`text-transform`** CSS property specifies how to capitalize an element's text. It can be used to make text appear in all-uppercase or all-lowercase, or with each word capitalized. It also can help improve legibility for ruby
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-transform
    */
  var `text-transform`: js.UndefOr[TextTransformProperty | js.Array[TextTransformProperty]] = js.native
  /**
    * The **`text-underline-position`** CSS property specifies the position of the underline which is set using the `text-decoration` property's `underline` value.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **33** |   No    |   No   | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-underline-position
    */
  var `text-underline-position`: js.UndefOr[TextUnderlinePositionProperty | js.Array[TextUnderlinePositionProperty]] = js.native
  /**
    * The **`top`** CSS property participates in specifying the vertical position of a _positioned element_. It has no effect on non-positioned elements.
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
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |    IE    |
    * | :----: | :-----: | :----: | :----: | :------: |
    * | **36** | **52**  | **13** | **12** |  **11**  |
    * |        |         |        |        | 10 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/touch-action
    */
  var `touch-action`: js.UndefOr[TouchActionProperty | js.Array[TouchActionProperty]] = js.native
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari   |  Edge  |   IE    |
    * | :----: | :-----: | :-------: | :----: | :-----: |
    * | **36** | **16**  |   **9**   | **12** | **10**  |
    * |        |         | 3.1 _-x-_ |        | 9 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform
    */
  var transform: js.UndefOr[TransformProperty | js.Array[TransformProperty]] = js.native
  /**
    * The **`transform-box`** CSS property defines the layout box to which the `transform` and `transform-origin` properties relate.
    *
    * **Initial value**: `border-box `
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **64** | **55**  |  n/a   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform-box
    */
  var `transform-box`: js.UndefOr[TransformBoxProperty | js.Array[TransformBoxProperty]] = js.native
  /**
    * The **`transform-origin`** CSS property sets the origin for an element's transformations.
    *
    * **Initial value**: `50% 50% 0`
    *
    * | Chrome |  Firefox  |  Safari   |  Edge  |   IE    |
    * | :----: | :-------: | :-------: | :----: | :-----: |
    * | **36** |  **16**   |   **9**   | **12** | **10**  |
    * |        | 3.5 _-x-_ | 3.1 _-x-_ |        | 9 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform-origin
    */
  var `transform-origin`: js.UndefOr[TransformOriginProperty[TLength] | js.Array[TransformOriginProperty[TLength]]] = js.native
  /**
    * The **`transform-style`** CSS property sets whether children of an element are positioned in the 3D space or are flattened in the plane of the element.
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
  var `transform-style`: js.UndefOr[TransformStyleProperty | js.Array[TransformStyleProperty]] = js.native
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
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
  var `transition-delay`: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
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
  var `transition-duration`: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
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
  var `transition-property`: js.UndefOr[TransitionPropertyProperty | js.Array[TransitionPropertyProperty]] = js.native
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
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
  var `transition-timing-function`: js.UndefOr[TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]] = js.native
  /**
    * The **`translate`** CSS property allows you to specify translation transforms individually and independantly of the `transform` property. This maps better to typical user interface usage, and saves having to remember the exact order of transform functions to specify in the `transform` value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   n/a   |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/translate
    */
  var translate: js.UndefOr[TranslateProperty[TLength] | js.Array[TranslateProperty[TLength]]] = js.native
  /**
    * The **`unicode-bidi`** CSS property, together with the `direction` property, determines how bidirectional text in a document is handled. For example, if a block of content contains both left-to-right and right-to-left text, the user-agent uses a complex Unicode algorithm to decide how to display the text. The `unicode-bidi` property overrides this algorithm and allows the developer to control the text embedding.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE    |
    * | :----: | :-----: | :-----: | :----: | :-----: |
    * | **2**  |  **1**  | **1.3** | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/unicode-bidi
    */
  var `unicode-bidi`: js.UndefOr[UnicodeBidiProperty | js.Array[UnicodeBidiProperty]] = js.native
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Initial value**: `auto`
    *
    * | Chrome  | Firefox |   Safari    |     Edge     |      IE      |
    * | :-----: | :-----: | :---------: | :----------: | :----------: |
    * | **54**  | **69**  | **3** _-x-_ | **12** _-x-_ | **10** _-x-_ |
    * | 6 _-x-_ | 1 _-x-_ |             |              |              |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/user-select
    */
  var `user-select`: js.UndefOr[UserSelectProperty | js.Array[UserSelectProperty]] = js.native
  /**
    * The **`vertical-align`** CSS property sets vertical alignment of an inline or table-cell box.
    *
    * **Initial value**: `baseline`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/vertical-align
    */
  var `vertical-align`: js.UndefOr[VerticalAlignProperty[TLength] | js.Array[VerticalAlignProperty[TLength]]] = js.native
  /**
    * The **`visibility`** CSS property shows or hides an element without changing the layout of a document. The property can also hide rows or columns in a `<table>`.
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
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/white-space
    */
  var `white-space`: js.UndefOr[WhiteSpaceProperty | js.Array[WhiteSpaceProperty]] = js.native
  /**
    * The **`widows`** CSS property sets the minimum number of lines in a block container that must be shown at the _top_ of a page, region, or column.
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
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * |  Yes   |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/width
    */
  var width: js.UndefOr[WidthProperty[TLength] | js.Array[WidthProperty[TLength]]] = js.native
  /**
    * The **`will-change`** CSS property hints to browsers how an element is expected to change. Browsers may set up optimizations before an element is actually changed. These kinds of optimizations can increase the responsiveness of a page by doing potentially expensive work before they are actually required.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  | Edge | IE  |
    * | :----: | :-----: | :-----: | :--: | :-: |
    * | **36** | **36**  | **9.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/will-change
    */
  var `will-change`: js.UndefOr[WillChangeProperty | js.Array[WillChangeProperty]] = js.native
  /**
    * The **`word-break`** CSS property sets whether line breaks appear wherever the text would otherwise overflow its content box.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  | **15**  | **3**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/word-break
    */
  var `word-break`: js.UndefOr[WordBreakProperty | js.Array[WordBreakProperty]] = js.native
  /**
    * The **`word-spacing`** CSS property sets the length of space between words and between tags.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/word-spacing
    */
  var `word-spacing`: js.UndefOr[WordSpacingProperty[TLength] | js.Array[WordSpacingProperty[TLength]]] = js.native
  /**
    * The `**overflow-wrap**` CSS property sets whether the browser should insert line breaks within words to prevent text from overflowing its content box.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  | **3.5** | **2**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-wrap
    */
  var `word-wrap`: js.UndefOr[WordWrapProperty | js.Array[WordWrapProperty]] = js.native
  /**
    * The **`writing-mode`** CSS property sets whether lines of text are laid out horizontally or vertically, as well as the direction in which blocks progress.
    *
    * **Initial value**: `horizontal-tb`
    *
    * |   Chrome    | Firefox |    Safari     |  Edge  |     IE      |
    * | :---------: | :-----: | :-----------: | :----: | :---------: |
    * | **8** _-x-_ | **41**  | **5.1** _-x-_ | **12** | **9** _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/writing-mode
    */
  var `writing-mode`: js.UndefOr[WritingModeProperty | js.Array[WritingModeProperty]] = js.native
  /**
    * The **`z-index`** CSS property sets the z-order of a positioned element and its descendants or flex items. Overlapping elements with a larger z-index cover those with a smaller one.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/z-index
    */
  var `z-index`: js.UndefOr[ZIndexProperty | js.Array[ZIndexProperty]] = js.native
  /**
    * The non-standard **`zoom`** CSS property can be used to control the magnification level of an element. `transform: scale()` should be used instead of this property, if possible. However, unlike CSS Transforms, `zoom` affects the layout size of the element.
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

object StandardLonghandPropertiesHyphenFallback {
  @scala.inline
  def apply[TLength](): StandardLonghandPropertiesHyphenFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardLonghandPropertiesHyphenFallback[TLength]]
  }
  @scala.inline
  implicit class StandardLonghandPropertiesHyphenFallbackOps[Self[tlength] <: StandardLonghandPropertiesHyphenFallback[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def `withAlign-content`(value: AlignContentProperty | js.Array[AlignContentProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align-content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAlign-content`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align-content")(js.undefined)
        ret
    }
    @scala.inline
    def `withAlign-items`(value: AlignItemsProperty | js.Array[AlignItemsProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align-items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAlign-items`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align-items")(js.undefined)
        ret
    }
    @scala.inline
    def `withAlign-self`(value: AlignSelfProperty | js.Array[AlignSelfProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align-self")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAlign-self`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align-self")(js.undefined)
        ret
    }
    @scala.inline
    def `withAnimation-delay`(value: GlobalsString | js.Array[GlobalsString]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation-delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAnimation-delay`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation-delay")(js.undefined)
        ret
    }
    @scala.inline
    def `withAnimation-direction`(value: AnimationDirectionProperty | js.Array[AnimationDirectionProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation-direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAnimation-direction`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation-direction")(js.undefined)
        ret
    }
    @scala.inline
    def `withAnimation-duration`(value: GlobalsString | js.Array[GlobalsString]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation-duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAnimation-duration`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation-duration")(js.undefined)
        ret
    }
    @scala.inline
    def `withAnimation-fill-mode`(value: AnimationFillModeProperty | js.Array[AnimationFillModeProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation-fill-mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAnimation-fill-mode`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation-fill-mode")(js.undefined)
        ret
    }
    @scala.inline
    def `withAnimation-iteration-count`(value: AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation-iteration-count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAnimation-iteration-count`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation-iteration-count")(js.undefined)
        ret
    }
    @scala.inline
    def `withAnimation-name`(value: AnimationNameProperty | js.Array[AnimationNameProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAnimation-name`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation-name")(js.undefined)
        ret
    }
    @scala.inline
    def `withAnimation-play-state`(value: AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation-play-state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAnimation-play-state`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation-play-state")(js.undefined)
        ret
    }
    @scala.inline
    def `withAnimation-timing-function`(value: AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation-timing-function")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAnimation-timing-function`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation-timing-function")(js.undefined)
        ret
    }
    @scala.inline
    def withAppearance(value: AppearanceProperty | js.Array[AppearanceProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppearance: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearance")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackdrop-filter`(value: BackdropFilterProperty | js.Array[BackdropFilterProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdrop-filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackdrop-filter`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdrop-filter")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackface-visibility`(value: BackfaceVisibilityProperty | js.Array[BackfaceVisibilityProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backface-visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackface-visibility`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backface-visibility")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-attachment`(value: BackgroundAttachmentProperty | js.Array[BackgroundAttachmentProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-attachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-attachment`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-attachment")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-blend-mode`(value: BackgroundBlendModeProperty | js.Array[BackgroundBlendModeProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-blend-mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-blend-mode`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-blend-mode")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-clip`(value: BackgroundClipProperty | js.Array[BackgroundClipProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-clip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-clip`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-clip")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-color`(value: BackgroundColorProperty | js.Array[BackgroundColorProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-color`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-image`(value: BackgroundImageProperty | js.Array[BackgroundImageProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-image`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-image")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-origin`(value: BackgroundOriginProperty | js.Array[BackgroundOriginProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-origin`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-origin")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-position`(value: BackgroundPositionProperty[TLength] | js.Array[BackgroundPositionProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-position`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-position")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-position-x`(value: BackgroundPositionXProperty[TLength] | js.Array[BackgroundPositionXProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-position-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-position-x`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-position-x")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-position-y`(value: BackgroundPositionYProperty[TLength] | js.Array[BackgroundPositionYProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-position-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-position-y`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-position-y")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-repeat`(value: BackgroundRepeatProperty | js.Array[BackgroundRepeatProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-repeat`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-repeat")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-size`(value: BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-size`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withBlock-overflow`(value: BlockOverflowProperty | js.Array[BlockOverflowProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block-overflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBlock-overflow`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block-overflow")(js.undefined)
        ret
    }
    @scala.inline
    def `withBlock-size`(value: BlockSizeProperty[TLength] | js.Array[BlockSizeProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBlock-size`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-block-color`(value: BorderBlockColorProperty | js.Array[BorderBlockColorProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-block-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-block-color`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-block-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-block-end-color`(value: BorderBlockEndColorProperty | js.Array[BorderBlockEndColorProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-block-end-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-block-end-color`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-block-end-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-block-end-style`(value: BorderBlockEndStyleProperty | js.Array[BorderBlockEndStyleProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-block-end-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-block-end-style`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-block-end-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-block-end-width`(value: BorderBlockEndWidthProperty[TLength] | js.Array[BorderBlockEndWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-block-end-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-block-end-width`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-block-end-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-block-start-color`(value: BorderBlockStartColorProperty | js.Array[BorderBlockStartColorProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-block-start-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-block-start-color`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-block-start-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-block-start-style`(value: BorderBlockStartStyleProperty | js.Array[BorderBlockStartStyleProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-block-start-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-block-start-style`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-block-start-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-block-start-width`(value: BorderBlockStartWidthProperty[TLength] | js.Array[BorderBlockStartWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-block-start-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-block-start-width`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-block-start-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-block-style`(value: BorderBlockStyleProperty | js.Array[BorderBlockStyleProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-block-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-block-style`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-block-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-block-width`(value: BorderBlockWidthProperty[TLength] | js.Array[BorderBlockWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-block-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-block-width`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-block-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-bottom-color`(value: BorderBottomColorProperty | js.Array[BorderBottomColorProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-bottom-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-bottom-color`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-bottom-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-bottom-left-radius`(value: BorderBottomLeftRadiusProperty[TLength] | js.Array[BorderBottomLeftRadiusProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-bottom-left-radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-bottom-left-radius`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-bottom-left-radius")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-bottom-right-radius`(
      value: BorderBottomRightRadiusProperty[TLength] | js.Array[BorderBottomRightRadiusProperty[TLength]]
    ): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-bottom-right-radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-bottom-right-radius`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-bottom-right-radius")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-bottom-style`(value: BorderBottomStyleProperty | js.Array[BorderBottomStyleProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-bottom-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-bottom-style`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-bottom-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-bottom-width`(value: BorderBottomWidthProperty[TLength] | js.Array[BorderBottomWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-bottom-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-bottom-width`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-bottom-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-collapse`(value: BorderCollapseProperty | js.Array[BorderCollapseProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-collapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-collapse`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-collapse")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-end-end-radius`(value: BorderEndEndRadiusProperty[TLength] | js.Array[BorderEndEndRadiusProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-end-end-radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-end-end-radius`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-end-end-radius")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-end-start-radius`(value: BorderEndStartRadiusProperty[TLength] | js.Array[BorderEndStartRadiusProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-end-start-radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-end-start-radius`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-end-start-radius")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-image-outset`(value: BorderImageOutsetProperty[TLength] | js.Array[BorderImageOutsetProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-image-outset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-image-outset`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-image-outset")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-image-repeat`(value: BorderImageRepeatProperty | js.Array[BorderImageRepeatProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-image-repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-image-repeat`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-image-repeat")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-image-slice`(value: BorderImageSliceProperty | js.Array[BorderImageSliceProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-image-slice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-image-slice`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-image-slice")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-image-source`(value: BorderImageSourceProperty | js.Array[BorderImageSourceProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-image-source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-image-source`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-image-source")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-image-width`(value: BorderImageWidthProperty[TLength] | js.Array[BorderImageWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-image-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-image-width`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-image-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-inline-color`(value: BorderInlineColorProperty | js.Array[BorderInlineColorProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-inline-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-inline-color`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-inline-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-inline-end-color`(value: BorderInlineEndColorProperty | js.Array[BorderInlineEndColorProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-inline-end-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-inline-end-color`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-inline-end-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-inline-end-style`(value: BorderInlineEndStyleProperty | js.Array[BorderInlineEndStyleProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-inline-end-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-inline-end-style`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-inline-end-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-inline-end-width`(value: BorderInlineEndWidthProperty[TLength] | js.Array[BorderInlineEndWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-inline-end-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-inline-end-width`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-inline-end-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-inline-start-color`(value: BorderInlineStartColorProperty | js.Array[BorderInlineStartColorProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-inline-start-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-inline-start-color`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-inline-start-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-inline-start-style`(value: BorderInlineStartStyleProperty | js.Array[BorderInlineStartStyleProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-inline-start-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-inline-start-style`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-inline-start-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-inline-start-width`(value: BorderInlineStartWidthProperty[TLength] | js.Array[BorderInlineStartWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-inline-start-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-inline-start-width`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-inline-start-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-inline-style`(value: BorderInlineStyleProperty | js.Array[BorderInlineStyleProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-inline-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-inline-style`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-inline-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-inline-width`(value: BorderInlineWidthProperty[TLength] | js.Array[BorderInlineWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-inline-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-inline-width`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-inline-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-left-color`(value: BorderLeftColorProperty | js.Array[BorderLeftColorProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-left-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-left-color`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-left-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-left-style`(value: BorderLeftStyleProperty | js.Array[BorderLeftStyleProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-left-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-left-style`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-left-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-left-width`(value: BorderLeftWidthProperty[TLength] | js.Array[BorderLeftWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-left-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-left-width`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-left-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-right-color`(value: BorderRightColorProperty | js.Array[BorderRightColorProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-right-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-right-color`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-right-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-right-style`(value: BorderRightStyleProperty | js.Array[BorderRightStyleProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-right-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-right-style`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-right-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-right-width`(value: BorderRightWidthProperty[TLength] | js.Array[BorderRightWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-right-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-right-width`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-right-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-spacing`(value: BorderSpacingProperty[TLength] | js.Array[BorderSpacingProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-spacing`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-spacing")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-start-end-radius`(value: BorderStartEndRadiusProperty[TLength] | js.Array[BorderStartEndRadiusProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-start-end-radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-start-end-radius`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-start-end-radius")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-start-start-radius`(value: BorderStartStartRadiusProperty[TLength] | js.Array[BorderStartStartRadiusProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-start-start-radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-start-start-radius`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-start-start-radius")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-top-color`(value: BorderTopColorProperty | js.Array[BorderTopColorProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-top-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-top-color`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-top-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-top-left-radius`(value: BorderTopLeftRadiusProperty[TLength] | js.Array[BorderTopLeftRadiusProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-top-left-radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-top-left-radius`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-top-left-radius")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-top-right-radius`(value: BorderTopRightRadiusProperty[TLength] | js.Array[BorderTopRightRadiusProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-top-right-radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-top-right-radius`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-top-right-radius")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-top-style`(value: BorderTopStyleProperty | js.Array[BorderTopStyleProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-top-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-top-style`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-top-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-top-width`(value: BorderTopWidthProperty[TLength] | js.Array[BorderTopWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-top-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-top-width`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-top-width")(js.undefined)
        ret
    }
    @scala.inline
    def withBottom(value: BottomProperty[TLength] | js.Array[BottomProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def `withBox-decoration-break`(value: BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("box-decoration-break")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBox-decoration-break`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("box-decoration-break")(js.undefined)
        ret
    }
    @scala.inline
    def `withBox-shadow`(value: BoxShadowProperty | js.Array[BoxShadowProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("box-shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBox-shadow`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("box-shadow")(js.undefined)
        ret
    }
    @scala.inline
    def `withBox-sizing`(value: BoxSizingProperty | js.Array[BoxSizingProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("box-sizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBox-sizing`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("box-sizing")(js.undefined)
        ret
    }
    @scala.inline
    def `withBreak-after`(value: BreakAfterProperty | js.Array[BreakAfterProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("break-after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBreak-after`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("break-after")(js.undefined)
        ret
    }
    @scala.inline
    def `withBreak-before`(value: BreakBeforeProperty | js.Array[BreakBeforeProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("break-before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBreak-before`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("break-before")(js.undefined)
        ret
    }
    @scala.inline
    def `withBreak-inside`(value: BreakInsideProperty | js.Array[BreakInsideProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("break-inside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBreak-inside`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("break-inside")(js.undefined)
        ret
    }
    @scala.inline
    def `withCaption-side`(value: CaptionSideProperty | js.Array[CaptionSideProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption-side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCaption-side`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption-side")(js.undefined)
        ret
    }
    @scala.inline
    def `withCaret-color`(value: CaretColorProperty | js.Array[CaretColorProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caret-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCaret-color`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caret-color")(js.undefined)
        ret
    }
    @scala.inline
    def withClear(value: ClearProperty | js.Array[ClearProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClear: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.undefined)
        ret
    }
    @scala.inline
    def `withClip-path`(value: ClipPathProperty | js.Array[ClipPathProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip-path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutClip-path`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip-path")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: ColorProperty | js.Array[ColorProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def `withColor-adjust`(value: ColorAdjustProperty | js.Array[ColorAdjustProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color-adjust")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutColor-adjust`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color-adjust")(js.undefined)
        ret
    }
    @scala.inline
    def `withColumn-count`(value: ColumnCountProperty | js.Array[ColumnCountProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column-count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutColumn-count`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column-count")(js.undefined)
        ret
    }
    @scala.inline
    def `withColumn-fill`(value: ColumnFillProperty | js.Array[ColumnFillProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column-fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutColumn-fill`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column-fill")(js.undefined)
        ret
    }
    @scala.inline
    def `withColumn-gap`(value: ColumnGapProperty[TLength] | js.Array[ColumnGapProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column-gap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutColumn-gap`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column-gap")(js.undefined)
        ret
    }
    @scala.inline
    def `withColumn-rule-color`(value: ColumnRuleColorProperty | js.Array[ColumnRuleColorProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column-rule-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutColumn-rule-color`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column-rule-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withColumn-rule-style`(value: ColumnRuleStyleProperty | js.Array[ColumnRuleStyleProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column-rule-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutColumn-rule-style`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column-rule-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withColumn-rule-width`(value: ColumnRuleWidthProperty[TLength] | js.Array[ColumnRuleWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column-rule-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutColumn-rule-width`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column-rule-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withColumn-span`(value: ColumnSpanProperty | js.Array[ColumnSpanProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column-span")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutColumn-span`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column-span")(js.undefined)
        ret
    }
    @scala.inline
    def `withColumn-width`(value: ColumnWidthProperty[TLength] | js.Array[ColumnWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutColumn-width`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column-width")(js.undefined)
        ret
    }
    @scala.inline
    def withContain(value: ContainProperty | js.Array[ContainProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContain: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contain")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: ContentProperty | js.Array[ContentProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def `withCounter-increment`(value: CounterIncrementProperty | js.Array[CounterIncrementProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter-increment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCounter-increment`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter-increment")(js.undefined)
        ret
    }
    @scala.inline
    def `withCounter-reset`(value: CounterResetProperty | js.Array[CounterResetProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter-reset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCounter-reset`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter-reset")(js.undefined)
        ret
    }
    @scala.inline
    def `withCounter-set`(value: CounterSetProperty | js.Array[CounterSetProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter-set")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCounter-set`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter-set")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: CursorProperty | js.Array[CursorProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: DirectionProperty | js.Array[DirectionProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay(value: DisplayProperty | js.Array[DisplayProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def `withEmpty-cells`(value: EmptyCellsProperty | js.Array[EmptyCellsProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty-cells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutEmpty-cells`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty-cells")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: FilterProperty | js.Array[FilterProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def `withFlex-basis`(value: FlexBasisProperty[TLength] | js.Array[FlexBasisProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex-basis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFlex-basis`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex-basis")(js.undefined)
        ret
    }
    @scala.inline
    def `withFlex-direction`(value: FlexDirectionProperty | js.Array[FlexDirectionProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex-direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFlex-direction`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex-direction")(js.undefined)
        ret
    }
    @scala.inline
    def `withFlex-grow`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex-grow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFlex-grow`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex-grow")(js.undefined)
        ret
    }
    @scala.inline
    def `withFlex-shrink`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex-shrink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFlex-shrink`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex-shrink")(js.undefined)
        ret
    }
    @scala.inline
    def `withFlex-wrap`(value: FlexWrapProperty | js.Array[FlexWrapProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex-wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFlex-wrap`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex-wrap")(js.undefined)
        ret
    }
    @scala.inline
    def withFloat(value: FloatProperty | js.Array[FloatProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloat: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-family`(value: FontFamilyProperty | js.Array[FontFamilyProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-family`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-family")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-feature-settings`(value: FontFeatureSettingsProperty | js.Array[FontFeatureSettingsProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-feature-settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-feature-settings`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-feature-settings")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-kerning`(value: FontKerningProperty | js.Array[FontKerningProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-kerning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-kerning`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-kerning")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-language-override`(value: FontLanguageOverrideProperty | js.Array[FontLanguageOverrideProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-language-override")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-language-override`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-language-override")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-optical-sizing`(value: FontOpticalSizingProperty | js.Array[FontOpticalSizingProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-optical-sizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-optical-sizing`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-optical-sizing")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-size`(value: FontSizeProperty[TLength] | js.Array[FontSizeProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-size`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-size-adjust`(value: FontSizeAdjustProperty | js.Array[FontSizeAdjustProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size-adjust")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-size-adjust`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size-adjust")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-stretch`(value: FontStretchProperty | js.Array[FontStretchProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-stretch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-stretch`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-stretch")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-style`(value: FontStyleProperty | js.Array[FontStyleProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-style`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-synthesis`(value: FontSynthesisProperty | js.Array[FontSynthesisProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-synthesis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-synthesis`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-synthesis")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-variant`(value: FontVariantProperty | js.Array[FontVariantProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-variant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-variant`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-variant")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-variant-caps`(value: FontVariantCapsProperty | js.Array[FontVariantCapsProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-variant-caps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-variant-caps`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-variant-caps")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-variant-east-asian`(value: FontVariantEastAsianProperty | js.Array[FontVariantEastAsianProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-variant-east-asian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-variant-east-asian`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-variant-east-asian")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-variant-ligatures`(value: FontVariantLigaturesProperty | js.Array[FontVariantLigaturesProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-variant-ligatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-variant-ligatures`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-variant-ligatures")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-variant-numeric`(value: FontVariantNumericProperty | js.Array[FontVariantNumericProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-variant-numeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-variant-numeric`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-variant-numeric")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-variant-position`(value: FontVariantPositionProperty | js.Array[FontVariantPositionProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-variant-position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-variant-position`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-variant-position")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-variation-settings`(value: FontVariationSettingsProperty | js.Array[FontVariationSettingsProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-variation-settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-variation-settings`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-variation-settings")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-weight`(value: FontWeightProperty | js.Array[FontWeightProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-weight`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-weight")(js.undefined)
        ret
    }
    @scala.inline
    def `withGrid-auto-columns`(value: GridAutoColumnsProperty[TLength] | js.Array[GridAutoColumnsProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid-auto-columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutGrid-auto-columns`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid-auto-columns")(js.undefined)
        ret
    }
    @scala.inline
    def `withGrid-auto-flow`(value: GridAutoFlowProperty | js.Array[GridAutoFlowProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid-auto-flow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutGrid-auto-flow`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid-auto-flow")(js.undefined)
        ret
    }
    @scala.inline
    def `withGrid-auto-rows`(value: GridAutoRowsProperty[TLength] | js.Array[GridAutoRowsProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid-auto-rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutGrid-auto-rows`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid-auto-rows")(js.undefined)
        ret
    }
    @scala.inline
    def `withGrid-column-end`(value: GridColumnEndProperty | js.Array[GridColumnEndProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid-column-end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutGrid-column-end`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid-column-end")(js.undefined)
        ret
    }
    @scala.inline
    def `withGrid-column-start`(value: GridColumnStartProperty | js.Array[GridColumnStartProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid-column-start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutGrid-column-start`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid-column-start")(js.undefined)
        ret
    }
    @scala.inline
    def `withGrid-row-end`(value: GridRowEndProperty | js.Array[GridRowEndProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid-row-end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutGrid-row-end`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid-row-end")(js.undefined)
        ret
    }
    @scala.inline
    def `withGrid-row-start`(value: GridRowStartProperty | js.Array[GridRowStartProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid-row-start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutGrid-row-start`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid-row-start")(js.undefined)
        ret
    }
    @scala.inline
    def `withGrid-template-areas`(value: GridTemplateAreasProperty | js.Array[GridTemplateAreasProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid-template-areas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutGrid-template-areas`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid-template-areas")(js.undefined)
        ret
    }
    @scala.inline
    def `withGrid-template-columns`(value: GridTemplateColumnsProperty[TLength] | js.Array[GridTemplateColumnsProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid-template-columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutGrid-template-columns`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid-template-columns")(js.undefined)
        ret
    }
    @scala.inline
    def `withGrid-template-rows`(value: GridTemplateRowsProperty[TLength] | js.Array[GridTemplateRowsProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid-template-rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutGrid-template-rows`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid-template-rows")(js.undefined)
        ret
    }
    @scala.inline
    def `withHanging-punctuation`(value: HangingPunctuationProperty | js.Array[HangingPunctuationProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hanging-punctuation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHanging-punctuation`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hanging-punctuation")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: HeightProperty[TLength] | js.Array[HeightProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHyphens(value: HyphensProperty | js.Array[HyphensProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyphens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyphens: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyphens")(js.undefined)
        ret
    }
    @scala.inline
    def `withImage-orientation`(value: ImageOrientationProperty | js.Array[ImageOrientationProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image-orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutImage-orientation`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image-orientation")(js.undefined)
        ret
    }
    @scala.inline
    def `withImage-rendering`(value: ImageRenderingProperty | js.Array[ImageRenderingProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image-rendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutImage-rendering`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image-rendering")(js.undefined)
        ret
    }
    @scala.inline
    def `withImage-resolution`(value: ImageResolutionProperty | js.Array[ImageResolutionProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image-resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutImage-resolution`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image-resolution")(js.undefined)
        ret
    }
    @scala.inline
    def `withInitial-letter`(value: InitialLetterProperty | js.Array[InitialLetterProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial-letter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInitial-letter`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial-letter")(js.undefined)
        ret
    }
    @scala.inline
    def `withInline-size`(value: InlineSizeProperty[TLength] | js.Array[InlineSizeProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInline-size`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline-size")(js.undefined)
        ret
    }
    @scala.inline
    def withInset(value: InsetProperty[TLength] | js.Array[InsetProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInset: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset")(js.undefined)
        ret
    }
    @scala.inline
    def `withInset-block`(value: InsetBlockProperty[TLength] | js.Array[InsetBlockProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset-block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInset-block`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset-block")(js.undefined)
        ret
    }
    @scala.inline
    def `withInset-block-end`(value: InsetBlockEndProperty[TLength] | js.Array[InsetBlockEndProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset-block-end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInset-block-end`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset-block-end")(js.undefined)
        ret
    }
    @scala.inline
    def `withInset-block-start`(value: InsetBlockStartProperty[TLength] | js.Array[InsetBlockStartProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset-block-start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInset-block-start`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset-block-start")(js.undefined)
        ret
    }
    @scala.inline
    def `withInset-inline`(value: InsetInlineProperty[TLength] | js.Array[InsetInlineProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset-inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInset-inline`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset-inline")(js.undefined)
        ret
    }
    @scala.inline
    def `withInset-inline-end`(value: InsetInlineEndProperty[TLength] | js.Array[InsetInlineEndProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset-inline-end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInset-inline-end`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset-inline-end")(js.undefined)
        ret
    }
    @scala.inline
    def `withInset-inline-start`(value: InsetInlineStartProperty[TLength] | js.Array[InsetInlineStartProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset-inline-start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInset-inline-start`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset-inline-start")(js.undefined)
        ret
    }
    @scala.inline
    def withIsolation(value: IsolationProperty | js.Array[IsolationProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsolation: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolation")(js.undefined)
        ret
    }
    @scala.inline
    def `withJustify-content`(value: JustifyContentProperty | js.Array[JustifyContentProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justify-content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJustify-content`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justify-content")(js.undefined)
        ret
    }
    @scala.inline
    def `withJustify-items`(value: JustifyItemsProperty | js.Array[JustifyItemsProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justify-items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJustify-items`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justify-items")(js.undefined)
        ret
    }
    @scala.inline
    def `withJustify-self`(value: JustifySelfProperty | js.Array[JustifySelfProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justify-self")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJustify-self`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justify-self")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: LeftProperty[TLength] | js.Array[LeftProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def `withLetter-spacing`(value: LetterSpacingProperty[TLength] | js.Array[LetterSpacingProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letter-spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLetter-spacing`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letter-spacing")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-break`(value: LineBreakProperty | js.Array[LineBreakProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-break")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-break`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-break")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-height`(value: LineHeightProperty[TLength] | js.Array[LineHeightProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-height`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-height")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-height-step`(value: LineHeightStepProperty[TLength] | js.Array[LineHeightStepProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-height-step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-height-step`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-height-step")(js.undefined)
        ret
    }
    @scala.inline
    def `withList-style-image`(value: ListStyleImageProperty | js.Array[ListStyleImageProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list-style-image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutList-style-image`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list-style-image")(js.undefined)
        ret
    }
    @scala.inline
    def `withList-style-position`(value: ListStylePositionProperty | js.Array[ListStylePositionProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list-style-position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutList-style-position`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list-style-position")(js.undefined)
        ret
    }
    @scala.inline
    def `withList-style-type`(value: ListStyleTypeProperty | js.Array[ListStyleTypeProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list-style-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutList-style-type`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list-style-type")(js.undefined)
        ret
    }
    @scala.inline
    def `withMargin-block`(value: MarginBlockProperty[TLength] | js.Array[MarginBlockProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMargin-block`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-block")(js.undefined)
        ret
    }
    @scala.inline
    def `withMargin-block-end`(value: MarginBlockEndProperty[TLength] | js.Array[MarginBlockEndProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-block-end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMargin-block-end`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-block-end")(js.undefined)
        ret
    }
    @scala.inline
    def `withMargin-block-start`(value: MarginBlockStartProperty[TLength] | js.Array[MarginBlockStartProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-block-start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMargin-block-start`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-block-start")(js.undefined)
        ret
    }
    @scala.inline
    def `withMargin-bottom`(value: MarginBottomProperty[TLength] | js.Array[MarginBottomProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMargin-bottom`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-bottom")(js.undefined)
        ret
    }
    @scala.inline
    def `withMargin-inline`(value: MarginInlineProperty[TLength] | js.Array[MarginInlineProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMargin-inline`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-inline")(js.undefined)
        ret
    }
    @scala.inline
    def `withMargin-inline-end`(value: MarginInlineEndProperty[TLength] | js.Array[MarginInlineEndProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-inline-end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMargin-inline-end`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-inline-end")(js.undefined)
        ret
    }
    @scala.inline
    def `withMargin-inline-start`(value: MarginInlineStartProperty[TLength] | js.Array[MarginInlineStartProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-inline-start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMargin-inline-start`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-inline-start")(js.undefined)
        ret
    }
    @scala.inline
    def `withMargin-left`(value: MarginLeftProperty[TLength] | js.Array[MarginLeftProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMargin-left`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-left")(js.undefined)
        ret
    }
    @scala.inline
    def `withMargin-right`(value: MarginRightProperty[TLength] | js.Array[MarginRightProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMargin-right`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-right")(js.undefined)
        ret
    }
    @scala.inline
    def `withMargin-top`(value: MarginTopProperty[TLength] | js.Array[MarginTopProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMargin-top`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-top")(js.undefined)
        ret
    }
    @scala.inline
    def `withMask-border-mode`(value: MaskBorderModeProperty | js.Array[MaskBorderModeProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-border-mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMask-border-mode`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-border-mode")(js.undefined)
        ret
    }
    @scala.inline
    def `withMask-border-outset`(value: MaskBorderOutsetProperty[TLength] | js.Array[MaskBorderOutsetProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-border-outset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMask-border-outset`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-border-outset")(js.undefined)
        ret
    }
    @scala.inline
    def `withMask-border-repeat`(value: MaskBorderRepeatProperty | js.Array[MaskBorderRepeatProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-border-repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMask-border-repeat`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-border-repeat")(js.undefined)
        ret
    }
    @scala.inline
    def `withMask-border-slice`(value: MaskBorderSliceProperty | js.Array[MaskBorderSliceProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-border-slice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMask-border-slice`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-border-slice")(js.undefined)
        ret
    }
    @scala.inline
    def `withMask-border-source`(value: MaskBorderSourceProperty | js.Array[MaskBorderSourceProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-border-source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMask-border-source`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-border-source")(js.undefined)
        ret
    }
    @scala.inline
    def `withMask-border-width`(value: MaskBorderWidthProperty[TLength] | js.Array[MaskBorderWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-border-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMask-border-width`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-border-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withMask-clip`(value: MaskClipProperty | js.Array[MaskClipProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-clip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMask-clip`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-clip")(js.undefined)
        ret
    }
    @scala.inline
    def `withMask-composite`(value: MaskCompositeProperty | js.Array[MaskCompositeProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-composite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMask-composite`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-composite")(js.undefined)
        ret
    }
    @scala.inline
    def `withMask-image`(value: MaskImageProperty | js.Array[MaskImageProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMask-image`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-image")(js.undefined)
        ret
    }
    @scala.inline
    def `withMask-mode`(value: MaskModeProperty | js.Array[MaskModeProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMask-mode`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-mode")(js.undefined)
        ret
    }
    @scala.inline
    def `withMask-origin`(value: MaskOriginProperty | js.Array[MaskOriginProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMask-origin`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-origin")(js.undefined)
        ret
    }
    @scala.inline
    def `withMask-position`(value: MaskPositionProperty[TLength] | js.Array[MaskPositionProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMask-position`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-position")(js.undefined)
        ret
    }
    @scala.inline
    def `withMask-repeat`(value: MaskRepeatProperty | js.Array[MaskRepeatProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMask-repeat`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-repeat")(js.undefined)
        ret
    }
    @scala.inline
    def `withMask-size`(value: MaskSizeProperty[TLength] | js.Array[MaskSizeProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMask-size`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withMask-type`(value: MaskTypeProperty | js.Array[MaskTypeProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMask-type`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask-type")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-block-size`(value: MaxBlockSizeProperty[TLength] | js.Array[MaxBlockSizeProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-block-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-block-size`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-block-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-height`(value: MaxHeightProperty[TLength] | js.Array[MaxHeightProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-height`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-height")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-inline-size`(value: MaxInlineSizeProperty[TLength] | js.Array[MaxInlineSizeProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-inline-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-inline-size`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-inline-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-lines`(value: MaxLinesProperty | js.Array[MaxLinesProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-lines`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-lines")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-width`(value: MaxWidthProperty[TLength] | js.Array[MaxWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-width`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withMin-block-size`(value: MinBlockSizeProperty[TLength] | js.Array[MinBlockSizeProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-block-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMin-block-size`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-block-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withMin-height`(value: MinHeightProperty[TLength] | js.Array[MinHeightProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMin-height`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-height")(js.undefined)
        ret
    }
    @scala.inline
    def `withMin-inline-size`(value: MinInlineSizeProperty[TLength] | js.Array[MinInlineSizeProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-inline-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMin-inline-size`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-inline-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withMin-width`(value: MinWidthProperty[TLength] | js.Array[MinWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMin-width`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withMix-blend-mode`(value: MixBlendModeProperty | js.Array[MixBlendModeProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mix-blend-mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMix-blend-mode`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mix-blend-mode")(js.undefined)
        ret
    }
    @scala.inline
    def `withMotion-distance`(value: OffsetDistanceProperty[TLength] | js.Array[OffsetDistanceProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motion-distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMotion-distance`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motion-distance")(js.undefined)
        ret
    }
    @scala.inline
    def `withMotion-path`(value: OffsetPathProperty | js.Array[OffsetPathProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motion-path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMotion-path`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motion-path")(js.undefined)
        ret
    }
    @scala.inline
    def `withMotion-rotation`(value: OffsetRotateProperty | js.Array[OffsetRotateProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motion-rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMotion-rotation`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motion-rotation")(js.undefined)
        ret
    }
    @scala.inline
    def `withObject-fit`(value: ObjectFitProperty | js.Array[ObjectFitProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object-fit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutObject-fit`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object-fit")(js.undefined)
        ret
    }
    @scala.inline
    def `withObject-position`(value: ObjectPositionProperty[TLength] | js.Array[ObjectPositionProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object-position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutObject-position`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object-position")(js.undefined)
        ret
    }
    @scala.inline
    def `withOffset-anchor`(value: OffsetAnchorProperty[TLength] | js.Array[OffsetAnchorProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOffset-anchor`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-anchor")(js.undefined)
        ret
    }
    @scala.inline
    def `withOffset-distance`(value: OffsetDistanceProperty[TLength] | js.Array[OffsetDistanceProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOffset-distance`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-distance")(js.undefined)
        ret
    }
    @scala.inline
    def `withOffset-path`(value: OffsetPathProperty | js.Array[OffsetPathProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOffset-path`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-path")(js.undefined)
        ret
    }
    @scala.inline
    def `withOffset-position`(value: OffsetPositionProperty[TLength] | js.Array[OffsetPositionProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOffset-position`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-position")(js.undefined)
        ret
    }
    @scala.inline
    def `withOffset-rotate`(value: OffsetRotateProperty | js.Array[OffsetRotateProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOffset-rotate`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-rotate")(js.undefined)
        ret
    }
    @scala.inline
    def `withOffset-rotation`(value: OffsetRotateProperty | js.Array[OffsetRotateProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOffset-rotation`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: GlobalsNumber | js.Array[GlobalsNumber]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withOrphans(value: GlobalsNumber | js.Array[GlobalsNumber]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orphans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrphans: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orphans")(js.undefined)
        ret
    }
    @scala.inline
    def `withOutline-color`(value: OutlineColorProperty | js.Array[OutlineColorProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOutline-color`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withOutline-offset`(value: OutlineOffsetProperty[TLength] | js.Array[OutlineOffsetProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline-offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOutline-offset`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline-offset")(js.undefined)
        ret
    }
    @scala.inline
    def `withOutline-style`(value: OutlineStyleProperty | js.Array[OutlineStyleProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOutline-style`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withOutline-width`(value: OutlineWidthProperty[TLength] | js.Array[OutlineWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOutline-width`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline-width")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflow(value: OverflowProperty | js.Array[OverflowProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflow: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(js.undefined)
        ret
    }
    @scala.inline
    def `withOverflow-anchor`(value: OverflowAnchorProperty | js.Array[OverflowAnchorProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow-anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOverflow-anchor`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow-anchor")(js.undefined)
        ret
    }
    @scala.inline
    def `withOverflow-block`(value: OverflowBlockProperty | js.Array[OverflowBlockProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow-block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOverflow-block`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow-block")(js.undefined)
        ret
    }
    @scala.inline
    def `withOverflow-clip-box`(value: OverflowClipBoxProperty | js.Array[OverflowClipBoxProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow-clip-box")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOverflow-clip-box`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow-clip-box")(js.undefined)
        ret
    }
    @scala.inline
    def `withOverflow-inline`(value: OverflowInlineProperty | js.Array[OverflowInlineProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow-inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOverflow-inline`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow-inline")(js.undefined)
        ret
    }
    @scala.inline
    def `withOverflow-wrap`(value: OverflowWrapProperty | js.Array[OverflowWrapProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow-wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOverflow-wrap`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow-wrap")(js.undefined)
        ret
    }
    @scala.inline
    def `withOverflow-x`(value: OverflowXProperty | js.Array[OverflowXProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOverflow-x`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow-x")(js.undefined)
        ret
    }
    @scala.inline
    def `withOverflow-y`(value: OverflowYProperty | js.Array[OverflowYProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOverflow-y`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow-y")(js.undefined)
        ret
    }
    @scala.inline
    def `withOverscroll-behavior`(value: OverscrollBehaviorProperty | js.Array[OverscrollBehaviorProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscroll-behavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOverscroll-behavior`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscroll-behavior")(js.undefined)
        ret
    }
    @scala.inline
    def `withOverscroll-behavior-x`(value: OverscrollBehaviorXProperty | js.Array[OverscrollBehaviorXProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscroll-behavior-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOverscroll-behavior-x`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscroll-behavior-x")(js.undefined)
        ret
    }
    @scala.inline
    def `withOverscroll-behavior-y`(value: OverscrollBehaviorYProperty | js.Array[OverscrollBehaviorYProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscroll-behavior-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOverscroll-behavior-y`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscroll-behavior-y")(js.undefined)
        ret
    }
    @scala.inline
    def `withPadding-block`(value: PaddingBlockProperty[TLength] | js.Array[PaddingBlockProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPadding-block`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-block")(js.undefined)
        ret
    }
    @scala.inline
    def `withPadding-block-end`(value: PaddingBlockEndProperty[TLength] | js.Array[PaddingBlockEndProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-block-end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPadding-block-end`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-block-end")(js.undefined)
        ret
    }
    @scala.inline
    def `withPadding-block-start`(value: PaddingBlockStartProperty[TLength] | js.Array[PaddingBlockStartProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-block-start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPadding-block-start`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-block-start")(js.undefined)
        ret
    }
    @scala.inline
    def `withPadding-bottom`(value: PaddingBottomProperty[TLength] | js.Array[PaddingBottomProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPadding-bottom`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-bottom")(js.undefined)
        ret
    }
    @scala.inline
    def `withPadding-inline`(value: PaddingInlineProperty[TLength] | js.Array[PaddingInlineProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPadding-inline`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-inline")(js.undefined)
        ret
    }
    @scala.inline
    def `withPadding-inline-end`(value: PaddingInlineEndProperty[TLength] | js.Array[PaddingInlineEndProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-inline-end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPadding-inline-end`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-inline-end")(js.undefined)
        ret
    }
    @scala.inline
    def `withPadding-inline-start`(value: PaddingInlineStartProperty[TLength] | js.Array[PaddingInlineStartProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-inline-start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPadding-inline-start`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-inline-start")(js.undefined)
        ret
    }
    @scala.inline
    def `withPadding-left`(value: PaddingLeftProperty[TLength] | js.Array[PaddingLeftProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPadding-left`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-left")(js.undefined)
        ret
    }
    @scala.inline
    def `withPadding-right`(value: PaddingRightProperty[TLength] | js.Array[PaddingRightProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPadding-right`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-right")(js.undefined)
        ret
    }
    @scala.inline
    def `withPadding-top`(value: PaddingTopProperty[TLength] | js.Array[PaddingTopProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPadding-top`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding-top")(js.undefined)
        ret
    }
    @scala.inline
    def `withPage-break-after`(value: PageBreakAfterProperty | js.Array[PageBreakAfterProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-break-after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPage-break-after`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-break-after")(js.undefined)
        ret
    }
    @scala.inline
    def `withPage-break-before`(value: PageBreakBeforeProperty | js.Array[PageBreakBeforeProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-break-before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPage-break-before`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-break-before")(js.undefined)
        ret
    }
    @scala.inline
    def `withPage-break-inside`(value: PageBreakInsideProperty | js.Array[PageBreakInsideProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-break-inside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPage-break-inside`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-break-inside")(js.undefined)
        ret
    }
    @scala.inline
    def `withPaint-order`(value: PaintOrderProperty | js.Array[PaintOrderProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paint-order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPaint-order`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paint-order")(js.undefined)
        ret
    }
    @scala.inline
    def withPerspective(value: PerspectiveProperty[TLength] | js.Array[PerspectiveProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perspective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerspective: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perspective")(js.undefined)
        ret
    }
    @scala.inline
    def `withPerspective-origin`(value: PerspectiveOriginProperty[TLength] | js.Array[PerspectiveOriginProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perspective-origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPerspective-origin`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perspective-origin")(js.undefined)
        ret
    }
    @scala.inline
    def `withPlace-content`(value: PlaceContentProperty | js.Array[PlaceContentProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("place-content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPlace-content`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("place-content")(js.undefined)
        ret
    }
    @scala.inline
    def `withPointer-events`(value: PointerEventsProperty | js.Array[PointerEventsProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointer-events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPointer-events`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointer-events")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: PositionProperty | js.Array[PositionProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotes(value: QuotesProperty | js.Array[QuotesProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotes: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotes")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: ResizeProperty | js.Array[ResizeProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: RightProperty[TLength] | js.Array[RightProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withRotate(value: RotateProperty | js.Array[RotateProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotate: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
        ret
    }
    @scala.inline
    def `withRow-gap`(value: RowGapProperty[TLength] | js.Array[RowGapProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row-gap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRow-gap`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row-gap")(js.undefined)
        ret
    }
    @scala.inline
    def `withRuby-align`(value: RubyAlignProperty | js.Array[RubyAlignProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruby-align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRuby-align`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruby-align")(js.undefined)
        ret
    }
    @scala.inline
    def `withRuby-merge`(value: RubyMergeProperty | js.Array[RubyMergeProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruby-merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRuby-merge`: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruby-merge")(js.undefined)
        ret
    }
  }
  
}

