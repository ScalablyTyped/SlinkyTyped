package typingsSlinky.playable.mod

import typingsSlinky.playable.configMod.IPlayerConfig
import typingsSlinky.playable.playerFactoryMod.IPlayerInstance
import typingsSlinky.playable.themeTypesMod.IThemeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable", "create")
@js.native
object create extends js.Object {
  
  def apply(): IPlayerInstance = js.native
  def apply(params: js.UndefOr[scala.Nothing], themeConfig: IThemeConfig): IPlayerInstance = js.native
  def apply(params: IPlayerConfig): IPlayerInstance = js.native
  def apply(params: IPlayerConfig, themeConfig: IThemeConfig): IPlayerInstance = js.native
}
