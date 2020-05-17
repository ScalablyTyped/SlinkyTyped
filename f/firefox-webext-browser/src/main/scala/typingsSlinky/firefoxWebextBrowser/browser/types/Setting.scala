package typingsSlinky.firefoxWebextBrowser.browser.types

import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import typingsSlinky.firefoxWebextBrowser.anon.IncognitoBoolean
import typingsSlinky.firefoxWebextBrowser.anon.IncognitoSpecific
import typingsSlinky.firefoxWebextBrowser.anon.Scope
import typingsSlinky.firefoxWebextBrowser.anon.ScopeSettingScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Setting extends js.Object {
  /**
    * Fired after the setting changes.
    * @deprecated Unsupported on Firefox at this time.
    */
  var onChange: WebExtEvent[js.Function1[/* details */ IncognitoSpecific, Unit]] = js.native
  /**
    * Clears the setting, restoring any default value.
    * @param details Which setting to clear.
    */
  def clear(details: ScopeSettingScope): js.Promise[Unit] = js.native
  /**
    * Gets the value of a setting.
    * @param details Which setting to consider.
    */
  def get(details: IncognitoBoolean): js.Promise[IncognitoSpecific] = js.native
  /**
    * Sets the value of a setting.
    * @param details Which setting to change.
    */
  def set(details: Scope): js.Promise[Unit] = js.native
}

object Setting {
  @scala.inline
  def apply(
    clear: ScopeSettingScope => js.Promise[Unit],
    get: IncognitoBoolean => js.Promise[IncognitoSpecific],
    onChange: WebExtEvent[js.Function1[/* details */ IncognitoSpecific, Unit]],
    set: Scope => js.Promise[Unit]
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
    def withClear(value: ScopeSettingScope => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: IncognitoBoolean => js.Promise[IncognitoSpecific]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnChange(value: WebExtEvent[js.Function1[/* details */ IncognitoSpecific, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: Scope => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

