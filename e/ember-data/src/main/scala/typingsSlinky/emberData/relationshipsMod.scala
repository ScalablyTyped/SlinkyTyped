package typingsSlinky.emberData

import typingsSlinky.ember.mod.Ember.Array
import typingsSlinky.ember.mod.default.ComputedProperty
import typingsSlinky.emberData.mod.DS.Async
import typingsSlinky.emberData.mod.DS.PromiseManyArray
import typingsSlinky.emberData.mod.DS.PromiseObject
import typingsSlinky.emberData.mod.DS.RelationshipOptions
import typingsSlinky.emberData.mod.DS.Sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ember-data/relationships", JSImport.Namespace)
@js.native
object relationshipsMod extends js.Object {
  
  @js.native
  object belongsTo extends js.Object {
    
    def apply[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](modelName: K): ComputedProperty[
        (/* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any) with (PromiseObject[
          /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
        ]), 
        /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ] = js.native
    def apply[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](
      modelName: K,
      options: (RelationshipOptions[
          /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
        ]) with Async with Sync
    ): ComputedProperty[
        (/* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any) with (PromiseObject[
          /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
        ]), 
        /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
      ] = js.native
  }
  
  @js.native
  object hasMany extends js.Object {
    
    def apply[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](`type`: K): ComputedProperty[
        PromiseManyArray[
          /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
        ], 
        Array[
          /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
        ]
      ] = js.native
    def apply[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](
      `type`: K,
      options: (RelationshipOptions[
          /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
        ]) with Async with Sync
    ): ComputedProperty[
        PromiseManyArray[
          /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
        ], 
        Array[
          /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
        ]
      ] = js.native
  }
}
