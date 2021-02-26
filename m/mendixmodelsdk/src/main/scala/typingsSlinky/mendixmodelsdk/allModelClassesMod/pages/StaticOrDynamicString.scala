package typingsSlinky.mendixmodelsdk.allModelClassesMod.pages

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

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.StaticOrDynamicString")
@js.native
class StaticOrDynamicString protected ()
  extends typingsSlinky.mendixmodelsdk.pagesMod.pages.StaticOrDynamicString {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object StaticOrDynamicString {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.StaticOrDynamicString")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new StaticOrDynamicString instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.StaticOrDynamicString.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.StaticOrDynamicString = js.native
  
  /**
    * Creates and returns a new StaticOrDynamicString instance in the SDK and on the server.
    * The new StaticOrDynamicString will be automatically stored in the 'address' property
    * of the parent LinkButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.StaticOrDynamicString.createInLinkButtonUnderAddress")
  @js.native
  def createInLinkButtonUnderAddress(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.LinkButton): typingsSlinky.mendixmodelsdk.pagesMod.pages.StaticOrDynamicString = js.native
  
  /**
    * Creates and returns a new StaticOrDynamicString instance in the SDK and on the server.
    * The new StaticOrDynamicString will be automatically stored in the 'address' property
    * of the parent OpenLinkClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.3.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.StaticOrDynamicString.createInOpenLinkClientActionUnderAddress")
  @js.native
  def createInOpenLinkClientActionUnderAddress(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.OpenLinkClientAction): typingsSlinky.mendixmodelsdk.pagesMod.pages.StaticOrDynamicString = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.StaticOrDynamicString.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.StaticOrDynamicString.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
