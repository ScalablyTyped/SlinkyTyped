package typingsSlinky.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains checkbox information for the config. Its properties determine how the checkbox is
  * displayed in Data Studio.
  *
  *     var checkbox = config.newCheckbox()
  *       .setId("use_https")
  *       .setName("Use Https?")
  *       .setHelpText("Whether or not https should be used.")
  *       .setAllowOverride(true);
  */
@js.native
trait Checkbox extends js.Object {
  def setAllowOverride(allowOverride: Boolean): Checkbox = js.native
  def setHelpText(helpText: String): Checkbox = js.native
  def setId(id: String): Checkbox = js.native
  def setIsDynamic(isDynamic: Boolean): Checkbox = js.native
  def setName(name: String): Checkbox = js.native
}

object Checkbox {
  @scala.inline
  def apply(
    setAllowOverride: Boolean => Checkbox,
    setHelpText: String => Checkbox,
    setId: String => Checkbox,
    setIsDynamic: Boolean => Checkbox,
    setName: String => Checkbox
  ): Checkbox = {
    val __obj = js.Dynamic.literal(setAllowOverride = js.Any.fromFunction1(setAllowOverride), setHelpText = js.Any.fromFunction1(setHelpText), setId = js.Any.fromFunction1(setId), setIsDynamic = js.Any.fromFunction1(setIsDynamic), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[Checkbox]
  }
  @scala.inline
  implicit class CheckboxOps[Self <: Checkbox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetAllowOverride(value: Boolean => Checkbox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowOverride")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHelpText(value: String => Checkbox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHelpText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetId(value: String => Checkbox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIsDynamic(value: Boolean => Checkbox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIsDynamic")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetName(value: String => Checkbox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

