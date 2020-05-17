package typingsSlinky.ngxInfiniteScroll.modelsMod

import org.scalajs.dom.raw.Window
import typingsSlinky.angularCore.mod.ElementRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Window
  - typingsSlinky.angularCore.mod.ElementRef[js.Any]
  - js.Any
*/
trait ContainerRef extends js.Object

object ContainerRef {
  @scala.inline
  implicit def apply(value: js.Any): ContainerRef = value.asInstanceOf[ContainerRef]
  @scala.inline
  implicit def apply(value: ElementRef[js.Any]): ContainerRef = value.asInstanceOf[ContainerRef]
  @scala.inline
  implicit def apply(value: Window): ContainerRef = value.asInstanceOf[ContainerRef]
}

