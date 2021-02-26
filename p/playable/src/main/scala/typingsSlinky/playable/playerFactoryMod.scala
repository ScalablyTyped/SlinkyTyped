package typingsSlinky.playable

import typingsSlinky.playable.bottomBlockTypesMod.IBottomBlockAPI
import typingsSlinky.playable.configMod.IPlayerConfig
import typingsSlinky.playable.createContainerMod.Container
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
import typingsSlinky.playable.themeTypesMod.IThemeConfig
import typingsSlinky.playable.titleTypesMod.ITitleAPI
import typingsSlinky.playable.topBlockTypesMod.ITopBlockAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playerFactoryMod {
  
  @JSImport("playable/dist/src/core/player-factory", "clearAdditionalModules")
  @js.native
  def clearAdditionalModules(): Unit = js.native
  
  @JSImport("playable/dist/src/core/player-factory", "clearPlaybackAdapters")
  @js.native
  def clearPlaybackAdapters(): Unit = js.native
  
  @JSImport("playable/dist/src/core/player-factory", "container")
  @js.native
  val container: Container = js.native
  
  @JSImport("playable/dist/src/core/player-factory", "create")
  @js.native
  def create(): IPlayerInstance = js.native
  @JSImport("playable/dist/src/core/player-factory", "create")
  @js.native
  def create(params: js.UndefOr[scala.Nothing], themeConfig: IThemeConfig): IPlayerInstance = js.native
  @JSImport("playable/dist/src/core/player-factory", "create")
  @js.native
  def create(params: IPlayerConfig): IPlayerInstance = js.native
  @JSImport("playable/dist/src/core/player-factory", "create")
  @js.native
  def create(params: IPlayerConfig, themeConfig: IThemeConfig): IPlayerInstance = js.native
  
  @JSImport("playable/dist/src/core/player-factory", "registerModule")
  @js.native
  def registerModule(id: String, module: js.Any): Unit = js.native
  
  @JSImport("playable/dist/src/core/player-factory", "registerPlaybackAdapter")
  @js.native
  def registerPlaybackAdapter(adapter: js.Any): Unit = js.native
  
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
    implicit class IPlayerInstanceMutableBuilder[Self <: IPlayerInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    }
  }
}
