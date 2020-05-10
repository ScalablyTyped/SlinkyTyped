package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCustomAttribute extends js.Object {
  /**
    * Subattributes within this attribute group. Exactly one of value or
    * groupValues must be provided.
    */
  var groupValues: js.UndefOr[js.Array[SchemaCustomAttribute]] = js.native
  /**
    * The name of the attribute. Underscores will be replaced by spaces upon
    * insertion.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The value of the attribute.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaCustomAttribute {
  @scala.inline
  def apply(): SchemaCustomAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomAttribute]
  }
  @scala.inline
  implicit class SchemaCustomAttributeOps[Self <: SchemaCustomAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupValues(value: js.Array[SchemaCustomAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupValues")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

