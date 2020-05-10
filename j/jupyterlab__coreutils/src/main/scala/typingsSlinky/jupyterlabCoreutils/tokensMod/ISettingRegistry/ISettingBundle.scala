package typingsSlinky.jupyterlabCoreutils.tokensMod.ISettingRegistry

import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The setting values for a plugin.
  */
@js.native
trait ISettingBundle extends JSONObject {
  /**
    * A composite of the user setting values and the plugin schema defaults.
    *
    * #### Notes
    * The `composite` values will always be a superset of the `user` values.
    */
  var composite: JSONObject = js.native
  /**
    * The user setting values.
    */
  var user: JSONObject = js.native
}

object ISettingBundle {
  @scala.inline
  def apply(composite: JSONObject, user: JSONObject): ISettingBundle = {
    val __obj = js.Dynamic.literal(composite = composite.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISettingBundle]
  }
  @scala.inline
  implicit class ISettingBundleOps[Self <: ISettingBundle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComposite(value: JSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: JSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

