package typingsSlinky.ember.mod.Ember

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Namespace for injection helper methods.
  */
object inject {
  
  /**
    * Creates a property that lazily looks up another controller in the container.
    * Can only be used when defining another controller.
    */
  @JSImport("ember", "Ember.inject.controller")
  @js.native
  def controller(): ComputedProperty[Controller, Controller] = js.native
  @JSImport("ember", "Ember.inject.controller")
  @js.native
  def controller[K /* <: /* keyof @ember/controller.@ember/controller.Registry */ java.lang.String */](name: K): ComputedProperty[
    /* import warning: importer.ImportType#apply Failed type conversion: @ember/controller.@ember/controller.Registry[K] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @ember/controller.@ember/controller.Registry[K] */ js.Any
  ] = js.native
  
  /* was `typeof EmberServiceNs.inject` */
  @JSImport("ember", "Ember.inject.service")
  @js.native
  def service(): typingsSlinky.emberObject.computedMod.ComputedProperty[typingsSlinky.emberService.mod.Service, typingsSlinky.emberService.mod.Service] = js.native
  /* was `typeof EmberServiceNs.inject` */
  @JSImport("ember", "Ember.inject.service")
  @js.native
  def service(target: js.Object, propertyKey: java.lang.String): Unit = js.native
  /* was `typeof EmberServiceNs.inject` */
  @JSImport("ember", "Ember.inject.service")
  @js.native
  def service(target: js.Object, propertyKey: js.Symbol): Unit = js.native
  /* was `typeof EmberServiceNs.inject` */
  @JSImport("ember", "Ember.inject.service")
  @js.native
  def service[K /* <: /* keyof @ember/service.@ember/service.Registry */ java.lang.String */](name: K): typingsSlinky.emberObject.computedMod.ComputedProperty[
    /* import warning: importer.ImportType#apply Failed type conversion: @ember/service.@ember/service.Registry[K] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @ember/service.@ember/service.Registry[K] */ js.Any
  ] = js.native
}
