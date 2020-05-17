package typingsSlinky.abbrev.mod.global

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadonlyArray[T] extends js.Object {
  def abbrev(): StringDictionary[String] = js.native
}

object ReadonlyArray {
  @scala.inline
  def apply[T](abbrev: () => StringDictionary[String]): ReadonlyArray[T] = {
    val __obj = js.Dynamic.literal(abbrev = js.Any.fromFunction0(abbrev))
    __obj.asInstanceOf[ReadonlyArray[T]]
  }
  @scala.inline
  implicit class ReadonlyArrayOps[Self[t] <: ReadonlyArray[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAbbrev(value: () => StringDictionary[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abbrev")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

