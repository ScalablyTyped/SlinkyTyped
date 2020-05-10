package typingsSlinky.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a component created by a `ComponentFactory`.
  * Provides access to the component instance and related objects,
  * and provides the means of destroying the instance.
  *
  * @publicApi
  */
@js.native
trait ComponentRef[C] extends js.Object {
  /**
    * The change detector for this component instance.
    */
  val changeDetectorRef: ChangeDetectorRef = js.native
  /**
    * The type of this component (as created by a `ComponentFactory` class).
    */
  val componentType: Type[_] = js.native
  /**
    * The [host view](guide/glossary#view-tree) defined by the template
    * for this component instance.
    */
  val hostView: ViewRef = js.native
  /**
    * The [dependency injector](guide/glossary#injector) for this component instance.
    */
  val injector: Injector = js.native
  /**
    * This component instance.
    */
  val instance: C = js.native
  /**
    * The host or anchor [element](guide/glossary#element) for this component instance.
    */
  val location: ElementRef[_] = js.native
  /**
    * Destroys the component instance and all of the data structures associated with it.
    */
  def destroy(): Unit = js.native
  /**
    * A lifecycle hook that provides additional developer-defined cleanup
    * functionality for the component.
    * @param callback A handler function that cleans up developer-defined data
    * associated with this component. Called when the `destroy()` method is invoked.
    */
  def onDestroy(callback: js.Function): Unit = js.native
}

object ComponentRef {
  @scala.inline
  def apply[C](
    changeDetectorRef: ChangeDetectorRef,
    componentType: Type[_],
    destroy: () => Unit,
    hostView: ViewRef,
    injector: Injector,
    instance: C,
    location: ElementRef[_],
    onDestroy: js.Function => Unit
  ): ComponentRef[C] = {
    val __obj = js.Dynamic.literal(changeDetectorRef = changeDetectorRef.asInstanceOf[js.Any], componentType = componentType.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), hostView = hostView.asInstanceOf[js.Any], injector = injector.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], onDestroy = js.Any.fromFunction1(onDestroy))
    __obj.asInstanceOf[ComponentRef[C]]
  }
  @scala.inline
  implicit class ComponentRefOps[Self[c] <: ComponentRef[c], C] (val x: Self[C]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[C] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[C] with Other]
    @scala.inline
    def withChangeDetectorRef(value: ChangeDetectorRef): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeDetectorRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentType(value: Type[_]): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHostView(value: ViewRef): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInjector(value: Injector): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstance(value: C): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: ElementRef[_]): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDestroy(value: js.Function => Unit): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroy")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

