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
@js.native
trait NgModuleRef[T] extends js.Object {
  /**
    * The ComponentFactoryResolver to get hold of the ComponentFactories
    * declared in the `entryComponents` property of the module.
    */
  val componentFactoryResolver: ComponentFactoryResolver = js.native
  /**
    * The injector that contains all of the providers of the NgModule.
    */
  val injector: Injector = js.native
  /**
    * The NgModule instance.
    */
  val instance: T = js.native
  /**
    * Destroys the module instance and all of the data structures associated with it.
    */
  def destroy(): Unit = js.native
  /**
    * Allows to register a callback that will be called when the module is destroyed.
    */
  def onDestroy(callback: js.Function0[Unit]): Unit = js.native
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
  implicit class NgModuleRefOps[Self[t] <: NgModuleRef[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withComponentFactoryResolver(value: ComponentFactoryResolver): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentFactoryResolver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInjector(value: Injector): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstance(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDestroy(value: js.Function0[Unit] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroy")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

