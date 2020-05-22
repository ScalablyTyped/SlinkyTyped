package typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid

import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.column
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.columnEnd
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.row
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rowEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait HeaderContext[K, D] extends js.Object {
  var axis: column | columnEnd | row | rowEnd
  var componentElement: Element
  var data: D
  var datasource: (DataProvider[K, D]) | Null
  var depth: Double
  var extent: Double
  var index: Double
  var key: K
  var level: Double
  var parentElement: Element
}

object HeaderContext {
  @scala.inline
  def apply[K, D](
    axis: column | columnEnd | row | rowEnd,
    componentElement: Element,
    data: D,
    depth: Double,
    extent: Double,
    index: Double,
    key: K,
    level: Double,
    parentElement: Element,
    datasource: DataProvider[K, D] = null
  ): HeaderContext[K, D] = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], datasource = datasource.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderContext[K, D]]
  }
}

