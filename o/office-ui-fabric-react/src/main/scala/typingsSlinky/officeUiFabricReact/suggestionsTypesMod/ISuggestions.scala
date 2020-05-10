package typingsSlinky.officeUiFabricReact.suggestionsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestions[T] extends js.Object {
  /** Execute the action selected. Can be SearchMore or ForceResolve actions. */
  def executeSelectedAction(): Unit = js.native
  /** Focus on the ForceResolve action above the suggestions. If not available then focus on SearchMore action. */
  def focusAboveSuggestions(): Unit = js.native
  /** Focus on the SearchMore action below the suggestions. If not available then focus on ForceResolve action. */
  def focusBelowSuggestions(): Unit = js.native
  /** Focus the SearchMore action button. */
  def focusSearchForMoreButton(): Unit = js.native
  /** Whether it has any suggested actions like ForceResolve or SearchMore. */
  def hasSuggestedAction(): Boolean = js.native
  /** Whether any of the suggested actions (ForceResolve or SearchMore) is selected. */
  def hasSuggestedActionSelected(): Boolean = js.native
  /** Returns true if the event was handled, false otherwise. */
  def tryHandleKeyDown(keyCode: Double, currentSuggestionIndex: Double): Boolean = js.native
}

object ISuggestions {
  @scala.inline
  def apply[T](
    executeSelectedAction: () => Unit,
    focusAboveSuggestions: () => Unit,
    focusBelowSuggestions: () => Unit,
    focusSearchForMoreButton: () => Unit,
    hasSuggestedAction: () => Boolean,
    hasSuggestedActionSelected: () => Boolean,
    tryHandleKeyDown: (Double, Double) => Boolean
  ): ISuggestions[T] = {
    val __obj = js.Dynamic.literal(executeSelectedAction = js.Any.fromFunction0(executeSelectedAction), focusAboveSuggestions = js.Any.fromFunction0(focusAboveSuggestions), focusBelowSuggestions = js.Any.fromFunction0(focusBelowSuggestions), focusSearchForMoreButton = js.Any.fromFunction0(focusSearchForMoreButton), hasSuggestedAction = js.Any.fromFunction0(hasSuggestedAction), hasSuggestedActionSelected = js.Any.fromFunction0(hasSuggestedActionSelected), tryHandleKeyDown = js.Any.fromFunction2(tryHandleKeyDown))
    __obj.asInstanceOf[ISuggestions[T]]
  }
  @scala.inline
  implicit class ISuggestionsOps[Self[t] <: ISuggestions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withExecuteSelectedAction(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeSelectedAction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFocusAboveSuggestions(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusAboveSuggestions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFocusBelowSuggestions(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusBelowSuggestions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFocusSearchForMoreButton(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusSearchForMoreButton")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasSuggestedAction(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSuggestedAction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasSuggestedActionSelected(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSuggestedActionSelected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTryHandleKeyDown(value: (Double, Double) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryHandleKeyDown")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

