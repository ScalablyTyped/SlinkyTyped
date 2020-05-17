package typingsSlinky.reactFocusLock.interfacesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactFocusLock.anon.ChildrenChildrenType
import typingsSlinky.reactFocusLock.reactFocusLockStrings.tail
import typingsSlinky.std.FocusOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactFocusLockProps[ChildrenType, LockProps] extends js.Object {
  /**
    * @deprecated Use persistentFocus=false instead
    * enables(or disables) text selection. This also allows not to have ANY focus.
    */
  var allowTextSelection: js.UndefOr[Boolean] = js.native
  /**
    * Component to use, defaults to 'div'
    */
  var as: js.UndefOr[String | ReactElement] = js.native
  /**
    * enables or disables autoFocusing feature.
    * If enabled - will move focus inside Lock, selecting the first or autoFocusable element
    * If disable - will blur any focus on Lock activation.
    * @default true
    */
  var autoFocus: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ChildrenType] = js.native
  var className: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * named focus group for focus scattering aka combined lock targets
    */
  var group: js.UndefOr[String] = js.native
  var lockProps: js.UndefOr[LockProps] = js.native
  /**
    * disables hidden inputs before and after the lock.
    */
  var noFocusGuards: js.UndefOr[Boolean | tail] = js.native
  /**
    * life-cycle hook, called on lock activation
    * @param node the observed node
    */
  var onActivation: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  /**
    * life-cycle hook, called on deactivation
    * @param node the observed node
    */
  var onDeactivation: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  /**
    * enables of disables "sticky" behavior, when any focusable element shall be focused.
    * This disallow any text selection on the page.
    * @default false
    */
  var persistentFocus: js.UndefOr[Boolean] = js.native
  var ref: js.UndefOr[Ref[HTMLElement]] = js.native
  /**
    * if true, will return focus to the previous position on trap disable.
    * Optionally, can pass focus options instead of `true` to control the focus
    * more precisely (ie. `{ preventScroll: true }`)
    */
  var returnFocus: js.UndefOr[Boolean | FocusOptions] = js.native
  /**
    * Shards forms a scattered lock, same as `group` does, but in more "low" and controlled way
    */
  var shards: js.UndefOr[js.Array[ReactRef[_] | HTMLElement]] = js.native
  /**
    * Controls focus lock working areas. Lock will silently ignore all the events from `not allowed` areas
    * @param activeElement
    * @returns {Boolean} true if focus lock should handle activeElement, false if not
    */
  var whiteList: js.UndefOr[js.Function1[/* activeElement */ HTMLElement, Boolean]] = js.native
}

object ReactFocusLockProps {
  @scala.inline
  def apply[ChildrenType, LockProps](): ReactFocusLockProps[ChildrenType, LockProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactFocusLockProps[ChildrenType, LockProps]]
  }
  @scala.inline
  implicit class ReactFocusLockPropsOps[Self[childrentype, lockprops] <: ReactFocusLockProps[childrentype, lockprops], ChildrenType, LockProps] (val x: Self[ChildrenType, LockProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ChildrenType, LockProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ChildrenType, LockProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[ChildrenType, LockProps]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[ChildrenType, LockProps]) with Other]
    @scala.inline
    def withAllowTextSelection(value: Boolean): Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTextSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTextSelection: Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTextSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withAsFunctionComponent(value: ReactComponentClass[LockProps with ChildrenChildrenType[ChildrenType]]): Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsComponentClass(value: ReactComponentClass[LockProps with ChildrenChildrenType[ChildrenType]]): Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAs(value: String | ReactElement): Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFocus(value: Boolean): Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: ChildrenType): Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: String): Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withLockProps(value: LockProps): Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockProps: Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockProps")(js.undefined)
        ret
    }
    @scala.inline
    def withNoFocusGuards(value: Boolean | tail): Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noFocusGuards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoFocusGuards: Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noFocusGuards")(js.undefined)
        ret
    }
    @scala.inline
    def withOnActivation(value: /* node */ HTMLElement => Unit): Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnActivation: Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivation")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDeactivation(value: /* node */ HTMLElement => Unit): Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeactivation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDeactivation: Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeactivation")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentFocus(value: Boolean): Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistentFocus: Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withRefRefObject(value: ReactRef[HTMLElement]): Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRef(value: Ref[HTMLElement]): Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
    @scala.inline
    def withRefNull: Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(null)
        ret
    }
    @scala.inline
    def withReturnFocus(value: Boolean | FocusOptions): Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnFocus: Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withShards(value: js.Array[ReactRef[_] | HTMLElement]): Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShards: Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shards")(js.undefined)
        ret
    }
    @scala.inline
    def withWhiteList(value: /* activeElement */ HTMLElement => Boolean): Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWhiteList: Self[ChildrenType, LockProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteList")(js.undefined)
        ret
    }
  }
  
}

