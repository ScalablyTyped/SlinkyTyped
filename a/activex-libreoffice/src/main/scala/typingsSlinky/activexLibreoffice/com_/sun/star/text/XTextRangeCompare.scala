package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * compares the positions of two {@link TextRanges} within a {@link Text} .
  *
  * Only {@link TextRange} instances within the same {@link Text} can be compared.
  */
@js.native
trait XTextRangeCompare extends XInterface {
  
  /**
    * @returns 1, if **xR1** ends before **xR2** , 0, if **xR1** ends at the same position as **xR2** and -1, if **xR1** ends behind **xR2** .
    * @throws com::sun::star::lang::IllegalArgumentException if either **xR1** or **xR2** is not within this text.
    */
  def compareRegionEnds(xR1: XTextRange, xR2: XTextRange): Double = js.native
  
  /**
    * @returns 1 if **xR1** starts before **xR2** , 0 if **xR1** starts at the same position as **xR2** and -1 if **xR1** starts behind **xR2** .
    * @throws com::sun::star::lang::IllegalArgumentException if either **xR1** or **xR2** is not within this text.
    */
  def compareRegionStarts(xR1: XTextRange, xR2: XTextRange): Double = js.native
}
object XTextRangeCompare {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    compareRegionEnds: (XTextRange, XTextRange) => Double,
    compareRegionStarts: (XTextRange, XTextRange) => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextRangeCompare = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), compareRegionEnds = js.Any.fromFunction2(compareRegionEnds), compareRegionStarts = js.Any.fromFunction2(compareRegionStarts), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextRangeCompare]
  }
  
  @scala.inline
  implicit class XTextRangeCompareMutableBuilder[Self <: XTextRangeCompare] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompareRegionEnds(value: (XTextRange, XTextRange) => Double): Self = StObject.set(x, "compareRegionEnds", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCompareRegionStarts(value: (XTextRange, XTextRange) => Double): Self = StObject.set(x, "compareRegionStarts", js.Any.fromFunction2(value))
  }
}
