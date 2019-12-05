package typingsSlinky.emberDashData.emberDashDataMod

import typingsSlinky.emberDashData.emberDashDataMod.DS.Model
import typingsSlinky.emberDashData.emberDashDataNumbers.`true`
import typingsSlinky.emberDashData.emberDashDataStrings.belongsTo
import typingsSlinky.emberDashData.emberDashDataStrings.hasMany
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationshipMeta[Model /* <: Model */] extends js.Object {
  var isRelationship: `true`
  var key: RelationshipsFor[Model]
  var kind: belongsTo | hasMany
  var name: String
  var options: RelationshipMetaOptions
  var parentType: Model
  var `type`: String
}

object RelationshipMeta {
  @scala.inline
  def apply[Model /* <: Model */](
    isRelationship: `true`,
    key: RelationshipsFor[Model],
    kind: belongsTo | hasMany,
    name: String,
    options: RelationshipMetaOptions,
    parentType: Model,
    `type`: String
  ): RelationshipMeta[Model] = {
    val __obj = js.Dynamic.literal(isRelationship = isRelationship.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationshipMeta[Model]]
  }
}

