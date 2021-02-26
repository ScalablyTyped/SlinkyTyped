package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.ShouldFadeIn
import typingsSlinky.officeUiFabricReact.imageTypesMod.IImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Image", "Image")
  @js.native
  val Image: ReactComponentClass[IImageProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Image", "ImageBase")
  @js.native
  class ImageBase protected ()
    extends typingsSlinky.officeUiFabricReact.imageBaseMod.ImageBase {
    def this(props: IImageProps) = this()
  }
  /* static members */
  object ImageBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Image", "ImageBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Image", "ImageBase._svgRegex")
    @js.native
    def _svgRegex: js.Any = js.native
    @scala.inline
    def _svgRegex_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_svgRegex")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/Image", "ImageBase.defaultProps")
    @js.native
    def defaultProps: ShouldFadeIn = js.native
    @scala.inline
    def defaultProps_=(x: ShouldFadeIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Image", "ImageCoverStyle")
  @js.native
  object ImageCoverStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.imageTypesMod.ImageCoverStyle with Double] = js.native
    
    /* 0 */ val landscape: typingsSlinky.officeUiFabricReact.imageTypesMod.ImageCoverStyle.landscape with Double = js.native
    
    /* 1 */ val portrait: typingsSlinky.officeUiFabricReact.imageTypesMod.ImageCoverStyle.portrait with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Image", "ImageFit")
  @js.native
  object ImageFit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.imageTypesMod.ImageFit with Double] = js.native
    
    /* 0 */ val center: typingsSlinky.officeUiFabricReact.imageTypesMod.ImageFit.center with Double = js.native
    
    /* 5 */ val centerContain: typingsSlinky.officeUiFabricReact.imageTypesMod.ImageFit.centerContain with Double = js.native
    
    /* 4 */ val centerCover: typingsSlinky.officeUiFabricReact.imageTypesMod.ImageFit.centerCover with Double = js.native
    
    /* 1 */ val contain: typingsSlinky.officeUiFabricReact.imageTypesMod.ImageFit.contain with Double = js.native
    
    /* 2 */ val cover: typingsSlinky.officeUiFabricReact.imageTypesMod.ImageFit.cover with Double = js.native
    
    /* 3 */ val none: typingsSlinky.officeUiFabricReact.imageTypesMod.ImageFit.none with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Image", "ImageLoadState")
  @js.native
  object ImageLoadState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.imageTypesMod.ImageLoadState with Double] = js.native
    
    /* 2 */ val error: typingsSlinky.officeUiFabricReact.imageTypesMod.ImageLoadState.error with Double = js.native
    
    /* 3 */ val errorLoaded: typingsSlinky.officeUiFabricReact.imageTypesMod.ImageLoadState.errorLoaded with Double = js.native
    
    /* 1 */ val loaded: typingsSlinky.officeUiFabricReact.imageTypesMod.ImageLoadState.loaded with Double = js.native
    
    /* 0 */ val notLoaded: typingsSlinky.officeUiFabricReact.imageTypesMod.ImageLoadState.notLoaded with Double = js.native
  }
}
