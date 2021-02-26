package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "Compiler")
@js.native
class Compiler () extends StObject {
  
  /**
    * Clears all caches.
    */
  def clearCache(): Unit = js.native
  
  /**
    * Clears the cache for the given component/ngModule.
    */
  def clearCacheFor(`type`: typingsSlinky.angularCore.mod.Type[_]): Unit = js.native
  
  /**
    * Same as {@link #compileModuleAsync} but also creates ComponentFactories for all components.
    */
  def compileModuleAndAllComponentsAsync[T](moduleType: typingsSlinky.angularCore.mod.Type[T]): js.Promise[ModuleWithComponentFactories[T]] = js.native
  
  /**
    * Same as {@link #compileModuleSync} but also creates ComponentFactories for all components.
    */
  def compileModuleAndAllComponentsSync[T](moduleType: typingsSlinky.angularCore.mod.Type[T]): ModuleWithComponentFactories[T] = js.native
  
  /**
    * Compiles the given NgModule and all of its components
    */
  def compileModuleAsync[T](moduleType: typingsSlinky.angularCore.mod.Type[T]): js.Promise[NgModuleFactory[T]] = js.native
  
  /**
    * Compiles the given NgModule and all of its components. All templates of the components listed
    * in `entryComponents` have to be inlined.
    */
  def compileModuleSync[T](moduleType: typingsSlinky.angularCore.mod.Type[T]): NgModuleFactory[T] = js.native
  
  /**
    * Returns the id for a given NgModule, if one is defined and known to the compiler.
    */
  def getModuleId(moduleType: typingsSlinky.angularCore.mod.Type[_]): js.UndefOr[String] = js.native
}
