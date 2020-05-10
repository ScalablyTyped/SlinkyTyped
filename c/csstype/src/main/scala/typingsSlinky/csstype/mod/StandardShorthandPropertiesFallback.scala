package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardShorthandPropertiesFallback[TLength] extends js.Object {
  /**
    * The `**all**` CSS shorthand property sets all of an element's properties (other than `unicode-bidi` and `direction`) to their initial or inherited values, or to the values specified in another stylesheet origin.
    *
    * **Initial value**: There is no practical initial value for it.
    *
    * | Chrome | Firefox | Safari  | Edge | IE  |
    * | :----: | :-----: | :-----: | :--: | :-: |
    * | **37** | **27**  | **9.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/all
    */
  var all: js.UndefOr[Globals | js.Array[Globals]] = js.native
  /**
    * The **`animation`** shorthand CSS property sets an animated transition between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **43**  | **16**  |  **9**  | **12** | **10** |
    * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation
    */
  var animation: js.UndefOr[AnimationProperty | js.Array[AnimationProperty]] = js.native
  /**
    * The **`background`** shorthand CSS property sets all background style properties at once, such as color, image, origin and size, or repeat method.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background
    */
  var background: js.UndefOr[BackgroundProperty[TLength] | js.Array[BackgroundProperty[TLength]]] = js.native
  /**
    * The **`border`** CSS property sets an element's border. It's a shorthand for `border-width`, `border-style`, and `border-color`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border
    */
  var border: js.UndefOr[BorderProperty[TLength] | js.Array[BorderProperty[TLength]]] = js.native
  /**
    * The **`border-block`** CSS property is a shorthand property for setting the individual logical block border property values in a single place in the style sheet.
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block
    */
  var borderBlock: js.UndefOr[BorderBlockProperty[TLength] | js.Array[BorderBlockProperty[TLength]]] = js.native
  /**
    * The **`border-block-end`** CSS property is a shorthand property for setting the individual logical block-end border property values in a single place in the style sheet.
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end
    */
  var borderBlockEnd: js.UndefOr[BorderBlockEndProperty[TLength] | js.Array[BorderBlockEndProperty[TLength]]] = js.native
  /**
    * The **`border-block-start`** CSS property is a shorthand property for setting the individual logical block-start border property values in a single place in the style sheet.
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start
    */
  var borderBlockStart: js.UndefOr[BorderBlockStartProperty[TLength] | js.Array[BorderBlockStartProperty[TLength]]] = js.native
  /**
    * The **`border-bottom`** CSS property is a shorthand that sets the values of `border-bottom-width`, `border-bottom-style` and `border-bottom-color`. These properties set an element's bottom border.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom
    */
  var borderBottom: js.UndefOr[BorderBottomProperty[TLength] | js.Array[BorderBottomProperty[TLength]]] = js.native
  /**
    * The **`border-color`** shorthand CSS property sets the color of all sides of an element's border.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-color
    */
  var borderColor: js.UndefOr[BorderColorProperty | js.Array[BorderColorProperty]] = js.native
  /**
    * The **`border-image`** CSS property draws an image in place of an element's `border-style`.
    *
    * | Chrome  |  Firefox  | Safari  |  Edge  |   IE   |
    * | :-----: | :-------: | :-----: | :----: | :----: |
    * | **16**  |  **15**   |  **6**  | **12** | **11** |
    * | 7 _-x-_ | 3.5 _-x-_ | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image
    */
  var borderImage: js.UndefOr[BorderImageProperty | js.Array[BorderImageProperty]] = js.native
  /**
    * The **`border-inline`** CSS property is a shorthand property for setting the individual logical inline border property values in a single place in the style sheet.
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline
    */
  var borderInline: js.UndefOr[BorderInlineProperty[TLength] | js.Array[BorderInlineProperty[TLength]]] = js.native
  /**
    * The **`border-inline-end`** CSS property is a shorthand property for setting the individual logical inline-end border property values in a single place in the style sheet.
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end
    */
  var borderInlineEnd: js.UndefOr[BorderInlineEndProperty[TLength] | js.Array[BorderInlineEndProperty[TLength]]] = js.native
  /**
    * The **`border-inline-start`** CSS property is a shorthand property for setting the individual logical inline-start border property values in a single place in the style sheet.
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start
    */
  var borderInlineStart: js.UndefOr[
    BorderInlineStartProperty[TLength] | js.Array[BorderInlineStartProperty[TLength]]
  ] = js.native
  /**
    * The **`border-left`** CSS property is a shorthand that sets the values of `border-left-width`, `border-left-style` and `border-left-color`. These properties set an element's left border.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left
    */
  var borderLeft: js.UndefOr[BorderLeftProperty[TLength] | js.Array[BorderLeftProperty[TLength]]] = js.native
  /**
    * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **4**  |  **4**  |  **5**  | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-radius
    */
  var borderRadius: js.UndefOr[BorderRadiusProperty[TLength] | js.Array[BorderRadiusProperty[TLength]]] = js.native
  /**
    * The **`border-right`** CSS property is a shorthand that sets the values of `border-right-width`, `border-right-style` and `border-right-color`. These properties set an element's right border.
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right
    */
  var borderRight: js.UndefOr[BorderRightProperty[TLength] | js.Array[BorderRightProperty[TLength]]] = js.native
  /**
    * The **`border-style`** CSS property is a shorthand property that sets the line style for all four sides of an element's border.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-style
    */
  var borderStyle: js.UndefOr[BorderStyleProperty | js.Array[BorderStyleProperty]] = js.native
  /**
    * The **`border-top`** CSS property is a shorthand that sets the values of `border-top-width`, `border-top-style` and `border-top-color`. These properties set an element's top border.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top
    */
  var borderTop: js.UndefOr[BorderTopProperty[TLength] | js.Array[BorderTopProperty[TLength]]] = js.native
  /**
    * The **`border-width`** shorthand CSS property sets the widths of all four sides of an element's border.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-width
    */
  var borderWidth: js.UndefOr[BorderWidthProperty[TLength] | js.Array[BorderWidthProperty[TLength]]] = js.native
  /**
    * The **`column-rule`** CSS property sets the width, style, and color of the rule (line) drawn between columns in a multi-column layout.
    *
    * | Chrome |  Firefox  | Safari  |  Edge  |   IE   |
    * | :----: | :-------: | :-----: | :----: | :----: |
    * | **50** |  **52**   |  **9**  | **12** | **10** |
    * |        | 3.5 _-x-_ | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule
    */
  var columnRule: js.UndefOr[ColumnRuleProperty[TLength] | js.Array[ColumnRuleProperty[TLength]]] = js.native
  /**
    * The **`columns`** CSS property sets the column width and column count of an element.
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE   |
    * | :----: | :-----: | :-----: | :----: | :----: |
    * | **50** | **52**  |  **9**  | **12** | **10** |
    * |        | 9 _-x-_ | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/columns
    */
  var columns: js.UndefOr[ColumnsProperty[TLength] | js.Array[ColumnsProperty[TLength]]] = js.native
  /**
    * The **`flex`** CSS property sets how a flex item will grow or shrink to fit the space available in its flex container. It is a shorthand for `flex-grow`, `flex-shrink`, and `flex-basis`.
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |    IE    |
    * | :------: | :-----: | :-------: | :----: | :------: |
    * |  **29**  | **20**  |   **9**   | **12** |  **11**  |
    * | 21 _-x-_ |         | 6.1 _-x-_ |        | 10 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex
    */
  var flex: js.UndefOr[FlexProperty[TLength] | js.Array[FlexProperty[TLength]]] = js.native
  /**
    * The **`flex-flow`** CSS property is a shorthand property for `flex-direction` and `flex-wrap` properties.
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :------: | :-----: | :-------: | :----: | :----: |
    * |  **29**  | **28**  |   **9**   | **12** | **11** |
    * | 21 _-x-_ |         | 6.1 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-flow
    */
  var flexFlow: js.UndefOr[FlexFlowProperty | js.Array[FlexFlowProperty]] = js.native
  /**
    * The **`font`** CSS property is a shorthand for `font-style`, `font-variant`, `font-weight`, `font-size`, `line-height`, and `font-family`. Alternatively, it sets an element's font to a system font.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font
    */
  var font: js.UndefOr[FontProperty | js.Array[FontProperty]] = js.native
  /**
    * The **`gap`** CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for `row-gap` and `column-gap`.
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
    * |     Chrome      |     Firefox     |        Safari         |  Edge  | IE  |
    * | :-------------: | :-------------: | :-------------------: | :----: | :-: |
    * |     **66**      |     **61**      | **10.1** _(grid-gap)_ | **16** | No  |
    * | 57 _(grid-gap)_ | 52 _(grid-gap)_ |                       |        |     |
    *
    * ---
    *
    * _Supported in Multi-column Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **66** | **61**  |   No   | **16** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/gap
    */
  var gap: js.UndefOr[GapProperty[TLength] | js.Array[GapProperty[TLength]]] = js.native
  /**
    * The **`grid`** CSS property is a shorthand property that sets all of the explicit grid properties (`grid-template-rows`, `grid-template-columns`, and `grid-template-areas`), and all the implicit grid properties (`grid-auto-rows`, `grid-auto-columns`, and `grid-auto-flow`), in a single declaration.
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid
    */
  var grid: js.UndefOr[GridProperty | js.Array[GridProperty]] = js.native
  /**
    * The **`grid-area`** CSS property is a shorthand property for `grid-row-start`, `grid-column-start`, `grid-row-end` and `grid-column-end`, specifying a grid item’s size and location within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the edges of its grid area.
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-area
    */
  var gridArea: js.UndefOr[GridAreaProperty | js.Array[GridAreaProperty]] = js.native
  /**
    * The **`grid-column`** CSS property is a shorthand property for `grid-column-start` and `grid-column-end` specifying a grid item's size and location within the grid column by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start and inline-end edge of its grid area.
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-column
    */
  var gridColumn: js.UndefOr[GridColumnProperty | js.Array[GridColumnProperty]] = js.native
  /**
    * The **`grid-row`** CSS property is a shorthand property for `grid-row-start` and `grid-row-end` specifying a grid item’s size and location within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start and inline-end edge of its grid area.
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-row
    */
  var gridRow: js.UndefOr[GridRowProperty | js.Array[GridRowProperty]] = js.native
  /**
    * The **`grid-template`** CSS property is a shorthand property for defining grid columns, rows, and areas.
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template
    */
  var gridTemplate: js.UndefOr[GridTemplateProperty | js.Array[GridTemplateProperty]] = js.native
  /** **Initial value**: `none` */
  var lineClamp: js.UndefOr[LineClampProperty | js.Array[LineClampProperty]] = js.native
  /**
    * The **`list-style`** CSS property is a shorthand to set list style properties `list-style-type`, `list-style-image`, and `list-style-position`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style
    */
  var listStyle: js.UndefOr[ListStyleProperty | js.Array[ListStyleProperty]] = js.native
  /**
    * The **`margin`** CSS property sets the margin area on all four sides of an element. It is a shorthand for `margin-top`, `margin-right`, `margin-bottom`, and `margin-left`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin
    */
  var margin: js.UndefOr[MarginProperty[TLength] | js.Array[MarginProperty[TLength]]] = js.native
  /**
    * The **`mask`** CSS property hides an element (partially or fully) by masking or clipping the image at specific points.
    *
    * | Chrome | Firefox | Safari  |  Edge  | IE  |
    * | :----: | :-----: | :-----: | :----: | :-: |
    * | **1**  |  **2**  | **3.2** | **12** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask
    */
  var mask: js.UndefOr[MaskProperty[TLength] | js.Array[MaskProperty[TLength]]] = js.native
  /** The **`mask-border`** CSS property lets you create a mask along the edge of an element's border. */
  var maskBorder: js.UndefOr[MaskBorderProperty | js.Array[MaskBorderProperty]] = js.native
  /**
    * The **`offset`** CSS property is a shorthand property for animating an element along a defined path.
    *
    * |    Chrome     | Firefox | Safari | Edge | IE  |
    * | :-----------: | :-----: | :----: | :--: | :-: |
    * |    **55**     |   No    |   No   |  No  | No  |
    * | 46 _(motion)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset
    */
  var motion: js.UndefOr[OffsetProperty[TLength] | js.Array[OffsetProperty[TLength]]] = js.native
  /**
    * The **`offset`** CSS property is a shorthand property for animating an element along a defined path.
    *
    * |    Chrome     | Firefox | Safari | Edge | IE  |
    * | :-----------: | :-----: | :----: | :--: | :-: |
    * |    **55**     |   No    |   No   |  No  | No  |
    * | 46 _(motion)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset
    */
  var offset: js.UndefOr[OffsetProperty[TLength] | js.Array[OffsetProperty[TLength]]] = js.native
  /**
    * The **`outline`** CSS property is a shorthand to set various outline properties in a single declaration: `outline-style`, `outline-width`, and `outline-color`.
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline
    */
  var outline: js.UndefOr[OutlineProperty[TLength] | js.Array[OutlineProperty[TLength]]] = js.native
  /**
    * The **`padding`** CSS property sets the padding area on all four sides of an element. It is a shorthand for `padding-top`, `padding-right`, `padding-bottom`, and `padding-left`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding
    */
  var padding: js.UndefOr[PaddingProperty[TLength] | js.Array[PaddingProperty[TLength]]] = js.native
  /**
    * The CSS **`place-items`** shorthand property sets the `align-items` and `justify-items` properties, respectively. If the second value is not set, the first value is also used for it.
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **59** | **45**  |  n/a   |  No  | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **59** | **45**  |  n/a   |  No  | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/place-items
    */
  var placeItems: js.UndefOr[PlaceItemsProperty | js.Array[PlaceItemsProperty]] = js.native
  /**
    * The **`place-self`** CSS property is a shorthand property sets both the `align-self` and `justify-self` properties. The first value is the `align-self` property value, the second the `justify-self` one. If the second value is not present, the first value is also used for it.
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **59** | **45**  |   No   |  No  | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **59** | **45**  |   No   |  No  | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/place-self
    */
  var placeSelf: js.UndefOr[PlaceSelfProperty | js.Array[PlaceSelfProperty]] = js.native
  /**
    * The **`text-decoration`** CSS property sets the appearance of decorative lines on text. It is a shorthand for `text-decoration-line`, `text-decoration-color`, and `text-decoration-style`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration
    */
  var textDecoration: js.UndefOr[TextDecorationProperty | js.Array[TextDecorationProperty]] = js.native
  /**
    * The **`text-emphasis`** CSS property applies emphasis marks to text (except spaces and control characters). It is a shorthand for `text-emphasis-style` and `text-emphasis-color`.
    *
    * |    Chrome    | Firefox |    Safari     | Edge | IE  |
    * | :----------: | :-----: | :-----------: | :--: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis
    */
  var textEmphasis: js.UndefOr[TextEmphasisProperty | js.Array[TextEmphasisProperty]] = js.native
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * | Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :-----: | :-----: | :-------: | :----: | :----: |
    * | **26**  | **16**  |   **9**   | **12** | **10** |
    * | 1 _-x-_ | 4 _-x-_ | 3.1 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition
    */
  var transition: js.UndefOr[TransitionProperty | js.Array[TransitionProperty]] = js.native
}

