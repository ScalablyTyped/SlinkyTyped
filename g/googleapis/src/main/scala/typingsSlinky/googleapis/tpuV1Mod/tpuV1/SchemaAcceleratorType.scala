package typingsSlinky.googleapis.tpuV1Mod.tpuV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A accelerator type that a Node can be configured with.
  */
@js.native
trait SchemaAcceleratorType extends js.Object {
  /**
    * The resource name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * the accelerator type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaAcceleratorType {
  @scala.inline
  def apply(): SchemaAcceleratorType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcceleratorType]
  }
  @scala.inline
  implicit class SchemaAcceleratorTypeOps[Self <: SchemaAcceleratorType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

