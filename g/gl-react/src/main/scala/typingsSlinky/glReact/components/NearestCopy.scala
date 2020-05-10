package typingsSlinky.glReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.glReact.mod.NearestCopyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NearestCopy {
  @JSImport("gl-react", "NearestCopy")
  @js.native
  object component extends js.Object
  
  def withProps(p: NearestCopyProps): Default[tag.type, typingsSlinky.glReact.mod.NearestCopy] = new Default[tag.type, typingsSlinky.glReact.mod.NearestCopy](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: NearestCopy.type): Default[tag.type, typingsSlinky.glReact.mod.NearestCopy] = new Default[tag.type, typingsSlinky.glReact.mod.NearestCopy](js.Array(this.component, js.Dictionary.empty))()
}