object StandardShorthandPropertiesFallback {
  @scala.inline
  def apply[TLength](): StandardShorthandPropertiesFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardShorthandPropertiesFallback[TLength]]
  }
  @scala.inline
  implicit class StandardShorthandPropertiesFallbackOps[Self[tlength] <: StandardShorthandPropertiesFallback[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withAll(value: Globals | js.Array[Globals]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: AnimationProperty | js.Array[AnimationProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: BackgroundProperty[TLength] | js.Array[BackgroundProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: BorderProperty[TLength] | js.Array[BorderProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBlock(value: BorderBlockProperty[TLength] | js.Array[BorderBlockProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBlock: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBlockEnd(value: BorderBlockEndProperty[TLength] | js.Array[BorderBlockEndProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBlockEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBlockEnd: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBlockEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBlockStart(value: BorderBlockStartProperty[TLength] | js.Array[BorderBlockStartProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBlockStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBlockStart: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBlockStart")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBottom(value: BorderBottomProperty[TLength] | js.Array[BorderBottomProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBottom: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColor(value: BorderColorProperty | js.Array[BorderColorProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderImage(value: BorderImageProperty | js.Array[BorderImageProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderImage: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderImage")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderInline(value: BorderInlineProperty[TLength] | js.Array[BorderInlineProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderInline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderInline: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderInline")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderInlineEnd(value: BorderInlineEndProperty[TLength] | js.Array[BorderInlineEndProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderInlineEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderInlineEnd: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderInlineEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderInlineStart(value: BorderInlineStartProperty[TLength] | js.Array[BorderInlineStartProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderInlineStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderInlineStart: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderInlineStart")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderLeft(value: BorderLeftProperty[TLength] | js.Array[BorderLeftProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderLeft: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRadius(value: BorderRadiusProperty[TLength] | js.Array[BorderRadiusProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRadius: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRight(value: BorderRightProperty[TLength] | js.Array[BorderRightProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRight: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRight")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderStyle(value: BorderStyleProperty | js.Array[BorderStyleProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderStyle: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderTop(value: BorderTopProperty[TLength] | js.Array[BorderTopProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderTop: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTop")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWidth(value: BorderWidthProperty[TLength] | js.Array[BorderWidthProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidth: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnRule(value: ColumnRuleProperty[TLength] | js.Array[ColumnRuleProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnRule: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnRule")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: ColumnsProperty[TLength] | js.Array[ColumnsProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withFlex(value: FlexProperty[TLength] | js.Array[FlexProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlex: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexFlow(value: FlexFlowProperty | js.Array[FlexFlowProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexFlow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexFlow: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexFlow")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: FontProperty | js.Array[FontProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withGap(value: GapProperty[TLength] | js.Array[GapProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGap: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gap")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: GridProperty | js.Array[GridProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withGridArea(value: GridAreaProperty | js.Array[GridAreaProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridArea: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridArea")(js.undefined)
        ret
    }
    @scala.inline
    def withGridColumn(value: GridColumnProperty | js.Array[GridColumnProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridColumn: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withGridRow(value: GridRowProperty | js.Array[GridRowProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridRow: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRow")(js.undefined)
        ret
    }
    @scala.inline
    def withGridTemplate(value: GridTemplateProperty | js.Array[GridTemplateProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridTemplate: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withLineClamp(value: LineClampProperty | js.Array[LineClampProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineClamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineClamp: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineClamp")(js.undefined)
        ret
    }
    @scala.inline
    def withListStyle(value: ListStyleProperty | js.Array[ListStyleProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListStyle: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: MarginProperty[TLength] | js.Array[MarginProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMask(value: MaskProperty[TLength] | js.Array[MaskProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskBorder(value: MaskBorderProperty | js.Array[MaskBorderProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskBorder: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withMotion(value: OffsetProperty[TLength] | js.Array[OffsetProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMotion: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motion")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: OffsetProperty[TLength] | js.Array[OffsetProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOutline(value: OutlineProperty[TLength] | js.Array[OutlineProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutline: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: PaddingProperty[TLength] | js.Array[PaddingProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceItems(value: PlaceItemsProperty | js.Array[PlaceItemsProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceItems: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeItems")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceSelf(value: PlaceSelfProperty | js.Array[PlaceSelfProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeSelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceSelf: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeSelf")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDecoration(value: TextDecorationProperty | js.Array[TextDecorationProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecoration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDecoration: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecoration")(js.undefined)
        ret
    }
    @scala.inline
    def withTextEmphasis(value: TextEmphasisProperty | js.Array[TextEmphasisProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEmphasis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextEmphasis: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEmphasis")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: TransitionProperty | js.Array[TransitionProperty]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
  }
  
}

