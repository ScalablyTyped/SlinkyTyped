package typingsSlinky.activexLibreoffice.com_.sun.star.reflection

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.TypeClass
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a UNOIDL entity.
  * @see XPublished
  * @see XIndirectTypeDescription
  * @see XEnumTypeDescription
  * @see XStructTypeDescription
  * @see XCompoundTypeDescription
  * @see XInterfaceTypeDescription2
  * @see XInterfaceAttributeTypeDescription2
  * @see XInterfaceMethodTypeDescription
  * @see XConstantTypeDescription
  * @see XConstantsTypeDescription
  * @see XServiceTypeDescription2
  * @see XPropertyTypeDescription2
  * @see XSingletonTypeDescription2
  */
@js.native
trait XTypeDescription extends XInterface {
  /**
    * Returns the fully qualified name of the UNOIDL entity.
    * @returns fully qualified name of the entity
    */
  val Name: String = js.native
  /**
    * Returns the type class of the reflected UNOIDL entity.
    * @returns type class of the entity
    */
  val TypeClass: typingsSlinky.activexLibreoffice.com_.sun.star.uno.TypeClass = js.native
  /**
    * Returns the fully qualified name of the UNOIDL entity.
    * @returns fully qualified name of the entity
    */
  def getName(): String = js.native
  /**
    * Returns the type class of the reflected UNOIDL entity.
    * @returns type class of the entity
    */
  def getTypeClass(): typingsSlinky.activexLibreoffice.com_.sun.star.uno.TypeClass = js.native
}

object XTypeDescription {
  @scala.inline
  def apply(
    Name: String,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getName: () => String,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTypeDescription = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getName = js.Any.fromFunction0(getName), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTypeDescription]
  }
  @scala.inline
  implicit class XTypeDescriptionOps[Self <: XTypeDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeClass(value: TypeClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTypeClass(value: () => TypeClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTypeClass")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

