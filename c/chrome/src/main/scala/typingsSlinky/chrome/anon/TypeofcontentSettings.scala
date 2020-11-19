package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.contentSettings.CameraContentSetting
import typingsSlinky.chrome.chrome.contentSettings.CookieContentSetting
import typingsSlinky.chrome.chrome.contentSettings.FullscreenContentSetting
import typingsSlinky.chrome.chrome.contentSettings.ImagesContentSetting
import typingsSlinky.chrome.chrome.contentSettings.JavascriptContentSetting
import typingsSlinky.chrome.chrome.contentSettings.LocationContentSetting
import typingsSlinky.chrome.chrome.contentSettings.MicrophoneContentSetting
import typingsSlinky.chrome.chrome.contentSettings.MouselockContentSetting
import typingsSlinky.chrome.chrome.contentSettings.MultipleAutomaticDownloadsContentSetting
import typingsSlinky.chrome.chrome.contentSettings.NotificationsContentSetting
import typingsSlinky.chrome.chrome.contentSettings.PluginsContentSetting
import typingsSlinky.chrome.chrome.contentSettings.PopupsContentSetting
import typingsSlinky.chrome.chrome.contentSettings.PpapiBrokerContentSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofcontentSettings extends js.Object {
  
  var automaticDownloads: MultipleAutomaticDownloadsContentSetting = js.native
  
  var camera: CameraContentSetting = js.native
  
  var cookies: CookieContentSetting = js.native
  
  var fullscreen: FullscreenContentSetting = js.native
  
  var images: ImagesContentSetting = js.native
  
  var javascript: JavascriptContentSetting = js.native
  
  var location: LocationContentSetting = js.native
  
  var microphone: MicrophoneContentSetting = js.native
  
  var mouselock: MouselockContentSetting = js.native
  
  var notifications: NotificationsContentSetting = js.native
  
  var plugins: PluginsContentSetting = js.native
  
  var popups: PopupsContentSetting = js.native
  
  var unsandboxedPlugins: PpapiBrokerContentSetting = js.native
}
object TypeofcontentSettings {
  
  @scala.inline
  def apply(
    automaticDownloads: MultipleAutomaticDownloadsContentSetting,
    camera: CameraContentSetting,
    cookies: CookieContentSetting,
    fullscreen: FullscreenContentSetting,
    images: ImagesContentSetting,
    javascript: JavascriptContentSetting,
    location: LocationContentSetting,
    microphone: MicrophoneContentSetting,
    mouselock: MouselockContentSetting,
    notifications: NotificationsContentSetting,
    plugins: PluginsContentSetting,
    popups: PopupsContentSetting,
    unsandboxedPlugins: PpapiBrokerContentSetting
  ): TypeofcontentSettings = {
    val __obj = js.Dynamic.literal(automaticDownloads = automaticDownloads.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], fullscreen = fullscreen.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], javascript = javascript.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], microphone = microphone.asInstanceOf[js.Any], mouselock = mouselock.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], popups = popups.asInstanceOf[js.Any], unsandboxedPlugins = unsandboxedPlugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofcontentSettings]
  }
  
  @scala.inline
  implicit class TypeofcontentSettingsOps[Self <: TypeofcontentSettings] (val x: Self) extends AnyVal {
    
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
    def setAutomaticDownloads(value: MultipleAutomaticDownloadsContentSetting): Self = this.set("automaticDownloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCamera(value: CameraContentSetting): Self = this.set("camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookies(value: CookieContentSetting): Self = this.set("cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreen(value: FullscreenContentSetting): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages(value: ImagesContentSetting): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavascript(value: JavascriptContentSetting): Self = this.set("javascript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LocationContentSetting): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicrophone(value: MicrophoneContentSetting): Self = this.set("microphone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouselock(value: MouselockContentSetting): Self = this.set("mouselock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifications(value: NotificationsContentSetting): Self = this.set("notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlugins(value: PluginsContentSetting): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopups(value: PopupsContentSetting): Self = this.set("popups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsandboxedPlugins(value: PpapiBrokerContentSetting): Self = this.set("unsandboxedPlugins", value.asInstanceOf[js.Any])
  }
}
