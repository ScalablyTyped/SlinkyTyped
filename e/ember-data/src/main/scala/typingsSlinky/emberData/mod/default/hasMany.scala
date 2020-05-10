package typingsSlinky.emberData.mod.default

import typingsSlinky.ember.mod.Ember.Array
import typingsSlinky.ember.mod.default.ComputedProperty
import typingsSlinky.emberData.mod.DS.Async
import typingsSlinky.emberData.mod.DS.RelationshipOptions
import typingsSlinky.emberData.mod.DS.Sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data", "hasMany")
@js.native
object hasMany extends js.Object {
  def apply[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](`type`: K): ComputedProperty[
    typingsSlinky.emberData.mod.DS.PromiseManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ], 
    Array[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]
  ] = js.native
  /**
    * `DS.hasMany` is used to define One-To-Many and Many-To-Many
    * relationships on a [DS.Model](/api/data/classes/DS.Model.html).
    */
  def apply[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](
    `type`: K,
    options: (RelationshipOptions[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]) with Sync with Async
  ): ComputedProperty[
    typingsSlinky.emberData.mod.DS.ManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ], 
    typingsSlinky.emberData.mod.DS.ManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]
  ] = js.native
}

