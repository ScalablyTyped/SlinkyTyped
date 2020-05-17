package typingsSlinky.pixiSpine.global.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.TextureAtlas")
@js.native
class TextureAtlas ()
  extends typingsSlinky.pixiSpine.PIXI.spine.core.TextureAtlas {
  def this(atlasText: String) = this()
  def this(
    atlasText: String,
    textureLoader: js.Function2[
        /* path */ String, 
        /* loaderFunction */ js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ /* tex */ js.Any, 
          _
        ], 
        _
      ]
  ) = this()
  def this(
    atlasText: String,
    textureLoader: js.Function2[
        /* path */ String, 
        /* loaderFunction */ js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ /* tex */ js.Any, 
          _
        ], 
        _
      ],
    callback: js.Function1[/* obj */ typingsSlinky.pixiSpine.PIXI.spine.core.TextureAtlas, _]
  ) = this()
}

