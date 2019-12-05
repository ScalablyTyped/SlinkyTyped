package typingsSlinky.domDashHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cjsAnimateMod {
  import typingsSlinky.domDashHelpers.cjsIsTransformMod.TransformValue
  import typingsSlinky.domDashHelpers.cjsTypesMod.Property
  import typingsSlinky.std.Record

  type AnimateProperties = Record[Property | TransformValue, String]
}
