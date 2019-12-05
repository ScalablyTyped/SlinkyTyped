package typingsSlinky.activexDashVbide

import typingsSlinky.activexDashVbide.VBIDE.CommandBarEvents
import typingsSlinky.activexDashVbide.VBIDE.References
import typingsSlinky.activexDashVbide.VBIDE.ReferencesEvents
import typingsSlinky.activexDashVbide.activexDashVbideStrings.CancelDefault
import typingsSlinky.activexDashVbide.activexDashVbideStrings.Click
import typingsSlinky.activexDashVbide.activexDashVbideStrings.CommandBarControl
import typingsSlinky.activexDashVbide.activexDashVbideStrings.ItemAdded
import typingsSlinky.activexDashVbide.activexDashVbideStrings.ItemRemoved
import typingsSlinky.activexDashVbide.activexDashVbideStrings.Reference
import typingsSlinky.activexDashVbide.activexDashVbideStrings.handled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: CommandBarEvents,
    event: Click,
    argNames: js.Tuple3[CommandBarControl, handled, CancelDefault],
    handler: js.ThisFunction1[/* this */ CommandBarEvents, /* parameter */ Anon_CancelDefault, Unit]
  ): Unit = js.native
  def on(
    obj: ReferencesEvents,
    event: ItemAdded,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[/* this */ ReferencesEvents, /* parameter */ Anon_Reference, Unit]
  ): Unit = js.native
  def on(
    obj: ReferencesEvents,
    event: ItemRemoved,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[/* this */ ReferencesEvents, /* parameter */ Anon_Reference, Unit]
  ): Unit = js.native
  def on(
    obj: References,
    event: ItemAdded,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[/* this */ References, /* parameter */ Anon_Reference, Unit]
  ): Unit = js.native
  def on(
    obj: References,
    event: ItemRemoved,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[/* this */ References, /* parameter */ Anon_Reference, Unit]
  ): Unit = js.native
}

