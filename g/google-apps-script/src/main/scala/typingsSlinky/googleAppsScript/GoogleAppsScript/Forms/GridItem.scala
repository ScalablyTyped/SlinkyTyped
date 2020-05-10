package typingsSlinky.googleAppsScript.GoogleAppsScript.Forms

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A question item, presented as a grid of columns and rows, that allows the respondent to select
  * one choice per row from a sequence of radio buttons. Items can be accessed or created from a
  * Form.
  *
  *     // Open a form by ID and add a new grid item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addGridItem();
  *     item.setTitle('Rate your interests')
  *         .setRows(['Cars', 'Computers', 'Celebrities'])
  *         .setColumns(['Boring', 'So-so', 'Interesting']);
  */
@js.native
trait GridItem extends js.Object {
  def clearValidation(): GridItem = js.native
  def createResponse(responses: js.Array[String]): ItemResponse = js.native
  def duplicate(): GridItem = js.native
  def getColumns(): js.Array[String] = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getRows(): js.Array[String] = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def isRequired(): Boolean = js.native
  def setColumns(columns: js.Array[String]): GridItem = js.native
  def setHelpText(text: String): GridItem = js.native
  def setRequired(enabled: Boolean): GridItem = js.native
  def setRows(rows: js.Array[String]): GridItem = js.native
  def setTitle(title: String): GridItem = js.native
  def setValidation(validation: GridValidation): GridItem = js.native
}

object GridItem {
  @scala.inline
  def apply(
    clearValidation: () => GridItem,
    createResponse: js.Array[String] => ItemResponse,
    duplicate: () => GridItem,
    getColumns: () => js.Array[String],
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getRows: () => js.Array[String],
    getTitle: () => String,
    getType: () => ItemType,
    isRequired: () => Boolean,
    setColumns: js.Array[String] => GridItem,
    setHelpText: String => GridItem,
    setRequired: Boolean => GridItem,
    setRows: js.Array[String] => GridItem,
    setTitle: String => GridItem,
    setValidation: GridValidation => GridItem
  ): GridItem = {
    val __obj = js.Dynamic.literal(clearValidation = js.Any.fromFunction0(clearValidation), createResponse = js.Any.fromFunction1(createResponse), duplicate = js.Any.fromFunction0(duplicate), getColumns = js.Any.fromFunction0(getColumns), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getRows = js.Any.fromFunction0(getRows), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), isRequired = js.Any.fromFunction0(isRequired), setColumns = js.Any.fromFunction1(setColumns), setHelpText = js.Any.fromFunction1(setHelpText), setRequired = js.Any.fromFunction1(setRequired), setRows = js.Any.fromFunction1(setRows), setTitle = js.Any.fromFunction1(setTitle), setValidation = js.Any.fromFunction1(setValidation))
    __obj.asInstanceOf[GridItem]
  }
  @scala.inline
  implicit class GridItemOps[Self <: GridItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearValidation(value: () => GridItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearValidation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateResponse(value: js.Array[String] => ItemResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createResponse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDuplicate(value: () => GridItem): Self = {
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
    def withSetColumns(value: js.Array[String] => GridItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColumns")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHelpText(value: String => GridItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHelpText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRequired(value: Boolean => GridItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRequired")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRows(value: js.Array[String] => GridItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRows")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTitle(value: String => GridItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValidation(value: GridValidation => GridItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValidation")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

