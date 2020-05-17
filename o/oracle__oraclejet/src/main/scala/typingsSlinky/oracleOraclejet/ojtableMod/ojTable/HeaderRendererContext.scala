package typingsSlinky.oracleOraclejet.ojtableMod.ojTable

import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.anon.`22`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait HeaderRendererContext[K, D] extends js.Object {
  var columnHeaderDefaultRenderer: js.UndefOr[
    js.Function2[
      /* param0 */ js.Object, 
      /* param1 */ js.Function1[/* param0 */ js.Object, Unit], 
      Unit
    ]
  ] = js.native
  var columnHeaderSortableIconRenderer: js.UndefOr[
    js.Function2[
      /* param0 */ js.Object, 
      /* param1 */ js.Function1[/* param0 */ js.Object, Unit], 
      Unit
    ]
  ] = js.native
  var columnIndex: Double = js.native
  var componentElement: Element = js.native
  var data: String = js.native
  var headerContext: `22`[K, D] = js.native
  var parentElement: Element = js.native
}

object HeaderRendererContext {
  @scala.inline
  def apply[K, D](
    columnIndex: Double,
    componentElement: Element,
    data: String,
    headerContext: `22`[K, D],
    parentElement: Element
  ): HeaderRendererContext[K, D] = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headerContext = headerContext.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderRendererContext[K, D]]
  }
  @scala.inline
  implicit class HeaderRendererContextOps[Self[k, d] <: HeaderRendererContext[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
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
    def withData(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderContext(value: `22`[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentElement(value: Element): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnHeaderDefaultRenderer(value: (/* param0 */ js.Object, /* param1 */ js.Function1[/* param0 */ js.Object, Unit]) => Unit): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderDefaultRenderer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnHeaderDefaultRenderer: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderDefaultRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHeaderSortableIconRenderer(value: (/* param0 */ js.Object, /* param1 */ js.Function1[/* param0 */ js.Object, Unit]) => Unit): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderSortableIconRenderer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnHeaderSortableIconRenderer: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderSortableIconRenderer")(js.undefined)
        ret
    }
  }
  
}

