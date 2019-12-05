package typingsSlinky.officeDashUiDashFabricDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsRatingRatingDotTypesMod.IRatingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Rating", JSImport.Namespace)
@js.native
object libComponentsRatingMod extends js.Object {
  @js.native
  class RatingBase protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsRatingRatingDotBaseMod.RatingBase {
    def this(props: IRatingProps) = this()
  }
  
  val Rating: ReactComponentClass[IRatingProps] = js.native
  /* static members */
  @js.native
  object RatingBase extends js.Object {
    var defaultProps: IRatingProps = js.native
  }
  
  @js.native
  object RatingSize extends js.Object {
    /* 1 */ val Large: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsRatingRatingDotTypesMod.RatingSize.Large with Double = js.native
    /* 0 */ val Small: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsRatingRatingDotTypesMod.RatingSize.Small with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsRatingRatingDotTypesMod.RatingSize with Double
      ] = js.native
  }
  
}

