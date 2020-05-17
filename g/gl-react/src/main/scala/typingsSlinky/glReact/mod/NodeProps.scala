package typingsSlinky.glReact.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.glReact.anon.Color
import typingsSlinky.glReact.anon.Dst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeProps extends js.Object {
  var backbuffering: js.UndefOr[Boolean] = js.native
  var blendFunc: js.UndefOr[Dst] = js.native
  var children: js.UndefOr[js.Any] = js.native
  var clear: js.UndefOr[Color] = js.native
  var height: js.UndefOr[Double] = js.native
  var ignoreUnusedUniforms: js.UndefOr[js.Array[String] | Boolean] = js.native
  var onDraw: js.UndefOr[js.Function0[Unit]] = js.native
  var shader: ShaderIdentifier | ShaderDefinition = js.native
  var sync: js.UndefOr[Boolean] = js.native
  var uniforms: js.UndefOr[StringDictionary[js.Any]] = js.native
  var uniformsOptions: js.UndefOr[js.Any] = js.native
  var width: js.UndefOr[Double] = js.native
}

object NodeProps {
  @scala.inline
  def apply(shader: ShaderIdentifier | ShaderDefinition): NodeProps = {
    val __obj = js.Dynamic.literal(shader = shader.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProps]
  }
  @scala.inline
  implicit class NodePropsOps[Self <: NodeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShader(value: ShaderIdentifier | ShaderDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackbuffering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backbuffering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackbuffering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backbuffering")(js.undefined)
        ret
    }
    @scala.inline
    def withBlendFunc(value: Dst): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlendFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClear(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUnusedUniforms(value: js.Array[String] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnusedUniforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUnusedUniforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnusedUniforms")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDraw(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDraw")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDraw")(js.undefined)
        ret
    }
    @scala.inline
    def withSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(js.undefined)
        ret
    }
    @scala.inline
    def withUniforms(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(js.undefined)
        ret
    }
    @scala.inline
    def withUniformsOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniformsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniformsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniformsOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

