package typingsSlinky.chartJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BorderWidth = scala.Double | typingsSlinky.chartJs.anon.keyinPositionTypenumber
  
  /* static member */
  @scala.inline
  def Chart: org.scalablytyped.runtime.Instantiable2[
    /* context */ java.lang.String | org.scalajs.dom.raw.CanvasRenderingContext2D | org.scalajs.dom.raw.HTMLCanvasElement | (typingsSlinky.std.ArrayLike[
      org.scalajs.dom.raw.CanvasRenderingContext2D | org.scalajs.dom.raw.HTMLCanvasElement
    ]), 
    /* options */ typingsSlinky.chartJs.mod.ChartConfiguration, 
    typingsSlinky.chartJs.mod.Chart
  ] = typingsSlinky.chartJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Chart").asInstanceOf[org.scalablytyped.runtime.Instantiable2[
    /* context */ java.lang.String | org.scalajs.dom.raw.CanvasRenderingContext2D | org.scalajs.dom.raw.HTMLCanvasElement | (typingsSlinky.std.ArrayLike[
      org.scalajs.dom.raw.CanvasRenderingContext2D | org.scalajs.dom.raw.HTMLCanvasElement
    ]), 
    /* options */ typingsSlinky.chartJs.mod.ChartConfiguration, 
    typingsSlinky.chartJs.mod.Chart
  ]]
  
  type ChartColor = java.lang.String | org.scalajs.dom.raw.CanvasGradient | org.scalajs.dom.raw.CanvasPattern | js.Array[java.lang.String]
  
  // NOTE: declare plugin options as interface instead of inline '{ [plugin: string]: any }'
  // to allow module augmentation in case some plugins want to strictly type their options.
  type ChartPluginsOptions = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ChartTooltipPositioner = js.Function2[
    /* elements */ js.Array[js.Any], 
    /* eventPosition */ typingsSlinky.chartJs.mod.Point, 
    typingsSlinky.chartJs.mod.Point
  ]
  
  // tslint:disable-next-line no-empty-interface
  type ChartYAxe = typingsSlinky.chartJs.mod.CommonAxe
  
  // tslint:disable-next-line no-empty-interface
  type LogarithmicTickOptions = typingsSlinky.chartJs.mod.TickOptions
  
  type Scriptable[T] = js.Function1[/* ctx */ typingsSlinky.chartJs.anon.Chart, T]
  
  // Tooltip Static Options
  /* static member */
  @scala.inline
  def Tooltip: typingsSlinky.chartJs.mod.ChartTooltipsStaticConfiguration = typingsSlinky.chartJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Tooltip").asInstanceOf[typingsSlinky.chartJs.mod.ChartTooltipsStaticConfiguration]
  @scala.inline
  def Tooltip_=(x: typingsSlinky.chartJs.mod.ChartTooltipsStaticConfiguration): scala.Unit = typingsSlinky.chartJs.mod.^.asInstanceOf[js.Dynamic].updateDynamic("Tooltip")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def pluginService: typingsSlinky.chartJs.mod.PluginServiceStatic = typingsSlinky.chartJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("pluginService").asInstanceOf[typingsSlinky.chartJs.mod.PluginServiceStatic]
  @scala.inline
  def pluginService_=(x: typingsSlinky.chartJs.mod.PluginServiceStatic): scala.Unit = typingsSlinky.chartJs.mod.^.asInstanceOf[js.Dynamic].updateDynamic("pluginService")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def plugins: typingsSlinky.chartJs.mod.PluginServiceStatic = typingsSlinky.chartJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("plugins").asInstanceOf[typingsSlinky.chartJs.mod.PluginServiceStatic]
  @scala.inline
  def plugins_=(x: typingsSlinky.chartJs.mod.PluginServiceStatic): scala.Unit = typingsSlinky.chartJs.mod.^.asInstanceOf[js.Dynamic].updateDynamic("plugins")(x.asInstanceOf[js.Any])
}
