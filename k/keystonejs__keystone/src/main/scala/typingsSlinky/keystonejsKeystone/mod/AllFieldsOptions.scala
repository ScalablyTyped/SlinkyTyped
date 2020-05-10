package typingsSlinky.keystonejsKeystone.mod

import typingsSlinky.keystonejsFields.mod.FieldType
import typingsSlinky.keystonejsKeystone.AnonLabel
import typingsSlinky.keystonejsKeystone.AnonResolvedData
import typingsSlinky.keystonejsKeystone.keystonejsKeystoneStrings.lower
import typingsSlinky.keystonejsKeystone.keystonejsKeystoneStrings.upper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.keystonejsKeystone.mod.BaseFieldOptions
  - typingsSlinky.keystonejsKeystone.mod.AutoIncrementOptions
  - typingsSlinky.keystonejsKeystone.mod.CalendarDayOptions
  - typingsSlinky.keystonejsKeystone.mod.ContentOptions
  - typingsSlinky.keystonejsKeystone.mod.DateTimeOptions
  - typingsSlinky.keystonejsKeystone.mod.FileOptions
  - typingsSlinky.keystonejsKeystone.mod.LocationOptions
  - typingsSlinky.keystonejsKeystone.mod.OEmbedOptions
  - typingsSlinky.keystonejsKeystone.mod.PasswordOptions
  - typingsSlinky.keystonejsKeystone.mod.RelationshipOptions
  - typingsSlinky.keystonejsKeystone.mod.SelectOptions
  - typingsSlinky.keystonejsKeystone.mod.SlugOptions[FieldNames]
  - typingsSlinky.keystonejsKeystone.mod.UnsplashOptions
  - typingsSlinky.keystonejsKeystone.mod.UuidOptions
*/
trait AllFieldsOptions[FieldNames /* <: String */] extends js.Object

object AllFieldsOptions {
  @scala.inline
  def PasswordOptions[FieldNames](minLength: Double, rejectCommon: Boolean, `type`: FieldType, workFactor: Double): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(minLength = minLength.asInstanceOf[js.Any], rejectCommon = rejectCommon.asInstanceOf[js.Any], workFactor = workFactor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def RelationshipOptions[FieldNames](many: Boolean, ref: String, `type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(many = many.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def SelectOptions[FieldNames](options: String | (js.Array[AnonLabel | String]), `type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def SlugOptions[FieldNames](from: String, generate: AnonResolvedData[FieldNames] => String, `type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], generate = js.Any.fromFunction1(generate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def FileOptions[FieldNames](`type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def OEmbedOptions[FieldNames](adapter: js.Any, `type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def CalendarDayOptions[FieldNames](`type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def ContentOptions[FieldNames](blocks: js.Array[_], `type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def AutoIncrementOptions[FieldNames](`type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def DateTimeOptions[FieldNames](knexOptions: js.Any, `type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(knexOptions = knexOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def UnsplashOptions[FieldNames](accessKey: String, secretKey: String, `type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def BaseFieldOptions[FieldNames](`type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def LocationOptions[FieldNames](googleMapsKey: String, `type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(googleMapsKey = googleMapsKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def UuidOptions[FieldNames](caseTo: upper | lower, `type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(caseTo = caseTo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
}

