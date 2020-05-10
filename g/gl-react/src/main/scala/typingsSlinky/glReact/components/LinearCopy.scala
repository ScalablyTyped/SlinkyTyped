package typingsSlinky.glReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.glReact.mod.LinearCopyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LinearCopy {
  @JSImport("gl-react", "LinearCopy")
  @js.native
  object component extends js.Object
  
  def withProps(p: LinearCopyProps): Default[tag.type, typingsSlinky.glReact.mod.LinearCopy] = new Default[tag.type, typingsSlinky.glReact.mod.LinearCopy](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: LinearCopy.type): Default[tag.type, typingsSlinky.glReact.mod.LinearCopy] = new Default[tag.type, typingsSlinky.glReact.mod.LinearCopy](js.Array(this.component, js.Dictionary.empty))()
}

