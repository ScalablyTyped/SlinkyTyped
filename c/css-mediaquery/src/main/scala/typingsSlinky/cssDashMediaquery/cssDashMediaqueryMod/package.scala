package typingsSlinky.cssDashMediaquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cssDashMediaqueryMod {
  import typingsSlinky.cssDashMediaquery.cssDashMediaqueryStrings.`aspect-ratio`
  import typingsSlinky.cssDashMediaquery.cssDashMediaqueryStrings.`color-index`
  import typingsSlinky.cssDashMediaquery.cssDashMediaqueryStrings.`device-aspect-ratio`
  import typingsSlinky.cssDashMediaquery.cssDashMediaqueryStrings.`device-height`
  import typingsSlinky.cssDashMediaquery.cssDashMediaqueryStrings.`device-width`
  import typingsSlinky.cssDashMediaquery.cssDashMediaqueryStrings.color
  import typingsSlinky.cssDashMediaquery.cssDashMediaqueryStrings.grid
  import typingsSlinky.cssDashMediaquery.cssDashMediaqueryStrings.height
  import typingsSlinky.cssDashMediaquery.cssDashMediaqueryStrings.monochrome
  import typingsSlinky.cssDashMediaquery.cssDashMediaqueryStrings.orientation
  import typingsSlinky.cssDashMediaquery.cssDashMediaqueryStrings.resolution
  import typingsSlinky.cssDashMediaquery.cssDashMediaqueryStrings.scan
  import typingsSlinky.cssDashMediaquery.cssDashMediaqueryStrings.width
  import typingsSlinky.std.Record

  type AST = js.Array[QueryNode]
  type MediaValues = Record[
    orientation | scan | width | height | `device-width` | `device-height` | resolution | `aspect-ratio` | `device-aspect-ratio` | grid | color | `color-index` | monochrome, 
    js.Any
  ]
}
