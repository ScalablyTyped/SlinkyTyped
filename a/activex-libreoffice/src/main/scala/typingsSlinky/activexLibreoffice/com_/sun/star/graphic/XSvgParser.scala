package typingsSlinky.activexLibreoffice.com_.sun.star.graphic

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link XSvgParser} interface
  *
  * This interface allows to parse a SVG stream in form of a sequence of bytes to be parsed into a sequence of XPrimitive2Ds
  */
@js.native
trait XSvgParser extends XInterface {
  
  /**
    * Retrieve decomposed list of simpler primitives
    * @param xSvgStream The file containing the SVG XML data
    * @param aAbsolutePath The path containing the SVG XML data
    */
  def getDecomposition(xSvgStream: XInputStream, aAbsolutePath: String): SafeArray[XPrimitive2D] = js.native
}
object XSvgParser {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getDecomposition: (XInputStream, String) => SafeArray[XPrimitive2D],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSvgParser = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDecomposition = js.Any.fromFunction2(getDecomposition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSvgParser]
  }
  
  @scala.inline
  implicit class XSvgParserMutableBuilder[Self <: XSvgParser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDecomposition(value: (XInputStream, String) => SafeArray[XPrimitive2D]): Self = StObject.set(x, "getDecomposition", js.Any.fromFunction2(value))
  }
}
