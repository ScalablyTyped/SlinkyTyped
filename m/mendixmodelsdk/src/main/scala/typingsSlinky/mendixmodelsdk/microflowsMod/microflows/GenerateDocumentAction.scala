package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.IDocumentTemplate
import typingsSlinky.mendixmodelsdk.expressionsMod.expressions.Expression
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/generate-document relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.GenerateDocumentAction")
@js.native
class GenerateDocumentAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def documentTemplate: IDocumentTemplate | Null = js.native
  
  def documentTemplateQualifiedName: String | Null = js.native
  
  def documentTemplate_=(newValue: IDocumentTemplate | Null): Unit = js.native
  
  def documentType: TargetDocumentType = js.native
  def documentType_=(newValue: TargetDocumentType): Unit = js.native
  
  def fileVariableName: String = js.native
  def fileVariableName_=(newValue: String): Unit = js.native
  
  def languageSetting: LanguageSettingType = js.native
  def languageSetting_=(newValue: LanguageSettingType): Unit = js.native
  
  def languageVariableName: String = js.native
  def languageVariableName_=(newValue: String): Unit = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def marginBottomInInch: String = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 7.9.0: introduced
    */
  def marginBottomInInchModel: Expression = js.native
  def marginBottomInInchModel_=(newValue: Expression): Unit = js.native
  
  def marginBottomInInch_=(newValue: String): Unit = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def marginLeftInInch: String = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 7.9.0: introduced
    */
  def marginLeftInInchModel: Expression = js.native
  def marginLeftInInchModel_=(newValue: Expression): Unit = js.native
  
  def marginLeftInInch_=(newValue: String): Unit = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def marginRightInInch: String = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 7.9.0: introduced
    */
  def marginRightInInchModel: Expression = js.native
  def marginRightInInchModel_=(newValue: Expression): Unit = js.native
  
  def marginRightInInch_=(newValue: String): Unit = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def marginTopInInch: String = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 7.9.0: introduced
    */
  def marginTopInInchModel: Expression = js.native
  def marginTopInInchModel_=(newValue: Expression): Unit = js.native
  
  def marginTopInInch_=(newValue: String): Unit = js.native
  
  def overrideBottomMargin: Boolean = js.native
  def overrideBottomMargin_=(newValue: Boolean): Unit = js.native
  
  def overrideLeftMargin: Boolean = js.native
  def overrideLeftMargin_=(newValue: Boolean): Unit = js.native
  
  def overrideRightMargin: Boolean = js.native
  def overrideRightMargin_=(newValue: Boolean): Unit = js.native
  
  def overrideTopMargin: Boolean = js.native
  def overrideTopMargin_=(newValue: Boolean): Unit = js.native
  
  def parameterMappings: IList[DocumentTemplateParameterMapping] = js.native
}
object GenerateDocumentAction {
  
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.GenerateDocumentAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new GenerateDocumentAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.GenerateDocumentAction.create")
  @js.native
  def create(model: IModel): GenerateDocumentAction = js.native
  
  /**
    * Creates and returns a new GenerateDocumentAction instance in the SDK and on the server.
    * The new GenerateDocumentAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.GenerateDocumentAction.createIn")
  @js.native
  def createIn(container: ActionActivity): GenerateDocumentAction = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.GenerateDocumentAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.GenerateDocumentAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
