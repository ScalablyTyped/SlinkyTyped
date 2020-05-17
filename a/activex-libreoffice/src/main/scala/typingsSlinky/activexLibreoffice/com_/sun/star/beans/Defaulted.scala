package typingsSlinky.activexLibreoffice.com_.sun.star.beans

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A value of a given type that can be defaulted.
  *
  * This structure is used as the type of interface attributes corresponding to instances of {@link com.sun.star.beans.Property} that have the {@link
  * com.sun.star.beans.PropertyAttribute.MAYBEDEFAULT} .
  */
@js.native
trait Defaulted[T] extends js.Object {
  /** Marks this structure instance as defaulted. */
  var IsDefaulted: Boolean = js.native
  /**
    * The underlying value of this structure instance.
    *
    * Even if this structure instance is defaulted, this member should contain a useful value. If there is no useful value for a defaulted structure
    * instance, com::sun::star::beans::Optional can be used as the type of this member.
    */
  var Value: T = js.native
}

object Defaulted {
  @scala.inline
  def apply[T](IsDefaulted: Boolean, Value: T): Defaulted[T] = {
    val __obj = js.Dynamic.literal(IsDefaulted = IsDefaulted.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Defaulted[T]]
  }
  @scala.inline
  implicit class DefaultedOps[Self[t] <: Defaulted[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withIsDefaulted(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDefaulted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

