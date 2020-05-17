package typingsSlinky.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightPassedThru[TDoc] extends js.Object {
  var attribute: String = js.native
  var highlightProperty: js.UndefOr[String] = js.native
  var hit: Hit[TDoc] = js.native
}

object HighlightPassedThru {
  @scala.inline
  def apply[TDoc](attribute: String, hit: Hit[TDoc]): HighlightPassedThru[TDoc] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], hit = hit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightPassedThru[TDoc]]
  }
  @scala.inline
  implicit class HighlightPassedThruOps[Self[tdoc] <: HighlightPassedThru[tdoc], TDoc] (val x: Self[TDoc]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TDoc] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TDoc]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TDoc] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TDoc] with Other]
    @scala.inline
    def withAttribute(value: String): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHit(value: Hit[TDoc]): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightProperty(value: String): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightProperty: Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightProperty")(js.undefined)
        ret
    }
  }
  
}

