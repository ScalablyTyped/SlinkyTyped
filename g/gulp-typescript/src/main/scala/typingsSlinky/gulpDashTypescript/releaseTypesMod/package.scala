package typingsSlinky.gulpDashTypescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object releaseTypesMod {
  import typingsSlinky.typescript.typescriptMod.CustomTransformers
  import typingsSlinky.typescript.typescriptMod.Program

  type FinalTransformers = js.UndefOr[js.Function1[/* program */ js.UndefOr[Program], CustomTransformers]]
  type GetCustomTransformers = String | (js.Function1[/* program */ js.UndefOr[Program], js.UndefOr[CustomTransformers]])
}
