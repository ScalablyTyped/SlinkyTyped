package typingsSlinky.minecraftScriptingTypesClient

import typingsSlinky.minecraftScriptingTypesClient.anon.Absorbsinput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is used to show a UI screen to the specific player running the client script. This event will add the UI screen to the top of the UI screen stack. The screen will be shown immediately after the event is triggered. Only screens defined in a HTML file can be shown using this event.
  */
@js.native
trait ILoadUIParameters extends js.Object {
  /**
    * You can define the following options for the screen by setting their value to true or false:
    */
  var options: js.UndefOr[Absorbsinput] = js.native
  /**
    * The file path to the screen's HTML file
    */
  var path: String = js.native
}

object ILoadUIParameters {
  @scala.inline
  def apply(path: String): ILoadUIParameters = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoadUIParameters]
  }
  @scala.inline
  implicit class ILoadUIParametersOps[Self <: ILoadUIParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: Absorbsinput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

