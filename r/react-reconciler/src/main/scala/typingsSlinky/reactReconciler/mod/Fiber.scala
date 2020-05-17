package typingsSlinky.reactReconciler.mod

import typingsSlinky.reactReconciler.anon.StringRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// react-reconciler/ReactFiber
// A Fiber is work on a Component that needs to be done or was done. There can
// be more than one per component.
@js.native
trait Fiber extends js.Object {
  // Conceptual aliases
  // workInProgress : Fiber ->  alternate The alternate used for reuse happens
  // to be the same as work in progress.
  // __DEV__ only
  var _debugID: js.UndefOr[Double] = js.native
  var _debugIsCurrentlyTiming: js.UndefOr[Boolean] = js.native
  var _debugOwner: js.UndefOr[Fiber | Null] = js.native
  var _debugSource: js.UndefOr[Source | Null] = js.native
  // Time spent rendering this Fiber and its descendants for the current update.
  // This tells us how well the tree makes use of sCU for memoization.
  // It is reset to 0 each time we render and only updated when we don't bailout.
  // This field is only set when the enableProfilerTimer flag is enabled.
  var actualDuration: js.UndefOr[Double] = js.native
  // If the Fiber is currently active in the "render" phase,
  // This marks the time at which the work began.
  // This field is only set when the enableProfilerTimer flag is enabled.
  var actualStartTime: js.UndefOr[Double] = js.native
  // This is a pooled version of a Fiber. Every fiber that gets updated will
  // eventually have a pair. There are cases when we can clean up pairs to save
  // memory if we need to.
  var alternate: Fiber | Null = js.native
  // Singly Linked List Tree Structure.
  var child: Fiber | Null = js.native
  // This is used to quickly determine if a subtree has no pending changes.
  var childExpirationTime: ExpirationTime = js.native
  // Effect
  var effectTag: SideEffectTag = js.native
  // The value of element.type which is used to preserve the identity during
  // reconciliation of this child.
  var elementType: js.Any = js.native
  // Represents a time in the future by which this work should be completed.
  // Does not include work found in its subtree.
  var expirationTime: ExpirationTime = js.native
  // A linked-list of contexts that this fiber depends on
  var firstContextDependency: ContextDependency[_] | Null = js.native
  // The first and last fiber with side-effect within this subtree. This allows
  // us to reuse a slice of the linked list when we reuse the work done within
  // this fiber.
  var firstEffect: Fiber | Null = js.native
  var index: Double = js.native
  // Unique identifier of this child.
  var key: Null | String = js.native
  var lastEffect: Fiber | Null = js.native
   // This type will be more specific once we overload the tag.
  var memoizedProps: js.Any = js.native
  // The state used to create the output
  var memoizedState: js.Any = js.native
  // Bitfield that describes properties about the fiber and its subtree. E.g.
  // the ConcurrentMode flag indicates whether the subtree should be async-by-
  // default. When a fiber is created, it inherits the mode of its
  // parent. Additional flags can be set at creation time, but after that the
  // value should remain unchanged throughout the fiber's lifetime, particularly
  // before its child fibers are created.
  var mode: TypeOfMode = js.native
  // Singly linked list fast path to the next fiber with side-effects.
  var nextEffect: Fiber | Null = js.native
  // Input is the data coming into process this fiber. Arguments. Props.
  var pendingProps: js.Any = js.native
  // The ref last used to attach this node.
  // I'll avoid adding an owner field for prod and model that as functions.
  var ref: Null | ((js.Function1[/* handle */ js.Any, Unit]) with StringRef) | RefObject = js.native
  // Conceptual aliases
  // parent : Instance -> return The parent happens to be the same as the
  // return fiber since we've merged the fiber and instance.
  // Remaining fields belong to Fiber
  // The Fiber to return to after finishing processing this one.
  // This is effectively the parent, but there can be multiple parents (two)
  // so this is only the parent of the thing we're currently processing.
  // It is conceptually the same as the return address of a stack frame.
  var `return`: Fiber | Null = js.native
  // Duration of the most recent render time for this Fiber.
  // This value is not updated when we bailout for memoization purposes.
  // This field is only set when the enableProfilerTimer flag is enabled.
  var selfBaseDuration: js.UndefOr[Double] = js.native
  var sibling: Fiber | Null = js.native
  // The local state associated with this fiber.
  var stateNode: js.Any = js.native
  // These first fields are conceptually members of an Instance. This used to
  // be split into a separate type and intersected with the other Fiber fields,
  // but until Flow fixes its intersection bugs, we've merged them into a
  // single type.
  // An Instance is shared between all versions of a component. We can easily
  // break this out into a separate object to avoid copying so much to the
  // alternate versions of the tree. We put this on a single object for now to
  // minimize the number of objects created during the initial render.
  // Tag identifying the type of fiber.
  var tag: WorkTag = js.native
  // Sum of base times for all descedents of this Fiber.
  // This value bubbles up during the "complete" phase.
  // This field is only set when the enableProfilerTimer flag is enabled.
  var treeBaseDuration: js.UndefOr[Double] = js.native
  // The resolved function/class/ associated with this fiber.
  var `type`: js.Any = js.native
   // The props used to create the output.
  // A queue of state updates and callbacks.
  var updateQueue: UpdateQueue[_] | Null = js.native
}

