package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * View instance data.
  * Attention: Adding fields to this is performance sensitive!
  */
@js.native
trait ViewData extends js.Object {
  var component: js.Any = js.native
  var context: js.Any = js.native
  var `def`: ɵViewDefinition = js.native
  var disposables: js.Array[DisposableFn] | Null = js.native
  var initIndex: Double = js.native
  var nodes: NumberDictionary[NodeData] = js.native
  var oldValues: js.Array[_] = js.native
  var parent: ViewData | Null = js.native
  var parentNodeDef: NodeDef | Null = js.native
  var renderer: Renderer2 = js.native
  var root: RootData = js.native
  var state: ViewState = js.native
  var viewContainerParent: ViewData | Null = js.native
}

object ViewData {
  @scala.inline
  def apply(
    component: js.Any,
    context: js.Any,
    `def`: ɵViewDefinition,
    initIndex: Double,
    nodes: NumberDictionary[NodeData],
    oldValues: js.Array[_],
    renderer: Renderer2,
    root: RootData,
    state: ViewState
  ): ViewData = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], initIndex = initIndex.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], oldValues = oldValues.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewData]
  }
  @scala.inline
  implicit class ViewDataOps[Self <: ViewData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDef(value: ɵViewDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("def")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodes(value: NumberDictionary[NodeData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldValues(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderer(value: Renderer2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: RootData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: ViewState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisposables(value: js.Array[DisposableFn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisposablesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposables")(null)
        ret
    }
    @scala.inline
    def withParent(value: ViewData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(null)
        ret
    }
    @scala.inline
    def withParentNodeDef(value: NodeDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNodeDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentNodeDefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNodeDef")(null)
        ret
    }
    @scala.inline
    def withViewContainerParent(value: ViewData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewContainerParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewContainerParentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewContainerParent")(null)
        ret
    }
  }
  
}

