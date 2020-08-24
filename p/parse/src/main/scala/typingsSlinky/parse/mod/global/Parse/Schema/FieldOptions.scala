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
  def apply[/* <: java.lang.String | scala.Double | scala.Boolean | typingsSlinky.std.Date | typingsSlinky.parse.mod.global.Parse.File | typingsSlinky.parse.mod.global.Parse.GeoPoint | typingsSlinky.parse.mod.global.Parse.Polygon | js.Array[_] | js.Object | typingsSlinky.parse.mod.global.Parse.Pointer | (typingsSlinky.parse.mod.global.Parse.Relation[
  typingsSlinky.parse.mod.global.Parse.Object[typingsSlinky.parse.mod.global.Parse.Attributes], 
  typingsSlinky.parse.mod.global.Parse.Object[typingsSlinky.parse.mod.global.Parse.Attributes]]) */ T](): FieldOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldOptions[T]]
  }
  @scala.inline
  implicit class FieldOptionsOps[Self <: FieldOptions[_], /* <: java.lang.String | scala.Double | scala.Boolean | typingsSlinky.std.Date | typingsSlinky.parse.mod.global.Parse.File | typingsSlinky.parse.mod.global.Parse.GeoPoint | typingsSlinky.parse.mod.global.Parse.Polygon | js.Array[_] | js.Object | typingsSlinky.parse.mod.global.Parse.Pointer | (typingsSlinky.parse.mod.global.Parse.Relation[
  typingsSlinky.parse.mod.global.Parse.Object[typingsSlinky.parse.mod.global.Parse.Attributes], 
  typingsSlinky.parse.mod.global.Parse.Object[typingsSlinky.parse.mod.global.Parse.Attributes]]) */ T] (val x: Self with FieldOptions[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultValue(value: T): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
  
}

