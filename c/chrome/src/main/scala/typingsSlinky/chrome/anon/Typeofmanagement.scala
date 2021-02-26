package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.management.ExtensionInfo
import typingsSlinky.chrome.chrome.management.ManagementDisabledEvent
import typingsSlinky.chrome.chrome.management.ManagementEnabledEvent
import typingsSlinky.chrome.chrome.management.ManagementInstalledEvent
import typingsSlinky.chrome.chrome.management.ManagementUninstalledEvent
import typingsSlinky.chrome.chrome.management.UninstallOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofmanagement extends StObject {
  
  def createAppShortcut(id: String): Unit = js.native
  def createAppShortcut(id: String, callback: js.Function0[Unit]): Unit = js.native
  
  def generateAppForLink(url: String, title: String): Unit = js.native
  def generateAppForLink(url: String, title: String, callback: js.Function1[/* result */ ExtensionInfo, Unit]): Unit = js.native
  
  def get(id: String): Unit = js.native
  def get(id: String, callback: js.Function1[/* result */ ExtensionInfo, Unit]): Unit = js.native
  
  def getAll(): Unit = js.native
  def getAll(callback: js.Function1[/* result */ js.Array[ExtensionInfo], Unit]): Unit = js.native
  
  def getPermissionWarningsById(id: String): Unit = js.native
  def getPermissionWarningsById(id: String, callback: js.Function1[/* permissionWarnings */ js.Array[String], Unit]): Unit = js.native
  
  def getPermissionWarningsByManifest(manifestStr: String): Unit = js.native
  def getPermissionWarningsByManifest(manifestStr: String, callback: js.Function1[/* permissionwarnings */ js.Array[String], Unit]): Unit = js.native
  
  def getSelf(): Unit = js.native
  def getSelf(callback: js.Function1[/* result */ ExtensionInfo, Unit]): Unit = js.native
  
  def launchApp(id: String): Unit = js.native
  def launchApp(id: String, callback: js.Function0[Unit]): Unit = js.native
  
  var onDisabled: ManagementDisabledEvent = js.native
  
  var onEnabled: ManagementEnabledEvent = js.native
  
  var onInstalled: ManagementInstalledEvent = js.native
  
  var onUninstalled: ManagementUninstalledEvent = js.native
  
  def setEnabled(id: String, enabled: Boolean): Unit = js.native
  def setEnabled(id: String, enabled: Boolean, callback: js.Function0[Unit]): Unit = js.native
  
  def setLaunchType(id: String, launchType: String): Unit = js.native
  def setLaunchType(id: String, launchType: String, callback: js.Function0[Unit]): Unit = js.native
  
  def uninstall(id: String): Unit = js.native
  def uninstall(id: String, callback: js.Function0[Unit]): Unit = js.native
  def uninstall(id: String, options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def uninstall(id: String, options: UninstallOptions): Unit = js.native
  def uninstall(id: String, options: UninstallOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def uninstallSelf(): Unit = js.native
  def uninstallSelf(callback: js.Function0[Unit]): Unit = js.native
  def uninstallSelf(options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def uninstallSelf(options: UninstallOptions): Unit = js.native
  def uninstallSelf(options: UninstallOptions, callback: js.Function0[Unit]): Unit = js.native
}
