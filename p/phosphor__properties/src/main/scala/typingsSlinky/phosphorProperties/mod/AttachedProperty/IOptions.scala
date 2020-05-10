package typingsSlinky.phosphorProperties.mod.AttachedProperty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options object used to initialize an attached property.
  */
@js.native
trait IOptions[T, U] extends js.Object {
  /**
    * A function called when the property value has changed.
    *
    * #### Notes
    * This will be invoked when the property value is changed and the
    * comparator indicates that the old value is not equal to the new
    * value.
    *
    * This will **not** be called for the initial default value.
    */
  var changed: js.UndefOr[js.Function3[/* owner */ T, /* oldValue */ U, /* newValue */ U, Unit]] = js.native
  /**
    * A function used to coerce a supplied value into the final value.
    *
    * #### Notes
    * This will be called whenever the property value is changed, or
    * when the property is explicitly coerced. The return value will
    * be used as the final value of the property.
    *
    * This will **not** be called for the initial default value.
    */
  var coerce: js.UndefOr[js.Function2[/* owner */ T, /* value */ U, U]] = js.native
  /**
    * A function used to compare two values for equality.
    *
    * #### Notes
    * This is called to determine if the property value has changed.
    * It should return `true` if the given values are equivalent, or
    * `false` if they are different.
    *
    * If this is not provided, it defaults to the `===` operator.
    */
  var compare: js.UndefOr[js.Function2[/* oldValue */ U, /* newValue */ U, Boolean]] = js.native
  /**
    * The human readable name for the property.
    *
    * #### Notes
    * By convention, this should be the same as the name used to define
    * the public accessor for the property value.
    *
    * This **does not** have an effect on the property lookup behavior.
    * Multiple properties may share the same name without conflict.
    */
  var name: String = js.native
  /**
    * A factory function used to create the default property value.
    *
    * #### Notes
    * This will be called whenever the property value is required,
    * but has not yet been set for a given owner.
    */
  def create(owner: T): U = js.native
}

object IOptions {
  @scala.inline
  def apply[T, U](create: T => U, name: String): IOptions[T, U] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T, U]]
  }
  @scala.inline
  implicit class IOptionsOps[Self[t, u] <: IOptions[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U]) with Other]
    @scala.inline
    def withCreate(value: T => U): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChanged(value: (/* owner */ T, /* oldValue */ U, /* newValue */ U) => Unit): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changed")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutChanged: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changed")(js.undefined)
        ret
    }
    @scala.inline
    def withCoerce(value: (/* owner */ T, /* value */ U) => U): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerce")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCoerce: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerce")(js.undefined)
        ret
    }
    @scala.inline
    def withCompare(value: (/* oldValue */ U, /* newValue */ U) => Boolean): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCompare: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(js.undefined)
        ret
    }
  }
  
}

