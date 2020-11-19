package typingsSlinky.backboneRelational.mod

import typingsSlinky.backbone.mod.Collection
import typingsSlinky.backbone.mod.EventsMixin
import typingsSlinky.backbone.mod.ModelSetOptions
import typingsSlinky.backboneRelational.anon.TypeofModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backbone-relational", "Store")
@js.native
class Store_ () extends EventsMixin {
  
  def addModelScope(scope: js.Any): Unit = js.native
  
  def addOrphanRelation(relation: js.Any): Unit = js.native
  
  def addReverseRelation(relation: js.Any): Unit = js.native
  
  def addSubModels(subModelTypes: Model, superModelType: Model): Unit = js.native
  
  def checkId(model: Model, id: js.Any): Unit = js.native
  
  def getCollection(`type`: Model, create: Boolean): Collection[typingsSlinky.backbone.mod.Model[_, ModelSetOptions]] = js.native
  
  def getObjectByName(name: String): js.Any = js.native
  
  def initializeRelation(model: js.Any, relation: js.Any, options: js.Any): js.Any = js.native
  
  def processOrphanRelations(): Unit = js.native
  
  def register(model: Model): Unit = js.native
  
  def removeModelScope(scope: js.Any): Unit = js.native
  
  def reset(): Unit = js.native
  
  def resolveIdForItem(`type`: js.Any, item: js.Any): js.Any = js.native
  
  def retroFitRelation(relation: Model, create: Boolean): Collection[typingsSlinky.backbone.mod.Model[_, ModelSetOptions]] = js.native
  
  def setupSuperModel(modelType: Model): Unit = js.native
  
  def unregister(`type`: Collection[Model]): Unit = js.native
  def unregister(`type`: TypeofModel): Unit = js.native
  // tslint:disable-next-line use-default-type-parameter
  def unregister(`type`: Model): Unit = js.native
  
  def update(model: Model): Unit = js.native
}
/* static members */
@JSImport("backbone-relational", "Store")
@js.native
object Store_ extends js.Object {
  
  def find(`type`: js.Any, item: String): Model = js.native
  def find(`type`: js.Any, item: js.Any): Model = js.native
  def find(`type`: js.Any, item: Double): Model = js.native
  def find(`type`: js.Any, item: Model): Model = js.native
}
