package typingsSlinky.appleMapkitJs.global.mapkit

import typingsSlinky.appleMapkitJs.anon.Automobile
import typingsSlinky.appleMapkitJs.mapkit.DirectionsConstructorOptions
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
  extends typingsSlinky.appleMapkitJs.mapkit.Directions {
  def this(options: DirectionsConstructorOptions) = this()
}
/* static members */
@JSGlobal("mapkit.Directions")
@js.native
object Directions extends js.Object {
  
  /**
    * The modes of transportation.
    */
  val Transport: Automobile = js.native
}
