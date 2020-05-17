package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.ShouldFadeIn
import typingsSlinky.officeUiFabricReact.imageTypesMod.IImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Image", JSImport.Namespace)
@js.native
object libImageMod extends js.Object {
  @js.native
  class ImageBase protected ()
    extends typingsSlinky.officeUiFabricReact.imageMod.ImageBase {
    def this(props: IImageProps) = this()
  }
  
  val Image: ReactComponentClass[IImageProps] = js.native
  /* static members */
  @js.native
  object ImageBase extends js.Object {
    var _svgRegex: js.Any = js.native
    var defaultProps: ShouldFadeIn = js.native
  }
  
  @js.native
  object ImageCoverStyle extends js.Object {
    /* 0 */ val landscape: typingsSlinky.officeUiFabricReact.imageTypesMod.ImageCoverStyle.landscape with Double = js.native
    /* 1 */ val portrait: typingsSlinky.officeUiFabricReact.imageTypesMod.ImageCoverStyle.portrait with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.imageTypesMod.ImageCoverStyle with Double] = js.native
  }
  
  @js.native
  object ImageFit extends js.Object {
    /* 0 */ val center: typingsSlinky.officeUiFabricReact.imageTypesMod.ImageFit.center with Double = js.native
    /* 5 */ val centerContain: typingsSlinky.officeUiFabricReact.imageTypesMod.ImageFit.centerContain with Double = js.native
    /* 4 */ val centerCover: typingsSlinky.officeUiFabricReact.imageTypesMod.ImageFit.centerCover with Double = js.native
    /* 1 */ val contain: typingsSlinky.officeUiFabricReact.imageTypesMod.ImageFit.contain with Double = js.native
    /* 2 */ val cover: typingsSlinky.officeUiFabricReact.imageTypesMod.ImageFit.cover with Double = js.native
    /* 3 */ val none: typingsSlinky.officeUiFabricReact.imageTypesMod.ImageFit.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.imageTypesMod.ImageFit with Double] = js.native
  }
  
  @js.native
  object ImageLoadState extends js.Object {
    /* 2 */ val error: typingsSlinky.officeUiFabricReact.imageTypesMod.ImageLoadState.error with Double = js.native
    /* 3 */ val errorLoaded: typingsSlinky.officeUiFabricReact.imageTypesMod.ImageLoadState.errorLoaded with Double = js.native
    /* 1 */ val loaded: typingsSlinky.officeUiFabricReact.imageTypesMod.ImageLoadState.loaded with Double = js.native
    /* 0 */ val notLoaded: typingsSlinky.officeUiFabricReact.imageTypesMod.ImageLoadState.notLoaded with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.imageTypesMod.ImageLoadState with Double] = js.native
  }
  
}

