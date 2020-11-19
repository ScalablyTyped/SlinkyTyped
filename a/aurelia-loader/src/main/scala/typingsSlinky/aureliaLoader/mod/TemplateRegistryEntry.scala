package typingsSlinky.aureliaLoader.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-loader", "TemplateRegistryEntry")
@js.native
class TemplateRegistryEntry protected () extends js.Object {
  /**
    * Creates an instance of TemplateRegistryEntry.
    * @param address The address of the template that this entry represents.
    */
  def this(address: String) = this()
  
  /**
    * Adds a dependency to this template registry entry. Cannot be called until after the template is set.
    * @param src The dependency instance or a relative path to its module.
    * @param name An optional local name by which this dependency is used in the template.
    */
  def addDependency(src: String): Unit = js.native
  def addDependency(src: String, name: String): Unit = js.native
  def addDependency(src: js.Function): Unit = js.native
  def addDependency(src: js.Function, name: String): Unit = js.native
  
  /**
    * The address of the template that this entry represents.
    */
  var address: String = js.native
  
  /**
    * The dependencies of the associated template. Dependencies are not available until after the template is loaded.
    */
  var dependencies: js.Array[TemplateDependency] = js.native
  
  /**
    * Gets the factory capable of creating instances of this template.
    */
  var factory: js.Any = js.native
  
  /**
    * Indicates whether the factory is ready to be used to create instances of the associated template.
    */
  var factoryIsReady: Boolean = js.native
  
  /**
    * Sets the resources associated with this entry.
    */
  var resources: js.Object = js.native
  
  /**
    * Gets the template for this registry entry.
    */
  var template: Element = js.native
  
  /**
    * Indicates whether or not the associated template is loaded .
    */
  var templateIsLoaded: Boolean = js.native
}
