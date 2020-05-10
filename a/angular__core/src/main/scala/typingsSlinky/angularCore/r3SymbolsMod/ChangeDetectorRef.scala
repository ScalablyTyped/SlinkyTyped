package typingsSlinky.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeDetectorRef extends js.Object {
  /**
    * Checks the change detector and its children, and throws if any changes are detected.
    *
    * Use in development mode to verify that running change detection doesn't introduce
    * other changes.
    */
  def checkNoChanges(): Unit = js.native
  /**
    * Detaches this view from the change-detection tree.
    * A detached view is  not checked until it is reattached.
    * Use in combination with `detectChanges()` to implement local change detection checks.
    *
    * Detached views are not checked during change detection runs until they are
    * re-attached, even if they are marked as dirty.
    *
    * <!-- TODO: Add a link to a chapter on detach/reattach/local digest -->
    * <!-- TODO: Add a live demo once ref.detectChanges is merged into master -->
    *
    */
  def detach(): Unit = js.native
  /**
    * Checks this view and its children. Use in combination with {@link ChangeDetectorRef#detach
    * detach}
    * to implement local change detection checks.
    *
    * <!-- TODO: Add a link to a chapter on detach/reattach/local digest -->
    * <!-- TODO: Add a live demo once ref.detectChanges is merged into master -->
    *
    */
  def detectChanges(): Unit = js.native
  /**
    * When a view uses the {@link ChangeDetectionStrategy#OnPush OnPush} (checkOnce)
    * change detection strategy, explicitly marks the view as changed so that
    * it can be checked again.
    *
    * Components are normally marked as dirty (in need of rerendering) when inputs
    * have changed or events have fired in the view. Call this method to ensure that
    * a component is checked even if these triggers have not occured.
    *
    * <!-- TODO: Add a link to a chapter on OnPush components -->
    *
    */
  def markForCheck(): Unit = js.native
  /**
    * Re-attaches the previously detached view to the change detection tree.
    * Views are attached to the tree by default.
    *
    * <!-- TODO: Add a link to a chapter on detach/reattach/local digest -->
    *
    */
  def reattach(): Unit = js.native
}

object ChangeDetectorRef {
  @scala.inline
  def apply(
    checkNoChanges: () => Unit,
    detach: () => Unit,
    detectChanges: () => Unit,
    markForCheck: () => Unit,
    reattach: () => Unit
  ): ChangeDetectorRef = {
    val __obj = js.Dynamic.literal(checkNoChanges = js.Any.fromFunction0(checkNoChanges), detach = js.Any.fromFunction0(detach), detectChanges = js.Any.fromFunction0(detectChanges), markForCheck = js.Any.fromFunction0(markForCheck), reattach = js.Any.fromFunction0(reattach))
    __obj.asInstanceOf[ChangeDetectorRef]
  }
  @scala.inline
  implicit class ChangeDetectorRefOps[Self <: ChangeDetectorRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckNoChanges(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkNoChanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDetach(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detach")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDetectChanges(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectChanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMarkForCheck(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markForCheck")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReattach(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reattach")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

