package typingsSlinky.mithril.anon

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.mithril.mod.CVnode
import typingsSlinky.mithril.mod.ClassComponent
import typingsSlinky.mithril.mod.ComponentTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instantiable[A]
  extends ComponentTypes[A, js.Any]
     with Instantiable1[/* vnode */ CVnode[A], ClassComponent[A]]

