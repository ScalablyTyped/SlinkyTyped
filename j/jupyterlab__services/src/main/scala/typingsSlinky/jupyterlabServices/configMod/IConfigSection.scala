package typingsSlinky.jupyterlabServices.configMod

import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConfigSection extends js.Object {
  /**
    * The data for this section.
    */
  val data: JSONObject = js.native
  /**
    * The server settings for the section.
    */
  val serverSettings: ISettings = js.native
  /**
    * Modify the stored config values.
    *
    * #### Notes
    * Updates the local data immediately, sends the change to the server,
    * and updates the local data with the response, and fulfils the promise
    * with that data.
    */
  def update(newdata: JSONObject): js.Promise[JSONObject] = js.native
}

object IConfigSection {
  @scala.inline
  def apply(data: JSONObject, serverSettings: ISettings, update: JSONObject => js.Promise[JSONObject]): IConfigSection = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], serverSettings = serverSettings.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[IConfigSection]
  }
  @scala.inline
  implicit class IConfigSectionOps[Self <: IConfigSection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: JSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerSettings(value: ISettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: JSONObject => js.Promise[JSONObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

