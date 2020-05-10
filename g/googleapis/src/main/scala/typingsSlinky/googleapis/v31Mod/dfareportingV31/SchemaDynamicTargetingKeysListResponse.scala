package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dynamic Targeting Key List Response
  */
@js.native
trait SchemaDynamicTargetingKeysListResponse extends js.Object {
  /**
    * Dynamic targeting key collection.
    */
  var dynamicTargetingKeys: js.UndefOr[js.Array[SchemaDynamicTargetingKey]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#dynamicTargetingKeysListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaDynamicTargetingKeysListResponse {
  @scala.inline
  def apply(): SchemaDynamicTargetingKeysListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicTargetingKeysListResponse]
  }
  @scala.inline
  implicit class SchemaDynamicTargetingKeysListResponseOps[Self <: SchemaDynamicTargetingKeysListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamicTargetingKeys(value: js.Array[SchemaDynamicTargetingKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicTargetingKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicTargetingKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicTargetingKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

