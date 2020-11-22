package typingsSlinky.playable.playerFactoryMod

import typingsSlinky.playable.bottomBlockTypesMod.IBottomBlockAPI
import typingsSlinky.playable.downloadTypesMod.IDownloadButtonAPI
import typingsSlinky.playable.eventEmitterTypesMod.IEventEmitterAPI
import typingsSlinky.playable.fullScreenManagerTypesMod.IFullScreenAPI
import typingsSlinky.playable.logoTypesMod.ILogoAPI
import typingsSlinky.playable.mainUiBlockTypesMod.IMainUIBlockAPI
import typingsSlinky.playable.overlayTypesMod.IOverlayAPI
import typingsSlinky.playable.pictureInPictureTypesMod.IPictureInPictureAPI
import typingsSlinky.playable.playbackEngineTypesMod.IPlaybackEngineAPI
import typingsSlinky.playable.previewServiceTypesMod.IPreviewAPI
import typingsSlinky.playable.progressTypesMod.IProgressControlAPI
import typingsSlinky.playable.rootContainerTypesMod.IRootContainerAPI
import typingsSlinky.playable.screenTypesMod.IScreenAPI
import typingsSlinky.playable.themeTypesMod.IThemeAPI
import typingsSlinky.playable.titleTypesMod.ITitleAPI
import typingsSlinky.playable.topBlockTypesMod.ITopBlockAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlayerInstance
  extends IRootContainerAPI
     with IEventEmitterAPI
     with IPlaybackEngineAPI
     with IThemeAPI
     with IFullScreenAPI
     with IPictureInPictureAPI
     with IScreenAPI
     with IOverlayAPI
     with IMainUIBlockAPI
     with ITopBlockAPI
     with ITitleAPI
     with IBottomBlockAPI
     with IProgressControlAPI
     with ILogoAPI
     with IDownloadButtonAPI
     with IPreviewAPI {
  
  def destroy(): Unit = js.native
}
object IPlayerInstance {
  
  @scala.inline
  def apply(destroy: () => Unit): IPlayerInstance = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[IPlayerInstance]
  }
  
  @scala.inline
  implicit class IPlayerInstanceOps[Self <: IPlayerInstance] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
  }
}
