package typingsSlinky.jsnox.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * JSnoX requires an object with a createElement method.
  * This will normally be the React object but could be something else
  */
@js.native
trait ReactLikeObject extends js.Object {
  def createElement[P](`type`: String, props: P, children: TagMod[Any]): ReactElement = js.native
  def createElement[P](`type`: ComponentClass[P, ComponentState], props: P, children: TagMod[Any]): ReactElement = js.native
}

