package typingsSlinky.activexLibreoffice.com_.sun.star.accessibility

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implement this interface to give access to the attributes of a text.
  * @since OOo 2.0.4
  */
@js.native
trait XAccessibleTextAttributes extends js.Object {
  /**
    * Get the default attribute set for the text.
    *
    * Returns a set of all default paragraph and default character attributes that are associated for the text. To prevent the method from returning
    * possibly large sets of attributes that the caller is not interested in the caller can provide a list of attributes that they want to be returned.
    * @param RequestedAttributes This string sequence defines the set of attributes that the caller is interested in. When there are requested attributes that
    * @returns Returns the requested attributes of the text. Each attribute is represented by a {@link com.sun.star.beans.PropertyValue} object.
    */
  def getDefaultAttributes(RequestedAttributes: SeqEquiv[String]): SafeArray[PropertyValue] = js.native
  /**
    * Get the run attribute set for the specified position.
    *
    * Returns a set of character attributes that are associated for the character at the given index and are directly set or are set via a character style.
    * To prevent the method from returning all of these attributes the caller can provide a list of attributes that they want to be returned.
    * @param Index The index of the character for which to return its attributes. The valid range is 0..length of text-1.
    * @param RequestedAttributes This string sequence defines the set of attributes that the caller is interested in. When there are requested attributes that
    * @returns Returns the requested attributes of the specified character. Each attribute is represented by a {@link com.sun.star.beans.PropertyValue} object.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the index is invalid
    */
  def getRunAttributes(Index: Double, RequestedAttributes: SeqEquiv[String]): SafeArray[PropertyValue] = js.native
}

object XAccessibleTextAttributes {
  @scala.inline
  def apply(
    getDefaultAttributes: SeqEquiv[String] => SafeArray[PropertyValue],
    getRunAttributes: (Double, SeqEquiv[String]) => SafeArray[PropertyValue]
  ): XAccessibleTextAttributes = {
    val __obj = js.Dynamic.literal(getDefaultAttributes = js.Any.fromFunction1(getDefaultAttributes), getRunAttributes = js.Any.fromFunction2(getRunAttributes))
    __obj.asInstanceOf[XAccessibleTextAttributes]
  }
  @scala.inline
  implicit class XAccessibleTextAttributesOps[Self <: XAccessibleTextAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDefaultAttributes(value: SeqEquiv[String] => SafeArray[PropertyValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultAttributes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRunAttributes(value: (Double, SeqEquiv[String]) => SafeArray[PropertyValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRunAttributes")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

