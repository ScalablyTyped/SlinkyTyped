package typingsSlinky.atAntDashDesignProDashLayout.libSettingDrawerMod

import typingsSlinky.atAntDashDesignProDashLayout.Anon_ColorList
import typingsSlinky.atAntDashDesignProDashLayout.Anon_DefaultMessageId
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingDrawer
  extends Component[SettingDrawerProps, SettingDrawerState, js.Any] {
  def changeSetting(key: String, value: String): Unit = js.native
  def changeSetting(key: String, value: Boolean): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSettingDrawer(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSettingDrawer(): Unit = js.native
  def getFormatMessage(): js.Function1[/* data */ Anon_DefaultMessageId, String] = js.native
  def getLayoutSetting(): js.Array[SettingItemProps] = js.native
  def getThemeList(): Anon_ColorList = js.native
  def onLanguageChange(): Unit = js.native
  def renderLayoutSettingItem(item: SettingItemProps): Element = js.native
  def togglerContent(): Unit = js.native
  def updateTheme(dark: Boolean): Unit = js.native
  def updateTheme(dark: Boolean, color: String): Unit = js.native
}

