package typingsSlinky.emberData.mod.default

import typingsSlinky.ember.mod.default.ComputedProperty
import typingsSlinky.emberData.mod.DS.Async
import typingsSlinky.emberData.mod.DS.RelationshipOptions
import typingsSlinky.emberData.mod.DS.Sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ember-data", "belongsTo")
@js.native
object belongsTo extends js.Object {
  
  def apply[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](modelName: K): ComputedProperty[
    (/* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any) with (typingsSlinky.emberData.mod.DS.PromiseObject[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]), 
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] = js.native
  /**
    * `DS.belongsTo` is used to define One-To-One and One-To-Many
    * relationships on a [DS.Model](/api/data/classes/DS.Model.html).
    */
  def apply[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](
    modelName: K,
    options: (RelationshipOptions[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]) with Sync with Async
  ): ComputedProperty[
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] = js.native
}
