package typingsSlinky.phaser.spine.webgl

import org.scalajs.dom.raw.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.AssetManager")
@js.native
class AssetManager protected ()
  extends typingsSlinky.phaser.spine.AssetManager {
  def this(context: ManagedWebGLRenderingContext) = this()
  def this(context: WebGLRenderingContext) = this()
  def this(context: ManagedWebGLRenderingContext, pathPrefix: String) = this()
  def this(context: WebGLRenderingContext, pathPrefix: String) = this()
}

