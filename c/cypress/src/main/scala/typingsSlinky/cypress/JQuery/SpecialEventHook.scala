package typingsSlinky.cypress.JQuery

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cypress.anon.BindType
import typingsSlinky.cypress.anon.Default
import typingsSlinky.cypress.anon.DelegateType
import typingsSlinky.cypress.anon.Handle
import typingsSlinky.cypress.anon.NoBubble
import typingsSlinky.cypress.anon.PostDispatch
import typingsSlinky.cypress.anon.PreDispatch
import typingsSlinky.cypress.anon.Remove
import typingsSlinky.cypress.anon.Setup
import typingsSlinky.cypress.anon.Teardown
import typingsSlinky.cypress.anon.Trigger
import typingsSlinky.cypress.anon.`2`
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
  - typingsSlinky.cypress.anon.NoBubble
  - typingsSlinky.cypress.anon.BindType
  - typingsSlinky.cypress.anon.DelegateType
  - typingsSlinky.cypress.anon.Setup[TTarget, TData]
  - typingsSlinky.cypress.anon.Teardown[TTarget]
  - typingsSlinky.cypress.anon.`2`[TTarget, TData]
  - typingsSlinky.cypress.anon.Remove[TTarget, TData]
  - typingsSlinky.cypress.anon.Trigger[TTarget, TData]
  - typingsSlinky.cypress.anon.Default[TTarget, TData]
  - typingsSlinky.cypress.anon.Handle[TTarget, TData]
  - typingsSlinky.cypress.anon.PreDispatch[TTarget]
  - typingsSlinky.cypress.anon.PostDispatch[TTarget]
  - org.scalablytyped.runtime.StringDictionary[scala.Nothing]
*/
trait SpecialEventHook[TTarget, TData] extends js.Object

object SpecialEventHook {
  @scala.inline
  implicit def apply[TTarget, TData](value: `2`[TTarget, TData]): SpecialEventHook[TTarget, TData] = value.asInstanceOf[SpecialEventHook[TTarget, TData]]
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

