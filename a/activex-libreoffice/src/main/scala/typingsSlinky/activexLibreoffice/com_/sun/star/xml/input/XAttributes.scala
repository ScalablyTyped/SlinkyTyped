package typingsSlinky.activexLibreoffice.com_.sun.star.xml.input

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An element's attributes */
@js.native
trait XAttributes extends XInterface {
  /**
    * Gets the number of attributes.
    * @returns number of attributes
    */
  val Length: Double = js.native
  /**
    * Gets attribute index passing a QName.
    * @param qName QName
    * @returns attribute index or -1, if not found
    */
  def getIndexByQName(qName: String): Double = js.native
  /**
    * Gets attribute index passing a namespace uid and a local name.
    * @param uid namespace uid
    * @param localName local name
    * @returns attribute index or -1, if not found
    */
  def getIndexByUidName(uid: Double, localName: String): Double = js.native
  /**
    * Gets the number of attributes.
    * @returns number of attributes
    */
  def getLength(): Double = js.native
  /**
    * Gets the local name of an attribute.
    * @param nIndex index
    * @returns local name of attribute or empty string, if invalid index
    */
  def getLocalNameByIndex(nIndex: Double): String = js.native
  /**
    * Gets the QName of an attribute.
    * @param nIndex index
    * @returns QName of attribute or empty string, if invalid index
    */
  def getQNameByIndex(nIndex: Double): String = js.native
  /**
    * Gets the type of an attribute, if possible.
    * @param nIndex index
    * @returns type of attribute (if possible, else empty string)
    */
  def getTypeByIndex(nIndex: Double): String = js.native
  /**
    * Gets the namespace uid of an attribute.
    * @param nIndex index
    * @returns namespace uid of attribute or -1, if invalid index
    */
  def getUidByIndex(nIndex: Double): Double = js.native
  /**
    * Gets the value of an attribute.
    * @param nIndex index
    * @returns value string or empty string, if invalid index
    */
  def getValueByIndex(nIndex: Double): String = js.native
  /**
    * For convenience: Gets the value of an attribute passing uid, local name.
    * @param uid namespace uid
    * @param localName local name
    * @returns value string or empty string, if invalid uid/local name
    */
  def getValueByUidName(uid: Double, localName: String): String = js.native
}

object XAttributes {
  @scala.inline
  def apply(
    Length: Double,
    acquire: () => Unit,
    getIndexByQName: String => Double,
    getIndexByUidName: (Double, String) => Double,
    getLength: () => Double,
    getLocalNameByIndex: Double => String,
    getQNameByIndex: Double => String,
    getTypeByIndex: Double => String,
    getUidByIndex: Double => Double,
    getValueByIndex: Double => String,
    getValueByUidName: (Double, String) => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAttributes = {
    val __obj = js.Dynamic.literal(Length = Length.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getIndexByQName = js.Any.fromFunction1(getIndexByQName), getIndexByUidName = js.Any.fromFunction2(getIndexByUidName), getLength = js.Any.fromFunction0(getLength), getLocalNameByIndex = js.Any.fromFunction1(getLocalNameByIndex), getQNameByIndex = js.Any.fromFunction1(getQNameByIndex), getTypeByIndex = js.Any.fromFunction1(getTypeByIndex), getUidByIndex = js.Any.fromFunction1(getUidByIndex), getValueByIndex = js.Any.fromFunction1(getValueByIndex), getValueByUidName = js.Any.fromFunction2(getValueByUidName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAttributes]
  }
  @scala.inline
  implicit class XAttributesOps[Self <: XAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetIndexByQName(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndexByQName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIndexByUidName(value: (Double, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndexByUidName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLocalNameByIndex(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocalNameByIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetQNameByIndex(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQNameByIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTypeByIndex(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTypeByIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetUidByIndex(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUidByIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetValueByIndex(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValueByIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetValueByUidName(value: (Double, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValueByUidName")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

