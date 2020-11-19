package typingsSlinky.mendixmodelsdk.allModelClassesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.17.0: added public
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.LayoutCall")
@js.native
class LayoutCall protected ()
  extends typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutCall {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.LayoutCall")
@js.native
object LayoutCall extends js.Object {
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutCall = js.native
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.23.0
    */
  def createInLayoutUnderLayoutCall(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.Layout): typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutCall = js.native
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent PageTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 and higher
    */
  def createInPageTemplateUnderLayoutCall(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.PageTemplate): typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutCall = js.native
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent Page element passed as argument.
    */
  def createInPageUnderLayoutCall(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.Page): typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutCall = js.native
  
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebLayoutContentUnderLayoutCall(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.WebLayoutContent): typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutCall = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
