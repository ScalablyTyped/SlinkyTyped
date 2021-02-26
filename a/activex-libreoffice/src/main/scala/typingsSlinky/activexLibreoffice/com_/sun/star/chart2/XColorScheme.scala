package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XColorScheme extends XInterface {
  
  /**
    * returns the default color for the nth data series.
    *
    * This may be a system wide color or a color coming from a color scheme.
    *
    * Usually there exist a fixed number of default colors. This method should always return a valid Color. If the index (i) is higher than the number of
    * default colors (n), the method should return the modulus (i mod n), i.e., the colors should repeat in a cyclic way.
    * @param nIndex The index of the series. This is used to obtain the correct default color.
    */
  def getColorByIndex(nIndex: Double): Color = js.native
}
object XColorScheme {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getColorByIndex: Double => Color,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XColorScheme = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getColorByIndex = js.Any.fromFunction1(getColorByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XColorScheme]
  }
  
  @scala.inline
  implicit class XColorSchemeMutableBuilder[Self <: XColorScheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetColorByIndex(value: Double => Color): Self = StObject.set(x, "getColorByIndex", js.Any.fromFunction1(value))
  }
}
