package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.rest

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk", "rest.ODataAttribute")
@js.native
class ODataAttribute protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.rest.ODataAttribute {
  def this(
    model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "rest.ODataAttribute")
@js.native
object ODataAttribute extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typingsSlinky.mendixmodelsdk.distGenRestMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new ODataAttribute instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenRestMod.rest.ODataAttribute = js.native
  /**
    * Creates and returns a new ODataAttribute instance in the SDK and on the server.
    * The new ODataAttribute will be automatically stored in the 'attributes' property
    * of the parent ODataEntity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenRestMod.rest.ODataEntity): typingsSlinky.mendixmodelsdk.distGenRestMod.rest.ODataAttribute = js.native
}

