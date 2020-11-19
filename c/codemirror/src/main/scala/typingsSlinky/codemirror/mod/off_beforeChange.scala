package typingsSlinky.codemirror.mod

import typingsSlinky.codemirror.codemirrorStrings.beforeChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("codemirror", "off")
@js.native
object off_beforeChange extends js.Object {
  
  def apply(
    doc: Doc,
    eventName: beforeChange,
    handler: js.Function2[/* instance */ Doc, /* change */ EditorChangeCancellable, Unit]
  ): Unit = js.native
}
