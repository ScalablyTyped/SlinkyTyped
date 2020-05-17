package typingsSlinky.activexLibreoffice.com_.sun.star.beans

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a set of properties.
  *
  * There are three kinds of properties: bound propertiesconstrained propertiesfree properties
  *
  * The specification only describes the properties, it does not contain any values.
  */
@js.native
trait XPropertySetInfo extends XInterface {
  /** @returns a sequence with all property descriptors which are specified within this {@link XPropertySetInfo} . */
  val Properties: SafeArray[Property] = js.native
  /** @returns a sequence with all property descriptors which are specified within this {@link XPropertySetInfo} . */
  def getProperties(): SafeArray[Property] = js.native
  /**
    * @param aName specifies the name of the property.
    * @returns the property with the specified name from the object.
    * @throws UnknownPropertyException if the property does not exist.
    */
  def getPropertyByName(aName: String): Property = js.native
  /**
    * @param Name specifies the name of the property.
    * @returns `TRUE` if a property with the specified name exist; otherwise `FALSE` is returned.
    */
  def hasPropertyByName(Name: String): Boolean = js.native
}

object XPropertySetInfo {
  @scala.inline
  def apply(
    Properties: SafeArray[Property],
    acquire: () => Unit,
    getProperties: () => SafeArray[Property],
    getPropertyByName: String => Property,
    hasPropertyByName: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPropertySetInfo = {
    val __obj = js.Dynamic.literal(Properties = Properties.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getProperties = js.Any.fromFunction0(getProperties), getPropertyByName = js.Any.fromFunction1(getPropertyByName), hasPropertyByName = js.Any.fromFunction1(hasPropertyByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPropertySetInfo]
  }
  @scala.inline
  implicit class XPropertySetInfoOps[Self <: XPropertySetInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProperties(value: SafeArray[Property]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetProperties(value: () => SafeArray[Property]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPropertyByName(value: String => Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPropertyByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasPropertyByName(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPropertyByName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

