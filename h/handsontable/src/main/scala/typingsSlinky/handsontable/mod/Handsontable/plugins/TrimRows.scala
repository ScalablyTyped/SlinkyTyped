package typingsSlinky.handsontable.mod.Handsontable.plugins

import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrimRows extends Base {
  var removedRows: js.Array[_] = js.native
  var rowsMapper: TrimRowsMapper = js.native
  var trimmedRows: js.Array[_] = js.native
  def isTrimmed(row: Double): Boolean = js.native
  def trimRow(row: Double): Unit = js.native
  def trimRows(rows: js.Array[Double]): Unit = js.native
  def untrimAll(): Unit = js.native
  def untrimRow(row: Double): Unit = js.native
  def untrimRows(rows: js.Array[Double]): Unit = js.native
}

object TrimRows {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    isTrimmed: Double => Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    removedRows: js.Array[_],
    rowsMapper: TrimRowsMapper,
    t: RecordTranslator,
    trimRow: Double => Unit,
    trimRows: js.Array[Double] => Unit,
    trimmedRows: js.Array[_],
    untrimAll: () => Unit,
    untrimRow: Double => Unit,
    untrimRows: js.Array[Double] => Unit,
    updatePlugin: () => Unit
  ): TrimRows = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], isTrimmed = js.Any.fromFunction1(isTrimmed), pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), removedRows = removedRows.asInstanceOf[js.Any], rowsMapper = rowsMapper.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], trimRow = js.Any.fromFunction1(trimRow), trimRows = js.Any.fromFunction1(trimRows), trimmedRows = trimmedRows.asInstanceOf[js.Any], untrimAll = js.Any.fromFunction0(untrimAll), untrimRow = js.Any.fromFunction1(untrimRow), untrimRows = js.Any.fromFunction1(untrimRows), updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[TrimRows]
  }
  @scala.inline
  implicit class TrimRowsOps[Self <: TrimRows] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsTrimmed(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrimmed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemovedRows(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowsMapper(value: TrimRowsMapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsMapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrimRow(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrimRows(value: js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimRows")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrimmedRows(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimmedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUntrimAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("untrimAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUntrimRow(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("untrimRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUntrimRows(value: js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("untrimRows")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

