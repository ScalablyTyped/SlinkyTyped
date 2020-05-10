package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance failover context.
  */
@js.native
trait SchemaFailoverContext extends js.Object {
  /**
    * This is always sql#failoverContext.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The current settings version of this instance. Request will be rejected
    * if this version doesn&#39;t match the current settings version.
    */
  var settingsVersion: js.UndefOr[String] = js.native
}

object SchemaFailoverContext {
  @scala.inline
  def apply(): SchemaFailoverContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFailoverContext]
  }
  @scala.inline
  implicit class SchemaFailoverContextOps[Self <: SchemaFailoverContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withSettingsVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsVersion")(js.undefined)
        ret
    }
  }
  
}

