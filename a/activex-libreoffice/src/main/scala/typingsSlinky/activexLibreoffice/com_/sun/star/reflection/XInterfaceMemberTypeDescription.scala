package typingsSlinky.activexLibreoffice.com_.sun.star.reflection

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.TypeClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base interface for reflected interface members.
  * @see XInterfaceAttributeTypeDescription
  * @see XInterfaceMethodTypeDescription
  */
@js.native
trait XInterfaceMemberTypeDescription extends XTypeDescription {
  /**
    * Returns name of member
    * @returns member name
    */
  val MemberName: String = js.native
  /**
    * Returns the position the member including all inherited members of base interfaces.
    * @returns position of member
    */
  val Position: Double = js.native
  /**
    * Returns name of member
    * @returns member name
    */
  def getMemberName(): String = js.native
  /**
    * Returns the position the member including all inherited members of base interfaces.
    * @returns position of member
    */
  def getPosition(): Double = js.native
}

object XInterfaceMemberTypeDescription {
  @scala.inline
  def apply(
    MemberName: String,
    Name: String,
    Position: Double,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getMemberName: () => String,
    getName: () => String,
    getPosition: () => Double,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XInterfaceMemberTypeDescription = {
    val __obj = js.Dynamic.literal(MemberName = MemberName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMemberName = js.Any.fromFunction0(getMemberName), getName = js.Any.fromFunction0(getName), getPosition = js.Any.fromFunction0(getPosition), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInterfaceMemberTypeDescription]
  }
  @scala.inline
  implicit class XInterfaceMemberTypeDescriptionOps[Self <: XInterfaceMemberTypeDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMemberName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMemberName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMemberName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPosition(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

