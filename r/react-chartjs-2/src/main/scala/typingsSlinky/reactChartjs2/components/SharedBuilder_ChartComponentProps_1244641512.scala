package typingsSlinky.reactChartjs2.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.chartJs.mod.ChartLegendOptions
import typingsSlinky.chartJs.mod.ChartOptions
import typingsSlinky.chartJs.mod.ChartType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_ChartComponentProps_1244641512[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def datasetKeyProvider(value: /* any */ js.Any => _): this.type = set("datasetKeyProvider", js.Any.fromFunction1(value))
  
  @scala.inline
  def getDatasetAtEvent(value: /* e */ js.Any => Unit): this.type = set("getDatasetAtEvent", js.Any.fromFunction1(value))
  
  @scala.inline
  def getElementAtEvent(value: /* e */ js.Any => Unit): this.type = set("getElementAtEvent", js.Any.fromFunction1(value))
  
  @scala.inline
  def getElementsAtEvent(value: /* e */ js.Any => Unit): this.type = set("getElementsAtEvent", js.Any.fromFunction1(value))
  
  @scala.inline
  def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
  
  @scala.inline
  def legend(value: ChartLegendOptions): this.type = set("legend", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onElementsClick(value: /* e */ js.Any => Unit): this.type = set("onElementsClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def options(value: ChartOptions): this.type = set("options", value.asInstanceOf[js.Any])
  
  @scala.inline
  def plugins(value: js.Array[js.Object]): this.type = set("plugins", value.asInstanceOf[js.Any])
  
  @scala.inline
  def pluginsVarargs(value: js.Object*): this.type = set("plugins", js.Array(value :_*))
  
  @scala.inline
  def redraw(value: Boolean): this.type = set("redraw", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `type`(value: ChartType): this.type = set("type", value.asInstanceOf[js.Any])
  
  @scala.inline
  def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
}
