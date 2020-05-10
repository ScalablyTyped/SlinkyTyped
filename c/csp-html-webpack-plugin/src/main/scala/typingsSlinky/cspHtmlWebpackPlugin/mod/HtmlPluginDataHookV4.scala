package typingsSlinky.cspHtmlWebpackPlugin.mod

import typingsSlinky.tapable.mod.AsyncSeriesWaterfallHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlPluginDataHookV4[T] extends js.Object {
  var beforeEmit: AsyncSeriesWaterfallHook[T, _, _] = js.native
}

object HtmlPluginDataHookV4 {
  @scala.inline
  def apply[T](beforeEmit: AsyncSeriesWaterfallHook[T, _, _]): HtmlPluginDataHookV4[T] = {
    val __obj = js.Dynamic.literal(beforeEmit = beforeEmit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlPluginDataHookV4[T]]
  }
  @scala.inline
  implicit class HtmlPluginDataHookV4Ops[Self[t] <: HtmlPluginDataHookV4[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBeforeEmit(value: AsyncSeriesWaterfallHook[T, _, _]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEmit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

