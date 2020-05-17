package typingsSlinky.blueprintjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Key[T /* <: js.Object */] extends js.Object {
  var key: /* keyof T */ String = js.native
  var valueA: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any = js.native
  var valueB: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any = js.native
}

object Key {
  @scala.inline
  def apply[T](
    key: /* keyof T */ String,
    valueA: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any,
    valueB: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ): Key[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], valueA = valueA.asInstanceOf[js.Any], valueB = valueB.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key[T]]
  }
  @scala.inline
  implicit class KeyOps[Self[t] <: Key[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withKey(value: /* keyof T */ String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueA(value: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueB(value: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueB")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

