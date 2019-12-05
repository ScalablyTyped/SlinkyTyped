package typingsSlinky.ember.emberMod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Namespace for injection helper methods.
  */
@JSImport("ember", "inject")
@js.native
object inject extends js.Object {
  /**
    * Creates a property that lazily looks up another controller in the container.
    * Can only be used when defining another controller.
    */
  def controller(): typingsSlinky.ember.emberMod.Ember.ComputedProperty[
    typingsSlinky.ember.emberMod.Ember.Controller, 
    typingsSlinky.ember.emberMod.Ember.Controller
  ] = js.native
  def controller[K /* <: java.lang.String */](name: K): typingsSlinky.ember.emberMod.Ember.ComputedProperty[
    /* import warning: importer.ImportType#apply Failed type conversion: @ember/controller.@ember/controller.Registry[K] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @ember/controller.@ember/controller.Registry[K] */ js.Any
  ] = js.native
  @js.native
  object service extends js.Object {
    def apply(): typingsSlinky.atEmberObject.computedMod.ComputedProperty[
        typingsSlinky.atEmberService.atEmberServiceMod.Service, 
        typingsSlinky.atEmberService.atEmberServiceMod.Service
      ] = js.native
    def apply(target: js.Object, propertyKey: java.lang.String): Unit = js.native
    def apply(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    def apply[K /* <: java.lang.String */](name: K): typingsSlinky.atEmberObject.computedMod.ComputedProperty[
        /* import warning: importer.ImportType#apply Failed type conversion: @ember/service.@ember/service.Registry[K] */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: @ember/service.@ember/service.Registry[K] */ js.Any
      ] = js.native
  }
  
}

