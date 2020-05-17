package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the method to convert different units of measurement.
  */
@js.native
trait RichEditUnitConverter extends js.Object {
  /**
    * Converts a value in centimeters to twips. An integer value representing the value in twips.
    * @param value A floating value specifying the value in centimeters to convert.
    */
  def centimetersToTwips(value: Double): Double = js.native
  /**
    * Converts a measurement from inches to twips. The result twips value, as an integer.
    * @param value The inches value (floating) to be converted.
    */
  def inchesToTwips(value: Double): Double = js.native
  /**
    * Converts a measurement from pixels to centimeters. The result centimeters value.
    * @param value The pixels value to be converted.
    */
  def pixelsToCentimeters(value: Double): Double = js.native
  /**
    * Converts a measurement from pixels to inches. The result inches value.
    * @param value The pixels value to be converted.
    */
  def pixelsToInches(value: Double): Double = js.native
  /**
    * Converts a measurement from pixels to points. The result points value.
    * @param value The pixels value to be converted.
    */
  def pixelsToPoints(value: Double): Double = js.native
  /**
    * Converts a measurement from pixels to twips. The result twips value.
    * @param value The pixels value to be converted.
    */
  def pixelsToTwips(value: Double): Double = js.native
  /**
    * Converts a measurement from points to twips. The result twips value.
    * @param value The points value to be converted.
    */
  def pointsToTwips(value: Double): Double = js.native
  /**
    * Converts a measurement from twips to centimeters. The result centimeters value.
    * @param value The twips value to be converted.
    */
  def twipsToCentimeters(value: Double): Double = js.native
  /**
    * Converts a measurement from twips to inches. The result inches value.
    * @param value The twips value to be converted.
    */
  def twipsToInches(value: Double): Double = js.native
  /**
    * Converts a measurement from twips to points. The result points value.
    * @param value The twips value to be converted.
    */
  def twipsToPoints(value: Double): Double = js.native
}

object RichEditUnitConverter {
  @scala.inline
  def apply(
    centimetersToTwips: Double => Double,
    inchesToTwips: Double => Double,
    pixelsToCentimeters: Double => Double,
    pixelsToInches: Double => Double,
    pixelsToPoints: Double => Double,
    pixelsToTwips: Double => Double,
    pointsToTwips: Double => Double,
    twipsToCentimeters: Double => Double,
    twipsToInches: Double => Double,
    twipsToPoints: Double => Double
  ): RichEditUnitConverter = {
    val __obj = js.Dynamic.literal(centimetersToTwips = js.Any.fromFunction1(centimetersToTwips), inchesToTwips = js.Any.fromFunction1(inchesToTwips), pixelsToCentimeters = js.Any.fromFunction1(pixelsToCentimeters), pixelsToInches = js.Any.fromFunction1(pixelsToInches), pixelsToPoints = js.Any.fromFunction1(pixelsToPoints), pixelsToTwips = js.Any.fromFunction1(pixelsToTwips), pointsToTwips = js.Any.fromFunction1(pointsToTwips), twipsToCentimeters = js.Any.fromFunction1(twipsToCentimeters), twipsToInches = js.Any.fromFunction1(twipsToInches), twipsToPoints = js.Any.fromFunction1(twipsToPoints))
    __obj.asInstanceOf[RichEditUnitConverter]
  }
  @scala.inline
  implicit class RichEditUnitConverterOps[Self <: RichEditUnitConverter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCentimetersToTwips(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centimetersToTwips")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInchesToTwips(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inchesToTwips")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPixelsToCentimeters(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelsToCentimeters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPixelsToInches(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelsToInches")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPixelsToPoints(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelsToPoints")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPixelsToTwips(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelsToTwips")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPointsToTwips(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointsToTwips")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTwipsToCentimeters(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twipsToCentimeters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTwipsToInches(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twipsToInches")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTwipsToPoints(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twipsToPoints")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

