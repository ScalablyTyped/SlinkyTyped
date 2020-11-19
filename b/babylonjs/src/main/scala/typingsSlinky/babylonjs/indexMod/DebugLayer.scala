package typingsSlinky.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "DebugLayer")
@js.native
class DebugLayer protected ()
  extends typingsSlinky.babylonjs.debugIndexMod.DebugLayer {
  /**
    * Instantiates a new debug layer.
    * The debug layer (aka Inspector) is the go to tool in order to better understand
    * what is happening in your scene
    * @see http://doc.babylonjs.com/features/playground_debuglayer
    * @param scene Defines the scene to inspect
    */
  def this(scene: typingsSlinky.babylonjs.sceneMod.Scene) = this()
}
/* static members */
@JSImport("babylonjs/index", "DebugLayer")
@js.native
object DebugLayer extends js.Object {
  
  /**
    * Define the url to get the inspector script from.
    * By default it uses the babylonjs CDN.
    * @ignoreNaming
    */
  var InspectorURL: String = js.native
}
