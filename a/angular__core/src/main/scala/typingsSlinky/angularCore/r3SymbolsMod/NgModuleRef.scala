package typingsSlinky.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an instance of an NgModule created via a {@link NgModuleFactory}.
  *
  * `NgModuleRef` provides access to the NgModule Instance as well other objects related to this
  * NgModule Instance.
  *
  * @publicApi
  */
trait NgModuleRef[T] extends js.Object {
  /**
    * The ComponentFactoryResolver to get hold of the ComponentFactories
    * declared in the `entryComponents` property of the module.
    */
  val componentFactoryResolver: ComponentFactoryResolver
  /**
    * The injector that contains all of the providers of the NgModule.
    */
  val injector: Injector
  /**
    * The NgModule instance.
    */
  val instance: T
  /**
    * Destroys the module instance and all of the data structures associated with it.
    */
  def destroy(): Unit
  /**
    * Allows to register a callback that will be called when the module is destroyed.
    */
  def onDestroy(callback: js.Function0[Unit]): Unit
}

object NgModuleRef {
  @scala.inline
  def apply[T](
    componentFactoryResolver: ComponentFactoryResolver,
    destroy: () => Unit,
    injector: Injector,
    instance: T,
    onDestroy: js.Function0[Unit] => Unit
  ): NgModuleRef[T] = {
    val __obj = js.Dynamic.literal(componentFactoryResolver = componentFactoryResolver.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), injector = injector.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], onDestroy = js.Any.fromFunction1(onDestroy))
    __obj.asInstanceOf[NgModuleRef[T]]
  }
  @scala.inline
  implicit class NgModuleRefOps[Self <: NgModuleRef[_], T] (val x: Self with NgModuleRef[T]) extends AnyVal {
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
    def setComponentFactoryResolver(value: ComponentFactoryResolver): Self = this.set("componentFactoryResolver", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setInjector(value: Injector): Self = this.set("injector", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstance(value: T): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDestroy(value: js.Function0[Unit] => Unit): Self = this.set("onDestroy", js.Any.fromFunction1(value))
  }
  
}

