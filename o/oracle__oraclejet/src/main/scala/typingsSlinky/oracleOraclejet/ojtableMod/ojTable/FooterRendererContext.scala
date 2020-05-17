package typingsSlinky.oracleOraclejet.ojtableMod.ojTable

import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.anon.`22`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait FooterRendererContext[K, D] extends js.Object {
  var columnIndex: Double = js.native
  var componentElement: Element = js.native
  var footerContext: `22`[K, D] = js.native
  var parentElement: Element = js.native
}

object FooterRendererContext {
  @scala.inline
  def apply[K, D](columnIndex: Double, componentElement: Element, footerContext: `22`[K, D], parentElement: Element): FooterRendererContext[K, D] = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], footerContext = footerContext.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[FooterRendererContext[K, D]]
  }
  @scala.inline
  implicit class FooterRendererContextOps[Self[k, d] <: FooterRendererContext[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withColumnIndex(value: Double): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentElement(value: Element): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterContext(value: `22`[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentElement(value: Element): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentElement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

