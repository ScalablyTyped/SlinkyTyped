package typingsSlinky.reactInstantsearchCore.anon

import typingsSlinky.reactInstantsearchCore.mod.RefinementValue
import typingsSlinky.reactInstantsearchCore.mod.SearchState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attribute extends js.Object {
  var attribute: String = js.native
  var id: String = js.native
  var index: String = js.native
  var label: String = js.native
  var value: RefinementValue = js.native
}

object Attribute {
  @scala.inline
  def apply(
    attribute: String,
    id: String,
    index: String,
    label: String,
    value: /* searchState */ SearchState => SearchState
  ): Attribute = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[Attribute]
  }
  @scala.inline
  implicit class AttributeOps[Self <: Attribute] (val x: Self) extends AnyVal {
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: /* searchState */ SearchState => SearchState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

