package typingsSlinky.activexShell

import typingsSlinky.activexShell.Shell32.ShellFolderView
import typingsSlinky.activexShell.Shell32.ShellFolderViewOC
import typingsSlinky.activexShell.activexShellStrings.BeginDrag
import typingsSlinky.activexShell.activexShellStrings.DefaultVerbInvoked
import typingsSlinky.activexShell.activexShellStrings.EnumDone
import typingsSlinky.activexShell.activexShellStrings.SelectionChanged
import typingsSlinky.activexShell.activexShellStrings.VerbInvoked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  @JSName("on")
  def on_BeginDrag(
    obj: ShellFolderViewOC,
    event: BeginDrag,
    handler: js.ThisFunction1[/* this */ ShellFolderViewOC, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeginDrag(
    obj: ShellFolderView,
    event: BeginDrag,
    handler: js.ThisFunction1[/* this */ ShellFolderView, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DefaultVerbInvoked(
    obj: ShellFolderViewOC,
    event: DefaultVerbInvoked,
    handler: js.ThisFunction1[/* this */ ShellFolderViewOC, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DefaultVerbInvoked(
    obj: ShellFolderView,
    event: DefaultVerbInvoked,
    handler: js.ThisFunction1[/* this */ ShellFolderView, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_EnumDone(
    obj: ShellFolderViewOC,
    event: EnumDone,
    handler: js.ThisFunction1[/* this */ ShellFolderViewOC, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_EnumDone(
    obj: ShellFolderView,
    event: EnumDone,
    handler: js.ThisFunction1[/* this */ ShellFolderView, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_SelectionChanged(
    obj: ShellFolderViewOC,
    event: SelectionChanged,
    handler: js.ThisFunction1[/* this */ ShellFolderViewOC, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_SelectionChanged(
    obj: ShellFolderView,
    event: SelectionChanged,
    handler: js.ThisFunction1[/* this */ ShellFolderView, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_VerbInvoked(
    obj: ShellFolderViewOC,
    event: VerbInvoked,
    handler: js.ThisFunction1[/* this */ ShellFolderViewOC, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_VerbInvoked(
    obj: ShellFolderView,
    event: VerbInvoked,
    handler: js.ThisFunction1[/* this */ ShellFolderView, /* parameter */ js.Object, Unit]
  ): Unit = js.native
}
