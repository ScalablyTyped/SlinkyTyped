package typingsSlinky.recompose.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "createEagerElement")
@js.native
object createEagerElement extends js.Object {
  def apply(`type`: String): ReactElement = js.native
  def apply(`type`: String, props: js.Object): ReactElement = js.native
  def apply(`type`: String, props: js.Object, children: TagMod[Any]): ReactElement = js.native
  def apply(`type`: ComponentType[_]): ReactElement = js.native
  def apply(`type`: ComponentType[_], props: js.Object): ReactElement = js.native
  def apply(`type`: ComponentType[_], props: js.Object, children: TagMod[Any]): ReactElement = js.native
}

