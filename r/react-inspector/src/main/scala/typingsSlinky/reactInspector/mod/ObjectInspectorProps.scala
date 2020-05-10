package typingsSlinky.reactInspector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectInspectorProps
  extends TreeViewProps
     with ThemedComponentProps {
  /**
    * Show non-enumerable properties.
    */
  var showNonenumerable: js.UndefOr[Boolean] = js.native
  /**
    * Sort object keys with optional compare function.
    */
  var sortObjectKeys: js.UndefOr[Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])] = js.native
}

object ObjectInspectorProps {
  @scala.inline
  def apply(): ObjectInspectorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectInspectorProps]
  }
  @scala.inline
  implicit class ObjectInspectorPropsOps[Self <: ObjectInspectorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowNonenumerable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNonenumerable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNonenumerable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNonenumerable")(js.undefined)
        ret
    }
    @scala.inline
    def withSortObjectKeysFunction2(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortObjectKeys")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSortObjectKeys(value: Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortObjectKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortObjectKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortObjectKeys")(js.undefined)
        ret
    }
  }
  
}

