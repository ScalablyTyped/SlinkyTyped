package typingsSlinky.baseui.blockMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import typingsSlinky.styletronReact.mod.StyleProp
import typingsSlinky.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockProps extends js.Object {
  @JSName("$style")
  var $style: js.UndefOr[StyleProp[BlockProps]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/align-content */
  var alignContent: js.UndefOr[Responsive[AlignContent]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/align-items */
  var alignItems: js.UndefOr[Responsive[AlignItems]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/align-self */
  var alignSelf: js.UndefOr[Responsive[AlignSelf]] = js.native
  var as: js.UndefOr[ReactElement] = js.native
  var backgroundColor: js.UndefOr[Responsive[String]] = js.native
  var bottom: js.UndefOr[Responsive[Scale]] = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
  var color: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/display */
  var display: js.UndefOr[Responsive[Display]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/flex */
  var flex: js.UndefOr[Responsive[Flex]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/flex-direction */
  var flexDirection: js.UndefOr[Responsive[FlexDirection]] = js.native
  var flexWrap: js.UndefOr[Responsive[Boolean]] = js.native
  var font: js.UndefOr[String | js.Array[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid */
  var grid: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-area */
  var gridArea: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-columns */
  var gridAutoColumns: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-flow */
  var gridAutoFlow: js.UndefOr[Responsive[GridAutoFlow]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-rows */
  var gridAutoRows: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column */
  var gridColumn: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-end */
  var gridColumnEnd: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-gap */
  var gridColumnGap: js.UndefOr[Responsive[Scale]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-start */
  var gridColumnStart: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-gap */
  var gridGap: js.UndefOr[Responsive[Scale]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row */
  var gridRow: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-end */
  var gridRowEnd: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-gap */
  var gridRowGap: js.UndefOr[Responsive[Scale]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-start */
  var gridRowStart: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template */
  var gridTemplate: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-areas */
  var gridTemplateAreas: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-columns */
  var gridTemplateColumns: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-rows */
  var gridTemplateRows: js.UndefOr[Responsive[String]] = js.native
  var height: js.UndefOr[Responsive[Scale]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/justify-content */
  var justifyContent: js.UndefOr[Responsive[JustifyContent]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/justify-items */
  var justifyItems: js.UndefOr[Responsive[JustifyItems]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/justify-self */
  var justifySelf: js.UndefOr[Responsive[JustifySelf]] = js.native
  var left: js.UndefOr[Responsive[Scale]] = js.native
  var margin: js.UndefOr[Responsive[Scale]] = js.native
  var marginBottom: js.UndefOr[Responsive[Scale]] = js.native
  var marginLeft: js.UndefOr[Responsive[Scale]] = js.native
  var marginRight: js.UndefOr[Responsive[Scale]] = js.native
  var marginTop: js.UndefOr[Responsive[Scale]] = js.native
  var maxHeight: js.UndefOr[Responsive[Scale]] = js.native
  var maxWidth: js.UndefOr[Responsive[Scale]] = js.native
  var minHeight: js.UndefOr[Responsive[Scale]] = js.native
  var minWidth: js.UndefOr[Responsive[Scale]] = js.native
  var overflow: js.UndefOr[Responsive[Overflow]] = js.native
  var overrides: js.UndefOr[BlockOverrides] = js.native
  var padding: js.UndefOr[Responsive[Scale]] = js.native
  var paddingBottom: js.UndefOr[Responsive[Scale]] = js.native
  var paddingLeft: js.UndefOr[Responsive[Scale]] = js.native
  var paddingRight: js.UndefOr[Responsive[Scale]] = js.native
  var paddingTop: js.UndefOr[Responsive[Scale]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/place-content */
  var placeContent: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/place-items */
  var placeItems: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/place-self */
  var placeSelf: js.UndefOr[Responsive[String]] = js.native
  var position: js.UndefOr[Responsive[Position]] = js.native
  var ref: js.UndefOr[Ref[_]] = js.native
  var right: js.UndefOr[Responsive[Scale]] = js.native
  var src: js.UndefOr[String] = js.native
  var top: js.UndefOr[Responsive[Scale]] = js.native
  var width: js.UndefOr[Responsive[Scale]] = js.native
}

object BlockProps {
  @scala.inline
  def apply(): BlockProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockProps]
  }
  @scala.inline
  implicit class BlockPropsOps[Self <: BlockProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$styleFunction1(value: BlockProps => StyleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$style")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with$style(value: StyleProp[BlockProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$style: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$style")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignContent(value: Responsive[AlignContent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignContent")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignItems(value: Responsive[AlignItems]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignItems")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignSelf(value: Responsive[AlignSelf]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignSelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignSelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignSelf")(js.undefined)
        ret
    }
    @scala.inline
    def withAsFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAs(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: Responsive[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBottom(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: Responsive[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay(value: Responsive[Display]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withFlex(value: Responsive[Flex]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexDirection(value: Responsive[FlexDirection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexWrap(value: Responsive[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: Responsive[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withGridArea(value: Responsive[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridArea")(js.undefined)
        ret
    }
    @scala.inline
    def withGridAutoColumns(value: Responsive[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridAutoColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withGridAutoFlow(value: Responsive[GridAutoFlow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoFlow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridAutoFlow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoFlow")(js.undefined)
        ret
    }
    @scala.inline
    def withGridAutoRows(value: Responsive[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridAutoRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoRows")(js.undefined)
        ret
    }
    @scala.inline
    def withGridColumn(value: Responsive[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withGridColumnEnd(value: Responsive[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumnEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridColumnEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumnEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withGridColumnGap(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumnGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridColumnGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumnGap")(js.undefined)
        ret
    }
    @scala.inline
    def withGridColumnStart(value: Responsive[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumnStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridColumnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumnStart")(js.undefined)
        ret
    }
    @scala.inline
    def withGridGap(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridGap")(js.undefined)
        ret
    }
    @scala.inline
    def withGridRow(value: Responsive[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRow")(js.undefined)
        ret
    }
    @scala.inline
    def withGridRowEnd(value: Responsive[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRowEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridRowEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRowEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withGridRowGap(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRowGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridRowGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRowGap")(js.undefined)
        ret
    }
    @scala.inline
    def withGridRowStart(value: Responsive[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRowStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridRowStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRowStart")(js.undefined)
        ret
    }
    @scala.inline
    def withGridTemplate(value: Responsive[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withGridTemplateAreas(value: Responsive[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateAreas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridTemplateAreas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateAreas")(js.undefined)
        ret
    }
    @scala.inline
    def withGridTemplateColumns(value: Responsive[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridTemplateColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withGridTemplateRows(value: Responsive[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridTemplateRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateRows")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withJustifyContent(value: Responsive[JustifyContent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJustifyContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyContent")(js.undefined)
        ret
    }
    @scala.inline
    def withJustifyItems(value: Responsive[JustifyItems]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJustifyItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyItems")(js.undefined)
        ret
    }
    @scala.inline
    def withJustifySelf(value: Responsive[JustifySelf]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifySelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJustifySelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifySelf")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginBottom(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginLeft(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginRight(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginTop(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflow(value: Responsive[Overflow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: BlockOverrides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingBottom(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingLeft(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingRight(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingRight")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingTop(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTop")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceContent(value: Responsive[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeContent")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceItems(value: Responsive[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeItems")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceSelf(value: Responsive[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeSelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceSelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeSelf")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Responsive[Position]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRefRefObject(value: ReactRef[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefFunction1(value: /* instance */ _ | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRef(value: Ref[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
    @scala.inline
    def withRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(null)
        ret
    }
    @scala.inline
    def withRight(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

