package typingsSlinky.blocks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////////////////
// blocks MVC App
/////////////////////////////////////////
@js.native
trait App extends Extendable[App] {
  
  def Collection(model: Model, prototype: CollectionPrototype): typingsSlinky.blocks.Collection = js.native
  /**
    * Creates a new Collection
    * 
    * @param prototype The Collection object properties that will be created.
    */
  def Collection(prototype: CollectionPrototype): typingsSlinky.blocks.Collection = js.native
  
  /**
    * Creates a new Model
    * 
    * @param prototype The Model object properties that will be created
    */
  def Model(prototype: ModelPrototype): typingsSlinky.blocks.Model = js.native
  
  /**
    * Creates an application property for a Model.
    */
  def Property(): js.Any = js.native
  /**
    * @param options Configuration options for property
    */
  def Property(options: PropertyPrototype): js.Any = js.native
  
  /**
    * Defines a view that will be part of the Application.
    * 
    * @param name The name of the View you are creating
    * @param prototype The object that will represent the View
    */
  def View(name: String, prototype: ViewPrototype): js.Any = js.native
  /**
    * Defines a view that will be part of the Application.
    * 
    * @param parentViewName Provide this parameter only if you are creating nested views. This is the name of the parent View
    * @param name The name of the View you are creating
    * @param prototype The object that will represent the View
    */
  def View(parentViewName: String, name: String, prototype: ViewPrototype): js.Any = js.native
}
