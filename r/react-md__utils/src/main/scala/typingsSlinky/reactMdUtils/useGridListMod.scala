package typingsSlinky.reactMdUtils

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.csstype.mod.AlignContentProperty
import typingsSlinky.csstype.mod.AlignItemsProperty
import typingsSlinky.csstype.mod.AlignSelfProperty
import typingsSlinky.csstype.mod.AlignTracksProperty
import typingsSlinky.csstype.mod.AlignmentBaselineProperty
import typingsSlinky.csstype.mod.AnimationDirectionProperty
import typingsSlinky.csstype.mod.AnimationFillModeProperty
import typingsSlinky.csstype.mod.AnimationIterationCountProperty
import typingsSlinky.csstype.mod.AnimationNameProperty
import typingsSlinky.csstype.mod.AnimationPlayStateProperty
import typingsSlinky.csstype.mod.AnimationProperty
import typingsSlinky.csstype.mod.AnimationTimingFunctionProperty
import typingsSlinky.csstype.mod.AppearanceProperty
import typingsSlinky.csstype.mod.AspectRatioProperty
import typingsSlinky.csstype.mod.AzimuthProperty
import typingsSlinky.csstype.mod.BackdropFilterProperty
import typingsSlinky.csstype.mod.BackfaceVisibilityProperty
import typingsSlinky.csstype.mod.BackgroundAttachmentProperty
import typingsSlinky.csstype.mod.BackgroundBlendModeProperty
import typingsSlinky.csstype.mod.BackgroundClipProperty
import typingsSlinky.csstype.mod.BackgroundColorProperty
import typingsSlinky.csstype.mod.BackgroundImageProperty
import typingsSlinky.csstype.mod.BackgroundOriginProperty
import typingsSlinky.csstype.mod.BackgroundPositionProperty
import typingsSlinky.csstype.mod.BackgroundPositionXProperty
import typingsSlinky.csstype.mod.BackgroundPositionYProperty
import typingsSlinky.csstype.mod.BackgroundProperty
import typingsSlinky.csstype.mod.BackgroundRepeatProperty
import typingsSlinky.csstype.mod.BackgroundSizeProperty
import typingsSlinky.csstype.mod.BaselineShiftProperty
import typingsSlinky.csstype.mod.BlockOverflowProperty
import typingsSlinky.csstype.mod.BlockSizeProperty
import typingsSlinky.csstype.mod.BorderBlockColorProperty
import typingsSlinky.csstype.mod.BorderBlockEndColorProperty
import typingsSlinky.csstype.mod.BorderBlockEndProperty
import typingsSlinky.csstype.mod.BorderBlockEndStyleProperty
import typingsSlinky.csstype.mod.BorderBlockEndWidthProperty
import typingsSlinky.csstype.mod.BorderBlockProperty
import typingsSlinky.csstype.mod.BorderBlockStartColorProperty
import typingsSlinky.csstype.mod.BorderBlockStartProperty
import typingsSlinky.csstype.mod.BorderBlockStartStyleProperty
import typingsSlinky.csstype.mod.BorderBlockStartWidthProperty
import typingsSlinky.csstype.mod.BorderBlockStyleProperty
import typingsSlinky.csstype.mod.BorderBlockWidthProperty
import typingsSlinky.csstype.mod.BorderBottomColorProperty
import typingsSlinky.csstype.mod.BorderBottomLeftRadiusProperty
import typingsSlinky.csstype.mod.BorderBottomProperty
import typingsSlinky.csstype.mod.BorderBottomRightRadiusProperty
import typingsSlinky.csstype.mod.BorderBottomStyleProperty
import typingsSlinky.csstype.mod.BorderBottomWidthProperty
import typingsSlinky.csstype.mod.BorderCollapseProperty
import typingsSlinky.csstype.mod.BorderColorProperty
import typingsSlinky.csstype.mod.BorderEndEndRadiusProperty
import typingsSlinky.csstype.mod.BorderEndStartRadiusProperty
import typingsSlinky.csstype.mod.BorderImageOutsetProperty
import typingsSlinky.csstype.mod.BorderImageProperty
import typingsSlinky.csstype.mod.BorderImageRepeatProperty
import typingsSlinky.csstype.mod.BorderImageSliceProperty
import typingsSlinky.csstype.mod.BorderImageSourceProperty
import typingsSlinky.csstype.mod.BorderImageWidthProperty
import typingsSlinky.csstype.mod.BorderInlineColorProperty
import typingsSlinky.csstype.mod.BorderInlineEndColorProperty
import typingsSlinky.csstype.mod.BorderInlineEndProperty
import typingsSlinky.csstype.mod.BorderInlineEndStyleProperty
import typingsSlinky.csstype.mod.BorderInlineEndWidthProperty
import typingsSlinky.csstype.mod.BorderInlineProperty
import typingsSlinky.csstype.mod.BorderInlineStartColorProperty
import typingsSlinky.csstype.mod.BorderInlineStartProperty
import typingsSlinky.csstype.mod.BorderInlineStartStyleProperty
import typingsSlinky.csstype.mod.BorderInlineStartWidthProperty
import typingsSlinky.csstype.mod.BorderInlineStyleProperty
import typingsSlinky.csstype.mod.BorderInlineWidthProperty
import typingsSlinky.csstype.mod.BorderLeftColorProperty
import typingsSlinky.csstype.mod.BorderLeftProperty
import typingsSlinky.csstype.mod.BorderLeftStyleProperty
import typingsSlinky.csstype.mod.BorderLeftWidthProperty
import typingsSlinky.csstype.mod.BorderProperty
import typingsSlinky.csstype.mod.BorderRadiusProperty
import typingsSlinky.csstype.mod.BorderRightColorProperty
import typingsSlinky.csstype.mod.BorderRightProperty
import typingsSlinky.csstype.mod.BorderRightStyleProperty
import typingsSlinky.csstype.mod.BorderRightWidthProperty
import typingsSlinky.csstype.mod.BorderSpacingProperty
import typingsSlinky.csstype.mod.BorderStartEndRadiusProperty
import typingsSlinky.csstype.mod.BorderStartStartRadiusProperty
import typingsSlinky.csstype.mod.BorderStyleProperty
import typingsSlinky.csstype.mod.BorderTopColorProperty
import typingsSlinky.csstype.mod.BorderTopLeftRadiusProperty
import typingsSlinky.csstype.mod.BorderTopProperty
import typingsSlinky.csstype.mod.BorderTopRightRadiusProperty
import typingsSlinky.csstype.mod.BorderTopStyleProperty
import typingsSlinky.csstype.mod.BorderTopWidthProperty
import typingsSlinky.csstype.mod.BorderWidthProperty
import typingsSlinky.csstype.mod.BottomProperty
import typingsSlinky.csstype.mod.BoxAlignProperty
import typingsSlinky.csstype.mod.BoxDecorationBreakProperty
import typingsSlinky.csstype.mod.BoxDirectionProperty
import typingsSlinky.csstype.mod.BoxLinesProperty
import typingsSlinky.csstype.mod.BoxOrientProperty
import typingsSlinky.csstype.mod.BoxPackProperty
import typingsSlinky.csstype.mod.BoxShadowProperty
import typingsSlinky.csstype.mod.BoxSizingProperty
import typingsSlinky.csstype.mod.BreakAfterProperty
import typingsSlinky.csstype.mod.BreakBeforeProperty
import typingsSlinky.csstype.mod.BreakInsideProperty
import typingsSlinky.csstype.mod.CaptionSideProperty
import typingsSlinky.csstype.mod.CaretColorProperty
import typingsSlinky.csstype.mod.ClearProperty
import typingsSlinky.csstype.mod.ClipPathProperty
import typingsSlinky.csstype.mod.ClipProperty
import typingsSlinky.csstype.mod.ClipRuleProperty
import typingsSlinky.csstype.mod.ColorAdjustProperty
import typingsSlinky.csstype.mod.ColorInterpolationProperty
import typingsSlinky.csstype.mod.ColorProperty
import typingsSlinky.csstype.mod.ColorRenderingProperty
import typingsSlinky.csstype.mod.ColumnCountProperty
import typingsSlinky.csstype.mod.ColumnFillProperty
import typingsSlinky.csstype.mod.ColumnGapProperty
import typingsSlinky.csstype.mod.ColumnRuleColorProperty
import typingsSlinky.csstype.mod.ColumnRuleProperty
import typingsSlinky.csstype.mod.ColumnRuleStyleProperty
import typingsSlinky.csstype.mod.ColumnRuleWidthProperty
import typingsSlinky.csstype.mod.ColumnSpanProperty
import typingsSlinky.csstype.mod.ColumnWidthProperty
import typingsSlinky.csstype.mod.ColumnsProperty
import typingsSlinky.csstype.mod.ContainProperty
import typingsSlinky.csstype.mod.ContentProperty
import typingsSlinky.csstype.mod.CounterIncrementProperty
import typingsSlinky.csstype.mod.CounterResetProperty
import typingsSlinky.csstype.mod.CounterSetProperty
import typingsSlinky.csstype.mod.CursorProperty
import typingsSlinky.csstype.mod.DirectionProperty
import typingsSlinky.csstype.mod.DisplayProperty
import typingsSlinky.csstype.mod.DominantBaselineProperty
import typingsSlinky.csstype.mod.EmptyCellsProperty
import typingsSlinky.csstype.mod.FillProperty
import typingsSlinky.csstype.mod.FillRuleProperty
import typingsSlinky.csstype.mod.FilterProperty
import typingsSlinky.csstype.mod.FlexBasisProperty
import typingsSlinky.csstype.mod.FlexDirectionProperty
import typingsSlinky.csstype.mod.FlexFlowProperty
import typingsSlinky.csstype.mod.FlexProperty
import typingsSlinky.csstype.mod.FlexWrapProperty
import typingsSlinky.csstype.mod.FloatProperty
import typingsSlinky.csstype.mod.FloodColorProperty
import typingsSlinky.csstype.mod.FontFamilyProperty
import typingsSlinky.csstype.mod.FontFeatureSettingsProperty
import typingsSlinky.csstype.mod.FontKerningProperty
import typingsSlinky.csstype.mod.FontLanguageOverrideProperty
import typingsSlinky.csstype.mod.FontOpticalSizingProperty
import typingsSlinky.csstype.mod.FontProperty
import typingsSlinky.csstype.mod.FontSizeAdjustProperty
import typingsSlinky.csstype.mod.FontSizeProperty
import typingsSlinky.csstype.mod.FontSmoothProperty
import typingsSlinky.csstype.mod.FontStretchProperty
import typingsSlinky.csstype.mod.FontStyleProperty
import typingsSlinky.csstype.mod.FontSynthesisProperty
import typingsSlinky.csstype.mod.FontVariantAlternatesProperty
import typingsSlinky.csstype.mod.FontVariantCapsProperty
import typingsSlinky.csstype.mod.FontVariantEastAsianProperty
import typingsSlinky.csstype.mod.FontVariantLigaturesProperty
import typingsSlinky.csstype.mod.FontVariantNumericProperty
import typingsSlinky.csstype.mod.FontVariantPositionProperty
import typingsSlinky.csstype.mod.FontVariantProperty
import typingsSlinky.csstype.mod.FontVariationSettingsProperty
import typingsSlinky.csstype.mod.FontWeightProperty
import typingsSlinky.csstype.mod.GapProperty
import typingsSlinky.csstype.mod.Globals
import typingsSlinky.csstype.mod.GlobalsNumber
import typingsSlinky.csstype.mod.GlobalsString
import typingsSlinky.csstype.mod.GlyphOrientationVerticalProperty
import typingsSlinky.csstype.mod.GridAreaProperty
import typingsSlinky.csstype.mod.GridAutoColumnsProperty
import typingsSlinky.csstype.mod.GridAutoFlowProperty
import typingsSlinky.csstype.mod.GridAutoRowsProperty
import typingsSlinky.csstype.mod.GridColumnEndProperty
import typingsSlinky.csstype.mod.GridColumnGapProperty
import typingsSlinky.csstype.mod.GridColumnProperty
import typingsSlinky.csstype.mod.GridColumnStartProperty
import typingsSlinky.csstype.mod.GridGapProperty
import typingsSlinky.csstype.mod.GridProperty
import typingsSlinky.csstype.mod.GridRowEndProperty
import typingsSlinky.csstype.mod.GridRowGapProperty
import typingsSlinky.csstype.mod.GridRowProperty
import typingsSlinky.csstype.mod.GridRowStartProperty
import typingsSlinky.csstype.mod.GridTemplateAreasProperty
import typingsSlinky.csstype.mod.GridTemplateColumnsProperty
import typingsSlinky.csstype.mod.GridTemplateProperty
import typingsSlinky.csstype.mod.GridTemplateRowsProperty
import typingsSlinky.csstype.mod.HangingPunctuationProperty
import typingsSlinky.csstype.mod.HeightProperty
import typingsSlinky.csstype.mod.HyphensProperty
import typingsSlinky.csstype.mod.ImageOrientationProperty
import typingsSlinky.csstype.mod.ImageRenderingProperty
import typingsSlinky.csstype.mod.ImageResolutionProperty
import typingsSlinky.csstype.mod.ImeModeProperty
import typingsSlinky.csstype.mod.InitialLetterProperty
import typingsSlinky.csstype.mod.InlineSizeProperty
import typingsSlinky.csstype.mod.InsetBlockEndProperty
import typingsSlinky.csstype.mod.InsetBlockProperty
import typingsSlinky.csstype.mod.InsetBlockStartProperty
import typingsSlinky.csstype.mod.InsetInlineEndProperty
import typingsSlinky.csstype.mod.InsetInlineProperty
import typingsSlinky.csstype.mod.InsetInlineStartProperty
import typingsSlinky.csstype.mod.InsetProperty
import typingsSlinky.csstype.mod.IsolationProperty
import typingsSlinky.csstype.mod.JustifyContentProperty
import typingsSlinky.csstype.mod.JustifyItemsProperty
import typingsSlinky.csstype.mod.JustifySelfProperty
import typingsSlinky.csstype.mod.JustifyTracksProperty
import typingsSlinky.csstype.mod.LeftProperty
import typingsSlinky.csstype.mod.LetterSpacingProperty
import typingsSlinky.csstype.mod.LightingColorProperty
import typingsSlinky.csstype.mod.LineBreakProperty
import typingsSlinky.csstype.mod.LineClampProperty
import typingsSlinky.csstype.mod.LineHeightProperty
import typingsSlinky.csstype.mod.LineHeightStepProperty
import typingsSlinky.csstype.mod.ListStyleImageProperty
import typingsSlinky.csstype.mod.ListStylePositionProperty
import typingsSlinky.csstype.mod.ListStyleProperty
import typingsSlinky.csstype.mod.ListStyleTypeProperty
import typingsSlinky.csstype.mod.MarginBlockEndProperty
import typingsSlinky.csstype.mod.MarginBlockProperty
import typingsSlinky.csstype.mod.MarginBlockStartProperty
import typingsSlinky.csstype.mod.MarginBottomProperty
import typingsSlinky.csstype.mod.MarginInlineEndProperty
import typingsSlinky.csstype.mod.MarginInlineProperty
import typingsSlinky.csstype.mod.MarginInlineStartProperty
import typingsSlinky.csstype.mod.MarginLeftProperty
import typingsSlinky.csstype.mod.MarginProperty
import typingsSlinky.csstype.mod.MarginRightProperty
import typingsSlinky.csstype.mod.MarginTopProperty
import typingsSlinky.csstype.mod.MarkerEndProperty
import typingsSlinky.csstype.mod.MarkerMidProperty
import typingsSlinky.csstype.mod.MarkerProperty
import typingsSlinky.csstype.mod.MarkerStartProperty
import typingsSlinky.csstype.mod.MaskBorderModeProperty
import typingsSlinky.csstype.mod.MaskBorderOutsetProperty
import typingsSlinky.csstype.mod.MaskBorderProperty
import typingsSlinky.csstype.mod.MaskBorderRepeatProperty
import typingsSlinky.csstype.mod.MaskBorderSliceProperty
import typingsSlinky.csstype.mod.MaskBorderSourceProperty
import typingsSlinky.csstype.mod.MaskBorderWidthProperty
import typingsSlinky.csstype.mod.MaskClipProperty
import typingsSlinky.csstype.mod.MaskCompositeProperty
import typingsSlinky.csstype.mod.MaskImageProperty
import typingsSlinky.csstype.mod.MaskModeProperty
import typingsSlinky.csstype.mod.MaskOriginProperty
import typingsSlinky.csstype.mod.MaskPositionProperty
import typingsSlinky.csstype.mod.MaskProperty
import typingsSlinky.csstype.mod.MaskRepeatProperty
import typingsSlinky.csstype.mod.MaskSizeProperty
import typingsSlinky.csstype.mod.MaskTypeProperty
import typingsSlinky.csstype.mod.MasonryAutoFlowProperty
import typingsSlinky.csstype.mod.MathStyleProperty
import typingsSlinky.csstype.mod.MaxBlockSizeProperty
import typingsSlinky.csstype.mod.MaxHeightProperty
import typingsSlinky.csstype.mod.MaxInlineSizeProperty
import typingsSlinky.csstype.mod.MaxLinesProperty
import typingsSlinky.csstype.mod.MaxWidthProperty
import typingsSlinky.csstype.mod.MinBlockSizeProperty
import typingsSlinky.csstype.mod.MinHeightProperty
import typingsSlinky.csstype.mod.MinInlineSizeProperty
import typingsSlinky.csstype.mod.MinWidthProperty
import typingsSlinky.csstype.mod.MixBlendModeProperty
import typingsSlinky.csstype.mod.MozAppearanceProperty
import typingsSlinky.csstype.mod.MozBindingProperty
import typingsSlinky.csstype.mod.MozBorderBottomColorsProperty
import typingsSlinky.csstype.mod.MozBorderLeftColorsProperty
import typingsSlinky.csstype.mod.MozBorderRightColorsProperty
import typingsSlinky.csstype.mod.MozBorderTopColorsProperty
import typingsSlinky.csstype.mod.MozContextPropertiesProperty
import typingsSlinky.csstype.mod.MozFloatEdgeProperty
import typingsSlinky.csstype.mod.MozImageRegionProperty
import typingsSlinky.csstype.mod.MozOrientProperty
import typingsSlinky.csstype.mod.MozOutlineRadiusBottomleftProperty
import typingsSlinky.csstype.mod.MozOutlineRadiusBottomrightProperty
import typingsSlinky.csstype.mod.MozOutlineRadiusProperty
import typingsSlinky.csstype.mod.MozOutlineRadiusTopleftProperty
import typingsSlinky.csstype.mod.MozOutlineRadiusToprightProperty
import typingsSlinky.csstype.mod.MozStackSizingProperty
import typingsSlinky.csstype.mod.MozTextBlinkProperty
import typingsSlinky.csstype.mod.MozUserFocusProperty
import typingsSlinky.csstype.mod.MozUserInputProperty
import typingsSlinky.csstype.mod.MozUserModifyProperty
import typingsSlinky.csstype.mod.MozWindowDraggingProperty
import typingsSlinky.csstype.mod.MozWindowShadowProperty
import typingsSlinky.csstype.mod.MsAcceleratorProperty
import typingsSlinky.csstype.mod.MsBlockProgressionProperty
import typingsSlinky.csstype.mod.MsContentZoomChainingProperty
import typingsSlinky.csstype.mod.MsContentZoomSnapProperty
import typingsSlinky.csstype.mod.MsContentZoomSnapTypeProperty
import typingsSlinky.csstype.mod.MsContentZoomingProperty
import typingsSlinky.csstype.mod.MsFlowFromProperty
import typingsSlinky.csstype.mod.MsFlowIntoProperty
import typingsSlinky.csstype.mod.MsGridColumnsProperty
import typingsSlinky.csstype.mod.MsGridRowsProperty
import typingsSlinky.csstype.mod.MsHighContrastAdjustProperty
import typingsSlinky.csstype.mod.MsHyphenateLimitCharsProperty
import typingsSlinky.csstype.mod.MsHyphenateLimitLinesProperty
import typingsSlinky.csstype.mod.MsHyphenateLimitZoneProperty
import typingsSlinky.csstype.mod.MsImeAlignProperty
import typingsSlinky.csstype.mod.MsOverflowStyleProperty
import typingsSlinky.csstype.mod.MsScrollChainingProperty
import typingsSlinky.csstype.mod.MsScrollLimitXMaxProperty
import typingsSlinky.csstype.mod.MsScrollLimitXMinProperty
import typingsSlinky.csstype.mod.MsScrollLimitYMaxProperty
import typingsSlinky.csstype.mod.MsScrollLimitYMinProperty
import typingsSlinky.csstype.mod.MsScrollRailsProperty
import typingsSlinky.csstype.mod.MsScrollSnapTypeProperty
import typingsSlinky.csstype.mod.MsScrollTranslationProperty
import typingsSlinky.csstype.mod.MsScrollbar3dlightColorProperty
import typingsSlinky.csstype.mod.MsScrollbarArrowColorProperty
import typingsSlinky.csstype.mod.MsScrollbarBaseColorProperty
import typingsSlinky.csstype.mod.MsScrollbarDarkshadowColorProperty
import typingsSlinky.csstype.mod.MsScrollbarFaceColorProperty
import typingsSlinky.csstype.mod.MsScrollbarHighlightColorProperty
import typingsSlinky.csstype.mod.MsScrollbarShadowColorProperty
import typingsSlinky.csstype.mod.MsScrollbarTrackColorProperty
import typingsSlinky.csstype.mod.MsTextAutospaceProperty
import typingsSlinky.csstype.mod.MsTouchSelectProperty
import typingsSlinky.csstype.mod.MsUserSelectProperty
import typingsSlinky.csstype.mod.MsWrapFlowProperty
import typingsSlinky.csstype.mod.MsWrapMarginProperty
import typingsSlinky.csstype.mod.MsWrapThroughProperty
import typingsSlinky.csstype.mod.ObjectFitProperty
import typingsSlinky.csstype.mod.ObjectPositionProperty
import typingsSlinky.csstype.mod.OffsetAnchorProperty
import typingsSlinky.csstype.mod.OffsetDistanceProperty
import typingsSlinky.csstype.mod.OffsetPathProperty
import typingsSlinky.csstype.mod.OffsetProperty
import typingsSlinky.csstype.mod.OffsetRotateProperty
import typingsSlinky.csstype.mod.OpacityProperty
import typingsSlinky.csstype.mod.OutlineColorProperty
import typingsSlinky.csstype.mod.OutlineOffsetProperty
import typingsSlinky.csstype.mod.OutlineProperty
import typingsSlinky.csstype.mod.OutlineStyleProperty
import typingsSlinky.csstype.mod.OutlineWidthProperty
import typingsSlinky.csstype.mod.OverflowAnchorProperty
import typingsSlinky.csstype.mod.OverflowBlockProperty
import typingsSlinky.csstype.mod.OverflowClipBoxProperty
import typingsSlinky.csstype.mod.OverflowInlineProperty
import typingsSlinky.csstype.mod.OverflowProperty
import typingsSlinky.csstype.mod.OverflowWrapProperty
import typingsSlinky.csstype.mod.OverflowXProperty
import typingsSlinky.csstype.mod.OverflowYProperty
import typingsSlinky.csstype.mod.OverscrollBehaviorBlockProperty
import typingsSlinky.csstype.mod.OverscrollBehaviorInlineProperty
import typingsSlinky.csstype.mod.OverscrollBehaviorProperty
import typingsSlinky.csstype.mod.OverscrollBehaviorXProperty
import typingsSlinky.csstype.mod.OverscrollBehaviorYProperty
import typingsSlinky.csstype.mod.PaddingBlockEndProperty
import typingsSlinky.csstype.mod.PaddingBlockProperty
import typingsSlinky.csstype.mod.PaddingBlockStartProperty
import typingsSlinky.csstype.mod.PaddingBottomProperty
import typingsSlinky.csstype.mod.PaddingInlineEndProperty
import typingsSlinky.csstype.mod.PaddingInlineProperty
import typingsSlinky.csstype.mod.PaddingInlineStartProperty
import typingsSlinky.csstype.mod.PaddingLeftProperty
import typingsSlinky.csstype.mod.PaddingProperty
import typingsSlinky.csstype.mod.PaddingRightProperty
import typingsSlinky.csstype.mod.PaddingTopProperty
import typingsSlinky.csstype.mod.PageBreakAfterProperty
import typingsSlinky.csstype.mod.PageBreakBeforeProperty
import typingsSlinky.csstype.mod.PageBreakInsideProperty
import typingsSlinky.csstype.mod.PaintOrderProperty
import typingsSlinky.csstype.mod.PerspectiveOriginProperty
import typingsSlinky.csstype.mod.PerspectiveProperty
import typingsSlinky.csstype.mod.PlaceContentProperty
import typingsSlinky.csstype.mod.PlaceItemsProperty
import typingsSlinky.csstype.mod.PlaceSelfProperty
import typingsSlinky.csstype.mod.PointerEventsProperty
import typingsSlinky.csstype.mod.PositionProperty
import typingsSlinky.csstype.mod.QuotesProperty
import typingsSlinky.csstype.mod.ResizeProperty
import typingsSlinky.csstype.mod.RightProperty
import typingsSlinky.csstype.mod.RotateProperty
import typingsSlinky.csstype.mod.RowGapProperty
import typingsSlinky.csstype.mod.RubyAlignProperty
import typingsSlinky.csstype.mod.RubyMergeProperty
import typingsSlinky.csstype.mod.RubyPositionProperty
import typingsSlinky.csstype.mod.ScaleProperty
import typingsSlinky.csstype.mod.ScrollBehaviorProperty
import typingsSlinky.csstype.mod.ScrollMarginBlockEndProperty
import typingsSlinky.csstype.mod.ScrollMarginBlockProperty
import typingsSlinky.csstype.mod.ScrollMarginBlockStartProperty
import typingsSlinky.csstype.mod.ScrollMarginBottomProperty
import typingsSlinky.csstype.mod.ScrollMarginInlineEndProperty
import typingsSlinky.csstype.mod.ScrollMarginInlineProperty
import typingsSlinky.csstype.mod.ScrollMarginInlineStartProperty
import typingsSlinky.csstype.mod.ScrollMarginLeftProperty
import typingsSlinky.csstype.mod.ScrollMarginProperty
import typingsSlinky.csstype.mod.ScrollMarginRightProperty
import typingsSlinky.csstype.mod.ScrollMarginTopProperty
import typingsSlinky.csstype.mod.ScrollPaddingBlockEndProperty
import typingsSlinky.csstype.mod.ScrollPaddingBlockProperty
import typingsSlinky.csstype.mod.ScrollPaddingBlockStartProperty
import typingsSlinky.csstype.mod.ScrollPaddingBottomProperty
import typingsSlinky.csstype.mod.ScrollPaddingInlineEndProperty
import typingsSlinky.csstype.mod.ScrollPaddingInlineProperty
import typingsSlinky.csstype.mod.ScrollPaddingInlineStartProperty
import typingsSlinky.csstype.mod.ScrollPaddingLeftProperty
import typingsSlinky.csstype.mod.ScrollPaddingProperty
import typingsSlinky.csstype.mod.ScrollPaddingRightProperty
import typingsSlinky.csstype.mod.ScrollPaddingTopProperty
import typingsSlinky.csstype.mod.ScrollSnapAlignProperty
import typingsSlinky.csstype.mod.ScrollSnapCoordinateProperty
import typingsSlinky.csstype.mod.ScrollSnapDestinationProperty
import typingsSlinky.csstype.mod.ScrollSnapPointsXProperty
import typingsSlinky.csstype.mod.ScrollSnapPointsYProperty
import typingsSlinky.csstype.mod.ScrollSnapStopProperty
import typingsSlinky.csstype.mod.ScrollSnapTypeProperty
import typingsSlinky.csstype.mod.ScrollSnapTypeXProperty
import typingsSlinky.csstype.mod.ScrollSnapTypeYProperty
import typingsSlinky.csstype.mod.ScrollbarColorProperty
import typingsSlinky.csstype.mod.ScrollbarGutterProperty
import typingsSlinky.csstype.mod.ScrollbarWidthProperty
import typingsSlinky.csstype.mod.ShapeImageThresholdProperty
import typingsSlinky.csstype.mod.ShapeMarginProperty
import typingsSlinky.csstype.mod.ShapeOutsideProperty
import typingsSlinky.csstype.mod.ShapeRenderingProperty
import typingsSlinky.csstype.mod.StopColorProperty
import typingsSlinky.csstype.mod.StrokeDasharrayProperty
import typingsSlinky.csstype.mod.StrokeDashoffsetProperty
import typingsSlinky.csstype.mod.StrokeLinecapProperty
import typingsSlinky.csstype.mod.StrokeLinejoinProperty
import typingsSlinky.csstype.mod.StrokeProperty
import typingsSlinky.csstype.mod.StrokeWidthProperty
import typingsSlinky.csstype.mod.TabSizeProperty
import typingsSlinky.csstype.mod.TableLayoutProperty
import typingsSlinky.csstype.mod.TextAlignLastProperty
import typingsSlinky.csstype.mod.TextAlignProperty
import typingsSlinky.csstype.mod.TextAnchorProperty
import typingsSlinky.csstype.mod.TextCombineUprightProperty
import typingsSlinky.csstype.mod.TextDecorationColorProperty
import typingsSlinky.csstype.mod.TextDecorationLineProperty
import typingsSlinky.csstype.mod.TextDecorationProperty
import typingsSlinky.csstype.mod.TextDecorationSkipInkProperty
import typingsSlinky.csstype.mod.TextDecorationSkipProperty
import typingsSlinky.csstype.mod.TextDecorationStyleProperty
import typingsSlinky.csstype.mod.TextDecorationThicknessProperty
import typingsSlinky.csstype.mod.TextEmphasisColorProperty
import typingsSlinky.csstype.mod.TextEmphasisProperty
import typingsSlinky.csstype.mod.TextEmphasisStyleProperty
import typingsSlinky.csstype.mod.TextIndentProperty
import typingsSlinky.csstype.mod.TextJustifyProperty
import typingsSlinky.csstype.mod.TextOrientationProperty
import typingsSlinky.csstype.mod.TextOverflowProperty
import typingsSlinky.csstype.mod.TextRenderingProperty
import typingsSlinky.csstype.mod.TextShadowProperty
import typingsSlinky.csstype.mod.TextSizeAdjustProperty
import typingsSlinky.csstype.mod.TextTransformProperty
import typingsSlinky.csstype.mod.TextUnderlineOffsetProperty
import typingsSlinky.csstype.mod.TextUnderlinePositionProperty
import typingsSlinky.csstype.mod.TopProperty
import typingsSlinky.csstype.mod.TouchActionProperty
import typingsSlinky.csstype.mod.TransformBoxProperty
import typingsSlinky.csstype.mod.TransformOriginProperty
import typingsSlinky.csstype.mod.TransformProperty
import typingsSlinky.csstype.mod.TransformStyleProperty
import typingsSlinky.csstype.mod.TransitionProperty
import typingsSlinky.csstype.mod.TransitionPropertyProperty
import typingsSlinky.csstype.mod.TransitionTimingFunctionProperty
import typingsSlinky.csstype.mod.TranslateProperty
import typingsSlinky.csstype.mod.UnicodeBidiProperty
import typingsSlinky.csstype.mod.UserSelectProperty
import typingsSlinky.csstype.mod.VectorEffectProperty
import typingsSlinky.csstype.mod.VerticalAlignProperty
import typingsSlinky.csstype.mod.VisibilityProperty
import typingsSlinky.csstype.mod.WebkitAppearanceProperty
import typingsSlinky.csstype.mod.WebkitBorderBeforeColorProperty
import typingsSlinky.csstype.mod.WebkitBorderBeforeProperty
import typingsSlinky.csstype.mod.WebkitBorderBeforeStyleProperty
import typingsSlinky.csstype.mod.WebkitBorderBeforeWidthProperty
import typingsSlinky.csstype.mod.WebkitBoxReflectProperty
import typingsSlinky.csstype.mod.WebkitLineClampProperty
import typingsSlinky.csstype.mod.WebkitMaskAttachmentProperty
import typingsSlinky.csstype.mod.WebkitMaskClipProperty
import typingsSlinky.csstype.mod.WebkitMaskCompositeProperty
import typingsSlinky.csstype.mod.WebkitMaskImageProperty
import typingsSlinky.csstype.mod.WebkitMaskOriginProperty
import typingsSlinky.csstype.mod.WebkitMaskPositionProperty
import typingsSlinky.csstype.mod.WebkitMaskPositionXProperty
import typingsSlinky.csstype.mod.WebkitMaskPositionYProperty
import typingsSlinky.csstype.mod.WebkitMaskProperty
import typingsSlinky.csstype.mod.WebkitMaskRepeatProperty
import typingsSlinky.csstype.mod.WebkitMaskRepeatXProperty
import typingsSlinky.csstype.mod.WebkitMaskRepeatYProperty
import typingsSlinky.csstype.mod.WebkitMaskSizeProperty
import typingsSlinky.csstype.mod.WebkitOverflowScrollingProperty
import typingsSlinky.csstype.mod.WebkitTapHighlightColorProperty
import typingsSlinky.csstype.mod.WebkitTextFillColorProperty
import typingsSlinky.csstype.mod.WebkitTextStrokeColorProperty
import typingsSlinky.csstype.mod.WebkitTextStrokeProperty
import typingsSlinky.csstype.mod.WebkitTextStrokeWidthProperty
import typingsSlinky.csstype.mod.WebkitTouchCalloutProperty
import typingsSlinky.csstype.mod.WebkitUserModifyProperty
import typingsSlinky.csstype.mod.WhiteSpaceProperty
import typingsSlinky.csstype.mod.WidthProperty
import typingsSlinky.csstype.mod.WillChangeProperty
import typingsSlinky.csstype.mod.WordBreakProperty
import typingsSlinky.csstype.mod.WordSpacingProperty
import typingsSlinky.csstype.mod.WordWrapProperty
import typingsSlinky.csstype.mod.WritingModeProperty
import typingsSlinky.csstype.mod.ZIndexProperty
import typingsSlinky.csstype.mod.ZoomProperty
import typingsSlinky.react.mod.ProviderProps
import typingsSlinky.react.mod.RefCallback
import typingsSlinky.reactMdUtils.typesTypesMod.PropsWithRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useGridListMod {
  
  @JSImport("@react-md/utils/types/layout/useGridList", "CELL_MARGIN_VAR")
  @js.native
  val CELL_MARGIN_VAR: /* "--rmd-cell-margin" */ String = js.native
  
  @JSImport("@react-md/utils/types/layout/useGridList", "CELL_SIZE_VAR")
  @js.native
  val CELL_SIZE_VAR: /* "--rmd-cell-size" */ String = js.native
  
  @JSImport("@react-md/utils/types/layout/useGridList", "DEFAULT_GRID_LIST_MAX_CELL_SIZE")
  @js.native
  val DEFAULT_GRID_LIST_MAX_CELL_SIZE: /* 150 */ Double = js.native
  
  @JSImport("@react-md/utils/types/layout/useGridList", "DEFAULT_GRID_LIST_PADDING")
  @js.native
  val DEFAULT_GRID_LIST_PADDING: /* 16 */ Double = js.native
  
  @JSImport("@react-md/utils/types/layout/useGridList", "GridListSizeProvider")
  @js.native
  val GridListSizeProvider: ReactComponentClass[ProviderProps[GridListSize]] = js.native
  
  @JSImport("@react-md/utils/types/layout/useGridList", "useGridList")
  @js.native
  def useGridList[E /* <: HTMLElement */](): UseGridListReturnValue[E] = js.native
  @JSImport("@react-md/utils/types/layout/useGridList", "useGridList")
  @js.native
  def useGridList[E /* <: HTMLElement */](
    hasRefStyleClassNameCellMarginDefaultSizeMaxCellSizeDisableHeightDisableWidthContainerPadding: PropsWithRef[UseGridListOptions, E]
  ): UseGridListReturnValue[E] = js.native
  
  @JSImport("@react-md/utils/types/layout/useGridList", "useGridListSize")
  @js.native
  def useGridListSize(): GridListSize = js.native
  
  /* Inlined react.react.CSSProperties & {[CELL_SIZE_VAR] : string, [CELL_MARGIN_VAR] : string | undefined} */
  @js.native
  trait CSSProperties extends StObject {
    
    /**
      * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
      *
      * **Syntax**: `start | center | end | baseline | stretch`
      *
      * **Initial value**: `stretch`
      *
      * @deprecated
      */
    var KhtmlBoxAlign: js.UndefOr[BoxAlignProperty] = js.native
    
    /**
      * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
      *
      * **Syntax**: `normal | reverse | inherit`
      *
      * **Initial value**: `normal`
      *
      * @deprecated
      */
    var KhtmlBoxDirection: js.UndefOr[BoxDirectionProperty] = js.native
    
    /**
      * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
      *
      * **Syntax**: `<number>`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var KhtmlBoxFlex: js.UndefOr[GlobalsNumber] = js.native
    
    /**
      * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
      *
      * **Syntax**: `<integer>`
      *
      * **Initial value**: `1`
      *
      * @deprecated
      */
    var KhtmlBoxFlexGroup: js.UndefOr[GlobalsNumber] = js.native
    
    /**
      * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
      *
      * **Syntax**: `single | multiple`
      *
      * **Initial value**: `single`
      *
      * @deprecated
      */
    var KhtmlBoxLines: js.UndefOr[BoxLinesProperty] = js.native
    
    /**
      * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
      *
      * **Syntax**: `<integer>`
      *
      * **Initial value**: `1`
      *
      * @deprecated
      */
    var KhtmlBoxOrdinalGroup: js.UndefOr[GlobalsNumber] = js.native
    
    /**
      * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
      *
      * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
      *
      * **Initial value**: `inline-axis` (`horizontal` in XUL)
      *
      * @deprecated
      */
    var KhtmlBoxOrient: js.UndefOr[BoxOrientProperty] = js.native
    
    /**
      * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
      *
      * **Syntax**: `start | center | end | justify`
      *
      * **Initial value**: `start`
      *
      * @deprecated
      */
    var KhtmlBoxPack: js.UndefOr[BoxPackProperty] = js.native
    
    /**
      * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
      *
      * **Syntax**: `auto | loose | normal | strict | anywhere`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var KhtmlLineBreak: js.UndefOr[LineBreakProperty] = js.native
    
    /**
      * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
      *
      * **Syntax**: `<alpha-value>`
      *
      * **Initial value**: `1.0`
      *
      * @deprecated
      */
    var KhtmlOpacity: js.UndefOr[OpacityProperty] = js.native
    
    /**
      * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
      *
      * **Syntax**: `auto | text | none | contain | all`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var KhtmlUserSelect: js.UndefOr[UserSelectProperty] = js.native
    
    /**
      * The **`animation`** shorthand CSS property sets an animated transition between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
      *
      * **Syntax**: `<single-animation>#`
      */
    var MozAnimation: js.UndefOr[AnimationProperty] = js.native
    
    /**
      * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
      *
      * **Syntax**: `<time>#`
      *
      * **Initial value**: `0s`
      */
    var MozAnimationDelay: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
      *
      * **Syntax**: `<single-animation-direction>#`
      *
      * **Initial value**: `normal`
      */
    var MozAnimationDirection: js.UndefOr[AnimationDirectionProperty] = js.native
    
    /**
      * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
      *
      * **Syntax**: `<time>#`
      *
      * **Initial value**: `0s`
      */
    var MozAnimationDuration: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
      *
      * **Syntax**: `<single-animation-fill-mode>#`
      *
      * **Initial value**: `none`
      */
    var MozAnimationFillMode: js.UndefOr[AnimationFillModeProperty] = js.native
    
    /**
      * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
      *
      * **Syntax**: `<single-animation-iteration-count>#`
      *
      * **Initial value**: `1`
      */
    var MozAnimationIterationCount: js.UndefOr[AnimationIterationCountProperty] = js.native
    
    /**
      * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
      *
      * **Syntax**: `[ none | <keyframes-name> ]#`
      *
      * **Initial value**: `none`
      */
    var MozAnimationName: js.UndefOr[AnimationNameProperty] = js.native
    
    /**
      * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
      *
      * **Syntax**: `<single-animation-play-state>#`
      *
      * **Initial value**: `running`
      */
    var MozAnimationPlayState: js.UndefOr[AnimationPlayStateProperty] = js.native
    
    /**
      * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
      *
      * **Syntax**: `<timing-function>#`
      *
      * **Initial value**: `ease`
      */
    var MozAnimationTimingFunction: js.UndefOr[AnimationTimingFunctionProperty] = js.native
    
    /**
      * The **`-moz-appearance`** CSS property is used in Gecko (Firefox) to display an element using platform-native styling based on the operating system's theme.
      *
      * **Syntax**: `none | button | button-arrow-down | button-arrow-next | button-arrow-previous | button-arrow-up | button-bevel | button-focus | caret | checkbox | checkbox-container | checkbox-label | checkmenuitem | dualbutton | groupbox | listbox | listitem | menuarrow | menubar | menucheckbox | menuimage | menuitem | menuitemtext | menulist | menulist-button | menulist-text | menulist-textfield | menupopup | menuradio | menuseparator | meterbar | meterchunk | progressbar | progressbar-vertical | progresschunk | progresschunk-vertical | radio | radio-container | radio-label | radiomenuitem | range | range-thumb | resizer | resizerpanel | scale-horizontal | scalethumbend | scalethumb-horizontal | scalethumbstart | scalethumbtick | scalethumb-vertical | scale-vertical | scrollbarbutton-down | scrollbarbutton-left | scrollbarbutton-right | scrollbarbutton-up | scrollbarthumb-horizontal | scrollbarthumb-vertical | scrollbartrack-horizontal | scrollbartrack-vertical | searchfield | separator | sheet | spinner | spinner-downbutton | spinner-textfield | spinner-upbutton | splitter | statusbar | statusbarpanel | tab | tabpanel | tabpanels | tab-scroll-arrow-back | tab-scroll-arrow-forward | textfield | textfield-multiline | toolbar | toolbarbutton | toolbarbutton-dropdown | toolbargripper | toolbox | tooltip | treeheader | treeheadercell | treeheadersortarrow | treeitem | treeline | treetwisty | treetwistyopen | treeview | -moz-mac-unified-toolbar | -moz-win-borderless-glass | -moz-win-browsertabbar-toolbox | -moz-win-communicationstext | -moz-win-communications-toolbox | -moz-win-exclude-glass | -moz-win-glass | -moz-win-mediatext | -moz-win-media-toolbox | -moz-window-button-box | -moz-window-button-box-maximized | -moz-window-button-close | -moz-window-button-maximize | -moz-window-button-minimize | -moz-window-button-restore | -moz-window-frame-bottom | -moz-window-frame-left | -moz-window-frame-right | -moz-window-titlebar | -moz-window-titlebar-maximized`
      *
      * **Initial value**: `none` (but this value is overridden in the user agent CSS)
      */
    var MozAppearance: js.UndefOr[MozAppearanceProperty] = js.native
    
    /**
      * The **`backface-visibility`** CSS property sets whether the back face of an element is visible when turned towards the user.
      *
      * **Syntax**: `visible | hidden`
      *
      * **Initial value**: `visible`
      */
    var MozBackfaceVisibility: js.UndefOr[BackfaceVisibilityProperty] = js.native
    
    /**
      * The **`background-clip`** CSS property sets whether an element's background `<color>` or `<image>` extends underneath its border.
      *
      * **Syntax**: `<box>#`
      *
      * **Initial value**: `border-box`
      *
      * @deprecated
      */
    var MozBackgroundClip: js.UndefOr[BackgroundClipProperty] = js.native
    
    /**
      * The **`box-decoration-break`** CSS property specifies how an element's fragments should be rendered when broken across multiple lines, columns, or pages.
      *
      * **Syntax**: `slice | clone`
      *
      * **Initial value**: `slice`
      *
      * @deprecated
      */
    var MozBackgroundInlinePolicy: js.UndefOr[BoxDecorationBreakProperty] = js.native
    
    /**
      * The **`background-origin`** CSS property sets the _background positioning area_. In other words, it sets the origin position of an image set with the `background-image` property.
      *
      * **Syntax**: `<box>#`
      *
      * **Initial value**: `padding-box`
      *
      * @deprecated
      */
    var MozBackgroundOrigin: js.UndefOr[BackgroundOriginProperty] = js.native
    
    /**
      * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
      *
      * **Syntax**: `<bg-size>#`
      *
      * **Initial value**: `auto auto`
      *
      * @deprecated
      */
    var MozBackgroundSize: js.UndefOr[BackgroundSizeProperty[String | Double]] = js.native
    
    /**
      * The **`-moz-binding`** CSS property is used by Mozilla-based applications to attach an XBL binding to a DOM element.
      *
      * **Syntax**: `<url> | none`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var MozBinding: js.UndefOr[MozBindingProperty] = js.native
    
    /**
      * In Mozilla applications like Firefox, the **`-moz-border-bottom-colors`** CSS property sets a list of colors for the bottom border.
      *
      * **Syntax**: `<color>+ | none`
      *
      * **Initial value**: `none`
      */
    var MozBorderBottomColors: js.UndefOr[MozBorderBottomColorsProperty] = js.native
    
    /**
      * The **`border-inline-end-color`** CSS property defines the color of the logical inline-end border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'border-top-color'>`
      *
      * **Initial value**: `currentcolor`
      */
    var MozBorderEndColor: js.UndefOr[BorderInlineEndColorProperty] = js.native
    
    /**
      * The **`border-inline-end-style`** CSS property defines the style of the logical inline end border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'border-top-style'>`
      *
      * **Initial value**: `none`
      */
    var MozBorderEndStyle: js.UndefOr[BorderInlineEndStyleProperty] = js.native
    
    /**
      * The **`border-inline-end-width`** CSS property defines the width of the logical inline-end border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'border-top-width'>`
      *
      * **Initial value**: `medium`
      */
    var MozBorderEndWidth: js.UndefOr[BorderInlineEndWidthProperty[String | Double]] = js.native
    
    /**
      * The **`border-image`** CSS property draws an image in place of an element's `border-style`.
      *
      * **Syntax**: `<'border-image-source'> || <'border-image-slice'> [ / <'border-image-width'> | / <'border-image-width'>? / <'border-image-outset'> ]? || <'border-image-repeat'>`
      */
    var MozBorderImage: js.UndefOr[BorderImageProperty] = js.native
    
    /**
      * In Mozilla applications like Firefox, the **`-moz-border-left-colors`** CSS property sets a list of colors for the left border.
      *
      * **Syntax**: `<color>+ | none`
      *
      * **Initial value**: `none`
      */
    var MozBorderLeftColors: js.UndefOr[MozBorderLeftColorsProperty] = js.native
    
    /**
      * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
      *
      * **Syntax**: `<length-percentage>{1,4} [ / <length-percentage>{1,4} ]?`
      *
      * @deprecated
      */
    var MozBorderRadius: js.UndefOr[BorderRadiusProperty[String | Double]] = js.native
    
    /**
      * The **`border-bottom-left-radius`** CSS property rounds the bottom-left corner of an element.
      *
      * **Syntax**: `<length-percentage>{1,2}`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var MozBorderRadiusBottomleft: js.UndefOr[BorderBottomLeftRadiusProperty[String | Double]] = js.native
    
    /**
      * The **`border-bottom-right-radius`** CSS property rounds the bottom-right corner of an element.
      *
      * **Syntax**: `<length-percentage>{1,2}`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var MozBorderRadiusBottomright: js.UndefOr[BorderBottomRightRadiusProperty[String | Double]] = js.native
    
    /**
      * The **`border-top-left-radius`** CSS property rounds the top-left corner of an element.
      *
      * **Syntax**: `<length-percentage>{1,2}`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var MozBorderRadiusTopleft: js.UndefOr[BorderTopLeftRadiusProperty[String | Double]] = js.native
    
    /**
      * The **`border-top-right-radius`** CSS property rounds the top-right corner of an element.
      *
      * **Syntax**: `<length-percentage>{1,2}`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var MozBorderRadiusTopright: js.UndefOr[BorderTopRightRadiusProperty[String | Double]] = js.native
    
    /**
      * In Mozilla applications like Firefox, the **`-moz-border-right-colors`** CSS property sets a list of colors for the right border.
      *
      * **Syntax**: `<color>+ | none`
      *
      * **Initial value**: `none`
      */
    var MozBorderRightColors: js.UndefOr[MozBorderRightColorsProperty] = js.native
    
    /**
      * The **`border-inline-start-color`** CSS property defines the color of the logical inline start border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'border-top-color'>`
      *
      * **Initial value**: `currentcolor`
      */
    var MozBorderStartColor: js.UndefOr[BorderInlineStartColorProperty] = js.native
    
    /**
      * The **`border-inline-start-style`** CSS property defines the style of the logical inline start border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'border-top-style'>`
      *
      * **Initial value**: `none`
      */
    var MozBorderStartStyle: js.UndefOr[BorderInlineStartStyleProperty] = js.native
    
    /**
      * In Mozilla applications like Firefox, the **`-moz-border-top-colors`** CSS property sets a list of colors for the top border.
      *
      * **Syntax**: `<color>+ | none`
      *
      * **Initial value**: `none`
      */
    var MozBorderTopColors: js.UndefOr[MozBorderTopColorsProperty] = js.native
    
    /**
      * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
      *
      * **Syntax**: `start | center | end | baseline | stretch`
      *
      * **Initial value**: `stretch`
      *
      * @deprecated
      */
    var MozBoxAlign: js.UndefOr[BoxAlignProperty] = js.native
    
    /**
      * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
      *
      * **Syntax**: `normal | reverse | inherit`
      *
      * **Initial value**: `normal`
      *
      * @deprecated
      */
    var MozBoxDirection: js.UndefOr[BoxDirectionProperty] = js.native
    
    /**
      * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
      *
      * **Syntax**: `<number>`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var MozBoxFlex: js.UndefOr[GlobalsNumber] = js.native
    
    /**
      * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
      *
      * **Syntax**: `<integer>`
      *
      * **Initial value**: `1`
      *
      * @deprecated
      */
    var MozBoxOrdinalGroup: js.UndefOr[GlobalsNumber] = js.native
    
    /**
      * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
      *
      * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
      *
      * **Initial value**: `inline-axis` (`horizontal` in XUL)
      *
      * @deprecated
      */
    var MozBoxOrient: js.UndefOr[BoxOrientProperty] = js.native
    
    /**
      * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
      *
      * **Syntax**: `start | center | end | justify`
      *
      * **Initial value**: `start`
      *
      * @deprecated
      */
    var MozBoxPack: js.UndefOr[BoxPackProperty] = js.native
    
    /**
      * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii, and color.
      *
      * **Syntax**: `none | <shadow>#`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var MozBoxShadow: js.UndefOr[BoxShadowProperty] = js.native
    
    /**
      * The **`box-sizing`** CSS property defines how the user agent should calculate the total width and height of an element.
      *
      * **Syntax**: `content-box | border-box`
      *
      * **Initial value**: `content-box`
      */
    var MozBoxSizing: js.UndefOr[BoxSizingProperty] = js.native
    
    /**
      * The **`column-count`** CSS property breaks an element's content into the specified number of columns.
      *
      * **Syntax**: `<integer> | auto`
      *
      * **Initial value**: `auto`
      */
    var MozColumnCount: js.UndefOr[ColumnCountProperty] = js.native
    
    /**
      * The **`column-fill`** CSS property controls how an element's contents are balanced when broken into columns.
      *
      * **Syntax**: `auto | balance | balance-all`
      *
      * **Initial value**: `balance`
      */
    var MozColumnFill: js.UndefOr[ColumnFillProperty] = js.native
    
    /**
      * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
      *
      * **Syntax**: `normal | <length-percentage>`
      *
      * **Initial value**: `normal`
      */
    var MozColumnGap: js.UndefOr[ColumnGapProperty[String | Double]] = js.native
    
    /**
      * The **`column-rule`** CSS property sets the width, style, and color of the rule (line) drawn between columns in a multi-column layout.
      *
      * **Syntax**: `<'column-rule-width'> || <'column-rule-style'> || <'column-rule-color'>`
      */
    var MozColumnRule: js.UndefOr[ColumnRuleProperty[String | Double]] = js.native
    
    /**
      * The **`column-rule-color`** CSS property sets the color of the rule (line) drawn between columns in a multi-column layout.
      *
      * **Syntax**: `<color>`
      *
      * **Initial value**: `currentcolor`
      */
    var MozColumnRuleColor: js.UndefOr[ColumnRuleColorProperty] = js.native
    
    /**
      * The **`column-rule-style`** CSS property sets the style of the line drawn between columns in a multi-column layout.
      *
      * **Syntax**: `<'border-style'>`
      *
      * **Initial value**: `none`
      */
    var MozColumnRuleStyle: js.UndefOr[ColumnRuleStyleProperty] = js.native
    
    /**
      * The **`column-rule-width`** CSS property sets the width of the rule (line) drawn between columns in a multi-column layout.
      *
      * **Syntax**: `<'border-width'>`
      *
      * **Initial value**: `medium`
      */
    var MozColumnRuleWidth: js.UndefOr[ColumnRuleWidthProperty[String | Double]] = js.native
    
    /**
      * The **`column-width`** CSS property specifies the ideal column width in a multi-column layout. The container will have as many columns as can fit without any of them having a width less than the `column-width` value. If the width of the container is narrower than the specified value, the single column's width will be smaller than the declared column width.
      *
      * **Syntax**: `<length> | auto`
      *
      * **Initial value**: `auto`
      */
    var MozColumnWidth: js.UndefOr[ColumnWidthProperty[String | Double]] = js.native
    
    /**
      * The **`columns`** CSS property sets the column width and column count of an element.
      *
      * **Syntax**: `<'column-width'> || <'column-count'>`
      */
    var MozColumns: js.UndefOr[ColumnsProperty[String | Double]] = js.native
    
    /**
      * If you reference an SVG image in a webpage (such as with the `<img>` element or as a background image), the SVG image can coordinate with the embedding element (its context) to have the image adopt property values set on the embedding element. To do this the embedding element needs to list the properties that are to be made available to the image by listing them as values of the **`-moz-context-properties`** property, and the image needs to opt in to using those properties by using values such as the `context-fill` value.
      *
      * **Syntax**: `none | [ fill | fill-opacity | stroke | stroke-opacity ]#`
      *
      * **Initial value**: `none`
      */
    var MozContextProperties: js.UndefOr[MozContextPropertiesProperty] = js.native
    
    /**
      * The non-standard **`-moz-float-edge`** CSS property specifies whether the height and width properties of the element include the margin, border, or padding thickness.
      *
      * **Syntax**: `border-box | content-box | margin-box | padding-box`
      *
      * **Initial value**: `content-box`
      *
      * @deprecated
      */
    var MozFloatEdge: js.UndefOr[MozFloatEdgeProperty] = js.native
    
    /**
      * The **`font-feature-settings`** CSS property controls advanced typographic features in OpenType fonts.
      *
      * **Syntax**: `normal | <feature-tag-value>#`
      *
      * **Initial value**: `normal`
      */
    var MozFontFeatureSettings: js.UndefOr[FontFeatureSettingsProperty] = js.native
    
    /**
      * The **`font-language-override`** CSS property controls the use of language-specific glyphs in a typeface.
      *
      * **Syntax**: `normal | <string>`
      *
      * **Initial value**: `normal`
      */
    var MozFontLanguageOverride: js.UndefOr[FontLanguageOverrideProperty] = js.native
    
    /**
      * The **`-moz-force-broken-image-icon`** extended CSS property can be used to force the broken image icon to be shown even when a broken image has an `alt` attribute.
      *
      * **Syntax**: `<integer [0,1]>`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var MozForceBrokenImageIcon: js.UndefOr[GlobalsNumber] = js.native
    
    /**
      * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. You can prevent hyphenation entirely, use hyphenation in manually-specified points within the text, or let the browser automatically insert hyphens where appropriate.
      *
      * **Syntax**: `none | manual | auto`
      *
      * **Initial value**: `manual`
      */
    var MozHyphens: js.UndefOr[HyphensProperty] = js.native
    
    /**
      * For certain XUL elements and pseudo-elements that use an image from the `list-style-image` property, this property specifies a region of the image that is used in place of the whole image. This allows elements to use different pieces of the same image to improve performance.
      *
      * **Syntax**: `<shape> | auto`
      *
      * **Initial value**: `auto`
      */
    var MozImageRegion: js.UndefOr[MozImageRegionProperty] = js.native
    
    /**
      * The **`margin-inline-end`** CSS property defines the logical inline end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. In other words, it corresponds to the `margin-top`, `margin-right`, `margin-bottom` or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'margin-left'>`
      *
      * **Initial value**: `0`
      */
    var MozMarginEnd: js.UndefOr[MarginInlineEndProperty[String | Double]] = js.native
    
    /**
      * The **`margin-inline-start`** CSS property defines the logical inline start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. It corresponds to the `margin-top`, `margin-right`, `margin-bottom`, or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'margin-left'>`
      *
      * **Initial value**: `0`
      */
    var MozMarginStart: js.UndefOr[MarginInlineStartProperty[String | Double]] = js.native
    
    /**
      * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
      *
      * **Syntax**: `<alpha-value>`
      *
      * **Initial value**: `1.0`
      *
      * @deprecated
      */
    var MozOpacity: js.UndefOr[OpacityProperty] = js.native
    
    /**
      * The **`-moz-orient`** CSS property specifies the orientation of the element to which it's applied.
      *
      * **Syntax**: `inline | block | horizontal | vertical`
      *
      * **Initial value**: `inline`
      */
    var MozOrient: js.UndefOr[MozOrientProperty] = js.native
    
    /**
      * The **`font-smooth`** CSS property controls the application of anti-aliasing when fonts are rendered.
      *
      * **Syntax**: `auto | never | always | <absolute-size> | <length>`
      *
      * **Initial value**: `auto`
      */
    var MozOsxFontSmoothing: js.UndefOr[FontSmoothProperty[String | Double]] = js.native
    
    /**
      * The **`outline`** CSS property is a shorthand to set various outline properties in a single declaration: `outline-style`, `outline-width`, and `outline-color`.
      *
      * **Syntax**: `[ <'outline-color'> || <'outline-style'> || <'outline-width'> ]`
      *
      * @deprecated
      */
    var MozOutline: js.UndefOr[OutlineProperty[String | Double]] = js.native
    
    /**
      * The **`outline-color`** CSS property sets the color of an element's outline.
      *
      * **Syntax**: `<color> | invert`
      *
      * **Initial value**: `invert`, for browsers supporting it, `currentColor` for the other
      *
      * @deprecated
      */
    var MozOutlineColor: js.UndefOr[OutlineColorProperty] = js.native
    
    /**
      * In Mozilla applications like Firefox, the **`-moz-outline-radius`** CSS property can be used to give an element's `outline` rounded corners.
      *
      * **Syntax**: `<outline-radius>{1,4} [ / <outline-radius>{1,4} ]?`
      *
      * @deprecated
      */
    var MozOutlineRadius: js.UndefOr[MozOutlineRadiusProperty[String | Double]] = js.native
    
    /**
      * In Mozilla applications, the **`-moz-outline-radius-bottomleft`** CSS property can be used to round the bottom-left corner of an element's `outline`.
      *
      * **Syntax**: `<outline-radius>`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var MozOutlineRadiusBottomleft: js.UndefOr[MozOutlineRadiusBottomleftProperty[String | Double]] = js.native
    
    /**
      * In Mozilla applications, the **`-moz-outline-radius-bottomright`** CSS property can be used to round the bottom-right corner of an element's `outline`.
      *
      * **Syntax**: `<outline-radius>`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var MozOutlineRadiusBottomright: js.UndefOr[MozOutlineRadiusBottomrightProperty[String | Double]] = js.native
    
    /**
      * In Mozilla applications, the **`-moz-outline-radius-topleft`** CSS property can be used to round the top-left corner of an element's `outline`.
      *
      * **Syntax**: `<outline-radius>`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var MozOutlineRadiusTopleft: js.UndefOr[MozOutlineRadiusTopleftProperty[String | Double]] = js.native
    
    /**
      * In Mozilla applications, the **`-moz-outline-radius-topright`** CSS property can be used to round the top-right corner of an element's `outline`.
      *
      * **Syntax**: `<outline-radius>`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var MozOutlineRadiusTopright: js.UndefOr[MozOutlineRadiusToprightProperty[String | Double]] = js.native
    
    /**
      * The **`outline-style`** CSS property sets the style of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
      *
      * **Syntax**: `auto | <'border-style'>`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var MozOutlineStyle: js.UndefOr[OutlineStyleProperty] = js.native
    
    /**
      * The **`outline-width`** CSS property sets the thickness of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
      *
      * **Syntax**: `<line-width>`
      *
      * **Initial value**: `medium`
      *
      * @deprecated
      */
    var MozOutlineWidth: js.UndefOr[OutlineWidthProperty[String | Double]] = js.native
    
    /**
      * The **`padding-inline-end`** CSS property defines the logical inline end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'padding-left'>`
      *
      * **Initial value**: `0`
      */
    var MozPaddingEnd: js.UndefOr[PaddingInlineEndProperty[String | Double]] = js.native
    
    /**
      * The **`padding-inline-start`** CSS property defines the logical inline start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'padding-left'>`
      *
      * **Initial value**: `0`
      */
    var MozPaddingStart: js.UndefOr[PaddingInlineStartProperty[String | Double]] = js.native
    
    /**
      * The **`perspective`** CSS property determines the distance between the z=0 plane and the user in order to give a 3D-positioned element some perspective. Each 3D element with z>0 becomes larger; each 3D-element with z<0 becomes smaller. The strength of the effect is determined by the value of this property.
      *
      * **Syntax**: `none | <length>`
      *
      * **Initial value**: `none`
      */
    var MozPerspective: js.UndefOr[PerspectiveProperty[String | Double]] = js.native
    
    /**
      * The **`perspective-origin`** CSS property determines the position at which the viewer is looking. It is used as the _vanishing point_ by the `perspective` property.
      *
      * **Syntax**: `<position>`
      *
      * **Initial value**: `50% 50%`
      */
    var MozPerspectiveOrigin: js.UndefOr[PerspectiveOriginProperty[String | Double]] = js.native
    
    /**
      * **`-moz-stack-sizing`** is an extended CSS property. Normally, a `stack` will change its size so that all of its child elements are completely visible. For example, moving a child of the stack far to the right will widen the stack so the child remains visible.
      *
      * **Syntax**: `ignore | stretch-to-fit`
      *
      * **Initial value**: `stretch-to-fit`
      */
    var MozStackSizing: js.UndefOr[MozStackSizingProperty] = js.native
    
    /**
      * The **`tab-size`** CSS property is used to customize the width of a tab (`U+0009`) character.
      *
      * **Syntax**: `<integer> | <length>`
      *
      * **Initial value**: `8`
      */
    var MozTabSize: js.UndefOr[TabSizeProperty[String | Double]] = js.native
    
    /**
      * The **`text-align-last`** CSS property sets how the last line of a block or a line, right before a forced line break, is aligned.
      *
      * **Syntax**: `auto | start | end | left | right | center | justify`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var MozTextAlignLast: js.UndefOr[TextAlignLastProperty] = js.native
    
    /**
      * The **`-moz-text-blink`** non-standard Mozilla CSS extension specifies the blink mode.
      *
      * **Syntax**: `none | blink`
      *
      * **Initial value**: `none`
      */
    var MozTextBlink: js.UndefOr[MozTextBlinkProperty] = js.native
    
    /**
      * The **`text-decoration-color`** CSS property sets the color of decorations added to text by `text-decoration-line`.
      *
      * **Syntax**: `<color>`
      *
      * **Initial value**: `currentcolor`
      *
      * @deprecated
      */
    var MozTextDecorationColor: js.UndefOr[TextDecorationColorProperty] = js.native
    
    /**
      * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element, such as an underline or overline.
      *
      * **Syntax**: `none | [ underline || overline || line-through || blink ] | spelling-error | grammar-error`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var MozTextDecorationLine: js.UndefOr[TextDecorationLineProperty] = js.native
    
    /**
      * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are set with `text-decoration-line`.
      *
      * **Syntax**: `solid | double | dotted | dashed | wavy`
      *
      * **Initial value**: `solid`
      *
      * @deprecated
      */
    var MozTextDecorationStyle: js.UndefOr[TextDecorationStyleProperty] = js.native
    
    /**
      * The **`text-size-adjust`** CSS property controls the text inflation algorithm used on some smartphones and tablets. Other browsers will ignore this property.
      *
      * **Syntax**: `none | auto | <percentage>`
      *
      * **Initial value**: `auto` for smartphone browsers supporting inflation, `none` in other cases (and then not modifiable).
      */
    var MozTextSizeAdjust: js.UndefOr[TextSizeAdjustProperty] = js.native
    
    /**
      * The **`transform-origin`** CSS property sets the origin for an element's transformations.
      *
      * **Syntax**: `[ <length-percentage> | left | center | right | top | bottom ] | [ [ <length-percentage> | left | center | right ] && [ <length-percentage> | top | center | bottom ] ] <length>?`
      *
      * **Initial value**: `50% 50% 0`
      */
    var MozTransformOrigin: js.UndefOr[TransformOriginProperty[String | Double]] = js.native
    
    /**
      * The **`transform-style`** CSS property sets whether children of an element are positioned in the 3D space or are flattened in the plane of the element.
      *
      * **Syntax**: `flat | preserve-3d`
      *
      * **Initial value**: `flat`
      */
    var MozTransformStyle: js.UndefOr[TransformStyleProperty] = js.native
    
    /**
      * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
      *
      * **Syntax**: `<single-transition>#`
      */
    var MozTransition: js.UndefOr[TransitionProperty] = js.native
    
    /**
      * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
      *
      * **Syntax**: `<time>#`
      *
      * **Initial value**: `0s`
      */
    var MozTransitionDelay: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
      *
      * **Syntax**: `<time>#`
      *
      * **Initial value**: `0s`
      */
    var MozTransitionDuration: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
      *
      * **Syntax**: `none | <single-transition-property>#`
      *
      * **Initial value**: all
      */
    var MozTransitionProperty: js.UndefOr[TransitionPropertyProperty] = js.native
    
    /**
      * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
      *
      * **Syntax**: `<timing-function>#`
      *
      * **Initial value**: `ease`
      */
    var MozTransitionTimingFunction: js.UndefOr[TransitionTimingFunctionProperty] = js.native
    
    /**
      * The **`-moz-user-focus`** CSS property is used to indicate whether an element can have the focus.
      *
      * **Syntax**: `ignore | normal | select-after | select-before | select-menu | select-same | select-all | none`
      *
      * **Initial value**: `none`
      */
    var MozUserFocus: js.UndefOr[MozUserFocusProperty] = js.native
    
    /**
      * In Mozilla applications, **`-moz-user-input`** determines if an element will accept user input.
      *
      * **Syntax**: `auto | none | enabled | disabled`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var MozUserInput: js.UndefOr[MozUserInputProperty] = js.native
    
    /**
      * The **`user-modify`** property has no effect in Firefox. It was originally planned to determine whether or not the content of an element can be edited by a user.
      *
      * **Syntax**: `read-only | read-write | write-only`
      *
      * **Initial value**: `read-only`
      */
    var MozUserModify: js.UndefOr[MozUserModifyProperty] = js.native
    
    /**
      * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
      *
      * **Syntax**: `auto | text | none | contain | all`
      *
      * **Initial value**: `auto`
      */
    var MozUserSelect: js.UndefOr[UserSelectProperty] = js.native
    
    /**
      * The **`-moz-window-dragging`** CSS property specifies whether a window is draggable or not. It only works in Chrome code, and only on Mac OS X.
      *
      * **Syntax**: `drag | no-drag`
      *
      * **Initial value**: `drag`
      */
    var MozWindowDragging: js.UndefOr[MozWindowDraggingProperty] = js.native
    
    /**
      * The **`-moz-window-shadow`** CSS property specifies whether a window will have a shadow. It only works on Mac OS X.
      *
      * **Syntax**: `default | menu | tooltip | sheet | none`
      *
      * **Initial value**: `default`
      */
    var MozWindowShadow: js.UndefOr[MozWindowShadowProperty] = js.native
    
    /**
      * The **`animation`** shorthand CSS property sets an animated transition between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
      *
      * **Syntax**: `<single-animation>#`
      *
      * @deprecated
      */
    var OAnimation: js.UndefOr[AnimationProperty] = js.native
    
    /**
      * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
      *
      * **Syntax**: `<time>#`
      *
      * **Initial value**: `0s`
      *
      * @deprecated
      */
    var OAnimationDelay: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
      *
      * **Syntax**: `<single-animation-direction>#`
      *
      * **Initial value**: `normal`
      *
      * @deprecated
      */
    var OAnimationDirection: js.UndefOr[AnimationDirectionProperty] = js.native
    
    /**
      * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
      *
      * **Syntax**: `<time>#`
      *
      * **Initial value**: `0s`
      *
      * @deprecated
      */
    var OAnimationDuration: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
      *
      * **Syntax**: `<single-animation-fill-mode>#`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var OAnimationFillMode: js.UndefOr[AnimationFillModeProperty] = js.native
    
    /**
      * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
      *
      * **Syntax**: `<single-animation-iteration-count>#`
      *
      * **Initial value**: `1`
      *
      * @deprecated
      */
    var OAnimationIterationCount: js.UndefOr[AnimationIterationCountProperty] = js.native
    
    /**
      * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
      *
      * **Syntax**: `[ none | <keyframes-name> ]#`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var OAnimationName: js.UndefOr[AnimationNameProperty] = js.native
    
    /**
      * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
      *
      * **Syntax**: `<single-animation-play-state>#`
      *
      * **Initial value**: `running`
      *
      * @deprecated
      */
    var OAnimationPlayState: js.UndefOr[AnimationPlayStateProperty] = js.native
    
    /**
      * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
      *
      * **Syntax**: `<timing-function>#`
      *
      * **Initial value**: `ease`
      *
      * @deprecated
      */
    var OAnimationTimingFunction: js.UndefOr[AnimationTimingFunctionProperty] = js.native
    
    /**
      * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
      *
      * **Syntax**: `<bg-size>#`
      *
      * **Initial value**: `auto auto`
      *
      * @deprecated
      */
    var OBackgroundSize: js.UndefOr[BackgroundSizeProperty[String | Double]] = js.native
    
    /**
      * The **`border-image`** CSS property draws an image in place of an element's `border-style`.
      *
      * **Syntax**: `<'border-image-source'> || <'border-image-slice'> [ / <'border-image-width'> | / <'border-image-width'>? / <'border-image-outset'> ]? || <'border-image-repeat'>`
      *
      * @deprecated
      */
    var OBorderImage: js.UndefOr[BorderImageProperty] = js.native
    
    /**
      * The **`object-fit`** CSS property sets how the content of a replaced element, such as an `<img>` or `<video>`, should be resized to fit its container.
      *
      * **Syntax**: `fill | contain | cover | none | scale-down`
      *
      * **Initial value**: `fill`
      */
    var OObjectFit: js.UndefOr[ObjectFitProperty] = js.native
    
    /**
      * The **`object-position`** CSS property specifies the alignment of the selected replaced element's contents within the element's box. Areas of the box which aren't covered by the replaced element's object will show the element's background.
      *
      * **Syntax**: `<position>`
      *
      * **Initial value**: `50% 50%`
      */
    var OObjectPosition: js.UndefOr[ObjectPositionProperty[String | Double]] = js.native
    
    /**
      * The **`tab-size`** CSS property is used to customize the width of a tab (`U+0009`) character.
      *
      * **Syntax**: `<integer> | <length>`
      *
      * **Initial value**: `8`
      */
    var OTabSize: js.UndefOr[TabSizeProperty[String | Double]] = js.native
    
    /**
      * The **`text-overflow`** CSS property sets how hidden overflow content is signaled to users. It can be clipped, display an ellipsis ('`…`'), or display a custom string.
      *
      * **Syntax**: `[ clip | ellipsis | <string> ]{1,2}`
      *
      * **Initial value**: `clip`
      */
    var OTextOverflow: js.UndefOr[TextOverflowProperty] = js.native
    
    /**
      * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
      *
      * **Syntax**: `none | <transform-list>`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var OTransform: js.UndefOr[TransformProperty] = js.native
    
    /**
      * The **`transform-origin`** CSS property sets the origin for an element's transformations.
      *
      * **Syntax**: `[ <length-percentage> | left | center | right | top | bottom ] | [ [ <length-percentage> | left | center | right ] && [ <length-percentage> | top | center | bottom ] ] <length>?`
      *
      * **Initial value**: `50% 50% 0`
      */
    var OTransformOrigin: js.UndefOr[TransformOriginProperty[String | Double]] = js.native
    
    /**
      * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
      *
      * **Syntax**: `<single-transition>#`
      *
      * @deprecated
      */
    var OTransition: js.UndefOr[TransitionProperty] = js.native
    
    /**
      * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
      *
      * **Syntax**: `<time>#`
      *
      * **Initial value**: `0s`
      *
      * @deprecated
      */
    var OTransitionDelay: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
      *
      * **Syntax**: `<time>#`
      *
      * **Initial value**: `0s`
      *
      * @deprecated
      */
    var OTransitionDuration: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
      *
      * **Syntax**: `none | <single-transition-property>#`
      *
      * **Initial value**: all
      *
      * @deprecated
      */
    var OTransitionProperty: js.UndefOr[TransitionPropertyProperty] = js.native
    
    /**
      * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
      *
      * **Syntax**: `<timing-function>#`
      *
      * **Initial value**: `ease`
      *
      * @deprecated
      */
    var OTransitionTimingFunction: js.UndefOr[TransitionTimingFunctionProperty] = js.native
    
    /**
      * The CSS **`align-content`** property sets how the browser distributes space between and around content items along the cross-axis of a flexbox container, and the main-axis of a grid container.
      *
      * **Syntax**: `normal | <baseline-position> | <content-distribution> | <overflow-position>? <content-position>`
      *
      * **Initial value**: `normal`
      */
    var WebkitAlignContent: js.UndefOr[AlignContentProperty] = js.native
    
    /**
      * The CSS **`align-items`** property sets the `align-self` value on all direct children as a group. The align-self property sets the alignment of an item within its containing block. In Flexbox it controls the alignment of items on the Cross Axis, in Grid Layout it controls the alignment of items on the Block Axis within their grid area.
      *
      * **Syntax**: `normal | stretch | <baseline-position> | [ <overflow-position>? <self-position> ]`
      *
      * **Initial value**: `normal`
      */
    var WebkitAlignItems: js.UndefOr[AlignItemsProperty] = js.native
    
    /**
      * The **`align-self`** CSS property aligns flex items of the current flex line overriding the `align-items` value. If any of the item's cross-axis margin is set to `auto`, then `align-self` is ignored. In Grid layout `align-self` aligns the item inside the grid area.
      *
      * **Syntax**: `auto | normal | stretch | <baseline-position> | <overflow-position>? <self-position>`
      *
      * **Initial value**: `auto`
      */
    var WebkitAlignSelf: js.UndefOr[AlignSelfProperty] = js.native
    
    /**
      * The **`animation`** shorthand CSS property sets an animated transition between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
      *
      * **Syntax**: `<single-animation>#`
      */
    var WebkitAnimation: js.UndefOr[AnimationProperty] = js.native
    
    /**
      * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
      *
      * **Syntax**: `<time>#`
      *
      * **Initial value**: `0s`
      */
    var WebkitAnimationDelay: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
      *
      * **Syntax**: `<single-animation-direction>#`
      *
      * **Initial value**: `normal`
      */
    var WebkitAnimationDirection: js.UndefOr[AnimationDirectionProperty] = js.native
    
    /**
      * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
      *
      * **Syntax**: `<time>#`
      *
      * **Initial value**: `0s`
      */
    var WebkitAnimationDuration: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
      *
      * **Syntax**: `<single-animation-fill-mode>#`
      *
      * **Initial value**: `none`
      */
    var WebkitAnimationFillMode: js.UndefOr[AnimationFillModeProperty] = js.native
    
    /**
      * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
      *
      * **Syntax**: `<single-animation-iteration-count>#`
      *
      * **Initial value**: `1`
      */
    var WebkitAnimationIterationCount: js.UndefOr[AnimationIterationCountProperty] = js.native
    
    /**
      * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
      *
      * **Syntax**: `[ none | <keyframes-name> ]#`
      *
      * **Initial value**: `none`
      */
    var WebkitAnimationName: js.UndefOr[AnimationNameProperty] = js.native
    
    /**
      * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
      *
      * **Syntax**: `<single-animation-play-state>#`
      *
      * **Initial value**: `running`
      */
    var WebkitAnimationPlayState: js.UndefOr[AnimationPlayStateProperty] = js.native
    
    /**
      * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
      *
      * **Syntax**: `<timing-function>#`
      *
      * **Initial value**: `ease`
      */
    var WebkitAnimationTimingFunction: js.UndefOr[AnimationTimingFunctionProperty] = js.native
    
    /**
      * The **`-moz-appearance`** CSS property is used in Gecko (Firefox) to display an element using platform-native styling based on the operating system's theme.
      *
      * **Syntax**: `none | button | button-bevel | caret | checkbox | default-button | inner-spin-button | listbox | listitem | media-controls-background | media-controls-fullscreen-background | media-current-time-display | media-enter-fullscreen-button | media-exit-fullscreen-button | media-fullscreen-button | media-mute-button | media-overlay-play-button | media-play-button | media-seek-back-button | media-seek-forward-button | media-slider | media-sliderthumb | media-time-remaining-display | media-toggle-closed-captions-button | media-volume-slider | media-volume-slider-container | media-volume-sliderthumb | menulist | menulist-button | menulist-text | menulist-textfield | meter | progress-bar | progress-bar-value | push-button | radio | searchfield | searchfield-cancel-button | searchfield-decoration | searchfield-results-button | searchfield-results-decoration | slider-horizontal | slider-vertical | sliderthumb-horizontal | sliderthumb-vertical | square-button | textarea | textfield | -apple-pay-button`
      *
      * **Initial value**: `none` (but this value is overridden in the user agent CSS)
      */
    var WebkitAppearance: js.UndefOr[WebkitAppearanceProperty] = js.native
    
    /**
      * The **`backdrop-filter`** CSS property lets you apply graphical effects such as blurring or color shifting to the area behind an element. Because it applies to everything _behind_ the element, to see the effect you must make the element or its background at least partially transparent.
      *
      * **Syntax**: `none | <filter-function-list>`
      *
      * **Initial value**: `none`
      */
    var WebkitBackdropFilter: js.UndefOr[BackdropFilterProperty] = js.native
    
    /**
      * The **`backface-visibility`** CSS property sets whether the back face of an element is visible when turned towards the user.
      *
      * **Syntax**: `visible | hidden`
      *
      * **Initial value**: `visible`
      */
    var WebkitBackfaceVisibility: js.UndefOr[BackfaceVisibilityProperty] = js.native
    
    /**
      * The **`background-clip`** CSS property sets whether an element's background `<color>` or `<image>` extends underneath its border.
      *
      * **Syntax**: `<box>#`
      *
      * **Initial value**: `border-box`
      */
    var WebkitBackgroundClip: js.UndefOr[BackgroundClipProperty] = js.native
    
    /**
      * The **`background-origin`** CSS property sets the _background positioning area_. In other words, it sets the origin position of an image set with the `background-image` property.
      *
      * **Syntax**: `<box>#`
      *
      * **Initial value**: `padding-box`
      */
    var WebkitBackgroundOrigin: js.UndefOr[BackgroundOriginProperty] = js.native
    
    /**
      * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
      *
      * **Syntax**: `<bg-size>#`
      *
      * **Initial value**: `auto auto`
      */
    var WebkitBackgroundSize: js.UndefOr[BackgroundSizeProperty[String | Double]] = js.native
    
    /**
      * The **`-webkit-border-before`** CSS property is a shorthand property for setting the individual logical block start border property values in a single place in the style sheet.
      *
      * **Syntax**: `<'border-width'> || <'border-style'> || <'color'>`
      */
    var WebkitBorderBefore: js.UndefOr[WebkitBorderBeforeProperty[String | Double]] = js.native
    
    /**
      * **Syntax**: `<'color'>`
      *
      * **Initial value**: `currentcolor`
      */
    var WebkitBorderBeforeColor: js.UndefOr[WebkitBorderBeforeColorProperty] = js.native
    
    /**
      * **Syntax**: `<'border-style'>`
      *
      * **Initial value**: `none`
      */
    var WebkitBorderBeforeStyle: js.UndefOr[WebkitBorderBeforeStyleProperty] = js.native
    
    /**
      * **Syntax**: `<'border-width'>`
      *
      * **Initial value**: `medium`
      */
    var WebkitBorderBeforeWidth: js.UndefOr[WebkitBorderBeforeWidthProperty[String | Double]] = js.native
    
    /**
      * The **`border-bottom-left-radius`** CSS property rounds the bottom-left corner of an element.
      *
      * **Syntax**: `<length-percentage>{1,2}`
      *
      * **Initial value**: `0`
      */
    var WebkitBorderBottomLeftRadius: js.UndefOr[BorderBottomLeftRadiusProperty[String | Double]] = js.native
    
    /**
      * The **`border-bottom-right-radius`** CSS property rounds the bottom-right corner of an element.
      *
      * **Syntax**: `<length-percentage>{1,2}`
      *
      * **Initial value**: `0`
      */
    var WebkitBorderBottomRightRadius: js.UndefOr[BorderBottomRightRadiusProperty[String | Double]] = js.native
    
    /**
      * The **`border-image`** CSS property draws an image in place of an element's `border-style`.
      *
      * **Syntax**: `<'border-image-source'> || <'border-image-slice'> [ / <'border-image-width'> | / <'border-image-width'>? / <'border-image-outset'> ]? || <'border-image-repeat'>`
      */
    var WebkitBorderImage: js.UndefOr[BorderImageProperty] = js.native
    
    /**
      * The **`border-image-slice`** CSS property divides the image specified by `border-image-source` into regions. These regions form the components of an element's border image.
      *
      * **Syntax**: `<number-percentage>{1,4} && fill?`
      *
      * **Initial value**: `100%`
      */
    var WebkitBorderImageSlice: js.UndefOr[BorderImageSliceProperty] = js.native
    
    /**
      * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
      *
      * **Syntax**: `<length-percentage>{1,4} [ / <length-percentage>{1,4} ]?`
      */
    var WebkitBorderRadius: js.UndefOr[BorderRadiusProperty[String | Double]] = js.native
    
    /**
      * The **`border-top-left-radius`** CSS property rounds the top-left corner of an element.
      *
      * **Syntax**: `<length-percentage>{1,2}`
      *
      * **Initial value**: `0`
      */
    var WebkitBorderTopLeftRadius: js.UndefOr[BorderTopLeftRadiusProperty[String | Double]] = js.native
    
    /**
      * The **`border-top-right-radius`** CSS property rounds the top-right corner of an element.
      *
      * **Syntax**: `<length-percentage>{1,2}`
      *
      * **Initial value**: `0`
      */
    var WebkitBorderTopRightRadius: js.UndefOr[BorderTopRightRadiusProperty[String | Double]] = js.native
    
    /**
      * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
      *
      * **Syntax**: `start | center | end | baseline | stretch`
      *
      * **Initial value**: `stretch`
      *
      * @deprecated
      */
    var WebkitBoxAlign: js.UndefOr[BoxAlignProperty] = js.native
    
    /**
      * The **`box-decoration-break`** CSS property specifies how an element's fragments should be rendered when broken across multiple lines, columns, or pages.
      *
      * **Syntax**: `slice | clone`
      *
      * **Initial value**: `slice`
      */
    var WebkitBoxDecorationBreak: js.UndefOr[BoxDecorationBreakProperty] = js.native
    
    /**
      * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
      *
      * **Syntax**: `normal | reverse | inherit`
      *
      * **Initial value**: `normal`
      *
      * @deprecated
      */
    var WebkitBoxDirection: js.UndefOr[BoxDirectionProperty] = js.native
    
    /**
      * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
      *
      * **Syntax**: `<number>`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var WebkitBoxFlex: js.UndefOr[GlobalsNumber] = js.native
    
    /**
      * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
      *
      * **Syntax**: `<integer>`
      *
      * **Initial value**: `1`
      *
      * @deprecated
      */
    var WebkitBoxFlexGroup: js.UndefOr[GlobalsNumber] = js.native
    
    /**
      * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
      *
      * **Syntax**: `single | multiple`
      *
      * **Initial value**: `single`
      *
      * @deprecated
      */
    var WebkitBoxLines: js.UndefOr[BoxLinesProperty] = js.native
    
    /**
      * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
      *
      * **Syntax**: `<integer>`
      *
      * **Initial value**: `1`
      *
      * @deprecated
      */
    var WebkitBoxOrdinalGroup: js.UndefOr[GlobalsNumber] = js.native
    
    /**
      * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
      *
      * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
      *
      * **Initial value**: `inline-axis` (`horizontal` in XUL)
      *
      * @deprecated
      */
    var WebkitBoxOrient: js.UndefOr[BoxOrientProperty] = js.native
    
    /**
      * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
      *
      * **Syntax**: `start | center | end | justify`
      *
      * **Initial value**: `start`
      *
      * @deprecated
      */
    var WebkitBoxPack: js.UndefOr[BoxPackProperty] = js.native
    
    /**
      * The **`-webkit-box-reflect`** CSS property lets you reflect the content of an element in one specific direction.
      *
      * **Syntax**: `[ above | below | right | left ]? <length>? <image>?`
      *
      * **Initial value**: `none`
      */
    var WebkitBoxReflect: js.UndefOr[WebkitBoxReflectProperty[String | Double]] = js.native
    
    /**
      * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii, and color.
      *
      * **Syntax**: `none | <shadow>#`
      *
      * **Initial value**: `none`
      */
    var WebkitBoxShadow: js.UndefOr[BoxShadowProperty] = js.native
    
    /**
      * The **`box-sizing`** CSS property defines how the user agent should calculate the total width and height of an element.
      *
      * **Syntax**: `content-box | border-box`
      *
      * **Initial value**: `content-box`
      */
    var WebkitBoxSizing: js.UndefOr[BoxSizingProperty] = js.native
    
    /**
      * The `**clip-path**` CSS property creates a clipping region that sets what part of an element should be shown. Parts that are inside the region are shown, while those outside are hidden.
      *
      * **Syntax**: `<clip-source> | [ <basic-shape> || <geometry-box> ] | none`
      *
      * **Initial value**: `none`
      */
    var WebkitClipPath: js.UndefOr[ClipPathProperty] = js.native
    
    /**
      * The **`column-count`** CSS property breaks an element's content into the specified number of columns.
      *
      * **Syntax**: `<integer> | auto`
      *
      * **Initial value**: `auto`
      */
    var WebkitColumnCount: js.UndefOr[ColumnCountProperty] = js.native
    
    /**
      * The **`column-fill`** CSS property controls how an element's contents are balanced when broken into columns.
      *
      * **Syntax**: `auto | balance | balance-all`
      *
      * **Initial value**: `balance`
      */
    var WebkitColumnFill: js.UndefOr[ColumnFillProperty] = js.native
    
    /**
      * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
      *
      * **Syntax**: `normal | <length-percentage>`
      *
      * **Initial value**: `normal`
      */
    var WebkitColumnGap: js.UndefOr[ColumnGapProperty[String | Double]] = js.native
    
    /**
      * The **`column-rule`** CSS property sets the width, style, and color of the rule (line) drawn between columns in a multi-column layout.
      *
      * **Syntax**: `<'column-rule-width'> || <'column-rule-style'> || <'column-rule-color'>`
      */
    var WebkitColumnRule: js.UndefOr[ColumnRuleProperty[String | Double]] = js.native
    
    /**
      * The **`column-rule-color`** CSS property sets the color of the rule (line) drawn between columns in a multi-column layout.
      *
      * **Syntax**: `<color>`
      *
      * **Initial value**: `currentcolor`
      */
    var WebkitColumnRuleColor: js.UndefOr[ColumnRuleColorProperty] = js.native
    
    /**
      * The **`column-rule-style`** CSS property sets the style of the line drawn between columns in a multi-column layout.
      *
      * **Syntax**: `<'border-style'>`
      *
      * **Initial value**: `none`
      */
    var WebkitColumnRuleStyle: js.UndefOr[ColumnRuleStyleProperty] = js.native
    
    /**
      * The **`column-rule-width`** CSS property sets the width of the rule (line) drawn between columns in a multi-column layout.
      *
      * **Syntax**: `<'border-width'>`
      *
      * **Initial value**: `medium`
      */
    var WebkitColumnRuleWidth: js.UndefOr[ColumnRuleWidthProperty[String | Double]] = js.native
    
    /**
      * The **`column-span`** CSS property makes it possible for an element to span across all columns when its value is set to `all`.
      *
      * **Syntax**: `none | all`
      *
      * **Initial value**: `none`
      */
    var WebkitColumnSpan: js.UndefOr[ColumnSpanProperty] = js.native
    
    /**
      * The **`column-width`** CSS property specifies the ideal column width in a multi-column layout. The container will have as many columns as can fit without any of them having a width less than the `column-width` value. If the width of the container is narrower than the specified value, the single column's width will be smaller than the declared column width.
      *
      * **Syntax**: `<length> | auto`
      *
      * **Initial value**: `auto`
      */
    var WebkitColumnWidth: js.UndefOr[ColumnWidthProperty[String | Double]] = js.native
    
    /**
      * The **`columns`** CSS property sets the column width and column count of an element.
      *
      * **Syntax**: `<'column-width'> || <'column-count'>`
      */
    var WebkitColumns: js.UndefOr[ColumnsProperty[String | Double]] = js.native
    
    /**
      * The **`filter`** CSS property applies graphical effects like blur or color shift to an element. Filters are commonly used to adjust the rendering of images, backgrounds, and borders.
      *
      * **Syntax**: `none | <filter-function-list>`
      *
      * **Initial value**: `none`
      */
    var WebkitFilter: js.UndefOr[FilterProperty] = js.native
    
    /**
      * The **`flex`** CSS property sets how a flex item will grow or shrink to fit the space available in its flex container. It is a shorthand for `flex-grow`, `flex-shrink`, and `flex-basis`.
      *
      * **Syntax**: `none | [ <'flex-grow'> <'flex-shrink'>? || <'flex-basis'> ]`
      */
    var WebkitFlex: js.UndefOr[FlexProperty[String | Double]] = js.native
    
    /**
      * The **`flex-basis`** CSS property sets the initial main size of a flex item. It sets the size of the content box unless otherwise set with `box-sizing`.
      *
      * **Syntax**: `content | <'width'>`
      *
      * **Initial value**: `auto`
      */
    var WebkitFlexBasis: js.UndefOr[FlexBasisProperty[String | Double]] = js.native
    
    /**
      * The **`flex-direction`** CSS property sets how flex items are placed in the flex container defining the main axis and the direction (normal or reversed).
      *
      * **Syntax**: `row | row-reverse | column | column-reverse`
      *
      * **Initial value**: `row`
      */
    var WebkitFlexDirection: js.UndefOr[FlexDirectionProperty] = js.native
    
    /**
      * The **`flex-flow`** CSS property is a shorthand property for `flex-direction` and `flex-wrap` properties.
      *
      * **Syntax**: `<'flex-direction'> || <'flex-wrap'>`
      */
    var WebkitFlexFlow: js.UndefOr[FlexFlowProperty] = js.native
    
    /**
      * The **`flex-grow`** CSS property sets how much of the available space in the flex container should be assigned to that item (the flex grow factor). If all sibling items have the same flex grow factor, then all items will receive the same share of available space, otherwise it is distributed according to the ratio defined by the different flex grow factors.
      *
      * **Syntax**: `<number>`
      *
      * **Initial value**: `0`
      */
    var WebkitFlexGrow: js.UndefOr[GlobalsNumber] = js.native
    
    /**
      * The **`flex-shrink`** CSS property sets the flex shrink factor of a flex item. If the size of flex items is larger than the flex container, items shrink to fit according to `flex-shrink`.
      *
      * **Syntax**: `<number>`
      *
      * **Initial value**: `1`
      */
    var WebkitFlexShrink: js.UndefOr[GlobalsNumber] = js.native
    
    /**
      * The **`flex-wrap`** CSS property sets whether flex items are forced onto one line or can wrap onto multiple lines. If wrapping is allowed, it sets the direction that lines are stacked.
      *
      * **Syntax**: `nowrap | wrap | wrap-reverse`
      *
      * **Initial value**: `nowrap`
      */
    var WebkitFlexWrap: js.UndefOr[FlexWrapProperty] = js.native
    
    /**
      * The **`font-feature-settings`** CSS property controls advanced typographic features in OpenType fonts.
      *
      * **Syntax**: `normal | <feature-tag-value>#`
      *
      * **Initial value**: `normal`
      */
    var WebkitFontFeatureSettings: js.UndefOr[FontFeatureSettingsProperty] = js.native
    
    /**
      * The **`font-kerning`** CSS property sets the use of the kerning information stored in a font.
      *
      * **Syntax**: `auto | normal | none`
      *
      * **Initial value**: `auto`
      */
    var WebkitFontKerning: js.UndefOr[FontKerningProperty] = js.native
    
    /**
      * The **`font-smooth`** CSS property controls the application of anti-aliasing when fonts are rendered.
      *
      * **Syntax**: `auto | never | always | <absolute-size> | <length>`
      *
      * **Initial value**: `auto`
      */
    var WebkitFontSmoothing: js.UndefOr[FontSmoothProperty[String | Double]] = js.native
    
    /**
      * The **`font-variant-ligatures`** CSS property controls which ligatures and contextual forms are used in textual content of the elements it applies to. This leads to more harmonized forms in the resulting text.
      *
      * **Syntax**: `normal | none | [ <common-lig-values> || <discretionary-lig-values> || <historical-lig-values> || <contextual-alt-values> ]`
      *
      * **Initial value**: `normal`
      */
    var WebkitFontVariantLigatures: js.UndefOr[FontVariantLigaturesProperty] = js.native
    
    /**
      * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. You can prevent hyphenation entirely, use hyphenation in manually-specified points within the text, or let the browser automatically insert hyphens where appropriate.
      *
      * **Syntax**: `none | manual | auto`
      *
      * **Initial value**: `manual`
      */
    var WebkitHyphens: js.UndefOr[HyphensProperty] = js.native
    
    /**
      * The CSS **`justify-content`** property defines how the browser distributes space between and around content items along the main-axis of a flex container, and the inline axis of a grid container.
      *
      * **Syntax**: `normal | <content-distribution> | <overflow-position>? [ <content-position> | left | right ]`
      *
      * **Initial value**: `normal`
      */
    var WebkitJustifyContent: js.UndefOr[JustifyContentProperty] = js.native
    
    /**
      * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
      *
      * **Syntax**: `auto | loose | normal | strict | anywhere`
      *
      * **Initial value**: `auto`
      */
    var WebkitLineBreak: js.UndefOr[LineBreakProperty] = js.native
    
    /**
      * The **`-webkit-line-clamp`** CSS property allows limiting of the contents of a block container to the specified number of lines.
      *
      * **Syntax**: `none | <integer>`
      *
      * **Initial value**: `none`
      */
    var WebkitLineClamp: js.UndefOr[WebkitLineClampProperty] = js.native
    
    /**
      * The **`margin-inline-end`** CSS property defines the logical inline end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. In other words, it corresponds to the `margin-top`, `margin-right`, `margin-bottom` or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'margin-left'>`
      *
      * **Initial value**: `0`
      */
    var WebkitMarginEnd: js.UndefOr[MarginInlineEndProperty[String | Double]] = js.native
    
    /**
      * The **`margin-inline-start`** CSS property defines the logical inline start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. It corresponds to the `margin-top`, `margin-right`, `margin-bottom`, or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'margin-left'>`
      *
      * **Initial value**: `0`
      */
    var WebkitMarginStart: js.UndefOr[MarginInlineStartProperty[String | Double]] = js.native
    
    /**
      * The **`mask`** CSS property hides an element (partially or fully) by masking or clipping the image at specific points.
      *
      * **Syntax**: `[ <mask-reference> || <position> [ / <bg-size> ]? || <repeat-style> || [ <box> | border | padding | content | text ] || [ <box> | border | padding | content ] ]#`
      */
    var WebkitMask: js.UndefOr[WebkitMaskProperty[String | Double]] = js.native
    
    /**
      * If a `-webkit-mask-image` is specified, `-webkit-mask-attachment` determines whether the mask image's position is fixed within the viewport, or scrolls along with its containing block.
      *
      * **Syntax**: `<attachment>#`
      *
      * **Initial value**: `scroll`
      */
    var WebkitMaskAttachment: js.UndefOr[WebkitMaskAttachmentProperty] = js.native
    
    /**
      * The **`mask-clip`** CSS property determines the area, which is affected by a mask. The painted content of an element must be restricted to this area.
      *
      * **Syntax**: `[ <box> | border | padding | content | text ]#`
      *
      * **Initial value**: `border`
      */
    var WebkitMaskClip: js.UndefOr[WebkitMaskClipProperty] = js.native
    
    /**
      * The **`-webkit-mask-composite`** property specifies the manner in which multiple mask images applied to the same element are composited with one another. Mask images are composited in the opposite order that they are declared with the `-webkit-mask-image` property.
      *
      * **Syntax**: `<composite-style>#`
      *
      * **Initial value**: `source-over`
      */
    var WebkitMaskComposite: js.UndefOr[WebkitMaskCompositeProperty] = js.native
    
    /**
      * The **`mask-image`** CSS property sets the image that is used as mask layer for an element.
      *
      * **Syntax**: `<mask-reference>#`
      *
      * **Initial value**: `none`
      */
    var WebkitMaskImage: js.UndefOr[WebkitMaskImageProperty] = js.native
    
    /**
      * The **`mask-origin`** CSS property sets the origin of a mask.
      *
      * **Syntax**: `[ <box> | border | padding | content ]#`
      *
      * **Initial value**: `padding`
      */
    var WebkitMaskOrigin: js.UndefOr[WebkitMaskOriginProperty] = js.native
    
    /**
      * The **`mask-position`** CSS property sets the initial position, relative to the mask position layer set by `mask-origin`, for each defined mask image.
      *
      * **Syntax**: `<position>#`
      *
      * **Initial value**: `0% 0%`
      */
    var WebkitMaskPosition: js.UndefOr[WebkitMaskPositionProperty[String | Double]] = js.native
    
    /**
      * The `-webkit-mask-position-x` CSS property sets the initial horizontal position of a mask image.
      *
      * **Syntax**: `[ <length-percentage> | left | center | right ]#`
      *
      * **Initial value**: `0%`
      */
    var WebkitMaskPositionX: js.UndefOr[WebkitMaskPositionXProperty[String | Double]] = js.native
    
    /**
      * The `-webkit-mask-position-y` CSS property sets the initial vertical position of a mask image.
      *
      * **Syntax**: `[ <length-percentage> | top | center | bottom ]#`
      *
      * **Initial value**: `0%`
      */
    var WebkitMaskPositionY: js.UndefOr[WebkitMaskPositionYProperty[String | Double]] = js.native
    
    /**
      * The **`mask-repeat`** CSS property sets how mask images are repeated. A mask image can be repeated along the horizontal axis, the vertical axis, both axes, or not repeated at all.
      *
      * **Syntax**: `<repeat-style>#`
      *
      * **Initial value**: `repeat`
      */
    var WebkitMaskRepeat: js.UndefOr[WebkitMaskRepeatProperty] = js.native
    
    /**
      * The `-webkit-mask-repeat-x` property specifies whether and how a mask image is repeated (tiled) horizontally.
      *
      * **Syntax**: `repeat | no-repeat | space | round`
      *
      * **Initial value**: `repeat`
      */
    var WebkitMaskRepeatX: js.UndefOr[WebkitMaskRepeatXProperty] = js.native
    
    /**
      * The `-webkit-mask-repeat-y` property sets whether and how a mask image is repeated (tiled) vertically.
      *
      * **Syntax**: `repeat | no-repeat | space | round`
      *
      * **Initial value**: `repeat`
      */
    var WebkitMaskRepeatY: js.UndefOr[WebkitMaskRepeatYProperty] = js.native
    
    /**
      * The **`mask-size`** CSS property specifies the sizes of the mask images. The size of the image can be fully or partially constrained in order to preserve its intrinsic ratio.
      *
      * **Syntax**: `<bg-size>#`
      *
      * **Initial value**: `auto auto`
      */
    var WebkitMaskSize: js.UndefOr[WebkitMaskSizeProperty[String | Double]] = js.native
    
    /**
      * The **`max-inline-size`** CSS property defines the horizontal or vertical maximum size of an element's block depending on its writing mode. It corresponds to the `max-width` or the `max-height` property depending on the value defined for `writing-mode`. If the writing mode is vertically oriented, the value of `max-inline-size` relates to the maximal height of the element, otherwise it relates to the maximal width of the element. It relates to `max-block-size`, which defines the other dimension of the element.
      *
      * **Syntax**: `<'max-width'>`
      *
      * **Initial value**: `0`
      */
    var WebkitMaxInlineSize: js.UndefOr[MaxInlineSizeProperty[String | Double]] = js.native
    
    /**
      * The **`order`** CSS property sets the order to lay out an item in a flex or grid container. Items in a container are sorted by ascending `order` value and then by their source code order.
      *
      * **Syntax**: `<integer>`
      *
      * **Initial value**: `0`
      */
    var WebkitOrder: js.UndefOr[GlobalsNumber] = js.native
    
    /**
      * The `-webkit-overflow-scrolling` CSS property controls whether or not touch devices use momentum-based scrolling for a given element.
      *
      * **Syntax**: `auto | touch`
      *
      * **Initial value**: `auto`
      */
    var WebkitOverflowScrolling: js.UndefOr[WebkitOverflowScrollingProperty] = js.native
    
    /**
      * The **`padding-inline-end`** CSS property defines the logical inline end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'padding-left'>`
      *
      * **Initial value**: `0`
      */
    var WebkitPaddingEnd: js.UndefOr[PaddingInlineEndProperty[String | Double]] = js.native
    
    /**
      * The **`padding-inline-start`** CSS property defines the logical inline start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'padding-left'>`
      *
      * **Initial value**: `0`
      */
    var WebkitPaddingStart: js.UndefOr[PaddingInlineStartProperty[String | Double]] = js.native
    
    /**
      * The **`perspective`** CSS property determines the distance between the z=0 plane and the user in order to give a 3D-positioned element some perspective. Each 3D element with z>0 becomes larger; each 3D-element with z<0 becomes smaller. The strength of the effect is determined by the value of this property.
      *
      * **Syntax**: `none | <length>`
      *
      * **Initial value**: `none`
      */
    var WebkitPerspective: js.UndefOr[PerspectiveProperty[String | Double]] = js.native
    
    /**
      * The **`perspective-origin`** CSS property determines the position at which the viewer is looking. It is used as the _vanishing point_ by the `perspective` property.
      *
      * **Syntax**: `<position>`
      *
      * **Initial value**: `50% 50%`
      */
    var WebkitPerspectiveOrigin: js.UndefOr[PerspectiveOriginProperty[String | Double]] = js.native
    
    /**
      * The **`color-adjust`** CSS property sets what, if anything, the user agent may do to optimize the appearance of the element on the output device. By default, the browser is allowed to make any adjustments to the element's appearance it determines to be necessary and prudent given the type and capabilities of the output device.
      *
      * **Syntax**: `economy | exact`
      *
      * **Initial value**: `economy`
      */
    var WebkitPrintColorAdjust: js.UndefOr[ColorAdjustProperty] = js.native
    
    /**
      * The `**ruby-position**` CSS property defines the position of a ruby element relatives to its base element. It can be position over the element (`over`), under it (`under`), or between the characters, on their right side (`inter-character`).
      *
      * **Syntax**: `over | under | inter-character`
      *
      * **Initial value**: `over`
      */
    var WebkitRubyPosition: js.UndefOr[RubyPositionProperty] = js.native
    
    /**
      * The **`scroll-snap-points-x`** CSS property defines the horizontal positioning of snap points within the content of the scroll container they are applied to.
      *
      * **Syntax**: `none | repeat( <length-percentage> )`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var WebkitScrollSnapPointsX: js.UndefOr[ScrollSnapPointsXProperty] = js.native
    
    /**
      * The **`scroll-snap-points-y`** CSS property defines the vertical positioning of snap points within the content of the scroll container they are applied to.
      *
      * **Syntax**: `none | repeat( <length-percentage> )`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var WebkitScrollSnapPointsY: js.UndefOr[ScrollSnapPointsYProperty] = js.native
    
    /**
      * The **`scroll-snap-type`** CSS property sets how strictly snap points are enforced on the scroll container in case there is one.
      *
      * **Syntax**: `none | [ x | y | block | inline | both ] [ mandatory | proximity ]?`
      *
      * **Initial value**: `none`
      */
    var WebkitScrollSnapType: js.UndefOr[ScrollSnapTypeProperty] = js.native
    
    /**
      * The **`shape-margin`** CSS property sets a margin for a CSS shape created using `shape-outside`.
      *
      * **Syntax**: `<length-percentage>`
      *
      * **Initial value**: `0`
      */
    var WebkitShapeMargin: js.UndefOr[ShapeMarginProperty[String | Double]] = js.native
    
    /**
      * **`-webkit-tap-highlight-color`** is a non-standard CSS property that sets the color of the highlight that appears over a link while it's being tapped. The highlighting indicates to the user that their tap is being successfully recognized, and indicates which element they're tapping on.
      *
      * **Syntax**: `<color>`
      *
      * **Initial value**: `black`
      */
    var WebkitTapHighlightColor: js.UndefOr[WebkitTapHighlightColorProperty] = js.native
    
    /**
      * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
      *
      * **Syntax**: `none | all | [ digits <integer>? ]`
      *
      * **Initial value**: `none`
      */
    var WebkitTextCombine: js.UndefOr[TextCombineUprightProperty] = js.native
    
    /**
      * The **`text-decoration-color`** CSS property sets the color of decorations added to text by `text-decoration-line`.
      *
      * **Syntax**: `<color>`
      *
      * **Initial value**: `currentcolor`
      */
    var WebkitTextDecorationColor: js.UndefOr[TextDecorationColorProperty] = js.native
    
    /**
      * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element, such as an underline or overline.
      *
      * **Syntax**: `none | [ underline || overline || line-through || blink ] | spelling-error | grammar-error`
      *
      * **Initial value**: `none`
      */
    var WebkitTextDecorationLine: js.UndefOr[TextDecorationLineProperty] = js.native
    
    /**
      * The **`text-decoration-skip`** CSS property sets what parts of an element’s content any text decoration affecting the element must skip over. It controls all text decoration lines drawn by the element and also any text decoration lines drawn by its ancestors.
      *
      * **Syntax**: `none | [ objects || [ spaces | [ leading-spaces || trailing-spaces ] ] || edges || box-decoration ]`
      *
      * **Initial value**: `objects`
      */
    var WebkitTextDecorationSkip: js.UndefOr[TextDecorationSkipProperty] = js.native
    
    /**
      * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are set with `text-decoration-line`.
      *
      * **Syntax**: `solid | double | dotted | dashed | wavy`
      *
      * **Initial value**: `solid`
      */
    var WebkitTextDecorationStyle: js.UndefOr[TextDecorationStyleProperty] = js.native
    
    /**
      * The **`text-emphasis`** CSS property applies emphasis marks to text (except spaces and control characters). It is a shorthand for `text-emphasis-style` and `text-emphasis-color`.
      *
      * **Syntax**: `<'text-emphasis-style'> || <'text-emphasis-color'>`
      */
    var WebkitTextEmphasis: js.UndefOr[TextEmphasisProperty] = js.native
    
    /**
      * The **`text-emphasis-color`** CSS property sets the color of emphasis marks. This value can also be set using the `text-emphasis` shorthand.
      *
      * **Syntax**: `<color>`
      *
      * **Initial value**: `currentcolor`
      */
    var WebkitTextEmphasisColor: js.UndefOr[TextEmphasisColorProperty] = js.native
    
    /**
      * The **`text-emphasis-position`** CSS property sets where emphasis marks are drawn. Like ruby text, if there isn't enough room for emphasis marks, the line height is increased.
      *
      * **Syntax**: `[ over | under ] && [ right | left ]`
      *
      * **Initial value**: `over right`
      */
    var WebkitTextEmphasisPosition: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The **`text-emphasis-style`** CSS property sets the appearance of emphasis marks. It can also be set, and reset, using the `text-emphasis` shorthand.
      *
      * **Syntax**: `none | [ [ filled | open ] || [ dot | circle | double-circle | triangle | sesame ] ] | <string>`
      *
      * **Initial value**: `none`
      */
    var WebkitTextEmphasisStyle: js.UndefOr[TextEmphasisStyleProperty] = js.native
    
    /**
      * The **`-webkit-text-fill-color`** CSS property specifies the fill color of characters of text. If this property is not set, the value of the `color` property is used.
      *
      * **Syntax**: `<color>`
      *
      * **Initial value**: `currentcolor`
      */
    var WebkitTextFillColor: js.UndefOr[WebkitTextFillColorProperty] = js.native
    
    /**
      * The **`text-orientation`** CSS property sets the orientation of the text characters in a line. It only affects text in vertical mode (when `writing-mode` is not `horizontal-tb`). It is useful for controlling the display of languages that use vertical script, and also for making vertical table headers.
      *
      * **Syntax**: `mixed | upright | sideways`
      *
      * **Initial value**: `mixed`
      */
    var WebkitTextOrientation: js.UndefOr[TextOrientationProperty] = js.native
    
    /**
      * The **`text-size-adjust`** CSS property controls the text inflation algorithm used on some smartphones and tablets. Other browsers will ignore this property.
      *
      * **Syntax**: `none | auto | <percentage>`
      *
      * **Initial value**: `auto` for smartphone browsers supporting inflation, `none` in other cases (and then not modifiable).
      */
    var WebkitTextSizeAdjust: js.UndefOr[TextSizeAdjustProperty] = js.native
    
    /**
      * The **`-webkit-text-stroke`** CSS property specifies the width and color of strokes for text characters. This is a shorthand property for the longhand properties `-webkit-text-stroke-width` and `-webkit-text-stroke-color`.
      *
      * **Syntax**: `<length> || <color>`
      */
    var WebkitTextStroke: js.UndefOr[WebkitTextStrokeProperty[String | Double]] = js.native
    
    /**
      * The **`-webkit-text-stroke-color`** CSS property specifies the stroke color of characters of text. If this property is not set, the value of the `color` property is used.
      *
      * **Syntax**: `<color>`
      *
      * **Initial value**: `currentcolor`
      */
    var WebkitTextStrokeColor: js.UndefOr[WebkitTextStrokeColorProperty] = js.native
    
    /**
      * The **`-webkit-text-stroke-width`** CSS property specifies the width of the stroke for text.
      *
      * **Syntax**: `<length>`
      *
      * **Initial value**: `0`
      */
    var WebkitTextStrokeWidth: js.UndefOr[WebkitTextStrokeWidthProperty[String | Double]] = js.native
    
    /**
      * The **`text-underline-position`** CSS property specifies the position of the underline which is set using the `text-decoration` property's `underline` value.
      *
      * **Syntax**: `auto | from-font | [ under || [ left | right ] ]`
      *
      * **Initial value**: `auto`
      */
    var WebkitTextUnderlinePosition: js.UndefOr[TextUnderlinePositionProperty] = js.native
    
    /**
      * The `-webkit-touch-callout` CSS property controls the display of the default callout shown when you touch and hold a touch target.
      *
      * **Syntax**: `default | none`
      *
      * **Initial value**: `default`
      */
    var WebkitTouchCallout: js.UndefOr[WebkitTouchCalloutProperty] = js.native
    
    /**
      * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
      *
      * **Syntax**: `none | <transform-list>`
      *
      * **Initial value**: `none`
      */
    var WebkitTransform: js.UndefOr[TransformProperty] = js.native
    
    /**
      * The **`transform-origin`** CSS property sets the origin for an element's transformations.
      *
      * **Syntax**: `[ <length-percentage> | left | center | right | top | bottom ] | [ [ <length-percentage> | left | center | right ] && [ <length-percentage> | top | center | bottom ] ] <length>?`
      *
      * **Initial value**: `50% 50% 0`
      */
    var WebkitTransformOrigin: js.UndefOr[TransformOriginProperty[String | Double]] = js.native
    
    /**
      * The **`transform-style`** CSS property sets whether children of an element are positioned in the 3D space or are flattened in the plane of the element.
      *
      * **Syntax**: `flat | preserve-3d`
      *
      * **Initial value**: `flat`
      */
    var WebkitTransformStyle: js.UndefOr[TransformStyleProperty] = js.native
    
    /**
      * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
      *
      * **Syntax**: `<single-transition>#`
      */
    var WebkitTransition: js.UndefOr[TransitionProperty] = js.native
    
    /**
      * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
      *
      * **Syntax**: `<time>#`
      *
      * **Initial value**: `0s`
      */
    var WebkitTransitionDelay: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
      *
      * **Syntax**: `<time>#`
      *
      * **Initial value**: `0s`
      */
    var WebkitTransitionDuration: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
      *
      * **Syntax**: `none | <single-transition-property>#`
      *
      * **Initial value**: all
      */
    var WebkitTransitionProperty: js.UndefOr[TransitionPropertyProperty] = js.native
    
    /**
      * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
      *
      * **Syntax**: `<timing-function>#`
      *
      * **Initial value**: `ease`
      */
    var WebkitTransitionTimingFunction: js.UndefOr[TransitionTimingFunctionProperty] = js.native
    
    /**
      * **Syntax**: `read-only | read-write | read-write-plaintext-only`
      *
      * **Initial value**: `read-only`
      */
    var WebkitUserModify: js.UndefOr[WebkitUserModifyProperty] = js.native
    
    /**
      * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
      *
      * **Syntax**: `auto | text | none | contain | all`
      *
      * **Initial value**: `auto`
      */
    var WebkitUserSelect: js.UndefOr[UserSelectProperty] = js.native
    
    /**
      * The **`writing-mode`** CSS property sets whether lines of text are laid out horizontally or vertically, as well as the direction in which blocks progress.
      *
      * **Syntax**: `horizontal-tb | vertical-rl | vertical-lr | sideways-rl | sideways-lr`
      *
      * **Initial value**: `horizontal-tb`
      */
    var WebkitWritingMode: js.UndefOr[WritingModeProperty] = js.native
    
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
    var alignContent: js.UndefOr[AlignContentProperty] = js.native
    
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
    var alignItems: js.UndefOr[AlignItemsProperty] = js.native
    
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
    var alignSelf: js.UndefOr[AlignSelfProperty] = js.native
    
    /**
      * The **`align-tracks`** CSS property sets the alignment in the masonry axis for grid containers that have masonry in their block axis.
      *
      * **Syntax**: `[ normal | <baseline-position> | <content-distribution> | <overflow-position>? <content-position> ]#`
      *
      * **Initial value**: `normal`
      */
    var alignTracks: js.UndefOr[AlignTracksProperty] = js.native
    
    var alignmentBaseline: js.UndefOr[AlignmentBaselineProperty] = js.native
    
    /**
      * The `**all**` CSS shorthand property sets all of an element's properties (other than `unicode-bidi` and `direction`) to their initial or inherited values, or to the values specified in another stylesheet origin.
      *
      * **Syntax**: `initial | inherit | unset | revert`
      *
      * **Initial value**: There is no practical initial value for it.
      *
      * | Chrome | Firefox | Safari  |  Edge  | IE  |
      * | :----: | :-----: | :-----: | :----: | :-: |
      * | **37** | **27**  | **9.1** | **79** | No  |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/all
      */
    var all: js.UndefOr[Globals] = js.native
    
    /**
      * The **`animation`** shorthand CSS property sets an animated transition between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
      *
      * **Syntax**: `<single-animation>#`
      *
      * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
      * | :-----: | :-----: | :-----: | :----: | :----: |
      * | **43**  | **16**  |  **9**  | **12** | **10** |
      * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/animation
      */
    var animation: js.UndefOr[AnimationProperty] = js.native
    
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
    var animationDelay: js.UndefOr[GlobalsString] = js.native
    
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
    var animationDirection: js.UndefOr[AnimationDirectionProperty] = js.native
    
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
    var animationDuration: js.UndefOr[GlobalsString] = js.native
    
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
    var animationFillMode: js.UndefOr[AnimationFillModeProperty] = js.native
    
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
    var animationIterationCount: js.UndefOr[AnimationIterationCountProperty] = js.native
    
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
    var animationName: js.UndefOr[AnimationNameProperty] = js.native
    
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
    var animationPlayState: js.UndefOr[AnimationPlayStateProperty] = js.native
    
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
    var animationTimingFunction: js.UndefOr[AnimationTimingFunctionProperty] = js.native
    
    /**
      * The **`-moz-appearance`** CSS property is used in Gecko (Firefox) to display an element using platform-native styling based on the operating system's theme.
      *
      * **Syntax**: `none | auto | textfield | menulist-button | <compat-auto>`
      *
      * **Initial value**: `auto`
      *
      * | Chrome  | Firefox |   Safari    |   Edge   | IE  |
      * | :-----: | :-----: | :---------: | :------: | :-: |
      * | **84**  | **80**  | **3** _-x-_ |  **84**  | No  |
      * | 1 _-x-_ | 1 _-x-_ |             | 12 _-x-_ |     |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/appearance
      */
    var appearance: js.UndefOr[AppearanceProperty] = js.native
    
    /**
      * The **`aspect-ratio`**    CSS property sets a _**preferred aspect ratio**_ for the box, which will be used in the calculation of auto sizes and some other layout functions.
      *
      * **Syntax**: `auto | <ratio>`
      *
      * **Initial value**: `auto`
      *
      * | Chrome | Firefox | Safari | Edge | IE  |
      * | :----: | :-----: | :----: | :--: | :-: |
      * |  n/a   |   n/a   |   No   |  No  | No  |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/aspect-ratio
      */
    var aspectRatio: js.UndefOr[AspectRatioProperty] = js.native
    
    /**
      * In combination with `elevation`, the **`azimuth`** CSS property enables different audio sources to be positioned spatially for aural presentation. This is important in that it provides a natural way to tell several voices apart, as each can be positioned to originate at a different location on the sound stage. Stereo output produce a lateral sound stage, while binaural headphones and multi-speaker setups allow for a fully three-dimensional stage.
      *
      * **Syntax**: `<angle> | [ [ left-side | far-left | left | center-left | center | center-right | right | far-right | right-side ] || behind ] | leftwards | rightwards`
      *
      * **Initial value**: `center`
      *
      * @deprecated
      */
    var azimuth: js.UndefOr[AzimuthProperty] = js.native
    
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
    var backdropFilter: js.UndefOr[BackdropFilterProperty] = js.native
    
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
    var backfaceVisibility: js.UndefOr[BackfaceVisibilityProperty] = js.native
    
    /**
      * The **`background`** shorthand CSS property sets all background style properties at once, such as color, image, origin and size, or repeat method.
      *
      * **Syntax**: `[ <bg-layer> , ]* <final-bg-layer>`
      *
      * | Chrome | Firefox | Safari |  Edge  |  IE   |
      * | :----: | :-----: | :----: | :----: | :---: |
      * | **1**  |  **1**  | **1**  | **12** | **4** |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/background
      */
    var background: js.UndefOr[BackgroundProperty[String | Double]] = js.native
    
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
    var backgroundAttachment: js.UndefOr[BackgroundAttachmentProperty] = js.native
    
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
    var backgroundBlendMode: js.UndefOr[BackgroundBlendModeProperty] = js.native
    
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
    var backgroundClip: js.UndefOr[BackgroundClipProperty] = js.native
    
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
    var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.native
    
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
    var backgroundImage: js.UndefOr[BackgroundImageProperty] = js.native
    
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
    var backgroundOrigin: js.UndefOr[BackgroundOriginProperty] = js.native
    
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
    var backgroundPosition: js.UndefOr[BackgroundPositionProperty[String | Double]] = js.native
    
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
    var backgroundPositionX: js.UndefOr[BackgroundPositionXProperty[String | Double]] = js.native
    
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
    var backgroundPositionY: js.UndefOr[BackgroundPositionYProperty[String | Double]] = js.native
    
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
    var backgroundRepeat: js.UndefOr[BackgroundRepeatProperty] = js.native
    
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
    var backgroundSize: js.UndefOr[BackgroundSizeProperty[String | Double]] = js.native
    
    var baselineShift: js.UndefOr[BaselineShiftProperty[String | Double]] = js.native
    
    /**
      * **Syntax**: `clip | ellipsis | <string>`
      *
      * **Initial value**: `clip`
      */
    var blockOverflow: js.UndefOr[BlockOverflowProperty] = js.native
    
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
    var blockSize: js.UndefOr[BlockSizeProperty[String | Double]] = js.native
    
    /**
      * The **`border`** CSS property sets an element's border. It's a shorthand for `border-width`, `border-style`, and `border-color`.
      *
      * **Syntax**: `<line-width> || <line-style> || <color>`
      *
      * | Chrome | Firefox | Safari |  Edge  |  IE   |
      * | :----: | :-----: | :----: | :----: | :---: |
      * | **1**  |  **1**  | **1**  | **12** | **4** |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/border
      */
    var border: js.UndefOr[BorderProperty[String | Double]] = js.native
    
    /**
      * The **`border-block`** CSS property is a shorthand property for setting the individual logical block border property values in a single place in the style sheet.
      *
      * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <'color'>`
      *
      * | Chrome | Firefox | Safari |  Edge  | IE  |
      * | :----: | :-----: | :----: | :----: | :-: |
      * | **69** | **66**  |   No   | **79** | No  |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/border-block
      */
    var borderBlock: js.UndefOr[BorderBlockProperty[String | Double]] = js.native
    
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
    var borderBlockColor: js.UndefOr[BorderBlockColorProperty] = js.native
    
    /**
      * The **`border-block-end`** CSS property is a shorthand property for setting the individual logical block-end border property values in a single place in the style sheet.
      *
      * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <'color'>`
      *
      * | Chrome | Firefox |  Safari  |  Edge  | IE  |
      * | :----: | :-----: | :------: | :----: | :-: |
      * | **69** | **41**  | **12.1** | **79** | No  |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end
      */
    var borderBlockEnd: js.UndefOr[BorderBlockEndProperty[String | Double]] = js.native
    
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
    var borderBlockEndColor: js.UndefOr[BorderBlockEndColorProperty] = js.native
    
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
    var borderBlockEndStyle: js.UndefOr[BorderBlockEndStyleProperty] = js.native
    
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
    var borderBlockEndWidth: js.UndefOr[BorderBlockEndWidthProperty[String | Double]] = js.native
    
    /**
      * The **`border-block-start`** CSS property is a shorthand property for setting the individual logical block-start border property values in a single place in the style sheet.
      *
      * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <'color'>`
      *
      * | Chrome | Firefox |  Safari  |  Edge  | IE  |
      * | :----: | :-----: | :------: | :----: | :-: |
      * | **69** | **41**  | **12.1** | **79** | No  |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start
      */
    var borderBlockStart: js.UndefOr[BorderBlockStartProperty[String | Double]] = js.native
    
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
    var borderBlockStartColor: js.UndefOr[BorderBlockStartColorProperty] = js.native
    
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
    var borderBlockStartStyle: js.UndefOr[BorderBlockStartStyleProperty] = js.native
    
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
    var borderBlockStartWidth: js.UndefOr[BorderBlockStartWidthProperty[String | Double]] = js.native
    
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
    var borderBlockStyle: js.UndefOr[BorderBlockStyleProperty] = js.native
    
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
    var borderBlockWidth: js.UndefOr[BorderBlockWidthProperty[String | Double]] = js.native
    
    /**
      * The **`border-bottom`** CSS property is a shorthand that sets the values of `border-bottom-width`, `border-bottom-style` and `border-bottom-color`. These properties set an element's bottom border.
      *
      * **Syntax**: `<line-width> || <line-style> || <color>`
      *
      * | Chrome | Firefox | Safari |  Edge  |  IE   |
      * | :----: | :-----: | :----: | :----: | :---: |
      * | **1**  |  **1**  | **1**  | **12** | **4** |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom
      */
    var borderBottom: js.UndefOr[BorderBottomProperty[String | Double]] = js.native
    
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
    var borderBottomColor: js.UndefOr[BorderBottomColorProperty] = js.native
    
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
    var borderBottomLeftRadius: js.UndefOr[BorderBottomLeftRadiusProperty[String | Double]] = js.native
    
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
    var borderBottomRightRadius: js.UndefOr[BorderBottomRightRadiusProperty[String | Double]] = js.native
    
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
    var borderBottomStyle: js.UndefOr[BorderBottomStyleProperty] = js.native
    
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
    var borderBottomWidth: js.UndefOr[BorderBottomWidthProperty[String | Double]] = js.native
    
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
    var borderCollapse: js.UndefOr[BorderCollapseProperty] = js.native
    
    /**
      * The **`border-color`** shorthand CSS property sets the color of all sides of an element's border.
      *
      * **Syntax**: `<color>{1,4}`
      *
      * | Chrome | Firefox | Safari |  Edge  |  IE   |
      * | :----: | :-----: | :----: | :----: | :---: |
      * | **1**  |  **1**  | **1**  | **12** | **4** |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/border-color
      */
    var borderColor: js.UndefOr[BorderColorProperty] = js.native
    
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
    var borderEndEndRadius: js.UndefOr[BorderEndEndRadiusProperty[String | Double]] = js.native
    
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
    var borderEndStartRadius: js.UndefOr[BorderEndStartRadiusProperty[String | Double]] = js.native
    
    /**
      * The **`border-image`** CSS property draws an image in place of an element's `border-style`.
      *
      * **Syntax**: `<'border-image-source'> || <'border-image-slice'> [ / <'border-image-width'> | / <'border-image-width'>? / <'border-image-outset'> ]? || <'border-image-repeat'>`
      *
      * | Chrome  |  Firefox  | Safari  |  Edge  |   IE   |
      * | :-----: | :-------: | :-----: | :----: | :----: |
      * | **16**  |  **15**   |  **6**  | **12** | **11** |
      * | 7 _-x-_ | 3.5 _-x-_ | 3 _-x-_ |        |        |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/border-image
      */
    var borderImage: js.UndefOr[BorderImageProperty] = js.native
    
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
    var borderImageOutset: js.UndefOr[BorderImageOutsetProperty[String | Double]] = js.native
    
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
    var borderImageRepeat: js.UndefOr[BorderImageRepeatProperty] = js.native
    
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
    var borderImageSlice: js.UndefOr[BorderImageSliceProperty] = js.native
    
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
    var borderImageSource: js.UndefOr[BorderImageSourceProperty] = js.native
    
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
    var borderImageWidth: js.UndefOr[BorderImageWidthProperty[String | Double]] = js.native
    
    /**
      * The **`border-inline`** CSS property is a shorthand property for setting the individual logical inline border property values in a single place in the style sheet.
      *
      * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <'color'>`
      *
      * | Chrome | Firefox | Safari |  Edge  | IE  |
      * | :----: | :-----: | :----: | :----: | :-: |
      * | **69** | **66**  |   No   | **79** | No  |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/border-inline
      */
    var borderInline: js.UndefOr[BorderInlineProperty[String | Double]] = js.native
    
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
    var borderInlineColor: js.UndefOr[BorderInlineColorProperty] = js.native
    
    /**
      * The **`border-inline-end`** CSS property is a shorthand property for setting the individual logical inline-end border property values in a single place in the style sheet.
      *
      * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <'color'>`
      *
      * | Chrome | Firefox |  Safari  |  Edge  | IE  |
      * | :----: | :-----: | :------: | :----: | :-: |
      * | **69** | **41**  | **12.1** | **79** | No  |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end
      */
    var borderInlineEnd: js.UndefOr[BorderInlineEndProperty[String | Double]] = js.native
    
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
    var borderInlineEndColor: js.UndefOr[BorderInlineEndColorProperty] = js.native
    
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
    var borderInlineEndStyle: js.UndefOr[BorderInlineEndStyleProperty] = js.native
    
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
    var borderInlineEndWidth: js.UndefOr[BorderInlineEndWidthProperty[String | Double]] = js.native
    
    /**
      * The **`border-inline-start`** CSS property is a shorthand property for setting the individual logical inline-start border property values in a single place in the style sheet.
      *
      * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <'color'>`
      *
      * | Chrome | Firefox |  Safari  |  Edge  | IE  |
      * | :----: | :-----: | :------: | :----: | :-: |
      * | **69** | **41**  | **12.1** | **79** | No  |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start
      */
    var borderInlineStart: js.UndefOr[BorderInlineStartProperty[String | Double]] = js.native
    
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
    var borderInlineStartColor: js.UndefOr[BorderInlineStartColorProperty] = js.native
    
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
    var borderInlineStartStyle: js.UndefOr[BorderInlineStartStyleProperty] = js.native
    
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
    var borderInlineStartWidth: js.UndefOr[BorderInlineStartWidthProperty[String | Double]] = js.native
    
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
    var borderInlineStyle: js.UndefOr[BorderInlineStyleProperty] = js.native
    
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
    var borderInlineWidth: js.UndefOr[BorderInlineWidthProperty[String | Double]] = js.native
    
    /**
      * The **`border-left`** CSS property is a shorthand that sets the values of `border-left-width`, `border-left-style` and `border-left-color`. These properties set an element's left border.
      *
      * **Syntax**: `<line-width> || <line-style> || <color>`
      *
      * | Chrome | Firefox | Safari |  Edge  |  IE   |
      * | :----: | :-----: | :----: | :----: | :---: |
      * | **1**  |  **1**  | **1**  | **12** | **4** |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/border-left
      */
    var borderLeft: js.UndefOr[BorderLeftProperty[String | Double]] = js.native
    
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
    var borderLeftColor: js.UndefOr[BorderLeftColorProperty] = js.native
    
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
    var borderLeftStyle: js.UndefOr[BorderLeftStyleProperty] = js.native
    
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
    var borderLeftWidth: js.UndefOr[BorderLeftWidthProperty[String | Double]] = js.native
    
    /**
      * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
      *
      * **Syntax**: `<length-percentage>{1,4} [ / <length-percentage>{1,4} ]?`
      *
      * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
      * | :-----: | :-----: | :-----: | :----: | :---: |
      * |  **4**  |  **4**  |  **5**  | **12** | **9** |
      * | 1 _-x-_ |         | 3 _-x-_ |        |       |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/border-radius
      */
    var borderRadius: js.UndefOr[BorderRadiusProperty[String | Double]] = js.native
    
    /**
      * The **`border-right`** CSS property is a shorthand that sets the values of `border-right-width`, `border-right-style` and `border-right-color`. These properties set an element's right border.
      *
      * **Syntax**: `<line-width> || <line-style> || <color>`
      *
      * | Chrome | Firefox | Safari |  Edge  |   IE    |
      * | :----: | :-----: | :----: | :----: | :-----: |
      * | **1**  |  **1**  | **1**  | **12** | **5.5** |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/border-right
      */
    var borderRight: js.UndefOr[BorderRightProperty[String | Double]] = js.native
    
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
    var borderRightColor: js.UndefOr[BorderRightColorProperty] = js.native
    
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
    var borderRightStyle: js.UndefOr[BorderRightStyleProperty] = js.native
    
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
    var borderRightWidth: js.UndefOr[BorderRightWidthProperty[String | Double]] = js.native
    
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
    var borderSpacing: js.UndefOr[BorderSpacingProperty[String | Double]] = js.native
    
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
    var borderStartEndRadius: js.UndefOr[BorderStartEndRadiusProperty[String | Double]] = js.native
    
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
    var borderStartStartRadius: js.UndefOr[BorderStartStartRadiusProperty[String | Double]] = js.native
    
    /**
      * The **`border-style`** CSS property is a shorthand property that sets the line style for all four sides of an element's border.
      *
      * **Syntax**: `<line-style>{1,4}`
      *
      * | Chrome | Firefox | Safari |  Edge  |  IE   |
      * | :----: | :-----: | :----: | :----: | :---: |
      * | **1**  |  **1**  | **1**  | **12** | **4** |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/border-style
      */
    var borderStyle: js.UndefOr[BorderStyleProperty] = js.native
    
    /**
      * The **`border-top`** CSS property is a shorthand that sets the values of `border-top-width`, `border-top-style` and `border-top-color`. These properties set an element's top border.
      *
      * **Syntax**: `<line-width> || <line-style> || <color>`
      *
      * | Chrome | Firefox | Safari |  Edge  |  IE   |
      * | :----: | :-----: | :----: | :----: | :---: |
      * | **1**  |  **1**  | **1**  | **12** | **4** |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/border-top
      */
    var borderTop: js.UndefOr[BorderTopProperty[String | Double]] = js.native
    
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
    var borderTopColor: js.UndefOr[BorderTopColorProperty] = js.native
    
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
    var borderTopLeftRadius: js.UndefOr[BorderTopLeftRadiusProperty[String | Double]] = js.native
    
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
    var borderTopRightRadius: js.UndefOr[BorderTopRightRadiusProperty[String | Double]] = js.native
    
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
    var borderTopStyle: js.UndefOr[BorderTopStyleProperty] = js.native
    
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
    var borderTopWidth: js.UndefOr[BorderTopWidthProperty[String | Double]] = js.native
    
    /**
      * The **`border-width`** shorthand CSS property sets the widths of all four sides of an element's border.
      *
      * **Syntax**: `<line-width>{1,4}`
      *
      * | Chrome | Firefox | Safari |  Edge  |  IE   |
      * | :----: | :-----: | :----: | :----: | :---: |
      * | **1**  |  **1**  | **1**  | **12** | **4** |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/border-width
      */
    var borderWidth: js.UndefOr[BorderWidthProperty[String | Double]] = js.native
    
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
    var bottom: js.UndefOr[BottomProperty[String | Double]] = js.native
    
    /**
      * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
      *
      * **Syntax**: `start | center | end | baseline | stretch`
      *
      * **Initial value**: `stretch`
      *
      * @deprecated
      */
    var boxAlign: js.UndefOr[BoxAlignProperty] = js.native
    
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
    var boxDecorationBreak: js.UndefOr[BoxDecorationBreakProperty] = js.native
    
    /**
      * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
      *
      * **Syntax**: `normal | reverse | inherit`
      *
      * **Initial value**: `normal`
      *
      * @deprecated
      */
    var boxDirection: js.UndefOr[BoxDirectionProperty] = js.native
    
    /**
      * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
      *
      * **Syntax**: `<number>`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var boxFlex: js.UndefOr[GlobalsNumber] = js.native
    
    /**
      * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
      *
      * **Syntax**: `<integer>`
      *
      * **Initial value**: `1`
      *
      * @deprecated
      */
    var boxFlexGroup: js.UndefOr[GlobalsNumber] = js.native
    
    /**
      * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
      *
      * **Syntax**: `single | multiple`
      *
      * **Initial value**: `single`
      *
      * @deprecated
      */
    var boxLines: js.UndefOr[BoxLinesProperty] = js.native
    
    /**
      * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
      *
      * **Syntax**: `<integer>`
      *
      * **Initial value**: `1`
      *
      * @deprecated
      */
    var boxOrdinalGroup: js.UndefOr[GlobalsNumber] = js.native
    
    /**
      * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
      *
      * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
      *
      * **Initial value**: `inline-axis` (`horizontal` in XUL)
      *
      * @deprecated
      */
    var boxOrient: js.UndefOr[BoxOrientProperty] = js.native
    
    /**
      * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
      *
      * **Syntax**: `start | center | end | justify`
      *
      * **Initial value**: `start`
      *
      * @deprecated
      */
    var boxPack: js.UndefOr[BoxPackProperty] = js.native
    
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
    var boxShadow: js.UndefOr[BoxShadowProperty] = js.native
    
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
    var boxSizing: js.UndefOr[BoxSizingProperty] = js.native
    
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
      * @see https://developer.mozilla.org/docs/Web/CSS/break-after
      */
    var breakAfter: js.UndefOr[BreakAfterProperty] = js.native
    
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
      * @see https://developer.mozilla.org/docs/Web/CSS/break-before
      */
    var breakBefore: js.UndefOr[BreakBeforeProperty] = js.native
    
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
      * @see https://developer.mozilla.org/docs/Web/CSS/break-inside
      */
    var breakInside: js.UndefOr[BreakInsideProperty] = js.native
    
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
    var captionSide: js.UndefOr[CaptionSideProperty] = js.native
    
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
    var caretColor: js.UndefOr[CaretColorProperty] = js.native
    
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
    var clear: js.UndefOr[ClearProperty] = js.native
    
    /**
      * The **`clip`** CSS property defines what portion of an element is visible. The `clip` property applies only to absolutely positioned elements, that is elements with `position:absolute` or `position:fixed`.
      *
      * **Syntax**: `<shape> | auto`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var clip: js.UndefOr[ClipProperty] = js.native
    
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
    var clipPath: js.UndefOr[ClipPathProperty] = js.native
    
    var clipRule: js.UndefOr[ClipRuleProperty] = js.native
    
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
    var color: js.UndefOr[ColorProperty] = js.native
    
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
    var colorAdjust: js.UndefOr[ColorAdjustProperty] = js.native
    
    var colorInterpolation: js.UndefOr[ColorInterpolationProperty] = js.native
    
    var colorRendering: js.UndefOr[ColorRenderingProperty] = js.native
    
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
    var columnCount: js.UndefOr[ColumnCountProperty] = js.native
    
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
    var columnFill: js.UndefOr[ColumnFillProperty] = js.native
    
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
      * | Chrome | Firefox | Safari |  Edge  | IE  |
      * | :----: | :-----: | :----: | :----: | :-: |
      * | **84** | **63**  |   No   | **84** | No  |
      *
      * ---
      *
      * _Supported in Grid Layout_
      *
      * |         Chrome         |        Firefox         |          Safari          |  Edge  | IE  |
      * | :--------------------: | :--------------------: | :----------------------: | :----: | :-: |
      * |         **66**         |         **61**         |         **12.1**         | **16** | No  |
      * | 57 _(grid-column-gap)_ | 52 _(grid-column-gap)_ | 10.1 _(grid-column-gap)_ |        |     |
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
    var columnGap: js.UndefOr[ColumnGapProperty[String | Double]] = js.native
    
    /**
      * The **`column-rule`** CSS property sets the width, style, and color of the rule (line) drawn between columns in a multi-column layout.
      *
      * **Syntax**: `<'column-rule-width'> || <'column-rule-style'> || <'column-rule-color'>`
      *
      * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
      * | :-----: | :-----: | :-----: | :----: | :----: |
      * | **50**  | **52**  |  **9**  | **12** | **10** |
      * | 1 _-x-_ |         | 3 _-x-_ |        |        |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/column-rule
      */
    var columnRule: js.UndefOr[ColumnRuleProperty[String | Double]] = js.native
    
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
    var columnRuleColor: js.UndefOr[ColumnRuleColorProperty] = js.native
    
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
    var columnRuleStyle: js.UndefOr[ColumnRuleStyleProperty] = js.native
    
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
    var columnRuleWidth: js.UndefOr[ColumnRuleWidthProperty[String | Double]] = js.native
    
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
    var columnSpan: js.UndefOr[ColumnSpanProperty] = js.native
    
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
    var columnWidth: js.UndefOr[ColumnWidthProperty[String | Double]] = js.native
    
    /**
      * The **`columns`** CSS property sets the column width and column count of an element.
      *
      * **Syntax**: `<'column-width'> || <'column-count'>`
      *
      * | Chrome | Firefox | Safari  |  Edge  |   IE   |
      * | :----: | :-----: | :-----: | :----: | :----: |
      * | **50** | **52**  |  **9**  | **12** | **10** |
      * |        |         | 3 _-x-_ |        |        |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/columns
      */
    var columns: js.UndefOr[ColumnsProperty[String | Double]] = js.native
    
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
    var contain: js.UndefOr[ContainProperty] = js.native
    
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
    var content: js.UndefOr[ContentProperty] = js.native
    
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
    var counterIncrement: js.UndefOr[CounterIncrementProperty] = js.native
    
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
    var counterReset: js.UndefOr[CounterResetProperty] = js.native
    
    /**
      * The **`counter-set`** CSS property sets a CSS counter to a given value. It manipulates the value of existing counters, and will only create new counters if there isn't already a counter of the given name on the element.
      *
      * **Syntax**: `[ <custom-ident> <integer>? ]+ | none`
      *
      * **Initial value**: `none`
      *
      * | Chrome | Firefox | Safari |  Edge  | IE  |
      * | :----: | :-----: | :----: | :----: | :-: |
      * | **85** | **68**  |   No   | **85** | No  |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/counter-set
      */
    var counterSet: js.UndefOr[CounterSetProperty] = js.native
    
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
    var cursor: js.UndefOr[CursorProperty] = js.native
    
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
    var direction: js.UndefOr[DirectionProperty] = js.native
    
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
    var display: js.UndefOr[DisplayProperty] = js.native
    
    var dominantBaseline: js.UndefOr[DominantBaselineProperty] = js.native
    
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
    var emptyCells: js.UndefOr[EmptyCellsProperty] = js.native
    
    var fill: js.UndefOr[FillProperty] = js.native
    
    var fillOpacity: js.UndefOr[GlobalsNumber] = js.native
    
    var fillRule: js.UndefOr[FillRuleProperty] = js.native
    
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
    var filter: js.UndefOr[FilterProperty] = js.native
    
    /**
      * The **`flex`** CSS property sets how a flex item will grow or shrink to fit the space available in its flex container. It is a shorthand for `flex-grow`, `flex-shrink`, and `flex-basis`.
      *
      * **Syntax**: `none | [ <'flex-grow'> <'flex-shrink'>? || <'flex-basis'> ]`
      *
      * |  Chrome  | Firefox |  Safari   |  Edge  |    IE    |
      * | :------: | :-----: | :-------: | :----: | :------: |
      * |  **29**  | **20**  |   **9**   | **12** |  **11**  |
      * | 21 _-x-_ |         | 6.1 _-x-_ |        | 10 _-x-_ |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/flex
      */
    var flex: js.UndefOr[FlexProperty[String | Double]] = js.native
    
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
    var flexBasis: js.UndefOr[FlexBasisProperty[String | Double]] = js.native
    
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
    var flexDirection: js.UndefOr[FlexDirectionProperty] = js.native
    
    /**
      * The **`flex-flow`** CSS property is a shorthand property for `flex-direction` and `flex-wrap` properties.
      *
      * **Syntax**: `<'flex-direction'> || <'flex-wrap'>`
      *
      * |  Chrome  | Firefox |  Safari   |  Edge  |   IE   |
      * | :------: | :-----: | :-------: | :----: | :----: |
      * |  **29**  | **28**  |   **9**   | **12** | **11** |
      * | 21 _-x-_ |         | 6.1 _-x-_ |        |        |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/flex-flow
      */
    var flexFlow: js.UndefOr[FlexFlowProperty] = js.native
    
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
    var flexGrow: js.UndefOr[GlobalsNumber] = js.native
    
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
    var flexShrink: js.UndefOr[GlobalsNumber] = js.native
    
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
    var flexWrap: js.UndefOr[FlexWrapProperty] = js.native
    
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
    var float: js.UndefOr[FloatProperty] = js.native
    
    var floodColor: js.UndefOr[FloodColorProperty] = js.native
    
    var floodOpacity: js.UndefOr[GlobalsNumber] = js.native
    
    /**
      * The **`font`** CSS property is a shorthand for `font-style`, `font-variant`, `font-weight`, `font-size`, `line-height`, and `font-family`. Alternatively, it sets an element's font to a system font.
      *
      * **Syntax**: `[ [ <'font-style'> || <font-variant-css21> || <'font-weight'> || <'font-stretch'> ]? <'font-size'> [ / <'line-height'> ]? <'font-family'> ] | caption | icon | menu | message-box | small-caption | status-bar`
      *
      * | Chrome | Firefox | Safari |  Edge  |  IE   |
      * | :----: | :-----: | :----: | :----: | :---: |
      * | **1**  |  **1**  | **1**  | **12** | **3** |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/font
      */
    var font: js.UndefOr[FontProperty] = js.native
    
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
    var fontFamily: js.UndefOr[FontFamilyProperty] = js.native
    
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
    var fontFeatureSettings: js.UndefOr[FontFeatureSettingsProperty] = js.native
    
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
    var fontKerning: js.UndefOr[FontKerningProperty] = js.native
    
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
    var fontLanguageOverride: js.UndefOr[FontLanguageOverrideProperty] = js.native
    
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
    var fontOpticalSizing: js.UndefOr[FontOpticalSizingProperty] = js.native
    
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
    var fontSize: js.UndefOr[FontSizeProperty[String | Double]] = js.native
    
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
    var fontSizeAdjust: js.UndefOr[FontSizeAdjustProperty] = js.native
    
    /**
      * The **`font-smooth`** CSS property controls the application of anti-aliasing when fonts are rendered.
      *
      * **Syntax**: `auto | never | always | <absolute-size> | <length>`
      *
      * **Initial value**: `auto`
      *
      * |              Chrome              |              Firefox               |              Safari              |               Edge                | IE  |
      * | :------------------------------: | :--------------------------------: | :------------------------------: | :-------------------------------: | :-: |
      * | **5** _(-webkit-font-smoothing)_ | **25** _(-moz-osx-font-smoothing)_ | **4** _(-webkit-font-smoothing)_ | **79** _(-webkit-font-smoothing)_ | No  |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/font-smooth
      */
    var fontSmooth: js.UndefOr[FontSmoothProperty[String | Double]] = js.native
    
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
    var fontStretch: js.UndefOr[FontStretchProperty] = js.native
    
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
    var fontStyle: js.UndefOr[FontStyleProperty] = js.native
    
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
    var fontSynthesis: js.UndefOr[FontSynthesisProperty] = js.native
    
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
    var fontVariant: js.UndefOr[FontVariantProperty] = js.native
    
    /**
      * The **`font-variant-alternates`** CSS property controls the usage of alternate glyphs. These alternate glyphs may be referenced by alternative names defined in `@font-feature-values`.
      *
      * **Syntax**: `normal | [ stylistic( <feature-value-name> ) || historical-forms || styleset( <feature-value-name># ) || character-variant( <feature-value-name># ) || swash( <feature-value-name> ) || ornaments( <feature-value-name> ) || annotation( <feature-value-name> ) ]`
      *
      * **Initial value**: `normal`
      *
      * @deprecated
      */
    var fontVariantAlternates: js.UndefOr[FontVariantAlternatesProperty] = js.native
    
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
    var fontVariantCaps: js.UndefOr[FontVariantCapsProperty] = js.native
    
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
    var fontVariantEastAsian: js.UndefOr[FontVariantEastAsianProperty] = js.native
    
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
    var fontVariantLigatures: js.UndefOr[FontVariantLigaturesProperty] = js.native
    
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
    var fontVariantNumeric: js.UndefOr[FontVariantNumericProperty] = js.native
    
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
    var fontVariantPosition: js.UndefOr[FontVariantPositionProperty] = js.native
    
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
    var fontVariationSettings: js.UndefOr[FontVariationSettingsProperty] = js.native
    
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
    var fontWeight: js.UndefOr[FontWeightProperty] = js.native
    
    /**
      * The **`gap`** CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for `row-gap` and `column-gap`.
      *
      * **Syntax**: `<'row-gap'> <'column-gap'>?`
      *
      * ---
      *
      * _Supported in Flex Layout_
      *
      * | Chrome | Firefox | Safari |  Edge  | IE  |
      * | :----: | :-----: | :----: | :----: | :-: |
      * | **84** | **63**  |   No   | **84** | No  |
      *
      * ---
      *
      * _Supported in Grid Layout_
      *
      * |     Chrome      |     Firefox     |      Safari       |  Edge  | IE  |
      * | :-------------: | :-------------: | :---------------: | :----: | :-: |
      * |     **66**      |     **61**      |      **12**       | **16** | No  |
      * | 57 _(grid-gap)_ | 52 _(grid-gap)_ | 10.1 _(grid-gap)_ |        |     |
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
    var gap: js.UndefOr[GapProperty[String | Double]] = js.native
    
    var glyphOrientationVertical: js.UndefOr[GlyphOrientationVerticalProperty] = js.native
    
    /**
      * The **`grid`** CSS property is a shorthand property that sets all of the explicit grid properties (`grid-template-rows`, `grid-template-columns`, and `grid-template-areas`), and all the implicit grid properties (`grid-auto-rows`, `grid-auto-columns`, and `grid-auto-flow`), in a single declaration.
      *
      * **Syntax**: `<'grid-template'> | <'grid-template-rows'> / [ auto-flow && dense? ] <'grid-auto-columns'>? | [ auto-flow && dense? ] <'grid-auto-rows'>? / <'grid-template-columns'>`
      *
      * | Chrome | Firefox |  Safari  |  Edge  | IE  |
      * | :----: | :-----: | :------: | :----: | :-: |
      * | **57** | **52**  | **10.1** | **16** | No  |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/grid
      */
    var grid: js.UndefOr[GridProperty] = js.native
    
    /**
      * The **`grid-area`** CSS property is a shorthand property for `grid-row-start`, `grid-column-start`, `grid-row-end` and `grid-column-end`, specifying a grid item’s size and location within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the edges of its grid area.
      *
      * **Syntax**: `<grid-line> [ / <grid-line> ]{0,3}`
      *
      * | Chrome | Firefox |  Safari  |  Edge  | IE  |
      * | :----: | :-----: | :------: | :----: | :-: |
      * | **57** | **52**  | **10.1** | **16** | No  |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/grid-area
      */
    var gridArea: js.UndefOr[GridAreaProperty] = js.native
    
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
    var gridAutoColumns: js.UndefOr[GridAutoColumnsProperty[String | Double]] = js.native
    
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
    var gridAutoFlow: js.UndefOr[GridAutoFlowProperty] = js.native
    
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
    var gridAutoRows: js.UndefOr[GridAutoRowsProperty[String | Double]] = js.native
    
    /**
      * The **`grid-column`** CSS property is a shorthand property for `grid-column-start` and `grid-column-end` specifying a grid item's size and location within the grid column by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start and inline-end edge of its grid area.
      *
      * **Syntax**: `<grid-line> [ / <grid-line> ]?`
      *
      * | Chrome | Firefox |  Safari  |  Edge  | IE  |
      * | :----: | :-----: | :------: | :----: | :-: |
      * | **57** | **52**  | **10.1** | **16** | No  |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/grid-column
      */
    var gridColumn: js.UndefOr[GridColumnProperty] = js.native
    
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
    var gridColumnEnd: js.UndefOr[GridColumnEndProperty] = js.native
    
    /**
      * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
      *
      * **Syntax**: `<length-percentage>`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var gridColumnGap: js.UndefOr[GridColumnGapProperty[String | Double]] = js.native
    
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
    var gridColumnStart: js.UndefOr[GridColumnStartProperty] = js.native
    
    /**
      * The **`gap`** CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for `row-gap` and `column-gap`.
      *
      * **Syntax**: `<'grid-row-gap'> <'grid-column-gap'>?`
      *
      * @deprecated
      */
    var gridGap: js.UndefOr[GridGapProperty[String | Double]] = js.native
    
    /**
      * The **`grid-row`** CSS property is a shorthand property for `grid-row-start` and `grid-row-end` specifying a grid item’s size and location within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start and inline-end edge of its grid area.
      *
      * **Syntax**: `<grid-line> [ / <grid-line> ]?`
      *
      * | Chrome | Firefox |  Safari  |  Edge  | IE  |
      * | :----: | :-----: | :------: | :----: | :-: |
      * | **57** | **52**  | **10.1** | **16** | No  |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/grid-row
      */
    var gridRow: js.UndefOr[GridRowProperty] = js.native
    
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
    var gridRowEnd: js.UndefOr[GridRowEndProperty] = js.native
    
    /**
      * The **`row-gap`** CSS property sets the size of the gap (gutter) between an element's grid rows.
      *
      * **Syntax**: `<length-percentage>`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var gridRowGap: js.UndefOr[GridRowGapProperty[String | Double]] = js.native
    
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
    var gridRowStart: js.UndefOr[GridRowStartProperty] = js.native
    
    /**
      * The **`grid-template`** CSS property is a shorthand property for defining grid columns, rows, and areas.
      *
      * **Syntax**: `none | [ <'grid-template-rows'> / <'grid-template-columns'> ] | [ <line-names>? <string> <track-size>? <line-names>? ]+ [ / <explicit-track-list> ]?`
      *
      * | Chrome | Firefox |  Safari  |  Edge  | IE  |
      * | :----: | :-----: | :------: | :----: | :-: |
      * | **57** | **52**  | **10.1** | **16** | No  |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/grid-template
      */
    var gridTemplate: js.UndefOr[GridTemplateProperty] = js.native
    
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
    var gridTemplateAreas: js.UndefOr[GridTemplateAreasProperty] = js.native
    
    /**
      * The **`grid-template-columns`** CSS property defines the line names and track sizing functions of the grid columns.
      *
      * **Syntax**: `none | <track-list> | <auto-track-list> | subgrid <line-name-list>?`
      *
      * **Initial value**: `none`
      *
      * | Chrome | Firefox |  Safari  |  Edge  |             IE              |
      * | :----: | :-----: | :------: | :----: | :-------------------------: |
      * | **57** | **52**  | **10.1** | **16** | **10** _(-ms-grid-columns)_ |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/grid-template-columns
      */
    var gridTemplateColumns: js.UndefOr[GridTemplateColumnsProperty[String | Double]] = js.native
    
    /**
      * The **`grid-template-rows`** CSS property defines the line names and track sizing functions of the grid rows.
      *
      * **Syntax**: `none | <track-list> | <auto-track-list> | subgrid <line-name-list>?`
      *
      * **Initial value**: `none`
      *
      * | Chrome | Firefox |  Safari  |  Edge  |            IE            |
      * | :----: | :-----: | :------: | :----: | :----------------------: |
      * | **57** | **52**  | **10.1** | **16** | **10** _(-ms-grid-rows)_ |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/grid-template-rows
      */
    var gridTemplateRows: js.UndefOr[GridTemplateRowsProperty[String | Double]] = js.native
    
    /* fake member to keep old syntax */
    val hack: js.UndefOr[js.Any] = js.native
    
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
    var hangingPunctuation: js.UndefOr[HangingPunctuationProperty] = js.native
    
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
    var height: js.UndefOr[HeightProperty[String | Double]] = js.native
    
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
    var hyphens: js.UndefOr[HyphensProperty] = js.native
    
    /**
      * The **`image-orientation`** CSS property specifies a layout-independent correction to the orientation of an image. It should _not_ be used for any other orientation adjustments; instead, the `transform` property should be used with the `rotate` `<transform-function>`.
      *
      * **Syntax**: `from-image | <angle> | [ <angle>? flip ]`
      *
      * **Initial value**: `from-image`
      *
      * | Chrome | Firefox |  Safari  |  Edge  | IE  |
      * | :----: | :-----: | :------: | :----: | :-: |
      * | **81** | **26**  | **13.1** | **81** | No  |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/image-orientation
      */
    var imageOrientation: js.UndefOr[ImageOrientationProperty] = js.native
    
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
    var imageRendering: js.UndefOr[ImageRenderingProperty] = js.native
    
    /**
      * **Syntax**: `[ from-image || <resolution> ] && snap?`
      *
      * **Initial value**: `1dppx`
      */
    var imageResolution: js.UndefOr[ImageResolutionProperty] = js.native
    
    /**
      * The **`ime-mode`** CSS property controls the state of the input method editor (IME) for text fields. This property is obsolete.
      *
      * **Syntax**: `auto | normal | active | inactive | disabled`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var imeMode: js.UndefOr[ImeModeProperty] = js.native
    
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
    var initialLetter: js.UndefOr[InitialLetterProperty] = js.native
    
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
    var inlineSize: js.UndefOr[InlineSizeProperty[String | Double]] = js.native
    
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
    var inset: js.UndefOr[InsetProperty[String | Double]] = js.native
    
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
    var insetBlock: js.UndefOr[InsetBlockProperty[String | Double]] = js.native
    
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
    var insetBlockEnd: js.UndefOr[InsetBlockEndProperty[String | Double]] = js.native
    
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
    var insetBlockStart: js.UndefOr[InsetBlockStartProperty[String | Double]] = js.native
    
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
    var insetInline: js.UndefOr[InsetInlineProperty[String | Double]] = js.native
    
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
    var insetInlineEnd: js.UndefOr[InsetInlineEndProperty[String | Double]] = js.native
    
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
    var insetInlineStart: js.UndefOr[InsetInlineStartProperty[String | Double]] = js.native
    
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
    var isolation: js.UndefOr[IsolationProperty] = js.native
    
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
    var justifyContent: js.UndefOr[JustifyContentProperty] = js.native
    
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
    var justifyItems: js.UndefOr[JustifyItemsProperty] = js.native
    
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
      * | Chrome | Firefox |  Safari  |  Edge  |      IE      |
      * | :----: | :-----: | :------: | :----: | :----------: |
      * | **57** | **45**  | **10.1** | **16** | **10** _-x-_ |
      *
      * ---
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/justify-self
      */
    var justifySelf: js.UndefOr[JustifySelfProperty] = js.native
    
    /**
      * The **`justify-tracks`** CSS property sets the alignment in the masonry axis for grid containers that have masonry in their inline axis.
      *
      * **Syntax**: `[ normal | <content-distribution> | <overflow-position>? [ <content-position> | left | right ] ]#`
      *
      * **Initial value**: `normal`
      */
    var justifyTracks: js.UndefOr[JustifyTracksProperty] = js.native
    
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
    var left: js.UndefOr[LeftProperty[String | Double]] = js.native
    
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
    var letterSpacing: js.UndefOr[LetterSpacingProperty[String | Double]] = js.native
    
    var lightingColor: js.UndefOr[LightingColorProperty] = js.native
    
    /**
      * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
      *
      * **Syntax**: `auto | loose | normal | strict | anywhere`
      *
      * **Initial value**: `auto`
      *
      * | Chrome  | Firefox | Safari  |  Edge  |   IE    |
      * | :-----: | :-----: | :-----: | :----: | :-----: |
      * | **58**  | **69**  | **11**  | **14** | **5.5** |
      * | 1 _-x-_ |         | 3 _-x-_ |        |         |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/line-break
      */
    var lineBreak: js.UndefOr[LineBreakProperty] = js.native
    
    /**
      * **Syntax**: `none | <integer>`
      *
      * **Initial value**: `none`
      */
    var lineClamp: js.UndefOr[LineClampProperty] = js.native
    
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
    var lineHeight: js.UndefOr[LineHeightProperty[String | Double]] = js.native
    
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
    var lineHeightStep: js.UndefOr[LineHeightStepProperty[String | Double]] = js.native
    
    /**
      * The **`list-style`** CSS property is a shorthand to set list style properties `list-style-type`, `list-style-image`, and `list-style-position`.
      *
      * **Syntax**: `<'list-style-type'> || <'list-style-position'> || <'list-style-image'>`
      *
      * | Chrome | Firefox | Safari |  Edge  |  IE   |
      * | :----: | :-----: | :----: | :----: | :---: |
      * | **1**  |  **1**  | **1**  | **12** | **4** |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/list-style
      */
    var listStyle: js.UndefOr[ListStyleProperty] = js.native
    
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
    var listStyleImage: js.UndefOr[ListStyleImageProperty] = js.native
    
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
    var listStylePosition: js.UndefOr[ListStylePositionProperty] = js.native
    
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
    var listStyleType: js.UndefOr[ListStyleTypeProperty] = js.native
    
    /**
      * The **`margin`** CSS property sets the margin area on all four sides of an element. It is a shorthand for `margin-top`, `margin-right`, `margin-bottom`, and `margin-left`.
      *
      * **Syntax**: `[ <length> | <percentage> | auto ]{1,4}`
      *
      * | Chrome | Firefox | Safari |  Edge  |  IE   |
      * | :----: | :-----: | :----: | :----: | :---: |
      * | **1**  |  **1**  | **1**  | **12** | **3** |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/margin
      */
    var margin: js.UndefOr[MarginProperty[String | Double]] = js.native
    
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
    var marginBlock: js.UndefOr[MarginBlockProperty[String | Double]] = js.native
    
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
    var marginBlockEnd: js.UndefOr[MarginBlockEndProperty[String | Double]] = js.native
    
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
    var marginBlockStart: js.UndefOr[MarginBlockStartProperty[String | Double]] = js.native
    
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
    var marginBottom: js.UndefOr[MarginBottomProperty[String | Double]] = js.native
    
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
    var marginInline: js.UndefOr[MarginInlineProperty[String | Double]] = js.native
    
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
    var marginInlineEnd: js.UndefOr[MarginInlineEndProperty[String | Double]] = js.native
    
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
    var marginInlineStart: js.UndefOr[MarginInlineStartProperty[String | Double]] = js.native
    
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
    var marginLeft: js.UndefOr[MarginLeftProperty[String | Double]] = js.native
    
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
    var marginRight: js.UndefOr[MarginRightProperty[String | Double]] = js.native
    
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
    var marginTop: js.UndefOr[MarginTopProperty[String | Double]] = js.native
    
    var marker: js.UndefOr[MarkerProperty] = js.native
    
    var markerEnd: js.UndefOr[MarkerEndProperty] = js.native
    
    var markerMid: js.UndefOr[MarkerMidProperty] = js.native
    
    var markerStart: js.UndefOr[MarkerStartProperty] = js.native
    
    /**
      * The **`mask`** CSS property hides an element (partially or fully) by masking or clipping the image at specific points.
      *
      * **Syntax**: `<mask-layer>#`
      *
      * | Chrome | Firefox | Safari  |  Edge  | IE  |
      * | :----: | :-----: | :-----: | :----: | :-: |
      * | **1**  |  **2**  | **3.2** | **12** | No  |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/mask
      */
    var mask: js.UndefOr[MaskProperty[String | Double]] = js.native
    
    /**
      * The **`mask-border`** CSS property lets you create a mask along the edge of an element's border.
      *
      * **Syntax**: `<'mask-border-source'> || <'mask-border-slice'> [ / <'mask-border-width'>? [ / <'mask-border-outset'> ]? ]? || <'mask-border-repeat'> || <'mask-border-mode'>`
      */
    var maskBorder: js.UndefOr[MaskBorderProperty] = js.native
    
    /**
      * The **`mask-border-mode`** CSS property specifies the blending mode used in a mask border.
      *
      * **Syntax**: `luminance | alpha`
      *
      * **Initial value**: `alpha`
      */
    var maskBorderMode: js.UndefOr[MaskBorderModeProperty] = js.native
    
    /**
      * The **`mask-border-outset`** CSS property specifies the distance by which an element's mask border is set out from its border box.
      *
      * **Syntax**: `[ <length> | <number> ]{1,4}`
      *
      * **Initial value**: `0`
      */
    var maskBorderOutset: js.UndefOr[MaskBorderOutsetProperty[String | Double]] = js.native
    
    /**
      * The **`mask-border-repeat`** CSS property sets how the edge regions of a source image are adjusted to fit the dimensions of an element's mask border.
      *
      * **Syntax**: `[ stretch | repeat | round | space ]{1,2}`
      *
      * **Initial value**: `stretch`
      */
    var maskBorderRepeat: js.UndefOr[MaskBorderRepeatProperty] = js.native
    
    /**
      * The **`mask-border-slice`** CSS property divides the image set by `mask-border-source` into regions. These regions are used to form the components of an element's mask border.
      *
      * **Syntax**: `<number-percentage>{1,4} fill?`
      *
      * **Initial value**: `0`
      */
    var maskBorderSlice: js.UndefOr[MaskBorderSliceProperty] = js.native
    
    /**
      * The **`mask-border-source`** CSS property sets the source image used to create an element's mask border.
      *
      * **Syntax**: `none | <image>`
      *
      * **Initial value**: `none`
      */
    var maskBorderSource: js.UndefOr[MaskBorderSourceProperty] = js.native
    
    /**
      * The **`mask-border-width`** CSS property sets the width of an element's mask border.
      *
      * **Syntax**: `[ <length-percentage> | <number> | auto ]{1,4}`
      *
      * **Initial value**: `auto`
      */
    var maskBorderWidth: js.UndefOr[MaskBorderWidthProperty[String | Double]] = js.native
    
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
    var maskClip: js.UndefOr[MaskClipProperty] = js.native
    
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
    var maskComposite: js.UndefOr[MaskCompositeProperty] = js.native
    
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
    var maskImage: js.UndefOr[MaskImageProperty] = js.native
    
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
    var maskMode: js.UndefOr[MaskModeProperty] = js.native
    
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
    var maskOrigin: js.UndefOr[MaskOriginProperty] = js.native
    
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
    var maskPosition: js.UndefOr[MaskPositionProperty[String | Double]] = js.native
    
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
    var maskRepeat: js.UndefOr[MaskRepeatProperty] = js.native
    
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
    var maskSize: js.UndefOr[MaskSizeProperty[String | Double]] = js.native
    
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
    var maskType: js.UndefOr[MaskTypeProperty] = js.native
    
    /**
      * The **`masonry-auto-flow`** CSS property modifies how items are placed when using masonry in CSS Grid Layout.
      *
      * **Syntax**: `[ pack | next ] || [ definite-first | ordered ]`
      *
      * **Initial value**: `pack`
      */
    var masonryAutoFlow: js.UndefOr[MasonryAutoFlowProperty] = js.native
    
    /**
      * The `math-style` property indicates whether MathML equations should render with normal or compact height.
      *
      * **Syntax**: `normal | compact`
      *
      * **Initial value**: `normal`
      */
    var mathStyle: js.UndefOr[MathStyleProperty] = js.native
    
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
    var maxBlockSize: js.UndefOr[MaxBlockSizeProperty[String | Double]] = js.native
    
    /**
      * The **`max-height`** CSS property sets the maximum height of an element. It prevents the used value of the `height` property from becoming larger than the value specified for `max-height`.
      *
      * **Syntax**: `none | <length-percentage> | min-content | max-content | fit-content(<length-percentage>)`
      *
      * **Initial value**: `none`
      *
      * | Chrome | Firefox | Safari  |  Edge  |  IE   |
      * | :----: | :-----: | :-----: | :----: | :---: |
      * | **18** |  **1**  | **1.3** | **12** | **7** |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/max-height
      */
    var maxHeight: js.UndefOr[MaxHeightProperty[String | Double]] = js.native
    
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
    var maxInlineSize: js.UndefOr[MaxInlineSizeProperty[String | Double]] = js.native
    
    /**
      * **Syntax**: `none | <integer>`
      *
      * **Initial value**: `none`
      */
    var maxLines: js.UndefOr[MaxLinesProperty] = js.native
    
    /**
      * The **`max-width`** CSS property sets the maximum width of an element. It prevents the used value of the `width` property from becoming larger than the value specified by `max-width`.
      *
      * **Syntax**: `none | <length-percentage> | min-content | max-content | fit-content(<length-percentage>)`
      *
      * **Initial value**: `none`
      *
      * | Chrome | Firefox | Safari |  Edge  |  IE   |
      * | :----: | :-----: | :----: | :----: | :---: |
      * | **1**  |  **1**  | **1**  | **12** | **7** |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/max-width
      */
    var maxWidth: js.UndefOr[MaxWidthProperty[String | Double]] = js.native
    
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
    var minBlockSize: js.UndefOr[MinBlockSizeProperty[String | Double]] = js.native
    
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
    var minHeight: js.UndefOr[MinHeightProperty[String | Double]] = js.native
    
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
    var minInlineSize: js.UndefOr[MinInlineSizeProperty[String | Double]] = js.native
    
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
    var minWidth: js.UndefOr[MinWidthProperty[String | Double]] = js.native
    
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
    var mixBlendMode: js.UndefOr[MixBlendModeProperty] = js.native
    
    /**
      * The **`offset`** CSS property is a shorthand property for animating an element along a defined path.
      *
      * **Syntax**: `[ <'offset-position'>? [ <'offset-path'> [ <'offset-distance'> || <'offset-rotate'> ]? ]? ]! [ / <'offset-anchor'> ]?`
      *
      * |    Chrome     | Firefox | Safari |  Edge  | IE  |
      * | :-----------: | :-----: | :----: | :----: | :-: |
      * |    **55**     | **72**  |   No   | **79** | No  |
      * | 46 _(motion)_ |         |        |        |     |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/offset
      */
    var motion: js.UndefOr[OffsetProperty[String | Double]] = js.native
    
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
    var motionDistance: js.UndefOr[OffsetDistanceProperty[String | Double]] = js.native
    
    /**
      * The **`offset-path`** CSS property specifies a motion path for an element to follow and defines the element's positioning within the parent container or SVG coordinate system.
      *
      * **Syntax**: `none | ray( [ <angle> && <size> && contain? ] ) | <path()> | <url> | [ <basic-shape> || <geometry-box> ]`
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
    var motionPath: js.UndefOr[OffsetPathProperty] = js.native
    
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
    var motionRotation: js.UndefOr[OffsetRotateProperty] = js.native
    
    /**
      * The **`-ms-accelerator`** CSS property is a Microsoft extension that sets or retrieves a string indicating whether the object represents a keyboard shortcut.
      *
      * **Syntax**: `false | true`
      *
      * **Initial value**: `false`
      */
    var msAccelerator: js.UndefOr[MsAcceleratorProperty] = js.native
    
    /**
      * The **`align-self`** CSS property aligns flex items of the current flex line overriding the `align-items` value. If any of the item's cross-axis margin is set to `auto`, then `align-self` is ignored. In Grid layout `align-self` aligns the item inside the grid area.
      *
      * **Syntax**: `auto | normal | stretch | <baseline-position> | <overflow-position>? <self-position>`
      *
      * **Initial value**: `auto`
      */
    var msAlignSelf: js.UndefOr[AlignSelfProperty] = js.native
    
    /**
      * The **`-ms-block-progression`** CSS property is a Microsoft extension that specifies the block progression and layout orientation.
      *
      * **Syntax**: `tb | rl | bt | lr`
      *
      * **Initial value**: `tb`
      */
    var msBlockProgression: js.UndefOr[MsBlockProgressionProperty] = js.native
    
    /**
      * The **`-ms-content-zoom-chaining`** CSS property is a Microsoft extension specifying the zoom behavior that occurs when a user hits the zoom limit during page manipulation.
      *
      * **Syntax**: `none | chained`
      *
      * **Initial value**: `none`
      */
    var msContentZoomChaining: js.UndefOr[MsContentZoomChainingProperty] = js.native
    
    /**
      * The **`-ms-content-zoom-limit`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-content-zoom-limit-min` and `-ms-content-zoom-limit-max` properties.
      *
      * **Syntax**: `<'-ms-content-zoom-limit-min'> <'-ms-content-zoom-limit-max'>`
      */
    var msContentZoomLimit: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The **`-ms-content-zoom-limit-max`** CSS property is a Microsoft extension that specifies the selected elements' maximum zoom factor.
      *
      * **Syntax**: `<percentage>`
      *
      * **Initial value**: `400%`
      */
    var msContentZoomLimitMax: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The **`-ms-content-zoom-limit-min`** CSS property is a Microsoft extension that specifies the minimum zoom factor.
      *
      * **Syntax**: `<percentage>`
      *
      * **Initial value**: `100%`
      */
    var msContentZoomLimitMin: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The **`-ms-content-zoom-snap`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-content-zoom-snap-type` and `-ms-content-zoom-snap-points` properties.
      *
      * **Syntax**: `<'-ms-content-zoom-snap-type'> || <'-ms-content-zoom-snap-points'>`
      */
    var msContentZoomSnap: js.UndefOr[MsContentZoomSnapProperty] = js.native
    
    /**
      * The **`-ms-content-zoom-snap-points`** CSS property is a Microsoft extension that specifies where zoom snap-points are located.
      *
      * **Syntax**: `snapInterval( <percentage>, <percentage> ) | snapList( <percentage># )`
      *
      * **Initial value**: `snapInterval(0%, 100%)`
      */
    var msContentZoomSnapPoints: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The **`-ms-content-zoom-snap-type`** CSS property is a Microsoft extension that specifies how zooming is affected by defined snap-points.
      *
      * **Syntax**: `none | proximity | mandatory`
      *
      * **Initial value**: `none`
      */
    var msContentZoomSnapType: js.UndefOr[MsContentZoomSnapTypeProperty] = js.native
    
    /**
      * The **`-ms-content-zooming`** CSS property is a Microsoft extension that specifies whether zooming is enabled.
      *
      * **Syntax**: `none | zoom`
      *
      * **Initial value**: zoom for the top level element, none for all other elements
      */
    var msContentZooming: js.UndefOr[MsContentZoomingProperty] = js.native
    
    /**
      * The `-ms-filter` CSS property is a Microsoft extension that sets or retrieves the filter or collection of filters applied to an object.
      *
      * **Syntax**: `<string>`
      *
      * **Initial value**: "" (the empty string)
      */
    var msFilter: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The **`flex`** CSS property sets how a flex item will grow or shrink to fit the space available in its flex container. It is a shorthand for `flex-grow`, `flex-shrink`, and `flex-basis`.
      *
      * **Syntax**: `none | [ <'flex-grow'> <'flex-shrink'>? || <'flex-basis'> ]`
      */
    var msFlex: js.UndefOr[FlexProperty[String | Double]] = js.native
    
    /**
      * The **`flex-direction`** CSS property sets how flex items are placed in the flex container defining the main axis and the direction (normal or reversed).
      *
      * **Syntax**: `row | row-reverse | column | column-reverse`
      *
      * **Initial value**: `row`
      */
    var msFlexDirection: js.UndefOr[FlexDirectionProperty] = js.native
    
    /**
      * The **`flex-grow`** CSS property sets how much of the available space in the flex container should be assigned to that item (the flex grow factor). If all sibling items have the same flex grow factor, then all items will receive the same share of available space, otherwise it is distributed according to the ratio defined by the different flex grow factors.
      *
      * **Syntax**: `<number>`
      *
      * **Initial value**: `0`
      */
    var msFlexPositive: js.UndefOr[GlobalsNumber] = js.native
    
    /**
      * The **`-ms-flow-from`** CSS property is a Microsoft extension that gets or sets a value identifying a region container in the document that accepts the content flow from the data source.
      *
      * **Syntax**: `[ none | <custom-ident> ]#`
      *
      * **Initial value**: `none`
      */
    var msFlowFrom: js.UndefOr[MsFlowFromProperty] = js.native
    
    /**
      * The **`-ms-flow-into`** CSS property is a Microsoft extension that gets or sets a value identifying an iframe container in the document that serves as the region's data source.
      *
      * **Syntax**: `[ none | <custom-ident> ]#`
      *
      * **Initial value**: `none`
      */
    var msFlowInto: js.UndefOr[MsFlowIntoProperty] = js.native
    
    /**
      * The **`grid-template-columns`** CSS property defines the line names and track sizing functions of the grid columns.
      *
      * **Syntax**: `none | <track-list> | <auto-track-list>`
      *
      * **Initial value**: `none`
      */
    var msGridColumns: js.UndefOr[MsGridColumnsProperty[String | Double]] = js.native
    
    /**
      * The **`grid-template-rows`** CSS property defines the line names and track sizing functions of the grid rows.
      *
      * **Syntax**: `none | <track-list> | <auto-track-list>`
      *
      * **Initial value**: `none`
      */
    var msGridRows: js.UndefOr[MsGridRowsProperty[String | Double]] = js.native
    
    /**
      * The **`-ms-high-contrast-adjust`** CSS property is a Microsoft extension that gets or sets a value indicating whether to override any CSS properties that would have been set in high contrast mode.
      *
      * **Syntax**: `auto | none`
      *
      * **Initial value**: `auto`
      */
    var msHighContrastAdjust: js.UndefOr[MsHighContrastAdjustProperty] = js.native
    
    /**
      * The **`-ms-hyphenate-limit-chars`** CSS property is a Microsoft extension that specifies one to three values indicating the minimum number of characters in a hyphenated word. If the word does not meet the required minimum number of characters in the word, before the hyphen, or after the hyphen, then the word is not hyphenated.
      *
      * **Syntax**: `auto | <integer>{1,3}`
      *
      * **Initial value**: `auto`
      */
    var msHyphenateLimitChars: js.UndefOr[MsHyphenateLimitCharsProperty] = js.native
    
    /**
      * The **`-ms-hyphenate-limit-lines`** CSS property is a Microsoft extension specifying the maximum number of consecutive lines in an element that may be ended with a hyphenated word.
      *
      * **Syntax**: `no-limit | <integer>`
      *
      * **Initial value**: `no-limit`
      */
    var msHyphenateLimitLines: js.UndefOr[MsHyphenateLimitLinesProperty] = js.native
    
    /**
      * The `**-ms-hyphenate-limit-zone**` CSS property is a Microsoft extension specifying the width of the hyphenation zone.
      *
      * **Syntax**: `<percentage> | <length>`
      *
      * **Initial value**: `0`
      */
    var msHyphenateLimitZone: js.UndefOr[MsHyphenateLimitZoneProperty[String | Double]] = js.native
    
    /**
      * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. You can prevent hyphenation entirely, use hyphenation in manually-specified points within the text, or let the browser automatically insert hyphens where appropriate.
      *
      * **Syntax**: `none | manual | auto`
      *
      * **Initial value**: `manual`
      */
    var msHyphens: js.UndefOr[HyphensProperty] = js.native
    
    /**
      * The **`-ms-ime-align`** CSS property is a Microsoft extension aligning the Input Method Editor (IME) candidate window box relative to the element on which the IME composition is active. The extension is implemented in Microsoft Edge and Internet Explorer 11.
      *
      * **Syntax**: `auto | after`
      *
      * **Initial value**: `auto`
      */
    var msImeAlign: js.UndefOr[MsImeAlignProperty] = js.native
    
    /**
      * The **`ime-mode`** CSS property controls the state of the input method editor (IME) for text fields. This property is obsolete.
      *
      * **Syntax**: `auto | normal | active | inactive | disabled`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var msImeMode: js.UndefOr[ImeModeProperty] = js.native
    
    /**
      * The CSS **`justify-self`** property set the way a box is justified inside its alignment container along the appropriate axis.
      *
      * **Syntax**: `auto | normal | stretch | <baseline-position> | <overflow-position>? [ <self-position> | left | right ]`
      *
      * **Initial value**: `auto`
      */
    var msJustifySelf: js.UndefOr[JustifySelfProperty] = js.native
    
    /**
      * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
      *
      * **Syntax**: `auto | loose | normal | strict | anywhere`
      *
      * **Initial value**: `auto`
      */
    var msLineBreak: js.UndefOr[LineBreakProperty] = js.native
    
    /**
      * The **`order`** CSS property sets the order to lay out an item in a flex or grid container. Items in a container are sorted by ascending `order` value and then by their source code order.
      *
      * **Syntax**: `<integer>`
      *
      * **Initial value**: `0`
      */
    var msOrder: js.UndefOr[GlobalsNumber] = js.native
    
    /**
      * The **`-ms-overflow-style`** CSS property is a Microsoft extension controlling the behavior of scrollbars when the content of an element overflows.
      *
      * **Syntax**: `auto | none | scrollbar | -ms-autohiding-scrollbar`
      *
      * **Initial value**: `auto`
      */
    var msOverflowStyle: js.UndefOr[MsOverflowStyleProperty] = js.native
    
    /**
      * The **`overflow-x`** CSS property sets what shows when content overflows a block-level element's left and right edges. This may be nothing, a scroll bar, or the overflow content.
      *
      * **Syntax**: `visible | hidden | clip | scroll | auto`
      *
      * **Initial value**: `visible`
      */
    var msOverflowX: js.UndefOr[OverflowXProperty] = js.native
    
    /**
      * The **`overflow-y`** CSS property sets what shows when content overflows a block-level element's top and bottom edges. This may be nothing, a scroll bar, or the overflow content.
      *
      * **Syntax**: `visible | hidden | clip | scroll | auto`
      *
      * **Initial value**: `visible`
      */
    var msOverflowY: js.UndefOr[OverflowYProperty] = js.native
    
    /**
      * The `**-ms-scroll-chaining**` CSS property is a Microsoft extension that specifies the scrolling behavior that occurs when a user hits the scroll limit during a manipulation.
      *
      * **Syntax**: `chained | none`
      *
      * **Initial value**: `chained`
      */
    var msScrollChaining: js.UndefOr[MsScrollChainingProperty] = js.native
    
    /**
      * The **\-ms-scroll-limit** CSS property is a Microsoft extension that specifies values for the `-ms-scroll-limit-x-min`, `-ms-scroll-limit-y-min`, `-ms-scroll-limit-x-max`, and `-ms-scroll-limit-y-max` properties.
      *
      * **Syntax**: `<'-ms-scroll-limit-x-min'> <'-ms-scroll-limit-y-min'> <'-ms-scroll-limit-x-max'> <'-ms-scroll-limit-y-max'>`
      */
    var msScrollLimit: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The `**-ms-scroll-limit-x-max**` CSS property is a Microsoft extension that specifies the maximum value for the `Element.scrollLeft` property.
      *
      * **Syntax**: `auto | <length>`
      *
      * **Initial value**: `auto`
      */
    var msScrollLimitXMax: js.UndefOr[MsScrollLimitXMaxProperty[String | Double]] = js.native
    
    /**
      * The **`-ms-scroll-limit-x-min`** CSS property is a Microsoft extension that specifies the minimum value for the `Element.scrollLeft` property.
      *
      * **Syntax**: `<length>`
      *
      * **Initial value**: `0`
      */
    var msScrollLimitXMin: js.UndefOr[MsScrollLimitXMinProperty[String | Double]] = js.native
    
    /**
      * The **`-ms-scroll-limit-y-max`** CSS property is a Microsoft extension that specifies the maximum value for the `Element.scrollTop` property.
      *
      * **Syntax**: `auto | <length>`
      *
      * **Initial value**: `auto`
      */
    var msScrollLimitYMax: js.UndefOr[MsScrollLimitYMaxProperty[String | Double]] = js.native
    
    /**
      * The **`-ms-scroll-limit-y-min`** CSS property is a Microsoft extension that specifies the minimum value for the `Element.scrollTop` property.
      *
      * **Syntax**: `<length>`
      *
      * **Initial value**: `0`
      */
    var msScrollLimitYMin: js.UndefOr[MsScrollLimitYMinProperty[String | Double]] = js.native
    
    /**
      * The **`-ms-scroll-rails`** CSS property is a Microsoft extension that specifies whether scrolling locks to the primary axis of motion.
      *
      * **Syntax**: `none | railed`
      *
      * **Initial value**: `railed`
      */
    var msScrollRails: js.UndefOr[MsScrollRailsProperty] = js.native
    
    /**
      * The **`-ms-scroll-snap-points-x`** CSS property is a Microsoft extension that specifies where snap-points will be located along the x-axis.
      *
      * **Syntax**: `snapInterval( <length-percentage>, <length-percentage> ) | snapList( <length-percentage># )`
      *
      * **Initial value**: `snapInterval(0px, 100%)`
      */
    var msScrollSnapPointsX: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The **`-ms-scroll-snap-points-y`** CSS property is a Microsoft extension that specifies where snap-points will be located along the y-axis.
      *
      * **Syntax**: `snapInterval( <length-percentage>, <length-percentage> ) | snapList( <length-percentage># )`
      *
      * **Initial value**: `snapInterval(0px, 100%)`
      */
    var msScrollSnapPointsY: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The **`scroll-snap-type`** CSS property sets how strictly snap points are enforced on the scroll container in case there is one.
      *
      * **Syntax**: `none | proximity | mandatory`
      *
      * **Initial value**: `none`
      */
    var msScrollSnapType: js.UndefOr[MsScrollSnapTypeProperty] = js.native
    
    /**
      * The **`-ms-scroll-snap-x`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-scroll-snap-type` and `-ms-scroll-snap-points-x` properties.
      *
      * **Syntax**: `<'-ms-scroll-snap-type'> <'-ms-scroll-snap-points-x'>`
      */
    var msScrollSnapX: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The **`-ms-scroll-snap-x`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-scroll-snap-type` and `-ms-scroll-snap-points-y` properties.
      *
      * **Syntax**: `<'-ms-scroll-snap-type'> <'-ms-scroll-snap-points-y'>`
      */
    var msScrollSnapY: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The **`-ms-scroll-translation`** CSS property is a Microsoft extension that specifies whether vertical-to-horizontal scroll wheel translation occurs on the specified element.
      *
      * **Syntax**: `none | vertical-to-horizontal`
      *
      * **Initial value**: `none`
      */
    var msScrollTranslation: js.UndefOr[MsScrollTranslationProperty] = js.native
    
    /**
      * The **`-ms-scrollbar-3dlight-color`** CSS property is a Microsoft extension specifying the color of the top and left edges of the scroll box and scroll arrows of a scroll bar.
      *
      * **Syntax**: `<color>`
      *
      * **Initial value**: depends on user agent
      */
    var msScrollbar3dlightColor: js.UndefOr[MsScrollbar3dlightColorProperty] = js.native
    
    /**
      * The **`-ms-scrollbar-arrow-color`** CSS property is a Microsoft extension that specifies the color of the arrow elements of a scroll arrow.
      *
      * **Syntax**: `<color>`
      *
      * **Initial value**: `ButtonText`
      */
    var msScrollbarArrowColor: js.UndefOr[MsScrollbarArrowColorProperty] = js.native
    
    /**
      * The `**-ms-scrollbar-base-color**` CSS property is a Microsoft extension that specifies the base color of the main elements of a scroll bar.
      *
      * **Syntax**: `<color>`
      *
      * **Initial value**: depends on user agent
      */
    var msScrollbarBaseColor: js.UndefOr[MsScrollbarBaseColorProperty] = js.native
    
    /**
      * The **`-ms-scrollbar-darkshadow-color`** CSS property is a Microsoft extension that specifies the color of a scroll bar's gutter.
      *
      * **Syntax**: `<color>`
      *
      * **Initial value**: `ThreeDDarkShadow`
      */
    var msScrollbarDarkshadowColor: js.UndefOr[MsScrollbarDarkshadowColorProperty] = js.native
    
    /**
      * The `**-ms-scrollbar-face-color**` CSS property is a Microsoft extension that specifies the color of the scroll box and scroll arrows of a scroll bar.
      *
      * **Syntax**: `<color>`
      *
      * **Initial value**: `ThreeDFace`
      */
    var msScrollbarFaceColor: js.UndefOr[MsScrollbarFaceColorProperty] = js.native
    
    /**
      * The `**-ms-scrollbar-highlight-color**` CSS property is a Microsoft extension that specifies the color of the slider tray, the top and left edges of the scroll box, and the scroll arrows of a scroll bar.
      *
      * **Syntax**: `<color>`
      *
      * **Initial value**: `ThreeDHighlight`
      */
    var msScrollbarHighlightColor: js.UndefOr[MsScrollbarHighlightColorProperty] = js.native
    
    /**
      * The **`-ms-scrollbar-shadow-color`** CSS property is a Microsoft extension that specifies the color of the bottom and right edges of the scroll box and scroll arrows of a scroll bar.
      *
      * **Syntax**: `<color>`
      *
      * **Initial value**: `ThreeDDarkShadow`
      */
    var msScrollbarShadowColor: js.UndefOr[MsScrollbarShadowColorProperty] = js.native
    
    /**
      * The **`-ms-scrollbar-track-color`** CSS property is a Microsoft extension that specifies the color of the track element of a scrollbar.
      *
      * **Syntax**: `<color>`
      *
      * **Initial value**: `Scrollbar`
      *
      * @deprecated
      */
    var msScrollbarTrackColor: js.UndefOr[MsScrollbarTrackColorProperty] = js.native
    
    /**
      * The **`-ms-text-autospace`** CSS property is a Microsoft extension that specifies the autospacing and narrow space width adjustment of text.
      *
      * **Syntax**: `none | ideograph-alpha | ideograph-numeric | ideograph-parenthesis | ideograph-space`
      *
      * **Initial value**: `none`
      */
    var msTextAutospace: js.UndefOr[MsTextAutospaceProperty] = js.native
    
    /**
      * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
      *
      * **Syntax**: `none | all | [ digits <integer>? ]`
      *
      * **Initial value**: `none`
      */
    var msTextCombineHorizontal: js.UndefOr[TextCombineUprightProperty] = js.native
    
    /**
      * The **`text-overflow`** CSS property sets how hidden overflow content is signaled to users. It can be clipped, display an ellipsis ('`…`'), or display a custom string.
      *
      * **Syntax**: `[ clip | ellipsis | <string> ]{1,2}`
      *
      * **Initial value**: `clip`
      */
    var msTextOverflow: js.UndefOr[TextOverflowProperty] = js.native
    
    /**
      * The **`touch-action`** CSS property sets how a region can be manipulated by a touchscreen user (for example, by zooming features built into the browser).
      *
      * **Syntax**: `auto | none | [ [ pan-x | pan-left | pan-right ] || [ pan-y | pan-up | pan-down ] || pinch-zoom ] | manipulation`
      *
      * **Initial value**: `auto`
      */
    var msTouchAction: js.UndefOr[TouchActionProperty] = js.native
    
    /**
      * The **`-ms-touch-select`** CSS property is a Microsoft extension that toggles the gripper visual elements that enable touch text selection.
      *
      * **Syntax**: `grippers | none`
      *
      * **Initial value**: `grippers`
      */
    var msTouchSelect: js.UndefOr[MsTouchSelectProperty] = js.native
    
    /**
      * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
      *
      * **Syntax**: `none | <transform-list>`
      *
      * **Initial value**: `none`
      */
    var msTransform: js.UndefOr[TransformProperty] = js.native
    
    /**
      * The **`transform-origin`** CSS property sets the origin for an element's transformations.
      *
      * **Syntax**: `[ <length-percentage> | left | center | right | top | bottom ] | [ [ <length-percentage> | left | center | right ] && [ <length-percentage> | top | center | bottom ] ] <length>?`
      *
      * **Initial value**: `50% 50% 0`
      */
    var msTransformOrigin: js.UndefOr[TransformOriginProperty[String | Double]] = js.native
    
    /**
      * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
      *
      * **Syntax**: `<single-transition>#`
      */
    var msTransition: js.UndefOr[TransitionProperty] = js.native
    
    /**
      * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
      *
      * **Syntax**: `<time>#`
      *
      * **Initial value**: `0s`
      */
    var msTransitionDelay: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
      *
      * **Syntax**: `<time>#`
      *
      * **Initial value**: `0s`
      */
    var msTransitionDuration: js.UndefOr[GlobalsString] = js.native
    
    /**
      * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
      *
      * **Syntax**: `none | <single-transition-property>#`
      *
      * **Initial value**: all
      */
    var msTransitionProperty: js.UndefOr[TransitionPropertyProperty] = js.native
    
    /**
      * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
      *
      * **Syntax**: `<timing-function>#`
      *
      * **Initial value**: `ease`
      */
    var msTransitionTimingFunction: js.UndefOr[TransitionTimingFunctionProperty] = js.native
    
    /**
      * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
      *
      * **Syntax**: `none | element | text`
      *
      * **Initial value**: `text`
      */
    var msUserSelect: js.UndefOr[MsUserSelectProperty] = js.native
    
    /**
      * The **`word-break`** CSS property sets whether line breaks appear wherever the text would otherwise overflow its content box.
      *
      * **Syntax**: `normal | break-all | keep-all | break-word`
      *
      * **Initial value**: `normal`
      */
    var msWordBreak: js.UndefOr[WordBreakProperty] = js.native
    
    /**
      * The **`-ms-wrap-flow`** CSS property is a Microsoft extension that specifies how exclusions impact inline content within block-level elements.
      *
      * **Syntax**: `auto | both | start | end | maximum | clear`
      *
      * **Initial value**: `auto`
      */
    var msWrapFlow: js.UndefOr[MsWrapFlowProperty] = js.native
    
    /**
      * The **`-ms-wrap-margin`** CSS property is a Microsoft extension that specifies a margin that offsets the inner wrap shape from other shapes.
      *
      * **Syntax**: `<length>`
      *
      * **Initial value**: `0`
      */
    var msWrapMargin: js.UndefOr[MsWrapMarginProperty[String | Double]] = js.native
    
    /**
      * The **`-ms-wrap-through`** CSS property is a Microsoft extension that specifies how content should wrap around an exclusion element.
      *
      * **Syntax**: `wrap | none`
      *
      * **Initial value**: `wrap`
      */
    var msWrapThrough: js.UndefOr[MsWrapThroughProperty] = js.native
    
    /**
      * The **`writing-mode`** CSS property sets whether lines of text are laid out horizontally or vertically, as well as the direction in which blocks progress.
      *
      * **Syntax**: `horizontal-tb | vertical-rl | vertical-lr | sideways-rl | sideways-lr`
      *
      * **Initial value**: `horizontal-tb`
      */
    var msWritingMode: js.UndefOr[WritingModeProperty] = js.native
    
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
    var objectFit: js.UndefOr[ObjectFitProperty] = js.native
    
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
    var objectPosition: js.UndefOr[ObjectPositionProperty[String | Double]] = js.native
    
    /**
      * The **`offset`** CSS property is a shorthand property for animating an element along a defined path.
      *
      * **Syntax**: `[ <'offset-position'>? [ <'offset-path'> [ <'offset-distance'> || <'offset-rotate'> ]? ]? ]! [ / <'offset-anchor'> ]?`
      *
      * |    Chrome     | Firefox | Safari |  Edge  | IE  |
      * | :-----------: | :-----: | :----: | :----: | :-: |
      * |    **55**     | **72**  |   No   | **79** | No  |
      * | 46 _(motion)_ |         |        |        |     |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/offset
      */
    var offset: js.UndefOr[OffsetProperty[String | Double]] = js.native
    
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
    var offsetAnchor: js.UndefOr[OffsetAnchorProperty[String | Double]] = js.native
    
    /**
      * The **`inset-block`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'top'>{1,2}`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var offsetBlock: js.UndefOr[InsetBlockProperty[String | Double]] = js.native
    
    /**
      * The **`inset-block-end`** CSS property defines the logical block end offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'top'>`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var offsetBlockEnd: js.UndefOr[InsetBlockEndProperty[String | Double]] = js.native
    
    /**
      * The **`inset-block-start`** CSS property defines the logical block start offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'top'>`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var offsetBlockStart: js.UndefOr[InsetBlockStartProperty[String | Double]] = js.native
    
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
    var offsetDistance: js.UndefOr[OffsetDistanceProperty[String | Double]] = js.native
    
    /**
      * The **`inset-inline`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'top'>{1,2}`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var offsetInline: js.UndefOr[InsetInlineProperty[String | Double]] = js.native
    
    /**
      * The **`inset-inline-end`** CSS property defines the logical inline end inset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'top'>`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var offsetInlineEnd: js.UndefOr[InsetInlineEndProperty[String | Double]] = js.native
    
    /**
      * The **`inset-inline-start`** CSS property defines the logical inline start inset of an element, which maps to a physical offset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'top'>`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var offsetInlineStart: js.UndefOr[InsetInlineStartProperty[String | Double]] = js.native
    
    /**
      * The **`offset-path`** CSS property specifies a motion path for an element to follow and defines the element's positioning within the parent container or SVG coordinate system.
      *
      * **Syntax**: `none | ray( [ <angle> && <size> && contain? ] ) | <path()> | <url> | [ <basic-shape> || <geometry-box> ]`
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
    var offsetPath: js.UndefOr[OffsetPathProperty] = js.native
    
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
    var offsetRotate: js.UndefOr[OffsetRotateProperty] = js.native
    
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
    var offsetRotation: js.UndefOr[OffsetRotateProperty] = js.native
    
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
    var opacity: js.UndefOr[OpacityProperty] = js.native
    
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
    var order: js.UndefOr[GlobalsNumber] = js.native
    
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
    var orphans: js.UndefOr[GlobalsNumber] = js.native
    
    /**
      * The **`outline`** CSS property is a shorthand to set various outline properties in a single declaration: `outline-style`, `outline-width`, and `outline-color`.
      *
      * **Syntax**: `[ <'outline-color'> || <'outline-style'> || <'outline-width'> ]`
      *
      * | Chrome | Firefox | Safari  |  Edge  |  IE   |
      * | :----: | :-----: | :-----: | :----: | :---: |
      * | **1**  | **1.5** | **1.2** | **12** | **8** |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/outline
      */
    var outline: js.UndefOr[OutlineProperty[String | Double]] = js.native
    
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
    var outlineColor: js.UndefOr[OutlineColorProperty] = js.native
    
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
    var outlineOffset: js.UndefOr[OutlineOffsetProperty[String | Double]] = js.native
    
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
    var outlineStyle: js.UndefOr[OutlineStyleProperty] = js.native
    
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
    var outlineWidth: js.UndefOr[OutlineWidthProperty[String | Double]] = js.native
    
    /**
      * The **`overflow`** CSS property sets what to do when an element's content is too big to fit in its block formatting context. It is a shorthand for `overflow-x` and `overflow-y`.
      *
      * **Syntax**: `[ visible | hidden | clip | scroll | auto ]{1,2}`
      *
      * **Initial value**: `visible`
      *
      * | Chrome | Firefox | Safari |  Edge  |  IE   |
      * | :----: | :-----: | :----: | :----: | :---: |
      * | **1**  |  **1**  | **1**  | **12** | **4** |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/overflow
      */
    var overflow: js.UndefOr[OverflowProperty] = js.native
    
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
    var overflowAnchor: js.UndefOr[OverflowAnchorProperty] = js.native
    
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
    var overflowBlock: js.UndefOr[OverflowBlockProperty] = js.native
    
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
    var overflowClipBox: js.UndefOr[OverflowClipBoxProperty] = js.native
    
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
    var overflowInline: js.UndefOr[OverflowInlineProperty] = js.native
    
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
    var overflowWrap: js.UndefOr[OverflowWrapProperty] = js.native
    
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
    var overflowX: js.UndefOr[OverflowXProperty] = js.native
    
    /**
      * The **`overflow-y`** CSS property sets what shows when content overflows a block-level element's top and bottom edges. This may be nothing, a scroll bar, or the overflow content.
      *
      * **Syntax**: `visible | hidden | clip | scroll | auto`
      *
      * **Initial value**: `visible`
      *
      * | Chrome | Firefox | Safari |  Edge  |  IE   |
      * | :----: | :-----: | :----: | :----: | :---: |
      * | **1**  | **3.5** | **3**  | **12** | **5** |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/overflow-y
      */
    var overflowY: js.UndefOr[OverflowYProperty] = js.native
    
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
    var overscrollBehavior: js.UndefOr[OverscrollBehaviorProperty] = js.native
    
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
    var overscrollBehaviorBlock: js.UndefOr[OverscrollBehaviorBlockProperty] = js.native
    
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
    var overscrollBehaviorInline: js.UndefOr[OverscrollBehaviorInlineProperty] = js.native
    
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
    var overscrollBehaviorX: js.UndefOr[OverscrollBehaviorXProperty] = js.native
    
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
    var overscrollBehaviorY: js.UndefOr[OverscrollBehaviorYProperty] = js.native
    
    /**
      * The **`padding`** CSS property sets the padding area on all four sides of an element. It is a shorthand for `padding-top`, `padding-right`, `padding-bottom`, and `padding-left`.
      *
      * **Syntax**: `[ <length> | <percentage> ]{1,4}`
      *
      * | Chrome | Firefox | Safari |  Edge  |  IE   |
      * | :----: | :-----: | :----: | :----: | :---: |
      * | **1**  |  **1**  | **1**  | **12** | **4** |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/padding
      */
    var padding: js.UndefOr[PaddingProperty[String | Double]] = js.native
    
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
    var paddingBlock: js.UndefOr[PaddingBlockProperty[String | Double]] = js.native
    
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
    var paddingBlockEnd: js.UndefOr[PaddingBlockEndProperty[String | Double]] = js.native
    
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
    var paddingBlockStart: js.UndefOr[PaddingBlockStartProperty[String | Double]] = js.native
    
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
    var paddingBottom: js.UndefOr[PaddingBottomProperty[String | Double]] = js.native
    
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
    var paddingInline: js.UndefOr[PaddingInlineProperty[String | Double]] = js.native
    
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
    var paddingInlineEnd: js.UndefOr[PaddingInlineEndProperty[String | Double]] = js.native
    
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
    var paddingInlineStart: js.UndefOr[PaddingInlineStartProperty[String | Double]] = js.native
    
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
    var paddingLeft: js.UndefOr[PaddingLeftProperty[String | Double]] = js.native
    
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
    var paddingRight: js.UndefOr[PaddingRightProperty[String | Double]] = js.native
    
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
    var paddingTop: js.UndefOr[PaddingTopProperty[String | Double]] = js.native
    
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
    var pageBreakAfter: js.UndefOr[PageBreakAfterProperty] = js.native
    
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
    var pageBreakBefore: js.UndefOr[PageBreakBeforeProperty] = js.native
    
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
    var pageBreakInside: js.UndefOr[PageBreakInsideProperty] = js.native
    
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
    var paintOrder: js.UndefOr[PaintOrderProperty] = js.native
    
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
    var perspective: js.UndefOr[PerspectiveProperty[String | Double]] = js.native
    
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
    var perspectiveOrigin: js.UndefOr[PerspectiveOriginProperty[String | Double]] = js.native
    
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
    var placeContent: js.UndefOr[PlaceContentProperty] = js.native
    
    /**
      * The CSS **`place-items`** shorthand property sets the `align-items` and `justify-items` properties, respectively. If the second value is not set, the first value is also used for it.
      *
      * **Syntax**: `<'align-items'> <'justify-items'>?`
      *
      * ---
      *
      * _Supported in Flex Layout_
      *
      * | Chrome | Firefox | Safari |  Edge  | IE  |
      * | :----: | :-----: | :----: | :----: | :-: |
      * | **59** | **45**  | **11** | **79** | No  |
      *
      * ---
      *
      * _Supported in Grid Layout_
      *
      * | Chrome | Firefox | Safari |  Edge  | IE  |
      * | :----: | :-----: | :----: | :----: | :-: |
      * | **59** | **45**  | **11** | **79** | No  |
      *
      * ---
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/place-items
      */
    var placeItems: js.UndefOr[PlaceItemsProperty] = js.native
    
    /**
      * The **`place-self`** CSS property is a shorthand property sets both the `align-self` and `justify-self` properties. The first value is the `align-self` property value, the second the `justify-self` one. If the second value is not present, the first value is also used for it.
      *
      * **Syntax**: `<'align-self'> <'justify-self'>?`
      *
      * ---
      *
      * _Supported in Flex Layout_
      *
      * | Chrome | Firefox | Safari |  Edge  | IE  |
      * | :----: | :-----: | :----: | :----: | :-: |
      * | **59** | **45**  | **11** | **79** | No  |
      *
      * ---
      *
      * _Supported in Grid Layout_
      *
      * | Chrome | Firefox | Safari |  Edge  | IE  |
      * | :----: | :-----: | :----: | :----: | :-: |
      * | **59** | **45**  | **11** | **79** | No  |
      *
      * ---
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/place-self
      */
    var placeSelf: js.UndefOr[PlaceSelfProperty] = js.native
    
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
    var pointerEvents: js.UndefOr[PointerEventsProperty] = js.native
    
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
    var position: js.UndefOr[PositionProperty] = js.native
    
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
    var quotes: js.UndefOr[QuotesProperty] = js.native
    
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
    var resize: js.UndefOr[ResizeProperty] = js.native
    
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
    var right: js.UndefOr[RightProperty[String | Double]] = js.native
    
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
    var rotate: js.UndefOr[RotateProperty] = js.native
    
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
      * | Chrome | Firefox | Safari |  Edge  | IE  |
      * | :----: | :-----: | :----: | :----: | :-: |
      * | **84** | **63**  |   No   | **84** | No  |
      *
      * ---
      *
      * _Supported in Grid Layout_
      *
      * |       Chrome        |       Firefox       |        Safari         |  Edge  | IE  |
      * | :-----------------: | :-----------------: | :-------------------: | :----: | :-: |
      * |       **66**        |       **61**        |       **12.1**        | **16** | No  |
      * | 57 _(grid-row-gap)_ | 52 _(grid-row-gap)_ | 10.1 _(grid-row-gap)_ |        |     |
      *
      * ---
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/row-gap
      */
    var rowGap: js.UndefOr[RowGapProperty[String | Double]] = js.native
    
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
    var rubyAlign: js.UndefOr[RubyAlignProperty] = js.native
    
    /**
      * **Syntax**: `separate | collapse | auto`
      *
      * **Initial value**: `separate`
      */
    var rubyMerge: js.UndefOr[RubyMergeProperty] = js.native
    
    /**
      * The `**ruby-position**` CSS property defines the position of a ruby element relatives to its base element. It can be position over the element (`over`), under it (`under`), or between the characters, on their right side (`inter-character`).
      *
      * **Syntax**: `over | under | inter-character`
      *
      * **Initial value**: `over`
      *
      * | Chrome  | Firefox |    Safari     | Edge  | IE  |
      * | :-----: | :-----: | :-----------: | :---: | :-: |
      * | **84**  | **38**  | **6.1** _-x-_ | 12-79 | No  |
      * | 1 _-x-_ |         |               |       |     |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/ruby-position
      */
    var rubyPosition: js.UndefOr[RubyPositionProperty] = js.native
    
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
    var scale: js.UndefOr[ScaleProperty] = js.native
    
    /**
      * The **`scroll-behavior`** CSS property sets the behavior for a scrolling box when scrolling is triggered by the navigation or CSSOM scrolling APIs.
      *
      * **Syntax**: `auto | smooth`
      *
      * **Initial value**: `auto`
      *
      * | Chrome | Firefox | Safari |  Edge  | IE  |
      * | :----: | :-----: | :----: | :----: | :-: |
      * | **61** | **36**  | **14** | **79** | No  |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/scroll-behavior
      */
    var scrollBehavior: js.UndefOr[ScrollBehaviorProperty] = js.native
    
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
    var scrollMargin: js.UndefOr[ScrollMarginProperty[String | Double]] = js.native
    
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
    var scrollMarginBlock: js.UndefOr[ScrollMarginBlockProperty[String | Double]] = js.native
    
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
    var scrollMarginBlockEnd: js.UndefOr[ScrollMarginBlockEndProperty[String | Double]] = js.native
    
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
    var scrollMarginBlockStart: js.UndefOr[ScrollMarginBlockStartProperty[String | Double]] = js.native
    
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
    var scrollMarginBottom: js.UndefOr[ScrollMarginBottomProperty[String | Double]] = js.native
    
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
    var scrollMarginInline: js.UndefOr[ScrollMarginInlineProperty[String | Double]] = js.native
    
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
    var scrollMarginInlineEnd: js.UndefOr[ScrollMarginInlineEndProperty[String | Double]] = js.native
    
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
    var scrollMarginInlineStart: js.UndefOr[ScrollMarginInlineStartProperty[String | Double]] = js.native
    
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
    var scrollMarginLeft: js.UndefOr[ScrollMarginLeftProperty[String | Double]] = js.native
    
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
    var scrollMarginRight: js.UndefOr[ScrollMarginRightProperty[String | Double]] = js.native
    
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
    var scrollMarginTop: js.UndefOr[ScrollMarginTopProperty[String | Double]] = js.native
    
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
    var scrollPadding: js.UndefOr[ScrollPaddingProperty[String | Double]] = js.native
    
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
    var scrollPaddingBlock: js.UndefOr[ScrollPaddingBlockProperty[String | Double]] = js.native
    
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
    var scrollPaddingBlockEnd: js.UndefOr[ScrollPaddingBlockEndProperty[String | Double]] = js.native
    
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
    var scrollPaddingBlockStart: js.UndefOr[ScrollPaddingBlockStartProperty[String | Double]] = js.native
    
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
    var scrollPaddingBottom: js.UndefOr[ScrollPaddingBottomProperty[String | Double]] = js.native
    
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
    var scrollPaddingInline: js.UndefOr[ScrollPaddingInlineProperty[String | Double]] = js.native
    
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
    var scrollPaddingInlineEnd: js.UndefOr[ScrollPaddingInlineEndProperty[String | Double]] = js.native
    
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
    var scrollPaddingInlineStart: js.UndefOr[ScrollPaddingInlineStartProperty[String | Double]] = js.native
    
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
    var scrollPaddingLeft: js.UndefOr[ScrollPaddingLeftProperty[String | Double]] = js.native
    
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
    var scrollPaddingRight: js.UndefOr[ScrollPaddingRightProperty[String | Double]] = js.native
    
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
    var scrollPaddingTop: js.UndefOr[ScrollPaddingTopProperty[String | Double]] = js.native
    
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
    var scrollSnapAlign: js.UndefOr[ScrollSnapAlignProperty] = js.native
    
    /**
      * The **`scroll-snap-coordinate`** CSS property defines the x and y coordinate positions within an element that will align with its nearest ancestor scroll container's `scroll-snap-destination` for each respective axis.
      *
      * **Syntax**: `none | <position>#`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var scrollSnapCoordinate: js.UndefOr[ScrollSnapCoordinateProperty[String | Double]] = js.native
    
    /**
      * The **`scroll-snap-destination`** CSS property defines the position in x and y coordinates within the scroll container's visual viewport which element snap points align with.
      *
      * **Syntax**: `<position>`
      *
      * **Initial value**: `0px 0px`
      *
      * @deprecated
      */
    var scrollSnapDestination: js.UndefOr[ScrollSnapDestinationProperty[String | Double]] = js.native
    
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
    var scrollSnapMargin: js.UndefOr[ScrollMarginProperty[String | Double]] = js.native
    
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
    var scrollSnapMarginBottom: js.UndefOr[ScrollMarginBottomProperty[String | Double]] = js.native
    
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
    var scrollSnapMarginLeft: js.UndefOr[ScrollMarginLeftProperty[String | Double]] = js.native
    
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
    var scrollSnapMarginRight: js.UndefOr[ScrollMarginRightProperty[String | Double]] = js.native
    
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
    var scrollSnapMarginTop: js.UndefOr[ScrollMarginTopProperty[String | Double]] = js.native
    
    /**
      * The **`scroll-snap-points-x`** CSS property defines the horizontal positioning of snap points within the content of the scroll container they are applied to.
      *
      * **Syntax**: `none | repeat( <length-percentage> )`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var scrollSnapPointsX: js.UndefOr[ScrollSnapPointsXProperty] = js.native
    
    /**
      * The **`scroll-snap-points-y`** CSS property defines the vertical positioning of snap points within the content of the scroll container they are applied to.
      *
      * **Syntax**: `none | repeat( <length-percentage> )`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var scrollSnapPointsY: js.UndefOr[ScrollSnapPointsYProperty] = js.native
    
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
    var scrollSnapStop: js.UndefOr[ScrollSnapStopProperty] = js.native
    
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
    var scrollSnapType: js.UndefOr[ScrollSnapTypeProperty] = js.native
    
    /**
      * The **`scroll-snap-type-x`** CSS property defines how strictly snap points are enforced on the horizontal axis of the scroll container in case there is one.
      *
      * **Syntax**: `none | mandatory | proximity`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var scrollSnapTypeX: js.UndefOr[ScrollSnapTypeXProperty] = js.native
    
    /**
      * The **`scroll-snap-type-y`** CSS property defines how strictly snap points are enforced on the vertical axis of the scroll container in case there is one.
      *
      * **Syntax**: `none | mandatory | proximity`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var scrollSnapTypeY: js.UndefOr[ScrollSnapTypeYProperty] = js.native
    
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
    var scrollbarColor: js.UndefOr[ScrollbarColorProperty] = js.native
    
    /**
      * The **`scrollbar-gutter`** CSS property allows authors to reserve space for the scrollbar, preventing unwanted layout changes as the content grows while also avoiding unnecessary visuals when scrolling isn't needed.
      *
      * **Syntax**: `auto | [ stable | always ] && both? && force?`
      *
      * **Initial value**: `auto`
      */
    var scrollbarGutter: js.UndefOr[ScrollbarGutterProperty] = js.native
    
    /**
      * The **`-ms-scrollbar-track-color`** CSS property is a Microsoft extension that specifies the color of the track element of a scrollbar.
      *
      * **Syntax**: `<color>`
      *
      * **Initial value**: `Scrollbar`
      *
      * @deprecated
      */
    var scrollbarTrackColor: js.UndefOr[MsScrollbarTrackColorProperty] = js.native
    
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
    var scrollbarWidth: js.UndefOr[ScrollbarWidthProperty] = js.native
    
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
    var shapeImageThreshold: js.UndefOr[ShapeImageThresholdProperty] = js.native
    
    /**
      * The **`shape-margin`** CSS property sets a margin for a CSS shape created using `shape-outside`.
      *
      * **Syntax**: `<length-percentage>`
      *
      * **Initial value**: `0`
      *
      * | Chrome | Firefox |  Safari  |  Edge  | IE  |
      * | :----: | :-----: | :------: | :----: | :-: |
      * | **37** | **62**  | **10.1** | **79** | No  |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/shape-margin
      */
    var shapeMargin: js.UndefOr[ShapeMarginProperty[String | Double]] = js.native
    
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
    var shapeOutside: js.UndefOr[ShapeOutsideProperty] = js.native
    
    var shapeRendering: js.UndefOr[ShapeRenderingProperty] = js.native
    
    var stopColor: js.UndefOr[StopColorProperty] = js.native
    
    var stopOpacity: js.UndefOr[GlobalsNumber] = js.native
    
    var stroke: js.UndefOr[StrokeProperty] = js.native
    
    var strokeDasharray: js.UndefOr[StrokeDasharrayProperty[String | Double]] = js.native
    
    var strokeDashoffset: js.UndefOr[StrokeDashoffsetProperty[String | Double]] = js.native
    
    var strokeLinecap: js.UndefOr[StrokeLinecapProperty] = js.native
    
    var strokeLinejoin: js.UndefOr[StrokeLinejoinProperty] = js.native
    
    var strokeMiterlimit: js.UndefOr[GlobalsNumber] = js.native
    
    var strokeOpacity: js.UndefOr[GlobalsNumber] = js.native
    
    var strokeWidth: js.UndefOr[StrokeWidthProperty[String | Double]] = js.native
    
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
    var tabSize: js.UndefOr[TabSizeProperty[String | Double]] = js.native
    
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
    var tableLayout: js.UndefOr[TableLayoutProperty] = js.native
    
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
    var textAlign: js.UndefOr[TextAlignProperty] = js.native
    
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
    var textAlignLast: js.UndefOr[TextAlignLastProperty] = js.native
    
    var textAnchor: js.UndefOr[TextAnchorProperty] = js.native
    
    /**
      * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
      *
      * **Syntax**: `none | all | [ digits <integer>? ]`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var textCombineHorizontal: js.UndefOr[TextCombineUprightProperty] = js.native
    
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
    var textCombineUpright: js.UndefOr[TextCombineUprightProperty] = js.native
    
    /**
      * The **`text-decoration`** CSS property sets the appearance of decorative lines on text. It is a shorthand for `text-decoration-line`, `text-decoration-color`, and `text-decoration-style`.
      *
      * **Syntax**: `<'text-decoration-line'> || <'text-decoration-style'> || <'text-decoration-color'> || <'text-decoration-thickness'>`
      *
      * | Chrome | Firefox | Safari |  Edge  |  IE   |
      * | :----: | :-----: | :----: | :----: | :---: |
      * | **1**  |  **1**  | **1**  | **12** | **3** |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration
      */
    var textDecoration: js.UndefOr[TextDecorationProperty[String | Double]] = js.native
    
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
    var textDecorationColor: js.UndefOr[TextDecorationColorProperty] = js.native
    
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
    var textDecorationLine: js.UndefOr[TextDecorationLineProperty] = js.native
    
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
    var textDecorationSkip: js.UndefOr[TextDecorationSkipProperty] = js.native
    
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
    var textDecorationSkipInk: js.UndefOr[TextDecorationSkipInkProperty] = js.native
    
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
    var textDecorationStyle: js.UndefOr[TextDecorationStyleProperty] = js.native
    
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
    var textDecorationThickness: js.UndefOr[TextDecorationThicknessProperty[String | Double]] = js.native
    
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
    var textDecorationWidth: js.UndefOr[TextDecorationThicknessProperty[String | Double]] = js.native
    
    /**
      * The **`text-emphasis`** CSS property applies emphasis marks to text (except spaces and control characters). It is a shorthand for `text-emphasis-style` and `text-emphasis-color`.
      *
      * **Syntax**: `<'text-emphasis-style'> || <'text-emphasis-color'>`
      *
      * |    Chrome    | Firefox | Safari  |     Edge     | IE  |
      * | :----------: | :-----: | :-----: | :----------: | :-: |
      * | **25** _-x-_ | **46**  | **6.1** | **79** _-x-_ | No  |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis
      */
    var textEmphasis: js.UndefOr[TextEmphasisProperty] = js.native
    
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
    var textEmphasisColor: js.UndefOr[TextEmphasisColorProperty] = js.native
    
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
    var textEmphasisPosition: js.UndefOr[GlobalsString] = js.native
    
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
    var textEmphasisStyle: js.UndefOr[TextEmphasisStyleProperty] = js.native
    
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
    var textIndent: js.UndefOr[TextIndentProperty[String | Double]] = js.native
    
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
    var textJustify: js.UndefOr[TextJustifyProperty] = js.native
    
    /**
      * The **`text-orientation`** CSS property sets the orientation of the text characters in a line. It only affects text in vertical mode (when `writing-mode` is not `horizontal-tb`). It is useful for controlling the display of languages that use vertical script, and also for making vertical table headers.
      *
      * **Syntax**: `mixed | upright | sideways`
      *
      * **Initial value**: `mixed`
      *
      * |  Chrome  | Firefox |  Safari   |  Edge  | IE  |
      * | :------: | :-----: | :-------: | :----: | :-: |
      * |  **48**  | **41**  |  **14**   | **79** | No  |
      * | 11 _-x-_ |         | 5.1 _-x-_ |        |     |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/text-orientation
      */
    var textOrientation: js.UndefOr[TextOrientationProperty] = js.native
    
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
    var textOverflow: js.UndefOr[TextOverflowProperty] = js.native
    
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
    var textRendering: js.UndefOr[TextRenderingProperty] = js.native
    
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
    var textShadow: js.UndefOr[TextShadowProperty] = js.native
    
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
    var textSizeAdjust: js.UndefOr[TextSizeAdjustProperty] = js.native
    
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
    var textTransform: js.UndefOr[TextTransformProperty] = js.native
    
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
    var textUnderlineOffset: js.UndefOr[TextUnderlineOffsetProperty[String | Double]] = js.native
    
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
    var textUnderlinePosition: js.UndefOr[TextUnderlinePositionProperty] = js.native
    
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
    var top: js.UndefOr[TopProperty[String | Double]] = js.native
    
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
    var touchAction: js.UndefOr[TouchActionProperty] = js.native
    
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
    var transform: js.UndefOr[TransformProperty] = js.native
    
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
    var transformBox: js.UndefOr[TransformBoxProperty] = js.native
    
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
    var transformOrigin: js.UndefOr[TransformOriginProperty[String | Double]] = js.native
    
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
    var transformStyle: js.UndefOr[TransformStyleProperty] = js.native
    
    /**
      * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
      *
      * **Syntax**: `<single-transition>#`
      *
      * | Chrome  | Firefox |  Safari   |  Edge  |   IE   |
      * | :-----: | :-----: | :-------: | :----: | :----: |
      * | **26**  | **16**  |   **9**   | **12** | **10** |
      * | 1 _-x-_ | 4 _-x-_ | 3.1 _-x-_ |        |        |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/transition
      */
    var transition: js.UndefOr[TransitionProperty] = js.native
    
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
    var transitionDelay: js.UndefOr[GlobalsString] = js.native
    
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
    var transitionDuration: js.UndefOr[GlobalsString] = js.native
    
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
    var transitionProperty: js.UndefOr[TransitionPropertyProperty] = js.native
    
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
    var transitionTimingFunction: js.UndefOr[TransitionTimingFunctionProperty] = js.native
    
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
    var translate: js.UndefOr[TranslateProperty[String | Double]] = js.native
    
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
    var unicodeBidi: js.UndefOr[UnicodeBidiProperty] = js.native
    
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
    var userSelect: js.UndefOr[UserSelectProperty] = js.native
    
    var vectorEffect: js.UndefOr[VectorEffectProperty] = js.native
    
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
    var verticalAlign: js.UndefOr[VerticalAlignProperty[String | Double]] = js.native
    
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
    var visibility: js.UndefOr[VisibilityProperty] = js.native
    
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
    var whiteSpace: js.UndefOr[WhiteSpaceProperty] = js.native
    
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
    var widows: js.UndefOr[GlobalsNumber] = js.native
    
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
    var width: js.UndefOr[WidthProperty[String | Double]] = js.native
    
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
    var willChange: js.UndefOr[WillChangeProperty] = js.native
    
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
    var wordBreak: js.UndefOr[WordBreakProperty] = js.native
    
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
    var wordSpacing: js.UndefOr[WordSpacingProperty[String | Double]] = js.native
    
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
    var wordWrap: js.UndefOr[WordWrapProperty] = js.native
    
    /**
      * The **`writing-mode`** CSS property sets whether lines of text are laid out horizontally or vertically, as well as the direction in which blocks progress.
      *
      * **Syntax**: `horizontal-tb | vertical-rl | vertical-lr | sideways-rl | sideways-lr`
      *
      * **Initial value**: `horizontal-tb`
      *
      * | Chrome  | Firefox |  Safari   |  Edge  |  IE   |
      * | :-----: | :-----: | :-------: | :----: | :---: |
      * | **48**  | **41**  | **10.1**  | **12** | **9** |
      * | 8 _-x-_ |         | 5.1 _-x-_ |        |       |
      *
      * @see https://developer.mozilla.org/docs/Web/CSS/writing-mode
      */
    var writingMode: js.UndefOr[WritingModeProperty] = js.native
    
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
    var zIndex: js.UndefOr[ZIndexProperty] = js.native
    
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
    var zoom: js.UndefOr[ZoomProperty] = js.native
  }
  
  @js.native
  trait GridListSize extends StObject {
    
    /**
      * The current width of each cell within the grid.
      */
    var cellWidth: Double = js.native
    
    /**
      * The current number of columns in the `GridList`.
      */
    var columns: Double = js.native
  }
  object GridListSize {
    
    @scala.inline
    def apply(cellWidth: Double, columns: Double): GridListSize = {
      val __obj = js.Dynamic.literal(cellWidth = cellWidth.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridListSize]
    }
    
    @scala.inline
    implicit class GridListSizeMutableBuilder[Self <: GridListSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellWidth(value: Double): Self = StObject.set(x, "cellWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProvidedGridListProps[E /* <: HTMLElement */] extends StObject {
    
    var className: String = js.native
    
    var ref: RefCallback[E | Null] = js.native
    
    var style: CSSProperties = js.native
  }
  object ProvidedGridListProps {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](className: String, ref: /* instance */ E | Null => Unit, style: CSSProperties): ProvidedGridListProps[E] = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], ref = js.Any.fromFunction1(ref), style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProvidedGridListProps[E]]
    }
    
    @scala.inline
    implicit class ProvidedGridListPropsMutableBuilder[Self <: ProvidedGridListProps[_], E /* <: HTMLElement */] (val x: Self with ProvidedGridListProps[E]) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: /* instance */ E | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UseGridListOptions extends StObject {
    
    /**
      * An optional margin to apply to each cell as the `CELL_MARGIN_VAR` css
      * variable only when it is defined. This has to be a number string with a
      * `px`, `em`, `rem` or `%` suffix or else the grid will break.
      */
    var cellMargin: js.UndefOr[String] = js.native
    
    /**
      * An optional className to merge with the grid list class name
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * This is _normally_ the amount of padding on the grid list item itself to
      * subtract from the `offsetWidth` since `padding`, `border`, and vertical
      * scrollbars will be included.  If you add a border or change the padding or
      * add borders to this component, you'll need to update the `containerPadding`
      * to be the new number.
      */
    var containerPadding: js.UndefOr[Double] = js.native
    
    /**
      * Since the `GridList` requires being fully rendered in the DOM to be able to
      * correctly calculate the number of `columns` and `cellWidth`, this _might_
      * cause problems when server-side rendering when using the children renderer
      * to create a grid list dynamically based on the number of columns. If the
      * number of columns and default `cellWidth` can be guessed server-side, you
      * should provide this prop. Otherwise it will be: `{ cellSize; maxCellSize,
      * columns: -1 }`
      */
    var defaultSize: js.UndefOr[GridListSize | js.Function0[GridListSize]] = js.native
    
    /**
      * Boolean if the recalculation of grid sizing should not happen for height
      * changes.
      */
    var disableHeight: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the recalculation of grid sizing should not happen for width
      * changes.
      */
    var disableWidth: js.UndefOr[Boolean] = js.native
    
    /**
      * The max size that each cell can be.
      */
    var maxCellSize: js.UndefOr[Double] = js.native
    
    /**
      * An optional style object to merge with the grid custom css properties
      * object.
      */
    var style: js.UndefOr[typingsSlinky.react.mod.CSSProperties] = js.native
  }
  object UseGridListOptions {
    
    @scala.inline
    def apply(): UseGridListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseGridListOptions]
    }
    
    @scala.inline
    implicit class UseGridListOptionsMutableBuilder[Self <: UseGridListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellMargin(value: String): Self = StObject.set(x, "cellMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellMarginUndefined: Self = StObject.set(x, "cellMargin", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContainerPadding(value: Double): Self = StObject.set(x, "containerPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerPaddingUndefined: Self = StObject.set(x, "containerPadding", js.undefined)
      
      @scala.inline
      def setDefaultSize(value: GridListSize | js.Function0[GridListSize]): Self = StObject.set(x, "defaultSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSizeFunction0(value: () => GridListSize): Self = StObject.set(x, "defaultSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDefaultSizeUndefined: Self = StObject.set(x, "defaultSize", js.undefined)
      
      @scala.inline
      def setDisableHeight(value: Boolean): Self = StObject.set(x, "disableHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableHeightUndefined: Self = StObject.set(x, "disableHeight", js.undefined)
      
      @scala.inline
      def setDisableWidth(value: Boolean): Self = StObject.set(x, "disableWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableWidthUndefined: Self = StObject.set(x, "disableWidth", js.undefined)
      
      @scala.inline
      def setMaxCellSize(value: Double): Self = StObject.set(x, "maxCellSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCellSizeUndefined: Self = StObject.set(x, "maxCellSize", js.undefined)
      
      @scala.inline
      def setStyle(value: typingsSlinky.react.mod.CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type UseGridListReturnValue[E /* <: HTMLElement */] = js.Tuple2[ProvidedGridListProps[E], GridListSize]
}
