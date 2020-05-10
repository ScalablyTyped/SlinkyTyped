package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The placeholder information that uniquely identifies a placeholder shape.
  */
@js.native
trait SchemaPlaceholder extends js.Object {
  /**
    * The index of the placeholder. If the same placeholder types are present
    * in the same page, they would have different index values.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * The object ID of this shape&#39;s parent placeholder. If unset, the
    * parent placeholder shape does not exist, so the shape does not inherit
    * properties from any other shape.
    */
  var parentObjectId: js.UndefOr[String] = js.native
  /**
    * The type of the placeholder.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaPlaceholder {
  @scala.inline
  def apply(): SchemaPlaceholder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaceholder]
  }
  @scala.inline
  implicit class SchemaPlaceholderOps[Self <: SchemaPlaceholder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withParentObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentObjectId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

