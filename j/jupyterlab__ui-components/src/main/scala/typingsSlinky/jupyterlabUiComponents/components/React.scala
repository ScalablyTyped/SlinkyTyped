package typingsSlinky.jupyterlabUiComponents.components

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.StBuildingComponent
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
import typingsSlinky.jupyterlabUiComponents.jupyterlabUiComponentsStrings.center
import typingsSlinky.jupyterlabUiComponents.jupyterlabUiComponentsStrings.div
import typingsSlinky.jupyterlabUiComponents.jupyterlabUiComponentsStrings.left
import typingsSlinky.jupyterlabUiComponents.jupyterlabUiComponentsStrings.right
import typingsSlinky.jupyterlabUiComponents.jupyterlabUiComponentsStrings.span
import typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon.IReactProps
import typingsSlinky.jupyterlabUiComponents.styleIconMod.LabIconStyle.IBuiltin
import typingsSlinky.jupyterlabUiComponents.styleIconMod.LabIconStyle.IPosition
import typingsSlinky.jupyterlabUiComponents.styleIconMod.LabIconStyle.ISheetResolvable
import typingsSlinky.jupyterlabUiComponents.styleIconMod.LabIconStyle.ISize
import typingsSlinky.typestyle.typesMod.NestedCSSSelectors
import typingsSlinky.typestyle.typesMod.TLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object React {
  
  @JSImport("@jupyterlab/ui-components/lib/icon/labicon", "badIcon.react")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[slinky.web.html.`*`.tag.type, SVGElement] {
    
    @scala.inline
    def $debugName(value: String): this.type = set("$debugName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def $nest(value: NestedCSSSelectors): this.type = set("$nest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def $unique(value: Boolean): this.type = set("$unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-animationVarargs`(value: AnimationProperty*): this.type = set("-moz-animation", js.Array(value :_*))
    
    @scala.inline
    def `-moz-animation`(value: AnimationProperty | js.Array[AnimationProperty]): this.type = set("-moz-animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-animation-delayVarargs`(value: GlobalsString*): this.type = set("-moz-animation-delay", js.Array(value :_*))
    
    @scala.inline
    def `-moz-animation-delay`(value: GlobalsString | js.Array[GlobalsString]): this.type = set("-moz-animation-delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-animation-directionVarargs`(value: AnimationDirectionProperty*): this.type = set("-moz-animation-direction", js.Array(value :_*))
    
    @scala.inline
    def `-moz-animation-direction`(value: AnimationDirectionProperty | js.Array[AnimationDirectionProperty]): this.type = set("-moz-animation-direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-animation-durationVarargs`(value: GlobalsString*): this.type = set("-moz-animation-duration", js.Array(value :_*))
    
    @scala.inline
    def `-moz-animation-duration`(value: GlobalsString | js.Array[GlobalsString]): this.type = set("-moz-animation-duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-animation-fill-modeVarargs`(value: AnimationFillModeProperty*): this.type = set("-moz-animation-fill-mode", js.Array(value :_*))
    
    @scala.inline
    def `-moz-animation-fill-mode`(value: AnimationFillModeProperty | js.Array[AnimationFillModeProperty]): this.type = set("-moz-animation-fill-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-animation-iteration-countVarargs`(value: AnimationIterationCountProperty*): this.type = set("-moz-animation-iteration-count", js.Array(value :_*))
    
    @scala.inline
    def `-moz-animation-iteration-count`(value: AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]): this.type = set("-moz-animation-iteration-count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-animation-nameVarargs`(value: AnimationNameProperty*): this.type = set("-moz-animation-name", js.Array(value :_*))
    
    @scala.inline
    def `-moz-animation-name`(value: AnimationNameProperty | js.Array[AnimationNameProperty]): this.type = set("-moz-animation-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-animation-play-stateVarargs`(value: AnimationPlayStateProperty*): this.type = set("-moz-animation-play-state", js.Array(value :_*))
    
    @scala.inline
    def `-moz-animation-play-state`(value: AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]): this.type = set("-moz-animation-play-state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-animation-timing-functionVarargs`(value: AnimationTimingFunctionProperty*): this.type = set("-moz-animation-timing-function", js.Array(value :_*))
    
    @scala.inline
    def `-moz-animation-timing-function`(value: AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]): this.type = set("-moz-animation-timing-function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-appearanceVarargs`(value: MozAppearanceProperty*): this.type = set("-moz-appearance", js.Array(value :_*))
    
    @scala.inline
    def `-moz-appearance`(value: MozAppearanceProperty | js.Array[MozAppearanceProperty]): this.type = set("-moz-appearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-backface-visibilityVarargs`(value: BackfaceVisibilityProperty*): this.type = set("-moz-backface-visibility", js.Array(value :_*))
    
    @scala.inline
    def `-moz-backface-visibility`(value: BackfaceVisibilityProperty | js.Array[BackfaceVisibilityProperty]): this.type = set("-moz-backface-visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-border-bottom-colorsVarargs`(value: MozBorderBottomColorsProperty*): this.type = set("-moz-border-bottom-colors", js.Array(value :_*))
    
    @scala.inline
    def `-moz-border-bottom-colors`(value: MozBorderBottomColorsProperty | js.Array[MozBorderBottomColorsProperty]): this.type = set("-moz-border-bottom-colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-border-end-colorVarargs`(value: BorderInlineEndColorProperty*): this.type = set("-moz-border-end-color", js.Array(value :_*))
    
    @scala.inline
    def `-moz-border-end-color`(value: BorderInlineEndColorProperty | js.Array[BorderInlineEndColorProperty]): this.type = set("-moz-border-end-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-border-end-styleVarargs`(value: BorderInlineEndStyleProperty*): this.type = set("-moz-border-end-style", js.Array(value :_*))
    
    @scala.inline
    def `-moz-border-end-style`(value: BorderInlineEndStyleProperty | js.Array[BorderInlineEndStyleProperty]): this.type = set("-moz-border-end-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-border-end-widthVarargs`(value: BorderInlineEndWidthProperty[TLength]*): this.type = set("-moz-border-end-width", js.Array(value :_*))
    
    @scala.inline
    def `-moz-border-end-width`(value: BorderInlineEndWidthProperty[TLength] | js.Array[BorderInlineEndWidthProperty[TLength]]): this.type = set("-moz-border-end-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-border-imageVarargs`(value: BorderImageProperty*): this.type = set("-moz-border-image", js.Array(value :_*))
    
    @scala.inline
    def `-moz-border-image`(value: BorderImageProperty | js.Array[BorderImageProperty]): this.type = set("-moz-border-image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-border-left-colorsVarargs`(value: MozBorderLeftColorsProperty*): this.type = set("-moz-border-left-colors", js.Array(value :_*))
    
    @scala.inline
    def `-moz-border-left-colors`(value: MozBorderLeftColorsProperty | js.Array[MozBorderLeftColorsProperty]): this.type = set("-moz-border-left-colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-border-right-colorsVarargs`(value: MozBorderRightColorsProperty*): this.type = set("-moz-border-right-colors", js.Array(value :_*))
    
    @scala.inline
    def `-moz-border-right-colors`(value: MozBorderRightColorsProperty | js.Array[MozBorderRightColorsProperty]): this.type = set("-moz-border-right-colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-border-start-colorVarargs`(value: BorderInlineStartColorProperty*): this.type = set("-moz-border-start-color", js.Array(value :_*))
    
    @scala.inline
    def `-moz-border-start-color`(value: BorderInlineStartColorProperty | js.Array[BorderInlineStartColorProperty]): this.type = set("-moz-border-start-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-border-start-styleVarargs`(value: BorderInlineStartStyleProperty*): this.type = set("-moz-border-start-style", js.Array(value :_*))
    
    @scala.inline
    def `-moz-border-start-style`(value: BorderInlineStartStyleProperty | js.Array[BorderInlineStartStyleProperty]): this.type = set("-moz-border-start-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-border-top-colorsVarargs`(value: MozBorderTopColorsProperty*): this.type = set("-moz-border-top-colors", js.Array(value :_*))
    
    @scala.inline
    def `-moz-border-top-colors`(value: MozBorderTopColorsProperty | js.Array[MozBorderTopColorsProperty]): this.type = set("-moz-border-top-colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-box-sizingVarargs`(value: BoxSizingProperty*): this.type = set("-moz-box-sizing", js.Array(value :_*))
    
    @scala.inline
    def `-moz-box-sizing`(value: BoxSizingProperty | js.Array[BoxSizingProperty]): this.type = set("-moz-box-sizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-column-countVarargs`(value: ColumnCountProperty*): this.type = set("-moz-column-count", js.Array(value :_*))
    
    @scala.inline
    def `-moz-column-count`(value: ColumnCountProperty | js.Array[ColumnCountProperty]): this.type = set("-moz-column-count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-column-fillVarargs`(value: ColumnFillProperty*): this.type = set("-moz-column-fill", js.Array(value :_*))
    
    @scala.inline
    def `-moz-column-fill`(value: ColumnFillProperty | js.Array[ColumnFillProperty]): this.type = set("-moz-column-fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-column-gapVarargs`(value: ColumnGapProperty[TLength]*): this.type = set("-moz-column-gap", js.Array(value :_*))
    
    @scala.inline
    def `-moz-column-gap`(value: ColumnGapProperty[TLength] | js.Array[ColumnGapProperty[TLength]]): this.type = set("-moz-column-gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-column-ruleVarargs`(value: ColumnRuleProperty[TLength]*): this.type = set("-moz-column-rule", js.Array(value :_*))
    
    @scala.inline
    def `-moz-column-rule`(value: ColumnRuleProperty[TLength] | js.Array[ColumnRuleProperty[TLength]]): this.type = set("-moz-column-rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-column-rule-colorVarargs`(value: ColumnRuleColorProperty*): this.type = set("-moz-column-rule-color", js.Array(value :_*))
    
    @scala.inline
    def `-moz-column-rule-color`(value: ColumnRuleColorProperty | js.Array[ColumnRuleColorProperty]): this.type = set("-moz-column-rule-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-column-rule-styleVarargs`(value: ColumnRuleStyleProperty*): this.type = set("-moz-column-rule-style", js.Array(value :_*))
    
    @scala.inline
    def `-moz-column-rule-style`(value: ColumnRuleStyleProperty | js.Array[ColumnRuleStyleProperty]): this.type = set("-moz-column-rule-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-column-rule-widthVarargs`(value: ColumnRuleWidthProperty[TLength]*): this.type = set("-moz-column-rule-width", js.Array(value :_*))
    
    @scala.inline
    def `-moz-column-rule-width`(value: ColumnRuleWidthProperty[TLength] | js.Array[ColumnRuleWidthProperty[TLength]]): this.type = set("-moz-column-rule-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-column-widthVarargs`(value: ColumnWidthProperty[TLength]*): this.type = set("-moz-column-width", js.Array(value :_*))
    
    @scala.inline
    def `-moz-column-width`(value: ColumnWidthProperty[TLength] | js.Array[ColumnWidthProperty[TLength]]): this.type = set("-moz-column-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-columnsVarargs`(value: ColumnsProperty[TLength]*): this.type = set("-moz-columns", js.Array(value :_*))
    
    @scala.inline
    def `-moz-columns`(value: ColumnsProperty[TLength] | js.Array[ColumnsProperty[TLength]]): this.type = set("-moz-columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-context-propertiesVarargs`(value: MozContextPropertiesProperty*): this.type = set("-moz-context-properties", js.Array(value :_*))
    
    @scala.inline
    def `-moz-context-properties`(value: MozContextPropertiesProperty | js.Array[MozContextPropertiesProperty]): this.type = set("-moz-context-properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-font-feature-settingsVarargs`(value: FontFeatureSettingsProperty*): this.type = set("-moz-font-feature-settings", js.Array(value :_*))
    
    @scala.inline
    def `-moz-font-feature-settings`(value: FontFeatureSettingsProperty | js.Array[FontFeatureSettingsProperty]): this.type = set("-moz-font-feature-settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-font-language-overrideVarargs`(value: FontLanguageOverrideProperty*): this.type = set("-moz-font-language-override", js.Array(value :_*))
    
    @scala.inline
    def `-moz-font-language-override`(value: FontLanguageOverrideProperty | js.Array[FontLanguageOverrideProperty]): this.type = set("-moz-font-language-override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-hyphensVarargs`(value: HyphensProperty*): this.type = set("-moz-hyphens", js.Array(value :_*))
    
    @scala.inline
    def `-moz-hyphens`(value: HyphensProperty | js.Array[HyphensProperty]): this.type = set("-moz-hyphens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-image-regionVarargs`(value: MozImageRegionProperty*): this.type = set("-moz-image-region", js.Array(value :_*))
    
    @scala.inline
    def `-moz-image-region`(value: MozImageRegionProperty | js.Array[MozImageRegionProperty]): this.type = set("-moz-image-region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-margin-endVarargs`(value: MarginInlineEndProperty[TLength]*): this.type = set("-moz-margin-end", js.Array(value :_*))
    
    @scala.inline
    def `-moz-margin-end`(value: MarginInlineEndProperty[TLength] | js.Array[MarginInlineEndProperty[TLength]]): this.type = set("-moz-margin-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-margin-startVarargs`(value: MarginInlineStartProperty[TLength]*): this.type = set("-moz-margin-start", js.Array(value :_*))
    
    @scala.inline
    def `-moz-margin-start`(value: MarginInlineStartProperty[TLength] | js.Array[MarginInlineStartProperty[TLength]]): this.type = set("-moz-margin-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-orientVarargs`(value: MozOrientProperty*): this.type = set("-moz-orient", js.Array(value :_*))
    
    @scala.inline
    def `-moz-orient`(value: MozOrientProperty | js.Array[MozOrientProperty]): this.type = set("-moz-orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-osx-font-smoothingVarargs`(value: FontSmoothProperty[TLength]*): this.type = set("-moz-osx-font-smoothing", js.Array(value :_*))
    
    @scala.inline
    def `-moz-osx-font-smoothing`(value: FontSmoothProperty[TLength] | js.Array[FontSmoothProperty[TLength]]): this.type = set("-moz-osx-font-smoothing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-padding-endVarargs`(value: PaddingInlineEndProperty[TLength]*): this.type = set("-moz-padding-end", js.Array(value :_*))
    
    @scala.inline
    def `-moz-padding-end`(value: PaddingInlineEndProperty[TLength] | js.Array[PaddingInlineEndProperty[TLength]]): this.type = set("-moz-padding-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-padding-startVarargs`(value: PaddingInlineStartProperty[TLength]*): this.type = set("-moz-padding-start", js.Array(value :_*))
    
    @scala.inline
    def `-moz-padding-start`(value: PaddingInlineStartProperty[TLength] | js.Array[PaddingInlineStartProperty[TLength]]): this.type = set("-moz-padding-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-perspectiveVarargs`(value: PerspectiveProperty[TLength]*): this.type = set("-moz-perspective", js.Array(value :_*))
    
    @scala.inline
    def `-moz-perspective`(value: PerspectiveProperty[TLength] | js.Array[PerspectiveProperty[TLength]]): this.type = set("-moz-perspective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-perspective-originVarargs`(value: PerspectiveOriginProperty[TLength]*): this.type = set("-moz-perspective-origin", js.Array(value :_*))
    
    @scala.inline
    def `-moz-perspective-origin`(value: PerspectiveOriginProperty[TLength] | js.Array[PerspectiveOriginProperty[TLength]]): this.type = set("-moz-perspective-origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-stack-sizingVarargs`(value: MozStackSizingProperty*): this.type = set("-moz-stack-sizing", js.Array(value :_*))
    
    @scala.inline
    def `-moz-stack-sizing`(value: MozStackSizingProperty | js.Array[MozStackSizingProperty]): this.type = set("-moz-stack-sizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-tab-sizeVarargs`(value: TabSizeProperty[TLength]*): this.type = set("-moz-tab-size", js.Array(value :_*))
    
    @scala.inline
    def `-moz-tab-size`(value: TabSizeProperty[TLength] | js.Array[TabSizeProperty[TLength]]): this.type = set("-moz-tab-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-text-blinkVarargs`(value: MozTextBlinkProperty*): this.type = set("-moz-text-blink", js.Array(value :_*))
    
    @scala.inline
    def `-moz-text-blink`(value: MozTextBlinkProperty | js.Array[MozTextBlinkProperty]): this.type = set("-moz-text-blink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-text-size-adjustVarargs`(value: TextSizeAdjustProperty*): this.type = set("-moz-text-size-adjust", js.Array(value :_*))
    
    @scala.inline
    def `-moz-text-size-adjust`(value: TextSizeAdjustProperty | js.Array[TextSizeAdjustProperty]): this.type = set("-moz-text-size-adjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-transform-originVarargs`(value: TransformOriginProperty[TLength]*): this.type = set("-moz-transform-origin", js.Array(value :_*))
    
    @scala.inline
    def `-moz-transform-origin`(value: TransformOriginProperty[TLength] | js.Array[TransformOriginProperty[TLength]]): this.type = set("-moz-transform-origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-transform-styleVarargs`(value: TransformStyleProperty*): this.type = set("-moz-transform-style", js.Array(value :_*))
    
    @scala.inline
    def `-moz-transform-style`(value: TransformStyleProperty | js.Array[TransformStyleProperty]): this.type = set("-moz-transform-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-transitionVarargs`(value: TransitionProperty*): this.type = set("-moz-transition", js.Array(value :_*))
    
    @scala.inline
    def `-moz-transition`(value: TransitionProperty | js.Array[TransitionProperty]): this.type = set("-moz-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-transition-delayVarargs`(value: GlobalsString*): this.type = set("-moz-transition-delay", js.Array(value :_*))
    
    @scala.inline
    def `-moz-transition-delay`(value: GlobalsString | js.Array[GlobalsString]): this.type = set("-moz-transition-delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-transition-durationVarargs`(value: GlobalsString*): this.type = set("-moz-transition-duration", js.Array(value :_*))
    
    @scala.inline
    def `-moz-transition-duration`(value: GlobalsString | js.Array[GlobalsString]): this.type = set("-moz-transition-duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-transition-propertyVarargs`(value: TransitionPropertyProperty*): this.type = set("-moz-transition-property", js.Array(value :_*))
    
    @scala.inline
    def `-moz-transition-property`(value: TransitionPropertyProperty | js.Array[TransitionPropertyProperty]): this.type = set("-moz-transition-property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-transition-timing-functionVarargs`(value: TransitionTimingFunctionProperty*): this.type = set("-moz-transition-timing-function", js.Array(value :_*))
    
    @scala.inline
    def `-moz-transition-timing-function`(value: TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]): this.type = set("-moz-transition-timing-function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-user-focusVarargs`(value: MozUserFocusProperty*): this.type = set("-moz-user-focus", js.Array(value :_*))
    
    @scala.inline
    def `-moz-user-focus`(value: MozUserFocusProperty | js.Array[MozUserFocusProperty]): this.type = set("-moz-user-focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-user-modifyVarargs`(value: MozUserModifyProperty*): this.type = set("-moz-user-modify", js.Array(value :_*))
    
    @scala.inline
    def `-moz-user-modify`(value: MozUserModifyProperty | js.Array[MozUserModifyProperty]): this.type = set("-moz-user-modify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-user-selectVarargs`(value: UserSelectProperty*): this.type = set("-moz-user-select", js.Array(value :_*))
    
    @scala.inline
    def `-moz-user-select`(value: UserSelectProperty | js.Array[UserSelectProperty]): this.type = set("-moz-user-select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-window-draggingVarargs`(value: MozWindowDraggingProperty*): this.type = set("-moz-window-dragging", js.Array(value :_*))
    
    @scala.inline
    def `-moz-window-dragging`(value: MozWindowDraggingProperty | js.Array[MozWindowDraggingProperty]): this.type = set("-moz-window-dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-moz-window-shadowVarargs`(value: MozWindowShadowProperty*): this.type = set("-moz-window-shadow", js.Array(value :_*))
    
    @scala.inline
    def `-moz-window-shadow`(value: MozWindowShadowProperty | js.Array[MozWindowShadowProperty]): this.type = set("-moz-window-shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-acceleratorVarargs`(value: MsAcceleratorProperty*): this.type = set("-ms-accelerator", js.Array(value :_*))
    
    @scala.inline
    def `-ms-accelerator`(value: MsAcceleratorProperty | js.Array[MsAcceleratorProperty]): this.type = set("-ms-accelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-align-selfVarargs`(value: AlignSelfProperty*): this.type = set("-ms-align-self", js.Array(value :_*))
    
    @scala.inline
    def `-ms-align-self`(value: AlignSelfProperty | js.Array[AlignSelfProperty]): this.type = set("-ms-align-self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-block-progressionVarargs`(value: MsBlockProgressionProperty*): this.type = set("-ms-block-progression", js.Array(value :_*))
    
    @scala.inline
    def `-ms-block-progression`(value: MsBlockProgressionProperty | js.Array[MsBlockProgressionProperty]): this.type = set("-ms-block-progression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-content-zoom-chainingVarargs`(value: MsContentZoomChainingProperty*): this.type = set("-ms-content-zoom-chaining", js.Array(value :_*))
    
    @scala.inline
    def `-ms-content-zoom-chaining`(value: MsContentZoomChainingProperty | js.Array[MsContentZoomChainingProperty]): this.type = set("-ms-content-zoom-chaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-content-zoom-limitVarargs`(value: GlobalsString*): this.type = set("-ms-content-zoom-limit", js.Array(value :_*))
    
    @scala.inline
    def `-ms-content-zoom-limit`(value: GlobalsString | js.Array[GlobalsString]): this.type = set("-ms-content-zoom-limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-content-zoom-limit-maxVarargs`(value: GlobalsString*): this.type = set("-ms-content-zoom-limit-max", js.Array(value :_*))
    
    @scala.inline
    def `-ms-content-zoom-limit-max`(value: GlobalsString | js.Array[GlobalsString]): this.type = set("-ms-content-zoom-limit-max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-content-zoom-limit-minVarargs`(value: GlobalsString*): this.type = set("-ms-content-zoom-limit-min", js.Array(value :_*))
    
    @scala.inline
    def `-ms-content-zoom-limit-min`(value: GlobalsString | js.Array[GlobalsString]): this.type = set("-ms-content-zoom-limit-min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-content-zoom-snapVarargs`(value: MsContentZoomSnapProperty*): this.type = set("-ms-content-zoom-snap", js.Array(value :_*))
    
    @scala.inline
    def `-ms-content-zoom-snap`(value: MsContentZoomSnapProperty | js.Array[MsContentZoomSnapProperty]): this.type = set("-ms-content-zoom-snap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-content-zoom-snap-pointsVarargs`(value: GlobalsString*): this.type = set("-ms-content-zoom-snap-points", js.Array(value :_*))
    
    @scala.inline
    def `-ms-content-zoom-snap-points`(value: GlobalsString | js.Array[GlobalsString]): this.type = set("-ms-content-zoom-snap-points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-content-zoom-snap-typeVarargs`(value: MsContentZoomSnapTypeProperty*): this.type = set("-ms-content-zoom-snap-type", js.Array(value :_*))
    
    @scala.inline
    def `-ms-content-zoom-snap-type`(value: MsContentZoomSnapTypeProperty | js.Array[MsContentZoomSnapTypeProperty]): this.type = set("-ms-content-zoom-snap-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-content-zoomingVarargs`(value: MsContentZoomingProperty*): this.type = set("-ms-content-zooming", js.Array(value :_*))
    
    @scala.inline
    def `-ms-content-zooming`(value: MsContentZoomingProperty | js.Array[MsContentZoomingProperty]): this.type = set("-ms-content-zooming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-filterVarargs`(value: GlobalsString*): this.type = set("-ms-filter", js.Array(value :_*))
    
    @scala.inline
    def `-ms-filter`(value: GlobalsString | js.Array[GlobalsString]): this.type = set("-ms-filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-flexVarargs`(value: FlexProperty[TLength]*): this.type = set("-ms-flex", js.Array(value :_*))
    
    @scala.inline
    def `-ms-flex`(value: FlexProperty[TLength] | js.Array[FlexProperty[TLength]]): this.type = set("-ms-flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-flex-directionVarargs`(value: FlexDirectionProperty*): this.type = set("-ms-flex-direction", js.Array(value :_*))
    
    @scala.inline
    def `-ms-flex-direction`(value: FlexDirectionProperty | js.Array[FlexDirectionProperty]): this.type = set("-ms-flex-direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-flex-positiveVarargs`(value: GlobalsNumber*): this.type = set("-ms-flex-positive", js.Array(value :_*))
    
    @scala.inline
    def `-ms-flex-positive`(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("-ms-flex-positive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-flow-fromVarargs`(value: MsFlowFromProperty*): this.type = set("-ms-flow-from", js.Array(value :_*))
    
    @scala.inline
    def `-ms-flow-from`(value: MsFlowFromProperty | js.Array[MsFlowFromProperty]): this.type = set("-ms-flow-from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-flow-intoVarargs`(value: MsFlowIntoProperty*): this.type = set("-ms-flow-into", js.Array(value :_*))
    
    @scala.inline
    def `-ms-flow-into`(value: MsFlowIntoProperty | js.Array[MsFlowIntoProperty]): this.type = set("-ms-flow-into", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-grid-columnsVarargs`(value: MsGridColumnsProperty[TLength]*): this.type = set("-ms-grid-columns", js.Array(value :_*))
    
    @scala.inline
    def `-ms-grid-columns`(value: MsGridColumnsProperty[TLength] | js.Array[MsGridColumnsProperty[TLength]]): this.type = set("-ms-grid-columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-grid-rowsVarargs`(value: MsGridRowsProperty[TLength]*): this.type = set("-ms-grid-rows", js.Array(value :_*))
    
    @scala.inline
    def `-ms-grid-rows`(value: MsGridRowsProperty[TLength] | js.Array[MsGridRowsProperty[TLength]]): this.type = set("-ms-grid-rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-high-contrast-adjustVarargs`(value: MsHighContrastAdjustProperty*): this.type = set("-ms-high-contrast-adjust", js.Array(value :_*))
    
    @scala.inline
    def `-ms-high-contrast-adjust`(value: MsHighContrastAdjustProperty | js.Array[MsHighContrastAdjustProperty]): this.type = set("-ms-high-contrast-adjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-hyphenate-limit-charsVarargs`(value: MsHyphenateLimitCharsProperty*): this.type = set("-ms-hyphenate-limit-chars", js.Array(value :_*))
    
    @scala.inline
    def `-ms-hyphenate-limit-chars`(value: MsHyphenateLimitCharsProperty | js.Array[MsHyphenateLimitCharsProperty]): this.type = set("-ms-hyphenate-limit-chars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-hyphenate-limit-linesVarargs`(value: MsHyphenateLimitLinesProperty*): this.type = set("-ms-hyphenate-limit-lines", js.Array(value :_*))
    
    @scala.inline
    def `-ms-hyphenate-limit-lines`(value: MsHyphenateLimitLinesProperty | js.Array[MsHyphenateLimitLinesProperty]): this.type = set("-ms-hyphenate-limit-lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-hyphenate-limit-zoneVarargs`(value: MsHyphenateLimitZoneProperty[TLength]*): this.type = set("-ms-hyphenate-limit-zone", js.Array(value :_*))
    
    @scala.inline
    def `-ms-hyphenate-limit-zone`(value: MsHyphenateLimitZoneProperty[TLength] | js.Array[MsHyphenateLimitZoneProperty[TLength]]): this.type = set("-ms-hyphenate-limit-zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-hyphensVarargs`(value: HyphensProperty*): this.type = set("-ms-hyphens", js.Array(value :_*))
    
    @scala.inline
    def `-ms-hyphens`(value: HyphensProperty | js.Array[HyphensProperty]): this.type = set("-ms-hyphens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-ime-alignVarargs`(value: MsImeAlignProperty*): this.type = set("-ms-ime-align", js.Array(value :_*))
    
    @scala.inline
    def `-ms-ime-align`(value: MsImeAlignProperty | js.Array[MsImeAlignProperty]): this.type = set("-ms-ime-align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-justify-selfVarargs`(value: JustifySelfProperty*): this.type = set("-ms-justify-self", js.Array(value :_*))
    
    @scala.inline
    def `-ms-justify-self`(value: JustifySelfProperty | js.Array[JustifySelfProperty]): this.type = set("-ms-justify-self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-line-breakVarargs`(value: LineBreakProperty*): this.type = set("-ms-line-break", js.Array(value :_*))
    
    @scala.inline
    def `-ms-line-break`(value: LineBreakProperty | js.Array[LineBreakProperty]): this.type = set("-ms-line-break", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-orderVarargs`(value: GlobalsNumber*): this.type = set("-ms-order", js.Array(value :_*))
    
    @scala.inline
    def `-ms-order`(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("-ms-order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-overflow-styleVarargs`(value: MsOverflowStyleProperty*): this.type = set("-ms-overflow-style", js.Array(value :_*))
    
    @scala.inline
    def `-ms-overflow-style`(value: MsOverflowStyleProperty | js.Array[MsOverflowStyleProperty]): this.type = set("-ms-overflow-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-overflow-xVarargs`(value: OverflowXProperty*): this.type = set("-ms-overflow-x", js.Array(value :_*))
    
    @scala.inline
    def `-ms-overflow-x`(value: OverflowXProperty | js.Array[OverflowXProperty]): this.type = set("-ms-overflow-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-overflow-yVarargs`(value: OverflowYProperty*): this.type = set("-ms-overflow-y", js.Array(value :_*))
    
    @scala.inline
    def `-ms-overflow-y`(value: OverflowYProperty | js.Array[OverflowYProperty]): this.type = set("-ms-overflow-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-scroll-chainingVarargs`(value: MsScrollChainingProperty*): this.type = set("-ms-scroll-chaining", js.Array(value :_*))
    
    @scala.inline
    def `-ms-scroll-chaining`(value: MsScrollChainingProperty | js.Array[MsScrollChainingProperty]): this.type = set("-ms-scroll-chaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-scroll-limitVarargs`(value: GlobalsString*): this.type = set("-ms-scroll-limit", js.Array(value :_*))
    
    @scala.inline
    def `-ms-scroll-limit`(value: GlobalsString | js.Array[GlobalsString]): this.type = set("-ms-scroll-limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-scroll-limit-x-maxVarargs`(value: MsScrollLimitXMaxProperty[TLength]*): this.type = set("-ms-scroll-limit-x-max", js.Array(value :_*))
    
    @scala.inline
    def `-ms-scroll-limit-x-max`(value: MsScrollLimitXMaxProperty[TLength] | js.Array[MsScrollLimitXMaxProperty[TLength]]): this.type = set("-ms-scroll-limit-x-max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-scroll-limit-x-minVarargs`(value: MsScrollLimitXMinProperty[TLength]*): this.type = set("-ms-scroll-limit-x-min", js.Array(value :_*))
    
    @scala.inline
    def `-ms-scroll-limit-x-min`(value: MsScrollLimitXMinProperty[TLength] | js.Array[MsScrollLimitXMinProperty[TLength]]): this.type = set("-ms-scroll-limit-x-min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-scroll-limit-y-maxVarargs`(value: MsScrollLimitYMaxProperty[TLength]*): this.type = set("-ms-scroll-limit-y-max", js.Array(value :_*))
    
    @scala.inline
    def `-ms-scroll-limit-y-max`(value: MsScrollLimitYMaxProperty[TLength] | js.Array[MsScrollLimitYMaxProperty[TLength]]): this.type = set("-ms-scroll-limit-y-max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-scroll-limit-y-minVarargs`(value: MsScrollLimitYMinProperty[TLength]*): this.type = set("-ms-scroll-limit-y-min", js.Array(value :_*))
    
    @scala.inline
    def `-ms-scroll-limit-y-min`(value: MsScrollLimitYMinProperty[TLength] | js.Array[MsScrollLimitYMinProperty[TLength]]): this.type = set("-ms-scroll-limit-y-min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-scroll-railsVarargs`(value: MsScrollRailsProperty*): this.type = set("-ms-scroll-rails", js.Array(value :_*))
    
    @scala.inline
    def `-ms-scroll-rails`(value: MsScrollRailsProperty | js.Array[MsScrollRailsProperty]): this.type = set("-ms-scroll-rails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-scroll-snap-points-xVarargs`(value: GlobalsString*): this.type = set("-ms-scroll-snap-points-x", js.Array(value :_*))
    
    @scala.inline
    def `-ms-scroll-snap-points-x`(value: GlobalsString | js.Array[GlobalsString]): this.type = set("-ms-scroll-snap-points-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-scroll-snap-points-yVarargs`(value: GlobalsString*): this.type = set("-ms-scroll-snap-points-y", js.Array(value :_*))
    
    @scala.inline
    def `-ms-scroll-snap-points-y`(value: GlobalsString | js.Array[GlobalsString]): this.type = set("-ms-scroll-snap-points-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-scroll-snap-typeVarargs`(value: MsScrollSnapTypeProperty*): this.type = set("-ms-scroll-snap-type", js.Array(value :_*))
    
    @scala.inline
    def `-ms-scroll-snap-type`(value: MsScrollSnapTypeProperty | js.Array[MsScrollSnapTypeProperty]): this.type = set("-ms-scroll-snap-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-scroll-snap-xVarargs`(value: GlobalsString*): this.type = set("-ms-scroll-snap-x", js.Array(value :_*))
    
    @scala.inline
    def `-ms-scroll-snap-x`(value: GlobalsString | js.Array[GlobalsString]): this.type = set("-ms-scroll-snap-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-scroll-snap-yVarargs`(value: GlobalsString*): this.type = set("-ms-scroll-snap-y", js.Array(value :_*))
    
    @scala.inline
    def `-ms-scroll-snap-y`(value: GlobalsString | js.Array[GlobalsString]): this.type = set("-ms-scroll-snap-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-scroll-translationVarargs`(value: MsScrollTranslationProperty*): this.type = set("-ms-scroll-translation", js.Array(value :_*))
    
    @scala.inline
    def `-ms-scroll-translation`(value: MsScrollTranslationProperty | js.Array[MsScrollTranslationProperty]): this.type = set("-ms-scroll-translation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-scrollbar-3dlight-colorVarargs`(value: MsScrollbar3dlightColorProperty*): this.type = set("-ms-scrollbar-3dlight-color", js.Array(value :_*))
    
    @scala.inline
    def `-ms-scrollbar-3dlight-color`(value: MsScrollbar3dlightColorProperty | js.Array[MsScrollbar3dlightColorProperty]): this.type = set("-ms-scrollbar-3dlight-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-scrollbar-arrow-colorVarargs`(value: MsScrollbarArrowColorProperty*): this.type = set("-ms-scrollbar-arrow-color", js.Array(value :_*))
    
    @scala.inline
    def `-ms-scrollbar-arrow-color`(value: MsScrollbarArrowColorProperty | js.Array[MsScrollbarArrowColorProperty]): this.type = set("-ms-scrollbar-arrow-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-scrollbar-base-colorVarargs`(value: MsScrollbarBaseColorProperty*): this.type = set("-ms-scrollbar-base-color", js.Array(value :_*))
    
    @scala.inline
    def `-ms-scrollbar-base-color`(value: MsScrollbarBaseColorProperty | js.Array[MsScrollbarBaseColorProperty]): this.type = set("-ms-scrollbar-base-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-scrollbar-darkshadow-colorVarargs`(value: MsScrollbarDarkshadowColorProperty*): this.type = set("-ms-scrollbar-darkshadow-color", js.Array(value :_*))
    
    @scala.inline
    def `-ms-scrollbar-darkshadow-color`(value: MsScrollbarDarkshadowColorProperty | js.Array[MsScrollbarDarkshadowColorProperty]): this.type = set("-ms-scrollbar-darkshadow-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-scrollbar-face-colorVarargs`(value: MsScrollbarFaceColorProperty*): this.type = set("-ms-scrollbar-face-color", js.Array(value :_*))
    
    @scala.inline
    def `-ms-scrollbar-face-color`(value: MsScrollbarFaceColorProperty | js.Array[MsScrollbarFaceColorProperty]): this.type = set("-ms-scrollbar-face-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-scrollbar-highlight-colorVarargs`(value: MsScrollbarHighlightColorProperty*): this.type = set("-ms-scrollbar-highlight-color", js.Array(value :_*))
    
    @scala.inline
    def `-ms-scrollbar-highlight-color`(value: MsScrollbarHighlightColorProperty | js.Array[MsScrollbarHighlightColorProperty]): this.type = set("-ms-scrollbar-highlight-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-scrollbar-shadow-colorVarargs`(value: MsScrollbarShadowColorProperty*): this.type = set("-ms-scrollbar-shadow-color", js.Array(value :_*))
    
    @scala.inline
    def `-ms-scrollbar-shadow-color`(value: MsScrollbarShadowColorProperty | js.Array[MsScrollbarShadowColorProperty]): this.type = set("-ms-scrollbar-shadow-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-text-autospaceVarargs`(value: MsTextAutospaceProperty*): this.type = set("-ms-text-autospace", js.Array(value :_*))
    
    @scala.inline
    def `-ms-text-autospace`(value: MsTextAutospaceProperty | js.Array[MsTextAutospaceProperty]): this.type = set("-ms-text-autospace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-text-combine-horizontalVarargs`(value: TextCombineUprightProperty*): this.type = set("-ms-text-combine-horizontal", js.Array(value :_*))
    
    @scala.inline
    def `-ms-text-combine-horizontal`(value: TextCombineUprightProperty | js.Array[TextCombineUprightProperty]): this.type = set("-ms-text-combine-horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-text-overflowVarargs`(value: TextOverflowProperty*): this.type = set("-ms-text-overflow", js.Array(value :_*))
    
    @scala.inline
    def `-ms-text-overflow`(value: TextOverflowProperty | js.Array[TextOverflowProperty]): this.type = set("-ms-text-overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-touch-actionVarargs`(value: TouchActionProperty*): this.type = set("-ms-touch-action", js.Array(value :_*))
    
    @scala.inline
    def `-ms-touch-action`(value: TouchActionProperty | js.Array[TouchActionProperty]): this.type = set("-ms-touch-action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-touch-selectVarargs`(value: MsTouchSelectProperty*): this.type = set("-ms-touch-select", js.Array(value :_*))
    
    @scala.inline
    def `-ms-touch-select`(value: MsTouchSelectProperty | js.Array[MsTouchSelectProperty]): this.type = set("-ms-touch-select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-transformVarargs`(value: TransformProperty*): this.type = set("-ms-transform", js.Array(value :_*))
    
    @scala.inline
    def `-ms-transform`(value: TransformProperty | js.Array[TransformProperty]): this.type = set("-ms-transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-transform-originVarargs`(value: TransformOriginProperty[TLength]*): this.type = set("-ms-transform-origin", js.Array(value :_*))
    
    @scala.inline
    def `-ms-transform-origin`(value: TransformOriginProperty[TLength] | js.Array[TransformOriginProperty[TLength]]): this.type = set("-ms-transform-origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-transitionVarargs`(value: TransitionProperty*): this.type = set("-ms-transition", js.Array(value :_*))
    
    @scala.inline
    def `-ms-transition`(value: TransitionProperty | js.Array[TransitionProperty]): this.type = set("-ms-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-transition-delayVarargs`(value: GlobalsString*): this.type = set("-ms-transition-delay", js.Array(value :_*))
    
    @scala.inline
    def `-ms-transition-delay`(value: GlobalsString | js.Array[GlobalsString]): this.type = set("-ms-transition-delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-transition-durationVarargs`(value: GlobalsString*): this.type = set("-ms-transition-duration", js.Array(value :_*))
    
    @scala.inline
    def `-ms-transition-duration`(value: GlobalsString | js.Array[GlobalsString]): this.type = set("-ms-transition-duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-transition-propertyVarargs`(value: TransitionPropertyProperty*): this.type = set("-ms-transition-property", js.Array(value :_*))
    
    @scala.inline
    def `-ms-transition-property`(value: TransitionPropertyProperty | js.Array[TransitionPropertyProperty]): this.type = set("-ms-transition-property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-transition-timing-functionVarargs`(value: TransitionTimingFunctionProperty*): this.type = set("-ms-transition-timing-function", js.Array(value :_*))
    
    @scala.inline
    def `-ms-transition-timing-function`(value: TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]): this.type = set("-ms-transition-timing-function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-user-selectVarargs`(value: MsUserSelectProperty*): this.type = set("-ms-user-select", js.Array(value :_*))
    
    @scala.inline
    def `-ms-user-select`(value: MsUserSelectProperty | js.Array[MsUserSelectProperty]): this.type = set("-ms-user-select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-word-breakVarargs`(value: WordBreakProperty*): this.type = set("-ms-word-break", js.Array(value :_*))
    
    @scala.inline
    def `-ms-word-break`(value: WordBreakProperty | js.Array[WordBreakProperty]): this.type = set("-ms-word-break", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-wrap-flowVarargs`(value: MsWrapFlowProperty*): this.type = set("-ms-wrap-flow", js.Array(value :_*))
    
    @scala.inline
    def `-ms-wrap-flow`(value: MsWrapFlowProperty | js.Array[MsWrapFlowProperty]): this.type = set("-ms-wrap-flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-wrap-marginVarargs`(value: MsWrapMarginProperty[TLength]*): this.type = set("-ms-wrap-margin", js.Array(value :_*))
    
    @scala.inline
    def `-ms-wrap-margin`(value: MsWrapMarginProperty[TLength] | js.Array[MsWrapMarginProperty[TLength]]): this.type = set("-ms-wrap-margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-wrap-throughVarargs`(value: MsWrapThroughProperty*): this.type = set("-ms-wrap-through", js.Array(value :_*))
    
    @scala.inline
    def `-ms-wrap-through`(value: MsWrapThroughProperty | js.Array[MsWrapThroughProperty]): this.type = set("-ms-wrap-through", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-ms-writing-modeVarargs`(value: WritingModeProperty*): this.type = set("-ms-writing-mode", js.Array(value :_*))
    
    @scala.inline
    def `-ms-writing-mode`(value: WritingModeProperty | js.Array[WritingModeProperty]): this.type = set("-ms-writing-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-o-object-fitVarargs`(value: ObjectFitProperty*): this.type = set("-o-object-fit", js.Array(value :_*))
    
    @scala.inline
    def `-o-object-fit`(value: ObjectFitProperty | js.Array[ObjectFitProperty]): this.type = set("-o-object-fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-o-object-positionVarargs`(value: ObjectPositionProperty[TLength]*): this.type = set("-o-object-position", js.Array(value :_*))
    
    @scala.inline
    def `-o-object-position`(value: ObjectPositionProperty[TLength] | js.Array[ObjectPositionProperty[TLength]]): this.type = set("-o-object-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-o-tab-sizeVarargs`(value: TabSizeProperty[TLength]*): this.type = set("-o-tab-size", js.Array(value :_*))
    
    @scala.inline
    def `-o-tab-size`(value: TabSizeProperty[TLength] | js.Array[TabSizeProperty[TLength]]): this.type = set("-o-tab-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-o-text-overflowVarargs`(value: TextOverflowProperty*): this.type = set("-o-text-overflow", js.Array(value :_*))
    
    @scala.inline
    def `-o-text-overflow`(value: TextOverflowProperty | js.Array[TextOverflowProperty]): this.type = set("-o-text-overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-o-transform-originVarargs`(value: TransformOriginProperty[TLength]*): this.type = set("-o-transform-origin", js.Array(value :_*))
    
    @scala.inline
    def `-o-transform-origin`(value: TransformOriginProperty[TLength] | js.Array[TransformOriginProperty[TLength]]): this.type = set("-o-transform-origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-align-contentVarargs`(value: AlignContentProperty*): this.type = set("-webkit-align-content", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-align-content`(value: AlignContentProperty | js.Array[AlignContentProperty]): this.type = set("-webkit-align-content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-align-itemsVarargs`(value: AlignItemsProperty*): this.type = set("-webkit-align-items", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-align-items`(value: AlignItemsProperty | js.Array[AlignItemsProperty]): this.type = set("-webkit-align-items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-align-selfVarargs`(value: AlignSelfProperty*): this.type = set("-webkit-align-self", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-align-self`(value: AlignSelfProperty | js.Array[AlignSelfProperty]): this.type = set("-webkit-align-self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-animationVarargs`(value: AnimationProperty*): this.type = set("-webkit-animation", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-animation`(value: AnimationProperty | js.Array[AnimationProperty]): this.type = set("-webkit-animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-animation-delayVarargs`(value: GlobalsString*): this.type = set("-webkit-animation-delay", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-animation-delay`(value: GlobalsString | js.Array[GlobalsString]): this.type = set("-webkit-animation-delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-animation-directionVarargs`(value: AnimationDirectionProperty*): this.type = set("-webkit-animation-direction", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-animation-direction`(value: AnimationDirectionProperty | js.Array[AnimationDirectionProperty]): this.type = set("-webkit-animation-direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-animation-durationVarargs`(value: GlobalsString*): this.type = set("-webkit-animation-duration", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-animation-duration`(value: GlobalsString | js.Array[GlobalsString]): this.type = set("-webkit-animation-duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-animation-fill-modeVarargs`(value: AnimationFillModeProperty*): this.type = set("-webkit-animation-fill-mode", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-animation-fill-mode`(value: AnimationFillModeProperty | js.Array[AnimationFillModeProperty]): this.type = set("-webkit-animation-fill-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-animation-iteration-countVarargs`(value: AnimationIterationCountProperty*): this.type = set("-webkit-animation-iteration-count", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-animation-iteration-count`(value: AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]): this.type = set("-webkit-animation-iteration-count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-animation-nameVarargs`(value: AnimationNameProperty*): this.type = set("-webkit-animation-name", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-animation-name`(value: AnimationNameProperty | js.Array[AnimationNameProperty]): this.type = set("-webkit-animation-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-animation-play-stateVarargs`(value: AnimationPlayStateProperty*): this.type = set("-webkit-animation-play-state", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-animation-play-state`(value: AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]): this.type = set("-webkit-animation-play-state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-animation-timing-functionVarargs`(value: AnimationTimingFunctionProperty*): this.type = set("-webkit-animation-timing-function", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-animation-timing-function`(value: AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]): this.type = set("-webkit-animation-timing-function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-appearanceVarargs`(value: WebkitAppearanceProperty*): this.type = set("-webkit-appearance", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-appearance`(value: WebkitAppearanceProperty | js.Array[WebkitAppearanceProperty]): this.type = set("-webkit-appearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-backdrop-filterVarargs`(value: BackdropFilterProperty*): this.type = set("-webkit-backdrop-filter", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-backdrop-filter`(value: BackdropFilterProperty | js.Array[BackdropFilterProperty]): this.type = set("-webkit-backdrop-filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-backface-visibilityVarargs`(value: BackfaceVisibilityProperty*): this.type = set("-webkit-backface-visibility", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-backface-visibility`(value: BackfaceVisibilityProperty | js.Array[BackfaceVisibilityProperty]): this.type = set("-webkit-backface-visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-background-clipVarargs`(value: BackgroundClipProperty*): this.type = set("-webkit-background-clip", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-background-clip`(value: BackgroundClipProperty | js.Array[BackgroundClipProperty]): this.type = set("-webkit-background-clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-background-originVarargs`(value: BackgroundOriginProperty*): this.type = set("-webkit-background-origin", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-background-origin`(value: BackgroundOriginProperty | js.Array[BackgroundOriginProperty]): this.type = set("-webkit-background-origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-background-sizeVarargs`(value: BackgroundSizeProperty[TLength]*): this.type = set("-webkit-background-size", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-background-size`(value: BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]): this.type = set("-webkit-background-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-border-beforeVarargs`(value: WebkitBorderBeforeProperty[TLength]*): this.type = set("-webkit-border-before", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-border-before`(value: WebkitBorderBeforeProperty[TLength] | js.Array[WebkitBorderBeforeProperty[TLength]]): this.type = set("-webkit-border-before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-border-before-colorVarargs`(value: WebkitBorderBeforeColorProperty*): this.type = set("-webkit-border-before-color", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-border-before-color`(value: WebkitBorderBeforeColorProperty | js.Array[WebkitBorderBeforeColorProperty]): this.type = set("-webkit-border-before-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-border-before-styleVarargs`(value: WebkitBorderBeforeStyleProperty*): this.type = set("-webkit-border-before-style", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-border-before-style`(value: WebkitBorderBeforeStyleProperty | js.Array[WebkitBorderBeforeStyleProperty]): this.type = set("-webkit-border-before-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-border-before-widthVarargs`(value: WebkitBorderBeforeWidthProperty[TLength]*): this.type = set("-webkit-border-before-width", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-border-before-width`(
      value: WebkitBorderBeforeWidthProperty[TLength] | js.Array[WebkitBorderBeforeWidthProperty[TLength]]
    ): this.type = set("-webkit-border-before-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-border-bottom-left-radiusVarargs`(value: BorderBottomLeftRadiusProperty[TLength]*): this.type = set("-webkit-border-bottom-left-radius", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-border-bottom-left-radius`(value: BorderBottomLeftRadiusProperty[TLength] | js.Array[BorderBottomLeftRadiusProperty[TLength]]): this.type = set("-webkit-border-bottom-left-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-border-bottom-right-radiusVarargs`(value: BorderBottomRightRadiusProperty[TLength]*): this.type = set("-webkit-border-bottom-right-radius", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-border-bottom-right-radius`(
      value: BorderBottomRightRadiusProperty[TLength] | js.Array[BorderBottomRightRadiusProperty[TLength]]
    ): this.type = set("-webkit-border-bottom-right-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-border-imageVarargs`(value: BorderImageProperty*): this.type = set("-webkit-border-image", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-border-image`(value: BorderImageProperty | js.Array[BorderImageProperty]): this.type = set("-webkit-border-image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-border-image-sliceVarargs`(value: BorderImageSliceProperty*): this.type = set("-webkit-border-image-slice", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-border-image-slice`(value: BorderImageSliceProperty | js.Array[BorderImageSliceProperty]): this.type = set("-webkit-border-image-slice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-border-radiusVarargs`(value: BorderRadiusProperty[TLength]*): this.type = set("-webkit-border-radius", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-border-radius`(value: BorderRadiusProperty[TLength] | js.Array[BorderRadiusProperty[TLength]]): this.type = set("-webkit-border-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-border-top-left-radiusVarargs`(value: BorderTopLeftRadiusProperty[TLength]*): this.type = set("-webkit-border-top-left-radius", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-border-top-left-radius`(value: BorderTopLeftRadiusProperty[TLength] | js.Array[BorderTopLeftRadiusProperty[TLength]]): this.type = set("-webkit-border-top-left-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-border-top-right-radiusVarargs`(value: BorderTopRightRadiusProperty[TLength]*): this.type = set("-webkit-border-top-right-radius", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-border-top-right-radius`(value: BorderTopRightRadiusProperty[TLength] | js.Array[BorderTopRightRadiusProperty[TLength]]): this.type = set("-webkit-border-top-right-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-box-decoration-breakVarargs`(value: BoxDecorationBreakProperty*): this.type = set("-webkit-box-decoration-break", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-box-decoration-break`(value: BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty]): this.type = set("-webkit-box-decoration-break", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-box-reflectVarargs`(value: WebkitBoxReflectProperty[TLength]*): this.type = set("-webkit-box-reflect", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-box-reflect`(value: WebkitBoxReflectProperty[TLength] | js.Array[WebkitBoxReflectProperty[TLength]]): this.type = set("-webkit-box-reflect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-box-shadowVarargs`(value: BoxShadowProperty*): this.type = set("-webkit-box-shadow", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-box-shadow`(value: BoxShadowProperty | js.Array[BoxShadowProperty]): this.type = set("-webkit-box-shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-box-sizingVarargs`(value: BoxSizingProperty*): this.type = set("-webkit-box-sizing", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-box-sizing`(value: BoxSizingProperty | js.Array[BoxSizingProperty]): this.type = set("-webkit-box-sizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-clip-pathVarargs`(value: ClipPathProperty*): this.type = set("-webkit-clip-path", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-clip-path`(value: ClipPathProperty | js.Array[ClipPathProperty]): this.type = set("-webkit-clip-path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-column-countVarargs`(value: ColumnCountProperty*): this.type = set("-webkit-column-count", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-column-count`(value: ColumnCountProperty | js.Array[ColumnCountProperty]): this.type = set("-webkit-column-count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-column-fillVarargs`(value: ColumnFillProperty*): this.type = set("-webkit-column-fill", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-column-fill`(value: ColumnFillProperty | js.Array[ColumnFillProperty]): this.type = set("-webkit-column-fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-column-gapVarargs`(value: ColumnGapProperty[TLength]*): this.type = set("-webkit-column-gap", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-column-gap`(value: ColumnGapProperty[TLength] | js.Array[ColumnGapProperty[TLength]]): this.type = set("-webkit-column-gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-column-ruleVarargs`(value: ColumnRuleProperty[TLength]*): this.type = set("-webkit-column-rule", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-column-rule`(value: ColumnRuleProperty[TLength] | js.Array[ColumnRuleProperty[TLength]]): this.type = set("-webkit-column-rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-column-rule-colorVarargs`(value: ColumnRuleColorProperty*): this.type = set("-webkit-column-rule-color", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-column-rule-color`(value: ColumnRuleColorProperty | js.Array[ColumnRuleColorProperty]): this.type = set("-webkit-column-rule-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-column-rule-styleVarargs`(value: ColumnRuleStyleProperty*): this.type = set("-webkit-column-rule-style", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-column-rule-style`(value: ColumnRuleStyleProperty | js.Array[ColumnRuleStyleProperty]): this.type = set("-webkit-column-rule-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-column-rule-widthVarargs`(value: ColumnRuleWidthProperty[TLength]*): this.type = set("-webkit-column-rule-width", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-column-rule-width`(value: ColumnRuleWidthProperty[TLength] | js.Array[ColumnRuleWidthProperty[TLength]]): this.type = set("-webkit-column-rule-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-column-spanVarargs`(value: ColumnSpanProperty*): this.type = set("-webkit-column-span", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-column-span`(value: ColumnSpanProperty | js.Array[ColumnSpanProperty]): this.type = set("-webkit-column-span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-column-widthVarargs`(value: ColumnWidthProperty[TLength]*): this.type = set("-webkit-column-width", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-column-width`(value: ColumnWidthProperty[TLength] | js.Array[ColumnWidthProperty[TLength]]): this.type = set("-webkit-column-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-columnsVarargs`(value: ColumnsProperty[TLength]*): this.type = set("-webkit-columns", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-columns`(value: ColumnsProperty[TLength] | js.Array[ColumnsProperty[TLength]]): this.type = set("-webkit-columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-filterVarargs`(value: FilterProperty*): this.type = set("-webkit-filter", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-filter`(value: FilterProperty | js.Array[FilterProperty]): this.type = set("-webkit-filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-flexVarargs`(value: FlexProperty[TLength]*): this.type = set("-webkit-flex", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-flex`(value: FlexProperty[TLength] | js.Array[FlexProperty[TLength]]): this.type = set("-webkit-flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-flex-basisVarargs`(value: FlexBasisProperty[TLength]*): this.type = set("-webkit-flex-basis", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-flex-basis`(value: FlexBasisProperty[TLength] | js.Array[FlexBasisProperty[TLength]]): this.type = set("-webkit-flex-basis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-flex-directionVarargs`(value: FlexDirectionProperty*): this.type = set("-webkit-flex-direction", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-flex-direction`(value: FlexDirectionProperty | js.Array[FlexDirectionProperty]): this.type = set("-webkit-flex-direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-flex-flowVarargs`(value: FlexFlowProperty*): this.type = set("-webkit-flex-flow", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-flex-flow`(value: FlexFlowProperty | js.Array[FlexFlowProperty]): this.type = set("-webkit-flex-flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-flex-growVarargs`(value: GlobalsNumber*): this.type = set("-webkit-flex-grow", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-flex-grow`(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("-webkit-flex-grow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-flex-shrinkVarargs`(value: GlobalsNumber*): this.type = set("-webkit-flex-shrink", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-flex-shrink`(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("-webkit-flex-shrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-flex-wrapVarargs`(value: FlexWrapProperty*): this.type = set("-webkit-flex-wrap", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-flex-wrap`(value: FlexWrapProperty | js.Array[FlexWrapProperty]): this.type = set("-webkit-flex-wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-font-feature-settingsVarargs`(value: FontFeatureSettingsProperty*): this.type = set("-webkit-font-feature-settings", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-font-feature-settings`(value: FontFeatureSettingsProperty | js.Array[FontFeatureSettingsProperty]): this.type = set("-webkit-font-feature-settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-font-kerningVarargs`(value: FontKerningProperty*): this.type = set("-webkit-font-kerning", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-font-kerning`(value: FontKerningProperty | js.Array[FontKerningProperty]): this.type = set("-webkit-font-kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-font-smoothingVarargs`(value: FontSmoothProperty[TLength]*): this.type = set("-webkit-font-smoothing", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-font-smoothing`(value: FontSmoothProperty[TLength] | js.Array[FontSmoothProperty[TLength]]): this.type = set("-webkit-font-smoothing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-font-variant-ligaturesVarargs`(value: FontVariantLigaturesProperty*): this.type = set("-webkit-font-variant-ligatures", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-font-variant-ligatures`(value: FontVariantLigaturesProperty | js.Array[FontVariantLigaturesProperty]): this.type = set("-webkit-font-variant-ligatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-hyphensVarargs`(value: HyphensProperty*): this.type = set("-webkit-hyphens", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-hyphens`(value: HyphensProperty | js.Array[HyphensProperty]): this.type = set("-webkit-hyphens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-justify-contentVarargs`(value: JustifyContentProperty*): this.type = set("-webkit-justify-content", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-justify-content`(value: JustifyContentProperty | js.Array[JustifyContentProperty]): this.type = set("-webkit-justify-content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-line-breakVarargs`(value: LineBreakProperty*): this.type = set("-webkit-line-break", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-line-break`(value: LineBreakProperty | js.Array[LineBreakProperty]): this.type = set("-webkit-line-break", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-line-clampVarargs`(value: WebkitLineClampProperty*): this.type = set("-webkit-line-clamp", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-line-clamp`(value: WebkitLineClampProperty | js.Array[WebkitLineClampProperty]): this.type = set("-webkit-line-clamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-margin-endVarargs`(value: MarginInlineEndProperty[TLength]*): this.type = set("-webkit-margin-end", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-margin-end`(value: MarginInlineEndProperty[TLength] | js.Array[MarginInlineEndProperty[TLength]]): this.type = set("-webkit-margin-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-margin-startVarargs`(value: MarginInlineStartProperty[TLength]*): this.type = set("-webkit-margin-start", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-margin-start`(value: MarginInlineStartProperty[TLength] | js.Array[MarginInlineStartProperty[TLength]]): this.type = set("-webkit-margin-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-maskVarargs`(value: WebkitMaskProperty[TLength]*): this.type = set("-webkit-mask", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-mask`(value: WebkitMaskProperty[TLength] | js.Array[WebkitMaskProperty[TLength]]): this.type = set("-webkit-mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-mask-attachmentVarargs`(value: WebkitMaskAttachmentProperty*): this.type = set("-webkit-mask-attachment", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-mask-attachment`(value: WebkitMaskAttachmentProperty | js.Array[WebkitMaskAttachmentProperty]): this.type = set("-webkit-mask-attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-mask-clipVarargs`(value: WebkitMaskClipProperty*): this.type = set("-webkit-mask-clip", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-mask-clip`(value: WebkitMaskClipProperty | js.Array[WebkitMaskClipProperty]): this.type = set("-webkit-mask-clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-mask-compositeVarargs`(value: WebkitMaskCompositeProperty*): this.type = set("-webkit-mask-composite", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-mask-composite`(value: WebkitMaskCompositeProperty | js.Array[WebkitMaskCompositeProperty]): this.type = set("-webkit-mask-composite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-mask-imageVarargs`(value: WebkitMaskImageProperty*): this.type = set("-webkit-mask-image", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-mask-image`(value: WebkitMaskImageProperty | js.Array[WebkitMaskImageProperty]): this.type = set("-webkit-mask-image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-mask-originVarargs`(value: WebkitMaskOriginProperty*): this.type = set("-webkit-mask-origin", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-mask-origin`(value: WebkitMaskOriginProperty | js.Array[WebkitMaskOriginProperty]): this.type = set("-webkit-mask-origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-mask-positionVarargs`(value: WebkitMaskPositionProperty[TLength]*): this.type = set("-webkit-mask-position", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-mask-position`(value: WebkitMaskPositionProperty[TLength] | js.Array[WebkitMaskPositionProperty[TLength]]): this.type = set("-webkit-mask-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-mask-position-xVarargs`(value: WebkitMaskPositionXProperty[TLength]*): this.type = set("-webkit-mask-position-x", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-mask-position-x`(value: WebkitMaskPositionXProperty[TLength] | js.Array[WebkitMaskPositionXProperty[TLength]]): this.type = set("-webkit-mask-position-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-mask-position-yVarargs`(value: WebkitMaskPositionYProperty[TLength]*): this.type = set("-webkit-mask-position-y", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-mask-position-y`(value: WebkitMaskPositionYProperty[TLength] | js.Array[WebkitMaskPositionYProperty[TLength]]): this.type = set("-webkit-mask-position-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-mask-repeatVarargs`(value: WebkitMaskRepeatProperty*): this.type = set("-webkit-mask-repeat", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-mask-repeat`(value: WebkitMaskRepeatProperty | js.Array[WebkitMaskRepeatProperty]): this.type = set("-webkit-mask-repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-mask-repeat-xVarargs`(value: WebkitMaskRepeatXProperty*): this.type = set("-webkit-mask-repeat-x", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-mask-repeat-x`(value: WebkitMaskRepeatXProperty | js.Array[WebkitMaskRepeatXProperty]): this.type = set("-webkit-mask-repeat-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-mask-repeat-yVarargs`(value: WebkitMaskRepeatYProperty*): this.type = set("-webkit-mask-repeat-y", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-mask-repeat-y`(value: WebkitMaskRepeatYProperty | js.Array[WebkitMaskRepeatYProperty]): this.type = set("-webkit-mask-repeat-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-mask-sizeVarargs`(value: WebkitMaskSizeProperty[TLength]*): this.type = set("-webkit-mask-size", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-mask-size`(value: WebkitMaskSizeProperty[TLength] | js.Array[WebkitMaskSizeProperty[TLength]]): this.type = set("-webkit-mask-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-max-inline-sizeVarargs`(value: MaxInlineSizeProperty[TLength]*): this.type = set("-webkit-max-inline-size", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-max-inline-size`(value: MaxInlineSizeProperty[TLength] | js.Array[MaxInlineSizeProperty[TLength]]): this.type = set("-webkit-max-inline-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-orderVarargs`(value: GlobalsNumber*): this.type = set("-webkit-order", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-order`(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("-webkit-order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-overflow-scrollingVarargs`(value: WebkitOverflowScrollingProperty*): this.type = set("-webkit-overflow-scrolling", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-overflow-scrolling`(value: WebkitOverflowScrollingProperty | js.Array[WebkitOverflowScrollingProperty]): this.type = set("-webkit-overflow-scrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-padding-endVarargs`(value: PaddingInlineEndProperty[TLength]*): this.type = set("-webkit-padding-end", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-padding-end`(value: PaddingInlineEndProperty[TLength] | js.Array[PaddingInlineEndProperty[TLength]]): this.type = set("-webkit-padding-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-padding-startVarargs`(value: PaddingInlineStartProperty[TLength]*): this.type = set("-webkit-padding-start", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-padding-start`(value: PaddingInlineStartProperty[TLength] | js.Array[PaddingInlineStartProperty[TLength]]): this.type = set("-webkit-padding-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-perspectiveVarargs`(value: PerspectiveProperty[TLength]*): this.type = set("-webkit-perspective", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-perspective`(value: PerspectiveProperty[TLength] | js.Array[PerspectiveProperty[TLength]]): this.type = set("-webkit-perspective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-perspective-originVarargs`(value: PerspectiveOriginProperty[TLength]*): this.type = set("-webkit-perspective-origin", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-perspective-origin`(value: PerspectiveOriginProperty[TLength] | js.Array[PerspectiveOriginProperty[TLength]]): this.type = set("-webkit-perspective-origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-print-color-adjustVarargs`(value: ColorAdjustProperty*): this.type = set("-webkit-print-color-adjust", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-print-color-adjust`(value: ColorAdjustProperty | js.Array[ColorAdjustProperty]): this.type = set("-webkit-print-color-adjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-ruby-positionVarargs`(value: RubyPositionProperty*): this.type = set("-webkit-ruby-position", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-ruby-position`(value: RubyPositionProperty | js.Array[RubyPositionProperty]): this.type = set("-webkit-ruby-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-scroll-snap-typeVarargs`(value: ScrollSnapTypeProperty*): this.type = set("-webkit-scroll-snap-type", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-scroll-snap-type`(value: ScrollSnapTypeProperty | js.Array[ScrollSnapTypeProperty]): this.type = set("-webkit-scroll-snap-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-shape-marginVarargs`(value: ShapeMarginProperty[TLength]*): this.type = set("-webkit-shape-margin", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-shape-margin`(value: ShapeMarginProperty[TLength] | js.Array[ShapeMarginProperty[TLength]]): this.type = set("-webkit-shape-margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-tap-highlight-colorVarargs`(value: WebkitTapHighlightColorProperty*): this.type = set("-webkit-tap-highlight-color", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-tap-highlight-color`(value: WebkitTapHighlightColorProperty | js.Array[WebkitTapHighlightColorProperty]): this.type = set("-webkit-tap-highlight-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-text-combineVarargs`(value: TextCombineUprightProperty*): this.type = set("-webkit-text-combine", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-text-combine`(value: TextCombineUprightProperty | js.Array[TextCombineUprightProperty]): this.type = set("-webkit-text-combine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-text-decoration-colorVarargs`(value: TextDecorationColorProperty*): this.type = set("-webkit-text-decoration-color", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-text-decoration-color`(value: TextDecorationColorProperty | js.Array[TextDecorationColorProperty]): this.type = set("-webkit-text-decoration-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-text-decoration-lineVarargs`(value: TextDecorationLineProperty*): this.type = set("-webkit-text-decoration-line", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-text-decoration-line`(value: TextDecorationLineProperty | js.Array[TextDecorationLineProperty]): this.type = set("-webkit-text-decoration-line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-text-decoration-skipVarargs`(value: TextDecorationSkipProperty*): this.type = set("-webkit-text-decoration-skip", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-text-decoration-skip`(value: TextDecorationSkipProperty | js.Array[TextDecorationSkipProperty]): this.type = set("-webkit-text-decoration-skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-text-decoration-styleVarargs`(value: TextDecorationStyleProperty*): this.type = set("-webkit-text-decoration-style", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-text-decoration-style`(value: TextDecorationStyleProperty | js.Array[TextDecorationStyleProperty]): this.type = set("-webkit-text-decoration-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-text-emphasisVarargs`(value: TextEmphasisProperty*): this.type = set("-webkit-text-emphasis", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-text-emphasis`(value: TextEmphasisProperty | js.Array[TextEmphasisProperty]): this.type = set("-webkit-text-emphasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-text-emphasis-colorVarargs`(value: TextEmphasisColorProperty*): this.type = set("-webkit-text-emphasis-color", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-text-emphasis-color`(value: TextEmphasisColorProperty | js.Array[TextEmphasisColorProperty]): this.type = set("-webkit-text-emphasis-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-text-emphasis-positionVarargs`(value: GlobalsString*): this.type = set("-webkit-text-emphasis-position", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-text-emphasis-position`(value: GlobalsString | js.Array[GlobalsString]): this.type = set("-webkit-text-emphasis-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-text-emphasis-styleVarargs`(value: TextEmphasisStyleProperty*): this.type = set("-webkit-text-emphasis-style", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-text-emphasis-style`(value: TextEmphasisStyleProperty | js.Array[TextEmphasisStyleProperty]): this.type = set("-webkit-text-emphasis-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-text-fill-colorVarargs`(value: WebkitTextFillColorProperty*): this.type = set("-webkit-text-fill-color", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-text-fill-color`(value: WebkitTextFillColorProperty | js.Array[WebkitTextFillColorProperty]): this.type = set("-webkit-text-fill-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-text-orientationVarargs`(value: TextOrientationProperty*): this.type = set("-webkit-text-orientation", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-text-orientation`(value: TextOrientationProperty | js.Array[TextOrientationProperty]): this.type = set("-webkit-text-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-text-size-adjustVarargs`(value: TextSizeAdjustProperty*): this.type = set("-webkit-text-size-adjust", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-text-size-adjust`(value: TextSizeAdjustProperty | js.Array[TextSizeAdjustProperty]): this.type = set("-webkit-text-size-adjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-text-strokeVarargs`(value: WebkitTextStrokeProperty[TLength]*): this.type = set("-webkit-text-stroke", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-text-stroke`(value: WebkitTextStrokeProperty[TLength] | js.Array[WebkitTextStrokeProperty[TLength]]): this.type = set("-webkit-text-stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-text-stroke-colorVarargs`(value: WebkitTextStrokeColorProperty*): this.type = set("-webkit-text-stroke-color", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-text-stroke-color`(value: WebkitTextStrokeColorProperty | js.Array[WebkitTextStrokeColorProperty]): this.type = set("-webkit-text-stroke-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-text-stroke-widthVarargs`(value: WebkitTextStrokeWidthProperty[TLength]*): this.type = set("-webkit-text-stroke-width", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-text-stroke-width`(value: WebkitTextStrokeWidthProperty[TLength] | js.Array[WebkitTextStrokeWidthProperty[TLength]]): this.type = set("-webkit-text-stroke-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-text-underline-positionVarargs`(value: TextUnderlinePositionProperty*): this.type = set("-webkit-text-underline-position", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-text-underline-position`(value: TextUnderlinePositionProperty | js.Array[TextUnderlinePositionProperty]): this.type = set("-webkit-text-underline-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-touch-calloutVarargs`(value: WebkitTouchCalloutProperty*): this.type = set("-webkit-touch-callout", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-touch-callout`(value: WebkitTouchCalloutProperty | js.Array[WebkitTouchCalloutProperty]): this.type = set("-webkit-touch-callout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-transformVarargs`(value: TransformProperty*): this.type = set("-webkit-transform", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-transform`(value: TransformProperty | js.Array[TransformProperty]): this.type = set("-webkit-transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-transform-originVarargs`(value: TransformOriginProperty[TLength]*): this.type = set("-webkit-transform-origin", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-transform-origin`(value: TransformOriginProperty[TLength] | js.Array[TransformOriginProperty[TLength]]): this.type = set("-webkit-transform-origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-transform-styleVarargs`(value: TransformStyleProperty*): this.type = set("-webkit-transform-style", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-transform-style`(value: TransformStyleProperty | js.Array[TransformStyleProperty]): this.type = set("-webkit-transform-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-transitionVarargs`(value: TransitionProperty*): this.type = set("-webkit-transition", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-transition`(value: TransitionProperty | js.Array[TransitionProperty]): this.type = set("-webkit-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-transition-delayVarargs`(value: GlobalsString*): this.type = set("-webkit-transition-delay", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-transition-delay`(value: GlobalsString | js.Array[GlobalsString]): this.type = set("-webkit-transition-delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-transition-durationVarargs`(value: GlobalsString*): this.type = set("-webkit-transition-duration", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-transition-duration`(value: GlobalsString | js.Array[GlobalsString]): this.type = set("-webkit-transition-duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-transition-propertyVarargs`(value: TransitionPropertyProperty*): this.type = set("-webkit-transition-property", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-transition-property`(value: TransitionPropertyProperty | js.Array[TransitionPropertyProperty]): this.type = set("-webkit-transition-property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-transition-timing-functionVarargs`(value: TransitionTimingFunctionProperty*): this.type = set("-webkit-transition-timing-function", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-transition-timing-function`(value: TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]): this.type = set("-webkit-transition-timing-function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-user-modifyVarargs`(value: WebkitUserModifyProperty*): this.type = set("-webkit-user-modify", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-user-modify`(value: WebkitUserModifyProperty | js.Array[WebkitUserModifyProperty]): this.type = set("-webkit-user-modify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-user-selectVarargs`(value: UserSelectProperty*): this.type = set("-webkit-user-select", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-user-select`(value: UserSelectProperty | js.Array[UserSelectProperty]): this.type = set("-webkit-user-select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `-webkit-writing-modeVarargs`(value: WritingModeProperty*): this.type = set("-webkit-writing-mode", js.Array(value :_*))
    
    @scala.inline
    def `-webkit-writing-mode`(value: WritingModeProperty | js.Array[WritingModeProperty]): this.type = set("-webkit-writing-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def KhtmlBoxAlignVarargs(value: BoxAlignProperty*): this.type = set("KhtmlBoxAlign", js.Array(value :_*))
    
    @scala.inline
    def KhtmlBoxAlign(value: BoxAlignProperty | js.Array[BoxAlignProperty]): this.type = set("KhtmlBoxAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def KhtmlBoxDirectionVarargs(value: BoxDirectionProperty*): this.type = set("KhtmlBoxDirection", js.Array(value :_*))
    
    @scala.inline
    def KhtmlBoxDirection(value: BoxDirectionProperty | js.Array[BoxDirectionProperty]): this.type = set("KhtmlBoxDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def KhtmlBoxFlexVarargs(value: GlobalsNumber*): this.type = set("KhtmlBoxFlex", js.Array(value :_*))
    
    @scala.inline
    def KhtmlBoxFlex(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("KhtmlBoxFlex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def KhtmlBoxFlexGroupVarargs(value: GlobalsNumber*): this.type = set("KhtmlBoxFlexGroup", js.Array(value :_*))
    
    @scala.inline
    def KhtmlBoxFlexGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("KhtmlBoxFlexGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def KhtmlBoxLinesVarargs(value: BoxLinesProperty*): this.type = set("KhtmlBoxLines", js.Array(value :_*))
    
    @scala.inline
    def KhtmlBoxLines(value: BoxLinesProperty | js.Array[BoxLinesProperty]): this.type = set("KhtmlBoxLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def KhtmlBoxOrdinalGroupVarargs(value: GlobalsNumber*): this.type = set("KhtmlBoxOrdinalGroup", js.Array(value :_*))
    
    @scala.inline
    def KhtmlBoxOrdinalGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("KhtmlBoxOrdinalGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def KhtmlBoxOrientVarargs(value: BoxOrientProperty*): this.type = set("KhtmlBoxOrient", js.Array(value :_*))
    
    @scala.inline
    def KhtmlBoxOrient(value: BoxOrientProperty | js.Array[BoxOrientProperty]): this.type = set("KhtmlBoxOrient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def KhtmlBoxPackVarargs(value: BoxPackProperty*): this.type = set("KhtmlBoxPack", js.Array(value :_*))
    
    @scala.inline
    def KhtmlBoxPack(value: BoxPackProperty | js.Array[BoxPackProperty]): this.type = set("KhtmlBoxPack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def KhtmlLineBreakVarargs(value: LineBreakProperty*): this.type = set("KhtmlLineBreak", js.Array(value :_*))
    
    @scala.inline
    def KhtmlLineBreak(value: LineBreakProperty | js.Array[LineBreakProperty]): this.type = set("KhtmlLineBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def KhtmlOpacityVarargs(value: OpacityProperty*): this.type = set("KhtmlOpacity", js.Array(value :_*))
    
    @scala.inline
    def KhtmlOpacity(value: OpacityProperty | js.Array[OpacityProperty]): this.type = set("KhtmlOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def KhtmlUserSelectVarargs(value: UserSelectProperty*): this.type = set("KhtmlUserSelect", js.Array(value :_*))
    
    @scala.inline
    def KhtmlUserSelect(value: UserSelectProperty | js.Array[UserSelectProperty]): this.type = set("KhtmlUserSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozBackgroundClipVarargs(value: BackgroundClipProperty*): this.type = set("MozBackgroundClip", js.Array(value :_*))
    
    @scala.inline
    def MozBackgroundClip(value: BackgroundClipProperty | js.Array[BackgroundClipProperty]): this.type = set("MozBackgroundClip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozBackgroundInlinePolicyVarargs(value: BoxDecorationBreakProperty*): this.type = set("MozBackgroundInlinePolicy", js.Array(value :_*))
    
    @scala.inline
    def MozBackgroundInlinePolicy(value: BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty]): this.type = set("MozBackgroundInlinePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozBackgroundOriginVarargs(value: BackgroundOriginProperty*): this.type = set("MozBackgroundOrigin", js.Array(value :_*))
    
    @scala.inline
    def MozBackgroundOrigin(value: BackgroundOriginProperty | js.Array[BackgroundOriginProperty]): this.type = set("MozBackgroundOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozBackgroundSizeVarargs(value: BackgroundSizeProperty[TLength]*): this.type = set("MozBackgroundSize", js.Array(value :_*))
    
    @scala.inline
    def MozBackgroundSize(value: BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]): this.type = set("MozBackgroundSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozBindingVarargs(value: MozBindingProperty*): this.type = set("MozBinding", js.Array(value :_*))
    
    @scala.inline
    def MozBinding(value: MozBindingProperty | js.Array[MozBindingProperty]): this.type = set("MozBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozBorderRadiusVarargs(value: BorderRadiusProperty[TLength]*): this.type = set("MozBorderRadius", js.Array(value :_*))
    
    @scala.inline
    def MozBorderRadius(value: BorderRadiusProperty[TLength] | js.Array[BorderRadiusProperty[TLength]]): this.type = set("MozBorderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozBorderRadiusBottomleftVarargs(value: BorderBottomLeftRadiusProperty[TLength]*): this.type = set("MozBorderRadiusBottomleft", js.Array(value :_*))
    
    @scala.inline
    def MozBorderRadiusBottomleft(value: BorderBottomLeftRadiusProperty[TLength] | js.Array[BorderBottomLeftRadiusProperty[TLength]]): this.type = set("MozBorderRadiusBottomleft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozBorderRadiusBottomrightVarargs(value: BorderBottomRightRadiusProperty[TLength]*): this.type = set("MozBorderRadiusBottomright", js.Array(value :_*))
    
    @scala.inline
    def MozBorderRadiusBottomright(
      value: BorderBottomRightRadiusProperty[TLength] | js.Array[BorderBottomRightRadiusProperty[TLength]]
    ): this.type = set("MozBorderRadiusBottomright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozBorderRadiusTopleftVarargs(value: BorderTopLeftRadiusProperty[TLength]*): this.type = set("MozBorderRadiusTopleft", js.Array(value :_*))
    
    @scala.inline
    def MozBorderRadiusTopleft(value: BorderTopLeftRadiusProperty[TLength] | js.Array[BorderTopLeftRadiusProperty[TLength]]): this.type = set("MozBorderRadiusTopleft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozBorderRadiusToprightVarargs(value: BorderTopRightRadiusProperty[TLength]*): this.type = set("MozBorderRadiusTopright", js.Array(value :_*))
    
    @scala.inline
    def MozBorderRadiusTopright(value: BorderTopRightRadiusProperty[TLength] | js.Array[BorderTopRightRadiusProperty[TLength]]): this.type = set("MozBorderRadiusTopright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozBoxAlignVarargs(value: BoxAlignProperty*): this.type = set("MozBoxAlign", js.Array(value :_*))
    
    @scala.inline
    def MozBoxAlign(value: BoxAlignProperty | js.Array[BoxAlignProperty]): this.type = set("MozBoxAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozBoxDirectionVarargs(value: BoxDirectionProperty*): this.type = set("MozBoxDirection", js.Array(value :_*))
    
    @scala.inline
    def MozBoxDirection(value: BoxDirectionProperty | js.Array[BoxDirectionProperty]): this.type = set("MozBoxDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozBoxFlexVarargs(value: GlobalsNumber*): this.type = set("MozBoxFlex", js.Array(value :_*))
    
    @scala.inline
    def MozBoxFlex(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("MozBoxFlex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozBoxOrdinalGroupVarargs(value: GlobalsNumber*): this.type = set("MozBoxOrdinalGroup", js.Array(value :_*))
    
    @scala.inline
    def MozBoxOrdinalGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("MozBoxOrdinalGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozBoxOrientVarargs(value: BoxOrientProperty*): this.type = set("MozBoxOrient", js.Array(value :_*))
    
    @scala.inline
    def MozBoxOrient(value: BoxOrientProperty | js.Array[BoxOrientProperty]): this.type = set("MozBoxOrient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozBoxPackVarargs(value: BoxPackProperty*): this.type = set("MozBoxPack", js.Array(value :_*))
    
    @scala.inline
    def MozBoxPack(value: BoxPackProperty | js.Array[BoxPackProperty]): this.type = set("MozBoxPack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozBoxShadowVarargs(value: BoxShadowProperty*): this.type = set("MozBoxShadow", js.Array(value :_*))
    
    @scala.inline
    def MozBoxShadow(value: BoxShadowProperty | js.Array[BoxShadowProperty]): this.type = set("MozBoxShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozFloatEdgeVarargs(value: MozFloatEdgeProperty*): this.type = set("MozFloatEdge", js.Array(value :_*))
    
    @scala.inline
    def MozFloatEdge(value: MozFloatEdgeProperty | js.Array[MozFloatEdgeProperty]): this.type = set("MozFloatEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozForceBrokenImageIconVarargs(value: GlobalsNumber*): this.type = set("MozForceBrokenImageIcon", js.Array(value :_*))
    
    @scala.inline
    def MozForceBrokenImageIcon(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("MozForceBrokenImageIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozOpacityVarargs(value: OpacityProperty*): this.type = set("MozOpacity", js.Array(value :_*))
    
    @scala.inline
    def MozOpacity(value: OpacityProperty | js.Array[OpacityProperty]): this.type = set("MozOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozOutlineVarargs(value: OutlineProperty[TLength]*): this.type = set("MozOutline", js.Array(value :_*))
    
    @scala.inline
    def MozOutline(value: OutlineProperty[TLength] | js.Array[OutlineProperty[TLength]]): this.type = set("MozOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozOutlineColorVarargs(value: OutlineColorProperty*): this.type = set("MozOutlineColor", js.Array(value :_*))
    
    @scala.inline
    def MozOutlineColor(value: OutlineColorProperty | js.Array[OutlineColorProperty]): this.type = set("MozOutlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozOutlineRadiusVarargs(value: MozOutlineRadiusProperty[TLength]*): this.type = set("MozOutlineRadius", js.Array(value :_*))
    
    @scala.inline
    def MozOutlineRadius(value: MozOutlineRadiusProperty[TLength] | js.Array[MozOutlineRadiusProperty[TLength]]): this.type = set("MozOutlineRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozOutlineRadiusBottomleftVarargs(value: MozOutlineRadiusBottomleftProperty[TLength]*): this.type = set("MozOutlineRadiusBottomleft", js.Array(value :_*))
    
    @scala.inline
    def MozOutlineRadiusBottomleft(
      value: MozOutlineRadiusBottomleftProperty[TLength] | js.Array[MozOutlineRadiusBottomleftProperty[TLength]]
    ): this.type = set("MozOutlineRadiusBottomleft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozOutlineRadiusBottomrightVarargs(value: MozOutlineRadiusBottomrightProperty[TLength]*): this.type = set("MozOutlineRadiusBottomright", js.Array(value :_*))
    
    @scala.inline
    def MozOutlineRadiusBottomright(
      value: MozOutlineRadiusBottomrightProperty[TLength] | js.Array[MozOutlineRadiusBottomrightProperty[TLength]]
    ): this.type = set("MozOutlineRadiusBottomright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozOutlineRadiusTopleftVarargs(value: MozOutlineRadiusTopleftProperty[TLength]*): this.type = set("MozOutlineRadiusTopleft", js.Array(value :_*))
    
    @scala.inline
    def MozOutlineRadiusTopleft(
      value: MozOutlineRadiusTopleftProperty[TLength] | js.Array[MozOutlineRadiusTopleftProperty[TLength]]
    ): this.type = set("MozOutlineRadiusTopleft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozOutlineRadiusToprightVarargs(value: MozOutlineRadiusToprightProperty[TLength]*): this.type = set("MozOutlineRadiusTopright", js.Array(value :_*))
    
    @scala.inline
    def MozOutlineRadiusTopright(
      value: MozOutlineRadiusToprightProperty[TLength] | js.Array[MozOutlineRadiusToprightProperty[TLength]]
    ): this.type = set("MozOutlineRadiusTopright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozOutlineStyleVarargs(value: OutlineStyleProperty*): this.type = set("MozOutlineStyle", js.Array(value :_*))
    
    @scala.inline
    def MozOutlineStyle(value: OutlineStyleProperty | js.Array[OutlineStyleProperty]): this.type = set("MozOutlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozOutlineWidthVarargs(value: OutlineWidthProperty[TLength]*): this.type = set("MozOutlineWidth", js.Array(value :_*))
    
    @scala.inline
    def MozOutlineWidth(value: OutlineWidthProperty[TLength] | js.Array[OutlineWidthProperty[TLength]]): this.type = set("MozOutlineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozTextAlignLastVarargs(value: TextAlignLastProperty*): this.type = set("MozTextAlignLast", js.Array(value :_*))
    
    @scala.inline
    def MozTextAlignLast(value: TextAlignLastProperty | js.Array[TextAlignLastProperty]): this.type = set("MozTextAlignLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozTextDecorationColorVarargs(value: TextDecorationColorProperty*): this.type = set("MozTextDecorationColor", js.Array(value :_*))
    
    @scala.inline
    def MozTextDecorationColor(value: TextDecorationColorProperty | js.Array[TextDecorationColorProperty]): this.type = set("MozTextDecorationColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozTextDecorationLineVarargs(value: TextDecorationLineProperty*): this.type = set("MozTextDecorationLine", js.Array(value :_*))
    
    @scala.inline
    def MozTextDecorationLine(value: TextDecorationLineProperty | js.Array[TextDecorationLineProperty]): this.type = set("MozTextDecorationLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozTextDecorationStyleVarargs(value: TextDecorationStyleProperty*): this.type = set("MozTextDecorationStyle", js.Array(value :_*))
    
    @scala.inline
    def MozTextDecorationStyle(value: TextDecorationStyleProperty | js.Array[TextDecorationStyleProperty]): this.type = set("MozTextDecorationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MozUserInputVarargs(value: MozUserInputProperty*): this.type = set("MozUserInput", js.Array(value :_*))
    
    @scala.inline
    def MozUserInput(value: MozUserInputProperty | js.Array[MozUserInputProperty]): this.type = set("MozUserInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def OAnimationVarargs(value: AnimationProperty*): this.type = set("OAnimation", js.Array(value :_*))
    
    @scala.inline
    def OAnimation(value: AnimationProperty | js.Array[AnimationProperty]): this.type = set("OAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def OAnimationDelayVarargs(value: GlobalsString*): this.type = set("OAnimationDelay", js.Array(value :_*))
    
    @scala.inline
    def OAnimationDelay(value: GlobalsString | js.Array[GlobalsString]): this.type = set("OAnimationDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def OAnimationDirectionVarargs(value: AnimationDirectionProperty*): this.type = set("OAnimationDirection", js.Array(value :_*))
    
    @scala.inline
    def OAnimationDirection(value: AnimationDirectionProperty | js.Array[AnimationDirectionProperty]): this.type = set("OAnimationDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def OAnimationDurationVarargs(value: GlobalsString*): this.type = set("OAnimationDuration", js.Array(value :_*))
    
    @scala.inline
    def OAnimationDuration(value: GlobalsString | js.Array[GlobalsString]): this.type = set("OAnimationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def OAnimationFillModeVarargs(value: AnimationFillModeProperty*): this.type = set("OAnimationFillMode", js.Array(value :_*))
    
    @scala.inline
    def OAnimationFillMode(value: AnimationFillModeProperty | js.Array[AnimationFillModeProperty]): this.type = set("OAnimationFillMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def OAnimationIterationCountVarargs(value: AnimationIterationCountProperty*): this.type = set("OAnimationIterationCount", js.Array(value :_*))
    
    @scala.inline
    def OAnimationIterationCount(value: AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]): this.type = set("OAnimationIterationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def OAnimationNameVarargs(value: AnimationNameProperty*): this.type = set("OAnimationName", js.Array(value :_*))
    
    @scala.inline
    def OAnimationName(value: AnimationNameProperty | js.Array[AnimationNameProperty]): this.type = set("OAnimationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def OAnimationPlayStateVarargs(value: AnimationPlayStateProperty*): this.type = set("OAnimationPlayState", js.Array(value :_*))
    
    @scala.inline
    def OAnimationPlayState(value: AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]): this.type = set("OAnimationPlayState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def OAnimationTimingFunctionVarargs(value: AnimationTimingFunctionProperty*): this.type = set("OAnimationTimingFunction", js.Array(value :_*))
    
    @scala.inline
    def OAnimationTimingFunction(value: AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]): this.type = set("OAnimationTimingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def OBackgroundSizeVarargs(value: BackgroundSizeProperty[TLength]*): this.type = set("OBackgroundSize", js.Array(value :_*))
    
    @scala.inline
    def OBackgroundSize(value: BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]): this.type = set("OBackgroundSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def OBorderImageVarargs(value: BorderImageProperty*): this.type = set("OBorderImage", js.Array(value :_*))
    
    @scala.inline
    def OBorderImage(value: BorderImageProperty | js.Array[BorderImageProperty]): this.type = set("OBorderImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def OTransformVarargs(value: TransformProperty*): this.type = set("OTransform", js.Array(value :_*))
    
    @scala.inline
    def OTransform(value: TransformProperty | js.Array[TransformProperty]): this.type = set("OTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def OTransitionVarargs(value: TransitionProperty*): this.type = set("OTransition", js.Array(value :_*))
    
    @scala.inline
    def OTransition(value: TransitionProperty | js.Array[TransitionProperty]): this.type = set("OTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def OTransitionDelayVarargs(value: GlobalsString*): this.type = set("OTransitionDelay", js.Array(value :_*))
    
    @scala.inline
    def OTransitionDelay(value: GlobalsString | js.Array[GlobalsString]): this.type = set("OTransitionDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def OTransitionDurationVarargs(value: GlobalsString*): this.type = set("OTransitionDuration", js.Array(value :_*))
    
    @scala.inline
    def OTransitionDuration(value: GlobalsString | js.Array[GlobalsString]): this.type = set("OTransitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def OTransitionPropertyVarargs(value: TransitionPropertyProperty*): this.type = set("OTransitionProperty", js.Array(value :_*))
    
    @scala.inline
    def OTransitionProperty(value: TransitionPropertyProperty | js.Array[TransitionPropertyProperty]): this.type = set("OTransitionProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def OTransitionTimingFunctionVarargs(value: TransitionTimingFunctionProperty*): this.type = set("OTransitionTimingFunction", js.Array(value :_*))
    
    @scala.inline
    def OTransitionTimingFunction(value: TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]): this.type = set("OTransitionTimingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def WebkitBoxAlignVarargs(value: BoxAlignProperty*): this.type = set("WebkitBoxAlign", js.Array(value :_*))
    
    @scala.inline
    def WebkitBoxAlign(value: BoxAlignProperty | js.Array[BoxAlignProperty]): this.type = set("WebkitBoxAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def WebkitBoxDirectionVarargs(value: BoxDirectionProperty*): this.type = set("WebkitBoxDirection", js.Array(value :_*))
    
    @scala.inline
    def WebkitBoxDirection(value: BoxDirectionProperty | js.Array[BoxDirectionProperty]): this.type = set("WebkitBoxDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def WebkitBoxFlexVarargs(value: GlobalsNumber*): this.type = set("WebkitBoxFlex", js.Array(value :_*))
    
    @scala.inline
    def WebkitBoxFlex(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("WebkitBoxFlex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def WebkitBoxFlexGroupVarargs(value: GlobalsNumber*): this.type = set("WebkitBoxFlexGroup", js.Array(value :_*))
    
    @scala.inline
    def WebkitBoxFlexGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("WebkitBoxFlexGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def WebkitBoxLinesVarargs(value: BoxLinesProperty*): this.type = set("WebkitBoxLines", js.Array(value :_*))
    
    @scala.inline
    def WebkitBoxLines(value: BoxLinesProperty | js.Array[BoxLinesProperty]): this.type = set("WebkitBoxLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def WebkitBoxOrdinalGroupVarargs(value: GlobalsNumber*): this.type = set("WebkitBoxOrdinalGroup", js.Array(value :_*))
    
    @scala.inline
    def WebkitBoxOrdinalGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("WebkitBoxOrdinalGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def WebkitBoxOrientVarargs(value: BoxOrientProperty*): this.type = set("WebkitBoxOrient", js.Array(value :_*))
    
    @scala.inline
    def WebkitBoxOrient(value: BoxOrientProperty | js.Array[BoxOrientProperty]): this.type = set("WebkitBoxOrient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def WebkitBoxPackVarargs(value: BoxPackProperty*): this.type = set("WebkitBoxPack", js.Array(value :_*))
    
    @scala.inline
    def WebkitBoxPack(value: BoxPackProperty | js.Array[BoxPackProperty]): this.type = set("WebkitBoxPack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def WebkitScrollSnapPointsXVarargs(value: ScrollSnapPointsXProperty*): this.type = set("WebkitScrollSnapPointsX", js.Array(value :_*))
    
    @scala.inline
    def WebkitScrollSnapPointsX(value: ScrollSnapPointsXProperty | js.Array[ScrollSnapPointsXProperty]): this.type = set("WebkitScrollSnapPointsX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def WebkitScrollSnapPointsYVarargs(value: ScrollSnapPointsYProperty*): this.type = set("WebkitScrollSnapPointsY", js.Array(value :_*))
    
    @scala.inline
    def WebkitScrollSnapPointsY(value: ScrollSnapPointsYProperty | js.Array[ScrollSnapPointsYProperty]): this.type = set("WebkitScrollSnapPointsY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignContentVarargs(value: AlignContentProperty*): this.type = set("alignContent", js.Array(value :_*))
    
    @scala.inline
    def alignContent(value: AlignContentProperty | js.Array[AlignContentProperty]): this.type = set("alignContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignItemsVarargs(value: AlignItemsProperty*): this.type = set("alignItems", js.Array(value :_*))
    
    @scala.inline
    def alignItems(value: AlignItemsProperty | js.Array[AlignItemsProperty]): this.type = set("alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignSelfVarargs(value: AlignSelfProperty*): this.type = set("alignSelf", js.Array(value :_*))
    
    @scala.inline
    def alignSelf(value: AlignSelfProperty | js.Array[AlignSelfProperty]): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignTracksVarargs(value: AlignTracksProperty*): this.type = set("alignTracks", js.Array(value :_*))
    
    @scala.inline
    def alignTracks(value: AlignTracksProperty | js.Array[AlignTracksProperty]): this.type = set("alignTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignmentBaselineVarargs(value: AlignmentBaselineProperty*): this.type = set("alignmentBaseline", js.Array(value :_*))
    
    @scala.inline
    def alignmentBaseline(value: AlignmentBaselineProperty | js.Array[AlignmentBaselineProperty]): this.type = set("alignmentBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allVarargs(value: Globals*): this.type = set("all", js.Array(value :_*))
    
    @scala.inline
    def all(value: Globals | js.Array[Globals]): this.type = set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationVarargs(value: AnimationProperty*): this.type = set("animation", js.Array(value :_*))
    
    @scala.inline
    def animation(value: AnimationProperty | js.Array[AnimationProperty]): this.type = set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationDelayVarargs(value: GlobalsString*): this.type = set("animationDelay", js.Array(value :_*))
    
    @scala.inline
    def animationDelay(value: GlobalsString | js.Array[GlobalsString]): this.type = set("animationDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationDirectionVarargs(value: AnimationDirectionProperty*): this.type = set("animationDirection", js.Array(value :_*))
    
    @scala.inline
    def animationDirection(value: AnimationDirectionProperty | js.Array[AnimationDirectionProperty]): this.type = set("animationDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationDurationVarargs(value: GlobalsString*): this.type = set("animationDuration", js.Array(value :_*))
    
    @scala.inline
    def animationDuration(value: GlobalsString | js.Array[GlobalsString]): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationFillModeVarargs(value: AnimationFillModeProperty*): this.type = set("animationFillMode", js.Array(value :_*))
    
    @scala.inline
    def animationFillMode(value: AnimationFillModeProperty | js.Array[AnimationFillModeProperty]): this.type = set("animationFillMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationIterationCountVarargs(value: AnimationIterationCountProperty*): this.type = set("animationIterationCount", js.Array(value :_*))
    
    @scala.inline
    def animationIterationCount(value: AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]): this.type = set("animationIterationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationNameVarargs(value: AnimationNameProperty*): this.type = set("animationName", js.Array(value :_*))
    
    @scala.inline
    def animationName(value: AnimationNameProperty | js.Array[AnimationNameProperty]): this.type = set("animationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationPlayStateVarargs(value: AnimationPlayStateProperty*): this.type = set("animationPlayState", js.Array(value :_*))
    
    @scala.inline
    def animationPlayState(value: AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]): this.type = set("animationPlayState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationTimingFunctionVarargs(value: AnimationTimingFunctionProperty*): this.type = set("animationTimingFunction", js.Array(value :_*))
    
    @scala.inline
    def animationTimingFunction(value: AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]): this.type = set("animationTimingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def appearanceVarargs(value: AppearanceProperty*): this.type = set("appearance", js.Array(value :_*))
    
    @scala.inline
    def appearance(value: AppearanceProperty | js.Array[AppearanceProperty]): this.type = set("appearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def aspectRatioVarargs(value: AspectRatioProperty*): this.type = set("aspectRatio", js.Array(value :_*))
    
    @scala.inline
    def aspectRatio(value: AspectRatioProperty | js.Array[AspectRatioProperty]): this.type = set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def azimuthVarargs(value: AzimuthProperty*): this.type = set("azimuth", js.Array(value :_*))
    
    @scala.inline
    def azimuth(value: AzimuthProperty | js.Array[AzimuthProperty]): this.type = set("azimuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backdropFilterVarargs(value: BackdropFilterProperty*): this.type = set("backdropFilter", js.Array(value :_*))
    
    @scala.inline
    def backdropFilter(value: BackdropFilterProperty | js.Array[BackdropFilterProperty]): this.type = set("backdropFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backfaceVisibilityVarargs(value: BackfaceVisibilityProperty*): this.type = set("backfaceVisibility", js.Array(value :_*))
    
    @scala.inline
    def backfaceVisibility(value: BackfaceVisibilityProperty | js.Array[BackfaceVisibilityProperty]): this.type = set("backfaceVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundVarargs(value: BackgroundProperty[TLength]*): this.type = set("background", js.Array(value :_*))
    
    @scala.inline
    def background(value: BackgroundProperty[TLength] | js.Array[BackgroundProperty[TLength]]): this.type = set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundAttachmentVarargs(value: BackgroundAttachmentProperty*): this.type = set("backgroundAttachment", js.Array(value :_*))
    
    @scala.inline
    def backgroundAttachment(value: BackgroundAttachmentProperty | js.Array[BackgroundAttachmentProperty]): this.type = set("backgroundAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundBlendModeVarargs(value: BackgroundBlendModeProperty*): this.type = set("backgroundBlendMode", js.Array(value :_*))
    
    @scala.inline
    def backgroundBlendMode(value: BackgroundBlendModeProperty | js.Array[BackgroundBlendModeProperty]): this.type = set("backgroundBlendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundClipVarargs(value: BackgroundClipProperty*): this.type = set("backgroundClip", js.Array(value :_*))
    
    @scala.inline
    def backgroundClip(value: BackgroundClipProperty | js.Array[BackgroundClipProperty]): this.type = set("backgroundClip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundColorVarargs(value: BackgroundColorProperty*): this.type = set("backgroundColor", js.Array(value :_*))
    
    @scala.inline
    def backgroundColor(value: BackgroundColorProperty | js.Array[BackgroundColorProperty]): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundImageVarargs(value: BackgroundImageProperty*): this.type = set("backgroundImage", js.Array(value :_*))
    
    @scala.inline
    def backgroundImage(value: BackgroundImageProperty | js.Array[BackgroundImageProperty]): this.type = set("backgroundImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundOriginVarargs(value: BackgroundOriginProperty*): this.type = set("backgroundOrigin", js.Array(value :_*))
    
    @scala.inline
    def backgroundOrigin(value: BackgroundOriginProperty | js.Array[BackgroundOriginProperty]): this.type = set("backgroundOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundPositionVarargs(value: BackgroundPositionProperty[TLength]*): this.type = set("backgroundPosition", js.Array(value :_*))
    
    @scala.inline
    def backgroundPosition(value: BackgroundPositionProperty[TLength] | js.Array[BackgroundPositionProperty[TLength]]): this.type = set("backgroundPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundPositionXVarargs(value: BackgroundPositionXProperty[TLength]*): this.type = set("backgroundPositionX", js.Array(value :_*))
    
    @scala.inline
    def backgroundPositionX(value: BackgroundPositionXProperty[TLength] | js.Array[BackgroundPositionXProperty[TLength]]): this.type = set("backgroundPositionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundPositionYVarargs(value: BackgroundPositionYProperty[TLength]*): this.type = set("backgroundPositionY", js.Array(value :_*))
    
    @scala.inline
    def backgroundPositionY(value: BackgroundPositionYProperty[TLength] | js.Array[BackgroundPositionYProperty[TLength]]): this.type = set("backgroundPositionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundRepeatVarargs(value: BackgroundRepeatProperty*): this.type = set("backgroundRepeat", js.Array(value :_*))
    
    @scala.inline
    def backgroundRepeat(value: BackgroundRepeatProperty | js.Array[BackgroundRepeatProperty]): this.type = set("backgroundRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundSizeVarargs(value: BackgroundSizeProperty[TLength]*): this.type = set("backgroundSize", js.Array(value :_*))
    
    @scala.inline
    def backgroundSize(value: BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]): this.type = set("backgroundSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def baselineShiftVarargs(value: BaselineShiftProperty[TLength]*): this.type = set("baselineShift", js.Array(value :_*))
    
    @scala.inline
    def baselineShift(value: BaselineShiftProperty[TLength] | js.Array[BaselineShiftProperty[TLength]]): this.type = set("baselineShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def blockOverflowVarargs(value: BlockOverflowProperty*): this.type = set("blockOverflow", js.Array(value :_*))
    
    @scala.inline
    def blockOverflow(value: BlockOverflowProperty | js.Array[BlockOverflowProperty]): this.type = set("blockOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def blockSizeVarargs(value: BlockSizeProperty[TLength]*): this.type = set("blockSize", js.Array(value :_*))
    
    @scala.inline
    def blockSize(value: BlockSizeProperty[TLength] | js.Array[BlockSizeProperty[TLength]]): this.type = set("blockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderVarargs(value: BorderProperty[TLength]*): this.type = set("border", js.Array(value :_*))
    
    @scala.inline
    def border(value: BorderProperty[TLength] | js.Array[BorderProperty[TLength]]): this.type = set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderBlockVarargs(value: BorderBlockProperty[TLength]*): this.type = set("borderBlock", js.Array(value :_*))
    
    @scala.inline
    def borderBlock(value: BorderBlockProperty[TLength] | js.Array[BorderBlockProperty[TLength]]): this.type = set("borderBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderBlockColorVarargs(value: BorderBlockColorProperty*): this.type = set("borderBlockColor", js.Array(value :_*))
    
    @scala.inline
    def borderBlockColor(value: BorderBlockColorProperty | js.Array[BorderBlockColorProperty]): this.type = set("borderBlockColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderBlockEndVarargs(value: BorderBlockEndProperty[TLength]*): this.type = set("borderBlockEnd", js.Array(value :_*))
    
    @scala.inline
    def borderBlockEnd(value: BorderBlockEndProperty[TLength] | js.Array[BorderBlockEndProperty[TLength]]): this.type = set("borderBlockEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderBlockEndColorVarargs(value: BorderBlockEndColorProperty*): this.type = set("borderBlockEndColor", js.Array(value :_*))
    
    @scala.inline
    def borderBlockEndColor(value: BorderBlockEndColorProperty | js.Array[BorderBlockEndColorProperty]): this.type = set("borderBlockEndColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderBlockEndStyleVarargs(value: BorderBlockEndStyleProperty*): this.type = set("borderBlockEndStyle", js.Array(value :_*))
    
    @scala.inline
    def borderBlockEndStyle(value: BorderBlockEndStyleProperty | js.Array[BorderBlockEndStyleProperty]): this.type = set("borderBlockEndStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderBlockEndWidthVarargs(value: BorderBlockEndWidthProperty[TLength]*): this.type = set("borderBlockEndWidth", js.Array(value :_*))
    
    @scala.inline
    def borderBlockEndWidth(value: BorderBlockEndWidthProperty[TLength] | js.Array[BorderBlockEndWidthProperty[TLength]]): this.type = set("borderBlockEndWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderBlockStartVarargs(value: BorderBlockStartProperty[TLength]*): this.type = set("borderBlockStart", js.Array(value :_*))
    
    @scala.inline
    def borderBlockStart(value: BorderBlockStartProperty[TLength] | js.Array[BorderBlockStartProperty[TLength]]): this.type = set("borderBlockStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderBlockStartColorVarargs(value: BorderBlockStartColorProperty*): this.type = set("borderBlockStartColor", js.Array(value :_*))
    
    @scala.inline
    def borderBlockStartColor(value: BorderBlockStartColorProperty | js.Array[BorderBlockStartColorProperty]): this.type = set("borderBlockStartColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderBlockStartStyleVarargs(value: BorderBlockStartStyleProperty*): this.type = set("borderBlockStartStyle", js.Array(value :_*))
    
    @scala.inline
    def borderBlockStartStyle(value: BorderBlockStartStyleProperty | js.Array[BorderBlockStartStyleProperty]): this.type = set("borderBlockStartStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderBlockStartWidthVarargs(value: BorderBlockStartWidthProperty[TLength]*): this.type = set("borderBlockStartWidth", js.Array(value :_*))
    
    @scala.inline
    def borderBlockStartWidth(value: BorderBlockStartWidthProperty[TLength] | js.Array[BorderBlockStartWidthProperty[TLength]]): this.type = set("borderBlockStartWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderBlockStyleVarargs(value: BorderBlockStyleProperty*): this.type = set("borderBlockStyle", js.Array(value :_*))
    
    @scala.inline
    def borderBlockStyle(value: BorderBlockStyleProperty | js.Array[BorderBlockStyleProperty]): this.type = set("borderBlockStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderBlockWidthVarargs(value: BorderBlockWidthProperty[TLength]*): this.type = set("borderBlockWidth", js.Array(value :_*))
    
    @scala.inline
    def borderBlockWidth(value: BorderBlockWidthProperty[TLength] | js.Array[BorderBlockWidthProperty[TLength]]): this.type = set("borderBlockWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderBottomVarargs(value: BorderBottomProperty[TLength]*): this.type = set("borderBottom", js.Array(value :_*))
    
    @scala.inline
    def borderBottom(value: BorderBottomProperty[TLength] | js.Array[BorderBottomProperty[TLength]]): this.type = set("borderBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderBottomColorVarargs(value: BorderBottomColorProperty*): this.type = set("borderBottomColor", js.Array(value :_*))
    
    @scala.inline
    def borderBottomColor(value: BorderBottomColorProperty | js.Array[BorderBottomColorProperty]): this.type = set("borderBottomColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderBottomLeftRadiusVarargs(value: BorderBottomLeftRadiusProperty[TLength]*): this.type = set("borderBottomLeftRadius", js.Array(value :_*))
    
    @scala.inline
    def borderBottomLeftRadius(value: BorderBottomLeftRadiusProperty[TLength] | js.Array[BorderBottomLeftRadiusProperty[TLength]]): this.type = set("borderBottomLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderBottomRightRadiusVarargs(value: BorderBottomRightRadiusProperty[TLength]*): this.type = set("borderBottomRightRadius", js.Array(value :_*))
    
    @scala.inline
    def borderBottomRightRadius(
      value: BorderBottomRightRadiusProperty[TLength] | js.Array[BorderBottomRightRadiusProperty[TLength]]
    ): this.type = set("borderBottomRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderBottomStyleVarargs(value: BorderBottomStyleProperty*): this.type = set("borderBottomStyle", js.Array(value :_*))
    
    @scala.inline
    def borderBottomStyle(value: BorderBottomStyleProperty | js.Array[BorderBottomStyleProperty]): this.type = set("borderBottomStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderBottomWidthVarargs(value: BorderBottomWidthProperty[TLength]*): this.type = set("borderBottomWidth", js.Array(value :_*))
    
    @scala.inline
    def borderBottomWidth(value: BorderBottomWidthProperty[TLength] | js.Array[BorderBottomWidthProperty[TLength]]): this.type = set("borderBottomWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderCollapseVarargs(value: BorderCollapseProperty*): this.type = set("borderCollapse", js.Array(value :_*))
    
    @scala.inline
    def borderCollapse(value: BorderCollapseProperty | js.Array[BorderCollapseProperty]): this.type = set("borderCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderColorVarargs(value: BorderColorProperty*): this.type = set("borderColor", js.Array(value :_*))
    
    @scala.inline
    def borderColor(value: BorderColorProperty | js.Array[BorderColorProperty]): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderEndEndRadiusVarargs(value: BorderEndEndRadiusProperty[TLength]*): this.type = set("borderEndEndRadius", js.Array(value :_*))
    
    @scala.inline
    def borderEndEndRadius(value: BorderEndEndRadiusProperty[TLength] | js.Array[BorderEndEndRadiusProperty[TLength]]): this.type = set("borderEndEndRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderEndStartRadiusVarargs(value: BorderEndStartRadiusProperty[TLength]*): this.type = set("borderEndStartRadius", js.Array(value :_*))
    
    @scala.inline
    def borderEndStartRadius(value: BorderEndStartRadiusProperty[TLength] | js.Array[BorderEndStartRadiusProperty[TLength]]): this.type = set("borderEndStartRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderImageVarargs(value: BorderImageProperty*): this.type = set("borderImage", js.Array(value :_*))
    
    @scala.inline
    def borderImage(value: BorderImageProperty | js.Array[BorderImageProperty]): this.type = set("borderImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderImageOutsetVarargs(value: BorderImageOutsetProperty[TLength]*): this.type = set("borderImageOutset", js.Array(value :_*))
    
    @scala.inline
    def borderImageOutset(value: BorderImageOutsetProperty[TLength] | js.Array[BorderImageOutsetProperty[TLength]]): this.type = set("borderImageOutset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderImageRepeatVarargs(value: BorderImageRepeatProperty*): this.type = set("borderImageRepeat", js.Array(value :_*))
    
    @scala.inline
    def borderImageRepeat(value: BorderImageRepeatProperty | js.Array[BorderImageRepeatProperty]): this.type = set("borderImageRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderImageSliceVarargs(value: BorderImageSliceProperty*): this.type = set("borderImageSlice", js.Array(value :_*))
    
    @scala.inline
    def borderImageSlice(value: BorderImageSliceProperty | js.Array[BorderImageSliceProperty]): this.type = set("borderImageSlice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderImageSourceVarargs(value: BorderImageSourceProperty*): this.type = set("borderImageSource", js.Array(value :_*))
    
    @scala.inline
    def borderImageSource(value: BorderImageSourceProperty | js.Array[BorderImageSourceProperty]): this.type = set("borderImageSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderImageWidthVarargs(value: BorderImageWidthProperty[TLength]*): this.type = set("borderImageWidth", js.Array(value :_*))
    
    @scala.inline
    def borderImageWidth(value: BorderImageWidthProperty[TLength] | js.Array[BorderImageWidthProperty[TLength]]): this.type = set("borderImageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderInlineVarargs(value: BorderInlineProperty[TLength]*): this.type = set("borderInline", js.Array(value :_*))
    
    @scala.inline
    def borderInline(value: BorderInlineProperty[TLength] | js.Array[BorderInlineProperty[TLength]]): this.type = set("borderInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderInlineColorVarargs(value: BorderInlineColorProperty*): this.type = set("borderInlineColor", js.Array(value :_*))
    
    @scala.inline
    def borderInlineColor(value: BorderInlineColorProperty | js.Array[BorderInlineColorProperty]): this.type = set("borderInlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderInlineEndVarargs(value: BorderInlineEndProperty[TLength]*): this.type = set("borderInlineEnd", js.Array(value :_*))
    
    @scala.inline
    def borderInlineEnd(value: BorderInlineEndProperty[TLength] | js.Array[BorderInlineEndProperty[TLength]]): this.type = set("borderInlineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderInlineEndColorVarargs(value: BorderInlineEndColorProperty*): this.type = set("borderInlineEndColor", js.Array(value :_*))
    
    @scala.inline
    def borderInlineEndColor(value: BorderInlineEndColorProperty | js.Array[BorderInlineEndColorProperty]): this.type = set("borderInlineEndColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderInlineEndStyleVarargs(value: BorderInlineEndStyleProperty*): this.type = set("borderInlineEndStyle", js.Array(value :_*))
    
    @scala.inline
    def borderInlineEndStyle(value: BorderInlineEndStyleProperty | js.Array[BorderInlineEndStyleProperty]): this.type = set("borderInlineEndStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderInlineEndWidthVarargs(value: BorderInlineEndWidthProperty[TLength]*): this.type = set("borderInlineEndWidth", js.Array(value :_*))
    
    @scala.inline
    def borderInlineEndWidth(value: BorderInlineEndWidthProperty[TLength] | js.Array[BorderInlineEndWidthProperty[TLength]]): this.type = set("borderInlineEndWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderInlineStartVarargs(value: BorderInlineStartProperty[TLength]*): this.type = set("borderInlineStart", js.Array(value :_*))
    
    @scala.inline
    def borderInlineStart(value: BorderInlineStartProperty[TLength] | js.Array[BorderInlineStartProperty[TLength]]): this.type = set("borderInlineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderInlineStartColorVarargs(value: BorderInlineStartColorProperty*): this.type = set("borderInlineStartColor", js.Array(value :_*))
    
    @scala.inline
    def borderInlineStartColor(value: BorderInlineStartColorProperty | js.Array[BorderInlineStartColorProperty]): this.type = set("borderInlineStartColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderInlineStartStyleVarargs(value: BorderInlineStartStyleProperty*): this.type = set("borderInlineStartStyle", js.Array(value :_*))
    
    @scala.inline
    def borderInlineStartStyle(value: BorderInlineStartStyleProperty | js.Array[BorderInlineStartStyleProperty]): this.type = set("borderInlineStartStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderInlineStartWidthVarargs(value: BorderInlineStartWidthProperty[TLength]*): this.type = set("borderInlineStartWidth", js.Array(value :_*))
    
    @scala.inline
    def borderInlineStartWidth(value: BorderInlineStartWidthProperty[TLength] | js.Array[BorderInlineStartWidthProperty[TLength]]): this.type = set("borderInlineStartWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderInlineStyleVarargs(value: BorderInlineStyleProperty*): this.type = set("borderInlineStyle", js.Array(value :_*))
    
    @scala.inline
    def borderInlineStyle(value: BorderInlineStyleProperty | js.Array[BorderInlineStyleProperty]): this.type = set("borderInlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderInlineWidthVarargs(value: BorderInlineWidthProperty[TLength]*): this.type = set("borderInlineWidth", js.Array(value :_*))
    
    @scala.inline
    def borderInlineWidth(value: BorderInlineWidthProperty[TLength] | js.Array[BorderInlineWidthProperty[TLength]]): this.type = set("borderInlineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderLeftVarargs(value: BorderLeftProperty[TLength]*): this.type = set("borderLeft", js.Array(value :_*))
    
    @scala.inline
    def borderLeft(value: BorderLeftProperty[TLength] | js.Array[BorderLeftProperty[TLength]]): this.type = set("borderLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderLeftColorVarargs(value: BorderLeftColorProperty*): this.type = set("borderLeftColor", js.Array(value :_*))
    
    @scala.inline
    def borderLeftColor(value: BorderLeftColorProperty | js.Array[BorderLeftColorProperty]): this.type = set("borderLeftColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderLeftStyleVarargs(value: BorderLeftStyleProperty*): this.type = set("borderLeftStyle", js.Array(value :_*))
    
    @scala.inline
    def borderLeftStyle(value: BorderLeftStyleProperty | js.Array[BorderLeftStyleProperty]): this.type = set("borderLeftStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderLeftWidthVarargs(value: BorderLeftWidthProperty[TLength]*): this.type = set("borderLeftWidth", js.Array(value :_*))
    
    @scala.inline
    def borderLeftWidth(value: BorderLeftWidthProperty[TLength] | js.Array[BorderLeftWidthProperty[TLength]]): this.type = set("borderLeftWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderRadiusVarargs(value: BorderRadiusProperty[TLength]*): this.type = set("borderRadius", js.Array(value :_*))
    
    @scala.inline
    def borderRadius(value: BorderRadiusProperty[TLength] | js.Array[BorderRadiusProperty[TLength]]): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderRightVarargs(value: BorderRightProperty[TLength]*): this.type = set("borderRight", js.Array(value :_*))
    
    @scala.inline
    def borderRight(value: BorderRightProperty[TLength] | js.Array[BorderRightProperty[TLength]]): this.type = set("borderRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderRightColorVarargs(value: BorderRightColorProperty*): this.type = set("borderRightColor", js.Array(value :_*))
    
    @scala.inline
    def borderRightColor(value: BorderRightColorProperty | js.Array[BorderRightColorProperty]): this.type = set("borderRightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderRightStyleVarargs(value: BorderRightStyleProperty*): this.type = set("borderRightStyle", js.Array(value :_*))
    
    @scala.inline
    def borderRightStyle(value: BorderRightStyleProperty | js.Array[BorderRightStyleProperty]): this.type = set("borderRightStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderRightWidthVarargs(value: BorderRightWidthProperty[TLength]*): this.type = set("borderRightWidth", js.Array(value :_*))
    
    @scala.inline
    def borderRightWidth(value: BorderRightWidthProperty[TLength] | js.Array[BorderRightWidthProperty[TLength]]): this.type = set("borderRightWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderSpacingVarargs(value: BorderSpacingProperty[TLength]*): this.type = set("borderSpacing", js.Array(value :_*))
    
    @scala.inline
    def borderSpacing(value: BorderSpacingProperty[TLength] | js.Array[BorderSpacingProperty[TLength]]): this.type = set("borderSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderStartEndRadiusVarargs(value: BorderStartEndRadiusProperty[TLength]*): this.type = set("borderStartEndRadius", js.Array(value :_*))
    
    @scala.inline
    def borderStartEndRadius(value: BorderStartEndRadiusProperty[TLength] | js.Array[BorderStartEndRadiusProperty[TLength]]): this.type = set("borderStartEndRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderStartStartRadiusVarargs(value: BorderStartStartRadiusProperty[TLength]*): this.type = set("borderStartStartRadius", js.Array(value :_*))
    
    @scala.inline
    def borderStartStartRadius(value: BorderStartStartRadiusProperty[TLength] | js.Array[BorderStartStartRadiusProperty[TLength]]): this.type = set("borderStartStartRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderStyleVarargs(value: BorderStyleProperty*): this.type = set("borderStyle", js.Array(value :_*))
    
    @scala.inline
    def borderStyle(value: BorderStyleProperty | js.Array[BorderStyleProperty]): this.type = set("borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderTopVarargs(value: BorderTopProperty[TLength]*): this.type = set("borderTop", js.Array(value :_*))
    
    @scala.inline
    def borderTop(value: BorderTopProperty[TLength] | js.Array[BorderTopProperty[TLength]]): this.type = set("borderTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderTopColorVarargs(value: BorderTopColorProperty*): this.type = set("borderTopColor", js.Array(value :_*))
    
    @scala.inline
    def borderTopColor(value: BorderTopColorProperty | js.Array[BorderTopColorProperty]): this.type = set("borderTopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderTopLeftRadiusVarargs(value: BorderTopLeftRadiusProperty[TLength]*): this.type = set("borderTopLeftRadius", js.Array(value :_*))
    
    @scala.inline
    def borderTopLeftRadius(value: BorderTopLeftRadiusProperty[TLength] | js.Array[BorderTopLeftRadiusProperty[TLength]]): this.type = set("borderTopLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderTopRightRadiusVarargs(value: BorderTopRightRadiusProperty[TLength]*): this.type = set("borderTopRightRadius", js.Array(value :_*))
    
    @scala.inline
    def borderTopRightRadius(value: BorderTopRightRadiusProperty[TLength] | js.Array[BorderTopRightRadiusProperty[TLength]]): this.type = set("borderTopRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderTopStyleVarargs(value: BorderTopStyleProperty*): this.type = set("borderTopStyle", js.Array(value :_*))
    
    @scala.inline
    def borderTopStyle(value: BorderTopStyleProperty | js.Array[BorderTopStyleProperty]): this.type = set("borderTopStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderTopWidthVarargs(value: BorderTopWidthProperty[TLength]*): this.type = set("borderTopWidth", js.Array(value :_*))
    
    @scala.inline
    def borderTopWidth(value: BorderTopWidthProperty[TLength] | js.Array[BorderTopWidthProperty[TLength]]): this.type = set("borderTopWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderWidthVarargs(value: BorderWidthProperty[TLength]*): this.type = set("borderWidth", js.Array(value :_*))
    
    @scala.inline
    def borderWidth(value: BorderWidthProperty[TLength] | js.Array[BorderWidthProperty[TLength]]): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bottomVarargs(value: BottomProperty[TLength]*): this.type = set("bottom", js.Array(value :_*))
    
    @scala.inline
    def bottom(value: BottomProperty[TLength] | js.Array[BottomProperty[TLength]]): this.type = set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def boxAlignVarargs(value: BoxAlignProperty*): this.type = set("boxAlign", js.Array(value :_*))
    
    @scala.inline
    def boxAlign(value: BoxAlignProperty | js.Array[BoxAlignProperty]): this.type = set("boxAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def boxDecorationBreakVarargs(value: BoxDecorationBreakProperty*): this.type = set("boxDecorationBreak", js.Array(value :_*))
    
    @scala.inline
    def boxDecorationBreak(value: BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty]): this.type = set("boxDecorationBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def boxDirectionVarargs(value: BoxDirectionProperty*): this.type = set("boxDirection", js.Array(value :_*))
    
    @scala.inline
    def boxDirection(value: BoxDirectionProperty | js.Array[BoxDirectionProperty]): this.type = set("boxDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def boxFlexVarargs(value: GlobalsNumber*): this.type = set("boxFlex", js.Array(value :_*))
    
    @scala.inline
    def boxFlex(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("boxFlex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def boxFlexGroupVarargs(value: GlobalsNumber*): this.type = set("boxFlexGroup", js.Array(value :_*))
    
    @scala.inline
    def boxFlexGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("boxFlexGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def boxLinesVarargs(value: BoxLinesProperty*): this.type = set("boxLines", js.Array(value :_*))
    
    @scala.inline
    def boxLines(value: BoxLinesProperty | js.Array[BoxLinesProperty]): this.type = set("boxLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def boxOrdinalGroupVarargs(value: GlobalsNumber*): this.type = set("boxOrdinalGroup", js.Array(value :_*))
    
    @scala.inline
    def boxOrdinalGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("boxOrdinalGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def boxOrientVarargs(value: BoxOrientProperty*): this.type = set("boxOrient", js.Array(value :_*))
    
    @scala.inline
    def boxOrient(value: BoxOrientProperty | js.Array[BoxOrientProperty]): this.type = set("boxOrient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def boxPackVarargs(value: BoxPackProperty*): this.type = set("boxPack", js.Array(value :_*))
    
    @scala.inline
    def boxPack(value: BoxPackProperty | js.Array[BoxPackProperty]): this.type = set("boxPack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def boxShadowVarargs(value: BoxShadowProperty*): this.type = set("boxShadow", js.Array(value :_*))
    
    @scala.inline
    def boxShadow(value: BoxShadowProperty | js.Array[BoxShadowProperty]): this.type = set("boxShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def boxSizingVarargs(value: BoxSizingProperty*): this.type = set("boxSizing", js.Array(value :_*))
    
    @scala.inline
    def boxSizing(value: BoxSizingProperty | js.Array[BoxSizingProperty]): this.type = set("boxSizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def breakAfterVarargs(value: BreakAfterProperty*): this.type = set("breakAfter", js.Array(value :_*))
    
    @scala.inline
    def breakAfter(value: BreakAfterProperty | js.Array[BreakAfterProperty]): this.type = set("breakAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def breakBeforeVarargs(value: BreakBeforeProperty*): this.type = set("breakBefore", js.Array(value :_*))
    
    @scala.inline
    def breakBefore(value: BreakBeforeProperty | js.Array[BreakBeforeProperty]): this.type = set("breakBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def breakInsideVarargs(value: BreakInsideProperty*): this.type = set("breakInside", js.Array(value :_*))
    
    @scala.inline
    def breakInside(value: BreakInsideProperty | js.Array[BreakInsideProperty]): this.type = set("breakInside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def captionSideVarargs(value: CaptionSideProperty*): this.type = set("captionSide", js.Array(value :_*))
    
    @scala.inline
    def captionSide(value: CaptionSideProperty | js.Array[CaptionSideProperty]): this.type = set("captionSide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def caretColorVarargs(value: CaretColorProperty*): this.type = set("caretColor", js.Array(value :_*))
    
    @scala.inline
    def caretColor(value: CaretColorProperty | js.Array[CaretColorProperty]): this.type = set("caretColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clearVarargs(value: ClearProperty*): this.type = set("clear", js.Array(value :_*))
    
    @scala.inline
    def clear(value: ClearProperty | js.Array[ClearProperty]): this.type = set("clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clipVarargs(value: ClipProperty*): this.type = set("clip", js.Array(value :_*))
    
    @scala.inline
    def clip(value: ClipProperty | js.Array[ClipProperty]): this.type = set("clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clipPathVarargs(value: ClipPathProperty*): this.type = set("clipPath", js.Array(value :_*))
    
    @scala.inline
    def clipPath(value: ClipPathProperty | js.Array[ClipPathProperty]): this.type = set("clipPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clipRuleVarargs(value: ClipRuleProperty*): this.type = set("clipRule", js.Array(value :_*))
    
    @scala.inline
    def clipRule(value: ClipRuleProperty | js.Array[ClipRuleProperty]): this.type = set("clipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorVarargs(value: ColorProperty*): this.type = set("color", js.Array(value :_*))
    
    @scala.inline
    def color(value: ColorProperty | js.Array[ColorProperty]): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorAdjustVarargs(value: ColorAdjustProperty*): this.type = set("colorAdjust", js.Array(value :_*))
    
    @scala.inline
    def colorAdjust(value: ColorAdjustProperty | js.Array[ColorAdjustProperty]): this.type = set("colorAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorInterpolationVarargs(value: ColorInterpolationProperty*): this.type = set("colorInterpolation", js.Array(value :_*))
    
    @scala.inline
    def colorInterpolation(value: ColorInterpolationProperty | js.Array[ColorInterpolationProperty]): this.type = set("colorInterpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorRenderingVarargs(value: ColorRenderingProperty*): this.type = set("colorRendering", js.Array(value :_*))
    
    @scala.inline
    def colorRendering(value: ColorRenderingProperty | js.Array[ColorRenderingProperty]): this.type = set("colorRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnCountVarargs(value: ColumnCountProperty*): this.type = set("columnCount", js.Array(value :_*))
    
    @scala.inline
    def columnCount(value: ColumnCountProperty | js.Array[ColumnCountProperty]): this.type = set("columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnFillVarargs(value: ColumnFillProperty*): this.type = set("columnFill", js.Array(value :_*))
    
    @scala.inline
    def columnFill(value: ColumnFillProperty | js.Array[ColumnFillProperty]): this.type = set("columnFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnGapVarargs(value: ColumnGapProperty[TLength]*): this.type = set("columnGap", js.Array(value :_*))
    
    @scala.inline
    def columnGap(value: ColumnGapProperty[TLength] | js.Array[ColumnGapProperty[TLength]]): this.type = set("columnGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnRuleVarargs(value: ColumnRuleProperty[TLength]*): this.type = set("columnRule", js.Array(value :_*))
    
    @scala.inline
    def columnRule(value: ColumnRuleProperty[TLength] | js.Array[ColumnRuleProperty[TLength]]): this.type = set("columnRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnRuleColorVarargs(value: ColumnRuleColorProperty*): this.type = set("columnRuleColor", js.Array(value :_*))
    
    @scala.inline
    def columnRuleColor(value: ColumnRuleColorProperty | js.Array[ColumnRuleColorProperty]): this.type = set("columnRuleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnRuleStyleVarargs(value: ColumnRuleStyleProperty*): this.type = set("columnRuleStyle", js.Array(value :_*))
    
    @scala.inline
    def columnRuleStyle(value: ColumnRuleStyleProperty | js.Array[ColumnRuleStyleProperty]): this.type = set("columnRuleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnRuleWidthVarargs(value: ColumnRuleWidthProperty[TLength]*): this.type = set("columnRuleWidth", js.Array(value :_*))
    
    @scala.inline
    def columnRuleWidth(value: ColumnRuleWidthProperty[TLength] | js.Array[ColumnRuleWidthProperty[TLength]]): this.type = set("columnRuleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnSpanVarargs(value: ColumnSpanProperty*): this.type = set("columnSpan", js.Array(value :_*))
    
    @scala.inline
    def columnSpan(value: ColumnSpanProperty | js.Array[ColumnSpanProperty]): this.type = set("columnSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnWidthVarargs(value: ColumnWidthProperty[TLength]*): this.type = set("columnWidth", js.Array(value :_*))
    
    @scala.inline
    def columnWidth(value: ColumnWidthProperty[TLength] | js.Array[ColumnWidthProperty[TLength]]): this.type = set("columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnsVarargs(value: ColumnsProperty[TLength]*): this.type = set("columns", js.Array(value :_*))
    
    @scala.inline
    def columns(value: ColumnsProperty[TLength] | js.Array[ColumnsProperty[TLength]]): this.type = set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containVarargs(value: ContainProperty*): this.type = set("contain", js.Array(value :_*))
    
    @scala.inline
    def contain(value: ContainProperty | js.Array[ContainProperty]): this.type = set("contain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def container(value: HTMLElement): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentVarargs(value: ContentProperty*): this.type = set("content", js.Array(value :_*))
    
    @scala.inline
    def content(value: ContentProperty | js.Array[ContentProperty]): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def counterIncrementVarargs(value: CounterIncrementProperty*): this.type = set("counterIncrement", js.Array(value :_*))
    
    @scala.inline
    def counterIncrement(value: CounterIncrementProperty | js.Array[CounterIncrementProperty]): this.type = set("counterIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def counterResetVarargs(value: CounterResetProperty*): this.type = set("counterReset", js.Array(value :_*))
    
    @scala.inline
    def counterReset(value: CounterResetProperty | js.Array[CounterResetProperty]): this.type = set("counterReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def counterSetVarargs(value: CounterSetProperty*): this.type = set("counterSet", js.Array(value :_*))
    
    @scala.inline
    def counterSet(value: CounterSetProperty | js.Array[CounterSetProperty]): this.type = set("counterSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cursorVarargs(value: CursorProperty*): this.type = set("cursor", js.Array(value :_*))
    
    @scala.inline
    def cursor(value: CursorProperty | js.Array[CursorProperty]): this.type = set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def directionVarargs(value: DirectionProperty*): this.type = set("direction", js.Array(value :_*))
    
    @scala.inline
    def direction(value: DirectionProperty | js.Array[DirectionProperty]): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def displayVarargs(value: DisplayProperty*): this.type = set("display", js.Array(value :_*))
    
    @scala.inline
    def display(value: DisplayProperty | js.Array[DisplayProperty]): this.type = set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dominantBaselineVarargs(value: DominantBaselineProperty*): this.type = set("dominantBaseline", js.Array(value :_*))
    
    @scala.inline
    def dominantBaseline(value: DominantBaselineProperty | js.Array[DominantBaselineProperty]): this.type = set("dominantBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def elementPosition(value: IPosition): this.type = set("elementPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def elementSize(value: ISize): this.type = set("elementSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def emptyCellsVarargs(value: EmptyCellsProperty*): this.type = set("emptyCells", js.Array(value :_*))
    
    @scala.inline
    def emptyCells(value: EmptyCellsProperty | js.Array[EmptyCellsProperty]): this.type = set("emptyCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillVarargs(value: FillProperty*): this.type = set("fill", js.Array(value :_*))
    
    @scala.inline
    def fill(value: FillProperty | js.Array[FillProperty]): this.type = set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillOpacityVarargs(value: GlobalsNumber*): this.type = set("fillOpacity", js.Array(value :_*))
    
    @scala.inline
    def fillOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillRuleVarargs(value: FillRuleProperty*): this.type = set("fillRule", js.Array(value :_*))
    
    @scala.inline
    def fillRule(value: FillRuleProperty | js.Array[FillRuleProperty]): this.type = set("fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterVarargs(value: FilterProperty*): this.type = set("filter", js.Array(value :_*))
    
    @scala.inline
    def filter(value: FilterProperty | js.Array[FilterProperty]): this.type = set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexVarargs(value: FlexProperty[TLength]*): this.type = set("flex", js.Array(value :_*))
    
    @scala.inline
    def flex(value: FlexProperty[TLength] | js.Array[FlexProperty[TLength]]): this.type = set("flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexBasisVarargs(value: FlexBasisProperty[TLength]*): this.type = set("flexBasis", js.Array(value :_*))
    
    @scala.inline
    def flexBasis(value: FlexBasisProperty[TLength] | js.Array[FlexBasisProperty[TLength]]): this.type = set("flexBasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexDirectionVarargs(value: FlexDirectionProperty*): this.type = set("flexDirection", js.Array(value :_*))
    
    @scala.inline
    def flexDirection(value: FlexDirectionProperty | js.Array[FlexDirectionProperty]): this.type = set("flexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexFlowVarargs(value: FlexFlowProperty*): this.type = set("flexFlow", js.Array(value :_*))
    
    @scala.inline
    def flexFlow(value: FlexFlowProperty | js.Array[FlexFlowProperty]): this.type = set("flexFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexGrowVarargs(value: GlobalsNumber*): this.type = set("flexGrow", js.Array(value :_*))
    
    @scala.inline
    def flexGrow(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("flexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexShrinkVarargs(value: GlobalsNumber*): this.type = set("flexShrink", js.Array(value :_*))
    
    @scala.inline
    def flexShrink(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("flexShrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexWrapVarargs(value: FlexWrapProperty*): this.type = set("flexWrap", js.Array(value :_*))
    
    @scala.inline
    def flexWrap(value: FlexWrapProperty | js.Array[FlexWrapProperty]): this.type = set("flexWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floatVarargs(value: FloatProperty*): this.type = set("float", js.Array(value :_*))
    
    @scala.inline
    def float(value: FloatProperty | js.Array[FloatProperty]): this.type = set("float", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floodColorVarargs(value: FloodColorProperty*): this.type = set("floodColor", js.Array(value :_*))
    
    @scala.inline
    def floodColor(value: FloodColorProperty | js.Array[FloodColorProperty]): this.type = set("floodColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floodOpacityVarargs(value: GlobalsNumber*): this.type = set("floodOpacity", js.Array(value :_*))
    
    @scala.inline
    def floodOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("floodOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontVarargs(value: FontProperty*): this.type = set("font", js.Array(value :_*))
    
    @scala.inline
    def font(value: FontProperty | js.Array[FontProperty]): this.type = set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontFamilyVarargs(value: FontFamilyProperty*): this.type = set("fontFamily", js.Array(value :_*))
    
    @scala.inline
    def fontFamily(value: FontFamilyProperty | js.Array[FontFamilyProperty]): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontFeatureSettingsVarargs(value: FontFeatureSettingsProperty*): this.type = set("fontFeatureSettings", js.Array(value :_*))
    
    @scala.inline
    def fontFeatureSettings(value: FontFeatureSettingsProperty | js.Array[FontFeatureSettingsProperty]): this.type = set("fontFeatureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontKerningVarargs(value: FontKerningProperty*): this.type = set("fontKerning", js.Array(value :_*))
    
    @scala.inline
    def fontKerning(value: FontKerningProperty | js.Array[FontKerningProperty]): this.type = set("fontKerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontLanguageOverrideVarargs(value: FontLanguageOverrideProperty*): this.type = set("fontLanguageOverride", js.Array(value :_*))
    
    @scala.inline
    def fontLanguageOverride(value: FontLanguageOverrideProperty | js.Array[FontLanguageOverrideProperty]): this.type = set("fontLanguageOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontOpticalSizingVarargs(value: FontOpticalSizingProperty*): this.type = set("fontOpticalSizing", js.Array(value :_*))
    
    @scala.inline
    def fontOpticalSizing(value: FontOpticalSizingProperty | js.Array[FontOpticalSizingProperty]): this.type = set("fontOpticalSizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontSizeVarargs(value: FontSizeProperty[TLength]*): this.type = set("fontSize", js.Array(value :_*))
    
    @scala.inline
    def fontSize(value: FontSizeProperty[TLength] | js.Array[FontSizeProperty[TLength]]): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontSizeAdjustVarargs(value: FontSizeAdjustProperty*): this.type = set("fontSizeAdjust", js.Array(value :_*))
    
    @scala.inline
    def fontSizeAdjust(value: FontSizeAdjustProperty | js.Array[FontSizeAdjustProperty]): this.type = set("fontSizeAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontSmoothVarargs(value: FontSmoothProperty[TLength]*): this.type = set("fontSmooth", js.Array(value :_*))
    
    @scala.inline
    def fontSmooth(value: FontSmoothProperty[TLength] | js.Array[FontSmoothProperty[TLength]]): this.type = set("fontSmooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontStretchVarargs(value: FontStretchProperty*): this.type = set("fontStretch", js.Array(value :_*))
    
    @scala.inline
    def fontStretch(value: FontStretchProperty | js.Array[FontStretchProperty]): this.type = set("fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontStyleVarargs(value: FontStyleProperty*): this.type = set("fontStyle", js.Array(value :_*))
    
    @scala.inline
    def fontStyle(value: FontStyleProperty | js.Array[FontStyleProperty]): this.type = set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontSynthesisVarargs(value: FontSynthesisProperty*): this.type = set("fontSynthesis", js.Array(value :_*))
    
    @scala.inline
    def fontSynthesis(value: FontSynthesisProperty | js.Array[FontSynthesisProperty]): this.type = set("fontSynthesis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontVariantVarargs(value: FontVariantProperty*): this.type = set("fontVariant", js.Array(value :_*))
    
    @scala.inline
    def fontVariant(value: FontVariantProperty | js.Array[FontVariantProperty]): this.type = set("fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontVariantAlternatesVarargs(value: FontVariantAlternatesProperty*): this.type = set("fontVariantAlternates", js.Array(value :_*))
    
    @scala.inline
    def fontVariantAlternates(value: FontVariantAlternatesProperty | js.Array[FontVariantAlternatesProperty]): this.type = set("fontVariantAlternates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontVariantCapsVarargs(value: FontVariantCapsProperty*): this.type = set("fontVariantCaps", js.Array(value :_*))
    
    @scala.inline
    def fontVariantCaps(value: FontVariantCapsProperty | js.Array[FontVariantCapsProperty]): this.type = set("fontVariantCaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontVariantEastAsianVarargs(value: FontVariantEastAsianProperty*): this.type = set("fontVariantEastAsian", js.Array(value :_*))
    
    @scala.inline
    def fontVariantEastAsian(value: FontVariantEastAsianProperty | js.Array[FontVariantEastAsianProperty]): this.type = set("fontVariantEastAsian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontVariantLigaturesVarargs(value: FontVariantLigaturesProperty*): this.type = set("fontVariantLigatures", js.Array(value :_*))
    
    @scala.inline
    def fontVariantLigatures(value: FontVariantLigaturesProperty | js.Array[FontVariantLigaturesProperty]): this.type = set("fontVariantLigatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontVariantNumericVarargs(value: FontVariantNumericProperty*): this.type = set("fontVariantNumeric", js.Array(value :_*))
    
    @scala.inline
    def fontVariantNumeric(value: FontVariantNumericProperty | js.Array[FontVariantNumericProperty]): this.type = set("fontVariantNumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontVariantPositionVarargs(value: FontVariantPositionProperty*): this.type = set("fontVariantPosition", js.Array(value :_*))
    
    @scala.inline
    def fontVariantPosition(value: FontVariantPositionProperty | js.Array[FontVariantPositionProperty]): this.type = set("fontVariantPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontVariationSettingsVarargs(value: FontVariationSettingsProperty*): this.type = set("fontVariationSettings", js.Array(value :_*))
    
    @scala.inline
    def fontVariationSettings(value: FontVariationSettingsProperty | js.Array[FontVariationSettingsProperty]): this.type = set("fontVariationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontWeightVarargs(value: FontWeightProperty*): this.type = set("fontWeight", js.Array(value :_*))
    
    @scala.inline
    def fontWeight(value: FontWeightProperty | js.Array[FontWeightProperty]): this.type = set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gapVarargs(value: GapProperty[TLength]*): this.type = set("gap", js.Array(value :_*))
    
    @scala.inline
    def gap(value: GapProperty[TLength] | js.Array[GapProperty[TLength]]): this.type = set("gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def glyphOrientationVerticalVarargs(value: GlyphOrientationVerticalProperty*): this.type = set("glyphOrientationVertical", js.Array(value :_*))
    
    @scala.inline
    def glyphOrientationVertical(value: GlyphOrientationVerticalProperty | js.Array[GlyphOrientationVerticalProperty]): this.type = set("glyphOrientationVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridVarargs(value: GridProperty*): this.type = set("grid", js.Array(value :_*))
    
    @scala.inline
    def grid(value: GridProperty | js.Array[GridProperty]): this.type = set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridAreaVarargs(value: GridAreaProperty*): this.type = set("gridArea", js.Array(value :_*))
    
    @scala.inline
    def gridArea(value: GridAreaProperty | js.Array[GridAreaProperty]): this.type = set("gridArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridAutoColumnsVarargs(value: GridAutoColumnsProperty[TLength]*): this.type = set("gridAutoColumns", js.Array(value :_*))
    
    @scala.inline
    def gridAutoColumns(value: GridAutoColumnsProperty[TLength] | js.Array[GridAutoColumnsProperty[TLength]]): this.type = set("gridAutoColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridAutoFlowVarargs(value: GridAutoFlowProperty*): this.type = set("gridAutoFlow", js.Array(value :_*))
    
    @scala.inline
    def gridAutoFlow(value: GridAutoFlowProperty | js.Array[GridAutoFlowProperty]): this.type = set("gridAutoFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridAutoRowsVarargs(value: GridAutoRowsProperty[TLength]*): this.type = set("gridAutoRows", js.Array(value :_*))
    
    @scala.inline
    def gridAutoRows(value: GridAutoRowsProperty[TLength] | js.Array[GridAutoRowsProperty[TLength]]): this.type = set("gridAutoRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridColumnVarargs(value: GridColumnProperty*): this.type = set("gridColumn", js.Array(value :_*))
    
    @scala.inline
    def gridColumn(value: GridColumnProperty | js.Array[GridColumnProperty]): this.type = set("gridColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridColumnEndVarargs(value: GridColumnEndProperty*): this.type = set("gridColumnEnd", js.Array(value :_*))
    
    @scala.inline
    def gridColumnEnd(value: GridColumnEndProperty | js.Array[GridColumnEndProperty]): this.type = set("gridColumnEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridColumnGapVarargs(value: GridColumnGapProperty[TLength]*): this.type = set("gridColumnGap", js.Array(value :_*))
    
    @scala.inline
    def gridColumnGap(value: GridColumnGapProperty[TLength] | js.Array[GridColumnGapProperty[TLength]]): this.type = set("gridColumnGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridColumnStartVarargs(value: GridColumnStartProperty*): this.type = set("gridColumnStart", js.Array(value :_*))
    
    @scala.inline
    def gridColumnStart(value: GridColumnStartProperty | js.Array[GridColumnStartProperty]): this.type = set("gridColumnStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridGapVarargs(value: GridGapProperty[TLength]*): this.type = set("gridGap", js.Array(value :_*))
    
    @scala.inline
    def gridGap(value: GridGapProperty[TLength] | js.Array[GridGapProperty[TLength]]): this.type = set("gridGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridRowVarargs(value: GridRowProperty*): this.type = set("gridRow", js.Array(value :_*))
    
    @scala.inline
    def gridRow(value: GridRowProperty | js.Array[GridRowProperty]): this.type = set("gridRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridRowEndVarargs(value: GridRowEndProperty*): this.type = set("gridRowEnd", js.Array(value :_*))
    
    @scala.inline
    def gridRowEnd(value: GridRowEndProperty | js.Array[GridRowEndProperty]): this.type = set("gridRowEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridRowGapVarargs(value: GridRowGapProperty[TLength]*): this.type = set("gridRowGap", js.Array(value :_*))
    
    @scala.inline
    def gridRowGap(value: GridRowGapProperty[TLength] | js.Array[GridRowGapProperty[TLength]]): this.type = set("gridRowGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridRowStartVarargs(value: GridRowStartProperty*): this.type = set("gridRowStart", js.Array(value :_*))
    
    @scala.inline
    def gridRowStart(value: GridRowStartProperty | js.Array[GridRowStartProperty]): this.type = set("gridRowStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridTemplateVarargs(value: GridTemplateProperty*): this.type = set("gridTemplate", js.Array(value :_*))
    
    @scala.inline
    def gridTemplate(value: GridTemplateProperty | js.Array[GridTemplateProperty]): this.type = set("gridTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridTemplateAreasVarargs(value: GridTemplateAreasProperty*): this.type = set("gridTemplateAreas", js.Array(value :_*))
    
    @scala.inline
    def gridTemplateAreas(value: GridTemplateAreasProperty | js.Array[GridTemplateAreasProperty]): this.type = set("gridTemplateAreas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridTemplateColumnsVarargs(value: GridTemplateColumnsProperty[TLength]*): this.type = set("gridTemplateColumns", js.Array(value :_*))
    
    @scala.inline
    def gridTemplateColumns(value: GridTemplateColumnsProperty[TLength] | js.Array[GridTemplateColumnsProperty[TLength]]): this.type = set("gridTemplateColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridTemplateRowsVarargs(value: GridTemplateRowsProperty[TLength]*): this.type = set("gridTemplateRows", js.Array(value :_*))
    
    @scala.inline
    def gridTemplateRows(value: GridTemplateRowsProperty[TLength] | js.Array[GridTemplateRowsProperty[TLength]]): this.type = set("gridTemplateRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hangingPunctuationVarargs(value: HangingPunctuationProperty*): this.type = set("hangingPunctuation", js.Array(value :_*))
    
    @scala.inline
    def hangingPunctuation(value: HangingPunctuationProperty | js.Array[HangingPunctuationProperty]): this.type = set("hangingPunctuation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def heightVarargs(value: HeightProperty[TLength]*): this.type = set("height", js.Array(value :_*))
    
    @scala.inline
    def height(value: HeightProperty[TLength] | js.Array[HeightProperty[TLength]]): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hyphensVarargs(value: HyphensProperty*): this.type = set("hyphens", js.Array(value :_*))
    
    @scala.inline
    def hyphens(value: HyphensProperty | js.Array[HyphensProperty]): this.type = set("hyphens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageOrientationVarargs(value: ImageOrientationProperty*): this.type = set("imageOrientation", js.Array(value :_*))
    
    @scala.inline
    def imageOrientation(value: ImageOrientationProperty | js.Array[ImageOrientationProperty]): this.type = set("imageOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageRenderingVarargs(value: ImageRenderingProperty*): this.type = set("imageRendering", js.Array(value :_*))
    
    @scala.inline
    def imageRendering(value: ImageRenderingProperty | js.Array[ImageRenderingProperty]): this.type = set("imageRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageResolutionVarargs(value: ImageResolutionProperty*): this.type = set("imageResolution", js.Array(value :_*))
    
    @scala.inline
    def imageResolution(value: ImageResolutionProperty | js.Array[ImageResolutionProperty]): this.type = set("imageResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imeModeVarargs(value: ImeModeProperty*): this.type = set("imeMode", js.Array(value :_*))
    
    @scala.inline
    def imeMode(value: ImeModeProperty | js.Array[ImeModeProperty]): this.type = set("imeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialLetterVarargs(value: InitialLetterProperty*): this.type = set("initialLetter", js.Array(value :_*))
    
    @scala.inline
    def initialLetter(value: InitialLetterProperty | js.Array[InitialLetterProperty]): this.type = set("initialLetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inlineSizeVarargs(value: InlineSizeProperty[TLength]*): this.type = set("inlineSize", js.Array(value :_*))
    
    @scala.inline
    def inlineSize(value: InlineSizeProperty[TLength] | js.Array[InlineSizeProperty[TLength]]): this.type = set("inlineSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def insetVarargs(value: InsetProperty[TLength]*): this.type = set("inset", js.Array(value :_*))
    
    @scala.inline
    def inset(value: InsetProperty[TLength] | js.Array[InsetProperty[TLength]]): this.type = set("inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def insetBlockVarargs(value: InsetBlockProperty[TLength]*): this.type = set("insetBlock", js.Array(value :_*))
    
    @scala.inline
    def insetBlock(value: InsetBlockProperty[TLength] | js.Array[InsetBlockProperty[TLength]]): this.type = set("insetBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def insetBlockEndVarargs(value: InsetBlockEndProperty[TLength]*): this.type = set("insetBlockEnd", js.Array(value :_*))
    
    @scala.inline
    def insetBlockEnd(value: InsetBlockEndProperty[TLength] | js.Array[InsetBlockEndProperty[TLength]]): this.type = set("insetBlockEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def insetBlockStartVarargs(value: InsetBlockStartProperty[TLength]*): this.type = set("insetBlockStart", js.Array(value :_*))
    
    @scala.inline
    def insetBlockStart(value: InsetBlockStartProperty[TLength] | js.Array[InsetBlockStartProperty[TLength]]): this.type = set("insetBlockStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def insetInlineVarargs(value: InsetInlineProperty[TLength]*): this.type = set("insetInline", js.Array(value :_*))
    
    @scala.inline
    def insetInline(value: InsetInlineProperty[TLength] | js.Array[InsetInlineProperty[TLength]]): this.type = set("insetInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def insetInlineEndVarargs(value: InsetInlineEndProperty[TLength]*): this.type = set("insetInlineEnd", js.Array(value :_*))
    
    @scala.inline
    def insetInlineEnd(value: InsetInlineEndProperty[TLength] | js.Array[InsetInlineEndProperty[TLength]]): this.type = set("insetInlineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def insetInlineStartVarargs(value: InsetInlineStartProperty[TLength]*): this.type = set("insetInlineStart", js.Array(value :_*))
    
    @scala.inline
    def insetInlineStart(value: InsetInlineStartProperty[TLength] | js.Array[InsetInlineStartProperty[TLength]]): this.type = set("insetInlineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isolationVarargs(value: IsolationProperty*): this.type = set("isolation", js.Array(value :_*))
    
    @scala.inline
    def isolation(value: IsolationProperty | js.Array[IsolationProperty]): this.type = set("isolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def justify(value: center | right | left): this.type = set("justify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def justifyContentVarargs(value: JustifyContentProperty*): this.type = set("justifyContent", js.Array(value :_*))
    
    @scala.inline
    def justifyContent(value: JustifyContentProperty | js.Array[JustifyContentProperty]): this.type = set("justifyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def justifyItemsVarargs(value: JustifyItemsProperty*): this.type = set("justifyItems", js.Array(value :_*))
    
    @scala.inline
    def justifyItems(value: JustifyItemsProperty | js.Array[JustifyItemsProperty]): this.type = set("justifyItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def justifySelfVarargs(value: JustifySelfProperty*): this.type = set("justifySelf", js.Array(value :_*))
    
    @scala.inline
    def justifySelf(value: JustifySelfProperty | js.Array[JustifySelfProperty]): this.type = set("justifySelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def justifyTracksVarargs(value: JustifyTracksProperty*): this.type = set("justifyTracks", js.Array(value :_*))
    
    @scala.inline
    def justifyTracks(value: JustifyTracksProperty | js.Array[JustifyTracksProperty]): this.type = set("justifyTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def kind(value: IBuiltin): this.type = set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftVarargs(value: LeftProperty[TLength]*): this.type = set("left", js.Array(value :_*))
    
    @scala.inline
    def left(value: LeftProperty[TLength] | js.Array[LeftProperty[TLength]]): this.type = set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def letterSpacingVarargs(value: LetterSpacingProperty[TLength]*): this.type = set("letterSpacing", js.Array(value :_*))
    
    @scala.inline
    def letterSpacing(value: LetterSpacingProperty[TLength] | js.Array[LetterSpacingProperty[TLength]]): this.type = set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lightingColorVarargs(value: LightingColorProperty*): this.type = set("lightingColor", js.Array(value :_*))
    
    @scala.inline
    def lightingColor(value: LightingColorProperty | js.Array[LightingColorProperty]): this.type = set("lightingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lineBreakVarargs(value: LineBreakProperty*): this.type = set("lineBreak", js.Array(value :_*))
    
    @scala.inline
    def lineBreak(value: LineBreakProperty | js.Array[LineBreakProperty]): this.type = set("lineBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lineClampVarargs(value: LineClampProperty*): this.type = set("lineClamp", js.Array(value :_*))
    
    @scala.inline
    def lineClamp(value: LineClampProperty | js.Array[LineClampProperty]): this.type = set("lineClamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lineHeightVarargs(value: LineHeightProperty[TLength]*): this.type = set("lineHeight", js.Array(value :_*))
    
    @scala.inline
    def lineHeight(value: LineHeightProperty[TLength] | js.Array[LineHeightProperty[TLength]]): this.type = set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lineHeightStepVarargs(value: LineHeightStepProperty[TLength]*): this.type = set("lineHeightStep", js.Array(value :_*))
    
    @scala.inline
    def lineHeightStep(value: LineHeightStepProperty[TLength] | js.Array[LineHeightStepProperty[TLength]]): this.type = set("lineHeightStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listStyleVarargs(value: ListStyleProperty*): this.type = set("listStyle", js.Array(value :_*))
    
    @scala.inline
    def listStyle(value: ListStyleProperty | js.Array[ListStyleProperty]): this.type = set("listStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listStyleImageVarargs(value: ListStyleImageProperty*): this.type = set("listStyleImage", js.Array(value :_*))
    
    @scala.inline
    def listStyleImage(value: ListStyleImageProperty | js.Array[ListStyleImageProperty]): this.type = set("listStyleImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listStylePositionVarargs(value: ListStylePositionProperty*): this.type = set("listStylePosition", js.Array(value :_*))
    
    @scala.inline
    def listStylePosition(value: ListStylePositionProperty | js.Array[ListStylePositionProperty]): this.type = set("listStylePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listStyleTypeVarargs(value: ListStyleTypeProperty*): this.type = set("listStyleType", js.Array(value :_*))
    
    @scala.inline
    def listStyleType(value: ListStyleTypeProperty | js.Array[ListStyleTypeProperty]): this.type = set("listStyleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginVarargs(value: MarginProperty[TLength]*): this.type = set("margin", js.Array(value :_*))
    
    @scala.inline
    def margin(value: MarginProperty[TLength] | js.Array[MarginProperty[TLength]]): this.type = set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginBlockVarargs(value: MarginBlockProperty[TLength]*): this.type = set("marginBlock", js.Array(value :_*))
    
    @scala.inline
    def marginBlock(value: MarginBlockProperty[TLength] | js.Array[MarginBlockProperty[TLength]]): this.type = set("marginBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginBlockEndVarargs(value: MarginBlockEndProperty[TLength]*): this.type = set("marginBlockEnd", js.Array(value :_*))
    
    @scala.inline
    def marginBlockEnd(value: MarginBlockEndProperty[TLength] | js.Array[MarginBlockEndProperty[TLength]]): this.type = set("marginBlockEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginBlockStartVarargs(value: MarginBlockStartProperty[TLength]*): this.type = set("marginBlockStart", js.Array(value :_*))
    
    @scala.inline
    def marginBlockStart(value: MarginBlockStartProperty[TLength] | js.Array[MarginBlockStartProperty[TLength]]): this.type = set("marginBlockStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginBottomVarargs(value: MarginBottomProperty[TLength]*): this.type = set("marginBottom", js.Array(value :_*))
    
    @scala.inline
    def marginBottom(value: MarginBottomProperty[TLength] | js.Array[MarginBottomProperty[TLength]]): this.type = set("marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginInlineVarargs(value: MarginInlineProperty[TLength]*): this.type = set("marginInline", js.Array(value :_*))
    
    @scala.inline
    def marginInline(value: MarginInlineProperty[TLength] | js.Array[MarginInlineProperty[TLength]]): this.type = set("marginInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginInlineEndVarargs(value: MarginInlineEndProperty[TLength]*): this.type = set("marginInlineEnd", js.Array(value :_*))
    
    @scala.inline
    def marginInlineEnd(value: MarginInlineEndProperty[TLength] | js.Array[MarginInlineEndProperty[TLength]]): this.type = set("marginInlineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginInlineStartVarargs(value: MarginInlineStartProperty[TLength]*): this.type = set("marginInlineStart", js.Array(value :_*))
    
    @scala.inline
    def marginInlineStart(value: MarginInlineStartProperty[TLength] | js.Array[MarginInlineStartProperty[TLength]]): this.type = set("marginInlineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginLeftVarargs(value: MarginLeftProperty[TLength]*): this.type = set("marginLeft", js.Array(value :_*))
    
    @scala.inline
    def marginLeft(value: MarginLeftProperty[TLength] | js.Array[MarginLeftProperty[TLength]]): this.type = set("marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginRightVarargs(value: MarginRightProperty[TLength]*): this.type = set("marginRight", js.Array(value :_*))
    
    @scala.inline
    def marginRight(value: MarginRightProperty[TLength] | js.Array[MarginRightProperty[TLength]]): this.type = set("marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginTopVarargs(value: MarginTopProperty[TLength]*): this.type = set("marginTop", js.Array(value :_*))
    
    @scala.inline
    def marginTop(value: MarginTopProperty[TLength] | js.Array[MarginTopProperty[TLength]]): this.type = set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def markerVarargs(value: MarkerProperty*): this.type = set("marker", js.Array(value :_*))
    
    @scala.inline
    def marker(value: MarkerProperty | js.Array[MarkerProperty]): this.type = set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def markerEndVarargs(value: MarkerEndProperty*): this.type = set("markerEnd", js.Array(value :_*))
    
    @scala.inline
    def markerEnd(value: MarkerEndProperty | js.Array[MarkerEndProperty]): this.type = set("markerEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def markerMidVarargs(value: MarkerMidProperty*): this.type = set("markerMid", js.Array(value :_*))
    
    @scala.inline
    def markerMid(value: MarkerMidProperty | js.Array[MarkerMidProperty]): this.type = set("markerMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def markerStartVarargs(value: MarkerStartProperty*): this.type = set("markerStart", js.Array(value :_*))
    
    @scala.inline
    def markerStart(value: MarkerStartProperty | js.Array[MarkerStartProperty]): this.type = set("markerStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskVarargs(value: MaskProperty[TLength]*): this.type = set("mask", js.Array(value :_*))
    
    @scala.inline
    def mask(value: MaskProperty[TLength] | js.Array[MaskProperty[TLength]]): this.type = set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskBorderVarargs(value: MaskBorderProperty*): this.type = set("maskBorder", js.Array(value :_*))
    
    @scala.inline
    def maskBorder(value: MaskBorderProperty | js.Array[MaskBorderProperty]): this.type = set("maskBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskBorderModeVarargs(value: MaskBorderModeProperty*): this.type = set("maskBorderMode", js.Array(value :_*))
    
    @scala.inline
    def maskBorderMode(value: MaskBorderModeProperty | js.Array[MaskBorderModeProperty]): this.type = set("maskBorderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskBorderOutsetVarargs(value: MaskBorderOutsetProperty[TLength]*): this.type = set("maskBorderOutset", js.Array(value :_*))
    
    @scala.inline
    def maskBorderOutset(value: MaskBorderOutsetProperty[TLength] | js.Array[MaskBorderOutsetProperty[TLength]]): this.type = set("maskBorderOutset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskBorderRepeatVarargs(value: MaskBorderRepeatProperty*): this.type = set("maskBorderRepeat", js.Array(value :_*))
    
    @scala.inline
    def maskBorderRepeat(value: MaskBorderRepeatProperty | js.Array[MaskBorderRepeatProperty]): this.type = set("maskBorderRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskBorderSliceVarargs(value: MaskBorderSliceProperty*): this.type = set("maskBorderSlice", js.Array(value :_*))
    
    @scala.inline
    def maskBorderSlice(value: MaskBorderSliceProperty | js.Array[MaskBorderSliceProperty]): this.type = set("maskBorderSlice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskBorderSourceVarargs(value: MaskBorderSourceProperty*): this.type = set("maskBorderSource", js.Array(value :_*))
    
    @scala.inline
    def maskBorderSource(value: MaskBorderSourceProperty | js.Array[MaskBorderSourceProperty]): this.type = set("maskBorderSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskBorderWidthVarargs(value: MaskBorderWidthProperty[TLength]*): this.type = set("maskBorderWidth", js.Array(value :_*))
    
    @scala.inline
    def maskBorderWidth(value: MaskBorderWidthProperty[TLength] | js.Array[MaskBorderWidthProperty[TLength]]): this.type = set("maskBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskClipVarargs(value: MaskClipProperty*): this.type = set("maskClip", js.Array(value :_*))
    
    @scala.inline
    def maskClip(value: MaskClipProperty | js.Array[MaskClipProperty]): this.type = set("maskClip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskCompositeVarargs(value: MaskCompositeProperty*): this.type = set("maskComposite", js.Array(value :_*))
    
    @scala.inline
    def maskComposite(value: MaskCompositeProperty | js.Array[MaskCompositeProperty]): this.type = set("maskComposite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskImageVarargs(value: MaskImageProperty*): this.type = set("maskImage", js.Array(value :_*))
    
    @scala.inline
    def maskImage(value: MaskImageProperty | js.Array[MaskImageProperty]): this.type = set("maskImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskModeVarargs(value: MaskModeProperty*): this.type = set("maskMode", js.Array(value :_*))
    
    @scala.inline
    def maskMode(value: MaskModeProperty | js.Array[MaskModeProperty]): this.type = set("maskMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskOriginVarargs(value: MaskOriginProperty*): this.type = set("maskOrigin", js.Array(value :_*))
    
    @scala.inline
    def maskOrigin(value: MaskOriginProperty | js.Array[MaskOriginProperty]): this.type = set("maskOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskPositionVarargs(value: MaskPositionProperty[TLength]*): this.type = set("maskPosition", js.Array(value :_*))
    
    @scala.inline
    def maskPosition(value: MaskPositionProperty[TLength] | js.Array[MaskPositionProperty[TLength]]): this.type = set("maskPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskRepeatVarargs(value: MaskRepeatProperty*): this.type = set("maskRepeat", js.Array(value :_*))
    
    @scala.inline
    def maskRepeat(value: MaskRepeatProperty | js.Array[MaskRepeatProperty]): this.type = set("maskRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskSizeVarargs(value: MaskSizeProperty[TLength]*): this.type = set("maskSize", js.Array(value :_*))
    
    @scala.inline
    def maskSize(value: MaskSizeProperty[TLength] | js.Array[MaskSizeProperty[TLength]]): this.type = set("maskSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskTypeVarargs(value: MaskTypeProperty*): this.type = set("maskType", js.Array(value :_*))
    
    @scala.inline
    def maskType(value: MaskTypeProperty | js.Array[MaskTypeProperty]): this.type = set("maskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def masonryAutoFlowVarargs(value: MasonryAutoFlowProperty*): this.type = set("masonryAutoFlow", js.Array(value :_*))
    
    @scala.inline
    def masonryAutoFlow(value: MasonryAutoFlowProperty | js.Array[MasonryAutoFlowProperty]): this.type = set("masonryAutoFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mathStyleVarargs(value: MathStyleProperty*): this.type = set("mathStyle", js.Array(value :_*))
    
    @scala.inline
    def mathStyle(value: MathStyleProperty | js.Array[MathStyleProperty]): this.type = set("mathStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxBlockSizeVarargs(value: MaxBlockSizeProperty[TLength]*): this.type = set("maxBlockSize", js.Array(value :_*))
    
    @scala.inline
    def maxBlockSize(value: MaxBlockSizeProperty[TLength] | js.Array[MaxBlockSizeProperty[TLength]]): this.type = set("maxBlockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxHeightVarargs(value: MaxHeightProperty[TLength]*): this.type = set("maxHeight", js.Array(value :_*))
    
    @scala.inline
    def maxHeight(value: MaxHeightProperty[TLength] | js.Array[MaxHeightProperty[TLength]]): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxInlineSizeVarargs(value: MaxInlineSizeProperty[TLength]*): this.type = set("maxInlineSize", js.Array(value :_*))
    
    @scala.inline
    def maxInlineSize(value: MaxInlineSizeProperty[TLength] | js.Array[MaxInlineSizeProperty[TLength]]): this.type = set("maxInlineSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxLinesVarargs(value: MaxLinesProperty*): this.type = set("maxLines", js.Array(value :_*))
    
    @scala.inline
    def maxLines(value: MaxLinesProperty | js.Array[MaxLinesProperty]): this.type = set("maxLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxWidthVarargs(value: MaxWidthProperty[TLength]*): this.type = set("maxWidth", js.Array(value :_*))
    
    @scala.inline
    def maxWidth(value: MaxWidthProperty[TLength] | js.Array[MaxWidthProperty[TLength]]): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minBlockSizeVarargs(value: MinBlockSizeProperty[TLength]*): this.type = set("minBlockSize", js.Array(value :_*))
    
    @scala.inline
    def minBlockSize(value: MinBlockSizeProperty[TLength] | js.Array[MinBlockSizeProperty[TLength]]): this.type = set("minBlockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minHeightVarargs(value: MinHeightProperty[TLength]*): this.type = set("minHeight", js.Array(value :_*))
    
    @scala.inline
    def minHeight(value: MinHeightProperty[TLength] | js.Array[MinHeightProperty[TLength]]): this.type = set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minInlineSizeVarargs(value: MinInlineSizeProperty[TLength]*): this.type = set("minInlineSize", js.Array(value :_*))
    
    @scala.inline
    def minInlineSize(value: MinInlineSizeProperty[TLength] | js.Array[MinInlineSizeProperty[TLength]]): this.type = set("minInlineSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minWidthVarargs(value: MinWidthProperty[TLength]*): this.type = set("minWidth", js.Array(value :_*))
    
    @scala.inline
    def minWidth(value: MinWidthProperty[TLength] | js.Array[MinWidthProperty[TLength]]): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mixBlendModeVarargs(value: MixBlendModeProperty*): this.type = set("mixBlendMode", js.Array(value :_*))
    
    @scala.inline
    def mixBlendMode(value: MixBlendModeProperty | js.Array[MixBlendModeProperty]): this.type = set("mixBlendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionVarargs(value: OffsetProperty[TLength]*): this.type = set("motion", js.Array(value :_*))
    
    @scala.inline
    def motion(value: OffsetProperty[TLength] | js.Array[OffsetProperty[TLength]]): this.type = set("motion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionDistanceVarargs(value: OffsetDistanceProperty[TLength]*): this.type = set("motionDistance", js.Array(value :_*))
    
    @scala.inline
    def motionDistance(value: OffsetDistanceProperty[TLength] | js.Array[OffsetDistanceProperty[TLength]]): this.type = set("motionDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionPathVarargs(value: OffsetPathProperty*): this.type = set("motionPath", js.Array(value :_*))
    
    @scala.inline
    def motionPath(value: OffsetPathProperty | js.Array[OffsetPathProperty]): this.type = set("motionPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionRotationVarargs(value: OffsetRotateProperty*): this.type = set("motionRotation", js.Array(value :_*))
    
    @scala.inline
    def motionRotation(value: OffsetRotateProperty | js.Array[OffsetRotateProperty]): this.type = set("motionRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def msImeModeVarargs(value: ImeModeProperty*): this.type = set("msImeMode", js.Array(value :_*))
    
    @scala.inline
    def msImeMode(value: ImeModeProperty | js.Array[ImeModeProperty]): this.type = set("msImeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def msScrollbarTrackColorVarargs(value: MsScrollbarTrackColorProperty*): this.type = set("msScrollbarTrackColor", js.Array(value :_*))
    
    @scala.inline
    def msScrollbarTrackColor(value: MsScrollbarTrackColorProperty | js.Array[MsScrollbarTrackColorProperty]): this.type = set("msScrollbarTrackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def objectFitVarargs(value: ObjectFitProperty*): this.type = set("objectFit", js.Array(value :_*))
    
    @scala.inline
    def objectFit(value: ObjectFitProperty | js.Array[ObjectFitProperty]): this.type = set("objectFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def objectPositionVarargs(value: ObjectPositionProperty[TLength]*): this.type = set("objectPosition", js.Array(value :_*))
    
    @scala.inline
    def objectPosition(value: ObjectPositionProperty[TLength] | js.Array[ObjectPositionProperty[TLength]]): this.type = set("objectPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetVarargs(value: OffsetProperty[TLength]*): this.type = set("offset", js.Array(value :_*))
    
    @scala.inline
    def offset(value: OffsetProperty[TLength] | js.Array[OffsetProperty[TLength]]): this.type = set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetAnchorVarargs(value: OffsetAnchorProperty[TLength]*): this.type = set("offsetAnchor", js.Array(value :_*))
    
    @scala.inline
    def offsetAnchor(value: OffsetAnchorProperty[TLength] | js.Array[OffsetAnchorProperty[TLength]]): this.type = set("offsetAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetBlockVarargs(value: InsetBlockProperty[TLength]*): this.type = set("offsetBlock", js.Array(value :_*))
    
    @scala.inline
    def offsetBlock(value: InsetBlockProperty[TLength] | js.Array[InsetBlockProperty[TLength]]): this.type = set("offsetBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetBlockEndVarargs(value: InsetBlockEndProperty[TLength]*): this.type = set("offsetBlockEnd", js.Array(value :_*))
    
    @scala.inline
    def offsetBlockEnd(value: InsetBlockEndProperty[TLength] | js.Array[InsetBlockEndProperty[TLength]]): this.type = set("offsetBlockEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetBlockStartVarargs(value: InsetBlockStartProperty[TLength]*): this.type = set("offsetBlockStart", js.Array(value :_*))
    
    @scala.inline
    def offsetBlockStart(value: InsetBlockStartProperty[TLength] | js.Array[InsetBlockStartProperty[TLength]]): this.type = set("offsetBlockStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetDistanceVarargs(value: OffsetDistanceProperty[TLength]*): this.type = set("offsetDistance", js.Array(value :_*))
    
    @scala.inline
    def offsetDistance(value: OffsetDistanceProperty[TLength] | js.Array[OffsetDistanceProperty[TLength]]): this.type = set("offsetDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetInlineVarargs(value: InsetInlineProperty[TLength]*): this.type = set("offsetInline", js.Array(value :_*))
    
    @scala.inline
    def offsetInline(value: InsetInlineProperty[TLength] | js.Array[InsetInlineProperty[TLength]]): this.type = set("offsetInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetInlineEndVarargs(value: InsetInlineEndProperty[TLength]*): this.type = set("offsetInlineEnd", js.Array(value :_*))
    
    @scala.inline
    def offsetInlineEnd(value: InsetInlineEndProperty[TLength] | js.Array[InsetInlineEndProperty[TLength]]): this.type = set("offsetInlineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetInlineStartVarargs(value: InsetInlineStartProperty[TLength]*): this.type = set("offsetInlineStart", js.Array(value :_*))
    
    @scala.inline
    def offsetInlineStart(value: InsetInlineStartProperty[TLength] | js.Array[InsetInlineStartProperty[TLength]]): this.type = set("offsetInlineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetPathVarargs(value: OffsetPathProperty*): this.type = set("offsetPath", js.Array(value :_*))
    
    @scala.inline
    def offsetPath(value: OffsetPathProperty | js.Array[OffsetPathProperty]): this.type = set("offsetPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetRotateVarargs(value: OffsetRotateProperty*): this.type = set("offsetRotate", js.Array(value :_*))
    
    @scala.inline
    def offsetRotate(value: OffsetRotateProperty | js.Array[OffsetRotateProperty]): this.type = set("offsetRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetRotationVarargs(value: OffsetRotateProperty*): this.type = set("offsetRotation", js.Array(value :_*))
    
    @scala.inline
    def offsetRotation(value: OffsetRotateProperty | js.Array[OffsetRotateProperty]): this.type = set("offsetRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def opacityVarargs(value: OpacityProperty*): this.type = set("opacity", js.Array(value :_*))
    
    @scala.inline
    def opacity(value: OpacityProperty | js.Array[OpacityProperty]): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def orderVarargs(value: GlobalsNumber*): this.type = set("order", js.Array(value :_*))
    
    @scala.inline
    def order(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def orphansVarargs(value: GlobalsNumber*): this.type = set("orphans", js.Array(value :_*))
    
    @scala.inline
    def orphans(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("orphans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def outlineVarargs(value: OutlineProperty[TLength]*): this.type = set("outline", js.Array(value :_*))
    
    @scala.inline
    def outline(value: OutlineProperty[TLength] | js.Array[OutlineProperty[TLength]]): this.type = set("outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def outlineColorVarargs(value: OutlineColorProperty*): this.type = set("outlineColor", js.Array(value :_*))
    
    @scala.inline
    def outlineColor(value: OutlineColorProperty | js.Array[OutlineColorProperty]): this.type = set("outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def outlineOffsetVarargs(value: OutlineOffsetProperty[TLength]*): this.type = set("outlineOffset", js.Array(value :_*))
    
    @scala.inline
    def outlineOffset(value: OutlineOffsetProperty[TLength] | js.Array[OutlineOffsetProperty[TLength]]): this.type = set("outlineOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def outlineStyleVarargs(value: OutlineStyleProperty*): this.type = set("outlineStyle", js.Array(value :_*))
    
    @scala.inline
    def outlineStyle(value: OutlineStyleProperty | js.Array[OutlineStyleProperty]): this.type = set("outlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def outlineWidthVarargs(value: OutlineWidthProperty[TLength]*): this.type = set("outlineWidth", js.Array(value :_*))
    
    @scala.inline
    def outlineWidth(value: OutlineWidthProperty[TLength] | js.Array[OutlineWidthProperty[TLength]]): this.type = set("outlineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overflowVarargs(value: OverflowProperty*): this.type = set("overflow", js.Array(value :_*))
    
    @scala.inline
    def overflow(value: OverflowProperty | js.Array[OverflowProperty]): this.type = set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overflowAnchorVarargs(value: OverflowAnchorProperty*): this.type = set("overflowAnchor", js.Array(value :_*))
    
    @scala.inline
    def overflowAnchor(value: OverflowAnchorProperty | js.Array[OverflowAnchorProperty]): this.type = set("overflowAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overflowBlockVarargs(value: OverflowBlockProperty*): this.type = set("overflowBlock", js.Array(value :_*))
    
    @scala.inline
    def overflowBlock(value: OverflowBlockProperty | js.Array[OverflowBlockProperty]): this.type = set("overflowBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overflowClipBoxVarargs(value: OverflowClipBoxProperty*): this.type = set("overflowClipBox", js.Array(value :_*))
    
    @scala.inline
    def overflowClipBox(value: OverflowClipBoxProperty | js.Array[OverflowClipBoxProperty]): this.type = set("overflowClipBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overflowInlineVarargs(value: OverflowInlineProperty*): this.type = set("overflowInline", js.Array(value :_*))
    
    @scala.inline
    def overflowInline(value: OverflowInlineProperty | js.Array[OverflowInlineProperty]): this.type = set("overflowInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overflowWrapVarargs(value: OverflowWrapProperty*): this.type = set("overflowWrap", js.Array(value :_*))
    
    @scala.inline
    def overflowWrap(value: OverflowWrapProperty | js.Array[OverflowWrapProperty]): this.type = set("overflowWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overflowXVarargs(value: OverflowXProperty*): this.type = set("overflowX", js.Array(value :_*))
    
    @scala.inline
    def overflowX(value: OverflowXProperty | js.Array[OverflowXProperty]): this.type = set("overflowX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overflowYVarargs(value: OverflowYProperty*): this.type = set("overflowY", js.Array(value :_*))
    
    @scala.inline
    def overflowY(value: OverflowYProperty | js.Array[OverflowYProperty]): this.type = set("overflowY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overscrollBehaviorVarargs(value: OverscrollBehaviorProperty*): this.type = set("overscrollBehavior", js.Array(value :_*))
    
    @scala.inline
    def overscrollBehavior(value: OverscrollBehaviorProperty | js.Array[OverscrollBehaviorProperty]): this.type = set("overscrollBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overscrollBehaviorBlockVarargs(value: OverscrollBehaviorBlockProperty*): this.type = set("overscrollBehaviorBlock", js.Array(value :_*))
    
    @scala.inline
    def overscrollBehaviorBlock(value: OverscrollBehaviorBlockProperty | js.Array[OverscrollBehaviorBlockProperty]): this.type = set("overscrollBehaviorBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overscrollBehaviorInlineVarargs(value: OverscrollBehaviorInlineProperty*): this.type = set("overscrollBehaviorInline", js.Array(value :_*))
    
    @scala.inline
    def overscrollBehaviorInline(value: OverscrollBehaviorInlineProperty | js.Array[OverscrollBehaviorInlineProperty]): this.type = set("overscrollBehaviorInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overscrollBehaviorXVarargs(value: OverscrollBehaviorXProperty*): this.type = set("overscrollBehaviorX", js.Array(value :_*))
    
    @scala.inline
    def overscrollBehaviorX(value: OverscrollBehaviorXProperty | js.Array[OverscrollBehaviorXProperty]): this.type = set("overscrollBehaviorX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overscrollBehaviorYVarargs(value: OverscrollBehaviorYProperty*): this.type = set("overscrollBehaviorY", js.Array(value :_*))
    
    @scala.inline
    def overscrollBehaviorY(value: OverscrollBehaviorYProperty | js.Array[OverscrollBehaviorYProperty]): this.type = set("overscrollBehaviorY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingVarargs(value: PaddingProperty[TLength]*): this.type = set("padding", js.Array(value :_*))
    
    @scala.inline
    def padding(value: PaddingProperty[TLength] | js.Array[PaddingProperty[TLength]]): this.type = set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingBlockVarargs(value: PaddingBlockProperty[TLength]*): this.type = set("paddingBlock", js.Array(value :_*))
    
    @scala.inline
    def paddingBlock(value: PaddingBlockProperty[TLength] | js.Array[PaddingBlockProperty[TLength]]): this.type = set("paddingBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingBlockEndVarargs(value: PaddingBlockEndProperty[TLength]*): this.type = set("paddingBlockEnd", js.Array(value :_*))
    
    @scala.inline
    def paddingBlockEnd(value: PaddingBlockEndProperty[TLength] | js.Array[PaddingBlockEndProperty[TLength]]): this.type = set("paddingBlockEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingBlockStartVarargs(value: PaddingBlockStartProperty[TLength]*): this.type = set("paddingBlockStart", js.Array(value :_*))
    
    @scala.inline
    def paddingBlockStart(value: PaddingBlockStartProperty[TLength] | js.Array[PaddingBlockStartProperty[TLength]]): this.type = set("paddingBlockStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingBottomVarargs(value: PaddingBottomProperty[TLength]*): this.type = set("paddingBottom", js.Array(value :_*))
    
    @scala.inline
    def paddingBottom(value: PaddingBottomProperty[TLength] | js.Array[PaddingBottomProperty[TLength]]): this.type = set("paddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingInlineVarargs(value: PaddingInlineProperty[TLength]*): this.type = set("paddingInline", js.Array(value :_*))
    
    @scala.inline
    def paddingInline(value: PaddingInlineProperty[TLength] | js.Array[PaddingInlineProperty[TLength]]): this.type = set("paddingInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingInlineEndVarargs(value: PaddingInlineEndProperty[TLength]*): this.type = set("paddingInlineEnd", js.Array(value :_*))
    
    @scala.inline
    def paddingInlineEnd(value: PaddingInlineEndProperty[TLength] | js.Array[PaddingInlineEndProperty[TLength]]): this.type = set("paddingInlineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingInlineStartVarargs(value: PaddingInlineStartProperty[TLength]*): this.type = set("paddingInlineStart", js.Array(value :_*))
    
    @scala.inline
    def paddingInlineStart(value: PaddingInlineStartProperty[TLength] | js.Array[PaddingInlineStartProperty[TLength]]): this.type = set("paddingInlineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingLeftVarargs(value: PaddingLeftProperty[TLength]*): this.type = set("paddingLeft", js.Array(value :_*))
    
    @scala.inline
    def paddingLeft(value: PaddingLeftProperty[TLength] | js.Array[PaddingLeftProperty[TLength]]): this.type = set("paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingRightVarargs(value: PaddingRightProperty[TLength]*): this.type = set("paddingRight", js.Array(value :_*))
    
    @scala.inline
    def paddingRight(value: PaddingRightProperty[TLength] | js.Array[PaddingRightProperty[TLength]]): this.type = set("paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paddingTopVarargs(value: PaddingTopProperty[TLength]*): this.type = set("paddingTop", js.Array(value :_*))
    
    @scala.inline
    def paddingTop(value: PaddingTopProperty[TLength] | js.Array[PaddingTopProperty[TLength]]): this.type = set("paddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pageBreakAfterVarargs(value: PageBreakAfterProperty*): this.type = set("pageBreakAfter", js.Array(value :_*))
    
    @scala.inline
    def pageBreakAfter(value: PageBreakAfterProperty | js.Array[PageBreakAfterProperty]): this.type = set("pageBreakAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pageBreakBeforeVarargs(value: PageBreakBeforeProperty*): this.type = set("pageBreakBefore", js.Array(value :_*))
    
    @scala.inline
    def pageBreakBefore(value: PageBreakBeforeProperty | js.Array[PageBreakBeforeProperty]): this.type = set("pageBreakBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pageBreakInsideVarargs(value: PageBreakInsideProperty*): this.type = set("pageBreakInside", js.Array(value :_*))
    
    @scala.inline
    def pageBreakInside(value: PageBreakInsideProperty | js.Array[PageBreakInsideProperty]): this.type = set("pageBreakInside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paintOrderVarargs(value: PaintOrderProperty*): this.type = set("paintOrder", js.Array(value :_*))
    
    @scala.inline
    def paintOrder(value: PaintOrderProperty | js.Array[PaintOrderProperty]): this.type = set("paintOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def perspectiveVarargs(value: PerspectiveProperty[TLength]*): this.type = set("perspective", js.Array(value :_*))
    
    @scala.inline
    def perspective(value: PerspectiveProperty[TLength] | js.Array[PerspectiveProperty[TLength]]): this.type = set("perspective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def perspectiveOriginVarargs(value: PerspectiveOriginProperty[TLength]*): this.type = set("perspectiveOrigin", js.Array(value :_*))
    
    @scala.inline
    def perspectiveOrigin(value: PerspectiveOriginProperty[TLength] | js.Array[PerspectiveOriginProperty[TLength]]): this.type = set("perspectiveOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeContentVarargs(value: PlaceContentProperty*): this.type = set("placeContent", js.Array(value :_*))
    
    @scala.inline
    def placeContent(value: PlaceContentProperty | js.Array[PlaceContentProperty]): this.type = set("placeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeItemsVarargs(value: PlaceItemsProperty*): this.type = set("placeItems", js.Array(value :_*))
    
    @scala.inline
    def placeItems(value: PlaceItemsProperty | js.Array[PlaceItemsProperty]): this.type = set("placeItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeSelfVarargs(value: PlaceSelfProperty*): this.type = set("placeSelf", js.Array(value :_*))
    
    @scala.inline
    def placeSelf(value: PlaceSelfProperty | js.Array[PlaceSelfProperty]): this.type = set("placeSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pointerEventsVarargs(value: PointerEventsProperty*): this.type = set("pointerEvents", js.Array(value :_*))
    
    @scala.inline
    def pointerEvents(value: PointerEventsProperty | js.Array[PointerEventsProperty]): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def positionVarargs(value: PositionProperty*): this.type = set("position", js.Array(value :_*))
    
    @scala.inline
    def position(value: PositionProperty | js.Array[PositionProperty]): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def quotesVarargs(value: QuotesProperty*): this.type = set("quotes", js.Array(value :_*))
    
    @scala.inline
    def quotes(value: QuotesProperty | js.Array[QuotesProperty]): this.type = set("quotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resizeVarargs(value: ResizeProperty*): this.type = set("resize", js.Array(value :_*))
    
    @scala.inline
    def resize(value: ResizeProperty | js.Array[ResizeProperty]): this.type = set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightVarargs(value: RightProperty[TLength]*): this.type = set("right", js.Array(value :_*))
    
    @scala.inline
    def right(value: RightProperty[TLength] | js.Array[RightProperty[TLength]]): this.type = set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rotateVarargs(value: RotateProperty*): this.type = set("rotate", js.Array(value :_*))
    
    @scala.inline
    def rotate(value: RotateProperty | js.Array[RotateProperty]): this.type = set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowGapVarargs(value: RowGapProperty[TLength]*): this.type = set("rowGap", js.Array(value :_*))
    
    @scala.inline
    def rowGap(value: RowGapProperty[TLength] | js.Array[RowGapProperty[TLength]]): this.type = set("rowGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rubyAlignVarargs(value: RubyAlignProperty*): this.type = set("rubyAlign", js.Array(value :_*))
    
    @scala.inline
    def rubyAlign(value: RubyAlignProperty | js.Array[RubyAlignProperty]): this.type = set("rubyAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rubyMergeVarargs(value: RubyMergeProperty*): this.type = set("rubyMerge", js.Array(value :_*))
    
    @scala.inline
    def rubyMerge(value: RubyMergeProperty | js.Array[RubyMergeProperty]): this.type = set("rubyMerge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rubyPositionVarargs(value: RubyPositionProperty*): this.type = set("rubyPosition", js.Array(value :_*))
    
    @scala.inline
    def rubyPosition(value: RubyPositionProperty | js.Array[RubyPositionProperty]): this.type = set("rubyPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scaleVarargs(value: ScaleProperty*): this.type = set("scale", js.Array(value :_*))
    
    @scala.inline
    def scale(value: ScaleProperty | js.Array[ScaleProperty]): this.type = set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollBehaviorVarargs(value: ScrollBehaviorProperty*): this.type = set("scrollBehavior", js.Array(value :_*))
    
    @scala.inline
    def scrollBehavior(value: ScrollBehaviorProperty | js.Array[ScrollBehaviorProperty]): this.type = set("scrollBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollMarginVarargs(value: ScrollMarginProperty[TLength]*): this.type = set("scrollMargin", js.Array(value :_*))
    
    @scala.inline
    def scrollMargin(value: ScrollMarginProperty[TLength] | js.Array[ScrollMarginProperty[TLength]]): this.type = set("scrollMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollMarginBlockVarargs(value: ScrollMarginBlockProperty[TLength]*): this.type = set("scrollMarginBlock", js.Array(value :_*))
    
    @scala.inline
    def scrollMarginBlock(value: ScrollMarginBlockProperty[TLength] | js.Array[ScrollMarginBlockProperty[TLength]]): this.type = set("scrollMarginBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollMarginBlockEndVarargs(value: ScrollMarginBlockEndProperty[TLength]*): this.type = set("scrollMarginBlockEnd", js.Array(value :_*))
    
    @scala.inline
    def scrollMarginBlockEnd(value: ScrollMarginBlockEndProperty[TLength] | js.Array[ScrollMarginBlockEndProperty[TLength]]): this.type = set("scrollMarginBlockEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollMarginBlockStartVarargs(value: ScrollMarginBlockStartProperty[TLength]*): this.type = set("scrollMarginBlockStart", js.Array(value :_*))
    
    @scala.inline
    def scrollMarginBlockStart(value: ScrollMarginBlockStartProperty[TLength] | js.Array[ScrollMarginBlockStartProperty[TLength]]): this.type = set("scrollMarginBlockStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollMarginBottomVarargs(value: ScrollMarginBottomProperty[TLength]*): this.type = set("scrollMarginBottom", js.Array(value :_*))
    
    @scala.inline
    def scrollMarginBottom(value: ScrollMarginBottomProperty[TLength] | js.Array[ScrollMarginBottomProperty[TLength]]): this.type = set("scrollMarginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollMarginInlineVarargs(value: ScrollMarginInlineProperty[TLength]*): this.type = set("scrollMarginInline", js.Array(value :_*))
    
    @scala.inline
    def scrollMarginInline(value: ScrollMarginInlineProperty[TLength] | js.Array[ScrollMarginInlineProperty[TLength]]): this.type = set("scrollMarginInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollMarginInlineEndVarargs(value: ScrollMarginInlineEndProperty[TLength]*): this.type = set("scrollMarginInlineEnd", js.Array(value :_*))
    
    @scala.inline
    def scrollMarginInlineEnd(value: ScrollMarginInlineEndProperty[TLength] | js.Array[ScrollMarginInlineEndProperty[TLength]]): this.type = set("scrollMarginInlineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollMarginInlineStartVarargs(value: ScrollMarginInlineStartProperty[TLength]*): this.type = set("scrollMarginInlineStart", js.Array(value :_*))
    
    @scala.inline
    def scrollMarginInlineStart(
      value: ScrollMarginInlineStartProperty[TLength] | js.Array[ScrollMarginInlineStartProperty[TLength]]
    ): this.type = set("scrollMarginInlineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollMarginLeftVarargs(value: ScrollMarginLeftProperty[TLength]*): this.type = set("scrollMarginLeft", js.Array(value :_*))
    
    @scala.inline
    def scrollMarginLeft(value: ScrollMarginLeftProperty[TLength] | js.Array[ScrollMarginLeftProperty[TLength]]): this.type = set("scrollMarginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollMarginRightVarargs(value: ScrollMarginRightProperty[TLength]*): this.type = set("scrollMarginRight", js.Array(value :_*))
    
    @scala.inline
    def scrollMarginRight(value: ScrollMarginRightProperty[TLength] | js.Array[ScrollMarginRightProperty[TLength]]): this.type = set("scrollMarginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollMarginTopVarargs(value: ScrollMarginTopProperty[TLength]*): this.type = set("scrollMarginTop", js.Array(value :_*))
    
    @scala.inline
    def scrollMarginTop(value: ScrollMarginTopProperty[TLength] | js.Array[ScrollMarginTopProperty[TLength]]): this.type = set("scrollMarginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollPaddingVarargs(value: ScrollPaddingProperty[TLength]*): this.type = set("scrollPadding", js.Array(value :_*))
    
    @scala.inline
    def scrollPadding(value: ScrollPaddingProperty[TLength] | js.Array[ScrollPaddingProperty[TLength]]): this.type = set("scrollPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollPaddingBlockVarargs(value: ScrollPaddingBlockProperty[TLength]*): this.type = set("scrollPaddingBlock", js.Array(value :_*))
    
    @scala.inline
    def scrollPaddingBlock(value: ScrollPaddingBlockProperty[TLength] | js.Array[ScrollPaddingBlockProperty[TLength]]): this.type = set("scrollPaddingBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollPaddingBlockEndVarargs(value: ScrollPaddingBlockEndProperty[TLength]*): this.type = set("scrollPaddingBlockEnd", js.Array(value :_*))
    
    @scala.inline
    def scrollPaddingBlockEnd(value: ScrollPaddingBlockEndProperty[TLength] | js.Array[ScrollPaddingBlockEndProperty[TLength]]): this.type = set("scrollPaddingBlockEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollPaddingBlockStartVarargs(value: ScrollPaddingBlockStartProperty[TLength]*): this.type = set("scrollPaddingBlockStart", js.Array(value :_*))
    
    @scala.inline
    def scrollPaddingBlockStart(
      value: ScrollPaddingBlockStartProperty[TLength] | js.Array[ScrollPaddingBlockStartProperty[TLength]]
    ): this.type = set("scrollPaddingBlockStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollPaddingBottomVarargs(value: ScrollPaddingBottomProperty[TLength]*): this.type = set("scrollPaddingBottom", js.Array(value :_*))
    
    @scala.inline
    def scrollPaddingBottom(value: ScrollPaddingBottomProperty[TLength] | js.Array[ScrollPaddingBottomProperty[TLength]]): this.type = set("scrollPaddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollPaddingInlineVarargs(value: ScrollPaddingInlineProperty[TLength]*): this.type = set("scrollPaddingInline", js.Array(value :_*))
    
    @scala.inline
    def scrollPaddingInline(value: ScrollPaddingInlineProperty[TLength] | js.Array[ScrollPaddingInlineProperty[TLength]]): this.type = set("scrollPaddingInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollPaddingInlineEndVarargs(value: ScrollPaddingInlineEndProperty[TLength]*): this.type = set("scrollPaddingInlineEnd", js.Array(value :_*))
    
    @scala.inline
    def scrollPaddingInlineEnd(value: ScrollPaddingInlineEndProperty[TLength] | js.Array[ScrollPaddingInlineEndProperty[TLength]]): this.type = set("scrollPaddingInlineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollPaddingInlineStartVarargs(value: ScrollPaddingInlineStartProperty[TLength]*): this.type = set("scrollPaddingInlineStart", js.Array(value :_*))
    
    @scala.inline
    def scrollPaddingInlineStart(
      value: ScrollPaddingInlineStartProperty[TLength] | js.Array[ScrollPaddingInlineStartProperty[TLength]]
    ): this.type = set("scrollPaddingInlineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollPaddingLeftVarargs(value: ScrollPaddingLeftProperty[TLength]*): this.type = set("scrollPaddingLeft", js.Array(value :_*))
    
    @scala.inline
    def scrollPaddingLeft(value: ScrollPaddingLeftProperty[TLength] | js.Array[ScrollPaddingLeftProperty[TLength]]): this.type = set("scrollPaddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollPaddingRightVarargs(value: ScrollPaddingRightProperty[TLength]*): this.type = set("scrollPaddingRight", js.Array(value :_*))
    
    @scala.inline
    def scrollPaddingRight(value: ScrollPaddingRightProperty[TLength] | js.Array[ScrollPaddingRightProperty[TLength]]): this.type = set("scrollPaddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollPaddingTopVarargs(value: ScrollPaddingTopProperty[TLength]*): this.type = set("scrollPaddingTop", js.Array(value :_*))
    
    @scala.inline
    def scrollPaddingTop(value: ScrollPaddingTopProperty[TLength] | js.Array[ScrollPaddingTopProperty[TLength]]): this.type = set("scrollPaddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollSnapAlignVarargs(value: ScrollSnapAlignProperty*): this.type = set("scrollSnapAlign", js.Array(value :_*))
    
    @scala.inline
    def scrollSnapAlign(value: ScrollSnapAlignProperty | js.Array[ScrollSnapAlignProperty]): this.type = set("scrollSnapAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollSnapCoordinateVarargs(value: ScrollSnapCoordinateProperty[TLength]*): this.type = set("scrollSnapCoordinate", js.Array(value :_*))
    
    @scala.inline
    def scrollSnapCoordinate(value: ScrollSnapCoordinateProperty[TLength] | js.Array[ScrollSnapCoordinateProperty[TLength]]): this.type = set("scrollSnapCoordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollSnapDestinationVarargs(value: ScrollSnapDestinationProperty[TLength]*): this.type = set("scrollSnapDestination", js.Array(value :_*))
    
    @scala.inline
    def scrollSnapDestination(value: ScrollSnapDestinationProperty[TLength] | js.Array[ScrollSnapDestinationProperty[TLength]]): this.type = set("scrollSnapDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollSnapMarginVarargs(value: ScrollMarginProperty[TLength]*): this.type = set("scrollSnapMargin", js.Array(value :_*))
    
    @scala.inline
    def scrollSnapMargin(value: ScrollMarginProperty[TLength] | js.Array[ScrollMarginProperty[TLength]]): this.type = set("scrollSnapMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollSnapMarginBottomVarargs(value: ScrollMarginBottomProperty[TLength]*): this.type = set("scrollSnapMarginBottom", js.Array(value :_*))
    
    @scala.inline
    def scrollSnapMarginBottom(value: ScrollMarginBottomProperty[TLength] | js.Array[ScrollMarginBottomProperty[TLength]]): this.type = set("scrollSnapMarginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollSnapMarginLeftVarargs(value: ScrollMarginLeftProperty[TLength]*): this.type = set("scrollSnapMarginLeft", js.Array(value :_*))
    
    @scala.inline
    def scrollSnapMarginLeft(value: ScrollMarginLeftProperty[TLength] | js.Array[ScrollMarginLeftProperty[TLength]]): this.type = set("scrollSnapMarginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollSnapMarginRightVarargs(value: ScrollMarginRightProperty[TLength]*): this.type = set("scrollSnapMarginRight", js.Array(value :_*))
    
    @scala.inline
    def scrollSnapMarginRight(value: ScrollMarginRightProperty[TLength] | js.Array[ScrollMarginRightProperty[TLength]]): this.type = set("scrollSnapMarginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollSnapMarginTopVarargs(value: ScrollMarginTopProperty[TLength]*): this.type = set("scrollSnapMarginTop", js.Array(value :_*))
    
    @scala.inline
    def scrollSnapMarginTop(value: ScrollMarginTopProperty[TLength] | js.Array[ScrollMarginTopProperty[TLength]]): this.type = set("scrollSnapMarginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollSnapPointsXVarargs(value: ScrollSnapPointsXProperty*): this.type = set("scrollSnapPointsX", js.Array(value :_*))
    
    @scala.inline
    def scrollSnapPointsX(value: ScrollSnapPointsXProperty | js.Array[ScrollSnapPointsXProperty]): this.type = set("scrollSnapPointsX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollSnapPointsYVarargs(value: ScrollSnapPointsYProperty*): this.type = set("scrollSnapPointsY", js.Array(value :_*))
    
    @scala.inline
    def scrollSnapPointsY(value: ScrollSnapPointsYProperty | js.Array[ScrollSnapPointsYProperty]): this.type = set("scrollSnapPointsY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollSnapStopVarargs(value: ScrollSnapStopProperty*): this.type = set("scrollSnapStop", js.Array(value :_*))
    
    @scala.inline
    def scrollSnapStop(value: ScrollSnapStopProperty | js.Array[ScrollSnapStopProperty]): this.type = set("scrollSnapStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollSnapTypeVarargs(value: ScrollSnapTypeProperty*): this.type = set("scrollSnapType", js.Array(value :_*))
    
    @scala.inline
    def scrollSnapType(value: ScrollSnapTypeProperty | js.Array[ScrollSnapTypeProperty]): this.type = set("scrollSnapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollSnapTypeXVarargs(value: ScrollSnapTypeXProperty*): this.type = set("scrollSnapTypeX", js.Array(value :_*))
    
    @scala.inline
    def scrollSnapTypeX(value: ScrollSnapTypeXProperty | js.Array[ScrollSnapTypeXProperty]): this.type = set("scrollSnapTypeX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollSnapTypeYVarargs(value: ScrollSnapTypeYProperty*): this.type = set("scrollSnapTypeY", js.Array(value :_*))
    
    @scala.inline
    def scrollSnapTypeY(value: ScrollSnapTypeYProperty | js.Array[ScrollSnapTypeYProperty]): this.type = set("scrollSnapTypeY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollbarColorVarargs(value: ScrollbarColorProperty*): this.type = set("scrollbarColor", js.Array(value :_*))
    
    @scala.inline
    def scrollbarColor(value: ScrollbarColorProperty | js.Array[ScrollbarColorProperty]): this.type = set("scrollbarColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollbarGutterVarargs(value: ScrollbarGutterProperty*): this.type = set("scrollbarGutter", js.Array(value :_*))
    
    @scala.inline
    def scrollbarGutter(value: ScrollbarGutterProperty | js.Array[ScrollbarGutterProperty]): this.type = set("scrollbarGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollbarTrackColorVarargs(value: MsScrollbarTrackColorProperty*): this.type = set("scrollbarTrackColor", js.Array(value :_*))
    
    @scala.inline
    def scrollbarTrackColor(value: MsScrollbarTrackColorProperty | js.Array[MsScrollbarTrackColorProperty]): this.type = set("scrollbarTrackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollbarWidthVarargs(value: ScrollbarWidthProperty*): this.type = set("scrollbarWidth", js.Array(value :_*))
    
    @scala.inline
    def scrollbarWidth(value: ScrollbarWidthProperty | js.Array[ScrollbarWidthProperty]): this.type = set("scrollbarWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shapeImageThresholdVarargs(value: ShapeImageThresholdProperty*): this.type = set("shapeImageThreshold", js.Array(value :_*))
    
    @scala.inline
    def shapeImageThreshold(value: ShapeImageThresholdProperty | js.Array[ShapeImageThresholdProperty]): this.type = set("shapeImageThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shapeMarginVarargs(value: ShapeMarginProperty[TLength]*): this.type = set("shapeMargin", js.Array(value :_*))
    
    @scala.inline
    def shapeMargin(value: ShapeMarginProperty[TLength] | js.Array[ShapeMarginProperty[TLength]]): this.type = set("shapeMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shapeOutsideVarargs(value: ShapeOutsideProperty*): this.type = set("shapeOutside", js.Array(value :_*))
    
    @scala.inline
    def shapeOutside(value: ShapeOutsideProperty | js.Array[ShapeOutsideProperty]): this.type = set("shapeOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shapeRenderingVarargs(value: ShapeRenderingProperty*): this.type = set("shapeRendering", js.Array(value :_*))
    
    @scala.inline
    def shapeRendering(value: ShapeRenderingProperty | js.Array[ShapeRenderingProperty]): this.type = set("shapeRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stopColorVarargs(value: StopColorProperty*): this.type = set("stopColor", js.Array(value :_*))
    
    @scala.inline
    def stopColor(value: StopColorProperty | js.Array[StopColorProperty]): this.type = set("stopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stopOpacityVarargs(value: GlobalsNumber*): this.type = set("stopOpacity", js.Array(value :_*))
    
    @scala.inline
    def stopOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("stopOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeVarargs(value: StrokeProperty*): this.type = set("stroke", js.Array(value :_*))
    
    @scala.inline
    def stroke(value: StrokeProperty | js.Array[StrokeProperty]): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeDasharrayVarargs(value: StrokeDasharrayProperty[TLength]*): this.type = set("strokeDasharray", js.Array(value :_*))
    
    @scala.inline
    def strokeDasharray(value: StrokeDasharrayProperty[TLength] | js.Array[StrokeDasharrayProperty[TLength]]): this.type = set("strokeDasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeDashoffsetVarargs(value: StrokeDashoffsetProperty[TLength]*): this.type = set("strokeDashoffset", js.Array(value :_*))
    
    @scala.inline
    def strokeDashoffset(value: StrokeDashoffsetProperty[TLength] | js.Array[StrokeDashoffsetProperty[TLength]]): this.type = set("strokeDashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeLinecapVarargs(value: StrokeLinecapProperty*): this.type = set("strokeLinecap", js.Array(value :_*))
    
    @scala.inline
    def strokeLinecap(value: StrokeLinecapProperty | js.Array[StrokeLinecapProperty]): this.type = set("strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeLinejoinVarargs(value: StrokeLinejoinProperty*): this.type = set("strokeLinejoin", js.Array(value :_*))
    
    @scala.inline
    def strokeLinejoin(value: StrokeLinejoinProperty | js.Array[StrokeLinejoinProperty]): this.type = set("strokeLinejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeMiterlimitVarargs(value: GlobalsNumber*): this.type = set("strokeMiterlimit", js.Array(value :_*))
    
    @scala.inline
    def strokeMiterlimit(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("strokeMiterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeOpacityVarargs(value: GlobalsNumber*): this.type = set("strokeOpacity", js.Array(value :_*))
    
    @scala.inline
    def strokeOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeWidthVarargs(value: StrokeWidthProperty[TLength]*): this.type = set("strokeWidth", js.Array(value :_*))
    
    @scala.inline
    def strokeWidth(value: StrokeWidthProperty[TLength] | js.Array[StrokeWidthProperty[TLength]]): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stylesheetVarargs(value: ISheetResolvable*): this.type = set("stylesheet", js.Array(value :_*))
    
    @scala.inline
    def stylesheet(value: ISheetResolvable | js.Array[ISheetResolvable]): this.type = set("stylesheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabSizeVarargs(value: TabSizeProperty[TLength]*): this.type = set("tabSize", js.Array(value :_*))
    
    @scala.inline
    def tabSize(value: TabSizeProperty[TLength] | js.Array[TabSizeProperty[TLength]]): this.type = set("tabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tableLayoutVarargs(value: TableLayoutProperty*): this.type = set("tableLayout", js.Array(value :_*))
    
    @scala.inline
    def tableLayout(value: TableLayoutProperty | js.Array[TableLayoutProperty]): this.type = set("tableLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tag(value: div | span): this.type = set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textAlignVarargs(value: TextAlignProperty*): this.type = set("textAlign", js.Array(value :_*))
    
    @scala.inline
    def textAlign(value: TextAlignProperty | js.Array[TextAlignProperty]): this.type = set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textAlignLastVarargs(value: TextAlignLastProperty*): this.type = set("textAlignLast", js.Array(value :_*))
    
    @scala.inline
    def textAlignLast(value: TextAlignLastProperty | js.Array[TextAlignLastProperty]): this.type = set("textAlignLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textAnchorVarargs(value: TextAnchorProperty*): this.type = set("textAnchor", js.Array(value :_*))
    
    @scala.inline
    def textAnchor(value: TextAnchorProperty | js.Array[TextAnchorProperty]): this.type = set("textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textCombineHorizontalVarargs(value: TextCombineUprightProperty*): this.type = set("textCombineHorizontal", js.Array(value :_*))
    
    @scala.inline
    def textCombineHorizontal(value: TextCombineUprightProperty | js.Array[TextCombineUprightProperty]): this.type = set("textCombineHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textCombineUprightVarargs(value: TextCombineUprightProperty*): this.type = set("textCombineUpright", js.Array(value :_*))
    
    @scala.inline
    def textCombineUpright(value: TextCombineUprightProperty | js.Array[TextCombineUprightProperty]): this.type = set("textCombineUpright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textDecorationVarargs(value: TextDecorationProperty[TLength]*): this.type = set("textDecoration", js.Array(value :_*))
    
    @scala.inline
    def textDecoration(value: TextDecorationProperty[TLength] | js.Array[TextDecorationProperty[TLength]]): this.type = set("textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textDecorationColorVarargs(value: TextDecorationColorProperty*): this.type = set("textDecorationColor", js.Array(value :_*))
    
    @scala.inline
    def textDecorationColor(value: TextDecorationColorProperty | js.Array[TextDecorationColorProperty]): this.type = set("textDecorationColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textDecorationLineVarargs(value: TextDecorationLineProperty*): this.type = set("textDecorationLine", js.Array(value :_*))
    
    @scala.inline
    def textDecorationLine(value: TextDecorationLineProperty | js.Array[TextDecorationLineProperty]): this.type = set("textDecorationLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textDecorationSkipVarargs(value: TextDecorationSkipProperty*): this.type = set("textDecorationSkip", js.Array(value :_*))
    
    @scala.inline
    def textDecorationSkip(value: TextDecorationSkipProperty | js.Array[TextDecorationSkipProperty]): this.type = set("textDecorationSkip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textDecorationSkipInkVarargs(value: TextDecorationSkipInkProperty*): this.type = set("textDecorationSkipInk", js.Array(value :_*))
    
    @scala.inline
    def textDecorationSkipInk(value: TextDecorationSkipInkProperty | js.Array[TextDecorationSkipInkProperty]): this.type = set("textDecorationSkipInk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textDecorationStyleVarargs(value: TextDecorationStyleProperty*): this.type = set("textDecorationStyle", js.Array(value :_*))
    
    @scala.inline
    def textDecorationStyle(value: TextDecorationStyleProperty | js.Array[TextDecorationStyleProperty]): this.type = set("textDecorationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textDecorationThicknessVarargs(value: TextDecorationThicknessProperty[TLength]*): this.type = set("textDecorationThickness", js.Array(value :_*))
    
    @scala.inline
    def textDecorationThickness(
      value: TextDecorationThicknessProperty[TLength] | js.Array[TextDecorationThicknessProperty[TLength]]
    ): this.type = set("textDecorationThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textDecorationWidthVarargs(value: TextDecorationThicknessProperty[TLength]*): this.type = set("textDecorationWidth", js.Array(value :_*))
    
    @scala.inline
    def textDecorationWidth(
      value: TextDecorationThicknessProperty[TLength] | js.Array[TextDecorationThicknessProperty[TLength]]
    ): this.type = set("textDecorationWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textEmphasisVarargs(value: TextEmphasisProperty*): this.type = set("textEmphasis", js.Array(value :_*))
    
    @scala.inline
    def textEmphasis(value: TextEmphasisProperty | js.Array[TextEmphasisProperty]): this.type = set("textEmphasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textEmphasisColorVarargs(value: TextEmphasisColorProperty*): this.type = set("textEmphasisColor", js.Array(value :_*))
    
    @scala.inline
    def textEmphasisColor(value: TextEmphasisColorProperty | js.Array[TextEmphasisColorProperty]): this.type = set("textEmphasisColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textEmphasisPositionVarargs(value: GlobalsString*): this.type = set("textEmphasisPosition", js.Array(value :_*))
    
    @scala.inline
    def textEmphasisPosition(value: GlobalsString | js.Array[GlobalsString]): this.type = set("textEmphasisPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textEmphasisStyleVarargs(value: TextEmphasisStyleProperty*): this.type = set("textEmphasisStyle", js.Array(value :_*))
    
    @scala.inline
    def textEmphasisStyle(value: TextEmphasisStyleProperty | js.Array[TextEmphasisStyleProperty]): this.type = set("textEmphasisStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textIndentVarargs(value: TextIndentProperty[TLength]*): this.type = set("textIndent", js.Array(value :_*))
    
    @scala.inline
    def textIndent(value: TextIndentProperty[TLength] | js.Array[TextIndentProperty[TLength]]): this.type = set("textIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textJustifyVarargs(value: TextJustifyProperty*): this.type = set("textJustify", js.Array(value :_*))
    
    @scala.inline
    def textJustify(value: TextJustifyProperty | js.Array[TextJustifyProperty]): this.type = set("textJustify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textOrientationVarargs(value: TextOrientationProperty*): this.type = set("textOrientation", js.Array(value :_*))
    
    @scala.inline
    def textOrientation(value: TextOrientationProperty | js.Array[TextOrientationProperty]): this.type = set("textOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textOverflowVarargs(value: TextOverflowProperty*): this.type = set("textOverflow", js.Array(value :_*))
    
    @scala.inline
    def textOverflow(value: TextOverflowProperty | js.Array[TextOverflowProperty]): this.type = set("textOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textRenderingVarargs(value: TextRenderingProperty*): this.type = set("textRendering", js.Array(value :_*))
    
    @scala.inline
    def textRendering(value: TextRenderingProperty | js.Array[TextRenderingProperty]): this.type = set("textRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textShadowVarargs(value: TextShadowProperty*): this.type = set("textShadow", js.Array(value :_*))
    
    @scala.inline
    def textShadow(value: TextShadowProperty | js.Array[TextShadowProperty]): this.type = set("textShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textSizeAdjustVarargs(value: TextSizeAdjustProperty*): this.type = set("textSizeAdjust", js.Array(value :_*))
    
    @scala.inline
    def textSizeAdjust(value: TextSizeAdjustProperty | js.Array[TextSizeAdjustProperty]): this.type = set("textSizeAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textTransformVarargs(value: TextTransformProperty*): this.type = set("textTransform", js.Array(value :_*))
    
    @scala.inline
    def textTransform(value: TextTransformProperty | js.Array[TextTransformProperty]): this.type = set("textTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textUnderlineOffsetVarargs(value: TextUnderlineOffsetProperty[TLength]*): this.type = set("textUnderlineOffset", js.Array(value :_*))
    
    @scala.inline
    def textUnderlineOffset(value: TextUnderlineOffsetProperty[TLength] | js.Array[TextUnderlineOffsetProperty[TLength]]): this.type = set("textUnderlineOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textUnderlinePositionVarargs(value: TextUnderlinePositionProperty*): this.type = set("textUnderlinePosition", js.Array(value :_*))
    
    @scala.inline
    def textUnderlinePosition(value: TextUnderlinePositionProperty | js.Array[TextUnderlinePositionProperty]): this.type = set("textUnderlinePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def topVarargs(value: TopProperty[TLength]*): this.type = set("top", js.Array(value :_*))
    
    @scala.inline
    def top(value: TopProperty[TLength] | js.Array[TopProperty[TLength]]): this.type = set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def touchActionVarargs(value: TouchActionProperty*): this.type = set("touchAction", js.Array(value :_*))
    
    @scala.inline
    def touchAction(value: TouchActionProperty | js.Array[TouchActionProperty]): this.type = set("touchAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transformVarargs(value: TransformProperty*): this.type = set("transform", js.Array(value :_*))
    
    @scala.inline
    def transform(value: TransformProperty | js.Array[TransformProperty]): this.type = set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transformBoxVarargs(value: TransformBoxProperty*): this.type = set("transformBox", js.Array(value :_*))
    
    @scala.inline
    def transformBox(value: TransformBoxProperty | js.Array[TransformBoxProperty]): this.type = set("transformBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transformOriginVarargs(value: TransformOriginProperty[TLength]*): this.type = set("transformOrigin", js.Array(value :_*))
    
    @scala.inline
    def transformOrigin(value: TransformOriginProperty[TLength] | js.Array[TransformOriginProperty[TLength]]): this.type = set("transformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transformStyleVarargs(value: TransformStyleProperty*): this.type = set("transformStyle", js.Array(value :_*))
    
    @scala.inline
    def transformStyle(value: TransformStyleProperty | js.Array[TransformStyleProperty]): this.type = set("transformStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionVarargs(value: TransitionProperty*): this.type = set("transition", js.Array(value :_*))
    
    @scala.inline
    def transition(value: TransitionProperty | js.Array[TransitionProperty]): this.type = set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionDelayVarargs(value: GlobalsString*): this.type = set("transitionDelay", js.Array(value :_*))
    
    @scala.inline
    def transitionDelay(value: GlobalsString | js.Array[GlobalsString]): this.type = set("transitionDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionDurationVarargs(value: GlobalsString*): this.type = set("transitionDuration", js.Array(value :_*))
    
    @scala.inline
    def transitionDuration(value: GlobalsString | js.Array[GlobalsString]): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionPropertyVarargs(value: TransitionPropertyProperty*): this.type = set("transitionProperty", js.Array(value :_*))
    
    @scala.inline
    def transitionProperty(value: TransitionPropertyProperty | js.Array[TransitionPropertyProperty]): this.type = set("transitionProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionTimingFunctionVarargs(value: TransitionTimingFunctionProperty*): this.type = set("transitionTimingFunction", js.Array(value :_*))
    
    @scala.inline
    def transitionTimingFunction(value: TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]): this.type = set("transitionTimingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def translateVarargs(value: TranslateProperty[TLength]*): this.type = set("translate", js.Array(value :_*))
    
    @scala.inline
    def translate(value: TranslateProperty[TLength] | js.Array[TranslateProperty[TLength]]): this.type = set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unicodeBidiVarargs(value: UnicodeBidiProperty*): this.type = set("unicodeBidi", js.Array(value :_*))
    
    @scala.inline
    def unicodeBidi(value: UnicodeBidiProperty | js.Array[UnicodeBidiProperty]): this.type = set("unicodeBidi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def userSelectVarargs(value: UserSelectProperty*): this.type = set("userSelect", js.Array(value :_*))
    
    @scala.inline
    def userSelect(value: UserSelectProperty | js.Array[UserSelectProperty]): this.type = set("userSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vectorEffectVarargs(value: VectorEffectProperty*): this.type = set("vectorEffect", js.Array(value :_*))
    
    @scala.inline
    def vectorEffect(value: VectorEffectProperty | js.Array[VectorEffectProperty]): this.type = set("vectorEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def verticalAlignVarargs(value: VerticalAlignProperty[TLength]*): this.type = set("verticalAlign", js.Array(value :_*))
    
    @scala.inline
    def verticalAlign(value: VerticalAlignProperty[TLength] | js.Array[VerticalAlignProperty[TLength]]): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visibilityVarargs(value: VisibilityProperty*): this.type = set("visibility", js.Array(value :_*))
    
    @scala.inline
    def visibility(value: VisibilityProperty | js.Array[VisibilityProperty]): this.type = set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def whiteSpaceVarargs(value: WhiteSpaceProperty*): this.type = set("whiteSpace", js.Array(value :_*))
    
    @scala.inline
    def whiteSpace(value: WhiteSpaceProperty | js.Array[WhiteSpaceProperty]): this.type = set("whiteSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def widowsVarargs(value: GlobalsNumber*): this.type = set("widows", js.Array(value :_*))
    
    @scala.inline
    def widows(value: GlobalsNumber | js.Array[GlobalsNumber]): this.type = set("widows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def widthVarargs(value: WidthProperty[TLength]*): this.type = set("width", js.Array(value :_*))
    
    @scala.inline
    def width(value: WidthProperty[TLength] | js.Array[WidthProperty[TLength]]): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def willChangeVarargs(value: WillChangeProperty*): this.type = set("willChange", js.Array(value :_*))
    
    @scala.inline
    def willChange(value: WillChangeProperty | js.Array[WillChangeProperty]): this.type = set("willChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wordBreakVarargs(value: WordBreakProperty*): this.type = set("wordBreak", js.Array(value :_*))
    
    @scala.inline
    def wordBreak(value: WordBreakProperty | js.Array[WordBreakProperty]): this.type = set("wordBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wordSpacingVarargs(value: WordSpacingProperty[TLength]*): this.type = set("wordSpacing", js.Array(value :_*))
    
    @scala.inline
    def wordSpacing(value: WordSpacingProperty[TLength] | js.Array[WordSpacingProperty[TLength]]): this.type = set("wordSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wordWrapVarargs(value: WordWrapProperty*): this.type = set("wordWrap", js.Array(value :_*))
    
    @scala.inline
    def wordWrap(value: WordWrapProperty | js.Array[WordWrapProperty]): this.type = set("wordWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def writingModeVarargs(value: WritingModeProperty*): this.type = set("writingMode", js.Array(value :_*))
    
    @scala.inline
    def writingMode(value: WritingModeProperty | js.Array[WritingModeProperty]): this.type = set("writingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zIndexVarargs(value: ZIndexProperty*): this.type = set("zIndex", js.Array(value :_*))
    
    @scala.inline
    def zIndex(value: ZIndexProperty | js.Array[ZIndexProperty]): this.type = set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zoomVarargs(value: ZoomProperty*): this.type = set("zoom", js.Array(value :_*))
    
    @scala.inline
    def zoom(value: ZoomProperty | js.Array[ZoomProperty]): this.type = set("zoom", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IReactProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: React.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
