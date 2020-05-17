package typingsSlinky.aframe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinglePropertySchema[T] extends Schema_[T] {
  var default: js.UndefOr[T] = js.native
  var parse: js.UndefOr[js.Function1[/* value */ String, T]] = js.native
  var stringify: js.UndefOr[js.Function1[/* value */ T, String]] = js.native
  var `type`: js.UndefOr[PropertyTypes] = js.native
}

object SinglePropertySchema {
  @scala.inline
  def apply[T](): SinglePropertySchema[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SinglePropertySchema[T]]
  }
  @scala.inline
  implicit class SinglePropertySchemaOps[Self[t] <: SinglePropertySchema[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDefault(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withParse(value: /* value */ String => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParse: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.undefined)
        ret
    }
    @scala.inline
    def withStringify(value: /* value */ T => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringify")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStringify: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringify")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: PropertyTypes): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

