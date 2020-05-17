package typingsSlinky.activexLibreoffice.com_.sun.star.chart2.data

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows access to a one-dimensional sequence of data.
  *
  * The data that is stored in this container may contain different types.
  */
@js.native
trait XLabeledDataSequence extends XInterface {
  /** returns an {@link XDataSequence} containing the label for the labeled sequence. */
  var Label: XDataSequence = js.native
  /** returns an {@link XDataSequence} containing the actual data. */
  var Values: XDataSequence = js.native
  /** returns an {@link XDataSequence} containing the label for the labeled sequence. */
  def getLabel(): XDataSequence = js.native
  /** returns an {@link XDataSequence} containing the actual data. */
  def getValues(): XDataSequence = js.native
  /** sets a new {@link XDataSequence} containing the label for the labeled sequence. */
  def setLabel(xSequence: XDataSequence): Unit = js.native
  /** sets a new {@link XDataSequence} containing the actual data. */
  def setValues(xSequence: XDataSequence): Unit = js.native
}

object XLabeledDataSequence {
  @scala.inline
  def apply(
    Label: XDataSequence,
    Values: XDataSequence,
    acquire: () => Unit,
    getLabel: () => XDataSequence,
    getValues: () => XDataSequence,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setLabel: XDataSequence => Unit,
    setValues: XDataSequence => Unit
  ): XLabeledDataSequence = {
    val __obj = js.Dynamic.literal(Label = Label.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLabel = js.Any.fromFunction0(getLabel), getValues = js.Any.fromFunction0(getValues), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLabel = js.Any.fromFunction1(setLabel), setValues = js.Any.fromFunction1(setValues))
    __obj.asInstanceOf[XLabeledDataSequence]
  }
  @scala.inline
  implicit class XLabeledDataSequenceOps[Self <: XLabeledDataSequence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: XDataSequence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: XDataSequence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLabel(value: () => XDataSequence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValues(value: () => XDataSequence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValues")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetLabel(value: XDataSequence => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValues(value: XDataSequence => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValues")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

