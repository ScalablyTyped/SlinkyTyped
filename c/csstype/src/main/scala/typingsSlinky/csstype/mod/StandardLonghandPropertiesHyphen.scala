package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardLonghandPropertiesHyphen[TLength] extends js.Object {
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
  var `align-content`: js.UndefOr[AlignContentProperty] = js.undefined
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
  var `align-items`: js.UndefOr[AlignItemsProperty] = js.undefined
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
  var `align-self`: js.UndefOr[AlignSelfProperty] = js.undefined
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
  var `animation-delay`: js.UndefOr[GlobalsString] = js.undefined
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
  var `animation-direction`: js.UndefOr[AnimationDirectionProperty] = js.undefined
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
  var `animation-duration`: js.UndefOr[GlobalsString] = js.undefined
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
  var `animation-fill-mode`: js.UndefOr[AnimationFillModeProperty] = js.undefined
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
  var `animation-iteration-count`: js.UndefOr[AnimationIterationCountProperty] = js.undefined
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
  var `animation-name`: js.UndefOr[AnimationNameProperty] = js.undefined
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
  var `animation-play-state`: js.UndefOr[AnimationPlayStateProperty] = js.undefined
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
  var `animation-timing-function`: js.UndefOr[AnimationTimingFunctionProperty] = js.undefined
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
  var appearance: js.UndefOr[AppearanceProperty] = js.undefined
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
  var `backdrop-filter`: js.UndefOr[BackdropFilterProperty] = js.undefined
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
  var `backface-visibility`: js.UndefOr[BackfaceVisibilityProperty] = js.undefined
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
  var `background-attachment`: js.UndefOr[BackgroundAttachmentProperty] = js.undefined
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
  var `background-blend-mode`: js.UndefOr[BackgroundBlendModeProperty] = js.undefined
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
  var `background-clip`: js.UndefOr[BackgroundClipProperty] = js.undefined
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
  var `background-color`: js.UndefOr[BackgroundColorProperty] = js.undefined
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
  var `background-image`: js.UndefOr[BackgroundImageProperty] = js.undefined
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
  var `background-origin`: js.UndefOr[BackgroundOriginProperty] = js.undefined
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
  var `background-position`: js.UndefOr[BackgroundPositionProperty[TLength]] = js.undefined
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
  var `background-position-x`: js.UndefOr[BackgroundPositionXProperty[TLength]] = js.undefined
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
  var `background-position-y`: js.UndefOr[BackgroundPositionYProperty[TLength]] = js.undefined
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
  var `background-repeat`: js.UndefOr[BackgroundRepeatProperty] = js.undefined
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
  var `background-size`: js.UndefOr[BackgroundSizeProperty[TLength]] = js.undefined
  /** **Initial value**: `clip` */
  var `block-overflow`: js.UndefOr[BlockOverflowProperty] = js.undefined
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
  var `block-size`: js.UndefOr[BlockSizeProperty[TLength]] = js.undefined
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
  var `border-block-color`: js.UndefOr[BorderBlockColorProperty] = js.undefined
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
  var `border-block-end-color`: js.UndefOr[BorderBlockEndColorProperty] = js.undefined
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
  var `border-block-end-style`: js.UndefOr[BorderBlockEndStyleProperty] = js.undefined
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
  var `border-block-end-width`: js.UndefOr[BorderBlockEndWidthProperty[TLength]] = js.undefined
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
  var `border-block-start-color`: js.UndefOr[BorderBlockStartColorProperty] = js.undefined
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
  var `border-block-start-style`: js.UndefOr[BorderBlockStartStyleProperty] = js.undefined
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
  var `border-block-start-width`: js.UndefOr[BorderBlockStartWidthProperty[TLength]] = js.undefined
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
  var `border-block-style`: js.UndefOr[BorderBlockStyleProperty] = js.undefined
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
  var `border-block-width`: js.UndefOr[BorderBlockWidthProperty[TLength]] = js.undefined
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
  var `border-bottom-color`: js.UndefOr[BorderBottomColorProperty] = js.undefined
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
  var `border-bottom-left-radius`: js.UndefOr[BorderBottomLeftRadiusProperty[TLength]] = js.undefined
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
  var `border-bottom-right-radius`: js.UndefOr[BorderBottomRightRadiusProperty[TLength]] = js.undefined
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
  var `border-bottom-style`: js.UndefOr[BorderBottomStyleProperty] = js.undefined
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
  var `border-bottom-width`: js.UndefOr[BorderBottomWidthProperty[TLength]] = js.undefined
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
  var `border-collapse`: js.UndefOr[BorderCollapseProperty] = js.undefined
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
  var `border-end-end-radius`: js.UndefOr[BorderEndEndRadiusProperty[TLength]] = js.undefined
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
  var `border-end-start-radius`: js.UndefOr[BorderEndStartRadiusProperty[TLength]] = js.undefined
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
  var `border-image-outset`: js.UndefOr[BorderImageOutsetProperty[TLength]] = js.undefined
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
  var `border-image-repeat`: js.UndefOr[BorderImageRepeatProperty] = js.undefined
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
  var `border-image-slice`: js.UndefOr[BorderImageSliceProperty] = js.undefined
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
  var `border-image-source`: js.UndefOr[BorderImageSourceProperty] = js.undefined
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
  var `border-image-width`: js.UndefOr[BorderImageWidthProperty[TLength]] = js.undefined
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
  var `border-inline-color`: js.UndefOr[BorderInlineColorProperty] = js.undefined
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
  var `border-inline-end-color`: js.UndefOr[BorderInlineEndColorProperty] = js.undefined
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
  var `border-inline-end-style`: js.UndefOr[BorderInlineEndStyleProperty] = js.undefined
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
  var `border-inline-end-width`: js.UndefOr[BorderInlineEndWidthProperty[TLength]] = js.undefined
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
  var `border-inline-start-color`: js.UndefOr[BorderInlineStartColorProperty] = js.undefined
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
  var `border-inline-start-style`: js.UndefOr[BorderInlineStartStyleProperty] = js.undefined
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
  var `border-inline-start-width`: js.UndefOr[BorderInlineStartWidthProperty[TLength]] = js.undefined
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
  var `border-inline-style`: js.UndefOr[BorderInlineStyleProperty] = js.undefined
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
  var `border-inline-width`: js.UndefOr[BorderInlineWidthProperty[TLength]] = js.undefined
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
  var `border-left-color`: js.UndefOr[BorderLeftColorProperty] = js.undefined
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
  var `border-left-style`: js.UndefOr[BorderLeftStyleProperty] = js.undefined
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
  var `border-left-width`: js.UndefOr[BorderLeftWidthProperty[TLength]] = js.undefined
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
  var `border-right-color`: js.UndefOr[BorderRightColorProperty] = js.undefined
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
  var `border-right-style`: js.UndefOr[BorderRightStyleProperty] = js.undefined
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
  var `border-right-width`: js.UndefOr[BorderRightWidthProperty[TLength]] = js.undefined
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
  var `border-spacing`: js.UndefOr[BorderSpacingProperty[TLength]] = js.undefined
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
  var `border-start-end-radius`: js.UndefOr[BorderStartEndRadiusProperty[TLength]] = js.undefined
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
  var `border-start-start-radius`: js.UndefOr[BorderStartStartRadiusProperty[TLength]] = js.undefined
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
  var `border-top-color`: js.UndefOr[BorderTopColorProperty] = js.undefined
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
  var `border-top-left-radius`: js.UndefOr[BorderTopLeftRadiusProperty[TLength]] = js.undefined
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
  var `border-top-right-radius`: js.UndefOr[BorderTopRightRadiusProperty[TLength]] = js.undefined
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
  var `border-top-style`: js.UndefOr[BorderTopStyleProperty] = js.undefined
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
  var `border-top-width`: js.UndefOr[BorderTopWidthProperty[TLength]] = js.undefined
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
  var bottom: js.UndefOr[BottomProperty[TLength]] = js.undefined
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
  var `box-decoration-break`: js.UndefOr[BoxDecorationBreakProperty] = js.undefined
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
  var `box-shadow`: js.UndefOr[BoxShadowProperty] = js.undefined
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
  var `box-sizing`: js.UndefOr[BoxSizingProperty] = js.undefined
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
  var `break-after`: js.UndefOr[BreakAfterProperty] = js.undefined
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
  var `break-before`: js.UndefOr[BreakBeforeProperty] = js.undefined
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
  var `break-inside`: js.UndefOr[BreakInsideProperty] = js.undefined
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
  var `caption-side`: js.UndefOr[CaptionSideProperty] = js.undefined
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
  var `caret-color`: js.UndefOr[CaretColorProperty] = js.undefined
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
  var clear: js.UndefOr[ClearProperty] = js.undefined
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
  var `clip-path`: js.UndefOr[ClipPathProperty] = js.undefined
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
  var color: js.UndefOr[ColorProperty] = js.undefined
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
  var `color-adjust`: js.UndefOr[ColorAdjustProperty] = js.undefined
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
  var `column-count`: js.UndefOr[ColumnCountProperty] = js.undefined
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
  var `column-fill`: js.UndefOr[ColumnFillProperty] = js.undefined
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
  var `column-gap`: js.UndefOr[ColumnGapProperty[TLength]] = js.undefined
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
  var `column-rule-color`: js.UndefOr[ColumnRuleColorProperty] = js.undefined
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
  var `column-rule-style`: js.UndefOr[ColumnRuleStyleProperty] = js.undefined
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
  var `column-rule-width`: js.UndefOr[ColumnRuleWidthProperty[TLength]] = js.undefined
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
  var `column-span`: js.UndefOr[ColumnSpanProperty] = js.undefined
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
  var `column-width`: js.UndefOr[ColumnWidthProperty[TLength]] = js.undefined
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
  var contain: js.UndefOr[ContainProperty] = js.undefined
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
  var content: js.UndefOr[ContentProperty] = js.undefined
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
  var `counter-increment`: js.UndefOr[CounterIncrementProperty] = js.undefined
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
  var `counter-reset`: js.UndefOr[CounterResetProperty] = js.undefined
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
  var `counter-set`: js.UndefOr[CounterSetProperty] = js.undefined
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
  var cursor: js.UndefOr[CursorProperty] = js.undefined
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
  var direction: js.UndefOr[DirectionProperty] = js.undefined
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
  var display: js.UndefOr[DisplayProperty] = js.undefined
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
  var `empty-cells`: js.UndefOr[EmptyCellsProperty] = js.undefined
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
  var filter: js.UndefOr[FilterProperty] = js.undefined
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
  var `flex-basis`: js.UndefOr[FlexBasisProperty[TLength]] = js.undefined
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
  var `flex-direction`: js.UndefOr[FlexDirectionProperty] = js.undefined
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
  var `flex-grow`: js.UndefOr[GlobalsNumber] = js.undefined
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
  var `flex-shrink`: js.UndefOr[GlobalsNumber] = js.undefined
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
  var `flex-wrap`: js.UndefOr[FlexWrapProperty] = js.undefined
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
  var float: js.UndefOr[FloatProperty] = js.undefined
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
  var `font-family`: js.UndefOr[FontFamilyProperty] = js.undefined
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
  var `font-feature-settings`: js.UndefOr[FontFeatureSettingsProperty] = js.undefined
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
  var `font-kerning`: js.UndefOr[FontKerningProperty] = js.undefined
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
  var `font-language-override`: js.UndefOr[FontLanguageOverrideProperty] = js.undefined
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
  var `font-optical-sizing`: js.UndefOr[FontOpticalSizingProperty] = js.undefined
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
  var `font-size`: js.UndefOr[FontSizeProperty[TLength]] = js.undefined
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
  var `font-size-adjust`: js.UndefOr[FontSizeAdjustProperty] = js.undefined
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
  var `font-stretch`: js.UndefOr[FontStretchProperty] = js.undefined
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
  var `font-style`: js.UndefOr[FontStyleProperty] = js.undefined
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
  var `font-synthesis`: js.UndefOr[FontSynthesisProperty] = js.undefined
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
  var `font-variant`: js.UndefOr[FontVariantProperty] = js.undefined
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
  var `font-variant-caps`: js.UndefOr[FontVariantCapsProperty] = js.undefined
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
  var `font-variant-east-asian`: js.UndefOr[FontVariantEastAsianProperty] = js.undefined
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
  var `font-variant-ligatures`: js.UndefOr[FontVariantLigaturesProperty] = js.undefined
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
  var `font-variant-numeric`: js.UndefOr[FontVariantNumericProperty] = js.undefined
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
  var `font-variant-position`: js.UndefOr[FontVariantPositionProperty] = js.undefined
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
  var `font-variation-settings`: js.UndefOr[FontVariationSettingsProperty] = js.undefined
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
  var `font-weight`: js.UndefOr[FontWeightProperty] = js.undefined
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
  var `grid-auto-columns`: js.UndefOr[GridAutoColumnsProperty[TLength]] = js.undefined
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
  var `grid-auto-flow`: js.UndefOr[GridAutoFlowProperty] = js.undefined
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
  var `grid-auto-rows`: js.UndefOr[GridAutoRowsProperty[TLength]] = js.undefined
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
  var `grid-column-end`: js.UndefOr[GridColumnEndProperty] = js.undefined
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
  var `grid-column-start`: js.UndefOr[GridColumnStartProperty] = js.undefined
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
  var `grid-row-end`: js.UndefOr[GridRowEndProperty] = js.undefined
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
  var `grid-row-start`: js.UndefOr[GridRowStartProperty] = js.undefined
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
  var `grid-template-areas`: js.UndefOr[GridTemplateAreasProperty] = js.undefined
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
  var `grid-template-columns`: js.UndefOr[GridTemplateColumnsProperty[TLength]] = js.undefined
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
  var `grid-template-rows`: js.UndefOr[GridTemplateRowsProperty[TLength]] = js.undefined
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
  var `hanging-punctuation`: js.UndefOr[HangingPunctuationProperty] = js.undefined
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
  var height: js.UndefOr[HeightProperty[TLength]] = js.undefined
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
  var hyphens: js.UndefOr[HyphensProperty] = js.undefined
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
  var `image-orientation`: js.UndefOr[ImageOrientationProperty] = js.undefined
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
  var `image-rendering`: js.UndefOr[ImageRenderingProperty] = js.undefined
  /** **Initial value**: `1dppx` */
  var `image-resolution`: js.UndefOr[ImageResolutionProperty] = js.undefined
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
  var `initial-letter`: js.UndefOr[InitialLetterProperty] = js.undefined
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
  var `inline-size`: js.UndefOr[InlineSizeProperty[TLength]] = js.undefined
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
  var inset: js.UndefOr[InsetProperty[TLength]] = js.undefined
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
  var `inset-block`: js.UndefOr[InsetBlockProperty[TLength]] = js.undefined
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
  var `inset-block-end`: js.UndefOr[InsetBlockEndProperty[TLength]] = js.undefined
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
  var `inset-block-start`: js.UndefOr[InsetBlockStartProperty[TLength]] = js.undefined
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
  var `inset-inline`: js.UndefOr[InsetInlineProperty[TLength]] = js.undefined
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
  var `inset-inline-end`: js.UndefOr[InsetInlineEndProperty[TLength]] = js.undefined
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
  var `inset-inline-start`: js.UndefOr[InsetInlineStartProperty[TLength]] = js.undefined
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
  var isolation: js.UndefOr[IsolationProperty] = js.undefined
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
  var `justify-content`: js.UndefOr[JustifyContentProperty] = js.undefined
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
  var `justify-items`: js.UndefOr[JustifyItemsProperty] = js.undefined
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
  var `justify-self`: js.UndefOr[JustifySelfProperty] = js.undefined
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
  var left: js.UndefOr[LeftProperty[TLength]] = js.undefined
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
  var `letter-spacing`: js.UndefOr[LetterSpacingProperty[TLength]] = js.undefined
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
  var `line-break`: js.UndefOr[LineBreakProperty] = js.undefined
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
  var `line-height`: js.UndefOr[LineHeightProperty[TLength]] = js.undefined
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
  var `line-height-step`: js.UndefOr[LineHeightStepProperty[TLength]] = js.undefined
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
  var `list-style-image`: js.UndefOr[ListStyleImageProperty] = js.undefined
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
  var `list-style-position`: js.UndefOr[ListStylePositionProperty] = js.undefined
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
  var `list-style-type`: js.UndefOr[ListStyleTypeProperty] = js.undefined
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
  var `margin-block`: js.UndefOr[MarginBlockProperty[TLength]] = js.undefined
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
  var `margin-block-end`: js.UndefOr[MarginBlockEndProperty[TLength]] = js.undefined
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
  var `margin-block-start`: js.UndefOr[MarginBlockStartProperty[TLength]] = js.undefined
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
  var `margin-bottom`: js.UndefOr[MarginBottomProperty[TLength]] = js.undefined
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
  var `margin-inline`: js.UndefOr[MarginInlineProperty[TLength]] = js.undefined
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
  var `margin-inline-end`: js.UndefOr[MarginInlineEndProperty[TLength]] = js.undefined
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
  var `margin-inline-start`: js.UndefOr[MarginInlineStartProperty[TLength]] = js.undefined
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
  var `margin-left`: js.UndefOr[MarginLeftProperty[TLength]] = js.undefined
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
  var `margin-right`: js.UndefOr[MarginRightProperty[TLength]] = js.undefined
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
  var `margin-top`: js.UndefOr[MarginTopProperty[TLength]] = js.undefined
  /**
    * The **`mask-border-mode`** CSS property specifies the blending mode used in a mask border.
    *
    * **Initial value**: `alpha`
    */
  var `mask-border-mode`: js.UndefOr[MaskBorderModeProperty] = js.undefined
  /**
    * The **`mask-border-outset`** CSS property specifies the distance by which an element's mask border is set out from its border box.
    *
    * **Initial value**: `0`
    */
  var `mask-border-outset`: js.UndefOr[MaskBorderOutsetProperty[TLength]] = js.undefined
  /**
    * The **`mask-border-repeat`** CSS property sets how the edge regions of a source image are adjusted to fit the dimensions of an element's mask border.
    *
    * **Initial value**: `stretch`
    */
  var `mask-border-repeat`: js.UndefOr[MaskBorderRepeatProperty] = js.undefined
  /**
    * The **`mask-border-slice`** CSS property divides the image set by `mask-border-source` into regions. These regions are used to form the components of an element's mask border.
    *
    * **Initial value**: `0`
    */
  var `mask-border-slice`: js.UndefOr[MaskBorderSliceProperty] = js.undefined
  /**
    * The **`mask-border-source`** CSS property sets the source image used to create an element's mask border.
    *
    * **Initial value**: `none`
    */
  var `mask-border-source`: js.UndefOr[MaskBorderSourceProperty] = js.undefined
  /**
    * The **`mask-border-width`** CSS property sets the width of an element's mask border.
    *
    * **Initial value**: `auto`
    */
  var `mask-border-width`: js.UndefOr[MaskBorderWidthProperty[TLength]] = js.undefined
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
  var `mask-clip`: js.UndefOr[MaskClipProperty] = js.undefined
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
  var `mask-composite`: js.UndefOr[MaskCompositeProperty] = js.undefined
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
  var `mask-image`: js.UndefOr[MaskImageProperty] = js.undefined
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
  var `mask-mode`: js.UndefOr[MaskModeProperty] = js.undefined
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
  var `mask-origin`: js.UndefOr[MaskOriginProperty] = js.undefined
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
  var `mask-position`: js.UndefOr[MaskPositionProperty[TLength]] = js.undefined
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
  var `mask-repeat`: js.UndefOr[MaskRepeatProperty] = js.undefined
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
  var `mask-size`: js.UndefOr[MaskSizeProperty[TLength]] = js.undefined
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
  var `mask-type`: js.UndefOr[MaskTypeProperty] = js.undefined
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
  var `max-block-size`: js.UndefOr[MaxBlockSizeProperty[TLength]] = js.undefined
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
  var `max-height`: js.UndefOr[MaxHeightProperty[TLength]] = js.undefined
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
  var `max-inline-size`: js.UndefOr[MaxInlineSizeProperty[TLength]] = js.undefined
  /** **Initial value**: `none` */
  var `max-lines`: js.UndefOr[MaxLinesProperty] = js.undefined
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
  var `max-width`: js.UndefOr[MaxWidthProperty[TLength]] = js.undefined
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
  var `min-block-size`: js.UndefOr[MinBlockSizeProperty[TLength]] = js.undefined
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
  var `min-height`: js.UndefOr[MinHeightProperty[TLength]] = js.undefined
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
  var `min-inline-size`: js.UndefOr[MinInlineSizeProperty[TLength]] = js.undefined
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
  var `min-width`: js.UndefOr[MinWidthProperty[TLength]] = js.undefined
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
  var `mix-blend-mode`: js.UndefOr[MixBlendModeProperty] = js.undefined
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
  var `motion-distance`: js.UndefOr[OffsetDistanceProperty[TLength]] = js.undefined
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
  var `motion-path`: js.UndefOr[OffsetPathProperty] = js.undefined
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
  var `motion-rotation`: js.UndefOr[OffsetRotateProperty] = js.undefined
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
  var `object-fit`: js.UndefOr[ObjectFitProperty] = js.undefined
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
  var `object-position`: js.UndefOr[ObjectPositionProperty[TLength]] = js.undefined
  /** **Initial value**: `auto` */
  var `offset-anchor`: js.UndefOr[OffsetAnchorProperty[TLength]] = js.undefined
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
  var `offset-distance`: js.UndefOr[OffsetDistanceProperty[TLength]] = js.undefined
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
  var `offset-path`: js.UndefOr[OffsetPathProperty] = js.undefined
  /** **Initial value**: `auto` */
  var `offset-position`: js.UndefOr[OffsetPositionProperty[TLength]] = js.undefined
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
  var `offset-rotate`: js.UndefOr[OffsetRotateProperty] = js.undefined
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
  var `offset-rotation`: js.UndefOr[OffsetRotateProperty] = js.undefined
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
  var opacity: js.UndefOr[GlobalsNumber] = js.undefined
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
  var order: js.UndefOr[GlobalsNumber] = js.undefined
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
  var orphans: js.UndefOr[GlobalsNumber] = js.undefined
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
  var `outline-color`: js.UndefOr[OutlineColorProperty] = js.undefined
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
  var `outline-offset`: js.UndefOr[OutlineOffsetProperty[TLength]] = js.undefined
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
  var `outline-style`: js.UndefOr[OutlineStyleProperty] = js.undefined
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
  var `outline-width`: js.UndefOr[OutlineWidthProperty[TLength]] = js.undefined
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
  var overflow: js.UndefOr[OverflowProperty] = js.undefined
  /**
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **56** | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-anchor
    */
  var `overflow-anchor`: js.UndefOr[OverflowAnchorProperty] = js.undefined
  /**
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **69**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-block
    */
  var `overflow-block`: js.UndefOr[OverflowBlockProperty] = js.undefined
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
  var `overflow-clip-box`: js.UndefOr[OverflowClipBoxProperty] = js.undefined
  /**
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **69**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-inline
    */
  var `overflow-inline`: js.UndefOr[OverflowInlineProperty] = js.undefined
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
  var `overflow-wrap`: js.UndefOr[OverflowWrapProperty] = js.undefined
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
  var `overflow-x`: js.UndefOr[OverflowXProperty] = js.undefined
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
  var `overflow-y`: js.UndefOr[OverflowYProperty] = js.undefined
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
  var `overscroll-behavior`: js.UndefOr[OverscrollBehaviorProperty] = js.undefined
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
  var `overscroll-behavior-x`: js.UndefOr[OverscrollBehaviorXProperty] = js.undefined
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
  var `overscroll-behavior-y`: js.UndefOr[OverscrollBehaviorYProperty] = js.undefined
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
  var `padding-block`: js.UndefOr[PaddingBlockProperty[TLength]] = js.undefined
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
  var `padding-block-end`: js.UndefOr[PaddingBlockEndProperty[TLength]] = js.undefined
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
  var `padding-block-start`: js.UndefOr[PaddingBlockStartProperty[TLength]] = js.undefined
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
  var `padding-bottom`: js.UndefOr[PaddingBottomProperty[TLength]] = js.undefined
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
  var `padding-inline`: js.UndefOr[PaddingInlineProperty[TLength]] = js.undefined
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
  var `padding-inline-end`: js.UndefOr[PaddingInlineEndProperty[TLength]] = js.undefined
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
  var `padding-inline-start`: js.UndefOr[PaddingInlineStartProperty[TLength]] = js.undefined
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
  var `padding-left`: js.UndefOr[PaddingLeftProperty[TLength]] = js.undefined
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
  var `padding-right`: js.UndefOr[PaddingRightProperty[TLength]] = js.undefined
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
  var `padding-top`: js.UndefOr[PaddingTopProperty[TLength]] = js.undefined
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
  var `page-break-after`: js.UndefOr[PageBreakAfterProperty] = js.undefined
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
  var `page-break-before`: js.UndefOr[PageBreakBeforeProperty] = js.undefined
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
  var `page-break-inside`: js.UndefOr[PageBreakInsideProperty] = js.undefined
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
  var `paint-order`: js.UndefOr[PaintOrderProperty] = js.undefined
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
  var perspective: js.UndefOr[PerspectiveProperty[TLength]] = js.undefined
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
  var `perspective-origin`: js.UndefOr[PerspectiveOriginProperty[TLength]] = js.undefined
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
  var `place-content`: js.UndefOr[PlaceContentProperty] = js.undefined
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
  var `pointer-events`: js.UndefOr[PointerEventsProperty] = js.undefined
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
  var position: js.UndefOr[PositionProperty] = js.undefined
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
  var quotes: js.UndefOr[QuotesProperty] = js.undefined
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
  var resize: js.UndefOr[ResizeProperty] = js.undefined
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
  var right: js.UndefOr[RightProperty[TLength]] = js.undefined
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
  var rotate: js.UndefOr[RotateProperty] = js.undefined
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
  var `row-gap`: js.UndefOr[RowGapProperty[TLength]] = js.undefined
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
  var `ruby-align`: js.UndefOr[RubyAlignProperty] = js.undefined
  /** **Initial value**: `separate` */
  var `ruby-merge`: js.UndefOr[RubyMergeProperty] = js.undefined
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
  var `ruby-position`: js.UndefOr[RubyPositionProperty] = js.undefined
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
  var scale: js.UndefOr[ScaleProperty] = js.undefined
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
  var `scroll-behavior`: js.UndefOr[ScrollBehaviorProperty] = js.undefined
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
  var `scroll-margin`: js.UndefOr[ScrollMarginProperty[TLength]] = js.undefined
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
  var `scroll-margin-block`: js.UndefOr[ScrollMarginBlockProperty[TLength]] = js.undefined
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
  var `scroll-margin-block-end`: js.UndefOr[ScrollMarginBlockEndProperty[TLength]] = js.undefined
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
  var `scroll-margin-block-start`: js.UndefOr[ScrollMarginBlockStartProperty[TLength]] = js.undefined
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
  var `scroll-margin-bottom`: js.UndefOr[ScrollMarginBottomProperty[TLength]] = js.undefined
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
  var `scroll-margin-inline`: js.UndefOr[ScrollMarginInlineProperty[TLength]] = js.undefined
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
  var `scroll-margin-inline-end`: js.UndefOr[ScrollMarginInlineEndProperty[TLength]] = js.undefined
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
  var `scroll-margin-inline-start`: js.UndefOr[ScrollMarginInlineStartProperty[TLength]] = js.undefined
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
  var `scroll-margin-left`: js.UndefOr[ScrollMarginLeftProperty[TLength]] = js.undefined
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
  var `scroll-margin-right`: js.UndefOr[ScrollMarginRightProperty[TLength]] = js.undefined
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
  var `scroll-margin-top`: js.UndefOr[ScrollMarginTopProperty[TLength]] = js.undefined
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
  var `scroll-padding`: js.UndefOr[ScrollPaddingProperty[TLength]] = js.undefined
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
  var `scroll-padding-block`: js.UndefOr[ScrollPaddingBlockProperty[TLength]] = js.undefined
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
  var `scroll-padding-block-end`: js.UndefOr[ScrollPaddingBlockEndProperty[TLength]] = js.undefined
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
  var `scroll-padding-block-start`: js.UndefOr[ScrollPaddingBlockStartProperty[TLength]] = js.undefined
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
  var `scroll-padding-bottom`: js.UndefOr[ScrollPaddingBottomProperty[TLength]] = js.undefined
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
  var `scroll-padding-inline`: js.UndefOr[ScrollPaddingInlineProperty[TLength]] = js.undefined
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
  var `scroll-padding-inline-end`: js.UndefOr[ScrollPaddingInlineEndProperty[TLength]] = js.undefined
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
  var `scroll-padding-inline-start`: js.UndefOr[ScrollPaddingInlineStartProperty[TLength]] = js.undefined
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
  var `scroll-padding-left`: js.UndefOr[ScrollPaddingLeftProperty[TLength]] = js.undefined
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
  var `scroll-padding-right`: js.UndefOr[ScrollPaddingRightProperty[TLength]] = js.undefined
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
  var `scroll-padding-top`: js.UndefOr[ScrollPaddingTopProperty[TLength]] = js.undefined
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
  var `scroll-snap-align`: js.UndefOr[ScrollSnapAlignProperty] = js.undefined
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
  var `scroll-snap-stop`: js.UndefOr[ScrollSnapStopProperty] = js.undefined
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
  var `scroll-snap-type`: js.UndefOr[ScrollSnapTypeProperty] = js.undefined
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
  var `scrollbar-color`: js.UndefOr[ScrollbarColorProperty] = js.undefined
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
  var `scrollbar-width`: js.UndefOr[ScrollbarWidthProperty] = js.undefined
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
  var `shape-image-threshold`: js.UndefOr[GlobalsNumber] = js.undefined
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
  var `shape-margin`: js.UndefOr[ShapeMarginProperty[TLength]] = js.undefined
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
  var `shape-outside`: js.UndefOr[ShapeOutsideProperty] = js.undefined
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
  var `tab-size`: js.UndefOr[TabSizeProperty[TLength]] = js.undefined
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
  var `table-layout`: js.UndefOr[TableLayoutProperty] = js.undefined
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
  var `text-align`: js.UndefOr[TextAlignProperty] = js.undefined
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
  var `text-align-last`: js.UndefOr[TextAlignLastProperty] = js.undefined
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
  var `text-combine-upright`: js.UndefOr[TextCombineUprightProperty] = js.undefined
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
  var `text-decoration-color`: js.UndefOr[TextDecorationColorProperty] = js.undefined
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
  var `text-decoration-line`: js.UndefOr[TextDecorationLineProperty] = js.undefined
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
  var `text-decoration-skip`: js.UndefOr[TextDecorationSkipProperty] = js.undefined
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
  var `text-decoration-skip-ink`: js.UndefOr[TextDecorationSkipInkProperty] = js.undefined
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
  var `text-decoration-style`: js.UndefOr[TextDecorationStyleProperty] = js.undefined
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
  var `text-emphasis-color`: js.UndefOr[TextEmphasisColorProperty] = js.undefined
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
  var `text-emphasis-position`: js.UndefOr[GlobalsString] = js.undefined
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
  var `text-emphasis-style`: js.UndefOr[TextEmphasisStyleProperty] = js.undefined
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
  var `text-indent`: js.UndefOr[TextIndentProperty[TLength]] = js.undefined
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
  var `text-justify`: js.UndefOr[TextJustifyProperty] = js.undefined
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
  var `text-orientation`: js.UndefOr[TextOrientationProperty] = js.undefined
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
  var `text-overflow`: js.UndefOr[TextOverflowProperty] = js.undefined
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
  var `text-rendering`: js.UndefOr[TextRenderingProperty] = js.undefined
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
  var `text-shadow`: js.UndefOr[TextShadowProperty] = js.undefined
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
  var `text-size-adjust`: js.UndefOr[TextSizeAdjustProperty] = js.undefined
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
  var `text-transform`: js.UndefOr[TextTransformProperty] = js.undefined
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
  var `text-underline-position`: js.UndefOr[TextUnderlinePositionProperty] = js.undefined
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
  var top: js.UndefOr[TopProperty[TLength]] = js.undefined
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
  var `touch-action`: js.UndefOr[TouchActionProperty] = js.undefined
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
  var transform: js.UndefOr[TransformProperty] = js.undefined
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
  var `transform-box`: js.UndefOr[TransformBoxProperty] = js.undefined
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
  var `transform-origin`: js.UndefOr[TransformOriginProperty[TLength]] = js.undefined
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
  var `transform-style`: js.UndefOr[TransformStyleProperty] = js.undefined
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
  var `transition-delay`: js.UndefOr[GlobalsString] = js.undefined
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
  var `transition-duration`: js.UndefOr[GlobalsString] = js.undefined
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
  var `transition-property`: js.UndefOr[TransitionPropertyProperty] = js.undefined
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
  var `transition-timing-function`: js.UndefOr[TransitionTimingFunctionProperty] = js.undefined
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
  var translate: js.UndefOr[TranslateProperty[TLength]] = js.undefined
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
  var `unicode-bidi`: js.UndefOr[UnicodeBidiProperty] = js.undefined
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
  var `user-select`: js.UndefOr[UserSelectProperty] = js.undefined
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
  var `vertical-align`: js.UndefOr[VerticalAlignProperty[TLength]] = js.undefined
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
  var visibility: js.UndefOr[VisibilityProperty] = js.undefined
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
  var `white-space`: js.UndefOr[WhiteSpaceProperty] = js.undefined
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
  var widows: js.UndefOr[GlobalsNumber] = js.undefined
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
  var width: js.UndefOr[WidthProperty[TLength]] = js.undefined
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
  var `will-change`: js.UndefOr[WillChangeProperty] = js.undefined
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
  var `word-break`: js.UndefOr[WordBreakProperty] = js.undefined
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
  var `word-spacing`: js.UndefOr[WordSpacingProperty[TLength]] = js.undefined
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
  var `word-wrap`: js.UndefOr[WordWrapProperty] = js.undefined
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
  var `writing-mode`: js.UndefOr[WritingModeProperty] = js.undefined
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
  var `z-index`: js.UndefOr[ZIndexProperty] = js.undefined
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
  var zoom: js.UndefOr[ZoomProperty] = js.undefined
}

