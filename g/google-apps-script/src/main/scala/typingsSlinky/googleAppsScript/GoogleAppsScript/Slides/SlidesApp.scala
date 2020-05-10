package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates and opens Presentations that can be edited.
  *
  *     // Open a presentation by ID.
  *     var preso = SlidesApp.openById('PRESENTATION_ID_GOES_HERE');
  *
  *     // Create and open a presentation.
  *     preso = SlidesApp.create('Presentation Name');
  */
@js.native
trait SlidesApp extends js.Object {
  var AlignmentPosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AlignmentPosition */ js.Any = js.native
  var ArrowStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrowStyle */ js.Any = js.native
  var AutoTextType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AutoTextType */ js.Any = js.native
  var CellMergeState: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CellMergeState */ js.Any = js.native
  var ColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.ColorType */ js.Any = js.native
  var ContentAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentAlignment */ js.Any = js.native
  var DashStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DashStyle */ js.Any = js.native
  var FillType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FillType */ js.Any = js.native
  var LineCategory: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineCategory */ js.Any = js.native
  var LineFillType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineFillType */ js.Any = js.native
  var LineType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineType */ js.Any = js.native
  var LinkType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkType */ js.Any = js.native
  var ListPreset: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListPreset */ js.Any = js.native
  var PageBackgroundType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundType */ js.Any = js.native
  var PageElementType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageElementType */ js.Any = js.native
  var PageType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageType */ js.Any = js.native
  var ParagraphAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphAlignment */ js.Any = js.native
  var PlaceholderType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlaceholderType */ js.Any = js.native
  var PredefinedLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PredefinedLayout */ js.Any = js.native
  var SelectionType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionType */ js.Any = js.native
  var ShapeType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShapeType */ js.Any = js.native
  var SheetsChartEmbedType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SheetsChartEmbedType */ js.Any = js.native
  var SlideLinkingMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlideLinkingMode */ js.Any = js.native
  var SlidePosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlidePosition */ js.Any = js.native
  var SpacingMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpacingMode */ js.Any = js.native
  var TextBaselineOffset: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextBaselineOffset */ js.Any = js.native
  var TextDirection: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection */ js.Any = js.native
  var ThemeColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ThemeColorType */ js.Any = js.native
  var VideoSourceType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VideoSourceType */ js.Any = js.native
  def create(name: String): Presentation = js.native
  def getActivePresentation(): Presentation = js.native
  def getUi(): Ui = js.native
  def newAffineTransformBuilder(): AffineTransformBuilder = js.native
  def openById(id: String): Presentation = js.native
  def openByUrl(url: String): Presentation = js.native
}

