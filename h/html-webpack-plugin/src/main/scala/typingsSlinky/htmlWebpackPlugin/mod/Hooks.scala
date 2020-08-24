package typingsSlinky.htmlWebpackPlugin.mod

import typingsSlinky.htmlWebpackPlugin.anon.AssetTags
import typingsSlinky.htmlWebpackPlugin.anon.Assets
import typingsSlinky.htmlWebpackPlugin.anon.HeadTags
import typingsSlinky.htmlWebpackPlugin.anon.Html
import typingsSlinky.htmlWebpackPlugin.anon.OutputName
import typingsSlinky.htmlWebpackPlugin.anon.Plugin
import typingsSlinky.tapable.mod.AsyncSeriesWaterfallHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hooks extends js.Object {
  var afterEmit: AsyncSeriesWaterfallHook[Plugin, _, _] = js.native
  var afterTemplateExecution: AsyncSeriesWaterfallHook[Html, _, _] = js.native
  var alterAssetTagGroups: AsyncSeriesWaterfallHook[HeadTags, _, _] = js.native
  var alterAssetTags: AsyncSeriesWaterfallHook[AssetTags, _, _] = js.native
  var beforeAssetTagGeneration: AsyncSeriesWaterfallHook[Assets, _, _] = js.native
  var beforeEmit: AsyncSeriesWaterfallHook[OutputName, _, _] = js.native
}

object Hooks {
  @scala.inline
  def apply(
    afterEmit: AsyncSeriesWaterfallHook[Plugin, _, _],
    afterTemplateExecution: AsyncSeriesWaterfallHook[Html, _, _],
    alterAssetTagGroups: AsyncSeriesWaterfallHook[HeadTags, _, _],
    alterAssetTags: AsyncSeriesWaterfallHook[AssetTags, _, _],
    beforeAssetTagGeneration: AsyncSeriesWaterfallHook[Assets, _, _],
    beforeEmit: AsyncSeriesWaterfallHook[OutputName, _, _]
  ): Hooks = {
    val __obj = js.Dynamic.literal(afterEmit = afterEmit.asInstanceOf[js.Any], afterTemplateExecution = afterTemplateExecution.asInstanceOf[js.Any], alterAssetTagGroups = alterAssetTagGroups.asInstanceOf[js.Any], alterAssetTags = alterAssetTags.asInstanceOf[js.Any], beforeAssetTagGeneration = beforeAssetTagGeneration.asInstanceOf[js.Any], beforeEmit = beforeEmit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hooks]
  }
  @scala.inline
  implicit class HooksOps[Self <: Hooks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterEmit(value: AsyncSeriesWaterfallHook[Plugin, _, _]): Self = this.set("afterEmit", value.asInstanceOf[js.Any])
    @scala.inline
    def setAfterTemplateExecution(value: AsyncSeriesWaterfallHook[Html, _, _]): Self = this.set("afterTemplateExecution", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlterAssetTagGroups(value: AsyncSeriesWaterfallHook[HeadTags, _, _]): Self = this.set("alterAssetTagGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlterAssetTags(value: AsyncSeriesWaterfallHook[AssetTags, _, _]): Self = this.set("alterAssetTags", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeAssetTagGeneration(value: AsyncSeriesWaterfallHook[Assets, _, _]): Self = this.set("beforeAssetTagGeneration", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeEmit(value: AsyncSeriesWaterfallHook[OutputName, _, _]): Self = this.set("beforeEmit", value.asInstanceOf[js.Any])
  }
  
}

