package typingsSlinky.firefoxWebextBrowser.browser.types

import typingsSlinky.firefoxWebextBrowser.AnonIncognitoBoolean
import typingsSlinky.firefoxWebextBrowser.AnonIncognitoSpecific
import typingsSlinky.firefoxWebextBrowser.AnonScope
import typingsSlinky.firefoxWebextBrowser.AnonScopeSettingScope
import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Setting extends js.Object {
  /**
    * Fired after the setting changes.
    * @deprecated Unsupported on Firefox at this time.
    */
  var onChange: WebExtEvent[js.Function1[/* details */ AnonIncognitoSpecific, Unit]] = js.native
  /**
    * Clears the setting, restoring any default value.
    * @param details Which setting to clear.
    */
  def clear(details: AnonScopeSettingScope): js.Promise[Unit] = js.native
  /**
    * Gets the value of a setting.
    * @param details Which setting to consider.
    */
  def get(details: AnonIncognitoBoolean): js.Promise[AnonIncognitoSpecific] = js.native
  /**
    * Sets the value of a setting.
    * @param details Which setting to change.
    */
  def set(details: AnonScope): js.Promise[Unit] = js.native
}

object Setting {
  @scala.inline
  def apply(
    clear: AnonScopeSettingScope => js.Promise[Unit],
    get: AnonIncognitoBoolean => js.Promise[AnonIncognitoSpecific],
    onChange: WebExtEvent[js.Function1[/* details */ AnonIncognitoSpecific, Unit]],
    set: AnonScope => js.Promise[Unit]
  ): Setting = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction1(get), onChange = onChange.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[Setting]
  }
  @scala.inline
  implicit class SettingOps[Self <: Setting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: AnonScopeSettingScope => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonIncognitoBoolean => js.Promise[AnonIncognitoSpecific]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnChange(value: WebExtEvent[js.Function1[/* details */ AnonIncognitoSpecific, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: AnonScope => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

