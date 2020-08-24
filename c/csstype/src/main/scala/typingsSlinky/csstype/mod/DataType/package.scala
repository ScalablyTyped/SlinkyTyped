package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DataType {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.csstype.csstypeStrings.contents
    - typingsSlinky.csstype.csstypeStrings.`scroll-position`
    - java.lang.String with js.Object
  */
  type AnimateableFeature = typingsSlinky.csstype.mod.DataType._AnimateableFeature | (java.lang.String with js.Object)
  /* Rewritten from type alias, can be one of: 
    - TLength
    - typingsSlinky.csstype.csstypeStrings.bottom
    - typingsSlinky.csstype.csstypeStrings.center
    - typingsSlinky.csstype.csstypeStrings.left
    - typingsSlinky.csstype.csstypeStrings.right
    - typingsSlinky.csstype.csstypeStrings.top
    - java.lang.String with js.Object
  */
  type BgPosition[TLength] = typingsSlinky.csstype.mod.DataType._BgPosition[TLength] | (java.lang.String with js.Object) | TLength
  /* Rewritten from type alias, can be one of: 
    - TLength
    - typingsSlinky.csstype.csstypeStrings.auto
    - typingsSlinky.csstype.csstypeStrings.contain
    - typingsSlinky.csstype.csstypeStrings.cover
    - java.lang.String with js.Object
  */
  type BgSize[TLength] = typingsSlinky.csstype.mod.DataType._BgSize[TLength] | (java.lang.String with js.Object) | TLength
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.csstype.mod.DataType.NamedColor
    - typingsSlinky.csstype.mod.DataType.DeprecatedSystemColor
    - typingsSlinky.csstype.csstypeStrings.currentcolor_
    - java.lang.String with js.Object
  */
  type Color = typingsSlinky.csstype.mod.DataType._Color | (java.lang.String with js.Object)
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.csstype.mod.DataType.Quote
    - typingsSlinky.csstype.csstypeStrings.contents
    - java.lang.String with js.Object
  */
  type ContentList = typingsSlinky.csstype.mod.DataType._ContentList | (java.lang.String with js.Object)
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.csstype.csstypeStrings.ease
    - typingsSlinky.csstype.csstypeStrings.`ease-in`
    - typingsSlinky.csstype.csstypeStrings.`ease-in-out`
    - typingsSlinky.csstype.csstypeStrings.`ease-out`
    - java.lang.String with js.Object
  */
  type CubicBezierTimingFunction = typingsSlinky.csstype.mod.DataType._CubicBezierTimingFunction | (java.lang.String with js.Object)
  type Dasharray[TLength] = TLength | (java.lang.String with js.Object) | (scala.Double with js.Object)
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.csstype.mod.DataType.Color
    - typingsSlinky.csstype.mod.DataType.BgPosition[TLength]
    - typingsSlinky.csstype.mod.DataType.RepeatStyle
    - typingsSlinky.csstype.mod.DataType.Attachment
    - typingsSlinky.csstype.mod.DataType.Box
    - typingsSlinky.csstype.csstypeStrings.none
    - java.lang.String with js.Object
  */
  type FinalBgLayer[TLength] = typingsSlinky.csstype.mod.DataType._FinalBgLayer[TLength] | (java.lang.String with js.Object) | TLength
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.csstype.csstypeStrings.condensed
    - typingsSlinky.csstype.csstypeStrings.expanded
    - typingsSlinky.csstype.csstypeStrings.`extra-condensed`
    - typingsSlinky.csstype.csstypeStrings.`extra-expanded`
    - typingsSlinky.csstype.csstypeStrings.normal
    - typingsSlinky.csstype.csstypeStrings.`semi-condensed`
    - typingsSlinky.csstype.csstypeStrings.`semi-expanded`
    - typingsSlinky.csstype.csstypeStrings.`ultra-condensed`
    - typingsSlinky.csstype.csstypeStrings.`ultra-expanded`
    - java.lang.String with js.Object
  */
  type FontStretchAbsolute = typingsSlinky.csstype.mod.DataType._FontStretchAbsolute | (java.lang.String with js.Object)
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.csstype.csstypeStrings.bold
    - typingsSlinky.csstype.csstypeStrings.normal
    - scala.Double with js.Object
  */
  type FontWeightAbsolute = typingsSlinky.csstype.mod.DataType._FontWeightAbsolute | (scala.Double with js.Object)
  type GridLine = typingsSlinky.csstype.csstypeStrings.auto | (java.lang.String with js.Object) | (scala.Double with js.Object)
  /* Rewritten from type alias, can be one of: 
    - TLength
    - typingsSlinky.csstype.csstypeStrings.medium
    - typingsSlinky.csstype.csstypeStrings.thick
    - typingsSlinky.csstype.csstypeStrings.thin
  */
  type LineWidth[TLength] = typingsSlinky.csstype.mod.DataType._LineWidth[TLength] | TLength
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.csstype.mod.DataType.Position[TLength]
    - typingsSlinky.csstype.mod.DataType.RepeatStyle
    - typingsSlinky.csstype.mod.DataType.GeometryBox
    - typingsSlinky.csstype.mod.DataType.CompositingOperator
    - typingsSlinky.csstype.mod.DataType.MaskingMode
    - typingsSlinky.csstype.csstypeStrings.`no-clip`
    - typingsSlinky.csstype.csstypeStrings.none
    - java.lang.String with js.Object
  */
  type MaskLayer[TLength] = typingsSlinky.csstype.mod.DataType._MaskLayer[TLength] | (java.lang.String with js.Object) | TLength
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.csstype.mod.DataType.Color
    - typingsSlinky.csstype.csstypeStrings.child
    - typingsSlinky.csstype.csstypeStrings.`context-fill`
    - typingsSlinky.csstype.csstypeStrings.`context-stroke`
    - typingsSlinky.csstype.csstypeStrings.none
    - java.lang.String with js.Object
  */
  type Paint = typingsSlinky.csstype.mod.DataType._Paint | (java.lang.String with js.Object)
  /* Rewritten from type alias, can be one of: 
    - TLength
    - typingsSlinky.csstype.csstypeStrings.bottom
    - typingsSlinky.csstype.csstypeStrings.center
    - typingsSlinky.csstype.csstypeStrings.left
    - typingsSlinky.csstype.csstypeStrings.right
    - typingsSlinky.csstype.csstypeStrings.top
    - java.lang.String with js.Object
  */
  type Position[TLength] = typingsSlinky.csstype.mod.DataType._Position[TLength] | (java.lang.String with js.Object) | TLength
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.csstype.csstypeStrings.`no-repeat`
    - typingsSlinky.csstype.csstypeStrings.repeat
    - typingsSlinky.csstype.csstypeStrings.`repeat-x`
    - typingsSlinky.csstype.csstypeStrings.`repeat-y`
    - typingsSlinky.csstype.csstypeStrings.round
    - typingsSlinky.csstype.csstypeStrings.space
    - java.lang.String with js.Object
  */
  type RepeatStyle = typingsSlinky.csstype.mod.DataType._RepeatStyle | (java.lang.String with js.Object)
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.csstype.mod.DataType.TimingFunction
    - typingsSlinky.csstype.mod.DataType.SingleAnimationDirection
    - typingsSlinky.csstype.mod.DataType.SingleAnimationFillMode
    - TTime
    - typingsSlinky.csstype.csstypeStrings.infinite
    - typingsSlinky.csstype.csstypeStrings.none
    - typingsSlinky.csstype.csstypeStrings.paused
    - typingsSlinky.csstype.csstypeStrings.running
    - java.lang.String with js.Object
    - scala.Double with js.Object
  */
  type SingleAnimation[TTime] = typingsSlinky.csstype.mod.DataType._SingleAnimation[TTime] | (java.lang.String with js.Object) | (scala.Double with js.Object) | TTime
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.csstype.mod.DataType.TimingFunction
    - TTime
    - typingsSlinky.csstype.csstypeStrings.all
    - typingsSlinky.csstype.csstypeStrings.none
    - java.lang.String with js.Object
  */
  type SingleTransition[TTime] = typingsSlinky.csstype.mod.DataType._SingleTransition[TTime] | (java.lang.String with js.Object) | TTime
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.csstype.csstypeStrings.`step-end`
    - typingsSlinky.csstype.csstypeStrings.`step-start`
    - java.lang.String with js.Object
  */
  type StepTimingFunction = typingsSlinky.csstype.mod.DataType._StepTimingFunction | (java.lang.String with js.Object)
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.csstype.mod.DataType.CubicBezierTimingFunction
    - typingsSlinky.csstype.mod.DataType.StepTimingFunction
    - typingsSlinky.csstype.csstypeStrings.linear
  */
  type TimingFunction = typingsSlinky.csstype.mod.DataType._TimingFunction | (java.lang.String with js.Object)
  /* Rewritten from type alias, can be one of: 
    - TLength
    - typingsSlinky.csstype.csstypeStrings.auto
    - typingsSlinky.csstype.csstypeStrings.`max-content`
    - typingsSlinky.csstype.csstypeStrings.`min-content`
    - java.lang.String with js.Object
  */
  type TrackBreadth[TLength] = typingsSlinky.csstype.mod.DataType._TrackBreadth[TLength] | (java.lang.String with js.Object) | TLength
  type ViewportLength[TLength] = TLength | typingsSlinky.csstype.csstypeStrings.auto | (java.lang.String with js.Object)
}
