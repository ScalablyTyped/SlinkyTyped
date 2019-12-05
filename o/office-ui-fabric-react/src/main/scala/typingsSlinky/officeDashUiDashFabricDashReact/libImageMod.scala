package typingsSlinky.officeDashUiDashFabricDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.IImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Image", JSImport.Namespace)
@js.native
object libImageMod extends js.Object {
  @js.native
  class ImageBase protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsImageMod.ImageBase {
    def this(props: IImageProps) = this()
  }
  
  val Image: ReactComponentClass[IImageProps] = js.native
  /* static members */
  @js.native
  object ImageBase extends js.Object {
    var _svgRegex: js.Any = js.native
    var defaultProps: Anon_ShouldFadeIn = js.native
  }
  
  @js.native
  object ImageCoverStyle extends js.Object {
    /* 0 */ val landscape: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageCoverStyle.landscape with Double = js.native
    /* 1 */ val portrait: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageCoverStyle.portrait with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageCoverStyle with Double
      ] = js.native
  }
  
  @js.native
  object ImageFit extends js.Object {
    /* 0 */ val center: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageFit.center with Double = js.native
    /* 5 */ val centerContain: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageFit.centerContain with Double = js.native
    /* 4 */ val centerCover: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageFit.centerCover with Double = js.native
    /* 1 */ val contain: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageFit.contain with Double = js.native
    /* 2 */ val cover: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageFit.cover with Double = js.native
    /* 3 */ val none: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageFit.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageFit with Double
      ] = js.native
  }
  
  @js.native
  object ImageLoadState extends js.Object {
    /* 2 */ val error: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageLoadState.error with Double = js.native
    /* 3 */ val errorLoaded: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageLoadState.errorLoaded with Double = js.native
    /* 1 */ val loaded: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageLoadState.loaded with Double = js.native
    /* 0 */ val notLoaded: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageLoadState.notLoaded with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageLoadState with Double
      ] = js.native
  }
  
}

