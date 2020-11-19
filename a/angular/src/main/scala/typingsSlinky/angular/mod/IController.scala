package typingsSlinky.angular.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Directive controllers have a well-defined lifecycle. Each controller can implement "lifecycle hooks". These are methods that
  * will be called by Angular at certain points in the life cycle of the directive.
  * https://docs.angularjs.org/api/ng/service/$compile#life-cycle-hooks
  * https://docs.angularjs.org/guide/component
  */
@js.native
trait IController
  extends /**
  * Indexer which should return ng.INgModelController for most properties but cannot because of "All named properties must be assignable to string indexer type" constraint - see https://github.com/Microsoft/TypeScript/issues/272
  */
/* name */ StringDictionary[js.Any] {
  
  /**
    * Called on each turn of the digest cycle. Provides an opportunity to detect and act on changes.
    * Any actions that you wish to take in response to the changes that you detect must be invoked from this hook;
    * implementing this has no effect on when `$onChanges` is called. For example, this hook could be useful if you wish
    * to perform a deep equality check, or to check a `Dat`e object, changes to which would not be detected by Angular's
    * change detector and thus not trigger `$onChanges`. This hook is invoked with no arguments; if detecting changes,
    * you must store the previous value(s) for comparison to the current values.
    */
  @JSName("$doCheck")
  var $doCheck: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Called whenever one-way bindings are updated. The onChangesObj is a hash whose keys are the names of the bound
    * properties that have changed, and the values are an {@link IChangesObject} object  of the form
    * { currentValue, previousValue, isFirstChange() }. Use this hook to trigger updates within a component such as
    * cloning the bound value to prevent accidental mutation of the outer value.
    */
  @JSName("$onChanges")
  var $onChanges: js.UndefOr[js.Function1[/* onChangesObj */ IOnChangesObject, Unit]] = js.native
  
  /**
    * Called on a controller when its containing scope is destroyed. Use this hook for releasing external resources,
    * watches and event handlers.
    */
  @JSName("$onDestroy")
  var $onDestroy: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Called on each controller after all the controllers on an element have been constructed and had their bindings
    * initialized (and before the pre & post linking functions for the directives on this element). This is a good
    * place to put initialization code for your controller.
    */
  @JSName("$onInit")
  var $onInit: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Called after this controller's element and its children have been linked. Similar to the post-link function this
    * hook can be used to set up DOM event handlers and do direct DOM manipulation. Note that child elements that contain
    * templateUrl directives will not have been compiled and linked since they are waiting for their template to load
    * asynchronously and their own compilation and linking has been suspended until that occurs. This hook can be considered
    * analogous to the ngAfterViewInit and ngAfterContentInit hooks in Angular 2. Since the compilation process is rather
    * different in Angular 1 there is no direct mapping and care should be taken when upgrading.
    */
  @JSName("$postLink")
  var $postLink: js.UndefOr[js.Function0[Unit]] = js.native
}
object IController {
  
  @scala.inline
  def apply(): IController = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IController]
  }
  
  @scala.inline
  implicit class IControllerOps[Self <: IController] (val x: Self) extends AnyVal {
    
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
    def set$doCheck(value: () => Unit): Self = this.set("$doCheck", js.Any.fromFunction0(value))
    
    @scala.inline
    def delete$doCheck: Self = this.set("$doCheck", js.undefined)
    
    @scala.inline
    def set$onChanges(value: /* onChangesObj */ IOnChangesObject => Unit): Self = this.set("$onChanges", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete$onChanges: Self = this.set("$onChanges", js.undefined)
    
    @scala.inline
    def set$onDestroy(value: () => Unit): Self = this.set("$onDestroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def delete$onDestroy: Self = this.set("$onDestroy", js.undefined)
    
    @scala.inline
    def set$onInit(value: () => Unit): Self = this.set("$onInit", js.Any.fromFunction0(value))
    
    @scala.inline
    def delete$onInit: Self = this.set("$onInit", js.undefined)
    
    @scala.inline
    def set$postLink(value: () => Unit): Self = this.set("$postLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def delete$postLink: Self = this.set("$postLink", js.undefined)
  }
}
