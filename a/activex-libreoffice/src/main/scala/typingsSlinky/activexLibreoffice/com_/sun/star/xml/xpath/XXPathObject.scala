package typingsSlinky.activexLibreoffice.com_.sun.star.xml.xpath

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom.XNodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XXPathObject extends XInterface {
  /** get value of a boolean object */
  val Boolean: scala.Boolean = js.native
  /** get number as byte */
  val Byte: scala.Double = js.native
  /** get number as double */
  val Double: scala.Double = js.native
  /** get number as float */
  val Float: scala.Double = js.native
  /** get number as hyper */
  val Hyper: scala.Double = js.native
  /** get number as long */
  val Long: scala.Double = js.native
  /** get the nodes from a node list type object */
  val NodeList: XNodeList = js.native
  /** get object type */
  val ObjectType: XPathObjectType = js.native
  /** get number as short */
  val Short: scala.Double = js.native
  /** get string value */
  val String: java.lang.String = js.native
  /** get value of a boolean object */
  def getBoolean(): scala.Boolean = js.native
  /** get number as byte */
  def getByte(): scala.Double = js.native
  /** get number as double */
  def getDouble(): scala.Double = js.native
  /** get number as float */
  def getFloat(): scala.Double = js.native
  /** get number as hyper */
  def getHyper(): scala.Double = js.native
  /** get number as long */
  def getLong(): scala.Double = js.native
  /** get the nodes from a node list type object */
  def getNodeList(): XNodeList = js.native
  /** get object type */
  def getObjectType(): XPathObjectType = js.native
  /** get number as short */
  def getShort(): scala.Double = js.native
  /** get string value */
  def getString(): java.lang.String = js.native
}

object XXPathObject {
  @scala.inline
  def apply(
    Boolean: Boolean,
    Byte: Double,
    Double: Double,
    Float: Double,
    Hyper: Double,
    Long: Double,
    NodeList: XNodeList,
    ObjectType: XPathObjectType,
    Short: Double,
    String: String,
    acquire: () => Unit,
    getBoolean: () => Boolean,
    getByte: () => Double,
    getDouble: () => Double,
    getFloat: () => Double,
    getHyper: () => Double,
    getLong: () => Double,
    getNodeList: () => XNodeList,
    getObjectType: () => XPathObjectType,
    getShort: () => Double,
    getString: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XXPathObject = {
    val __obj = js.Dynamic.literal(Boolean = Boolean.asInstanceOf[js.Any], Byte = Byte.asInstanceOf[js.Any], Double = Double.asInstanceOf[js.Any], Float = Float.asInstanceOf[js.Any], Hyper = Hyper.asInstanceOf[js.Any], Long = Long.asInstanceOf[js.Any], NodeList = NodeList.asInstanceOf[js.Any], ObjectType = ObjectType.asInstanceOf[js.Any], Short = Short.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getBoolean = js.Any.fromFunction0(getBoolean), getByte = js.Any.fromFunction0(getByte), getDouble = js.Any.fromFunction0(getDouble), getFloat = js.Any.fromFunction0(getFloat), getHyper = js.Any.fromFunction0(getHyper), getLong = js.Any.fromFunction0(getLong), getNodeList = js.Any.fromFunction0(getNodeList), getObjectType = js.Any.fromFunction0(getObjectType), getShort = js.Any.fromFunction0(getShort), getString = js.Any.fromFunction0(getString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XXPathObject]
  }
  @scala.inline
  implicit class XXPathObjectOps[Self <: XXPathObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoolean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByte(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Byte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDouble(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Double")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Float")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyper(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hyper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLong(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Long")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeList(value: XNodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectType(value: XPathObjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("String")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBoolean(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBoolean")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetByte(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getByte")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDouble(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDouble")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFloat(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFloat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHyper(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHyper")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLong(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLong")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNodeList(value: () => XNodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetObjectType(value: () => XPathObjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getObjectType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetShort(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getString")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

