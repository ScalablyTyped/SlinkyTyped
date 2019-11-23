package typingsSlinky.atEmotionSerialize.atEmotionSerializeMod

import typingsSlinky.atEmotionUtils.atEmotionUtilsMod.RegisteredCache
import typingsSlinky.atEmotionUtils.atEmotionUtilsMod.SerializedStyles
import typingsSlinky.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@emotion/serialize", "serializeStyles")
@js.native
object serializeStyles extends js.Object {
  def apply[MP](args: js.Array[TemplateStringsArray | Interpolation[MP]], registered: RegisteredCache): SerializedStyles = js.native
  def apply[MP](
    args: js.Array[TemplateStringsArray | Interpolation[MP]],
    registered: RegisteredCache,
    mergedProps: MP
  ): SerializedStyles = js.native
}

