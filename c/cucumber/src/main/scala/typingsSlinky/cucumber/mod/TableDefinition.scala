package typingsSlinky.cucumber.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableDefinition[Type] extends js.Object {
  /** Returns an array of objects where each row is converted to an object (column header is the key). */
  def hashes(): js.Array[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ columnName in keyof Type ]: string}
    */ typingsSlinky.cucumber.cucumberStrings.TableDefinition with TopLevel[js.Any]
  ] = js.native
  /** Returns the table as a 2-D array. */
  def raw(): js.Array[js.Array[String]] = js.native
  /** Returns the table as a 2-D array, without the first row. */
  def rows(): js.Array[js.Array[String]] = js.native
  /** Returns an object where each row corresponds to an entry (first column is the key, second column is the value). */
  def rowsHash(): StringDictionary[String] = js.native
}

object TableDefinition {
  @scala.inline
  def apply[Type](
    hashes: () => js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ columnName in keyof Type ]: string}
    */ typingsSlinky.cucumber.cucumberStrings.TableDefinition with TopLevel[js.Any]
    ],
    raw: () => js.Array[js.Array[String]],
    rows: () => js.Array[js.Array[String]],
    rowsHash: () => StringDictionary[String]
  ): TableDefinition[Type] = {
    val __obj = js.Dynamic.literal(hashes = js.Any.fromFunction0(hashes), raw = js.Any.fromFunction0(raw), rows = js.Any.fromFunction0(rows), rowsHash = js.Any.fromFunction0(rowsHash))
    __obj.asInstanceOf[TableDefinition[Type]]
  }
  @scala.inline
  implicit class TableDefinitionOps[Self[`type`] <: TableDefinition[`type`], Type] (val x: Self[Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Type] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Type] with Other]
    @scala.inline
    def withHashes(
      value: () => js.Array[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ columnName in keyof Type ]: string}
      */ typingsSlinky.cucumber.cucumberStrings.TableDefinition with TopLevel[js.Any]
        ]
    ): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRaw(value: () => js.Array[js.Array[String]]): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRows(value: () => js.Array[js.Array[String]]): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRowsHash(value: () => StringDictionary[String]): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsHash")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

