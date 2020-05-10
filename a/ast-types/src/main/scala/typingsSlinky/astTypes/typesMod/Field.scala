package typingsSlinky.astTypes.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Field[T] extends js.Object {
  val defaultFn: js.UndefOr[js.Function] = js.native
  val hidden: Boolean = js.native
  val name: String = js.native
  val `type`: Type[T] = js.native
  def getValue(obj: StringDictionary[js.Any]): js.Any = js.native
}

object Field {
  @scala.inline
  def apply[T](getValue: StringDictionary[js.Any] => js.Any, hidden: Boolean, name: String, `type`: Type[T]): Field[T] = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction1(getValue), hidden = hidden.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field[T]]
  }
  @scala.inline
  implicit class FieldOps[Self[t] <: Field[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGetValue(value: StringDictionary[js.Any] => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Type[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultFn(value: js.Function): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFn: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFn")(js.undefined)
        ret
    }
  }
  
}

