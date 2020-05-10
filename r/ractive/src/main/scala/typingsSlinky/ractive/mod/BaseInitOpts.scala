package typingsSlinky.ractive.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseInitOpts[T /* <: Ractive[T] */] extends BaseParseOpts {
  /** Adaptors to be applied. */
  var adapt: js.UndefOr[js.Array[Adaptor | String]] = js.native
  /** A map of adaptors. */
  var adaptors: js.UndefOr[Registry[Adaptor]] = js.native
  /** If set to false, disallow expressions in the template. */
  var allowExpressions: js.UndefOr[Boolean] = js.native
  /** If true, this instance can occupy the target element with other existing instances rather than cause them to unrender. */
  var append: js.UndefOr[Boolean] = js.native
  /* A map of components */
  var components: js.UndefOr[Registry[Component]] = js.native
  /** A map of computations */
  var computed: js.UndefOr[StringDictionary[Computation[T]]] = js.native
  /** A map of decorators */
  var decorators: js.UndefOr[Registry[Decorator[T]]] = js.native
  /** Whether or not to use event delegation around suitabe iterative sections. Defaults to true. */
  var delegate: js.UndefOr[Boolean] = js.native
  /** A map of easings */
  var easing: js.UndefOr[Registry[Easing]] = js.native
  /** A map of custom events */
  var events: js.UndefOr[Registry[EventPlugin[T]]] = js.native
  /** A map of helper functions */
  var helpers: js.UndefOr[Registry[Helper]] = js.native
  /** A map of interpolators for use with animate */
  var interpolators: js.UndefOr[Registry[Interpolator]] = js.native
  /** Whether or not twoway bindings default to lazy. */
  var `lazy`: js.UndefOr[Boolean] = js.native
  /** Whether or not an element can transition if one of its parent elements is also transitioning. */
  var nestedTransitions: js.UndefOr[Boolean] = js.native
  /** Whether or not to skip element intro transitions when the instance is being renered initially. */
  var noIntro: js.UndefOr[Boolean] = js.native
  /** Whether or not to skip outro transitions when the instance is being unrendered. */
  var noOutro: js.UndefOr[Boolean] = js.native
  /** A map of observers */
  var observe: js.UndefOr[Registry[ObserverCallback[T] | ObserverDescriptor[T]]] = js.native
  /** A map of event listeners */
  var on: js.UndefOr[Registry[ListenerCallback[T] | ListenerDescriptor[T]]] = js.native
  /** A map of partials */
  var partials: js.UndefOr[Registry[Partial]] = js.native
  /** Whether or not to consider instance memners like set when resolving values in the template. */
  var resolveInstanceMembers: js.UndefOr[Boolean] = js.native
  /** Whether or not to invalidate computation dependencies when a computed value or one of its children is set. */
  var syncComputedChildren: js.UndefOr[Boolean] = js.native
  /** The template to use when rendering. */
  var template: js.UndefOr[Template] = js.native
  /** A map of transitions */
  var transitions: js.UndefOr[Registry[Transition]] = js.native
  /** Whether or not to use transitions as elements are added and removed from the DOM. */
  var transitionsEnabled: js.UndefOr[Boolean] = js.native
  /** Whether or not to use twoway bindings by default. */
  var twoway: js.UndefOr[Boolean] = js.native
  /** Whether or not to issue a warning when an ambiguous reference fails to resolve to the immediate context. */
  var warnAboutAmbiguity: js.UndefOr[Boolean] = js.native
}

object BaseInitOpts {
  @scala.inline
  def apply[T](): BaseInitOpts[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseInitOpts[T]]
  }
  @scala.inline
  implicit class BaseInitOptsOps[Self[t] <: BaseInitOpts[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAdapt(value: js.Array[Adaptor | String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdapt: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapt")(js.undefined)
        ret
    }
    @scala.inline
    def withAdaptors(value: Registry[Adaptor]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdaptors: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptors")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowExpressions(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowExpressions: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExpressions")(js.undefined)
        ret
    }
    @scala.inline
    def withAppend(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppend: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.undefined)
        ret
    }
    @scala.inline
    def withComponents(value: Registry[Component]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponents: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(js.undefined)
        ret
    }
    @scala.inline
    def withComputed(value: StringDictionary[Computation[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputed: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computed")(js.undefined)
        ret
    }
    @scala.inline
    def withDecorators(value: Registry[Decorator[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecorators: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorators")(js.undefined)
        ret
    }
    @scala.inline
    def withDelegate(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelegate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegate")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: Registry[Easing]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: Registry[EventPlugin[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withHelpers(value: Registry[Helper]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelpers: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpers")(js.undefined)
        ret
    }
    @scala.inline
    def withInterpolators(value: Registry[Interpolator]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpolators: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolators")(js.undefined)
        ret
    }
    @scala.inline
    def withLazy(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazy: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(js.undefined)
        ret
    }
    @scala.inline
    def withNestedTransitions(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedTransitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestedTransitions: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedTransitions")(js.undefined)
        ret
    }
    @scala.inline
    def withNoIntro(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noIntro")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoIntro: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noIntro")(js.undefined)
        ret
    }
    @scala.inline
    def withNoOutro(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noOutro")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoOutro: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noOutro")(js.undefined)
        ret
    }
    @scala.inline
    def withObserve(value: Registry[ObserverCallback[T] | ObserverDescriptor[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObserve: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observe")(js.undefined)
        ret
    }
    @scala.inline
    def withOn(value: Registry[ListenerCallback[T] | ListenerDescriptor[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOn: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.undefined)
        ret
    }
    @scala.inline
    def withPartials(value: Registry[Partial]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartials: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partials")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveInstanceMembers(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveInstanceMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveInstanceMembers: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveInstanceMembers")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncComputedChildren(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncComputedChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncComputedChildren: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncComputedChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateFunction1(value: /* helper */ ParseHelper => String | (js.Array[js.Object | String]) | ParsedTemplate): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTemplate(value: Template): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitions(value: Registry[Transition]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitions: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitions")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionsEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionsEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withTwoway(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twoway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwoway: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twoway")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnAboutAmbiguity(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnAboutAmbiguity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnAboutAmbiguity: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnAboutAmbiguity")(js.undefined)
        ret
    }
  }
  
}

