package typingsSlinky.jquery.JQuery

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jquery.anon.Add
import typingsSlinky.jquery.anon.BindType
import typingsSlinky.jquery.anon.Default
import typingsSlinky.jquery.anon.DelegateType
import typingsSlinky.jquery.anon.Handle
import typingsSlinky.jquery.anon.NoBubble
import typingsSlinky.jquery.anon.PostDispatch
import typingsSlinky.jquery.anon.PreDispatch
import typingsSlinky.jquery.anon.Remove
import typingsSlinky.jquery.anon.Setup
import typingsSlinky.jquery.anon.Teardown
import typingsSlinky.jquery.anon.Trigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// region Special event hooks
// #region Special event hooks
/**
  * The jQuery special event hooks are a set of per-event-name functions and properties that allow code to control the behavior of event processing within jQuery. The mechanism is similar to `fixHooks` in that the special event information is stored in `jQuery.event.special.NAME`, where `NAME` is the name of the special event. Event names are case sensitive.
  *
  * As with `fixHooks`, the special event hooks design assumes it will be very rare that two unrelated pieces of code want to process the same event name. Special event authors who need to modify events with existing hooks will need to take precautions to avoid introducing unwanted side-effects by clobbering those hooks.
  * @see \`{@link https://learn.jquery.com/events/event-extensions/#special-event-hooks }\`
  */
// Workaround for TypeScript 2.3 which does not have support for weak types handling.
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jquery.anon.NoBubble
  - typingsSlinky.jquery.anon.BindType
  - typingsSlinky.jquery.anon.DelegateType
  - typingsSlinky.jquery.anon.Setup[TTarget, TData]
  - typingsSlinky.jquery.anon.Teardown[TTarget]
  - typingsSlinky.jquery.anon.Add[TTarget, TData]
  - typingsSlinky.jquery.anon.Remove[TTarget, TData]
  - typingsSlinky.jquery.anon.Trigger[TTarget, TData]
  - typingsSlinky.jquery.anon.Default[TTarget, TData]
  - typingsSlinky.jquery.anon.Handle[TTarget, TData]
  - typingsSlinky.jquery.anon.PreDispatch[TTarget]
  - typingsSlinky.jquery.anon.PostDispatch[TTarget]
  - org.scalablytyped.runtime.StringDictionary[scala.Nothing]
*/
trait SpecialEventHook[TTarget, TData] extends js.Object

object SpecialEventHook {
  @scala.inline
  implicit def apply[TTarget, TData](value: Add[TTarget, TData]): SpecialEventHook[TTarget, TData] = value.asInstanceOf[SpecialEventHook[TTarget, TData]]
  @scala.inline
  implicit def apply[TTarget, TData](value: BindType): SpecialEventHook[TTarget, TData] = value.asInstanceOf[SpecialEventHook[TTarget, TData]]
  @scala.inline
  implicit def apply[TTarget, TData](value: Default[TTarget, TData]): SpecialEventHook[TTarget, TData] = value.asInstanceOf[SpecialEventHook[TTarget, TData]]
  @scala.inline
  implicit def apply[TTarget, TData](value: DelegateType): SpecialEventHook[TTarget, TData] = value.asInstanceOf[SpecialEventHook[TTarget, TData]]
  @scala.inline
  implicit def apply[TTarget, TData](value: Handle[TTarget, TData]): SpecialEventHook[TTarget, TData] = value.asInstanceOf[SpecialEventHook[TTarget, TData]]
  @scala.inline
  implicit def apply[TTarget, TData](value: NoBubble): SpecialEventHook[TTarget, TData] = value.asInstanceOf[SpecialEventHook[TTarget, TData]]
  @scala.inline
  implicit def apply[TTarget, TData](value: PostDispatch[TTarget]): SpecialEventHook[TTarget, TData] = value.asInstanceOf[SpecialEventHook[TTarget, TData]]
  @scala.inline
  implicit def apply[TTarget, TData](value: PreDispatch[TTarget]): SpecialEventHook[TTarget, TData] = value.asInstanceOf[SpecialEventHook[TTarget, TData]]
  @scala.inline
  implicit def apply[TTarget, TData](value: Remove[TTarget, TData]): SpecialEventHook[TTarget, TData] = value.asInstanceOf[SpecialEventHook[TTarget, TData]]
  @scala.inline
  implicit def apply[TTarget, TData](value: Setup[TTarget, TData]): SpecialEventHook[TTarget, TData] = value.asInstanceOf[SpecialEventHook[TTarget, TData]]
  @scala.inline
  implicit def apply[TTarget, TData](value: StringDictionary[scala.Nothing]): SpecialEventHook[TTarget, TData] = value.asInstanceOf[SpecialEventHook[TTarget, TData]]
  @scala.inline
  implicit def apply[TTarget, TData](value: Teardown[TTarget]): SpecialEventHook[TTarget, TData] = value.asInstanceOf[SpecialEventHook[TTarget, TData]]
  @scala.inline
  implicit def apply[TTarget, TData](value: Trigger[TTarget, TData]): SpecialEventHook[TTarget, TData] = value.asInstanceOf[SpecialEventHook[TTarget, TData]]
}

