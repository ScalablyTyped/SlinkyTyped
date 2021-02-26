package typingsSlinky.nvd3.mod

import typingsSlinky.d3Selection.mod.BaseType
import typingsSlinky.d3Selection.mod.Selection_
import typingsSlinky.d3Transition.mod.Transition_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParallelCoordinatesChart extends Chart {
  
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(func: js.Function2[/* d */ js.Any, /* i */ Double, String]): this.type = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(value: js.Array[String]): this.type = js.native
  
  /*No longer used.Use chart.dispatch.changeState(...) instead*/
  def defaultState(): js.Any = js.native
  /*No longer used.Use chart.dispatch.changeState(...) instead*/
  def defaultState(value: js.Any): this.type = js.native
  
  def dimensionData(): js.Any = js.native
  def dimensionData(d: js.Any): this.type = js.native
  
  /*D3 format for each x axis*/
  def dimensionFormats(): js.Array[String] = js.native
  /*D3 format for each x axis*/
  def dimensionFormats(value: js.Array[String]): this.type = js.native
  
  /*Name of each dimension, used for each axis.*/
  def dimensionNames(): js.Array[String] = js.native
  /*Name of each dimension, used for each axis.*/
  def dimensionNames(value: js.Array[String]): this.type = js.native
  
  /*Deprecated. Use dimensionsNames instead. */
  def dimensions(): js.Any = js.native
  /*Deprecated. Use dimensionsNames instead. .*/
  def dimensions(value: js.Any): this.type = js.native
  
  /**/
  def displayBrush(): Boolean = js.native
  /**/
  def displayBrush(value: Boolean): this.type = js.native
  
  /*The height the graph or component created inside the SVG should be made*/
  def height(): Double = js.native
  /*The height the graph or component created inside the SVG should be made.*/
  def height(value: Double): this.type = js.native
  
  def legend(
    selection: Selection_[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def legend(
    transition: Transition_[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  @JSName("legend")
  var legend_Original: Legend = js.native
  
  /*Specifies each line tension. Values between 0 and 1.*/
  def lineTension(): Double = js.native
  /*Specifies each line tension. Values between 0 and 1.*/
  def lineTension(value: Double): this.type = js.native
  
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(): Margin = js.native
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(value: Margin): this.type = js.native
  
  /**/
  def noData(): String = js.native
  /**/
  def noData(value: String): this.type = js.native
  
  def parallelCoordinates(
    selection: Selection_[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def parallelCoordinates(
    transition: Transition_[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  @JSName("parallelCoordinates")
  var parallelCoordinates_Original: ParallelCoordinates = js.native
  
  /**/
  def showLegend(): Boolean = js.native
  /**/
  def showLegend(value: Boolean): this.type = js.native
  
  var tooltip: Tooltip = js.native
  
  /* The width the graph or component created inside the SVG should be made*/
  def width(): Double = js.native
  /*The width the graph or component created inside the SVG should be made.*/
  def width(value: Double): this.type = js.native
}
