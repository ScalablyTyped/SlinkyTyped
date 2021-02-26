package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows to set date values as categories.
  *
  * Can be obtained from interface {@link XChartDocument} via method getData().
  * @since OOo 3.4
  */
@js.native
trait XDateCategories extends StObject {
  
  /**
    * retrieves the date values if the category x-axis id a date axis
    * @returns a sequence of doubles representing dates.
    */
  var DateCategories: SafeArray[Double] = js.native
  
  /**
    * retrieves the date values if the category x-axis id a date axis
    * @returns a sequence of doubles representing dates.
    */
  def getDateCategories(): SafeArray[Double] = js.native
  
  /**
    * sets dates as categories
    * @param rDates a sequence of sequences of doubles representing dates.
    */
  def setDateCategories(rDates: SeqEquiv[Double]): Unit = js.native
}
object XDateCategories {
  
  @scala.inline
  def apply(
    DateCategories: SafeArray[Double],
    getDateCategories: () => SafeArray[Double],
    setDateCategories: SeqEquiv[Double] => Unit
  ): XDateCategories = {
    val __obj = js.Dynamic.literal(DateCategories = DateCategories.asInstanceOf[js.Any], getDateCategories = js.Any.fromFunction0(getDateCategories), setDateCategories = js.Any.fromFunction1(setDateCategories))
    __obj.asInstanceOf[XDateCategories]
  }
  
  @scala.inline
  implicit class XDateCategoriesMutableBuilder[Self <: XDateCategories] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateCategories(value: SafeArray[Double]): Self = StObject.set(x, "DateCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDateCategories(value: () => SafeArray[Double]): Self = StObject.set(x, "getDateCategories", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDateCategories(value: SeqEquiv[Double] => Unit): Self = StObject.set(x, "setDateCategories", js.Any.fromFunction1(value))
  }
}