object SlidesApp {
  @scala.inline
  def apply(
    AlignmentPosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AlignmentPosition */ js.Any,
    ArrowStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrowStyle */ js.Any,
    AutoTextType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AutoTextType */ js.Any,
    CellMergeState: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CellMergeState */ js.Any,
    ColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.ColorType */ js.Any,
    ContentAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentAlignment */ js.Any,
    DashStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DashStyle */ js.Any,
    FillType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FillType */ js.Any,
    LineCategory: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineCategory */ js.Any,
    LineFillType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineFillType */ js.Any,
    LineType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineType */ js.Any,
    LinkType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkType */ js.Any,
    ListPreset: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListPreset */ js.Any,
    PageBackgroundType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundType */ js.Any,
    PageElementType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageElementType */ js.Any,
    PageType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageType */ js.Any,
    ParagraphAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphAlignment */ js.Any,
    PlaceholderType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlaceholderType */ js.Any,
    PredefinedLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PredefinedLayout */ js.Any,
    SelectionType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionType */ js.Any,
    ShapeType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShapeType */ js.Any,
    SheetsChartEmbedType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SheetsChartEmbedType */ js.Any,
    SlideLinkingMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlideLinkingMode */ js.Any,
    SlidePosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlidePosition */ js.Any,
    SpacingMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpacingMode */ js.Any,
    TextBaselineOffset: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextBaselineOffset */ js.Any,
    TextDirection: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection */ js.Any,
    ThemeColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ThemeColorType */ js.Any,
    VideoSourceType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VideoSourceType */ js.Any,
    create: String => Presentation,
    getActivePresentation: () => Presentation,
    getUi: () => Ui,
    newAffineTransformBuilder: () => AffineTransformBuilder,
    openById: String => Presentation,
    openByUrl: String => Presentation
  ): SlidesApp = {
    val __obj = js.Dynamic.literal(AlignmentPosition = AlignmentPosition.asInstanceOf[js.Any], ArrowStyle = ArrowStyle.asInstanceOf[js.Any], AutoTextType = AutoTextType.asInstanceOf[js.Any], CellMergeState = CellMergeState.asInstanceOf[js.Any], ColorType = ColorType.asInstanceOf[js.Any], ContentAlignment = ContentAlignment.asInstanceOf[js.Any], DashStyle = DashStyle.asInstanceOf[js.Any], FillType = FillType.asInstanceOf[js.Any], LineCategory = LineCategory.asInstanceOf[js.Any], LineFillType = LineFillType.asInstanceOf[js.Any], LineType = LineType.asInstanceOf[js.Any], LinkType = LinkType.asInstanceOf[js.Any], ListPreset = ListPreset.asInstanceOf[js.Any], PageBackgroundType = PageBackgroundType.asInstanceOf[js.Any], PageElementType = PageElementType.asInstanceOf[js.Any], PageType = PageType.asInstanceOf[js.Any], ParagraphAlignment = ParagraphAlignment.asInstanceOf[js.Any], PlaceholderType = PlaceholderType.asInstanceOf[js.Any], PredefinedLayout = PredefinedLayout.asInstanceOf[js.Any], SelectionType = SelectionType.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], SheetsChartEmbedType = SheetsChartEmbedType.asInstanceOf[js.Any], SlideLinkingMode = SlideLinkingMode.asInstanceOf[js.Any], SlidePosition = SlidePosition.asInstanceOf[js.Any], SpacingMode = SpacingMode.asInstanceOf[js.Any], TextBaselineOffset = TextBaselineOffset.asInstanceOf[js.Any], TextDirection = TextDirection.asInstanceOf[js.Any], ThemeColorType = ThemeColorType.asInstanceOf[js.Any], VideoSourceType = VideoSourceType.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), getActivePresentation = js.Any.fromFunction0(getActivePresentation), getUi = js.Any.fromFunction0(getUi), newAffineTransformBuilder = js.Any.fromFunction0(newAffineTransformBuilder), openById = js.Any.fromFunction1(openById), openByUrl = js.Any.fromFunction1(openByUrl))
    __obj.asInstanceOf[SlidesApp]
  }
  @scala.inline
  implicit class SlidesAppOps[Self <: SlidesApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignmentPosition(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AlignmentPosition */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlignmentPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrowStyle(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrowStyle */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrowStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoTextType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AutoTextType */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoTextType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellMergeState(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CellMergeState */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CellMergeState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.ColorType */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentAlignment(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentAlignment */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDashStyle(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DashStyle */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FillType */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineCategory(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineCategory */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineFillType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineFillType */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineFillType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineType */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkType */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPreset(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListPreset */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListPreset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageBackgroundType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundType */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageBackgroundType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageElementType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageElementType */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageElementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageType */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParagraphAlignment(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphAlignment */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParagraphAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholderType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlaceholderType */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlaceholderType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPredefinedLayout(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PredefinedLayout */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredefinedLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionType */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShapeType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShapeType */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShapeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSheetsChartEmbedType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SheetsChartEmbedType */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SheetsChartEmbedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideLinkingMode(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlideLinkingMode */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlideLinkingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlidePosition(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlidePosition */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlidePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpacingMode(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpacingMode */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpacingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextBaselineOffset(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextBaselineOffset */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextBaselineOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextDirection(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThemeColorType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ThemeColorType */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThemeColorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoSourceType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VideoSourceType */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoSourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate(value: String => Presentation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetActivePresentation(value: () => Presentation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActivePresentation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUi(value: () => Ui): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUi")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAffineTransformBuilder(value: () => AffineTransformBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAffineTransformBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpenById(value: String => Presentation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openById")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpenByUrl(value: String => Presentation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openByUrl")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

