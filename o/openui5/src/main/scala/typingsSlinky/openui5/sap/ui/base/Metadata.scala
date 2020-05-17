package typingsSlinky.openui5.sap.ui.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metadata extends js.Object {
  /**
    * Returns an array with the names of all public methods declared by the described classand its
    * ancestors.
    * @returns array with names of all public methods provided by the described class and its ancestors
    */
  def getAllPublicMethods(): js.Array[String] = js.native
  /**
    * Returns the fully qualified name of the described class
    * @returns name of the described class
    */
  def getName(): String = js.native
  /**
    * Returns the metadata object of the base class of the described classor null if the class has no
    * (documented) base class.
    * @returns metadata of the base class
    */
  def getParent(): Metadata = js.native
  /**
    * Returns an array with the names of the public methods declared by the described class.
    * @returns array with names of public methods declared by the described class
    */
  def getPublicMethods(): js.Array[String] = js.native
  /**
    * Returns whether the described class is abstract
    * @returns whether the class is abstract
    */
  def isAbstract(): Boolean = js.native
  /**
    * Whether the described class is deprecated and should not be used any more
    * @since 1.26.4
    * @returns whether the class is considered deprecated
    */
  def isDeprecated(): Boolean = js.native
  /**
    * Returns whether the described class is final
    * @returns whether the class is final
    */
  def isFinal(): Boolean = js.native
  /**
    * Checks whether the described class or one of its ancestor classes implements the given interface.
    * @param sInterface name of the interface to test for (in dot notation)
    * @returns whether this class implements the interface
    */
  def isInstanceOf(sInterface: String): Boolean = js.native
}

object Metadata {
  @scala.inline
  def apply(
    getAllPublicMethods: () => js.Array[String],
    getName: () => String,
    getParent: () => Metadata,
    getPublicMethods: () => js.Array[String],
    isAbstract: () => Boolean,
    isDeprecated: () => Boolean,
    isFinal: () => Boolean,
    isInstanceOf: String => Boolean
  ): Metadata = {
    val __obj = js.Dynamic.literal(getAllPublicMethods = js.Any.fromFunction0(getAllPublicMethods), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getPublicMethods = js.Any.fromFunction0(getPublicMethods), isAbstract = js.Any.fromFunction0(isAbstract), isDeprecated = js.Any.fromFunction0(isDeprecated), isFinal = js.Any.fromFunction0(isFinal), isInstanceOf = js.Any.fromFunction1(isInstanceOf))
    __obj.asInstanceOf[Metadata]
  }
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAllPublicMethods(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllPublicMethods")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParent(value: () => Metadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPublicMethods(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPublicMethods")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsAbstract(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAbstract")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsDeprecated(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeprecated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFinal(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFinal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInstanceOf(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInstanceOf")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

