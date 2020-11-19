package typingsSlinky.mendixmodelsdk.mod.rest

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.restMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/cors-settings relevant section in reference guide}
  *
  * In version 7.18.0: introduced
  */
@JSImport("mendixmodelsdk", "rest.CorsConfiguration")
@js.native
class CorsConfiguration protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.rest.CorsConfiguration {
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
@JSImport("mendixmodelsdk", "rest.CorsConfiguration")
@js.native
object CorsConfiguration extends js.Object {
  
  /**
    * Creates and returns a new CorsConfiguration instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.restMod.rest.CorsConfiguration = js.native
  
  /**
    * Creates and returns a new CorsConfiguration instance in the SDK and on the server.
    * The new CorsConfiguration will be automatically stored in the 'corsConfiguration' property
    * of the parent PublishedRestService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.restMod.rest.PublishedRestService): typingsSlinky.mendixmodelsdk.restMod.rest.CorsConfiguration = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
