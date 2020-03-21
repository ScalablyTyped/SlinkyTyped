package typingsSlinky.parse.mod._Global_.Parse.Schema

import typingsSlinky.parse.mod._Global_.Parse.Attributes
import typingsSlinky.parse.mod._Global_.Parse.File
import typingsSlinky.parse.mod._Global_.Parse.GeoPoint
import typingsSlinky.parse.mod._Global_.Parse.Object
import typingsSlinky.parse.mod._Global_.Parse.Pointer
import typingsSlinky.parse.mod._Global_.Parse.Polygon
import typingsSlinky.parse.mod._Global_.Parse.Relation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldOptions[T /* <: String | Double | Boolean | js.Date | File | GeoPoint | Polygon | js.Array[_] | js.Object | Pointer | (Relation[Object[Attributes], Object[Attributes]]) */] extends js.Object {
  var defaultValue: js.UndefOr[T] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
}

object FieldOptions {
  @scala.inline
  def apply[T /* <: String | Double | Boolean | js.Date | File | GeoPoint | Polygon | js.Array[_] | js.Object | Pointer | (Relation[Object[Attributes], Object[Attributes]]) */](defaultValue: T = null, required: js.UndefOr[Boolean] = js.undefined): FieldOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldOptions[T]]
  }
}

