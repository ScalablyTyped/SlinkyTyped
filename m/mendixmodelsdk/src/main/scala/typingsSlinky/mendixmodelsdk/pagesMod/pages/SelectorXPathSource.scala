package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.EntityRef
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SelectorXPathSource")
@js.native
class SelectorXPathSource protected () extends SelectorSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 8.0.0: deleted
    */
  def applyContext: Boolean = js.native
  def applyContext_=(newValue: Boolean): Unit = js.native
  
  /**
    * The value of this property is conceptually of type paths.LegacyEntityPath.
    *
    * In version 7.11.0: deleted
    */
  def constrainedBy: IList[String] = js.native
  
  /**
    * In version 7.11.0: introduced
    */
  def constrainedByRefs: IList[EntityRef] = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def removeAllFromContext: Boolean = js.native
  def removeAllFromContext_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def removeFromContextEntities: IList[IEntity] = js.native
  
  def removeFromContextEntitiesQualifiedNames: js.Array[String] = js.native
  
  def sortBar: GridSortBar = js.native
  def sortBar_=(newValue: GridSortBar): Unit = js.native
  
  /**
    * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
    */
  def xPathConstraint: String = js.native
  def xPathConstraint_=(newValue: String): Unit = js.native
}
object SelectorXPathSource {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SelectorXPathSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new SelectorXPathSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SelectorXPathSource.create")
  @js.native
  def create(model: IModel): SelectorXPathSource = js.native
  
  /**
    * Creates and returns a new SelectorXPathSource instance in the SDK and on the server.
    * The new SelectorXPathSource will be automatically stored in the 'selectorSource' property
    * of the parent AssociationWidget element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SelectorXPathSource.createIn")
  @js.native
  def createIn(container: AssociationWidget): SelectorXPathSource = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SelectorXPathSource.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SelectorXPathSource.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
