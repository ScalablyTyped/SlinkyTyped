package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorScale extends XConditionEntry {
  
  var ColorScaleEntries: SafeArray[XColorScaleEntry] = js.native
}
object ColorScale {
  
  @scala.inline
  def apply(
    ColorScaleEntries: SafeArray[XColorScaleEntry],
    Type: Double,
    acquire: () => Unit,
    getType: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): ColorScale = {
    val __obj = js.Dynamic.literal(ColorScaleEntries = ColorScaleEntries.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[ColorScale]
  }
  
  @scala.inline
  implicit class ColorScaleMutableBuilder[Self <: ColorScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorScaleEntries(value: SafeArray[XColorScaleEntry]): Self = StObject.set(x, "ColorScaleEntries", value.asInstanceOf[js.Any])
  }
}
