package typingsSlinky.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a property in a projection.
  */
@js.native
trait SchemaProjection extends js.Object {
  /**
    * The property to project.
    */
  var property: js.UndefOr[SchemaPropertyReference] = js.native
}

object SchemaProjection {
  @scala.inline
  def apply(): SchemaProjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjection]
  }
  @scala.inline
  implicit class SchemaProjectionOps[Self <: SchemaProjection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProperty(value: SchemaPropertyReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(js.undefined)
        ret
    }
  }
  
}

