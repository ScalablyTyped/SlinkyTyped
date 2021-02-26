package typingsSlinky.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "DebugLayer")
@js.native
class DebugLayer protected ()
  extends typingsSlinky.babylonjs.legacyMod.DebugLayer {
  /**
    * Instantiates a new debug layer.
    * The debug layer (aka Inspector) is the go to tool in order to better understand
    * what is happening in your scene
    * @see https://doc.babylonjs.com/features/playground_debuglayer
    * @param scene Defines the scene to inspect
    */
  def this(scene: typingsSlinky.babylonjs.sceneMod.Scene) = this()
}
/* static members */
object DebugLayer {
  
  @JSImport("babylonjs", "DebugLayer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Define the url to get the inspector script from.
    * By default it uses the babylonjs CDN.
    * @ignoreNaming
    */
  @JSImport("babylonjs", "DebugLayer.InspectorURL")
  @js.native
  def InspectorURL: String = js.native
  @scala.inline
  def InspectorURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InspectorURL")(x.asInstanceOf[js.Any])
}
