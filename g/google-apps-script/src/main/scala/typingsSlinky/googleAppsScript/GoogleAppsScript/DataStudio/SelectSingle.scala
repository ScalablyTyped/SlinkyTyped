package typingsSlinky.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains select single information for the config. Its properties determine how the select single
  * is displayed in Data Studio.
  *
  *     var option1 = config.newOptionBuilder()
  *       .setLabel("option label")
  *       .setValue("option_value");
  *
  *     var option2 = config.newOptionBuilder()
  *       .setLabel("second option label")
  *       .setValue("option_value_2");
  *
  *     var info1 = config.newSelectSingle()
  *       .setId("api_endpoint")
  *       .setName("Data Type")
  *       .setHelpText("Select the data type you're interested in.")
  *       .setAllowOverride(true)
  *       .addOption(option1)
  *       .addOption(option2);
  */
@js.native
trait SelectSingle extends js.Object {
  def addOption(optionBuilder: OptionBuilder): SelectSingle = js.native
  def setAllowOverride(allowOverride: Boolean): SelectSingle = js.native
  def setHelpText(helpText: String): SelectSingle = js.native
  def setId(id: String): SelectSingle = js.native
  def setIsDynamic(isDynamic: Boolean): SelectSingle = js.native
  def setName(name: String): SelectSingle = js.native
}

object SelectSingle {
  @scala.inline
  def apply(
    addOption: OptionBuilder => SelectSingle,
    setAllowOverride: Boolean => SelectSingle,
    setHelpText: String => SelectSingle,
    setId: String => SelectSingle,
    setIsDynamic: Boolean => SelectSingle,
    setName: String => SelectSingle
  ): SelectSingle = {
    val __obj = js.Dynamic.literal(addOption = js.Any.fromFunction1(addOption), setAllowOverride = js.Any.fromFunction1(setAllowOverride), setHelpText = js.Any.fromFunction1(setHelpText), setId = js.Any.fromFunction1(setId), setIsDynamic = js.Any.fromFunction1(setIsDynamic), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[SelectSingle]
  }
  @scala.inline
  implicit class SelectSingleOps[Self <: SelectSingle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddOption(value: OptionBuilder => SelectSingle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOption")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAllowOverride(value: Boolean => SelectSingle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowOverride")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHelpText(value: String => SelectSingle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHelpText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetId(value: String => SelectSingle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIsDynamic(value: Boolean => SelectSingle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIsDynamic")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetName(value: String => SelectSingle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

