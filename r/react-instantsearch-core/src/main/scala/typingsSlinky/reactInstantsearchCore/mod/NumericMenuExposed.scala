package typingsSlinky.reactInstantsearchCore.mod

import typingsSlinky.reactInstantsearchCore.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumericMenuExposed extends js.Object {
  /** the name of the attribute in the records */
  var attribute: String = js.native
  /** the value of the item selected by default, follow the shape of a string with a pattern of '{start}:{end}'. */
  var defaultRefinement: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  /** List of options. With a text label, and upper and lower bounds. */
  var items: js.Array[End] = js.native
  /** (...args: any[]) => any to modify the items being displayed, e.g. for filtering or sorting them. Takes an items as parameter and expects it back in return. */
  var transformItems: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}

object NumericMenuExposed {
  @scala.inline
  def apply(attribute: String, items: js.Array[End]): NumericMenuExposed = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericMenuExposed]
  }
  @scala.inline
  implicit class NumericMenuExposedOps[Self <: NumericMenuExposed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[End]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultRefinement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRefinement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRefinement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRefinement")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformItems(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransformItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformItems")(js.undefined)
        ret
    }
  }
  
}

