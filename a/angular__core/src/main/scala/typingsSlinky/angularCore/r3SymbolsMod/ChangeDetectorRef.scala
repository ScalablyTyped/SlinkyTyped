package typingsSlinky.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base class that provides change detection functionality.
  * A change-detection tree collects all views that are to be checked for changes.
  * Use the methods to add and remove views from the tree, initiate change-detection,
  * and explicitly mark views as _dirty_, meaning that they have changed and need to be re-rendered.
  *
  * @see [Using change detection hooks](guide/lifecycle-hooks#using-change-detection-hooks)
  * @see [Defining custom change detection](guide/lifecycle-hooks#defining-custom-change-detection)
  *
  * @usageNotes
  *
  * The following examples demonstrate how to modify default change-detection behavior
  * to perform explicit detection when needed.
  *
  * ### Use `markForCheck()` with `CheckOnce` strategy
  *
  * The following example sets the `OnPush` change-detection strategy for a component
  * (`CheckOnce`, rather than the default `CheckAlways`), then forces a second check
  * after an interval. See [live demo](http://plnkr.co/edit/GC512b?p=preview).
  *
  * <code-example path="core/ts/change_detect/change-detection.ts"
  * region="mark-for-check"></code-example>
  *
  * ### Detach change detector to limit how often check occurs
  *
  * The following example defines a component with a large list of read-only data
  * that is expected to change constantly, many times per second.
  * To improve performance, we want to check and update the list
  * less often than the changes actually occur. To do that, we detach
  * the component's change detector and perform an explicit local check every five seconds.
  *
  * <code-example path="core/ts/change_detect/change-detection.ts" region="detach"></code-example>
  *
  *
  * ### Reattaching a detached component
  *
  * The following example creates a component displaying live data.
  * The component detaches its change detector from the main change detector tree
  * when the `live` property is set to false, and reattaches it when the property
  * becomes true.
  *
  * <code-example path="core/ts/change_detect/change-detection.ts" region="reattach"></code-example>
  *
  * @publicApi
  */
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCheckNoChanges(value: () => Unit): Self = this.set("checkNoChanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDetach(value: () => Unit): Self = this.set("detach", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDetectChanges(value: () => Unit): Self = this.set("detectChanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMarkForCheck(value: () => Unit): Self = this.set("markForCheck", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReattach(value: () => Unit): Self = this.set("reattach", js.Any.fromFunction0(value))
  }
}
