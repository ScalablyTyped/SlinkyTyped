package typingsSlinky.appDashBuilderDashLib.outOptionsCommonWindowsInstallerConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DesktopShortcutCreationPolicy extends js.Object

@JSImport("app-builder-lib/out/options/CommonWindowsInstallerConfiguration", "DesktopShortcutCreationPolicy")
@js.native
object DesktopShortcutCreationPolicy extends js.Object {
  @js.native
  sealed trait ALWAYS extends DesktopShortcutCreationPolicy
  
  @js.native
  sealed trait FRESH_INSTALL extends DesktopShortcutCreationPolicy
  
  @js.native
  sealed trait NEVER extends DesktopShortcutCreationPolicy
  
  /* 1 */ val ALWAYS: typingsSlinky.appDashBuilderDashLib.outOptionsCommonWindowsInstallerConfigurationMod.DesktopShortcutCreationPolicy.ALWAYS with Double = js.native
  /* 0 */ val FRESH_INSTALL: typingsSlinky.appDashBuilderDashLib.outOptionsCommonWindowsInstallerConfigurationMod.DesktopShortcutCreationPolicy.FRESH_INSTALL with Double = js.native
  /* 2 */ val NEVER: typingsSlinky.appDashBuilderDashLib.outOptionsCommonWindowsInstallerConfigurationMod.DesktopShortcutCreationPolicy.NEVER with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DesktopShortcutCreationPolicy with Double] = js.native
}

