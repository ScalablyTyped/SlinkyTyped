package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows converting between different measurement units
  * @since OOo 3.0
  */
@js.native
trait XUnitConversion extends XInterface {
  
  /**
    * converts the given {@link Point} , which is specified in pixels, into the given logical unit
    * @param Point A given {@link Point} in a well known type
    * @param TargetUnit A type from {@link com.sun.star.util.MeasureUnit} in which the {@link Point} will convert to.
    * @returns Returns a new {@link Point} in the TargetUnit type format.
    */
  def convertPointToLogic(Point: Point, TargetUnit: Double): Point = js.native
  
  /**
    * converts the given {@link Point} , which is specified in the given logical unit, into pixels
    * @param Point A given {@link Point} in the SourceUnit type
    * @param SourceUnit The type from {@link com.sun.star.util.MeasureUnit} of the {@link Point} .
    * @returns Return a new {@link Point} in Pixel type format.
    */
  def convertPointToPixel(Point: Point, SourceUnit: Double): Point = js.native
  
  /**
    * converts the given {@link Size} , which is specified in pixels, into the given logical unit
    * @param Size A given {@link Size} in a well known type
    * @param TargetUnit A type from {@link com.sun.star.util.MeasureUnit} in which the {@link Size} will convert to.
    * @returns Returns a new {@link Size} in the TargetUnit type format.
    */
  def convertSizeToLogic(Size: Size, TargetUnit: Double): Size = js.native
  
  /**
    * converts the given {@link Size} , which is specified in the given logical unit, into pixels
    * @param Size A given {@link Size} in a well known type
    * @param SourceUnit The type from {@link com.sun.star.util.MeasureUnit} of the {@link Size} .
    * @returns Returns a new {@link Size} in the TargetUnit type format.
    */
  def convertSizeToPixel(Size: Size, SourceUnit: Double): Size = js.native
}
object XUnitConversion {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    convertPointToLogic: (Point, Double) => Point,
    convertPointToPixel: (Point, Double) => Point,
    convertSizeToLogic: (Size, Double) => Size,
    convertSizeToPixel: (Size, Double) => Size,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUnitConversion = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), convertPointToLogic = js.Any.fromFunction2(convertPointToLogic), convertPointToPixel = js.Any.fromFunction2(convertPointToPixel), convertSizeToLogic = js.Any.fromFunction2(convertSizeToLogic), convertSizeToPixel = js.Any.fromFunction2(convertSizeToPixel), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XUnitConversion]
  }
  
  @scala.inline
  implicit class XUnitConversionMutableBuilder[Self <: XUnitConversion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvertPointToLogic(value: (Point, Double) => Point): Self = StObject.set(x, "convertPointToLogic", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConvertPointToPixel(value: (Point, Double) => Point): Self = StObject.set(x, "convertPointToPixel", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConvertSizeToLogic(value: (Size, Double) => Size): Self = StObject.set(x, "convertSizeToLogic", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConvertSizeToPixel(value: (Size, Double) => Size): Self = StObject.set(x, "convertSizeToPixel", js.Any.fromFunction2(value))
  }
}
