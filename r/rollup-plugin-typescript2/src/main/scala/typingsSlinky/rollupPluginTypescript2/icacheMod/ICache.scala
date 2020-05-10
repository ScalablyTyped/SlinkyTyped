package typingsSlinky.rollupPluginTypescript2.icacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICache[DataType] extends js.Object {
  def exists(name: String): Boolean = js.native
  def `match`(names: js.Array[String]): Boolean = js.native
  def path(name: String): String = js.native
  def read(name: String): js.UndefOr[DataType | Null] = js.native
  def roll(): Unit = js.native
  def touch(name: String): Unit = js.native
  def write(name: String, data: DataType): Unit = js.native
}

object ICache {
  @scala.inline
  def apply[DataType](
    exists: String => Boolean,
    `match`: js.Array[String] => Boolean,
    path: String => String,
    read: String => js.UndefOr[DataType | Null],
    roll: () => Unit,
    touch: String => Unit,
    write: (String, DataType) => Unit
  ): ICache[DataType] = {
    val __obj = js.Dynamic.literal(exists = js.Any.fromFunction1(exists), path = js.Any.fromFunction1(path), read = js.Any.fromFunction1(read), roll = js.Any.fromFunction0(roll), touch = js.Any.fromFunction1(touch), write = js.Any.fromFunction2(write))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[ICache[DataType]]
  }
  @scala.inline
  implicit class ICacheOps[Self[datatype] <: ICache[datatype], DataType] (val x: Self[DataType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DataType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DataType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[DataType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[DataType] with Other]
    @scala.inline
    def withExists(value: String => Boolean): Self[DataType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exists")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMatch(value: js.Array[String] => Boolean): Self[DataType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPath(value: String => String): Self[DataType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRead(value: String => js.UndefOr[DataType | Null]): Self[DataType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRoll(value: () => Unit): Self[DataType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTouch(value: String => Unit): Self[DataType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrite(value: (String, DataType) => Unit): Self[DataType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

