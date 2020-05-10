package typingsSlinky.handsontable.mod.Handsontable.plugins

import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlterManager extends js.Object {
  var dataProvider: DataProvider = js.native
  var hot: Core = js.native
  var matrix: Matrix = js.native
  var sheet: Sheet = js.native
  def destroy(): Unit = js.native
  def prepareAlter(action: String, args: js.Any): Unit = js.native
  def triggerAlter(action: String, args: js.Any): Unit = js.native
}

object AlterManager {
  @scala.inline
  def apply(
    dataProvider: DataProvider,
    destroy: () => Unit,
    hot: Core,
    matrix: Matrix,
    prepareAlter: (String, js.Any) => Unit,
    sheet: Sheet,
    triggerAlter: (String, js.Any) => Unit
  ): AlterManager = {
    val __obj = js.Dynamic.literal(dataProvider = dataProvider.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), hot = hot.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], prepareAlter = js.Any.fromFunction2(prepareAlter), sheet = sheet.asInstanceOf[js.Any], triggerAlter = js.Any.fromFunction2(triggerAlter))
    __obj.asInstanceOf[AlterManager]
  }
  @scala.inline
  implicit class AlterManagerOps[Self <: AlterManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataProvider(value: DataProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHot(value: Core): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatrix(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrepareAlter(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareAlter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSheet(value: Sheet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerAlter(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerAlter")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

