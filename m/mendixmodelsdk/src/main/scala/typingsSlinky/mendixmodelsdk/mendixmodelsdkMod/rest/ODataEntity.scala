package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.rest

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenRestMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.18.0: introduced
  */
@JSImport("mendixmodelsdk", "rest.ODataEntity")
@js.native
class ODataEntity protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.rest.ODataEntity {
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
@JSImport("mendixmodelsdk", "rest.ODataEntity")
@js.native
object ODataEntity extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ODataEntity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenRestMod.rest.ODataEntity = js.native
  /**
    * Creates and returns a new ODataEntity instance in the SDK and on the server.
    * The new ODataEntity will be automatically stored in the 'entities' property
    * of the parent ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenRestMod.rest.ConsumedODataService): typingsSlinky.mendixmodelsdk.distGenRestMod.rest.ODataEntity = js.native
}

