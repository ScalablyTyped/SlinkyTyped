package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeCallPropertyKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeIndexerKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeInternalSlotKind
import typingsSlinky.astTypes.kindsMod.ObjectTypePropertyKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeSpreadPropertyKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.FlowType, 'type'> */
@js.native
trait ObjectTypeAnnotation extends ASTNode {
  var callProperties: js.Array[ObjectTypeCallPropertyKind] = js.native
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var exact: Boolean = js.native
  var indexers: js.Array[ObjectTypeIndexerKind] = js.native
  var inexact: js.UndefOr[Boolean] = js.native
  var internalSlots: js.Array[ObjectTypeInternalSlotKind] = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind] = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.ObjectTypeAnnotation = js.native
}

object ObjectTypeAnnotation {
  @scala.inline
  def apply(
    callProperties: js.Array[ObjectTypeCallPropertyKind],
    exact: Boolean,
    indexers: js.Array[ObjectTypeIndexerKind],
    internalSlots: js.Array[ObjectTypeInternalSlotKind],
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectTypeAnnotation
  ): ObjectTypeAnnotation = {
    val __obj = js.Dynamic.literal(callProperties = callProperties.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], indexers = indexers.asInstanceOf[js.Any], internalSlots = internalSlots.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeAnnotation]
  }
  @scala.inline
  implicit class ObjectTypeAnnotationOps[Self <: ObjectTypeAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallProperties(value: js.Array[ObjectTypeCallPropertyKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexers(value: js.Array[ObjectTypeIndexerKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternalSlots(value: js.Array[ObjectTypeInternalSlotKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalSlots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.astTypes.astTypesStrings.ObjectTypeAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments(value: js.Array[CommentKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withInexact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inexact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInexact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inexact")(js.undefined)
        ret
    }
    @scala.inline
    def withLoc(value: SourceLocationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(js.undefined)
        ret
    }
  }
  
}

