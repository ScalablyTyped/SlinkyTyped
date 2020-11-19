package typingsSlinky.codemirror.mod

import typingsSlinky.codemirror.codemirrorStrings.change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("codemirror", "off")
@js.native
object off_change extends js.Object {
  
  def apply(
    doc: Doc,
    eventName: change,
    handler: js.Function2[/* instance */ Doc, /* changeObj */ EditorChange, Unit]
  ): Unit = js.native
  def apply(
    line: LineHandle,
    eventName: change,
    handler: js.Function2[/* line */ LineHandle, /* changeObj */ EditorChange, Unit]
  ): Unit = js.native
}
