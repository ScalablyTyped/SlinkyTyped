package typingsSlinky.atEmotionCore.atEmotionCoreMod

import typingsSlinky.atEmotionSerialize.atEmotionSerializeMod.Interpolation
import typingsSlinky.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassNamesContent[Theme] extends js.Object {
  var theme: Theme = js.native
  def css(args: Interpolation[js.UndefOr[scala.Nothing]]*): String = js.native
  def css(template: TemplateStringsArray, args: Interpolation[js.UndefOr[scala.Nothing]]*): String = js.native
  def cx(args: ClassNamesArg*): String = js.native
}

