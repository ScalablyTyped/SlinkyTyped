package typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings

import typingsSlinky.mendixmodelsdk.distGenJsonstructuresMod.jsonstructures.JsonStructure
import typingsSlinky.mendixmodelsdk.distGenMappingsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.EntityMessageDefinition
import typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlPrimitiveType
import typingsSlinky.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Mappings`.
  */
/**
  * In version 6.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.Element")
@js.native
abstract class Element protected ()
  extends typingsSlinky.mendixmodelsdk.distSdkInternalMod.Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val children: IList[Element] = js.native
  val containerAsElement: Element = js.native
  val containerAsEntityMessageDefinition: EntityMessageDefinition = js.native
  val containerAsJsonStructure: JsonStructure = js.native
  var elementType: ElementType = js.native
  var errorMessage: String = js.native
  /**
    * In version 7.6.0: introduced
    */
  var exposedItemName: String = js.native
  var exposedName: String = js.native
  var fractionDigits: Double = js.native
  var isDefaultType: Boolean = js.native
  var maxLength: Double = js.native
  var maxOccurs: Double = js.native
  var minOccurs: Double = js.native
  var nillable: Boolean = js.native
  /**
    * The value of this property is conceptually of type mappings.ElementPath.
    */
  var path: String = js.native
  var primitiveType: XmlPrimitiveType = js.native
  var totalDigits: Double = js.native
  var warningMessage: String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.Element")
@js.native
object Element extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

