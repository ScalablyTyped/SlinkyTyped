package typingsSlinky.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Relationship extends js.Object {
  /**
    * An array of IDs for related blocks. You can get the type of the relationship from the Type element.
    */
  var Ids: js.UndefOr[IdList] = js.native
  /**
    * The type of relationship that the blocks in the IDs array have with the current block. The relationship can be VALUE or CHILD. A relationship of type VALUE is a list that contains the ID of the VALUE block that's associated with the KEY of a key-value pair. A relationship of type CHILD is a list of IDs that identify WORD blocks.
    */
  var Type: js.UndefOr[RelationshipType] = js.native
}

object Relationship {
  @scala.inline
  def apply(): Relationship = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relationship]
  }
  @scala.inline
  implicit class RelationshipOps[Self <: Relationship] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIds(value: IdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ids")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: RelationshipType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

