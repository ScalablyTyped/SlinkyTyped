package typingsSlinky.dygraphs.dygraphs

import typingsSlinky.googleVisualization.google.visualization.DataTable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.dygraphs.dygraphs.DataArray
  - typingsSlinky.googleVisualization.google.visualization.DataTable
*/
trait Data extends js.Object

object Data {
  @scala.inline
  implicit def apply(value: DataArray): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: DataTable): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: String): Data = value.asInstanceOf[Data]
}

