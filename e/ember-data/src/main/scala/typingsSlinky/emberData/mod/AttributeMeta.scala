package typingsSlinky.emberData.mod

import typingsSlinky.emberData.emberDataBooleans.`true`
import typingsSlinky.emberData.emberDataStrings.boolean
import typingsSlinky.emberData.emberDataStrings.date
import typingsSlinky.emberData.emberDataStrings.number
import typingsSlinky.emberData.emberDataStrings.string
import typingsSlinky.emberData.mod.DS.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeMeta[Model /* <: Model */] extends js.Object {
  var isAttribute: `true` = js.native
  var name: AttributesFor[Model] = js.native
  var options: js.Object = js.native
  var parentType: Model = js.native
  var `type`: /* keyof ember-data.ember-data/types/registries/transform.TransformRegistry */ string | boolean | number | date = js.native
}

object AttributeMeta {
  @scala.inline
  def apply[Model](
    isAttribute: `true`,
    name: AttributesFor[Model],
    options: js.Object,
    parentType: Model,
    `type`: /* keyof ember-data.ember-data/types/registries/transform.TransformRegistry */ string | boolean | number | date
  ): AttributeMeta[Model] = {
    val __obj = js.Dynamic.literal(isAttribute = isAttribute.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeMeta[Model]]
  }
  @scala.inline
  implicit class AttributeMetaOps[Self[model] <: AttributeMeta[model], Model] (val x: Self[Model]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Model] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Model]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Model] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Model] with Other]
    @scala.inline
    def withIsAttribute(value: `true`): Self[Model] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: AttributesFor[Model]): Self[Model] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Object): Self[Model] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentType(value: Model): Self[Model] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(
      value: /* keyof ember-data.ember-data/types/registries/transform.TransformRegistry */ string | boolean | number | date
    ): Self[Model] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

