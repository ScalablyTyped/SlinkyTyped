package typingsSlinky.babylonWalk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait jsxVisitors[V] extends js.Object {
  var JSXAttribute: js.UndefOr[V] = js.native
  var JSXClosingElement: js.UndefOr[V] = js.native
  var JSXElement: js.UndefOr[V] = js.native
  var JSXEmptyExpression: js.UndefOr[V] = js.native
  var JSXExpressionContainer: js.UndefOr[V] = js.native
  var JSXIdentifier: js.UndefOr[V] = js.native
  var JSXMemberExpression: js.UndefOr[V] = js.native
  var JSXNamespacedName: js.UndefOr[V] = js.native
  var JSXOpeningElement: js.UndefOr[V] = js.native
  var JSXSpreadAttribute: js.UndefOr[V] = js.native
  var JSXText: js.UndefOr[V] = js.native
}

object jsxVisitors {
  @scala.inline
  def apply[V](): jsxVisitors[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[jsxVisitors[V]]
  }
  @scala.inline
  implicit class jsxVisitorsOps[Self[v] <: jsxVisitors[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withJSXAttribute(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSXAttribute: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withJSXClosingElement(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXClosingElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSXClosingElement: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXClosingElement")(js.undefined)
        ret
    }
    @scala.inline
    def withJSXElement(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSXElement: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXElement")(js.undefined)
        ret
    }
    @scala.inline
    def withJSXEmptyExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXEmptyExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSXEmptyExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXEmptyExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withJSXExpressionContainer(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXExpressionContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSXExpressionContainer: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXExpressionContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withJSXIdentifier(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSXIdentifier: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withJSXMemberExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXMemberExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSXMemberExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXMemberExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withJSXNamespacedName(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXNamespacedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSXNamespacedName: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXNamespacedName")(js.undefined)
        ret
    }
    @scala.inline
    def withJSXOpeningElement(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXOpeningElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSXOpeningElement: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXOpeningElement")(js.undefined)
        ret
    }
    @scala.inline
    def withJSXSpreadAttribute(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXSpreadAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSXSpreadAttribute: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXSpreadAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withJSXText(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSXText: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSXText")(js.undefined)
        ret
    }
  }
  
}

