package typingsSlinky.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ckeditor.CKEDITOR.filter.allowedContentRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.filter")
@js.native
class filter protected ()
  extends typingsSlinky.ckeditor.CKEDITOR.filter {
  def this(editorOrRules: typingsSlinky.ckeditor.CKEDITOR.editor) = this()
  def this(editorOrRules: allowedContentRules) = this()
}

/* static members */
@JSGlobal("CKEDITOR.filter")
@js.native
object filter extends js.Object {
  var instances: StringDictionary[typingsSlinky.ckeditor.CKEDITOR.filter] = js.native
  var transformationTools: typingsSlinky.ckeditor.CKEDITOR.filter.transformationTools = js.native
}

