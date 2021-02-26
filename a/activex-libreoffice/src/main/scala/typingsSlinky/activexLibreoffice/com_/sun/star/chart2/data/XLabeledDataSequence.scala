package typingsSlinky.activexLibreoffice.com_.sun.star.chart2.data

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class XLabeledDataSequenceMutableBuilder[Self <: XLabeledDataSequence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetLabel(value: () => XDataSequence): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValues(value: () => XDataSequence): Self = StObject.set(x, "getValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLabel(value: XDataSequence): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetLabel(value: XDataSequence => Unit): Self = StObject.set(x, "setLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValues(value: XDataSequence => Unit): Self = StObject.set(x, "setValues", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValues(value: XDataSequence): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
  }
}
