package typingsSlinky.reactTable.anon

import typingsSlinky.reactTable.mod.HeaderProps
import typingsSlinky.reactTable.mod.IdType
import typingsSlinky.reactTable.mod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id[D /* <: js.Object */] extends js.Object {
  var Header: Renderer[HeaderProps[D]]
  var id: IdType[D]
}

object Id {
  @scala.inline
  def apply[D](Header: Renderer[HeaderProps[D]], id: IdType[D]): Id[D] = {
    val __obj = js.Dynamic.literal(Header = Header.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id[D]]
  }
}

