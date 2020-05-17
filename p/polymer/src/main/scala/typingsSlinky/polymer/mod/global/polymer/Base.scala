package typingsSlinky.polymer.mod.global.polymer

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base
  extends CommonBase
     with /** Need to allow all properties for callback methods. */
/* prop */ StringDictionary[js.Any] {
  // Has to live on Base because it is incompatible with
  // HTMLElement#toggleAttribute
  var toggleAttribute: js.UndefOr[
    js.Function3[
      /* name */ String, 
      /* bool */ js.UndefOr[Boolean], 
      /* node */ js.UndefOr[HTMLElement], 
      Unit
    ]
  ] = js.native
}

object Base {
  @scala.inline
  def apply(is: String): Base = {
    val __obj = js.Dynamic.literal(is = is.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
  @scala.inline
  implicit class BaseOps[Self <: Base] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToggleAttribute(
      value: (/* name */ String, /* bool */ js.UndefOr[Boolean], /* node */ js.UndefOr[HTMLElement]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleAttribute")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutToggleAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleAttribute")(js.undefined)
        ret
    }
  }
  
}

