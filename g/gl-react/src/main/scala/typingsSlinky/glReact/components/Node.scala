package typingsSlinky.glReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.glReact.anon.Color
import typingsSlinky.glReact.anon.Dst
import typingsSlinky.glReact.mod.NodeProps
import typingsSlinky.glReact.mod.ShaderDefinition
import typingsSlinky.glReact.mod.ShaderIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Node {
  @JSImport("gl-react", "Node")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.glReact.mod.Node] {
    @scala.inline
    def backbuffering(value: Boolean): this.type = set("backbuffering", value.asInstanceOf[js.Any])
    @scala.inline
    def blendFunc(value: Dst): this.type = set("blendFunc", value.asInstanceOf[js.Any])
    @scala.inline
    def clear(value: Color): this.type = set("clear", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def ignoreUnusedUniforms(value: js.Array[String] | Boolean): this.type = set("ignoreUnusedUniforms", value.asInstanceOf[js.Any])
    @scala.inline
    def onDraw(value: () => Unit): this.type = set("onDraw", js.Any.fromFunction0(value))
    @scala.inline
    def sync(value: Boolean): this.type = set("sync", value.asInstanceOf[js.Any])
    @scala.inline
    def uniformsOptions(value: js.Any): this.type = set("uniformsOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NodeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(shader: ShaderIdentifier | ShaderDefinition): Builder = {
    val __props = js.Dynamic.literal(shader = shader.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NodeProps]))
  }
}

