package typingsSlinky.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableModel extends js.Object {
  def bindTo(element: js.Any): Unit = js.native
  def get(index: Double): Unit = js.native
  def getChanges(): Changes = js.native
  def insert(json: js.Any): Unit = js.native
  def isDirty(): Boolean = js.native
  def length(): Double = js.native
  def off(eventName: String, handler: js.Any): Unit = js.native
  def on(eventName: String, handler: js.Any): Unit = js.native
  def rejectChanges(): Unit = js.native
  def remove(key: String): Unit = js.native
  def saveChanges(): Unit = js.native
  def setDataManager(dataManager: DataManager): Unit = js.native
  def setDirty(dirty: js.Any, model: js.Any): Unit = js.native
  def toArray(): js.Array[_] = js.native
  def update(value: js.Any): Unit = js.native
}

object TableModel {
  @scala.inline
  def apply(
    bindTo: js.Any => Unit,
    get: Double => Unit,
    getChanges: () => Changes,
    insert: js.Any => Unit,
    isDirty: () => Boolean,
    length: () => Double,
    off: (String, js.Any) => Unit,
    on: (String, js.Any) => Unit,
    rejectChanges: () => Unit,
    remove: String => Unit,
    saveChanges: () => Unit,
    setDataManager: DataManager => Unit,
    setDirty: (js.Any, js.Any) => Unit,
    toArray: () => js.Array[_],
    update: js.Any => Unit
  ): TableModel = {
    val __obj = js.Dynamic.literal(bindTo = js.Any.fromFunction1(bindTo), get = js.Any.fromFunction1(get), getChanges = js.Any.fromFunction0(getChanges), insert = js.Any.fromFunction1(insert), isDirty = js.Any.fromFunction0(isDirty), length = js.Any.fromFunction0(length), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), rejectChanges = js.Any.fromFunction0(rejectChanges), remove = js.Any.fromFunction1(remove), saveChanges = js.Any.fromFunction0(saveChanges), setDataManager = js.Any.fromFunction1(setDataManager), setDirty = js.Any.fromFunction2(setDirty), toArray = js.Any.fromFunction0(toArray), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TableModel]
  }
  @scala.inline
  implicit class TableModelOps[Self <: TableModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindTo(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetChanges(value: () => Changes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsert(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsDirty(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOff(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOn(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRejectChanges(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectChanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSaveChanges(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveChanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDataManager(value: DataManager => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDataManager")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDirty(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToArray(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdate(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

