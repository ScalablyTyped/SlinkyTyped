package typingsSlinky.emberData.mod

import typingsSlinky.emberData.emberDataBooleans.`true`
import typingsSlinky.emberData.emberDataStrings.belongsTo
import typingsSlinky.emberData.emberDataStrings.hasMany
import typingsSlinky.emberData.mod.DS.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationshipMeta[Model /* <: Model */] extends js.Object {
  var isRelationship: `true` = js.native
  var key: RelationshipsFor[Model] = js.native
  var kind: belongsTo | hasMany = js.native
  var name: String = js.native
  var options: RelationshipMetaOptions = js.native
  var parentType: Model = js.native
  var `type`: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String = js.native
}

object RelationshipMeta {
  @scala.inline
  def apply[Model](
    isRelationship: `true`,
    key: RelationshipsFor[Model],
    kind: belongsTo | hasMany,
    name: String,
    options: RelationshipMetaOptions,
    parentType: Model,
    `type`: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String
  ): RelationshipMeta[Model] = {
    val __obj = js.Dynamic.literal(isRelationship = isRelationship.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationshipMeta[Model]]
  }
  @scala.inline
  implicit class RelationshipMetaOps[Self[model] <: RelationshipMeta[model], Model] (val x: Self[Model]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Model] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Model]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Model] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Model] with Other]
    @scala.inline
    def withIsRelationship(value: `true`): Self[Model] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRelationship")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: RelationshipsFor[Model]): Self[Model] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: belongsTo | hasMany): Self[Model] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[Model] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: RelationshipMetaOptions): Self[Model] = {
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
    def withType(value: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String): Self[Model] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

