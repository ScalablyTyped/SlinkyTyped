package typingsSlinky.naverWhale

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
import scala.scalajs.js.annotation._

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
    def withAutomaticDownloads(value: MultipleAutomaticDownloadsContentSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticDownloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCamera(value: CameraContentSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCookies(value: CookieContentSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullscreen(value: FullscreenContentSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImages(value: ImagesContentSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJavascript(value: JavascriptContentSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javascript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: LocationContentSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMicrophone(value: MicrophoneContentSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microphone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouselock(value: MouselockContentSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouselock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotifications(value: NotificationsContentSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugins(value: PluginsContentSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopups(value: PopupsContentSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnsandboxedPlugins(value: PpapiBrokerContentSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsandboxedPlugins")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

