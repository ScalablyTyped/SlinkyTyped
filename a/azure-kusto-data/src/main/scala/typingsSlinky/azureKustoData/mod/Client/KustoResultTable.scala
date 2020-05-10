package typingsSlinky.azureKustoData.mod.Client

import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KustoResultTable[T] extends js.Object {
  var columns: js.Array[_] = js.native
  var id: String = js.native
  var kind: String = js.native
  var name: String = js.native
  def rows(): IterableIterator[KustoResultRow[T]] = js.native
  def toJson(): js.Any = js.native
}

object KustoResultTable {
  @scala.inline
  def apply[T](
    columns: js.Array[_],
    id: String,
    kind: String,
    name: String,
    rows: () => IterableIterator[KustoResultRow[T]],
    toJson: () => js.Any
  ): KustoResultTable[T] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rows = js.Any.fromFunction0(rows), toJson = js.Any.fromFunction0(toJson))
    __obj.asInstanceOf[KustoResultTable[T]]
  }
  @scala.inline
  implicit class KustoResultTableOps[Self[t] <: KustoResultTable[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withColumns(value: js.Array[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: () => IterableIterator[KustoResultRow[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToJson(value: () => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJson")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

