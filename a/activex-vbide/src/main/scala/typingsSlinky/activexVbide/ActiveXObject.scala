package typingsSlinky.activexVbide

import typingsSlinky.activexVbide.VBIDE.CommandBarEvents
import typingsSlinky.activexVbide.VBIDE.References
import typingsSlinky.activexVbide.VBIDE.ReferencesEvents
import typingsSlinky.activexVbide.activexVbideStrings.CancelDefault
import typingsSlinky.activexVbide.activexVbideStrings.Click
import typingsSlinky.activexVbide.activexVbideStrings.CommandBarControl
import typingsSlinky.activexVbide.activexVbideStrings.ItemAdded
import typingsSlinky.activexVbide.activexVbideStrings.ItemRemoved
import typingsSlinky.activexVbide.activexVbideStrings.Reference
import typingsSlinky.activexVbide.activexVbideStrings.handled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends js.Object {
  
  def on(
    obj: CommandBarEvents,
    event: Click,
    argNames: js.Tuple3[CommandBarControl, handled, CancelDefault],
    handler: js.ThisFunction1[
      /* this */ CommandBarEvents, 
      /* parameter */ typingsSlinky.activexVbide.anon.CancelDefault, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ReferencesEvents,
    event: ItemAdded,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[
      /* this */ ReferencesEvents, 
      /* parameter */ typingsSlinky.activexVbide.anon.Reference, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ReferencesEvents,
    event: ItemRemoved,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[
      /* this */ ReferencesEvents, 
      /* parameter */ typingsSlinky.activexVbide.anon.Reference, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: References,
    event: ItemAdded,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[
      /* this */ References, 
      /* parameter */ typingsSlinky.activexVbide.anon.Reference, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: References,
    event: ItemRemoved,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[
      /* this */ References, 
      /* parameter */ typingsSlinky.activexVbide.anon.Reference, 
      Unit
    ]
  ): Unit = js.native
}
