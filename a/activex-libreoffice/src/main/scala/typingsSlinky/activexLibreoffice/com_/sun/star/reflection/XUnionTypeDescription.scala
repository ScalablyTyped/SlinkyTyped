package typingsSlinky.activexLibreoffice.com_.sun.star.reflection

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.TypeClass
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated, UNOIDL does not have a union concept.
  * @deprecated Deprecated
  */
@js.native
trait XUnionTypeDescription extends XTypeDescription {
  /**
    * Returns the default discriminant value.
    * @returns default discriminant value
    */
  val DefaultDiscriminant: js.Any = js.native
  /**
    * Returns the type of the default value.
    * @returns type of the default value
    */
  val DefaultMemberType: XTypeDescription = js.native
  /**
    * Returns the (ordinal) discriminant type.
    * @returns type of the discriminant
    */
  val DiscriminantType: XTypeDescription = js.native
  /**
    * Returns discriminants of all members in order of IDL declaration.
    * @returns discriminants of all members
    */
  val Discriminants: SafeArray[_] = js.native
  /**
    * Returns names of all members in order of IDL declaration.
    * @returns names of all members
    */
  val MemberNames: SafeArray[String] = js.native
  /**
    * Returns types of all members in order of IDL declaration.
    * @returns types of all members
    */
  val MemberTypes: SafeArray[XTypeDescription] = js.native
  /**
    * Returns the default discriminant value.
    * @returns default discriminant value
    */
  def getDefaultDiscriminant(): js.Any = js.native
  /**
    * Returns the type of the default value.
    * @returns type of the default value
    */
  def getDefaultMemberType(): XTypeDescription = js.native
  /**
    * Returns the (ordinal) discriminant type.
    * @returns type of the discriminant
    */
  def getDiscriminantType(): XTypeDescription = js.native
  /**
    * Returns discriminants of all members in order of IDL declaration.
    * @returns discriminants of all members
    */
  def getDiscriminants(): SafeArray[_] = js.native
  /**
    * Returns names of all members in order of IDL declaration.
    * @returns names of all members
    */
  def getMemberNames(): SafeArray[String] = js.native
  /**
    * Returns types of all members in order of IDL declaration.
    * @returns types of all members
    */
  def getMemberTypes(): SafeArray[XTypeDescription] = js.native
}

object XUnionTypeDescription {
  @scala.inline
  def apply(
    DefaultDiscriminant: js.Any,
    DefaultMemberType: XTypeDescription,
    DiscriminantType: XTypeDescription,
    Discriminants: SafeArray[_],
    MemberNames: SafeArray[String],
    MemberTypes: SafeArray[XTypeDescription],
    Name: String,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getDefaultDiscriminant: () => js.Any,
    getDefaultMemberType: () => XTypeDescription,
    getDiscriminantType: () => XTypeDescription,
    getDiscriminants: () => SafeArray[_],
    getMemberNames: () => SafeArray[String],
    getMemberTypes: () => SafeArray[XTypeDescription],
    getName: () => String,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUnionTypeDescription = {
    val __obj = js.Dynamic.literal(DefaultDiscriminant = DefaultDiscriminant.asInstanceOf[js.Any], DefaultMemberType = DefaultMemberType.asInstanceOf[js.Any], DiscriminantType = DiscriminantType.asInstanceOf[js.Any], Discriminants = Discriminants.asInstanceOf[js.Any], MemberNames = MemberNames.asInstanceOf[js.Any], MemberTypes = MemberTypes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDefaultDiscriminant = js.Any.fromFunction0(getDefaultDiscriminant), getDefaultMemberType = js.Any.fromFunction0(getDefaultMemberType), getDiscriminantType = js.Any.fromFunction0(getDiscriminantType), getDiscriminants = js.Any.fromFunction0(getDiscriminants), getMemberNames = js.Any.fromFunction0(getMemberNames), getMemberTypes = js.Any.fromFunction0(getMemberTypes), getName = js.Any.fromFunction0(getName), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XUnionTypeDescription]
  }
  @scala.inline
  implicit class XUnionTypeDescriptionOps[Self <: XUnionTypeDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultDiscriminant(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultDiscriminant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultMemberType(value: XTypeDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultMemberType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscriminantType(value: XTypeDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiscriminantType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscriminants(value: SafeArray[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Discriminants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemberNames(value: SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemberTypes(value: SafeArray[XTypeDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDefaultDiscriminant(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultDiscriminant")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDefaultMemberType(value: () => XTypeDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultMemberType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDiscriminantType(value: () => XTypeDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDiscriminantType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDiscriminants(value: () => SafeArray[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDiscriminants")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMemberNames(value: () => SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMemberNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMemberTypes(value: () => SafeArray[XTypeDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMemberTypes")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

