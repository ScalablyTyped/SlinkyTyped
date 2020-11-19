package typingsSlinky.preact.internalMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.std.HTMLElement
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreactElement extends HTMLElement {
  
  var _children: js.UndefOr[VNode[_] | Null] = js.native
  
  /** Event listeners to support event delegation */
  var _listeners: Record[String, js.Function1[/* e */ Event, Unit]] = js.native
  
  // style: HTMLElement["style"]; // From HTMLElement
  var data: js.UndefOr[String | Double] = js.native
  
  // Preact uses this attribute to detect SVG nodes
  var ownerSVGElement: js.UndefOr[SVGElement | Null] = js.native
}
