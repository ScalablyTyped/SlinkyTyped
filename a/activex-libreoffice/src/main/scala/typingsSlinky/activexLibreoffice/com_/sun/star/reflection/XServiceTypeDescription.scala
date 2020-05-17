package typingsSlinky.activexLibreoffice.com_.sun.star.reflection

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.TypeClass
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a service.
  *
  * This type is superseded by {@link XServiceTypeDescription2} , which supports single-interface  -  based services, in addition to the obsolete,
  * accumulation-based services.
  *
  * The type class of this type is com::sun::star::uno::TypeClass::SERVICE.
  * @since OOo 1.1.2
  */
@js.native
trait XServiceTypeDescription extends XTypeDescription {
  /**
    * Returns the type descriptions of the mandatory interfaces defined for this service.
    * @returns a sequence containing interface type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empt
    */
  val MandatoryInterfaces: SafeArray[XInterfaceTypeDescription] = js.native
  /**
    * Returns the type descriptions of the mandatory services defined for this service.
    * @returns a sequence containing service type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty
    */
  val MandatoryServices: SafeArray[XServiceTypeDescription] = js.native
  /**
    * Returns the type descriptions of the optional interface defined for this service.
    * @returns a sequence containing interface type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empt
    */
  val OptionalInterfaces: SafeArray[XInterfaceTypeDescription] = js.native
  /**
    * Returns the type descriptions of the optional services defined for this service.
    * @returns a sequence containing service type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty
    */
  val OptionalServices: SafeArray[XServiceTypeDescription] = js.native
  /**
    * Returns the properties defined for this service.
    * @returns a sequence containing property descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty sequ
    */
  val Properties: SafeArray[XPropertyTypeDescription] = js.native
  /**
    * Returns the type descriptions of the mandatory interfaces defined for this service.
    * @returns a sequence containing interface type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empt
    */
  def getMandatoryInterfaces(): SafeArray[XInterfaceTypeDescription] = js.native
  /**
    * Returns the type descriptions of the mandatory services defined for this service.
    * @returns a sequence containing service type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty
    */
  def getMandatoryServices(): SafeArray[XServiceTypeDescription] = js.native
  /**
    * Returns the type descriptions of the optional interface defined for this service.
    * @returns a sequence containing interface type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empt
    */
  def getOptionalInterfaces(): SafeArray[XInterfaceTypeDescription] = js.native
  /**
    * Returns the type descriptions of the optional services defined for this service.
    * @returns a sequence containing service type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty
    */
  def getOptionalServices(): SafeArray[XServiceTypeDescription] = js.native
  /**
    * Returns the properties defined for this service.
    * @returns a sequence containing property descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty sequ
    */
  def getProperties(): SafeArray[XPropertyTypeDescription] = js.native
}

object XServiceTypeDescription {
  @scala.inline
  def apply(
    MandatoryInterfaces: SafeArray[XInterfaceTypeDescription],
    MandatoryServices: SafeArray[XServiceTypeDescription],
    Name: String,
    OptionalInterfaces: SafeArray[XInterfaceTypeDescription],
    OptionalServices: SafeArray[XServiceTypeDescription],
    Properties: SafeArray[XPropertyTypeDescription],
    TypeClass: TypeClass,
    acquire: () => Unit,
    getMandatoryInterfaces: () => SafeArray[XInterfaceTypeDescription],
    getMandatoryServices: () => SafeArray[XServiceTypeDescription],
    getName: () => String,
    getOptionalInterfaces: () => SafeArray[XInterfaceTypeDescription],
    getOptionalServices: () => SafeArray[XServiceTypeDescription],
    getProperties: () => SafeArray[XPropertyTypeDescription],
    getTypeClass: () => TypeClass,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XServiceTypeDescription = {
    val __obj = js.Dynamic.literal(MandatoryInterfaces = MandatoryInterfaces.asInstanceOf[js.Any], MandatoryServices = MandatoryServices.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OptionalInterfaces = OptionalInterfaces.asInstanceOf[js.Any], OptionalServices = OptionalServices.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMandatoryInterfaces = js.Any.fromFunction0(getMandatoryInterfaces), getMandatoryServices = js.Any.fromFunction0(getMandatoryServices), getName = js.Any.fromFunction0(getName), getOptionalInterfaces = js.Any.fromFunction0(getOptionalInterfaces), getOptionalServices = js.Any.fromFunction0(getOptionalServices), getProperties = js.Any.fromFunction0(getProperties), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XServiceTypeDescription]
  }
  @scala.inline
  implicit class XServiceTypeDescriptionOps[Self <: XServiceTypeDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMandatoryInterfaces(value: SafeArray[XInterfaceTypeDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MandatoryInterfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMandatoryServices(value: SafeArray[XServiceTypeDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MandatoryServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionalInterfaces(value: SafeArray[XInterfaceTypeDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionalInterfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionalServices(value: SafeArray[XServiceTypeDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionalServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: SafeArray[XPropertyTypeDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMandatoryInterfaces(value: () => SafeArray[XInterfaceTypeDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMandatoryInterfaces")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMandatoryServices(value: () => SafeArray[XServiceTypeDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMandatoryServices")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOptionalInterfaces(value: () => SafeArray[XInterfaceTypeDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptionalInterfaces")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOptionalServices(value: () => SafeArray[XServiceTypeDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptionalServices")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetProperties(value: () => SafeArray[XPropertyTypeDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProperties")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

