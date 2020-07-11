package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var all: js.UndefOr[Globals | js.Array[Globals]] = js.undefined
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
  var animation: js.UndefOr[AnimationProperty | js.Array[AnimationProperty]] = js.undefined
  /**
    * The **`background`** shorthand CSS property sets all background style properties at once, such as color, image, origin and size, or repeat method.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background
    */
  var background: js.UndefOr[BackgroundProperty[TLength] | js.Array[BackgroundProperty[TLength]]] = js.undefined
  /**
    * The **`border`** CSS property sets an element's border. It's a shorthand for `border-width`, `border-style`, and `border-color`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border
    */
  var border: js.UndefOr[BorderProperty[TLength] | js.Array[BorderProperty[TLength]]] = js.undefined
  /**
    * The **`border-block`** CSS property is a shorthand property for setting the individual logical block border property values in a single place in the style sheet.
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block
    */
  var borderBlock: js.UndefOr[BorderBlockProperty[TLength] | js.Array[BorderBlockProperty[TLength]]] = js.undefined
  /**
    * The **`border-block-end`** CSS property is a shorthand property for setting the individual logical block-end border property values in a single place in the style sheet.
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end
    */
  var borderBlockEnd: js.UndefOr[BorderBlockEndProperty[TLength] | js.Array[BorderBlockEndProperty[TLength]]] = js.undefined
  /**
    * The **`border-block-start`** CSS property is a shorthand property for setting the individual logical block-start border property values in a single place in the style sheet.
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start
    */
  var borderBlockStart: js.UndefOr[BorderBlockStartProperty[TLength] | js.Array[BorderBlockStartProperty[TLength]]] = js.undefined
  /**
    * The **`border-bottom`** CSS property is a shorthand that sets the values of `border-bottom-width`, `border-bottom-style` and `border-bottom-color`. These properties set an element's bottom border.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom
    */
  var borderBottom: js.UndefOr[BorderBottomProperty[TLength] | js.Array[BorderBottomProperty[TLength]]] = js.undefined
  /**
    * The **`border-color`** shorthand CSS property sets the color of all sides of an element's border.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-color
    */
  var borderColor: js.UndefOr[BorderColorProperty | js.Array[BorderColorProperty]] = js.undefined
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
  var borderImage: js.UndefOr[BorderImageProperty | js.Array[BorderImageProperty]] = js.undefined
  /**
    * The **`border-inline`** CSS property is a shorthand property for setting the individual logical inline border property values in a single place in the style sheet.
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline
    */
  var borderInline: js.UndefOr[BorderInlineProperty[TLength] | js.Array[BorderInlineProperty[TLength]]] = js.undefined
  /**
    * The **`border-inline-end`** CSS property is a shorthand property for setting the individual logical inline-end border property values in a single place in the style sheet.
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end
    */
  var borderInlineEnd: js.UndefOr[BorderInlineEndProperty[TLength] | js.Array[BorderInlineEndProperty[TLength]]] = js.undefined
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
  ] = js.undefined
  /**
    * The **`border-left`** CSS property is a shorthand that sets the values of `border-left-width`, `border-left-style` and `border-left-color`. These properties set an element's left border.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left
    */
  var borderLeft: js.UndefOr[BorderLeftProperty[TLength] | js.Array[BorderLeftProperty[TLength]]] = js.undefined
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
  var borderRadius: js.UndefOr[BorderRadiusProperty[TLength] | js.Array[BorderRadiusProperty[TLength]]] = js.undefined
  /**
    * The **`border-right`** CSS property is a shorthand that sets the values of `border-right-width`, `border-right-style` and `border-right-color`. These properties set an element's right border.
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right
    */
  var borderRight: js.UndefOr[BorderRightProperty[TLength] | js.Array[BorderRightProperty[TLength]]] = js.undefined
  /**
    * The **`border-style`** CSS property is a shorthand property that sets the line style for all four sides of an element's border.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-style
    */
  var borderStyle: js.UndefOr[BorderStyleProperty | js.Array[BorderStyleProperty]] = js.undefined
  /**
    * The **`border-top`** CSS property is a shorthand that sets the values of `border-top-width`, `border-top-style` and `border-top-color`. These properties set an element's top border.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top
    */
  var borderTop: js.UndefOr[BorderTopProperty[TLength] | js.Array[BorderTopProperty[TLength]]] = js.undefined
  /**
    * The **`border-width`** shorthand CSS property sets the widths of all four sides of an element's border.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-width
    */
  var borderWidth: js.UndefOr[BorderWidthProperty[TLength] | js.Array[BorderWidthProperty[TLength]]] = js.undefined
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
  var columnRule: js.UndefOr[ColumnRuleProperty[TLength] | js.Array[ColumnRuleProperty[TLength]]] = js.undefined
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
  var columns: js.UndefOr[ColumnsProperty[TLength] | js.Array[ColumnsProperty[TLength]]] = js.undefined
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
  var flex: js.UndefOr[FlexProperty[TLength] | js.Array[FlexProperty[TLength]]] = js.undefined
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
  var flexFlow: js.UndefOr[FlexFlowProperty | js.Array[FlexFlowProperty]] = js.undefined
  /**
    * The **`font`** CSS property is a shorthand for `font-style`, `font-variant`, `font-weight`, `font-size`, `line-height`, and `font-family`. Alternatively, it sets an element's font to a system font.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font
    */
  var font: js.UndefOr[FontProperty | js.Array[FontProperty]] = js.undefined
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
  var gap: js.UndefOr[GapProperty[TLength] | js.Array[GapProperty[TLength]]] = js.undefined
  /**
    * The **`grid`** CSS property is a shorthand property that sets all of the explicit grid properties (`grid-template-rows`, `grid-template-columns`, and `grid-template-areas`), and all the implicit grid properties (`grid-auto-rows`, `grid-auto-columns`, and `grid-auto-flow`), in a single declaration.
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid
    */
  var grid: js.UndefOr[GridProperty | js.Array[GridProperty]] = js.undefined
  /**
    * The **`grid-area`** CSS property is a shorthand property for `grid-row-start`, `grid-column-start`, `grid-row-end` and `grid-column-end`, specifying a grid item’s size and location within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the edges of its grid area.
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-area
    */
  var gridArea: js.UndefOr[GridAreaProperty | js.Array[GridAreaProperty]] = js.undefined
  /**
    * The **`grid-column`** CSS property is a shorthand property for `grid-column-start` and `grid-column-end` specifying a grid item's size and location within the grid column by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start and inline-end edge of its grid area.
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-column
    */
  var gridColumn: js.UndefOr[GridColumnProperty | js.Array[GridColumnProperty]] = js.undefined
  /**
    * The **`grid-row`** CSS property is a shorthand property for `grid-row-start` and `grid-row-end` specifying a grid item’s size and location within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start and inline-end edge of its grid area.
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-row
    */
  var gridRow: js.UndefOr[GridRowProperty | js.Array[GridRowProperty]] = js.undefined
  /**
    * The **`grid-template`** CSS property is a shorthand property for defining grid columns, rows, and areas.
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template
    */
  var gridTemplate: js.UndefOr[GridTemplateProperty | js.Array[GridTemplateProperty]] = js.undefined
  /** **Initial value**: `none` */
  var lineClamp: js.UndefOr[LineClampProperty | js.Array[LineClampProperty]] = js.undefined
  /**
    * The **`list-style`** CSS property is a shorthand to set list style properties `list-style-type`, `list-style-image`, and `list-style-position`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style
    */
  var listStyle: js.UndefOr[ListStyleProperty | js.Array[ListStyleProperty]] = js.undefined
  /**
    * The **`margin`** CSS property sets the margin area on all four sides of an element. It is a shorthand for `margin-top`, `margin-right`, `margin-bottom`, and `margin-left`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin
    */
  var margin: js.UndefOr[MarginProperty[TLength] | js.Array[MarginProperty[TLength]]] = js.undefined
  /**
    * The **`mask`** CSS property hides an element (partially or fully) by masking or clipping the image at specific points.
    *
    * | Chrome | Firefox | Safari  |  Edge  | IE  |
    * | :----: | :-----: | :-----: | :----: | :-: |
    * | **1**  |  **2**  | **3.2** | **12** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask
    */
  var mask: js.UndefOr[MaskProperty[TLength] | js.Array[MaskProperty[TLength]]] = js.undefined
  /** The **`mask-border`** CSS property lets you create a mask along the edge of an element's border. */
  var maskBorder: js.UndefOr[MaskBorderProperty | js.Array[MaskBorderProperty]] = js.undefined
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
  var motion: js.UndefOr[OffsetProperty[TLength] | js.Array[OffsetProperty[TLength]]] = js.undefined
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
  var offset: js.UndefOr[OffsetProperty[TLength] | js.Array[OffsetProperty[TLength]]] = js.undefined
  /**
    * The **`outline`** CSS property is a shorthand to set various outline properties in a single declaration: `outline-style`, `outline-width`, and `outline-color`.
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline
    */
  var outline: js.UndefOr[OutlineProperty[TLength] | js.Array[OutlineProperty[TLength]]] = js.undefined
  /**
    * The **`padding`** CSS property sets the padding area on all four sides of an element. It is a shorthand for `padding-top`, `padding-right`, `padding-bottom`, and `padding-left`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding
    */
  var padding: js.UndefOr[PaddingProperty[TLength] | js.Array[PaddingProperty[TLength]]] = js.undefined
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
  var placeItems: js.UndefOr[PlaceItemsProperty | js.Array[PlaceItemsProperty]] = js.undefined
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
  var placeSelf: js.UndefOr[PlaceSelfProperty | js.Array[PlaceSelfProperty]] = js.undefined
  /**
    * The **`text-decoration`** CSS property sets the appearance of decorative lines on text. It is a shorthand for `text-decoration-line`, `text-decoration-color`, and `text-decoration-style`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration
    */
  var textDecoration: js.UndefOr[TextDecorationProperty | js.Array[TextDecorationProperty]] = js.undefined
  /**
    * The **`text-emphasis`** CSS property applies emphasis marks to text (except spaces and control characters). It is a shorthand for `text-emphasis-style` and `text-emphasis-color`.
    *
    * |    Chrome    | Firefox |    Safari     | Edge | IE  |
    * | :----------: | :-----: | :-----------: | :--: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis
    */
  var textEmphasis: js.UndefOr[TextEmphasisProperty | js.Array[TextEmphasisProperty]] = js.undefined
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
  var transition: js.UndefOr[TransitionProperty | js.Array[TransitionProperty]] = js.undefined
}

