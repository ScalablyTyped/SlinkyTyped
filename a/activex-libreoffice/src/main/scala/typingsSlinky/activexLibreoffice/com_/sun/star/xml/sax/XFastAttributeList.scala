package typingsSlinky.activexLibreoffice.com_.sun.star.xml.sax

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.Attribute
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.FastAttribute
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a container for the attributes of an XML element.
  *
  * ;  Attributes are separated into known attributes and unknown attributes.
  *
  * Known attributes have a local name that is known to the {@link XFastTokenHandler} registered at the {@link XFastParser} which created the sax event
  * containing this attributes. If an attribute also has a namespace, that must be registered at the {@link XFastParser} , else this attribute is also
  * unknown even if the local name is known.
  */
@js.native
trait XFastAttributeList extends XInterface {
  /** returns a sequence of attributes which names and or namespaces URLS are translated to tokens. */
  val FastAttributes: SafeArray[FastAttribute] = js.native
  /** returns a sequence of attributes which names and or namespaces URLS can not be translated to tokens. */
  val UnknownAttributes: SafeArray[Attribute] = js.native
  /** returns a sequence of attributes which names and or namespaces URLS are translated to tokens. */
  def getFastAttributes(): SafeArray[FastAttribute] = js.native
  /**
    * retrieves the value of an attribute. ;
    * @param Token contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} . ;  If the attribute name has a namesp
    * @returns The string value from the attribute or an empty string if the attribute is not available.
    */
  def getOptionalValue(Token: Double): String = js.native
  /**
    * retrieves the token of an attribute value. ;
    * @param Token contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} . ;  If the attribute name has a namesp
    * @param Default This value will be returned if the attribute is not available
    * @returns If the attribute is available it returns the integer token of the value from the attribute or FastToken::Invalid. If not the value of `Default` i
    */
  def getOptionalValueToken(Token: Double, Default: Double): Double = js.native
  /** returns a sequence of attributes which names and or namespaces URLS can not be translated to tokens. */
  def getUnknownAttributes(): SafeArray[Attribute] = js.native
  /**
    * retrieves the value of an attribute. ;
    * @param Token contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} . ;  If the attribute name has a namesp
    * @returns The string value from the attribute.
    * @throws SAXEXception if the attribute is not available
    */
  def getValue(Token: Double): String = js.native
  /**
    * retrieves the token of an attribute value. ;
    * @param Token contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} . ;  If the attribute name has a namesp
    * @returns The integer token of the value from the attribute or FastToken::Invalid
    * @throws SAXEXception if the attribute is not available
    */
  def getValueToken(Token: Double): Double = js.native
  /**
    * checks if an attribute is available. ;
    * @param Token contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} . ;  If the attribute name has a namesp
    * @returns `TRUE` , if the attribute is available
    */
  def hasAttribute(Token: Double): Boolean = js.native
}

object XFastAttributeList {
  @scala.inline
  def apply(
    FastAttributes: SafeArray[FastAttribute],
    UnknownAttributes: SafeArray[Attribute],
    acquire: () => Unit,
    getFastAttributes: () => SafeArray[FastAttribute],
    getOptionalValue: Double => String,
    getOptionalValueToken: (Double, Double) => Double,
    getUnknownAttributes: () => SafeArray[Attribute],
    getValue: Double => String,
    getValueToken: Double => Double,
    hasAttribute: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFastAttributeList = {
    val __obj = js.Dynamic.literal(FastAttributes = FastAttributes.asInstanceOf[js.Any], UnknownAttributes = UnknownAttributes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFastAttributes = js.Any.fromFunction0(getFastAttributes), getOptionalValue = js.Any.fromFunction1(getOptionalValue), getOptionalValueToken = js.Any.fromFunction2(getOptionalValueToken), getUnknownAttributes = js.Any.fromFunction0(getUnknownAttributes), getValue = js.Any.fromFunction1(getValue), getValueToken = js.Any.fromFunction1(getValueToken), hasAttribute = js.Any.fromFunction1(hasAttribute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFastAttributeList]
  }
  @scala.inline
  implicit class XFastAttributeListOps[Self <: XFastAttributeList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFastAttributes(value: SafeArray[FastAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FastAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknownAttributes(value: SafeArray[Attribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnknownAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFastAttributes(value: () => SafeArray[FastAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFastAttributes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOptionalValue(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptionalValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOptionalValueToken(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptionalValueToken")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetUnknownAttributes(value: () => SafeArray[Attribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUnknownAttributes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetValueToken(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValueToken")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasAttribute(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttribute")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

