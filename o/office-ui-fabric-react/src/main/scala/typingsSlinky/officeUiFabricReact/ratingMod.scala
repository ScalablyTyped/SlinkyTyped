package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.ratingTypesMod.IRatingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Rating", JSImport.Namespace)
@js.native
object ratingMod extends js.Object {
  
  val Rating: ReactComponentClass[IRatingProps] = js.native
  
  @js.native
  class RatingBase protected ()
    extends typingsSlinky.officeUiFabricReact.ratingBaseMod.RatingBase {
    def this(props: IRatingProps) = this()
  }
  /* static members */
  @js.native
  object RatingBase extends js.Object {
    
    var defaultProps: IRatingProps = js.native
  }
  
  @js.native
  object RatingSize extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.ratingTypesMod.RatingSize with Double] = js.native
    
    /* 1 */ val Large: typingsSlinky.officeUiFabricReact.ratingTypesMod.RatingSize.Large with Double = js.native
    
    /* 0 */ val Small: typingsSlinky.officeUiFabricReact.ratingTypesMod.RatingSize.Small with Double = js.native
  }
}
