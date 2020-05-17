package typingsSlinky.astTypes.anon

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

@js.native
trait CallProperties extends js.Object {
  var callProperties: js.UndefOr[js.Array[ObjectTypeCallPropertyKind]] = js.native
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  var exact: js.UndefOr[Boolean] = js.native
  var indexers: js.UndefOr[js.Array[ObjectTypeIndexerKind]] = js.native
  var inexact: js.UndefOr[Boolean] = js.native
  var internalSlots: js.UndefOr[js.Array[ObjectTypeInternalSlotKind]] = js.native
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  var properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind] = js.native
}

object CallProperties {
  @scala.inline
  def apply(properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind]): CallProperties = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallProperties]
  }
  @scala.inline
  implicit class CallPropertiesOps[Self <: CallProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProperties(value: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallProperties(value: js.Array[ObjectTypeCallPropertyKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callProperties")(js.undefined)
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
    def withCommentsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(null)
        ret
    }
    @scala.inline
    def withExact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexers(value: js.Array[ObjectTypeIndexerKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexers")(js.undefined)
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
    def withInternalSlots(value: js.Array[ObjectTypeInternalSlotKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalSlots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternalSlots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalSlots")(js.undefined)
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
    @scala.inline
    def withLocNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(null)
        ret
    }
  }
  
}

