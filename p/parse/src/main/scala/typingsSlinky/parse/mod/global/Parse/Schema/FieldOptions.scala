package typingsSlinky.parse.mod.global.Parse.Schema

import typingsSlinky.parse.mod.global.Parse.Attributes
import typingsSlinky.parse.mod.global.Parse.File
import typingsSlinky.parse.mod.global.Parse.GeoPoint
import typingsSlinky.parse.mod.global.Parse.Object
import typingsSlinky.parse.mod.global.Parse.Pointer
import typingsSlinky.parse.mod.global.Parse.Polygon
import typingsSlinky.parse.mod.global.Parse.Relation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldOptions[T /* <: String | Double | Boolean | js.Date | File | GeoPoint | Polygon | js.Array[_] | js.Object | Pointer | (Relation[Object[Attributes], Object[Attributes]]) */] extends js.Object {
  var defaultValue: js.UndefOr[T] = js.native
  var required: js.UndefOr[Boolean] = js.native
}

object FieldOptions {
  @scala.inline
  def apply[T](): FieldOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldOptions[T]]
  }
  @scala.inline
  implicit class FieldOptionsOps[Self[t] <: FieldOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDefaultValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
  }
  
}

