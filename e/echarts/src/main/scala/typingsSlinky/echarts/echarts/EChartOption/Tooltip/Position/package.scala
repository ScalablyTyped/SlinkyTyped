package typingsSlinky.echarts.echarts.EChartOption.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Position {
  
  type Fn = js.Function5[
    /* point */ js.Array[scala.Double | java.lang.String], 
    /* params */ js.Object | js.Array[js.Object], 
    /* element */ org.scalajs.dom.raw.HTMLElement, 
    /* rect */ js.Object, 
    /* size */ js.Object, 
    (js.Array[scala.Double | java.lang.String]) | typingsSlinky.echarts.echarts.EChartOption.Tooltip.Position.Obj
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.echarts.echarts.EChartOption.Tooltip.Position.Str
    - typingsSlinky.echarts.echarts.EChartOption.Tooltip.Position.Obj
    - js.Array[scala.Double | java.lang.String]
    - typingsSlinky.echarts.echarts.EChartOption.Tooltip.Position.Fn
  */
  type Type = typingsSlinky.echarts.echarts.EChartOption.Tooltip.Position._Type | (js.Array[scala.Double | java.lang.String]) | typingsSlinky.echarts.echarts.EChartOption.Tooltip.Position.Fn
}
