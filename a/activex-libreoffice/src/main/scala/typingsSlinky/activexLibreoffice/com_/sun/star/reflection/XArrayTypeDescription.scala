package typingsSlinky.activexLibreoffice.com_.sun.star.reflection

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.TypeClass
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated, UNOIDL does not have an array concept.
  * @deprecated Deprecated
  */
@js.native
trait XArrayTypeDescription extends XTypeDescription {
  /**
    * Returns dimensions of array (same length as {@link getNumberOfDimensions()} ).
    * @returns dimensions of array
    */
  val Dimensions: SafeArray[Double] = js.native
  /**
    * Returns the number of dimensions of the array.
    * @returns dimension of the array
    */
  val NumberOfDimensions: Double = js.native
  /**
    * Returns the element type of the array.
    * @returns element type of the array
    */
  val Type: XTypeDescription = js.native
  /**
    * Returns dimensions of array (same length as {@link getNumberOfDimensions()} ).
    * @returns dimensions of array
    */
  def getDimensions(): SafeArray[Double] = js.native
  /**
    * Returns the number of dimensions of the array.
    * @returns dimension of the array
    */
  def getNumberOfDimensions(): Double = js.native
  /**
    * Returns the element type of the array.
    * @returns element type of the array
    */
  def getType(): XTypeDescription = js.native
}

object XArrayTypeDescription {
  @scala.inline
  def apply(
    Dimensions: SafeArray[Double],
    Name: String,
    NumberOfDimensions: Double,
    Type: XTypeDescription,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getDimensions: () => SafeArray[Double],
    getName: () => String,
    getNumberOfDimensions: () => Double,
    getType: () => XTypeDescription,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XArrayTypeDescription = {
    val __obj = js.Dynamic.literal(Dimensions = Dimensions.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberOfDimensions = NumberOfDimensions.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDimensions = js.Any.fromFunction0(getDimensions), getName = js.Any.fromFunction0(getName), getNumberOfDimensions = js.Any.fromFunction0(getNumberOfDimensions), getType = js.Any.fromFunction0(getType), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XArrayTypeDescription]
  }
  @scala.inline
  implicit class XArrayTypeDescriptionOps[Self <: XArrayTypeDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensions(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfDimensions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: XTypeDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDimensions(value: () => SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDimensions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNumberOfDimensions(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumberOfDimensions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => XTypeDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

