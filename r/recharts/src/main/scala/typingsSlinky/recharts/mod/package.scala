package typingsSlinky.recharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AreaChartProps = typingsSlinky.recharts.mod.CategoricalChartWrapper[typingsSlinky.recharts.mod.LayoutType] with typingsSlinky.recharts.mod.EventAttributes
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - typingsSlinky.recharts.mod.ContentRenderer[js.Any]
    - typingsSlinky.recharts.rechartsStrings.auto
    - typingsSlinky.recharts.rechartsStrings.dataMin
    - typingsSlinky.recharts.rechartsStrings.dataMax
  */
  type AxisDomain = typingsSlinky.recharts.mod._AxisDomain | typingsSlinky.recharts.mod.ContentRenderer[js.Any] | java.lang.String | scala.Double
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typingsSlinky.recharts.rechartsStrings.preserveStart
    - typingsSlinky.recharts.rechartsStrings.preserveEnd
    - typingsSlinky.recharts.rechartsStrings.preserveStartEnd
  */
  type AxisInterval = typingsSlinky.recharts.mod._AxisInterval | scala.Double
  type BBoxUpdateCallback = js.Function1[/* box */ typingsSlinky.recharts.AnonWidth, scala.Unit]
  type BarChartProps = typingsSlinky.recharts.mod.CategoricalChartWrapper[typingsSlinky.recharts.mod.LayoutType] with typingsSlinky.recharts.mod.EventAttributes
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typingsSlinky.recharts.rechartsStrings.auto
    - typingsSlinky.recharts.rechartsStrings.dataMin
    - typingsSlinky.recharts.rechartsStrings.dataMax
  */
  type BaseValueType = typingsSlinky.recharts.mod._BaseValueType | scala.Double
  type ComposedChartProps = typingsSlinky.recharts.mod.CategoricalChartWrapper[typingsSlinky.recharts.mod.LayoutType] with typingsSlinky.recharts.mod.EventAttributes
  type ContentRenderer[P] = js.Function1[/* props */ P, slinky.core.TagMod[scala.Any]]
  type CoordinatesGenerator = js.Function1[/* arg */ typingsSlinky.recharts.AnonHeight, js.Array[scala.Double]]
  type DataKey = java.lang.String | scala.Double | (js.Function1[
    /* dataObject */ js.Any, 
    java.lang.String | scala.Double | (js.Tuple2[scala.Double, scala.Double]) | scala.Null
  ])
  type DataPointFormatter = js.Function2[
    /* entry */ js.Any, 
    /* dataKey */ typingsSlinky.recharts.mod.DataKey, 
    typingsSlinky.recharts.AnonErrorVal
  ]
  type ItemSorter[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
  type LabelFormatter = js.Function1[/* label */ java.lang.String | scala.Double, slinky.core.TagMod[scala.Any]]
  type LabelListProps = typingsSlinky.recharts.AnonAngle with (typingsSlinky.recharts.AnonDataKey | typingsSlinky.recharts.AnonValueAccessor)
  type LegendValueFormatter = js.Function3[
    /* value */ js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: recharts.recharts.LegendPayload['value'] */ js.Any
    ], 
    /* entry */ js.UndefOr[typingsSlinky.recharts.mod.LegendPayload], 
    /* i */ js.UndefOr[scala.Double], 
    js.Any
  ]
  type LineChartProps = typingsSlinky.recharts.mod.CategoricalChartWrapper[typingsSlinky.recharts.mod.LayoutType] with typingsSlinky.recharts.mod.EventAttributes
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.recharts.rechartsStrings.basis
    - typingsSlinky.recharts.rechartsStrings.basisClosed
    - typingsSlinky.recharts.rechartsStrings.basisOpen
    - typingsSlinky.recharts.rechartsStrings.linear
    - typingsSlinky.recharts.rechartsStrings.linearClosed
    - typingsSlinky.recharts.rechartsStrings.natural
    - typingsSlinky.recharts.rechartsStrings.monotoneX
    - typingsSlinky.recharts.rechartsStrings.monotoneY
    - typingsSlinky.recharts.rechartsStrings.monotone
    - typingsSlinky.recharts.rechartsStrings.step
    - typingsSlinky.recharts.rechartsStrings.stepBefore
    - typingsSlinky.recharts.rechartsStrings.stepAfter
    - typingsSlinky.d3Shape.mod.CurveFactory
  */
  type LineType = typingsSlinky.recharts.mod._LineType | typingsSlinky.d3Shape.mod.CurveFactory
  type Percentage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typingsSlinky.recharts.rechartsStrings.auto
    - typingsSlinky.recharts.rechartsStrings.dataMin
    - typingsSlinky.recharts.rechartsStrings.dataMax
  */
  type PolarRadiusAxisDomain = typingsSlinky.recharts.mod._PolarRadiusAxisDomain | scala.Double
  type RechartsFunction = js.Function1[/* repeated */ js.Any, scala.Unit]
  type ScaleCalculator = js.Function1[/* x */ scala.Double | java.lang.String, scala.Double]
  type ScatterChartProps = typingsSlinky.recharts.mod.CategoricalChartWrapper[typingsSlinky.recharts.mod.LayoutType] with typingsSlinky.recharts.mod.EventAttributes
  type TickFormatterFunction = js.Function1[/* value */ js.Any, js.Any]
  type TickGeneratorFunction = js.Function1[/* noTicksProps */ js.Object, js.Array[js.Any]]
  type TooltipFormatter = js.Function4[
    /* value */ java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double]), 
    /* name */ java.lang.String, 
    /* entry */ typingsSlinky.recharts.mod.TooltipPayload, 
    /* index */ scala.Double, 
    slinky.core.TagMod[scala.Any]
  ]
}
