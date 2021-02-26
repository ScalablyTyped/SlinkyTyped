package typingsSlinky.activexLibreoffice.com_.sun.star.chart2.data

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to sequences of data. With this interface data can only be read from.
  *
  * If the data stored consists only of floating point numbers (double values), the returned instances should also support the service
  * NumericalDataSequence.
  *
  * If the data stored consists only of strings, the returned instances should also support the service TextualDataSequence.
  */
@js.native
trait XDataSource extends XInterface {
  
  /**
    * returns data sequences.
    * @returns a sequence of objects that support at least the service {@link DataSequence} .  If the data stored consist only of floating point numbers (double
    */
  val DataSequences: SafeArray[XLabeledDataSequence] = js.native
  
  /**
    * returns data sequences.
    * @returns a sequence of objects that support at least the service {@link DataSequence} .  If the data stored consist only of floating point numbers (double
    */
  def getDataSequences(): SafeArray[XLabeledDataSequence] = js.native
}
object XDataSource {
  
  @scala.inline
  def apply(
    DataSequences: SafeArray[XLabeledDataSequence],
    acquire: () => Unit,
    getDataSequences: () => SafeArray[XLabeledDataSequence],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDataSource = {
    val __obj = js.Dynamic.literal(DataSequences = DataSequences.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDataSequences = js.Any.fromFunction0(getDataSequences), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataSource]
  }
  
  @scala.inline
  implicit class XDataSourceMutableBuilder[Self <: XDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSequences(value: SafeArray[XLabeledDataSequence]): Self = StObject.set(x, "DataSequences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDataSequences(value: () => SafeArray[XLabeledDataSequence]): Self = StObject.set(x, "getDataSequences", js.Any.fromFunction0(value))
  }
}
