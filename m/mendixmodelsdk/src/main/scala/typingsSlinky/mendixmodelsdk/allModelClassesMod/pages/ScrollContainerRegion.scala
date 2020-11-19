package typingsSlinky.mendixmodelsdk.allModelClassesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ScrollContainerRegion")
@js.native
class ScrollContainerRegion protected ()
  extends typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ScrollContainerRegion")
@js.native
object ScrollContainerRegion extends js.Object {
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion = js.native
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'bottom' property
    * of the parent ScrollContainer element passed as argument.
    */
  def createInScrollContainerUnderBottom(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainer): typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion = js.native
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'center' property
    * of the parent ScrollContainer element passed as argument.
    */
  def createInScrollContainerUnderCenter(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainer): typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion = js.native
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'left' property
    * of the parent ScrollContainer element passed as argument.
    */
  def createInScrollContainerUnderLeft(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainer): typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion = js.native
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'right' property
    * of the parent ScrollContainer element passed as argument.
    */
  def createInScrollContainerUnderRight(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainer): typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion = js.native
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'top' property
    * of the parent ScrollContainer element passed as argument.
    */
  def createInScrollContainerUnderTop(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainer): typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
