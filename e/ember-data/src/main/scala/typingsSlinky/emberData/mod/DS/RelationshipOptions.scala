package typingsSlinky.emberData.mod.DS

import typingsSlinky.emberData.mod.RelationshipsFor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationshipOptions[M /* <: Model */] extends js.Object {
  var async: js.UndefOr[Boolean] = js.native
  var inverse: js.UndefOr[RelationshipsFor[M] | Null] = js.native
  var polymorphic: js.UndefOr[Boolean] = js.native
}

object RelationshipOptions {
  @scala.inline
  def apply[M](): RelationshipOptions[M] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipOptions[M]]
  }
  @scala.inline
  implicit class RelationshipOptionsOps[Self[m] <: RelationshipOptions[m], M] (val x: Self[M]) extends AnyVal {
    @scala.inline
    def duplicate: Self[M] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[M]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[M] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[M] with Other]
    @scala.inline
    def withAsync(value: Boolean): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withInverse(value: RelationshipsFor[M]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInverse: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(js.undefined)
        ret
    }
    @scala.inline
    def withInverseNull: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(null)
        ret
    }
    @scala.inline
    def withPolymorphic(value: Boolean): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polymorphic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolymorphic: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polymorphic")(js.undefined)
        ret
    }
  }
  
}

