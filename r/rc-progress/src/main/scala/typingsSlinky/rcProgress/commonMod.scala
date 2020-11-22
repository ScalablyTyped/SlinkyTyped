package typingsSlinky.rcProgress

import typingsSlinky.rcProgress.interfaceMod.GapPositionType
import typingsSlinky.rcProgress.interfaceMod.StrokeColorType
import typingsSlinky.rcProgress.interfaceMod.StrokeLinecapType
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-progress/es/common", JSImport.Namespace)
@js.native
object commonMod extends js.Object {
  
  def useTransitionDuration(percentList: js.Array[Double]): js.Array[js.Array[MutableRefObject[js.UndefOr[scala.Nothing]]]] = js.native
  
  @js.native
  object defaultProps extends js.Object {
    
    var className: js.UndefOr[String] = js.native
    
    var gapDegree: js.UndefOr[Double] = js.native
    
    var gapPosition: js.UndefOr[GapPositionType] = js.native
    
    var percent: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var strokeColor: js.UndefOr[StrokeColorType] = js.native
    
    var strokeLinecap: js.UndefOr[StrokeLinecapType] = js.native
    
    var strokeWidth: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var trailColor: js.UndefOr[String] = js.native
    
    var trailWidth: js.UndefOr[Double] = js.native
    
    var transition: js.UndefOr[String] = js.native
  }
}
