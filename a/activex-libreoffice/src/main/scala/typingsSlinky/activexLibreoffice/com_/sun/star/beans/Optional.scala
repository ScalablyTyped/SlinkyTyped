package typingsSlinky.activexLibreoffice.com_.sun.star.beans

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An optional value of a given type.
  *
  * This structure is used as the type of interface attributes corresponding to instances of {@link com.sun.star.beans.Property} that have the {@link
  * com.sun.star.beans.PropertyAttribute.MAYBEVOID} . It might also be useful in other situations, for example as the return type of an interface method.
  */
@js.native
trait Optional[T] extends js.Object {
  /** Marks this structure instance as having an actual value. */
  var IsPresent: Boolean = js.native
  /**
    * The actual value of this structure instance.
    *
    * If no actual value is present, a producer of such a structure instance should leave this member defaulted, and a consumer of such a structure instance
    * should ignore the specific value stored in this member.
    */
  var Value: T = js.native
}

object Optional {
  @scala.inline
  def apply[T](IsPresent: Boolean, Value: T): Optional[T] = {
    val __obj = js.Dynamic.literal(IsPresent = IsPresent.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optional[T]]
  }
  @scala.inline
  implicit class OptionalOps[Self[t] <: Optional[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withIsPresent(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsPresent")(value.asInstanceOf[js.Any])
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

