package typingsSlinky.mendixmodelsdk.allModelClassesMod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/control-bar relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSearchButton")
@js.native
class GridSearchButton protected ()
  extends typingsSlinky.mendixmodelsdk.pagesMod.pages.GridSearchButton {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSearchButton")
@js.native
object GridSearchButton extends js.Object {
  
  /**
    * Creates and returns a new GridSearchButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.GridSearchButton = js.native
  
  /**
    * Creates and returns a new GridSearchButton instance in the SDK and on the server.
    * The new GridSearchButton will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ControlBar): typingsSlinky.mendixmodelsdk.pagesMod.pages.GridSearchButton = js.native
  
  /**
    * Creates and returns a new GridSearchButton instance in the SDK and on the server.
    * The new GridSearchButton will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    */
  def createInControlBarUnderItems(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ControlBar): typingsSlinky.mendixmodelsdk.pagesMod.pages.GridSearchButton = js.native
  
  /**
    * Creates and returns a new GridSearchButton instance in the SDK and on the server.
    * The new GridSearchButton will be automatically stored in the 'searchButton' property
    * of the parent GridControlBar element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  def createInGridControlBarUnderSearchButton(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.GridControlBar): typingsSlinky.mendixmodelsdk.pagesMod.pages.GridSearchButton = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
