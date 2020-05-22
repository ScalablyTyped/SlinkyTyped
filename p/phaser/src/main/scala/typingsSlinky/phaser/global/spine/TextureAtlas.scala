package typingsSlinky.phaser.global.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.TextureAtlas")
@js.native
class TextureAtlas protected ()
  extends typingsSlinky.phaser.spine.TextureAtlas {
  def this(atlasText: String, textureLoader: js.Function1[/* path */ String, _]) = this()
  /* CompleteClass */
  override var load: js.Any = js.native
  /* CompleteClass */
  override var pages: js.Array[typingsSlinky.phaser.spine.TextureAtlasPage] = js.native
  /* CompleteClass */
  override var regions: js.Array[typingsSlinky.phaser.spine.TextureAtlasRegion] = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def findRegion(name: String): typingsSlinky.phaser.spine.TextureAtlasRegion = js.native
}

