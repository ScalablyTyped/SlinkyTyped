package typingsSlinky.reactInstantsearchCore.anon

import typingsSlinky.reactInstantsearchCore.mod.Hit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightProperty[TDoc] extends js.Object {
  var attribute: String = js.native
  var highlightProperty: String = js.native
  var hit: Hit[TDoc] = js.native
  var postTag: js.UndefOr[String] = js.native
  var preTag: js.UndefOr[String] = js.native
}

object HighlightProperty {
  @scala.inline
  def apply[TDoc](attribute: String, highlightProperty: String, hit: Hit[TDoc]): HighlightProperty[TDoc] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], highlightProperty = highlightProperty.asInstanceOf[js.Any], hit = hit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightProperty[TDoc]]
  }
  @scala.inline
  implicit class HighlightPropertyOps[Self[tdoc] <: HighlightProperty[tdoc], TDoc] (val x: Self[TDoc]) extends AnyVal {
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
    def withHighlightProperty(value: String): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHit(value: Hit[TDoc]): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostTag(value: String): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostTag: Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postTag")(js.undefined)
        ret
    }
    @scala.inline
    def withPreTag(value: String): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreTag: Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preTag")(js.undefined)
        ret
    }
  }
  
}

