package typingsSlinky.cspHtmlWebpackPlugin.mod

import typingsSlinky.tapable.mod.AsyncSeriesWaterfallHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Helpers for extracting the relevant generic types from
// HtmlWebpackPlugin.Hooks.
@js.native
trait HtmlPluginDataHookV3[T] extends js.Object {
  var htmlWebpackPluginAfterHtmlProcessing: AsyncSeriesWaterfallHook[T, _, _] = js.native
}

object HtmlPluginDataHookV3 {
  @scala.inline
  def apply[T](htmlWebpackPluginAfterHtmlProcessing: AsyncSeriesWaterfallHook[T, _, _]): HtmlPluginDataHookV3[T] = {
    val __obj = js.Dynamic.literal(htmlWebpackPluginAfterHtmlProcessing = htmlWebpackPluginAfterHtmlProcessing.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlPluginDataHookV3[T]]
  }
  @scala.inline
  implicit class HtmlPluginDataHookV3Ops[Self[t] <: HtmlPluginDataHookV3[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withHtmlWebpackPluginAfterHtmlProcessing(value: AsyncSeriesWaterfallHook[T, _, _]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlWebpackPluginAfterHtmlProcessing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

