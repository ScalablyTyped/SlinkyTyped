package typingsSlinky.googleAppsScript.GoogleAppsScript.Forms

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A question item, presented as a grid of columns and rows, that allows the respondent to select
  * multiple choices per row from a sequence of checkboxes. Items can be accessed or created from a
  * Form.
  *
  *     // Open a form by ID and add a new checkgox grid item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addCheckboxGridItem();
  *     item.setTitle('Where did you celebrate New Years?')
  *       .setRows(['New York', 'San Francisco', 'London'])
  *       .setColumns(['2014', '2015', '2016', '2017']);
  */
@js.native
trait CheckboxGridItem extends js.Object {
  def clearValidation(): CheckboxGridItem = js.native
  def createResponse(responses: js.Array[js.Array[String]]): ItemResponse = js.native
  def duplicate(): CheckboxGridItem = js.native
  def getColumns(): js.Array[String] = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getRows(): js.Array[String] = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def isRequired(): Boolean = js.native
  def setColumns(columns: js.Array[String]): CheckboxGridItem = js.native
  def setHelpText(text: String): CheckboxGridItem = js.native
  def setRequired(enabled: Boolean): CheckboxGridItem = js.native
  def setRows(rows: js.Array[String]): CheckboxGridItem = js.native
  def setTitle(title: String): CheckboxGridItem = js.native
  def setValidation(validation: CheckboxGridValidation): CheckboxGridItem = js.native
}

object CheckboxGridItem {
  @scala.inline
  def apply(
    clearValidation: () => CheckboxGridItem,
    createResponse: js.Array[js.Array[String]] => ItemResponse,
    duplicate: () => CheckboxGridItem,
    getColumns: () => js.Array[String],
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getRows: () => js.Array[String],
    getTitle: () => String,
    getType: () => ItemType,
    isRequired: () => Boolean,
    setColumns: js.Array[String] => CheckboxGridItem,
    setHelpText: String => CheckboxGridItem,
    setRequired: Boolean => CheckboxGridItem,
    setRows: js.Array[String] => CheckboxGridItem,
    setTitle: String => CheckboxGridItem,
    setValidation: CheckboxGridValidation => CheckboxGridItem
  ): CheckboxGridItem = {
    val __obj = js.Dynamic.literal(clearValidation = js.Any.fromFunction0(clearValidation), createResponse = js.Any.fromFunction1(createResponse), duplicate = js.Any.fromFunction0(duplicate), getColumns = js.Any.fromFunction0(getColumns), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getRows = js.Any.fromFunction0(getRows), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), isRequired = js.Any.fromFunction0(isRequired), setColumns = js.Any.fromFunction1(setColumns), setHelpText = js.Any.fromFunction1(setHelpText), setRequired = js.Any.fromFunction1(setRequired), setRows = js.Any.fromFunction1(setRows), setTitle = js.Any.fromFunction1(setTitle), setValidation = js.Any.fromFunction1(setValidation))
    __obj.asInstanceOf[CheckboxGridItem]
  }
  @scala.inline
  implicit class CheckboxGridItemOps[Self <: CheckboxGridItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearValidation(value: () => CheckboxGridItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearValidation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateResponse(value: js.Array[js.Array[String]] => ItemResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createResponse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDuplicate(value: () => CheckboxGridItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetColumns(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumns")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHelpText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHelpText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIndex(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRows(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTitle(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => ItemType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsRequired(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequired")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetColumns(value: js.Array[String] => CheckboxGridItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColumns")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHelpText(value: String => CheckboxGridItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHelpText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRequired(value: Boolean => CheckboxGridItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRequired")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRows(value: js.Array[String] => CheckboxGridItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRows")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTitle(value: String => CheckboxGridItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValidation(value: CheckboxGridValidation => CheckboxGridItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValidation")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

