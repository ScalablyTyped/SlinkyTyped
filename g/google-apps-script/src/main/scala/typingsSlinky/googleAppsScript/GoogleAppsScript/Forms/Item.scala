package typingsSlinky.googleAppsScript.GoogleAppsScript.Forms

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A generic form item that contains properties common to all items, such as title and help text.
  * Items can be accessed or created from a Form.
  *
  * To operate on type-specific properties, use getType() to check the item's ItemType, then cast the item to the
  * appropriate class using a method like asCheckboxItem().
  *
  *     // Create a new form and add a text item.
  *     var form = FormApp.create('Form Name');
  *     form.addTextItem();
  *
  *     // Access the text item as a generic item.
  *     var items = form.getItems();
  *     var item = items[0];
  *
  *     // Cast the generic item to the text-item class.
  *     if (item.getType() == 'TEXT') {
  *       var textItem = item.asTextItem();
  *       textItem.setRequired(false);
  *     }
  *
  * Implementing classes
  *
  * NameBrief description
  */
@js.native
trait Item extends js.Object {
  def asCheckboxGridItem(): CheckboxGridItem = js.native
  def asCheckboxItem(): CheckboxItem = js.native
  def asDateItem(): DateItem = js.native
  def asDateTimeItem(): DateTimeItem = js.native
  def asDurationItem(): DurationItem = js.native
  def asGridItem(): GridItem = js.native
  def asImageItem(): ImageItem = js.native
  def asListItem(): ListItem = js.native
  def asMultipleChoiceItem(): MultipleChoiceItem = js.native
  def asPageBreakItem(): PageBreakItem = js.native
  def asParagraphTextItem(): ParagraphTextItem = js.native
  def asScaleItem(): ScaleItem = js.native
  def asSectionHeaderItem(): SectionHeaderItem = js.native
  def asTextItem(): TextItem = js.native
  def asTimeItem(): TimeItem = js.native
  def asVideoItem(): VideoItem = js.native
  def duplicate(): Item = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def setHelpText(text: String): Item = js.native
  def setTitle(title: String): Item = js.native
}

object Item {
  @scala.inline
  def apply(
    asCheckboxGridItem: () => CheckboxGridItem,
    asCheckboxItem: () => CheckboxItem,
    asDateItem: () => DateItem,
    asDateTimeItem: () => DateTimeItem,
    asDurationItem: () => DurationItem,
    asGridItem: () => GridItem,
    asImageItem: () => ImageItem,
    asListItem: () => ListItem,
    asMultipleChoiceItem: () => MultipleChoiceItem,
    asPageBreakItem: () => PageBreakItem,
    asParagraphTextItem: () => ParagraphTextItem,
    asScaleItem: () => ScaleItem,
    asSectionHeaderItem: () => SectionHeaderItem,
    asTextItem: () => TextItem,
    asTimeItem: () => TimeItem,
    asVideoItem: () => VideoItem,
    duplicate: () => Item,
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getTitle: () => String,
    getType: () => ItemType,
    setHelpText: String => Item,
    setTitle: String => Item
  ): Item = {
    val __obj = js.Dynamic.literal(asCheckboxGridItem = js.Any.fromFunction0(asCheckboxGridItem), asCheckboxItem = js.Any.fromFunction0(asCheckboxItem), asDateItem = js.Any.fromFunction0(asDateItem), asDateTimeItem = js.Any.fromFunction0(asDateTimeItem), asDurationItem = js.Any.fromFunction0(asDurationItem), asGridItem = js.Any.fromFunction0(asGridItem), asImageItem = js.Any.fromFunction0(asImageItem), asListItem = js.Any.fromFunction0(asListItem), asMultipleChoiceItem = js.Any.fromFunction0(asMultipleChoiceItem), asPageBreakItem = js.Any.fromFunction0(asPageBreakItem), asParagraphTextItem = js.Any.fromFunction0(asParagraphTextItem), asScaleItem = js.Any.fromFunction0(asScaleItem), asSectionHeaderItem = js.Any.fromFunction0(asSectionHeaderItem), asTextItem = js.Any.fromFunction0(asTextItem), asTimeItem = js.Any.fromFunction0(asTimeItem), asVideoItem = js.Any.fromFunction0(asVideoItem), duplicate = js.Any.fromFunction0(duplicate), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), setHelpText = js.Any.fromFunction1(setHelpText), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[Item]
  }
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsCheckboxGridItem(value: () => CheckboxGridItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asCheckboxGridItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsCheckboxItem(value: () => CheckboxItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asCheckboxItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsDateItem(value: () => DateItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asDateItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsDateTimeItem(value: () => DateTimeItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asDateTimeItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsDurationItem(value: () => DurationItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asDurationItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsGridItem(value: () => GridItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asGridItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsImageItem(value: () => ImageItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asImageItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsListItem(value: () => ListItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asListItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsMultipleChoiceItem(value: () => MultipleChoiceItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asMultipleChoiceItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsPageBreakItem(value: () => PageBreakItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asPageBreakItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsParagraphTextItem(value: () => ParagraphTextItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asParagraphTextItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsScaleItem(value: () => ScaleItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asScaleItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsSectionHeaderItem(value: () => SectionHeaderItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asSectionHeaderItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsTextItem(value: () => TextItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asTextItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsTimeItem(value: () => TimeItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asTimeItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsVideoItem(value: () => VideoItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asVideoItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDuplicate(value: () => Item): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicate")(js.Any.fromFunction0(value))
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
    def withSetHelpText(value: String => Item): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHelpText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTitle(value: String => Item): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

