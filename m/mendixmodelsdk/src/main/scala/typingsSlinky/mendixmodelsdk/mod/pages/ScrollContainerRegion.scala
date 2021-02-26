package typingsSlinky.mendixmodelsdk.mod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "pages.ScrollContainerRegion")
@js.native
class ScrollContainerRegion protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.pages.ScrollContainerRegion {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ScrollContainerRegion {
  
  @JSImport("mendixmodelsdk", "pages.ScrollContainerRegion")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ScrollContainerRegion.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion = js.native
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'bottom' property
    * of the parent ScrollContainer element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ScrollContainerRegion.createInScrollContainerUnderBottom")
  @js.native
  def createInScrollContainerUnderBottom(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainer): typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion = js.native
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'center' property
    * of the parent ScrollContainer element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ScrollContainerRegion.createInScrollContainerUnderCenter")
  @js.native
  def createInScrollContainerUnderCenter(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainer): typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion = js.native
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'left' property
    * of the parent ScrollContainer element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ScrollContainerRegion.createInScrollContainerUnderLeft")
  @js.native
  def createInScrollContainerUnderLeft(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainer): typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion = js.native
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'right' property
    * of the parent ScrollContainer element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ScrollContainerRegion.createInScrollContainerUnderRight")
  @js.native
  def createInScrollContainerUnderRight(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainer): typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion = js.native
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'top' property
    * of the parent ScrollContainer element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ScrollContainerRegion.createInScrollContainerUnderTop")
  @js.native
  def createInScrollContainerUnderTop(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainer): typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ScrollContainerRegion.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ScrollContainerRegion.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
