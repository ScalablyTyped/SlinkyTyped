package typingsSlinky.codemirror.mod

import typingsSlinky.codemirror.codemirrorStrings.beforeSelectionChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("codemirror", "on")
@js.native
object on_beforeSelectionChange extends js.Object {
  
  /** Equivalent to the event by the same name as fired on editor instances. */
  def apply(
    doc: Doc,
    eventName: beforeSelectionChange,
    handler: js.Function2[/* instance */ Editor, /* obj */ EditorSelectionChange, Unit]
  ): Unit = js.native
}
