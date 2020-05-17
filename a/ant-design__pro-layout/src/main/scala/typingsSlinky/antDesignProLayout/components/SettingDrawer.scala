package typingsSlinky.antDesignProLayout.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignProLayout.anon.MergerSettingsTypeSetting
import typingsSlinky.antDesignProLayout.libSettingDrawerMod.SettingDrawerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SettingDrawer {
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def collapse(value: Boolean): this.type = set("collapse", value.asInstanceOf[js.Any])
    @scala.inline
    def getContainer(value: js.Any): this.type = set("getContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def hideColors(value: Boolean): this.type = set("hideColors", value.asInstanceOf[js.Any])
    @scala.inline
    def hideCopyButton(value: Boolean): this.type = set("hideCopyButton", value.asInstanceOf[js.Any])
    @scala.inline
    def hideHintAlert(value: Boolean): this.type = set("hideHintAlert", value.asInstanceOf[js.Any])
    @scala.inline
    def hideLoading(value: Boolean): this.type = set("hideLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def onCollapseChange(value: /* collapse */ Boolean => Unit): this.type = set("onCollapseChange", js.Any.fromFunction1(value))
    @scala.inline
    def onSettingChange(value: /* settings */ MergerSettingsTypeSetting => Unit): this.type = set("onSettingChange", js.Any.fromFunction1(value))
    @scala.inline
    def publicPath(value: String): this.type = set("publicPath", value.asInstanceOf[js.Any])
    @scala.inline
    def settings(value: MergerSettingsTypeSetting): this.type = set("settings", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SettingDrawerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SettingDrawer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

