package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive events when chart data changes. */
@js.native
trait XChartDataChangeEventListener extends XEventListener {
  
  /**
    * is called whenever chart data changes in value or structure.
    *
    * This interface must be implemented by components that wish to get notified of changes in chart data. They can be registered at an {@link XChartData}
    * component.
    * @param aEvent the event that gives further information on what changed.
    * @see ChartDataChangeEvent
    * @see XChartData
    */
  def chartDataChanged(aEvent: ChartDataChangeEvent): Unit = js.native
}
object XChartDataChangeEventListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    chartDataChanged: ChartDataChangeEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XChartDataChangeEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), chartDataChanged = js.Any.fromFunction1(chartDataChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XChartDataChangeEventListener]
  }
  
  @scala.inline
  implicit class XChartDataChangeEventListenerMutableBuilder[Self <: XChartDataChangeEventListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartDataChanged(value: ChartDataChangeEvent => Unit): Self = StObject.set(x, "chartDataChanged", js.Any.fromFunction1(value))
  }
}
