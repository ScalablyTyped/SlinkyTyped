package typingsSlinky.activexLibreoffice.com_.sun.star.reflection

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Base interface for XIdlField2s and XIdlMethods. */
@js.native
trait XIdlMember extends XInterface {
  /**
    * Returns the declaring type of this field, i.e. the type having the member declared (interface, enum, struct, exception).
    * @returns declaring type
    */
  val DeclaringClass: XIdlClass[_] = js.native
  /**
    * Returns the fully-qualified name of the member.
    * @returns fully-qualified name of the member
    */
  val Name: String = js.native
  /**
    * Returns the declaring type of this field, i.e. the type having the member declared (interface, enum, struct, exception).
    * @returns declaring type
    */
  def getDeclaringClass(): XIdlClass[_] = js.native
  /**
    * Returns the fully-qualified name of the member.
    * @returns fully-qualified name of the member
    */
  def getName(): String = js.native
}

object XIdlMember {
  @scala.inline
  def apply(
    DeclaringClass: XIdlClass[_],
    Name: String,
    acquire: () => Unit,
    getDeclaringClass: () => XIdlClass[_],
    getName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XIdlMember = {
    val __obj = js.Dynamic.literal(DeclaringClass = DeclaringClass.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDeclaringClass = js.Any.fromFunction0(getDeclaringClass), getName = js.Any.fromFunction0(getName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XIdlMember]
  }
  @scala.inline
  implicit class XIdlMemberOps[Self <: XIdlMember] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeclaringClass(value: XIdlClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclaringClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDeclaringClass(value: () => XIdlClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeclaringClass")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

