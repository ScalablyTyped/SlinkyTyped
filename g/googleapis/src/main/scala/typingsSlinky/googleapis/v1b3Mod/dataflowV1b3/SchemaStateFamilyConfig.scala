package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * State family configuration.
  */
@js.native
trait SchemaStateFamilyConfig extends js.Object {
  /**
    * If true, this family corresponds to a read operation.
    */
  var isRead: js.UndefOr[Boolean] = js.native
  /**
    * The state family value.
    */
  var stateFamily: js.UndefOr[String] = js.native
}

object SchemaStateFamilyConfig {
  @scala.inline
  def apply(): SchemaStateFamilyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStateFamilyConfig]
  }
  @scala.inline
  implicit class SchemaStateFamilyConfigOps[Self <: SchemaStateFamilyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRead")(js.undefined)
        ret
    }
    @scala.inline
    def withStateFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateFamily")(js.undefined)
        ret
    }
  }
  
}

