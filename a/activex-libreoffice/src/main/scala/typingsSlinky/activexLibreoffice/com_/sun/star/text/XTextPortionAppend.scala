package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows inserting and appending formatted text portions. */
@js.native
trait XTextPortionAppend extends XInterface {
  /**
    * appends a new text portion to the paragraph at the end of the text. <p> The sequence can contain all the properties defined by the service
    * TextPortion.
    * @param Text contains the text to be appended.
    * @param CharacterAndParagraphProperties can contain all the properties defined by the service {@link Paragraph} .
    */
  def appendTextPortion(Text: String, CharacterAndParagraphProperties: PropertyValues): XTextRange = js.native
  /**
    * inserts a new text portion to the paragraph at a given position. <p> The sequence can contain all the properties defined by the service TextPortion.
    * @param Text contains the text to be inserted.
    * @param CharacterAndParagraphProperties can contain all the properties defined by the service {@link Paragraph} .
    * @param TextRange specifies the position of the insert.
    * @since LibreOffice 4.0
    */
  def insertTextPortion(Text: String, CharacterAndParagraphProperties: PropertyValues, TextRange: XTextRange): XTextRange = js.native
}

object XTextPortionAppend {
  @scala.inline
  def apply(
    acquire: () => Unit,
    appendTextPortion: (String, PropertyValues) => XTextRange,
    insertTextPortion: (String, PropertyValues, XTextRange) => XTextRange,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextPortionAppend = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), appendTextPortion = js.Any.fromFunction2(appendTextPortion), insertTextPortion = js.Any.fromFunction3(insertTextPortion), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextPortionAppend]
  }
  @scala.inline
  implicit class XTextPortionAppendOps[Self <: XTextPortionAppend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendTextPortion(value: (String, PropertyValues) => XTextRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTextPortion")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInsertTextPortion(value: (String, PropertyValues, XTextRange) => XTextRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTextPortion")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

