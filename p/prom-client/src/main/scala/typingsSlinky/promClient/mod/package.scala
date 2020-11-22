package typingsSlinky.promClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Histogram[T /* <: java.lang.String */] = typingsSlinky.promClient.mod.Histogram_[T]
  
  type LabelValues[T /* <: java.lang.String */] = typingsSlinky.std.Partial[typingsSlinky.std.Record[T, java.lang.String | scala.Double]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.promClient.mod.Counter[T]
    - typingsSlinky.promClient.mod.Gauge[T]
    - typingsSlinky.promClient.mod.Summary[T]
    - typingsSlinky.promClient.mod.Histogram[T]
  */
  type Metric_[T /* <: java.lang.String */] = typingsSlinky.promClient.mod._Metric_[T] | typingsSlinky.promClient.mod.Summary[T] | typingsSlinky.promClient.mod.Histogram[T]
  
  type Pushgateway = typingsSlinky.promClient.mod.Pushgateway_
  
  type Summary[T /* <: java.lang.String */] = typingsSlinky.promClient.mod.Summary_[T]
}
