package typingsSlinky.draftJs.mod.Draft.Model.Encoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A plain object representation of an entity attribution.
  *
  * The `key` value corresponds to the key of the entity in the `entityMap` of
  * a `ComposedText` object, not for use with `DraftEntity.get()`.
  */
@js.native
trait RawDraftEntityRange extends js.Object {
  var key: Double = js.native
  var length: Double = js.native
  var offset: Double = js.native
}

object RawDraftEntityRange {
  @scala.inline
  def apply(key: Double, length: Double, offset: Double): RawDraftEntityRange = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawDraftEntityRange]
  }
  @scala.inline
  implicit class RawDraftEntityRangeOps[Self <: RawDraftEntityRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

