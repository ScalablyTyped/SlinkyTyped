package typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid

import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.AnonColumnK
import typingsSlinky.oracleOraclejet.AnonColumnRow
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.edit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.navigation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait CellContext[K, D] extends js.Object {
  var cell: D = js.native
  var componentElement: Element = js.native
  var data: D = js.native
  var datasource: (DataProvider[K, D]) | Null = js.native
  var extents: AnonColumnRow = js.native
  var indexes: AnonColumnRow = js.native
  var keys: AnonColumnK[K] = js.native
  var mode: edit | navigation = js.native
  var parentElement: Element = js.native
}

object CellContext {
  @scala.inline
  def apply[K, D](
    cell: D,
    componentElement: Element,
    data: D,
    extents: AnonColumnRow,
    indexes: AnonColumnRow,
    keys: AnonColumnK[K],
    mode: edit | navigation,
    parentElement: Element
  ): CellContext[K, D] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], extents = extents.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellContext[K, D]]
  }
  @scala.inline
  implicit class CellContextOps[Self[k, d] <: CellContext[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withCell(value: D): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentElement(value: Element): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: D): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtents(value: AnonColumnRow): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexes(value: AnonColumnRow): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeys(value: AnonColumnK[K]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: edit | navigation): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentElement(value: Element): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatasource(value: DataProvider[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatasourceNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasource")(null)
        ret
    }
  }
  
}