object StandardShorthandPropertiesFallback {
  @scala.inline
  def apply[TLength](): StandardShorthandPropertiesFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardShorthandPropertiesFallback[TLength]]
  }
  @scala.inline
  implicit class StandardShorthandPropertiesFallbackOps[Self <: StandardShorthandPropertiesFallback[_], TLength] (val x: Self with StandardShorthandPropertiesFallback[TLength]) extends AnyVal {
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
    def setAllVarargs(value: Globals*): Self = this.set("all", js.Array(value :_*))
    @scala.inline
    def setAll(value: Globals | js.Array[Globals]): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    @scala.inline
    def setAnimationVarargs(value: AnimationProperty*): Self = this.set("animation", js.Array(value :_*))
    @scala.inline
    def setAnimation(value: AnimationProperty | js.Array[AnimationProperty]): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setBackgroundVarargs(value: BackgroundProperty[TLength]*): Self = this.set("background", js.Array(value :_*))
    @scala.inline
    def setBackground(value: BackgroundProperty[TLength] | js.Array[BackgroundProperty[TLength]]): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBorderVarargs(value: BorderProperty[TLength]*): Self = this.set("border", js.Array(value :_*))
    @scala.inline
    def setBorder(value: BorderProperty[TLength] | js.Array[BorderProperty[TLength]]): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setBorderBlockVarargs(value: BorderBlockProperty[TLength]*): Self = this.set("borderBlock", js.Array(value :_*))
    @scala.inline
    def setBorderBlock(value: BorderBlockProperty[TLength] | js.Array[BorderBlockProperty[TLength]]): Self = this.set("borderBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBlock: Self = this.set("borderBlock", js.undefined)
    @scala.inline
    def setBorderBlockEndVarargs(value: BorderBlockEndProperty[TLength]*): Self = this.set("borderBlockEnd", js.Array(value :_*))
    @scala.inline
    def setBorderBlockEnd(value: BorderBlockEndProperty[TLength] | js.Array[BorderBlockEndProperty[TLength]]): Self = this.set("borderBlockEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBlockEnd: Self = this.set("borderBlockEnd", js.undefined)
    @scala.inline
    def setBorderBlockStartVarargs(value: BorderBlockStartProperty[TLength]*): Self = this.set("borderBlockStart", js.Array(value :_*))
    @scala.inline
    def setBorderBlockStart(value: BorderBlockStartProperty[TLength] | js.Array[BorderBlockStartProperty[TLength]]): Self = this.set("borderBlockStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBlockStart: Self = this.set("borderBlockStart", js.undefined)
    @scala.inline
    def setBorderBottomVarargs(value: BorderBottomProperty[TLength]*): Self = this.set("borderBottom", js.Array(value :_*))
    @scala.inline
    def setBorderBottom(value: BorderBottomProperty[TLength] | js.Array[BorderBottomProperty[TLength]]): Self = this.set("borderBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottom: Self = this.set("borderBottom", js.undefined)
    @scala.inline
    def setBorderColorVarargs(value: BorderColorProperty*): Self = this.set("borderColor", js.Array(value :_*))
    @scala.inline
    def setBorderColor(value: BorderColorProperty | js.Array[BorderColorProperty]): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderImageVarargs(value: BorderImageProperty*): Self = this.set("borderImage", js.Array(value :_*))
    @scala.inline
    def setBorderImage(value: BorderImageProperty | js.Array[BorderImageProperty]): Self = this.set("borderImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderImage: Self = this.set("borderImage", js.undefined)
    @scala.inline
    def setBorderInlineVarargs(value: BorderInlineProperty[TLength]*): Self = this.set("borderInline", js.Array(value :_*))
    @scala.inline
    def setBorderInline(value: BorderInlineProperty[TLength] | js.Array[BorderInlineProperty[TLength]]): Self = this.set("borderInline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderInline: Self = this.set("borderInline", js.undefined)
    @scala.inline
    def setBorderInlineEndVarargs(value: BorderInlineEndProperty[TLength]*): Self = this.set("borderInlineEnd", js.Array(value :_*))
    @scala.inline
    def setBorderInlineEnd(value: BorderInlineEndProperty[TLength] | js.Array[BorderInlineEndProperty[TLength]]): Self = this.set("borderInlineEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderInlineEnd: Self = this.set("borderInlineEnd", js.undefined)
    @scala.inline
    def setBorderInlineStartVarargs(value: BorderInlineStartProperty[TLength]*): Self = this.set("borderInlineStart", js.Array(value :_*))
    @scala.inline
    def setBorderInlineStart(value: BorderInlineStartProperty[TLength] | js.Array[BorderInlineStartProperty[TLength]]): Self = this.set("borderInlineStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderInlineStart: Self = this.set("borderInlineStart", js.undefined)
    @scala.inline
    def setBorderLeftVarargs(value: BorderLeftProperty[TLength]*): Self = this.set("borderLeft", js.Array(value :_*))
    @scala.inline
    def setBorderLeft(value: BorderLeftProperty[TLength] | js.Array[BorderLeftProperty[TLength]]): Self = this.set("borderLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLeft: Self = this.set("borderLeft", js.undefined)
    @scala.inline
    def setBorderRadiusVarargs(value: BorderRadiusProperty[TLength]*): Self = this.set("borderRadius", js.Array(value :_*))
    @scala.inline
    def setBorderRadius(value: BorderRadiusProperty[TLength] | js.Array[BorderRadiusProperty[TLength]]): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    @scala.inline
    def setBorderRightVarargs(value: BorderRightProperty[TLength]*): Self = this.set("borderRight", js.Array(value :_*))
    @scala.inline
    def setBorderRight(value: BorderRightProperty[TLength] | js.Array[BorderRightProperty[TLength]]): Self = this.set("borderRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRight: Self = this.set("borderRight", js.undefined)
    @scala.inline
    def setBorderStyleVarargs(value: BorderStyleProperty*): Self = this.set("borderStyle", js.Array(value :_*))
    @scala.inline
    def setBorderStyle(value: BorderStyleProperty | js.Array[BorderStyleProperty]): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderStyle: Self = this.set("borderStyle", js.undefined)
    @scala.inline
    def setBorderTopVarargs(value: BorderTopProperty[TLength]*): Self = this.set("borderTop", js.Array(value :_*))
    @scala.inline
    def setBorderTop(value: BorderTopProperty[TLength] | js.Array[BorderTopProperty[TLength]]): Self = this.set("borderTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTop: Self = this.set("borderTop", js.undefined)
    @scala.inline
    def setBorderWidthVarargs(value: BorderWidthProperty[TLength]*): Self = this.set("borderWidth", js.Array(value :_*))
    @scala.inline
    def setBorderWidth(value: BorderWidthProperty[TLength] | js.Array[BorderWidthProperty[TLength]]): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setColumnRuleVarargs(value: ColumnRuleProperty[TLength]*): Self = this.set("columnRule", js.Array(value :_*))
    @scala.inline
    def setColumnRule(value: ColumnRuleProperty[TLength] | js.Array[ColumnRuleProperty[TLength]]): Self = this.set("columnRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnRule: Self = this.set("columnRule", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: ColumnsProperty[TLength]*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: ColumnsProperty[TLength] | js.Array[ColumnsProperty[TLength]]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setFlexVarargs(value: FlexProperty[TLength]*): Self = this.set("flex", js.Array(value :_*))
    @scala.inline
    def setFlex(value: FlexProperty[TLength] | js.Array[FlexProperty[TLength]]): Self = this.set("flex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlex: Self = this.set("flex", js.undefined)
    @scala.inline
    def setFlexFlowVarargs(value: FlexFlowProperty*): Self = this.set("flexFlow", js.Array(value :_*))
    @scala.inline
    def setFlexFlow(value: FlexFlowProperty | js.Array[FlexFlowProperty]): Self = this.set("flexFlow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexFlow: Self = this.set("flexFlow", js.undefined)
    @scala.inline
    def setFontVarargs(value: FontProperty*): Self = this.set("font", js.Array(value :_*))
    @scala.inline
    def setFont(value: FontProperty | js.Array[FontProperty]): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setGapVarargs(value: GapProperty[TLength]*): Self = this.set("gap", js.Array(value :_*))
    @scala.inline
    def setGap(value: GapProperty[TLength] | js.Array[GapProperty[TLength]]): Self = this.set("gap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    @scala.inline
    def setGridVarargs(value: GridProperty*): Self = this.set("grid", js.Array(value :_*))
    @scala.inline
    def setGrid(value: GridProperty | js.Array[GridProperty]): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setGridAreaVarargs(value: GridAreaProperty*): Self = this.set("gridArea", js.Array(value :_*))
    @scala.inline
    def setGridArea(value: GridAreaProperty | js.Array[GridAreaProperty]): Self = this.set("gridArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridArea: Self = this.set("gridArea", js.undefined)
    @scala.inline
    def setGridColumnVarargs(value: GridColumnProperty*): Self = this.set("gridColumn", js.Array(value :_*))
    @scala.inline
    def setGridColumn(value: GridColumnProperty | js.Array[GridColumnProperty]): Self = this.set("gridColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridColumn: Self = this.set("gridColumn", js.undefined)
    @scala.inline
    def setGridRowVarargs(value: GridRowProperty*): Self = this.set("gridRow", js.Array(value :_*))
    @scala.inline
    def setGridRow(value: GridRowProperty | js.Array[GridRowProperty]): Self = this.set("gridRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridRow: Self = this.set("gridRow", js.undefined)
    @scala.inline
    def setGridTemplateVarargs(value: GridTemplateProperty*): Self = this.set("gridTemplate", js.Array(value :_*))
    @scala.inline
    def setGridTemplate(value: GridTemplateProperty | js.Array[GridTemplateProperty]): Self = this.set("gridTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridTemplate: Self = this.set("gridTemplate", js.undefined)
    @scala.inline
    def setLineClampVarargs(value: LineClampProperty*): Self = this.set("lineClamp", js.Array(value :_*))
    @scala.inline
    def setLineClamp(value: LineClampProperty | js.Array[LineClampProperty]): Self = this.set("lineClamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineClamp: Self = this.set("lineClamp", js.undefined)
    @scala.inline
    def setListStyleVarargs(value: ListStyleProperty*): Self = this.set("listStyle", js.Array(value :_*))
    @scala.inline
    def setListStyle(value: ListStyleProperty | js.Array[ListStyleProperty]): Self = this.set("listStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListStyle: Self = this.set("listStyle", js.undefined)
    @scala.inline
    def setMarginVarargs(value: MarginProperty[TLength]*): Self = this.set("margin", js.Array(value :_*))
    @scala.inline
    def setMargin(value: MarginProperty[TLength] | js.Array[MarginProperty[TLength]]): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMaskVarargs(value: MaskProperty[TLength]*): Self = this.set("mask", js.Array(value :_*))
    @scala.inline
    def setMask(value: MaskProperty[TLength] | js.Array[MaskProperty[TLength]]): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setMaskBorderVarargs(value: MaskBorderProperty*): Self = this.set("maskBorder", js.Array(value :_*))
    @scala.inline
    def setMaskBorder(value: MaskBorderProperty | js.Array[MaskBorderProperty]): Self = this.set("maskBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskBorder: Self = this.set("maskBorder", js.undefined)
    @scala.inline
    def setMotionVarargs(value: OffsetProperty[TLength]*): Self = this.set("motion", js.Array(value :_*))
    @scala.inline
    def setMotion(value: OffsetProperty[TLength] | js.Array[OffsetProperty[TLength]]): Self = this.set("motion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMotion: Self = this.set("motion", js.undefined)
    @scala.inline
    def setOffsetVarargs(value: OffsetProperty[TLength]*): Self = this.set("offset", js.Array(value :_*))
    @scala.inline
    def setOffset(value: OffsetProperty[TLength] | js.Array[OffsetProperty[TLength]]): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOutlineVarargs(value: OutlineProperty[TLength]*): Self = this.set("outline", js.Array(value :_*))
    @scala.inline
    def setOutline(value: OutlineProperty[TLength] | js.Array[OutlineProperty[TLength]]): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    @scala.inline
    def setPaddingVarargs(value: PaddingProperty[TLength]*): Self = this.set("padding", js.Array(value :_*))
    @scala.inline
    def setPadding(value: PaddingProperty[TLength] | js.Array[PaddingProperty[TLength]]): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPlaceItemsVarargs(value: PlaceItemsProperty*): Self = this.set("placeItems", js.Array(value :_*))
    @scala.inline
    def setPlaceItems(value: PlaceItemsProperty | js.Array[PlaceItemsProperty]): Self = this.set("placeItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceItems: Self = this.set("placeItems", js.undefined)
    @scala.inline
    def setPlaceSelfVarargs(value: PlaceSelfProperty*): Self = this.set("placeSelf", js.Array(value :_*))
    @scala.inline
    def setPlaceSelf(value: PlaceSelfProperty | js.Array[PlaceSelfProperty]): Self = this.set("placeSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceSelf: Self = this.set("placeSelf", js.undefined)
    @scala.inline
    def setTextDecorationVarargs(value: TextDecorationProperty*): Self = this.set("textDecoration", js.Array(value :_*))
    @scala.inline
    def setTextDecoration(value: TextDecorationProperty | js.Array[TextDecorationProperty]): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
    @scala.inline
    def setTextEmphasisVarargs(value: TextEmphasisProperty*): Self = this.set("textEmphasis", js.Array(value :_*))
    @scala.inline
    def setTextEmphasis(value: TextEmphasisProperty | js.Array[TextEmphasisProperty]): Self = this.set("textEmphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextEmphasis: Self = this.set("textEmphasis", js.undefined)
    @scala.inline
    def setTransitionVarargs(value: TransitionProperty*): Self = this.set("transition", js.Array(value :_*))
    @scala.inline
    def setTransition(value: TransitionProperty | js.Array[TransitionProperty]): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
  
}

