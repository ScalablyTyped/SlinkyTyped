package typingsSlinky.draftJs.mod.Draft.Model.Encoding

import typingsSlinky.draftJs.mod.Draft.Model.Constants.DraftEntityMutability
import typingsSlinky.draftJs.mod.Draft.Model.Constants.DraftEntityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A plain object representation of an EntityInstance.
  */
@js.native
trait RawDraftEntity[T] extends js.Object {
  var data: T = js.native
  var mutability: DraftEntityMutability = js.native
  var `type`: DraftEntityType = js.native
}

object RawDraftEntity {
  @scala.inline
  def apply[T](data: T, mutability: DraftEntityMutability, `type`: DraftEntityType): RawDraftEntity[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mutability = mutability.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawDraftEntity[T]]
  }
  @scala.inline
  implicit class RawDraftEntityOps[Self[t] <: RawDraftEntity[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withData(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMutability(value: DraftEntityMutability): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: DraftEntityType): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

