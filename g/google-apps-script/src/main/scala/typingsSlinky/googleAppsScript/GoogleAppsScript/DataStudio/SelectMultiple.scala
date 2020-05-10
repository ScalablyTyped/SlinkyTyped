package typingsSlinky.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains select multiple information for the config. Its properties determine how the select
  * multiple is displayed in Data Studio.
  *
  * Usage:
  *
  *     var option1 = config.newOptionBuilder()
  *       .setLabel("option label")
  *       .setValue("option_value");
  *
  *     var option2 = config.newOptionBuilder()
  *       .setLabel("second option label")
  *       .setValue("option_value_2");
  *
  *     var info1 = config.newSelectMultiple()
  *       .setId("api_endpoint")
  *       .setName("Data Type")
  *       .setHelpText("Select the data type you're interested in.")
  *       .setAllowOverride(true)
  *       .addOption(option1)
  *       .addOption(option2);
  */
@js.native
trait SelectMultiple extends js.Object {
  def addOption(optionBuilder: OptionBuilder): SelectMultiple = js.native
  def setAllowOverride(allowOverride: Boolean): SelectMultiple = js.native
  def setHelpText(helpText: String): SelectMultiple = js.native
  def setId(id: String): SelectMultiple = js.native
  def setIsDynamic(isDynamic: Boolean): SelectMultiple = js.native
  def setName(name: String): SelectMultiple = js.native
}

object SelectMultiple {
  @scala.inline
  def apply(
    addOption: OptionBuilder => SelectMultiple,
    setAllowOverride: Boolean => SelectMultiple,
    setHelpText: String => SelectMultiple,
    setId: String => SelectMultiple,
    setIsDynamic: Boolean => SelectMultiple,
    setName: String => SelectMultiple
  ): SelectMultiple = {
    val __obj = js.Dynamic.literal(addOption = js.Any.fromFunction1(addOption), setAllowOverride = js.Any.fromFunction1(setAllowOverride), setHelpText = js.Any.fromFunction1(setHelpText), setId = js.Any.fromFunction1(setId), setIsDynamic = js.Any.fromFunction1(setIsDynamic), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[SelectMultiple]
  }
  @scala.inline
  implicit class SelectMultipleOps[Self <: SelectMultiple] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddOption(value: OptionBuilder => SelectMultiple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOption")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAllowOverride(value: Boolean => SelectMultiple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowOverride")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHelpText(value: String => SelectMultiple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHelpText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetId(value: String => SelectMultiple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIsDynamic(value: Boolean => SelectMultiple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIsDynamic")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetName(value: String => SelectMultiple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

