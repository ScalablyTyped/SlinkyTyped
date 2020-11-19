package typingsSlinky.jsqrcode.global

import typingsSlinky.jsqrcode.ResultPointCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AlignmentPatternFinder")
@js.native
class AlignmentPatternFinder protected ()
  extends typingsSlinky.jsqrcode.AlignmentPatternFinder {
  def this(
    image: js.typedarray.Uint8Array,
    startX: Double,
    startY: Double,
    width: Double,
    height: Double,
    moduleSize: Double,
    resultPointCallback: ResultPointCallback
  ) = this()
}
