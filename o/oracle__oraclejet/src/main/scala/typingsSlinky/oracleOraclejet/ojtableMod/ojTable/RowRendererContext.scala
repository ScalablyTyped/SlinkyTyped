package typingsSlinky.oracleOraclejet.ojtableMod.ojTable

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.anon.Datasource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait RowRendererContext[K, D] extends js.Object {
  var componentElement: Element = js.native
  var data: StringDictionary[js.Any] = js.native
  var parentElement: Element = js.native
  var rowContext: Datasource[K, D] = js.native
}

object RowRendererContext {
  @scala.inline
  def apply[K, D](
    componentElement: Element,
    data: StringDictionary[js.Any],
    parentElement: Element,
    rowContext: Datasource[K, D]
  ): RowRendererContext[K, D] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], rowContext = rowContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowRendererContext[K, D]]
  }
  @scala.inline
  implicit class RowRendererContextOps[Self[k, d] <: RowRendererContext[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withComponentElement(value: Element): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: StringDictionary[js.Any]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentElement(value: Element): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowContext(value: Datasource[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowContext")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

