package typingsSlinky.mendixmodelsdk.elementsMod

import typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel
import typingsSlinky.mendixmodelsdk.structuresMod.Structure
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because var conflicts: container, id, isLoaded, model, structureTypeName, unit. Inlined load, load, load, load, asLoaded */ @JSImport("mendixmodelsdk/dist/sdk/internal/elements", "AbstractElement")
@js.native
abstract class AbstractElement protected ()
  extends Structure
     with Container
     with IContainer {
  def this(model: AbstractModel, structureTypeName: String, id: String, isPartial: Boolean) = this()
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IContainer
  ) = this()
  
  def asLoaded(): IAbstractElement = js.native
  /**
    * Transforms a IElement interface into a Element class, loading the containing unit if necessary.
    * (Those are technically already the same, but this function makes sure its properties are available.)
    *
    * - If invoked without callback, it checks whether the properties are available or it will throw;
    * - If invoked with callback, it will load the data from the server if needed, and then invoke the callback.
    */
  @JSName("asLoaded")
  def asLoaded_This(): this.type = js.native
  
  @JSName("container")
  val container_FAbstractElement: Container = js.native
  
  /**
    * Given an element id, returns the element in this abstract element with that id, otherwise null.
    */
  def findElementById(id: String): AbstractElement | Null = js.native
  
  /**
    * Checks whether all properties are available at the moment
    *  - if false, a load is required to access these properties.
    */
  @JSName("isLoaded")
  def isLoaded_MAbstractElement: Boolean = js.native
  
  def load(): js.Promise[this.type] = js.native
  /**
    * Transforms a IElement interface into a Element class, loading the containing unit if necessary.
    * (Those are technically already the same, but this function makes sure its properties are available.)
    *
    * - If invoked without callback, it checks whether the properties are available or it will throw;
    * - If invoked with callback, it will load the data from the server if needed, and then invoke the callback.
    */
  def load(callback: js.Function1[/* elem */ /* element */ this.type, Unit]): Unit = js.native
  def load(callback: js.Function1[/* elem */ /* element */ this.type, Unit], forceRefresh: Boolean): Unit = js.native
  def load(forceRefresh: Boolean): js.Promise[this.type] = js.native
}
