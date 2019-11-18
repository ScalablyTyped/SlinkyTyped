package typingsSlinky.atAngularPlatformDashBrowser.atAngularPlatformDashBrowserMod

import typingsSlinky.atAngularCore.atAngularCoreMod.DebugElement
import typingsSlinky.atAngularCore.atAngularCoreMod.DebugNode
import typingsSlinky.atAngularCore.atAngularCoreMod.Predicate
import typingsSlinky.atAngularCore.atAngularCoreMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser", "By")
@js.native
class By () extends js.Object

/* static members */
@JSImport("@angular/platform-browser", "By")
@js.native
object By extends js.Object {
  /**
    * Match all nodes.
    *
    * @usageNotes
    * ### Example
    *
    * {@example platform-browser/dom/debug/ts/by/by.ts region='by_all'}
    */
  def all(): Predicate[DebugNode] = js.native
  /**
    * Match elements by the given CSS selector.
    *
    * @usageNotes
    * ### Example
    *
    * {@example platform-browser/dom/debug/ts/by/by.ts region='by_css'}
    */
  def css(selector: String): Predicate[DebugElement] = js.native
  /**
    * Match nodes that have the given directive present.
    *
    * @usageNotes
    * ### Example
    *
    * {@example platform-browser/dom/debug/ts/by/by.ts region='by_directive'}
    */
  def directive(`type`: Type[_]): Predicate[DebugNode] = js.native
}

