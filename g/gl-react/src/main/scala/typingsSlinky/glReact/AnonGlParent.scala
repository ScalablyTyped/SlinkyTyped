package typingsSlinky.glReact

import typingsSlinky.glReact.mod.Node
import typingsSlinky.glReact.mod.Surface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGlParent extends js.Object {
  var glParent: Surface[_] | Node
  var glSurface: Surface[_]
}

object AnonGlParent {
  @scala.inline
  def apply(glParent: Surface[_] | Node, glSurface: Surface[_]): AnonGlParent = {
    val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any], glSurface = glSurface.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGlParent]
  }
}

