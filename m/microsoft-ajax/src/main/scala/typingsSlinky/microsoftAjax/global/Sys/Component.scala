package typingsSlinky.microsoftAjax.global.Sys

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.microsoftAjax.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the base class for the Control and Behavior classes, and for any other object whose lifetime should be managed by the ASP.NET AJAX client library.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397516(v=vs.100).aspx}
  */
@JSGlobal("Sys.Component")
@js.native
//#region Constructors
/**
  * When overridden in a derived class, initializes an instance of that class and registers it with the application as a disposable object.
  */
class Component ()
  extends typingsSlinky.microsoftAjax.Sys.Component

/* static members */
@JSGlobal("Sys.Component")
@js.native
object Component extends js.Object {
  /**
    * Creates and initializes a component of the specified type. This method is static and can be called without creating an instance of the class.
    * @param type
    *           The type of the component to create.
    * @param properties
    *           (Optional) A JSON object that describes the properties and their values.
    * @param events
    *           (Optional) A JSON object that describes the events and their handlers.
    * @param references
    *           (Optional) A JSON object that describes the properties that are references to other components.
    * @param element
    *           (Optional) The DOM element that the component should be attached to.
    *
    * @returns A new instance of a component that uses the specified parameters.
    */
  def create(`type`: Type): typingsSlinky.microsoftAjax.Sys.Component = js.native
  def create(`type`: Type, properties: js.Any): typingsSlinky.microsoftAjax.Sys.Component = js.native
  def create(`type`: Type, properties: js.Any, events: js.Any): typingsSlinky.microsoftAjax.Sys.Component = js.native
  def create(`type`: Type, properties: js.Any, events: js.Any, references: js.Any): typingsSlinky.microsoftAjax.Sys.Component = js.native
  def create(`type`: Type, properties: js.Any, events: js.Any, references: js.Any, element: HTMLElement): typingsSlinky.microsoftAjax.Sys.Component = js.native
}

