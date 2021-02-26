package typingsSlinky.mendixmodelsdk.mod.javaactions

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.javaactionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: introduced
  */
@JSImport("mendixmodelsdk", "javaactions.MicroflowJavaActionParameterType")
@js.native
class MicroflowJavaActionParameterType protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.javaactions.MicroflowJavaActionParameterType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object MicroflowJavaActionParameterType {
  
  @JSImport("mendixmodelsdk", "javaactions.MicroflowJavaActionParameterType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MicroflowJavaActionParameterType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "javaactions.MicroflowJavaActionParameterType.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.MicroflowJavaActionParameterType = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "javaactions.MicroflowJavaActionParameterType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "javaactions.MicroflowJavaActionParameterType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
