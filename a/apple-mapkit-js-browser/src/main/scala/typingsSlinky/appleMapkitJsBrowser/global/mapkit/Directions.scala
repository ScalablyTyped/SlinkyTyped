package typingsSlinky.appleMapkitJsBrowser.global.mapkit

import typingsSlinky.appleMapkitJsBrowser.mapkit.DirectionsConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a directions object with options that you may provide.
  */
@JSGlobal("mapkit.Directions")
@js.native
/**
  * Creates a directions object with options that you may provide.
  *
  * @param An object containing the options for creating a directions object.
  * This parameter is optional.
  */
class Directions ()
  extends typingsSlinky.appleMapkitJsBrowser.mapkit.Directions {
  def this(options: DirectionsConstructorOptions) = this()
}
@JSGlobal("mapkit.Directions")
@js.native
object Directions extends js.Object {
  
  /**
    * The modes of transportation.
    */
  @js.native
  object Transport extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.appleMapkitJsBrowser.mapkit.Directions.Transport with Double] = js.native
    
    /* 0 */ val Automobile: typingsSlinky.appleMapkitJsBrowser.mapkit.Directions.Transport.Automobile with Double = js.native
    
    /* 1 */ val Walking: typingsSlinky.appleMapkitJsBrowser.mapkit.Directions.Transport.Walking with Double = js.native
  }
}
