package typingsSlinky.phaser.global.spine

import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.AssetManager")
@js.native
class AssetManager protected ()
  extends typingsSlinky.phaser.spine.AssetManager {
  def this(textureLoader: js.Function1[/* image */ HTMLImageElement, _]) = this()
  def this(textureLoader: js.Function1[/* image */ HTMLImageElement, _], pathPrefix: String) = this()
}
/* static members */
@JSGlobal("spine.AssetManager")
@js.native
object AssetManager extends js.Object {
  
  var downloadBinary: js.Any = js.native
  
  var downloadText: js.Any = js.native
}
