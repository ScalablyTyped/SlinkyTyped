package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.ratingTypesMod.IRatingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRatingMod {
  
  @JSImport("office-ui-fabric-react/lib/Rating", "Rating")
  @js.native
  val Rating: ReactComponentClass[IRatingProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Rating", "RatingBase")
  @js.native
  class RatingBase protected ()
    extends typingsSlinky.officeUiFabricReact.ratingMod.RatingBase {
    def this(props: IRatingProps) = this()
  }
  /* static members */
  object RatingBase {
    
    @JSImport("office-ui-fabric-react/lib/Rating", "RatingBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Rating", "RatingBase.defaultProps")
    @js.native
    def defaultProps: IRatingProps = js.native
    @scala.inline
    def defaultProps_=(x: IRatingProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Rating", "RatingSize")
  @js.native
  object RatingSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.ratingTypesMod.RatingSize with Double] = js.native
    
    /* 1 */ val Large: typingsSlinky.officeUiFabricReact.ratingTypesMod.RatingSize.Large with Double = js.native
    
    /* 0 */ val Small: typingsSlinky.officeUiFabricReact.ratingTypesMod.RatingSize.Small with Double = js.native
  }
}
