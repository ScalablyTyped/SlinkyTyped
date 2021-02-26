package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XColorScaleEntry extends StObject {
  
  var Color: typingsSlinky.activexLibreoffice.com_.sun.star.util.Color = js.native
  
  var Formula: String = js.native
  
  /** See {@link com.sun.star.sheet.ColorScaleEntryType} for possible values */
  var Type: Double = js.native
  
  def getColor(): Color = js.native
  
  def getFormula(): String = js.native
  
  /** See {@link com.sun.star.sheet.ColorScaleEntryType} for possible values */
  def getType(): Double = js.native
  
  def setColor(Color: Color): Unit = js.native
  
  def setFormula(Formula: String): Unit = js.native
  
  /** See {@link com.sun.star.sheet.ColorScaleEntryType} for possible values */
  def setType(Type: Double): Unit = js.native
}
object XColorScaleEntry {
  
  @scala.inline
  def apply(
    Color: Color,
    Formula: String,
    Type: Double,
    getColor: () => Color,
    getFormula: () => String,
    getType: () => Double,
    setColor: Color => Unit,
    setFormula: String => Unit,
    setType: Double => Unit
  ): XColorScaleEntry = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], getColor = js.Any.fromFunction0(getColor), getFormula = js.Any.fromFunction0(getFormula), getType = js.Any.fromFunction0(getType), setColor = js.Any.fromFunction1(setColor), setFormula = js.Any.fromFunction1(setFormula), setType = js.Any.fromFunction1(setType))
    __obj.asInstanceOf[XColorScaleEntry]
  }
  
  @scala.inline
  implicit class XColorScaleEntryMutableBuilder[Self <: XColorScaleEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormula(value: String): Self = StObject.set(x, "Formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetColor(value: () => Color): Self = StObject.set(x, "getColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFormula(value: () => String): Self = StObject.set(x, "getFormula", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => Double): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetColor(value: Color => Unit): Self = StObject.set(x, "setColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFormula(value: String => Unit): Self = StObject.set(x, "setFormula", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetType(value: Double => Unit): Self = StObject.set(x, "setType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
