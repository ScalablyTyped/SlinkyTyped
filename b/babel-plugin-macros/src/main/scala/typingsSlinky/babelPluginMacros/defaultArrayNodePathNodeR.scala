package typingsSlinky.babelPluginMacros

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.babelCore.mod.NodePath
import typingsSlinky.babelTraverse.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  default  :std.Array<@babel/core.@babel/core.NodePath<@babel/traverse.@babel/traverse.Node>>} & babel-plugin-macros.babel-plugin-macros.References */
@js.native
trait defaultArrayNodePathNodeR
  extends /* key */ StringDictionary[js.Array[NodePath[Node]]] {
  var default: js.Array[NodePath[Node]] = js.native
}

object defaultArrayNodePathNodeR {
  @scala.inline
  def apply(default: js.Array[NodePath[Node]]): defaultArrayNodePathNodeR = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultArrayNodePathNodeR]
  }
  @scala.inline
  implicit class defaultArrayNodePathNodeROps[Self <: defaultArrayNodePathNodeR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: js.Array[NodePath[Node]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

