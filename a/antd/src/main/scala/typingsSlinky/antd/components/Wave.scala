package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.AnonInsertExtraNode
import typingsSlinky.antd.waveMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Wave {
  @JSImport("antd/lib/_util/wave", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def insertExtraNode(value: Boolean): this.type = set("insertExtraNode", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AnonInsertExtraNode): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Wave.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

