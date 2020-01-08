package typingsSlinky.dygraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dygraphs {
  import typingsSlinky.googleDotVisualization.google.visualization.DataTable

  type Data = String | DataArray | DataTable
  type DataArray = js.Array[js.Array[Double | js.Date | Null]]
}
