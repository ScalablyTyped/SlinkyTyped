package typingsSlinky.monacoDashEditor.monacoDashEditorMod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldingMarkers extends js.Object {
  var end: js.RegExp
  var start: js.RegExp
}

object FoldingMarkers {
  @scala.inline
  def apply(end: js.RegExp, start: js.RegExp): FoldingMarkers = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FoldingMarkers]
  }
}

