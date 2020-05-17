package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XTitle extends XInterface {
  var Text: SafeArray[XFormattedString] = js.native
  def getText(): SafeArray[XFormattedString] = js.native
  def setText(Strings: SeqEquiv[XFormattedString]): Unit = js.native
}

object XTitle {
  @scala.inline
  def apply(
    Text: SafeArray[XFormattedString],
    acquire: () => Unit,
    getText: () => SafeArray[XFormattedString],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setText: SeqEquiv[XFormattedString] => Unit
  ): XTitle = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getText = js.Any.fromFunction0(getText), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[XTitle]
  }
  @scala.inline
  implicit class XTitleOps[Self <: XTitle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: SafeArray[XFormattedString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetText(value: () => SafeArray[XFormattedString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetText(value: SeqEquiv[XFormattedString] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