object StandardLonghandPropertiesHyphen {
  @scala.inline
  def apply[TLength](): StandardLonghandPropertiesHyphen[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardLonghandPropertiesHyphen[TLength]]
  }
  @scala.inline
  implicit class StandardLonghandPropertiesHyphenOps[Self <: StandardLonghandPropertiesHyphen[_], TLength] (val x: Self with StandardLonghandPropertiesHyphen[TLength]) extends AnyVal {
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
    def `setAlign-content`(value: AlignContentProperty): Self = this.set("align-content", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAlign-content`: Self = this.set("align-content", js.undefined)
    @scala.inline
    def `setAlign-items`(value: AlignItemsProperty): Self = this.set("align-items", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAlign-items`: Self = this.set("align-items", js.undefined)
    @scala.inline
    def `setAlign-self`(value: AlignSelfProperty): Self = this.set("align-self", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAlign-self`: Self = this.set("align-self", js.undefined)
    @scala.inline
    def `setAnimation-delay`(value: GlobalsString): Self = this.set("animation-delay", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAnimation-delay`: Self = this.set("animation-delay", js.undefined)
    @scala.inline
    def `setAnimation-direction`(value: AnimationDirectionProperty): Self = this.set("animation-direction", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAnimation-direction`: Self = this.set("animation-direction", js.undefined)
    @scala.inline
    def `setAnimation-duration`(value: GlobalsString): Self = this.set("animation-duration", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAnimation-duration`: Self = this.set("animation-duration", js.undefined)
    @scala.inline
    def `setAnimation-fill-mode`(value: AnimationFillModeProperty): Self = this.set("animation-fill-mode", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAnimation-fill-mode`: Self = this.set("animation-fill-mode", js.undefined)
    @scala.inline
    def `setAnimation-iteration-count`(value: AnimationIterationCountProperty): Self = this.set("animation-iteration-count", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAnimation-iteration-count`: Self = this.set("animation-iteration-count", js.undefined)
    @scala.inline
    def `setAnimation-name`(value: AnimationNameProperty): Self = this.set("animation-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAnimation-name`: Self = this.set("animation-name", js.undefined)
    @scala.inline
    def `setAnimation-play-state`(value: AnimationPlayStateProperty): Self = this.set("animation-play-state", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAnimation-play-state`: Self = this.set("animation-play-state", js.undefined)
    @scala.inline
    def `setAnimation-timing-function`(value: AnimationTimingFunctionProperty): Self = this.set("animation-timing-function", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAnimation-timing-function`: Self = this.set("animation-timing-function", js.undefined)
    @scala.inline
    def setAppearance(value: AppearanceProperty): Self = this.set("appearance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppearance: Self = this.set("appearance", js.undefined)
    @scala.inline
    def `setBackdrop-filter`(value: BackdropFilterProperty): Self = this.set("backdrop-filter", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackdrop-filter`: Self = this.set("backdrop-filter", js.undefined)
    @scala.inline
    def `setBackface-visibility`(value: BackfaceVisibilityProperty): Self = this.set("backface-visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackface-visibility`: Self = this.set("backface-visibility", js.undefined)
    @scala.inline
    def `setBackground-attachment`(value: BackgroundAttachmentProperty): Self = this.set("background-attachment", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-attachment`: Self = this.set("background-attachment", js.undefined)
    @scala.inline
    def `setBackground-blend-mode`(value: BackgroundBlendModeProperty): Self = this.set("background-blend-mode", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-blend-mode`: Self = this.set("background-blend-mode", js.undefined)
    @scala.inline
    def `setBackground-clip`(value: BackgroundClipProperty): Self = this.set("background-clip", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-clip`: Self = this.set("background-clip", js.undefined)
    @scala.inline
    def `setBackground-color`(value: BackgroundColorProperty): Self = this.set("background-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-color`: Self = this.set("background-color", js.undefined)
    @scala.inline
    def `setBackground-image`(value: BackgroundImageProperty): Self = this.set("background-image", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-image`: Self = this.set("background-image", js.undefined)
    @scala.inline
    def `setBackground-origin`(value: BackgroundOriginProperty): Self = this.set("background-origin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-origin`: Self = this.set("background-origin", js.undefined)
    @scala.inline
    def `setBackground-position`(value: BackgroundPositionProperty[TLength]): Self = this.set("background-position", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-position`: Self = this.set("background-position", js.undefined)
    @scala.inline
    def `setBackground-position-x`(value: BackgroundPositionXProperty[TLength]): Self = this.set("background-position-x", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-position-x`: Self = this.set("background-position-x", js.undefined)
    @scala.inline
    def `setBackground-position-y`(value: BackgroundPositionYProperty[TLength]): Self = this.set("background-position-y", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-position-y`: Self = this.set("background-position-y", js.undefined)
    @scala.inline
    def `setBackground-repeat`(value: BackgroundRepeatProperty): Self = this.set("background-repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-repeat`: Self = this.set("background-repeat", js.undefined)
    @scala.inline
    def `setBackground-size`(value: BackgroundSizeProperty[TLength]): Self = this.set("background-size", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBackground-size`: Self = this.set("background-size", js.undefined)
    @scala.inline
    def `setBlock-overflow`(value: BlockOverflowProperty): Self = this.set("block-overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBlock-overflow`: Self = this.set("block-overflow", js.undefined)
    @scala.inline
    def `setBlock-size`(value: BlockSizeProperty[TLength]): Self = this.set("block-size", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBlock-size`: Self = this.set("block-size", js.undefined)
    @scala.inline
    def `setBorder-block-color`(value: BorderBlockColorProperty): Self = this.set("border-block-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-block-color`: Self = this.set("border-block-color", js.undefined)
    @scala.inline
    def `setBorder-block-end-color`(value: BorderBlockEndColorProperty): Self = this.set("border-block-end-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-block-end-color`: Self = this.set("border-block-end-color", js.undefined)
    @scala.inline
    def `setBorder-block-end-style`(value: BorderBlockEndStyleProperty): Self = this.set("border-block-end-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-block-end-style`: Self = this.set("border-block-end-style", js.undefined)
    @scala.inline
    def `setBorder-block-end-width`(value: BorderBlockEndWidthProperty[TLength]): Self = this.set("border-block-end-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-block-end-width`: Self = this.set("border-block-end-width", js.undefined)
    @scala.inline
    def `setBorder-block-start-color`(value: BorderBlockStartColorProperty): Self = this.set("border-block-start-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-block-start-color`: Self = this.set("border-block-start-color", js.undefined)
    @scala.inline
    def `setBorder-block-start-style`(value: BorderBlockStartStyleProperty): Self = this.set("border-block-start-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-block-start-style`: Self = this.set("border-block-start-style", js.undefined)
    @scala.inline
    def `setBorder-block-start-width`(value: BorderBlockStartWidthProperty[TLength]): Self = this.set("border-block-start-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-block-start-width`: Self = this.set("border-block-start-width", js.undefined)
    @scala.inline
    def `setBorder-block-style`(value: BorderBlockStyleProperty): Self = this.set("border-block-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-block-style`: Self = this.set("border-block-style", js.undefined)
    @scala.inline
    def `setBorder-block-width`(value: BorderBlockWidthProperty[TLength]): Self = this.set("border-block-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-block-width`: Self = this.set("border-block-width", js.undefined)
    @scala.inline
    def `setBorder-bottom-color`(value: BorderBottomColorProperty): Self = this.set("border-bottom-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-bottom-color`: Self = this.set("border-bottom-color", js.undefined)
    @scala.inline
    def `setBorder-bottom-left-radius`(value: BorderBottomLeftRadiusProperty[TLength]): Self = this.set("border-bottom-left-radius", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-bottom-left-radius`: Self = this.set("border-bottom-left-radius", js.undefined)
    @scala.inline
    def `setBorder-bottom-right-radius`(value: BorderBottomRightRadiusProperty[TLength]): Self = this.set("border-bottom-right-radius", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-bottom-right-radius`: Self = this.set("border-bottom-right-radius", js.undefined)
    @scala.inline
    def `setBorder-bottom-style`(value: BorderBottomStyleProperty): Self = this.set("border-bottom-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-bottom-style`: Self = this.set("border-bottom-style", js.undefined)
    @scala.inline
    def `setBorder-bottom-width`(value: BorderBottomWidthProperty[TLength]): Self = this.set("border-bottom-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-bottom-width`: Self = this.set("border-bottom-width", js.undefined)
    @scala.inline
    def `setBorder-collapse`(value: BorderCollapseProperty): Self = this.set("border-collapse", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-collapse`: Self = this.set("border-collapse", js.undefined)
    @scala.inline
    def `setBorder-end-end-radius`(value: BorderEndEndRadiusProperty[TLength]): Self = this.set("border-end-end-radius", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-end-end-radius`: Self = this.set("border-end-end-radius", js.undefined)
    @scala.inline
    def `setBorder-end-start-radius`(value: BorderEndStartRadiusProperty[TLength]): Self = this.set("border-end-start-radius", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-end-start-radius`: Self = this.set("border-end-start-radius", js.undefined)
    @scala.inline
    def `setBorder-image-outset`(value: BorderImageOutsetProperty[TLength]): Self = this.set("border-image-outset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-image-outset`: Self = this.set("border-image-outset", js.undefined)
    @scala.inline
    def `setBorder-image-repeat`(value: BorderImageRepeatProperty): Self = this.set("border-image-repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-image-repeat`: Self = this.set("border-image-repeat", js.undefined)
    @scala.inline
    def `setBorder-image-slice`(value: BorderImageSliceProperty): Self = this.set("border-image-slice", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-image-slice`: Self = this.set("border-image-slice", js.undefined)
    @scala.inline
    def `setBorder-image-source`(value: BorderImageSourceProperty): Self = this.set("border-image-source", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-image-source`: Self = this.set("border-image-source", js.undefined)
    @scala.inline
    def `setBorder-image-width`(value: BorderImageWidthProperty[TLength]): Self = this.set("border-image-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-image-width`: Self = this.set("border-image-width", js.undefined)
    @scala.inline
    def `setBorder-inline-color`(value: BorderInlineColorProperty): Self = this.set("border-inline-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-inline-color`: Self = this.set("border-inline-color", js.undefined)
    @scala.inline
    def `setBorder-inline-end-color`(value: BorderInlineEndColorProperty): Self = this.set("border-inline-end-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-inline-end-color`: Self = this.set("border-inline-end-color", js.undefined)
    @scala.inline
    def `setBorder-inline-end-style`(value: BorderInlineEndStyleProperty): Self = this.set("border-inline-end-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-inline-end-style`: Self = this.set("border-inline-end-style", js.undefined)
    @scala.inline
    def `setBorder-inline-end-width`(value: BorderInlineEndWidthProperty[TLength]): Self = this.set("border-inline-end-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-inline-end-width`: Self = this.set("border-inline-end-width", js.undefined)
    @scala.inline
    def `setBorder-inline-start-color`(value: BorderInlineStartColorProperty): Self = this.set("border-inline-start-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-inline-start-color`: Self = this.set("border-inline-start-color", js.undefined)
    @scala.inline
    def `setBorder-inline-start-style`(value: BorderInlineStartStyleProperty): Self = this.set("border-inline-start-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-inline-start-style`: Self = this.set("border-inline-start-style", js.undefined)
    @scala.inline
    def `setBorder-inline-start-width`(value: BorderInlineStartWidthProperty[TLength]): Self = this.set("border-inline-start-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-inline-start-width`: Self = this.set("border-inline-start-width", js.undefined)
    @scala.inline
    def `setBorder-inline-style`(value: BorderInlineStyleProperty): Self = this.set("border-inline-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-inline-style`: Self = this.set("border-inline-style", js.undefined)
    @scala.inline
    def `setBorder-inline-width`(value: BorderInlineWidthProperty[TLength]): Self = this.set("border-inline-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-inline-width`: Self = this.set("border-inline-width", js.undefined)
    @scala.inline
    def `setBorder-left-color`(value: BorderLeftColorProperty): Self = this.set("border-left-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-left-color`: Self = this.set("border-left-color", js.undefined)
    @scala.inline
    def `setBorder-left-style`(value: BorderLeftStyleProperty): Self = this.set("border-left-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-left-style`: Self = this.set("border-left-style", js.undefined)
    @scala.inline
    def `setBorder-left-width`(value: BorderLeftWidthProperty[TLength]): Self = this.set("border-left-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-left-width`: Self = this.set("border-left-width", js.undefined)
    @scala.inline
    def `setBorder-right-color`(value: BorderRightColorProperty): Self = this.set("border-right-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-right-color`: Self = this.set("border-right-color", js.undefined)
    @scala.inline
    def `setBorder-right-style`(value: BorderRightStyleProperty): Self = this.set("border-right-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-right-style`: Self = this.set("border-right-style", js.undefined)
    @scala.inline
    def `setBorder-right-width`(value: BorderRightWidthProperty[TLength]): Self = this.set("border-right-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-right-width`: Self = this.set("border-right-width", js.undefined)
    @scala.inline
    def `setBorder-spacing`(value: BorderSpacingProperty[TLength]): Self = this.set("border-spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-spacing`: Self = this.set("border-spacing", js.undefined)
    @scala.inline
    def `setBorder-start-end-radius`(value: BorderStartEndRadiusProperty[TLength]): Self = this.set("border-start-end-radius", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-start-end-radius`: Self = this.set("border-start-end-radius", js.undefined)
    @scala.inline
    def `setBorder-start-start-radius`(value: BorderStartStartRadiusProperty[TLength]): Self = this.set("border-start-start-radius", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-start-start-radius`: Self = this.set("border-start-start-radius", js.undefined)
    @scala.inline
    def `setBorder-top-color`(value: BorderTopColorProperty): Self = this.set("border-top-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-top-color`: Self = this.set("border-top-color", js.undefined)
    @scala.inline
    def `setBorder-top-left-radius`(value: BorderTopLeftRadiusProperty[TLength]): Self = this.set("border-top-left-radius", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-top-left-radius`: Self = this.set("border-top-left-radius", js.undefined)
    @scala.inline
    def `setBorder-top-right-radius`(value: BorderTopRightRadiusProperty[TLength]): Self = this.set("border-top-right-radius", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-top-right-radius`: Self = this.set("border-top-right-radius", js.undefined)
    @scala.inline
    def `setBorder-top-style`(value: BorderTopStyleProperty): Self = this.set("border-top-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-top-style`: Self = this.set("border-top-style", js.undefined)
    @scala.inline
    def `setBorder-top-width`(value: BorderTopWidthProperty[TLength]): Self = this.set("border-top-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBorder-top-width`: Self = this.set("border-top-width", js.undefined)
    @scala.inline
    def setBottom(value: BottomProperty[TLength]): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def `setBox-decoration-break`(value: BoxDecorationBreakProperty): Self = this.set("box-decoration-break", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBox-decoration-break`: Self = this.set("box-decoration-break", js.undefined)
    @scala.inline
    def `setBox-shadow`(value: BoxShadowProperty): Self = this.set("box-shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBox-shadow`: Self = this.set("box-shadow", js.undefined)
    @scala.inline
    def `setBox-sizing`(value: BoxSizingProperty): Self = this.set("box-sizing", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBox-sizing`: Self = this.set("box-sizing", js.undefined)
    @scala.inline
    def `setBreak-after`(value: BreakAfterProperty): Self = this.set("break-after", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBreak-after`: Self = this.set("break-after", js.undefined)
    @scala.inline
    def `setBreak-before`(value: BreakBeforeProperty): Self = this.set("break-before", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBreak-before`: Self = this.set("break-before", js.undefined)
    @scala.inline
    def `setBreak-inside`(value: BreakInsideProperty): Self = this.set("break-inside", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBreak-inside`: Self = this.set("break-inside", js.undefined)
    @scala.inline
    def `setCaption-side`(value: CaptionSideProperty): Self = this.set("caption-side", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCaption-side`: Self = this.set("caption-side", js.undefined)
    @scala.inline
    def `setCaret-color`(value: CaretColorProperty): Self = this.set("caret-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCaret-color`: Self = this.set("caret-color", js.undefined)
    @scala.inline
    def setClear(value: ClearProperty): Self = this.set("clear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def `setClip-path`(value: ClipPathProperty): Self = this.set("clip-path", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteClip-path`: Self = this.set("clip-path", js.undefined)
    @scala.inline
    def setColor(value: ColorProperty): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def `setColor-adjust`(value: ColorAdjustProperty): Self = this.set("color-adjust", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColor-adjust`: Self = this.set("color-adjust", js.undefined)
    @scala.inline
    def `setColumn-count`(value: ColumnCountProperty): Self = this.set("column-count", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColumn-count`: Self = this.set("column-count", js.undefined)
    @scala.inline
    def `setColumn-fill`(value: ColumnFillProperty): Self = this.set("column-fill", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColumn-fill`: Self = this.set("column-fill", js.undefined)
    @scala.inline
    def `setColumn-gap`(value: ColumnGapProperty[TLength]): Self = this.set("column-gap", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColumn-gap`: Self = this.set("column-gap", js.undefined)
    @scala.inline
    def `setColumn-rule-color`(value: ColumnRuleColorProperty): Self = this.set("column-rule-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColumn-rule-color`: Self = this.set("column-rule-color", js.undefined)
    @scala.inline
    def `setColumn-rule-style`(value: ColumnRuleStyleProperty): Self = this.set("column-rule-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColumn-rule-style`: Self = this.set("column-rule-style", js.undefined)
    @scala.inline
    def `setColumn-rule-width`(value: ColumnRuleWidthProperty[TLength]): Self = this.set("column-rule-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColumn-rule-width`: Self = this.set("column-rule-width", js.undefined)
    @scala.inline
    def `setColumn-span`(value: ColumnSpanProperty): Self = this.set("column-span", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColumn-span`: Self = this.set("column-span", js.undefined)
    @scala.inline
    def `setColumn-width`(value: ColumnWidthProperty[TLength]): Self = this.set("column-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColumn-width`: Self = this.set("column-width", js.undefined)
    @scala.inline
    def setContain(value: ContainProperty): Self = this.set("contain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContain: Self = this.set("contain", js.undefined)
    @scala.inline
    def setContent(value: ContentProperty): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def `setCounter-increment`(value: CounterIncrementProperty): Self = this.set("counter-increment", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCounter-increment`: Self = this.set("counter-increment", js.undefined)
    @scala.inline
    def `setCounter-reset`(value: CounterResetProperty): Self = this.set("counter-reset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCounter-reset`: Self = this.set("counter-reset", js.undefined)
    @scala.inline
    def `setCounter-set`(value: CounterSetProperty): Self = this.set("counter-set", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCounter-set`: Self = this.set("counter-set", js.undefined)
    @scala.inline
    def setCursor(value: CursorProperty): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setDirection(value: DirectionProperty): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDisplay(value: DisplayProperty): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def `setEmpty-cells`(value: EmptyCellsProperty): Self = this.set("empty-cells", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteEmpty-cells`: Self = this.set("empty-cells", js.undefined)
    @scala.inline
    def setFilter(value: FilterProperty): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def `setFlex-basis`(value: FlexBasisProperty[TLength]): Self = this.set("flex-basis", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFlex-basis`: Self = this.set("flex-basis", js.undefined)
    @scala.inline
    def `setFlex-direction`(value: FlexDirectionProperty): Self = this.set("flex-direction", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFlex-direction`: Self = this.set("flex-direction", js.undefined)
    @scala.inline
    def `setFlex-grow`(value: GlobalsNumber): Self = this.set("flex-grow", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFlex-grow`: Self = this.set("flex-grow", js.undefined)
    @scala.inline
    def `setFlex-shrink`(value: GlobalsNumber): Self = this.set("flex-shrink", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFlex-shrink`: Self = this.set("flex-shrink", js.undefined)
    @scala.inline
    def `setFlex-wrap`(value: FlexWrapProperty): Self = this.set("flex-wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFlex-wrap`: Self = this.set("flex-wrap", js.undefined)
    @scala.inline
    def setFloat(value: FloatProperty): Self = this.set("float", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloat: Self = this.set("float", js.undefined)
    @scala.inline
    def `setFont-family`(value: FontFamilyProperty): Self = this.set("font-family", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-family`: Self = this.set("font-family", js.undefined)
    @scala.inline
    def `setFont-feature-settings`(value: FontFeatureSettingsProperty): Self = this.set("font-feature-settings", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-feature-settings`: Self = this.set("font-feature-settings", js.undefined)
    @scala.inline
    def `setFont-kerning`(value: FontKerningProperty): Self = this.set("font-kerning", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-kerning`: Self = this.set("font-kerning", js.undefined)
    @scala.inline
    def `setFont-language-override`(value: FontLanguageOverrideProperty): Self = this.set("font-language-override", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-language-override`: Self = this.set("font-language-override", js.undefined)
    @scala.inline
    def `setFont-optical-sizing`(value: FontOpticalSizingProperty): Self = this.set("font-optical-sizing", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-optical-sizing`: Self = this.set("font-optical-sizing", js.undefined)
    @scala.inline
    def `setFont-size`(value: FontSizeProperty[TLength]): Self = this.set("font-size", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-size`: Self = this.set("font-size", js.undefined)
    @scala.inline
    def `setFont-size-adjust`(value: FontSizeAdjustProperty): Self = this.set("font-size-adjust", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-size-adjust`: Self = this.set("font-size-adjust", js.undefined)
    @scala.inline
    def `setFont-stretch`(value: FontStretchProperty): Self = this.set("font-stretch", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-stretch`: Self = this.set("font-stretch", js.undefined)
    @scala.inline
    def `setFont-style`(value: FontStyleProperty): Self = this.set("font-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-style`: Self = this.set("font-style", js.undefined)
    @scala.inline
    def `setFont-synthesis`(value: FontSynthesisProperty): Self = this.set("font-synthesis", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-synthesis`: Self = this.set("font-synthesis", js.undefined)
    @scala.inline
    def `setFont-variant`(value: FontVariantProperty): Self = this.set("font-variant", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-variant`: Self = this.set("font-variant", js.undefined)
    @scala.inline
    def `setFont-variant-caps`(value: FontVariantCapsProperty): Self = this.set("font-variant-caps", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-variant-caps`: Self = this.set("font-variant-caps", js.undefined)
    @scala.inline
    def `setFont-variant-east-asian`(value: FontVariantEastAsianProperty): Self = this.set("font-variant-east-asian", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-variant-east-asian`: Self = this.set("font-variant-east-asian", js.undefined)
    @scala.inline
    def `setFont-variant-ligatures`(value: FontVariantLigaturesProperty): Self = this.set("font-variant-ligatures", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-variant-ligatures`: Self = this.set("font-variant-ligatures", js.undefined)
    @scala.inline
    def `setFont-variant-numeric`(value: FontVariantNumericProperty): Self = this.set("font-variant-numeric", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-variant-numeric`: Self = this.set("font-variant-numeric", js.undefined)
    @scala.inline
    def `setFont-variant-position`(value: FontVariantPositionProperty): Self = this.set("font-variant-position", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-variant-position`: Self = this.set("font-variant-position", js.undefined)
    @scala.inline
    def `setFont-variation-settings`(value: FontVariationSettingsProperty): Self = this.set("font-variation-settings", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-variation-settings`: Self = this.set("font-variation-settings", js.undefined)
    @scala.inline
    def `setFont-weight`(value: FontWeightProperty): Self = this.set("font-weight", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-weight`: Self = this.set("font-weight", js.undefined)
    @scala.inline
    def `setGrid-auto-columns`(value: GridAutoColumnsProperty[TLength]): Self = this.set("grid-auto-columns", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGrid-auto-columns`: Self = this.set("grid-auto-columns", js.undefined)
    @scala.inline
    def `setGrid-auto-flow`(value: GridAutoFlowProperty): Self = this.set("grid-auto-flow", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGrid-auto-flow`: Self = this.set("grid-auto-flow", js.undefined)
    @scala.inline
    def `setGrid-auto-rows`(value: GridAutoRowsProperty[TLength]): Self = this.set("grid-auto-rows", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGrid-auto-rows`: Self = this.set("grid-auto-rows", js.undefined)
    @scala.inline
    def `setGrid-column-end`(value: GridColumnEndProperty): Self = this.set("grid-column-end", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGrid-column-end`: Self = this.set("grid-column-end", js.undefined)
    @scala.inline
    def `setGrid-column-start`(value: GridColumnStartProperty): Self = this.set("grid-column-start", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGrid-column-start`: Self = this.set("grid-column-start", js.undefined)
    @scala.inline
    def `setGrid-row-end`(value: GridRowEndProperty): Self = this.set("grid-row-end", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGrid-row-end`: Self = this.set("grid-row-end", js.undefined)
    @scala.inline
    def `setGrid-row-start`(value: GridRowStartProperty): Self = this.set("grid-row-start", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGrid-row-start`: Self = this.set("grid-row-start", js.undefined)
    @scala.inline
    def `setGrid-template-areas`(value: GridTemplateAreasProperty): Self = this.set("grid-template-areas", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGrid-template-areas`: Self = this.set("grid-template-areas", js.undefined)
    @scala.inline
    def `setGrid-template-columns`(value: GridTemplateColumnsProperty[TLength]): Self = this.set("grid-template-columns", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGrid-template-columns`: Self = this.set("grid-template-columns", js.undefined)
    @scala.inline
    def `setGrid-template-rows`(value: GridTemplateRowsProperty[TLength]): Self = this.set("grid-template-rows", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGrid-template-rows`: Self = this.set("grid-template-rows", js.undefined)
    @scala.inline
    def `setHanging-punctuation`(value: HangingPunctuationProperty): Self = this.set("hanging-punctuation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHanging-punctuation`: Self = this.set("hanging-punctuation", js.undefined)
    @scala.inline
    def setHeight(value: HeightProperty[TLength]): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHyphens(value: HyphensProperty): Self = this.set("hyphens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHyphens: Self = this.set("hyphens", js.undefined)
    @scala.inline
    def `setImage-orientation`(value: ImageOrientationProperty): Self = this.set("image-orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteImage-orientation`: Self = this.set("image-orientation", js.undefined)
    @scala.inline
    def `setImage-rendering`(value: ImageRenderingProperty): Self = this.set("image-rendering", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteImage-rendering`: Self = this.set("image-rendering", js.undefined)
    @scala.inline
    def `setImage-resolution`(value: ImageResolutionProperty): Self = this.set("image-resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteImage-resolution`: Self = this.set("image-resolution", js.undefined)
    @scala.inline
    def `setInitial-letter`(value: InitialLetterProperty): Self = this.set("initial-letter", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInitial-letter`: Self = this.set("initial-letter", js.undefined)
    @scala.inline
    def `setInline-size`(value: InlineSizeProperty[TLength]): Self = this.set("inline-size", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInline-size`: Self = this.set("inline-size", js.undefined)
    @scala.inline
    def setInset(value: InsetProperty[TLength]): Self = this.set("inset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInset: Self = this.set("inset", js.undefined)
    @scala.inline
    def `setInset-block`(value: InsetBlockProperty[TLength]): Self = this.set("inset-block", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInset-block`: Self = this.set("inset-block", js.undefined)
    @scala.inline
    def `setInset-block-end`(value: InsetBlockEndProperty[TLength]): Self = this.set("inset-block-end", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInset-block-end`: Self = this.set("inset-block-end", js.undefined)
    @scala.inline
    def `setInset-block-start`(value: InsetBlockStartProperty[TLength]): Self = this.set("inset-block-start", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInset-block-start`: Self = this.set("inset-block-start", js.undefined)
    @scala.inline
    def `setInset-inline`(value: InsetInlineProperty[TLength]): Self = this.set("inset-inline", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInset-inline`: Self = this.set("inset-inline", js.undefined)
    @scala.inline
    def `setInset-inline-end`(value: InsetInlineEndProperty[TLength]): Self = this.set("inset-inline-end", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInset-inline-end`: Self = this.set("inset-inline-end", js.undefined)
    @scala.inline
    def `setInset-inline-start`(value: InsetInlineStartProperty[TLength]): Self = this.set("inset-inline-start", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInset-inline-start`: Self = this.set("inset-inline-start", js.undefined)
    @scala.inline
    def setIsolation(value: IsolationProperty): Self = this.set("isolation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsolation: Self = this.set("isolation", js.undefined)
    @scala.inline
    def `setJustify-content`(value: JustifyContentProperty): Self = this.set("justify-content", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJustify-content`: Self = this.set("justify-content", js.undefined)
    @scala.inline
    def `setJustify-items`(value: JustifyItemsProperty): Self = this.set("justify-items", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJustify-items`: Self = this.set("justify-items", js.undefined)
    @scala.inline
    def `setJustify-self`(value: JustifySelfProperty): Self = this.set("justify-self", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJustify-self`: Self = this.set("justify-self", js.undefined)
    @scala.inline
    def setLeft(value: LeftProperty[TLength]): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def `setLetter-spacing`(value: LetterSpacingProperty[TLength]): Self = this.set("letter-spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLetter-spacing`: Self = this.set("letter-spacing", js.undefined)
    @scala.inline
    def `setLine-break`(value: LineBreakProperty): Self = this.set("line-break", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-break`: Self = this.set("line-break", js.undefined)
    @scala.inline
    def `setLine-height`(value: LineHeightProperty[TLength]): Self = this.set("line-height", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-height`: Self = this.set("line-height", js.undefined)
    @scala.inline
    def `setLine-height-step`(value: LineHeightStepProperty[TLength]): Self = this.set("line-height-step", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-height-step`: Self = this.set("line-height-step", js.undefined)
    @scala.inline
    def `setList-style-image`(value: ListStyleImageProperty): Self = this.set("list-style-image", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteList-style-image`: Self = this.set("list-style-image", js.undefined)
    @scala.inline
    def `setList-style-position`(value: ListStylePositionProperty): Self = this.set("list-style-position", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteList-style-position`: Self = this.set("list-style-position", js.undefined)
    @scala.inline
    def `setList-style-type`(value: ListStyleTypeProperty): Self = this.set("list-style-type", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteList-style-type`: Self = this.set("list-style-type", js.undefined)
    @scala.inline
    def `setMargin-block`(value: MarginBlockProperty[TLength]): Self = this.set("margin-block", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMargin-block`: Self = this.set("margin-block", js.undefined)
    @scala.inline
    def `setMargin-block-end`(value: MarginBlockEndProperty[TLength]): Self = this.set("margin-block-end", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMargin-block-end`: Self = this.set("margin-block-end", js.undefined)
    @scala.inline
    def `setMargin-block-start`(value: MarginBlockStartProperty[TLength]): Self = this.set("margin-block-start", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMargin-block-start`: Self = this.set("margin-block-start", js.undefined)
    @scala.inline
    def `setMargin-bottom`(value: MarginBottomProperty[TLength]): Self = this.set("margin-bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMargin-bottom`: Self = this.set("margin-bottom", js.undefined)
    @scala.inline
    def `setMargin-inline`(value: MarginInlineProperty[TLength]): Self = this.set("margin-inline", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMargin-inline`: Self = this.set("margin-inline", js.undefined)
    @scala.inline
    def `setMargin-inline-end`(value: MarginInlineEndProperty[TLength]): Self = this.set("margin-inline-end", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMargin-inline-end`: Self = this.set("margin-inline-end", js.undefined)
    @scala.inline
    def `setMargin-inline-start`(value: MarginInlineStartProperty[TLength]): Self = this.set("margin-inline-start", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMargin-inline-start`: Self = this.set("margin-inline-start", js.undefined)
    @scala.inline
    def `setMargin-left`(value: MarginLeftProperty[TLength]): Self = this.set("margin-left", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMargin-left`: Self = this.set("margin-left", js.undefined)
    @scala.inline
    def `setMargin-right`(value: MarginRightProperty[TLength]): Self = this.set("margin-right", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMargin-right`: Self = this.set("margin-right", js.undefined)
    @scala.inline
    def `setMargin-top`(value: MarginTopProperty[TLength]): Self = this.set("margin-top", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMargin-top`: Self = this.set("margin-top", js.undefined)
    @scala.inline
    def `setMask-border-mode`(value: MaskBorderModeProperty): Self = this.set("mask-border-mode", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMask-border-mode`: Self = this.set("mask-border-mode", js.undefined)
    @scala.inline
    def `setMask-border-outset`(value: MaskBorderOutsetProperty[TLength]): Self = this.set("mask-border-outset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMask-border-outset`: Self = this.set("mask-border-outset", js.undefined)
    @scala.inline
    def `setMask-border-repeat`(value: MaskBorderRepeatProperty): Self = this.set("mask-border-repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMask-border-repeat`: Self = this.set("mask-border-repeat", js.undefined)
    @scala.inline
    def `setMask-border-slice`(value: MaskBorderSliceProperty): Self = this.set("mask-border-slice", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMask-border-slice`: Self = this.set("mask-border-slice", js.undefined)
    @scala.inline
    def `setMask-border-source`(value: MaskBorderSourceProperty): Self = this.set("mask-border-source", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMask-border-source`: Self = this.set("mask-border-source", js.undefined)
    @scala.inline
    def `setMask-border-width`(value: MaskBorderWidthProperty[TLength]): Self = this.set("mask-border-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMask-border-width`: Self = this.set("mask-border-width", js.undefined)
    @scala.inline
    def `setMask-clip`(value: MaskClipProperty): Self = this.set("mask-clip", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMask-clip`: Self = this.set("mask-clip", js.undefined)
    @scala.inline
    def `setMask-composite`(value: MaskCompositeProperty): Self = this.set("mask-composite", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMask-composite`: Self = this.set("mask-composite", js.undefined)
    @scala.inline
    def `setMask-image`(value: MaskImageProperty): Self = this.set("mask-image", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMask-image`: Self = this.set("mask-image", js.undefined)
    @scala.inline
    def `setMask-mode`(value: MaskModeProperty): Self = this.set("mask-mode", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMask-mode`: Self = this.set("mask-mode", js.undefined)
    @scala.inline
    def `setMask-origin`(value: MaskOriginProperty): Self = this.set("mask-origin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMask-origin`: Self = this.set("mask-origin", js.undefined)
    @scala.inline
    def `setMask-position`(value: MaskPositionProperty[TLength]): Self = this.set("mask-position", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMask-position`: Self = this.set("mask-position", js.undefined)
    @scala.inline
    def `setMask-repeat`(value: MaskRepeatProperty): Self = this.set("mask-repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMask-repeat`: Self = this.set("mask-repeat", js.undefined)
    @scala.inline
    def `setMask-size`(value: MaskSizeProperty[TLength]): Self = this.set("mask-size", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMask-size`: Self = this.set("mask-size", js.undefined)
    @scala.inline
    def `setMask-type`(value: MaskTypeProperty): Self = this.set("mask-type", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMask-type`: Self = this.set("mask-type", js.undefined)
    @scala.inline
    def `setMax-block-size`(value: MaxBlockSizeProperty[TLength]): Self = this.set("max-block-size", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-block-size`: Self = this.set("max-block-size", js.undefined)
    @scala.inline
    def `setMax-height`(value: MaxHeightProperty[TLength]): Self = this.set("max-height", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-height`: Self = this.set("max-height", js.undefined)
    @scala.inline
    def `setMax-inline-size`(value: MaxInlineSizeProperty[TLength]): Self = this.set("max-inline-size", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-inline-size`: Self = this.set("max-inline-size", js.undefined)
    @scala.inline
    def `setMax-lines`(value: MaxLinesProperty): Self = this.set("max-lines", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-lines`: Self = this.set("max-lines", js.undefined)
    @scala.inline
    def `setMax-width`(value: MaxWidthProperty[TLength]): Self = this.set("max-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-width`: Self = this.set("max-width", js.undefined)
    @scala.inline
    def `setMin-block-size`(value: MinBlockSizeProperty[TLength]): Self = this.set("min-block-size", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMin-block-size`: Self = this.set("min-block-size", js.undefined)
    @scala.inline
    def `setMin-height`(value: MinHeightProperty[TLength]): Self = this.set("min-height", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMin-height`: Self = this.set("min-height", js.undefined)
    @scala.inline
    def `setMin-inline-size`(value: MinInlineSizeProperty[TLength]): Self = this.set("min-inline-size", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMin-inline-size`: Self = this.set("min-inline-size", js.undefined)
    @scala.inline
    def `setMin-width`(value: MinWidthProperty[TLength]): Self = this.set("min-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMin-width`: Self = this.set("min-width", js.undefined)
    @scala.inline
    def `setMix-blend-mode`(value: MixBlendModeProperty): Self = this.set("mix-blend-mode", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMix-blend-mode`: Self = this.set("mix-blend-mode", js.undefined)
    @scala.inline
    def `setMotion-distance`(value: OffsetDistanceProperty[TLength]): Self = this.set("motion-distance", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMotion-distance`: Self = this.set("motion-distance", js.undefined)
    @scala.inline
    def `setMotion-path`(value: OffsetPathProperty): Self = this.set("motion-path", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMotion-path`: Self = this.set("motion-path", js.undefined)
    @scala.inline
    def `setMotion-rotation`(value: OffsetRotateProperty): Self = this.set("motion-rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMotion-rotation`: Self = this.set("motion-rotation", js.undefined)
    @scala.inline
    def `setObject-fit`(value: ObjectFitProperty): Self = this.set("object-fit", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteObject-fit`: Self = this.set("object-fit", js.undefined)
    @scala.inline
    def `setObject-position`(value: ObjectPositionProperty[TLength]): Self = this.set("object-position", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteObject-position`: Self = this.set("object-position", js.undefined)
    @scala.inline
    def `setOffset-anchor`(value: OffsetAnchorProperty[TLength]): Self = this.set("offset-anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOffset-anchor`: Self = this.set("offset-anchor", js.undefined)
    @scala.inline
    def `setOffset-distance`(value: OffsetDistanceProperty[TLength]): Self = this.set("offset-distance", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOffset-distance`: Self = this.set("offset-distance", js.undefined)
    @scala.inline
    def `setOffset-path`(value: OffsetPathProperty): Self = this.set("offset-path", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOffset-path`: Self = this.set("offset-path", js.undefined)
    @scala.inline
    def `setOffset-position`(value: OffsetPositionProperty[TLength]): Self = this.set("offset-position", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOffset-position`: Self = this.set("offset-position", js.undefined)
    @scala.inline
    def `setOffset-rotate`(value: OffsetRotateProperty): Self = this.set("offset-rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOffset-rotate`: Self = this.set("offset-rotate", js.undefined)
    @scala.inline
    def `setOffset-rotation`(value: OffsetRotateProperty): Self = this.set("offset-rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOffset-rotation`: Self = this.set("offset-rotation", js.undefined)
    @scala.inline
    def setOpacity(value: GlobalsNumber): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOrder(value: GlobalsNumber): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setOrphans(value: GlobalsNumber): Self = this.set("orphans", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrphans: Self = this.set("orphans", js.undefined)
    @scala.inline
    def `setOutline-color`(value: OutlineColorProperty): Self = this.set("outline-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOutline-color`: Self = this.set("outline-color", js.undefined)
    @scala.inline
    def `setOutline-offset`(value: OutlineOffsetProperty[TLength]): Self = this.set("outline-offset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOutline-offset`: Self = this.set("outline-offset", js.undefined)
    @scala.inline
    def `setOutline-style`(value: OutlineStyleProperty): Self = this.set("outline-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOutline-style`: Self = this.set("outline-style", js.undefined)
    @scala.inline
    def `setOutline-width`(value: OutlineWidthProperty[TLength]): Self = this.set("outline-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOutline-width`: Self = this.set("outline-width", js.undefined)
    @scala.inline
    def setOverflow(value: OverflowProperty): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    @scala.inline
    def `setOverflow-anchor`(value: OverflowAnchorProperty): Self = this.set("overflow-anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOverflow-anchor`: Self = this.set("overflow-anchor", js.undefined)
    @scala.inline
    def `setOverflow-block`(value: OverflowBlockProperty): Self = this.set("overflow-block", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOverflow-block`: Self = this.set("overflow-block", js.undefined)
    @scala.inline
    def `setOverflow-clip-box`(value: OverflowClipBoxProperty): Self = this.set("overflow-clip-box", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOverflow-clip-box`: Self = this.set("overflow-clip-box", js.undefined)
    @scala.inline
    def `setOverflow-inline`(value: OverflowInlineProperty): Self = this.set("overflow-inline", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOverflow-inline`: Self = this.set("overflow-inline", js.undefined)
    @scala.inline
    def `setOverflow-wrap`(value: OverflowWrapProperty): Self = this.set("overflow-wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOverflow-wrap`: Self = this.set("overflow-wrap", js.undefined)
    @scala.inline
    def `setOverflow-x`(value: OverflowXProperty): Self = this.set("overflow-x", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOverflow-x`: Self = this.set("overflow-x", js.undefined)
    @scala.inline
    def `setOverflow-y`(value: OverflowYProperty): Self = this.set("overflow-y", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOverflow-y`: Self = this.set("overflow-y", js.undefined)
    @scala.inline
    def `setOverscroll-behavior`(value: OverscrollBehaviorProperty): Self = this.set("overscroll-behavior", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOverscroll-behavior`: Self = this.set("overscroll-behavior", js.undefined)
    @scala.inline
    def `setOverscroll-behavior-x`(value: OverscrollBehaviorXProperty): Self = this.set("overscroll-behavior-x", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOverscroll-behavior-x`: Self = this.set("overscroll-behavior-x", js.undefined)
    @scala.inline
    def `setOverscroll-behavior-y`(value: OverscrollBehaviorYProperty): Self = this.set("overscroll-behavior-y", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOverscroll-behavior-y`: Self = this.set("overscroll-behavior-y", js.undefined)
    @scala.inline
    def `setPadding-block`(value: PaddingBlockProperty[TLength]): Self = this.set("padding-block", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePadding-block`: Self = this.set("padding-block", js.undefined)
    @scala.inline
    def `setPadding-block-end`(value: PaddingBlockEndProperty[TLength]): Self = this.set("padding-block-end", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePadding-block-end`: Self = this.set("padding-block-end", js.undefined)
    @scala.inline
    def `setPadding-block-start`(value: PaddingBlockStartProperty[TLength]): Self = this.set("padding-block-start", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePadding-block-start`: Self = this.set("padding-block-start", js.undefined)
    @scala.inline
    def `setPadding-bottom`(value: PaddingBottomProperty[TLength]): Self = this.set("padding-bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePadding-bottom`: Self = this.set("padding-bottom", js.undefined)
    @scala.inline
    def `setPadding-inline`(value: PaddingInlineProperty[TLength]): Self = this.set("padding-inline", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePadding-inline`: Self = this.set("padding-inline", js.undefined)
    @scala.inline
    def `setPadding-inline-end`(value: PaddingInlineEndProperty[TLength]): Self = this.set("padding-inline-end", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePadding-inline-end`: Self = this.set("padding-inline-end", js.undefined)
    @scala.inline
    def `setPadding-inline-start`(value: PaddingInlineStartProperty[TLength]): Self = this.set("padding-inline-start", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePadding-inline-start`: Self = this.set("padding-inline-start", js.undefined)
    @scala.inline
    def `setPadding-left`(value: PaddingLeftProperty[TLength]): Self = this.set("padding-left", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePadding-left`: Self = this.set("padding-left", js.undefined)
    @scala.inline
    def `setPadding-right`(value: PaddingRightProperty[TLength]): Self = this.set("padding-right", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePadding-right`: Self = this.set("padding-right", js.undefined)
    @scala.inline
    def `setPadding-top`(value: PaddingTopProperty[TLength]): Self = this.set("padding-top", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePadding-top`: Self = this.set("padding-top", js.undefined)
    @scala.inline
    def `setPage-break-after`(value: PageBreakAfterProperty): Self = this.set("page-break-after", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePage-break-after`: Self = this.set("page-break-after", js.undefined)
    @scala.inline
    def `setPage-break-before`(value: PageBreakBeforeProperty): Self = this.set("page-break-before", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePage-break-before`: Self = this.set("page-break-before", js.undefined)
    @scala.inline
    def `setPage-break-inside`(value: PageBreakInsideProperty): Self = this.set("page-break-inside", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePage-break-inside`: Self = this.set("page-break-inside", js.undefined)
    @scala.inline
    def `setPaint-order`(value: PaintOrderProperty): Self = this.set("paint-order", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePaint-order`: Self = this.set("paint-order", js.undefined)
    @scala.inline
    def setPerspective(value: PerspectiveProperty[TLength]): Self = this.set("perspective", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerspective: Self = this.set("perspective", js.undefined)
    @scala.inline
    def `setPerspective-origin`(value: PerspectiveOriginProperty[TLength]): Self = this.set("perspective-origin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePerspective-origin`: Self = this.set("perspective-origin", js.undefined)
    @scala.inline
    def `setPlace-content`(value: PlaceContentProperty): Self = this.set("place-content", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePlace-content`: Self = this.set("place-content", js.undefined)
    @scala.inline
    def `setPointer-events`(value: PointerEventsProperty): Self = this.set("pointer-events", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePointer-events`: Self = this.set("pointer-events", js.undefined)
    @scala.inline
    def setPosition(value: PositionProperty): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setQuotes(value: QuotesProperty): Self = this.set("quotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotes: Self = this.set("quotes", js.undefined)
    @scala.inline
    def setResize(value: ResizeProperty): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setRight(value: RightProperty[TLength]): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setRotate(value: RotateProperty): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def `setRow-gap`(value: RowGapProperty[TLength]): Self = this.set("row-gap", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRow-gap`: Self = this.set("row-gap", js.undefined)
    @scala.inline
    def `setRuby-align`(value: RubyAlignProperty): Self = this.set("ruby-align", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRuby-align`: Self = this.set("ruby-align", js.undefined)
    @scala.inline
    def `setRuby-merge`(value: RubyMergeProperty): Self = this.set("ruby-merge", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRuby-merge`: Self = this.set("ruby-merge", js.undefined)
    @scala.inline
    def `setRuby-position`(value: RubyPositionProperty): Self = this.set("ruby-position", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRuby-position`: Self = this.set("ruby-position", js.undefined)
    @scala.inline
    def setScale(value: ScaleProperty): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def `setScroll-behavior`(value: ScrollBehaviorProperty): Self = this.set("scroll-behavior", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-behavior`: Self = this.set("scroll-behavior", js.undefined)
    @scala.inline
    def `setScroll-margin`(value: ScrollMarginProperty[TLength]): Self = this.set("scroll-margin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-margin`: Self = this.set("scroll-margin", js.undefined)
    @scala.inline
    def `setScroll-margin-block`(value: ScrollMarginBlockProperty[TLength]): Self = this.set("scroll-margin-block", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-margin-block`: Self = this.set("scroll-margin-block", js.undefined)
    @scala.inline
    def `setScroll-margin-block-end`(value: ScrollMarginBlockEndProperty[TLength]): Self = this.set("scroll-margin-block-end", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-margin-block-end`: Self = this.set("scroll-margin-block-end", js.undefined)
    @scala.inline
    def `setScroll-margin-block-start`(value: ScrollMarginBlockStartProperty[TLength]): Self = this.set("scroll-margin-block-start", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-margin-block-start`: Self = this.set("scroll-margin-block-start", js.undefined)
    @scala.inline
    def `setScroll-margin-bottom`(value: ScrollMarginBottomProperty[TLength]): Self = this.set("scroll-margin-bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-margin-bottom`: Self = this.set("scroll-margin-bottom", js.undefined)
    @scala.inline
    def `setScroll-margin-inline`(value: ScrollMarginInlineProperty[TLength]): Self = this.set("scroll-margin-inline", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-margin-inline`: Self = this.set("scroll-margin-inline", js.undefined)
    @scala.inline
    def `setScroll-margin-inline-end`(value: ScrollMarginInlineEndProperty[TLength]): Self = this.set("scroll-margin-inline-end", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-margin-inline-end`: Self = this.set("scroll-margin-inline-end", js.undefined)
    @scala.inline
    def `setScroll-margin-inline-start`(value: ScrollMarginInlineStartProperty[TLength]): Self = this.set("scroll-margin-inline-start", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-margin-inline-start`: Self = this.set("scroll-margin-inline-start", js.undefined)
    @scala.inline
    def `setScroll-margin-left`(value: ScrollMarginLeftProperty[TLength]): Self = this.set("scroll-margin-left", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-margin-left`: Self = this.set("scroll-margin-left", js.undefined)
    @scala.inline
    def `setScroll-margin-right`(value: ScrollMarginRightProperty[TLength]): Self = this.set("scroll-margin-right", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-margin-right`: Self = this.set("scroll-margin-right", js.undefined)
    @scala.inline
    def `setScroll-margin-top`(value: ScrollMarginTopProperty[TLength]): Self = this.set("scroll-margin-top", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-margin-top`: Self = this.set("scroll-margin-top", js.undefined)
    @scala.inline
    def `setScroll-padding`(value: ScrollPaddingProperty[TLength]): Self = this.set("scroll-padding", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-padding`: Self = this.set("scroll-padding", js.undefined)
    @scala.inline
    def `setScroll-padding-block`(value: ScrollPaddingBlockProperty[TLength]): Self = this.set("scroll-padding-block", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-padding-block`: Self = this.set("scroll-padding-block", js.undefined)
    @scala.inline
    def `setScroll-padding-block-end`(value: ScrollPaddingBlockEndProperty[TLength]): Self = this.set("scroll-padding-block-end", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-padding-block-end`: Self = this.set("scroll-padding-block-end", js.undefined)
    @scala.inline
    def `setScroll-padding-block-start`(value: ScrollPaddingBlockStartProperty[TLength]): Self = this.set("scroll-padding-block-start", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-padding-block-start`: Self = this.set("scroll-padding-block-start", js.undefined)
    @scala.inline
    def `setScroll-padding-bottom`(value: ScrollPaddingBottomProperty[TLength]): Self = this.set("scroll-padding-bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-padding-bottom`: Self = this.set("scroll-padding-bottom", js.undefined)
    @scala.inline
    def `setScroll-padding-inline`(value: ScrollPaddingInlineProperty[TLength]): Self = this.set("scroll-padding-inline", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-padding-inline`: Self = this.set("scroll-padding-inline", js.undefined)
    @scala.inline
    def `setScroll-padding-inline-end`(value: ScrollPaddingInlineEndProperty[TLength]): Self = this.set("scroll-padding-inline-end", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-padding-inline-end`: Self = this.set("scroll-padding-inline-end", js.undefined)
    @scala.inline
    def `setScroll-padding-inline-start`(value: ScrollPaddingInlineStartProperty[TLength]): Self = this.set("scroll-padding-inline-start", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-padding-inline-start`: Self = this.set("scroll-padding-inline-start", js.undefined)
    @scala.inline
    def `setScroll-padding-left`(value: ScrollPaddingLeftProperty[TLength]): Self = this.set("scroll-padding-left", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-padding-left`: Self = this.set("scroll-padding-left", js.undefined)
    @scala.inline
    def `setScroll-padding-right`(value: ScrollPaddingRightProperty[TLength]): Self = this.set("scroll-padding-right", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-padding-right`: Self = this.set("scroll-padding-right", js.undefined)
    @scala.inline
    def `setScroll-padding-top`(value: ScrollPaddingTopProperty[TLength]): Self = this.set("scroll-padding-top", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-padding-top`: Self = this.set("scroll-padding-top", js.undefined)
    @scala.inline
    def `setScroll-snap-align`(value: ScrollSnapAlignProperty): Self = this.set("scroll-snap-align", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-snap-align`: Self = this.set("scroll-snap-align", js.undefined)
    @scala.inline
    def `setScroll-snap-stop`(value: ScrollSnapStopProperty): Self = this.set("scroll-snap-stop", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-snap-stop`: Self = this.set("scroll-snap-stop", js.undefined)
    @scala.inline
    def `setScroll-snap-type`(value: ScrollSnapTypeProperty): Self = this.set("scroll-snap-type", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-snap-type`: Self = this.set("scroll-snap-type", js.undefined)
    @scala.inline
    def `setScrollbar-color`(value: ScrollbarColorProperty): Self = this.set("scrollbar-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScrollbar-color`: Self = this.set("scrollbar-color", js.undefined)
    @scala.inline
    def `setScrollbar-width`(value: ScrollbarWidthProperty): Self = this.set("scrollbar-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScrollbar-width`: Self = this.set("scrollbar-width", js.undefined)
    @scala.inline
    def `setShape-image-threshold`(value: GlobalsNumber): Self = this.set("shape-image-threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShape-image-threshold`: Self = this.set("shape-image-threshold", js.undefined)
    @scala.inline
    def `setShape-margin`(value: ShapeMarginProperty[TLength]): Self = this.set("shape-margin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShape-margin`: Self = this.set("shape-margin", js.undefined)
    @scala.inline
    def `setShape-outside`(value: ShapeOutsideProperty): Self = this.set("shape-outside", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShape-outside`: Self = this.set("shape-outside", js.undefined)
    @scala.inline
    def `setTab-size`(value: TabSizeProperty[TLength]): Self = this.set("tab-size", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTab-size`: Self = this.set("tab-size", js.undefined)
    @scala.inline
    def `setTable-layout`(value: TableLayoutProperty): Self = this.set("table-layout", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTable-layout`: Self = this.set("table-layout", js.undefined)
    @scala.inline
    def `setText-align`(value: TextAlignProperty): Self = this.set("text-align", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-align`: Self = this.set("text-align", js.undefined)
    @scala.inline
    def `setText-align-last`(value: TextAlignLastProperty): Self = this.set("text-align-last", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-align-last`: Self = this.set("text-align-last", js.undefined)
    @scala.inline
    def `setText-combine-upright`(value: TextCombineUprightProperty): Self = this.set("text-combine-upright", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-combine-upright`: Self = this.set("text-combine-upright", js.undefined)
    @scala.inline
    def `setText-decoration-color`(value: TextDecorationColorProperty): Self = this.set("text-decoration-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-decoration-color`: Self = this.set("text-decoration-color", js.undefined)
    @scala.inline
    def `setText-decoration-line`(value: TextDecorationLineProperty): Self = this.set("text-decoration-line", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-decoration-line`: Self = this.set("text-decoration-line", js.undefined)
    @scala.inline
    def `setText-decoration-skip`(value: TextDecorationSkipProperty): Self = this.set("text-decoration-skip", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-decoration-skip`: Self = this.set("text-decoration-skip", js.undefined)
    @scala.inline
    def `setText-decoration-skip-ink`(value: TextDecorationSkipInkProperty): Self = this.set("text-decoration-skip-ink", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-decoration-skip-ink`: Self = this.set("text-decoration-skip-ink", js.undefined)
    @scala.inline
    def `setText-decoration-style`(value: TextDecorationStyleProperty): Self = this.set("text-decoration-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-decoration-style`: Self = this.set("text-decoration-style", js.undefined)
    @scala.inline
    def `setText-emphasis-color`(value: TextEmphasisColorProperty): Self = this.set("text-emphasis-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-emphasis-color`: Self = this.set("text-emphasis-color", js.undefined)
    @scala.inline
    def `setText-emphasis-position`(value: GlobalsString): Self = this.set("text-emphasis-position", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-emphasis-position`: Self = this.set("text-emphasis-position", js.undefined)
    @scala.inline
    def `setText-emphasis-style`(value: TextEmphasisStyleProperty): Self = this.set("text-emphasis-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-emphasis-style`: Self = this.set("text-emphasis-style", js.undefined)
    @scala.inline
    def `setText-indent`(value: TextIndentProperty[TLength]): Self = this.set("text-indent", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-indent`: Self = this.set("text-indent", js.undefined)
    @scala.inline
    def `setText-justify`(value: TextJustifyProperty): Self = this.set("text-justify", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-justify`: Self = this.set("text-justify", js.undefined)
    @scala.inline
    def `setText-orientation`(value: TextOrientationProperty): Self = this.set("text-orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-orientation`: Self = this.set("text-orientation", js.undefined)
    @scala.inline
    def `setText-overflow`(value: TextOverflowProperty): Self = this.set("text-overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-overflow`: Self = this.set("text-overflow", js.undefined)
    @scala.inline
    def `setText-rendering`(value: TextRenderingProperty): Self = this.set("text-rendering", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-rendering`: Self = this.set("text-rendering", js.undefined)
    @scala.inline
    def `setText-shadow`(value: TextShadowProperty): Self = this.set("text-shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-shadow`: Self = this.set("text-shadow", js.undefined)
    @scala.inline
    def `setText-size-adjust`(value: TextSizeAdjustProperty): Self = this.set("text-size-adjust", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-size-adjust`: Self = this.set("text-size-adjust", js.undefined)
    @scala.inline
    def `setText-transform`(value: TextTransformProperty): Self = this.set("text-transform", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-transform`: Self = this.set("text-transform", js.undefined)
    @scala.inline
    def `setText-underline-position`(value: TextUnderlinePositionProperty): Self = this.set("text-underline-position", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-underline-position`: Self = this.set("text-underline-position", js.undefined)
    @scala.inline
    def setTop(value: TopProperty[TLength]): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def `setTouch-action`(value: TouchActionProperty): Self = this.set("touch-action", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTouch-action`: Self = this.set("touch-action", js.undefined)
    @scala.inline
    def setTransform(value: TransformProperty): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def `setTransform-box`(value: TransformBoxProperty): Self = this.set("transform-box", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTransform-box`: Self = this.set("transform-box", js.undefined)
    @scala.inline
    def `setTransform-origin`(value: TransformOriginProperty[TLength]): Self = this.set("transform-origin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTransform-origin`: Self = this.set("transform-origin", js.undefined)
    @scala.inline
    def `setTransform-style`(value: TransformStyleProperty): Self = this.set("transform-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTransform-style`: Self = this.set("transform-style", js.undefined)
    @scala.inline
    def `setTransition-delay`(value: GlobalsString): Self = this.set("transition-delay", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTransition-delay`: Self = this.set("transition-delay", js.undefined)
    @scala.inline
    def `setTransition-duration`(value: GlobalsString): Self = this.set("transition-duration", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTransition-duration`: Self = this.set("transition-duration", js.undefined)
    @scala.inline
    def `setTransition-property`(value: TransitionPropertyProperty): Self = this.set("transition-property", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTransition-property`: Self = this.set("transition-property", js.undefined)
    @scala.inline
    def `setTransition-timing-function`(value: TransitionTimingFunctionProperty): Self = this.set("transition-timing-function", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTransition-timing-function`: Self = this.set("transition-timing-function", js.undefined)
    @scala.inline
    def setTranslate(value: TranslateProperty[TLength]): Self = this.set("translate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    @scala.inline
    def `setUnicode-bidi`(value: UnicodeBidiProperty): Self = this.set("unicode-bidi", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUnicode-bidi`: Self = this.set("unicode-bidi", js.undefined)
    @scala.inline
    def `setUser-select`(value: UserSelectProperty): Self = this.set("user-select", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUser-select`: Self = this.set("user-select", js.undefined)
    @scala.inline
    def `setVertical-align`(value: VerticalAlignProperty[TLength]): Self = this.set("vertical-align", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteVertical-align`: Self = this.set("vertical-align", js.undefined)
    @scala.inline
    def setVisibility(value: VisibilityProperty): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
    @scala.inline
    def `setWhite-space`(value: WhiteSpaceProperty): Self = this.set("white-space", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteWhite-space`: Self = this.set("white-space", js.undefined)
    @scala.inline
    def setWidows(value: GlobalsNumber): Self = this.set("widows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidows: Self = this.set("widows", js.undefined)
    @scala.inline
    def setWidth(value: WidthProperty[TLength]): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def `setWill-change`(value: WillChangeProperty): Self = this.set("will-change", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteWill-change`: Self = this.set("will-change", js.undefined)
    @scala.inline
    def `setWord-break`(value: WordBreakProperty): Self = this.set("word-break", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteWord-break`: Self = this.set("word-break", js.undefined)
    @scala.inline
    def `setWord-spacing`(value: WordSpacingProperty[TLength]): Self = this.set("word-spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteWord-spacing`: Self = this.set("word-spacing", js.undefined)
    @scala.inline
    def `setWord-wrap`(value: WordWrapProperty): Self = this.set("word-wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteWord-wrap`: Self = this.set("word-wrap", js.undefined)
    @scala.inline
    def `setWriting-mode`(value: WritingModeProperty): Self = this.set("writing-mode", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteWriting-mode`: Self = this.set("writing-mode", js.undefined)
    @scala.inline
    def `setZ-index`(value: ZIndexProperty): Self = this.set("z-index", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteZ-index`: Self = this.set("z-index", js.undefined)
    @scala.inline
    def setZoom(value: ZoomProperty): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

