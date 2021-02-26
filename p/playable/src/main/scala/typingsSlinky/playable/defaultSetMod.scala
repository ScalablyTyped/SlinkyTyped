package typingsSlinky.playable

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.playable.adaptersTypesMod.IPlaybackAdapterClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultSetMod extends Shortcut {
  
  @JSImport("playable/dist/src/modules/playback-engine/output/native/adapters/default-set", JSImport.Default)
  @js.native
  val default: js.Array[IPlaybackAdapterClass] = js.native
  
  type _To = js.Array[IPlaybackAdapterClass]
  
  /* This means you don't have to write `default`, but can instead just say `defaultSetMod.foo` */
  override def _to: js.Array[IPlaybackAdapterClass] = default
}
