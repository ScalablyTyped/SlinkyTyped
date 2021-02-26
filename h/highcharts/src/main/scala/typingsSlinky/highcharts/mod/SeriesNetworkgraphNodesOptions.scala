package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesNetworkgraphNodesOptions extends StObject {
  
  /**
    * (Highcharts) The color of the auto generated node.
    */
  var color: js.UndefOr[ColorString] = js.native
  
  /**
    * (Highcharts) The color index of the auto generated node, especially for
    * use in styled mode.
    */
  var colorIndex: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) Individual data label for each node. The options are the
    * same as the ones for series.networkgraph.dataLabels.
    */
  var dataLabels: js.UndefOr[
    SeriesNetworkgraphDataLabelsOptionsObject | js.Array[SeriesNetworkgraphDataLabelsOptionsObject]
  ] = js.native
  
  /**
    * (Highcharts) The id of the auto-generated node, refering to the `from` or
    * `to` setting of the link.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) Mass of the node. By default, each node has mass equal to
    * it's marker radius . Mass is used to determine how two connected nodes
    * should affect each other:
    *
    * Attractive force is multiplied by the ratio of two connected nodes; if a
    * big node has weights twice as the small one, then the small one will move
    * towards the big one twice faster than the big one to the small one .
    */
  var mass: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The name to display for the node in data labels and
    * tooltips. Use this when the name is different from the `id`. Where the id
    * must be unique for each node, this is not necessary for the name.
    */
  var name: js.UndefOr[String] = js.native
}
object SeriesNetworkgraphNodesOptions {
  
  @scala.inline
  def apply(): SeriesNetworkgraphNodesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesNetworkgraphNodesOptions]
  }
  
  @scala.inline
  implicit class SeriesNetworkgraphNodesOptionsMutableBuilder[Self <: SeriesNetworkgraphNodesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorString): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIndex(value: Double): Self = StObject.set(x, "colorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIndexUndefined: Self = StObject.set(x, "colorIndex", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDataLabels(
      value: SeriesNetworkgraphDataLabelsOptionsObject | js.Array[SeriesNetworkgraphDataLabelsOptionsObject]
    ): Self = StObject.set(x, "dataLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLabelsUndefined: Self = StObject.set(x, "dataLabels", js.undefined)
    
    @scala.inline
    def setDataLabelsVarargs(value: SeriesNetworkgraphDataLabelsOptionsObject*): Self = StObject.set(x, "dataLabels", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
