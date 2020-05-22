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

trait FieldOptions[T /* <: String | Double | Boolean | js.Date | File | GeoPoint | Polygon | js.Array[_] | js.Object | Pointer | (Relation[Object[Attributes], Object[Attributes]]) */] extends js.Object {
  var defaultValue: js.UndefOr[T] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
}

object FieldOptions {
  @scala.inline
  def apply[T](defaultValue: T = null, required: js.UndefOr[Boolean] = js.undefined): FieldOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldOptions[T]]
  }
}

