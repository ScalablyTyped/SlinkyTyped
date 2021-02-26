package typingsSlinky.antvG2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2", "ScaleLinear")
@js.native
class ScaleLinear () extends Scale[Double] {
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var nice: js.UndefOr[Boolean] = js.native
  
  /**
    * 用于指定坐标轴各个标度点的间距，是原始数据之间的间距差值，tickCount 和 tickInterval 不可以同时声明。
    */
  var tickInterval: js.UndefOr[Double] = js.native
}
