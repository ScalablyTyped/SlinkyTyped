package typingsSlinky.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the configuration entries for a connector. These configuration entries define what
  * questions are asked when adding a new connector.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var config = cc.getConfig();
  *
  *     var info_entry = config.newInfo()
  *       .setId("info_id")
  *       .setHelpText("This connector can connect to multiple data endpoints.");
  */
@js.native
trait Config extends js.Object {
  def build(): Config = js.native
  def newCheckbox(): Checkbox = js.native
  def newInfo(): Info = js.native
  def newOptionBuilder(): OptionBuilder = js.native
  def newSelectMultiple(): SelectMultiple = js.native
  def newSelectSingle(): SelectSingle = js.native
  def newTextArea(): TextArea = js.native
  def newTextInput(): TextInput = js.native
  def printJson(): String = js.native
  def setDateRangeRequired(dateRangeRequired: Boolean): Config = js.native
  def setIsSteppedConfig(isSteppedConfig: Boolean): Config = js.native
}

object Config {
  @scala.inline
  def apply(
    build: () => Config,
    newCheckbox: () => Checkbox,
    newInfo: () => Info,
    newOptionBuilder: () => OptionBuilder,
    newSelectMultiple: () => SelectMultiple,
    newSelectSingle: () => SelectSingle,
    newTextArea: () => TextArea,
    newTextInput: () => TextInput,
    printJson: () => String,
    setDateRangeRequired: Boolean => Config,
    setIsSteppedConfig: Boolean => Config
  ): Config = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), newCheckbox = js.Any.fromFunction0(newCheckbox), newInfo = js.Any.fromFunction0(newInfo), newOptionBuilder = js.Any.fromFunction0(newOptionBuilder), newSelectMultiple = js.Any.fromFunction0(newSelectMultiple), newSelectSingle = js.Any.fromFunction0(newSelectSingle), newTextArea = js.Any.fromFunction0(newTextArea), newTextInput = js.Any.fromFunction0(newTextInput), printJson = js.Any.fromFunction0(printJson), setDateRangeRequired = js.Any.fromFunction1(setDateRangeRequired), setIsSteppedConfig = js.Any.fromFunction1(setIsSteppedConfig))
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: () => Config): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCheckbox(value: () => Checkbox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCheckbox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInfo(value: () => Info): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOptionBuilder(value: () => OptionBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOptionBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSelectMultiple(value: () => SelectMultiple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSelectMultiple")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSelectSingle(value: () => SelectSingle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSelectSingle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTextArea(value: () => TextArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTextArea")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTextInput(value: () => TextInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTextInput")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrintJson(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printJson")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDateRangeRequired(value: Boolean => Config): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDateRangeRequired")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIsSteppedConfig(value: Boolean => Config): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIsSteppedConfig")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

