package typingsSlinky.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This structure describes a single change that is part of a batch of changes. */
@js.native
trait ElementChange extends js.Object {
  /**
    * This contains the accessor to the element which changed.
    *
    * The type and the value of the accessor depends on the service.
    */
  var Accessor: js.Any = js.native
  /** This contains the element that was inserted or changed. */
  var Element: js.Any = js.native
  /** This contains the element that was replaced or removed. */
  var ReplacedElement: js.Any = js.native
}

object ElementChange {
  @scala.inline
  def apply(Accessor: js.Any, Element: js.Any, ReplacedElement: js.Any): ElementChange = {
    val __obj = js.Dynamic.literal(Accessor = Accessor.asInstanceOf[js.Any], Element = Element.asInstanceOf[js.Any], ReplacedElement = ReplacedElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementChange]
  }
  @scala.inline
  implicit class ElementChangeOps[Self <: ElementChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplacedElement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplacedElement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

