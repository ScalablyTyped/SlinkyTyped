package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "images")
@js.native
object images extends js.Object {
  @js.native
  class Image protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.images.Image {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/images relevant section in reference guide}
    */
  @js.native
  class ImageCollection protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.images.ImageCollection {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /* static members */
  @js.native
  object Image extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.imagesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Image instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.imagesMod.images.Image = js.native
    /**
      * Creates and returns a new Image instance in the SDK and on the server.
      * The new Image will be automatically stored in the 'images' property
      * of the parent ImageCollection element passed as argument.
      */
    def createIn(container: typingsSlinky.mendixmodelsdk.imagesMod.images.ImageCollection): typingsSlinky.mendixmodelsdk.imagesMod.images.Image = js.native
  }
  
  /* static members */
  @js.native
  object ImageCollection extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.imagesMod.StructureVersionInfo = js.native
    /**
      * Creates a new ImageCollection unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.imagesMod.images.ImageCollection = js.native
  }
  
}