object Fiber {
  @scala.inline
  def apply(
    childExpirationTime: ExpirationTime,
    effectTag: SideEffectTag,
    elementType: js.Any,
    expirationTime: ExpirationTime,
    index: Double,
    memoizedProps: js.Any,
    memoizedState: js.Any,
    mode: TypeOfMode,
    pendingProps: js.Any,
    stateNode: js.Any,
    tag: WorkTag,
    `type`: js.Any
  ): Fiber = {
    val __obj = js.Dynamic.literal(childExpirationTime = childExpirationTime.asInstanceOf[js.Any], effectTag = effectTag.asInstanceOf[js.Any], elementType = elementType.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], memoizedProps = memoizedProps.asInstanceOf[js.Any], memoizedState = memoizedState.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], pendingProps = pendingProps.asInstanceOf[js.Any], stateNode = stateNode.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fiber]
  }
  @scala.inline
  implicit class FiberOps[Self <: Fiber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildExpirationTime(value: ExpirationTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childExpirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffectTag(value: SideEffectTag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElementType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationTime(value: ExpirationTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemoizedProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoizedProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemoizedState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoizedState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: TypeOfMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPendingProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateNode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: WorkTag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_debugID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_debugID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_debugID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_debugID")(js.undefined)
        ret
    }
    @scala.inline
    def with_debugIsCurrentlyTiming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_debugIsCurrentlyTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_debugIsCurrentlyTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_debugIsCurrentlyTiming")(js.undefined)
        ret
    }
    @scala.inline
    def with_debugOwner(value: Fiber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_debugOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_debugOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_debugOwner")(js.undefined)
        ret
    }
    @scala.inline
    def with_debugOwnerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_debugOwner")(null)
        ret
    }
    @scala.inline
    def with_debugSource(value: Source): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_debugSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_debugSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_debugSource")(js.undefined)
        ret
    }
    @scala.inline
    def with_debugSourceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_debugSource")(null)
        ret
    }
    @scala.inline
    def withActualDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActualDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withActualStartTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActualStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withAlternate(value: Fiber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlternateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternate")(null)
        ret
    }
    @scala.inline
    def withChild(value: Fiber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(null)
        ret
    }
    @scala.inline
    def withFirstContextDependency(value: ContextDependency[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstContextDependency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstContextDependencyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstContextDependency")(null)
        ret
    }
    @scala.inline
    def withFirstEffect(value: Fiber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstEffectNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstEffect")(null)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(null)
        ret
    }
    @scala.inline
    def withLastEffect(value: Fiber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastEffectNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastEffect")(null)
        ret
    }
    @scala.inline
    def withNextEffect(value: Fiber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextEffectNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextEffect")(null)
        ret
    }
    @scala.inline
    def withRef(value: ((js.Function1[/* handle */ js.Any, Unit]) with StringRef) | RefObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(null)
        ret
    }
    @scala.inline
    def withReturn(value: Fiber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return")(null)
        ret
    }
    @scala.inline
    def withSelfBaseDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfBaseDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfBaseDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfBaseDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSibling(value: Fiber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSiblingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sibling")(null)
        ret
    }
    @scala.inline
    def withTreeBaseDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeBaseDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeBaseDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeBaseDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateQueue(value: UpdateQueue[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateQueueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateQueue")(null)
        ret
    }
  }
  
}

