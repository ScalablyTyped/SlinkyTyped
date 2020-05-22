package typingsSlinky.jestDiff.anon

import typingsSlinky.jestDiff.jestDiffBooleans.`true`
import typingsSlinky.jestDiff.printDiffsMod._StringDiffResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotatedDiff extends _StringDiffResult {
  var annotatedDiff: String
  var isMultiline: `true`
}

object AnnotatedDiff {
  @scala.inline
  def apply(annotatedDiff: String, isMultiline: `true`): AnnotatedDiff = {
    val __obj = js.Dynamic.literal(annotatedDiff = annotatedDiff.asInstanceOf[js.Any], isMultiline = isMultiline.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotatedDiff]
  }
}

