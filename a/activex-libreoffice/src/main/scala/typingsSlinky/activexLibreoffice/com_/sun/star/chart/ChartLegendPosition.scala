package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies one of the default positions of the legend in relation to the diagram. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
*/
trait ChartLegendPosition extends StObject
object ChartLegendPosition {
  
  /**
    * displays the chart legend beneath the diagram. <p>The second entry in the legend is placed on the right hand
    *
    * side of the first one.</p>
    */
  @scala.inline
  def BOTTOM: `4` = 4.asInstanceOf[`4`]
  
  /**
    * displays the chart legend on the left side of the diagram. <p>The second entry in the legend is placed below the first
    *
    * one.</p>
    */
  @scala.inline
  def LEFT: `1` = 1.asInstanceOf[`1`]
  
  /**
    * error indicators are not displayed.
    *
    * displays no error indicators.
    *
    * no chart legend is displayed. <p>To disable the legend you should set the property
    *
    * ChartDocument::HasLegend to `FALSE` instead
    *
    * of setting this value.</p>
    *
    *
    *
    * displays no regression curve.
    */
  @scala.inline
  def NONE: `0` = 0.asInstanceOf[`0`]
  
  /**
    * displays the chart legend on the right side of the diagram. <p>The second entry in the legend is placed below the first
    *
    * one.</p>
    */
  @scala.inline
  def RIGHT: `3` = 3.asInstanceOf[`3`]
  
  /**
    * displays the chart legend above the diagram. <p>The second entry in the legend is placed on the right hand
    *
    * side of the first one.</p>
    */
  @scala.inline
  def TOP: `2` = 2.asInstanceOf[`2`]
}
