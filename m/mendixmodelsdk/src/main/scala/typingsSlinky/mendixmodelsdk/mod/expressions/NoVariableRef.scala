package typingsSlinky.mendixmodelsdk.mod.expressions

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.expressionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk", "expressions.NoVariableRef")
@js.native
class NoVariableRef protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.expressions.NoVariableRef {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object NoVariableRef {
  
  @JSImport("mendixmodelsdk", "expressions.NoVariableRef")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new NoVariableRef instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.NoVariableRef.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.NoVariableRef = js.native
  
  /**
    * Creates and returns a new NoVariableRef instance in the SDK and on the server.
    * The new NoVariableRef will be automatically stored in the 'variable' property
    * of the parent VariableRefExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.NoVariableRef.createIn")
  @js.native
  def createIn(container: typingsSlinky.mendixmodelsdk.expressionsMod.expressions.VariableRefExpression): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.NoVariableRef = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.NoVariableRef.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.NoVariableRef.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
