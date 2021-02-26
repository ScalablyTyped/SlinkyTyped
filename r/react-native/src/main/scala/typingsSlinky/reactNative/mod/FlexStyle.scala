package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.`column-reverse`
import typingsSlinky.reactNative.reactNativeStrings.`flex-end`
import typingsSlinky.reactNative.reactNativeStrings.`flex-start`
import typingsSlinky.reactNative.reactNativeStrings.`row-reverse`
import typingsSlinky.reactNative.reactNativeStrings.`space-around`
import typingsSlinky.reactNative.reactNativeStrings.`space-between`
import typingsSlinky.reactNative.reactNativeStrings.`space-evenly`
import typingsSlinky.reactNative.reactNativeStrings.`wrap-reverse`
import typingsSlinky.reactNative.reactNativeStrings.absolute
import typingsSlinky.reactNative.reactNativeStrings.auto
import typingsSlinky.reactNative.reactNativeStrings.center
import typingsSlinky.reactNative.reactNativeStrings.column
import typingsSlinky.reactNative.reactNativeStrings.flex
import typingsSlinky.reactNative.reactNativeStrings.hidden
import typingsSlinky.reactNative.reactNativeStrings.inherit
import typingsSlinky.reactNative.reactNativeStrings.ltr
import typingsSlinky.reactNative.reactNativeStrings.none
import typingsSlinky.reactNative.reactNativeStrings.nowrap
import typingsSlinky.reactNative.reactNativeStrings.relative
import typingsSlinky.reactNative.reactNativeStrings.row
import typingsSlinky.reactNative.reactNativeStrings.rtl
import typingsSlinky.reactNative.reactNativeStrings.scroll
import typingsSlinky.reactNative.reactNativeStrings.stretch
import typingsSlinky.reactNative.reactNativeStrings.visible
import typingsSlinky.reactNative.reactNativeStrings.wrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexStyle extends StObject {
  
  var alignContent: js.UndefOr[`flex-start` | `flex-end` | center | stretch | `space-between` | `space-around`] = js.native
  
  var alignItems: js.UndefOr[FlexAlignType] = js.native
  
  var alignSelf: js.UndefOr[auto | FlexAlignType] = js.native
  
  var aspectRatio: js.UndefOr[Double] = js.native
  
  var borderBottomWidth: js.UndefOr[Double] = js.native
  
  var borderEndWidth: js.UndefOr[Double | String] = js.native
  
  var borderLeftWidth: js.UndefOr[Double] = js.native
  
  var borderRightWidth: js.UndefOr[Double] = js.native
  
  var borderStartWidth: js.UndefOr[Double | String] = js.native
  
  var borderTopWidth: js.UndefOr[Double] = js.native
  
  var borderWidth: js.UndefOr[Double] = js.native
  
  var bottom: js.UndefOr[Double | String] = js.native
  
  /**
    * @platform ios
    */
  var direction: js.UndefOr[inherit | ltr | rtl] = js.native
  
  var display: js.UndefOr[none | flex] = js.native
  
  var end: js.UndefOr[Double | String] = js.native
  
  var flex: js.UndefOr[Double] = js.native
  
  var flexBasis: js.UndefOr[Double | String] = js.native
  
  var flexDirection: js.UndefOr[row | column | `row-reverse` | `column-reverse`] = js.native
  
  var flexGrow: js.UndefOr[Double] = js.native
  
  var flexShrink: js.UndefOr[Double] = js.native
  
  var flexWrap: js.UndefOr[wrap | nowrap | `wrap-reverse`] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var justifyContent: js.UndefOr[
    `flex-start` | `flex-end` | center | `space-between` | `space-around` | `space-evenly`
  ] = js.native
  
  var left: js.UndefOr[Double | String] = js.native
  
  var margin: js.UndefOr[Double | String] = js.native
  
  var marginBottom: js.UndefOr[Double | String] = js.native
  
  var marginEnd: js.UndefOr[Double | String] = js.native
  
  var marginHorizontal: js.UndefOr[Double | String] = js.native
  
  var marginLeft: js.UndefOr[Double | String] = js.native
  
  var marginRight: js.UndefOr[Double | String] = js.native
  
  var marginStart: js.UndefOr[Double | String] = js.native
  
  var marginTop: js.UndefOr[Double | String] = js.native
  
  var marginVertical: js.UndefOr[Double | String] = js.native
  
  var maxHeight: js.UndefOr[Double | String] = js.native
  
  var maxWidth: js.UndefOr[Double | String] = js.native
  
  var minHeight: js.UndefOr[Double | String] = js.native
  
  var minWidth: js.UndefOr[Double | String] = js.native
  
  var overflow: js.UndefOr[visible | hidden | scroll] = js.native
  
  var padding: js.UndefOr[Double | String] = js.native
  
  var paddingBottom: js.UndefOr[Double | String] = js.native
  
  var paddingEnd: js.UndefOr[Double | String] = js.native
  
  var paddingHorizontal: js.UndefOr[Double | String] = js.native
  
  var paddingLeft: js.UndefOr[Double | String] = js.native
  
  var paddingRight: js.UndefOr[Double | String] = js.native
  
  var paddingStart: js.UndefOr[Double | String] = js.native
  
  var paddingTop: js.UndefOr[Double | String] = js.native
  
  var paddingVertical: js.UndefOr[Double | String] = js.native
  
  var position: js.UndefOr[absolute | relative] = js.native
  
  var right: js.UndefOr[Double | String] = js.native
  
  var start: js.UndefOr[Double | String] = js.native
  
  var top: js.UndefOr[Double | String] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object FlexStyle {
  
  @scala.inline
  def apply(): FlexStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexStyle]
  }
  
  @scala.inline
  implicit class FlexStyleMutableBuilder[Self <: FlexStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignContent(value: `flex-start` | `flex-end` | center | stretch | `space-between` | `space-around`): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
    
    @scala.inline
    def setAlignItems(value: FlexAlignType): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
    
    @scala.inline
    def setAlignSelf(value: auto | FlexAlignType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
    
    @scala.inline
    def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    @scala.inline
    def setBorderBottomWidth(value: Double): Self = StObject.set(x, "borderBottomWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomWidthUndefined: Self = StObject.set(x, "borderBottomWidth", js.undefined)
    
    @scala.inline
    def setBorderEndWidth(value: Double | String): Self = StObject.set(x, "borderEndWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderEndWidthUndefined: Self = StObject.set(x, "borderEndWidth", js.undefined)
    
    @scala.inline
    def setBorderLeftWidth(value: Double): Self = StObject.set(x, "borderLeftWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderLeftWidthUndefined: Self = StObject.set(x, "borderLeftWidth", js.undefined)
    
    @scala.inline
    def setBorderRightWidth(value: Double): Self = StObject.set(x, "borderRightWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRightWidthUndefined: Self = StObject.set(x, "borderRightWidth", js.undefined)
    
    @scala.inline
    def setBorderStartWidth(value: Double | String): Self = StObject.set(x, "borderStartWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStartWidthUndefined: Self = StObject.set(x, "borderStartWidth", js.undefined)
    
    @scala.inline
    def setBorderTopWidth(value: Double): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopWidthUndefined: Self = StObject.set(x, "borderTopWidth", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setBottom(value: Double | String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setDirection(value: inherit | ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDisplay(value: none | flex): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setEnd(value: Double | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexBasis(value: Double | String): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
    
    @scala.inline
    def setFlexDirection(value: row | column | `row-reverse` | `column-reverse`): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
    
    @scala.inline
    def setFlexGrow(value: Double): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
    
    @scala.inline
    def setFlexShrink(value: Double): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
    
    @scala.inline
    def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
    
    @scala.inline
    def setFlexWrap(value: wrap | nowrap | `wrap-reverse`): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setJustifyContent(value: `flex-start` | `flex-end` | center | `space-between` | `space-around` | `space-evenly`): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
    
    @scala.inline
    def setLeft(value: Double | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setMargin(value: Double | String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottom(value: Double | String): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    @scala.inline
    def setMarginEnd(value: Double | String): Self = StObject.set(x, "marginEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginEndUndefined: Self = StObject.set(x, "marginEnd", js.undefined)
    
    @scala.inline
    def setMarginHorizontal(value: Double | String): Self = StObject.set(x, "marginHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginHorizontalUndefined: Self = StObject.set(x, "marginHorizontal", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: Double | String): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    @scala.inline
    def setMarginRight(value: Double | String): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    @scala.inline
    def setMarginStart(value: Double | String): Self = StObject.set(x, "marginStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginStartUndefined: Self = StObject.set(x, "marginStart", js.undefined)
    
    @scala.inline
    def setMarginTop(value: Double | String): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMarginVertical(value: Double | String): Self = StObject.set(x, "marginVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginVerticalUndefined: Self = StObject.set(x, "marginVertical", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double | String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setOverflow(value: visible | hidden | scroll): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingBottom(value: Double | String): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
    
    @scala.inline
    def setPaddingEnd(value: Double | String): Self = StObject.set(x, "paddingEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingEndUndefined: Self = StObject.set(x, "paddingEnd", js.undefined)
    
    @scala.inline
    def setPaddingHorizontal(value: Double | String): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingHorizontalUndefined: Self = StObject.set(x, "paddingHorizontal", js.undefined)
    
    @scala.inline
    def setPaddingLeft(value: Double | String): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
    
    @scala.inline
    def setPaddingRight(value: Double | String): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    @scala.inline
    def setPaddingStart(value: Double | String): Self = StObject.set(x, "paddingStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingStartUndefined: Self = StObject.set(x, "paddingStart", js.undefined)
    
    @scala.inline
    def setPaddingTop(value: Double | String): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPaddingVertical(value: Double | String): Self = StObject.set(x, "paddingVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingVerticalUndefined: Self = StObject.set(x, "paddingVertical", js.undefined)
    
    @scala.inline
    def setPosition(value: absolute | relative): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRight(value: Double | String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setStart(value: Double | String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setTop(value: Double | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
