package typingsSlinky.officeUiFabricReact.ikeytiptreenodeMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeytipTreeNode extends js.Object {
  /**
    * List of keytip IDs that should become visible when this keytip is pressed, can be empty
    */
  var children: js.Array[String] = js.native
  /**
    * T/F if this keytip's component is currently disabled
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not this keytip will have children keytips that are dynamically created (DOM is generated on
    * keytip activation). Common cases are keytips in a menu or modal.
    */
  var hasDynamicChildren: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not this keytip belongs to a component that has a menu
    * Keytip mode will stay on when a menu is opened, even if the items in that menu have no keytips
    */
  var hasMenu: js.UndefOr[Boolean] = js.native
  /**
    * ID of the <Keytip> DOM element. Needed to locate the correct keytip in the KeytipLayer's 'keytip' state array
    */
  var id: String = js.native
  /**
    * KeySequence that invokes this KeytipTreeNode's onExecute function
    */
  var keySequences: js.Array[String] = js.native
  /**
    * Control's execute function for when keytip is invoked, passed from the component to the Manager in the IKeytipProps
    */
  var onExecute: js.UndefOr[
    js.Function2[/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null, Unit]
  ] = js.native
  /**
    * Function to execute when we return to this keytip
    */
  var onReturn: js.UndefOr[
    js.Function2[/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null, Unit]
  ] = js.native
  /**
    * Overflow set sequence for this keytip
    */
  var overflowSetSequence: js.UndefOr[js.Array[String]] = js.native
  /**
    * Parent keytip ID
    */
  var parent: String = js.native
  /**
    * T/F if this keytip is a persisted keytip
    */
  var persisted: js.UndefOr[Boolean] = js.native
}

object IKeytipTreeNode {
  @scala.inline
  def apply(children: js.Array[String], id: String, keySequences: js.Array[String], parent: String): IKeytipTreeNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keySequences = keySequences.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipTreeNode]
  }
  @scala.inline
  implicit class IKeytipTreeNodeOps[Self <: IKeytipTreeNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeySequences(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySequences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHasDynamicChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDynamicChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasDynamicChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDynamicChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withHasMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExecute(value: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExecute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnExecute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExecute")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReturn(value: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReturn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnReturn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReturn")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowSetSequence(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowSetSequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowSetSequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowSetSequence")(js.undefined)
        ret
    }
    @scala.inline
    def withPersisted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persisted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersisted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persisted")(js.undefined)
        ret
    }
  }
  
}

