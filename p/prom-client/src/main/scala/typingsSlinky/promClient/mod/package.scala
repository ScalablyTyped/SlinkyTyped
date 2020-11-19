package typingsSlinky.promClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Histogram = typingsSlinky.promClient.mod.Histogram_
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.promClient.mod.Counter
    - typingsSlinky.promClient.mod.Gauge
    - typingsSlinky.promClient.mod.Summary
    - typingsSlinky.promClient.mod.Histogram
  */
  type Metric_ = typingsSlinky.promClient.mod._Metric_ | typingsSlinky.promClient.mod.Summary | typingsSlinky.promClient.mod.Histogram
  
  type Pushgateway = typingsSlinky.promClient.mod.Pushgateway_
  
  type Summary = typingsSlinky.promClient.mod.Summary_
  
  type labelValues = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
}
