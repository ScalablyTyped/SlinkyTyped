package typingsSlinky.emotionSerialize.mod

import typingsSlinky.emotionUtils.mod.RegisteredCache
import typingsSlinky.emotionUtils.mod.SerializedStyles
import typingsSlinky.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
