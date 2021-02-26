package typingsSlinky.playable

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.bottomBlockTypesMod.IBottomBlock
import typingsSlinky.playable.bottomBlockTypesMod.IBottomBlockViewConfig
import typingsSlinky.playable.controlsChromecastTypesMod.IChromecastButton
import typingsSlinky.playable.controlsPictureInPictureTypesMod.IPictureInPictureControl
import typingsSlinky.playable.downloadTypesMod.IDownloadButton
import typingsSlinky.playable.eventEmitterTypesMod.IEventEmitter
import typingsSlinky.playable.fullScreenTypesMod.IFullScreenControl
import typingsSlinky.playable.logoTypesMod.ILogoControl
import typingsSlinky.playable.playTypesMod.IPlayControl
import typingsSlinky.playable.playableStrings.left
import typingsSlinky.playable.playableStrings.right
import typingsSlinky.playable.progressTypesMod.IProgressControl
import typingsSlinky.playable.timeTypesMod.ITimeControl
import typingsSlinky.playable.volumeTypesMod.IVolumeControl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bottomBlockMod {
  
  @JSImport("playable/dist/src/modules/ui/bottom-block/bottom-block", JSImport.Default)
  @js.native
  class default protected () extends BottomBlock {
    def this(dependencies: IDependencies) = this()
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/bottom-block/bottom-block", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("playable/dist/src/modules/ui/bottom-block/bottom-block", "default.View")
    @js.native
    class View protected ()
      extends typingsSlinky.playable.bottomBlockViewMod.default {
      def this(config: IBottomBlockViewConfig) = this()
    }
    /* static member */
    /* was `typeof View` */
    @JSImport("playable/dist/src/modules/ui/bottom-block/bottom-block", "default.View")
    @js.native
    def View: Instantiable1[
        /* config */ IBottomBlockViewConfig, 
        typingsSlinky.playable.bottomBlockViewMod.default
      ] = js.native
    @scala.inline
    def View_=(
      x: Instantiable1[
          /* config */ IBottomBlockViewConfig, 
          typingsSlinky.playable.bottomBlockViewMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/bottom-block/bottom-block", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/bottom-block/bottom-block", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait BottomBlock extends IBottomBlock {
    
    var _bindEvents: js.Any = js.native
    
    var _bindViewCallbacks: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _getControlElements: js.Any = js.native
    
    var _initUI: js.Any = js.native
    
    var _isBlockFocused: js.Any = js.native
    
    var _removeFocusState: js.Any = js.native
    
    var _setFocusState: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    def addControl(key: String, element: HTMLElement, options: IAddControllOptions): Unit = js.native
    
    /**
      * Method for hiding picture-in-picture control.
      * @example
      * player.hidePictureInPictureControl();
      */
    def hidePictureInPictureControl(): Unit = js.native
    
    @JSName("isFocused")
    def isFocused_MBottomBlock: Boolean = js.native
    
    var isHidden: Boolean = js.native
    
    /**
      * Method for showing picture-in-picture control.
      * @example
      * player.showPictureInPictureControl();
      */
    def showPictureInPictureControl(): Unit = js.native
    
    var view: typingsSlinky.playable.bottomBlockViewMod.default = js.native
  }
  
  @js.native
  trait IAddControllOptions extends StObject {
    
    var position: js.UndefOr[left | right] = js.native
  }
  object IAddControllOptions {
    
    @scala.inline
    def apply(): IAddControllOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAddControllOptions]
    }
    
    @scala.inline
    implicit class IAddControllOptionsMutableBuilder[Self <: IAddControllOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: left | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  @js.native
  trait IDependencies extends StObject {
    
    var chromecastButton: IChromecastButton = js.native
    
    var downloadButton: IDownloadButton = js.native
    
    var eventEmitter: IEventEmitter = js.native
    
    var fullScreenControl: IFullScreenControl = js.native
    
    var logo: ILogoControl = js.native
    
    var pictureInPictureControl: IPictureInPictureControl = js.native
    
    var playControl: IPlayControl = js.native
    
    var progressControl: IProgressControl = js.native
    
    var timeControl: ITimeControl = js.native
    
    var volumeControl: IVolumeControl = js.native
  }
  object IDependencies {
    
    @scala.inline
    def apply(
      chromecastButton: IChromecastButton,
      downloadButton: IDownloadButton,
      eventEmitter: IEventEmitter,
      fullScreenControl: IFullScreenControl,
      logo: ILogoControl,
      pictureInPictureControl: IPictureInPictureControl,
      playControl: IPlayControl,
      progressControl: IProgressControl,
      timeControl: ITimeControl,
      volumeControl: IVolumeControl
    ): IDependencies = {
      val __obj = js.Dynamic.literal(chromecastButton = chromecastButton.asInstanceOf[js.Any], downloadButton = downloadButton.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], fullScreenControl = fullScreenControl.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], pictureInPictureControl = pictureInPictureControl.asInstanceOf[js.Any], playControl = playControl.asInstanceOf[js.Any], progressControl = progressControl.asInstanceOf[js.Any], timeControl = timeControl.asInstanceOf[js.Any], volumeControl = volumeControl.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDependencies]
    }
    
    @scala.inline
    implicit class IDependenciesMutableBuilder[Self <: IDependencies] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChromecastButton(value: IChromecastButton): Self = StObject.set(x, "chromecastButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadButton(value: IDownloadButton): Self = StObject.set(x, "downloadButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullScreenControl(value: IFullScreenControl): Self = StObject.set(x, "fullScreenControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogo(value: ILogoControl): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPictureInPictureControl(value: IPictureInPictureControl): Self = StObject.set(x, "pictureInPictureControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayControl(value: IPlayControl): Self = StObject.set(x, "playControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressControl(value: IProgressControl): Self = StObject.set(x, "progressControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeControl(value: ITimeControl): Self = StObject.set(x, "timeControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeControl(value: IVolumeControl): Self = StObject.set(x, "volumeControl", value.asInstanceOf[js.Any])
    }
  }
}
