package typingsSlinky.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Relation extends js.Object {
  var joinModelClass: ModelClass[_] = js.native
  var joinTable: String = js.native
  var joinTableOwnerProp: RelationProperty = js.native
  var joinTableRelatedProp: RelationProperty = js.native
  var name: String = js.native
  var ownerModelClass: ModelClass[_] = js.native
  var ownerProp: RelationProperty = js.native
  var relatedModelClass: ModelClass[_] = js.native
  var relatedProp: RelationProperty = js.native
}

object Relation {
  @scala.inline
  def apply(
    joinModelClass: ModelClass[_],
    joinTable: String,
    joinTableOwnerProp: RelationProperty,
    joinTableRelatedProp: RelationProperty,
    name: String,
    ownerModelClass: ModelClass[_],
    ownerProp: RelationProperty,
    relatedModelClass: ModelClass[_],
    relatedProp: RelationProperty
  ): Relation = {
    val __obj = js.Dynamic.literal(joinModelClass = joinModelClass.asInstanceOf[js.Any], joinTable = joinTable.asInstanceOf[js.Any], joinTableOwnerProp = joinTableOwnerProp.asInstanceOf[js.Any], joinTableRelatedProp = joinTableRelatedProp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerModelClass = ownerModelClass.asInstanceOf[js.Any], ownerProp = ownerProp.asInstanceOf[js.Any], relatedModelClass = relatedModelClass.asInstanceOf[js.Any], relatedProp = relatedProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relation]
  }
  @scala.inline
  implicit class RelationOps[Self <: Relation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJoinModelClass(value: ModelClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinModelClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJoinTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJoinTableOwnerProp(value: RelationProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinTableOwnerProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJoinTableRelatedProp(value: RelationProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinTableRelatedProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerModelClass(value: ModelClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerModelClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerProp(value: RelationProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelatedModelClass(value: ModelClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedModelClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelatedProp(value: RelationProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedProp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

