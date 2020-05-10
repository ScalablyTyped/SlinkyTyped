package typingsSlinky.firebaseDatabaseTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSnapshot extends js.Object {
  var key: String | Null = js.native
  var ref: Reference = js.native
  def child(path: String): DataSnapshot = js.native
  def exists(): Boolean = js.native
  def exportVal(): js.Any = js.native
  def forEach(action: js.Function1[/* a */ this.type, Boolean | Unit]): Boolean = js.native
  def getPriority(): String | Double | Null = js.native
  def hasChild(path: String): Boolean = js.native
  def hasChildren(): Boolean = js.native
  def numChildren(): Double = js.native
  def toJSON(): js.Object | Null = js.native
  def `val`(): js.Any = js.native
}

object DataSnapshot {
  @scala.inline
  def apply(
    child: String => DataSnapshot,
    exists: () => Boolean,
    exportVal: () => js.Any,
    forEach: js.Function1[DataSnapshot, Boolean | Unit] => Boolean,
    getPriority: () => String | Double | Null,
    hasChild: String => Boolean,
    hasChildren: () => Boolean,
    numChildren: () => Double,
    ref: Reference,
    toJSON: () => js.Object | Null,
    `val`: () => js.Any
  ): DataSnapshot = {
    val __obj = js.Dynamic.literal(child = js.Any.fromFunction1(child), exists = js.Any.fromFunction0(exists), exportVal = js.Any.fromFunction0(exportVal), forEach = js.Any.fromFunction1(forEach), getPriority = js.Any.fromFunction0(getPriority), hasChild = js.Any.fromFunction1(hasChild), hasChildren = js.Any.fromFunction0(hasChildren), numChildren = js.Any.fromFunction0(numChildren), ref = ref.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("val")(js.Any.fromFunction0(`val`))
    __obj.asInstanceOf[DataSnapshot]
  }
  @scala.inline
  implicit class DataSnapshotOps[Self <: DataSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChild(value: String => DataSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExists(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exists")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExportVal(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportVal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withForEach(value: js.Function1[DataSnapshot, Boolean | Unit] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPriority(value: () => String | Double | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPriority")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasChild(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasChildren(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildren")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNumChildren(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numChildren")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRef(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Object | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVal(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("val")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(null)
        ret
    }
  }
  
}

