package typingsSlinky.emberDashData.emberDashDataMod.default

import typingsSlinky.ember.emberMod.Ember.Array
import typingsSlinky.ember.emberMod.default.ComputedProperty
import typingsSlinky.emberDashData.emberDashDataMod.DS.Async
import typingsSlinky.emberDashData.emberDashDataMod.DS.RelationshipOptions
import typingsSlinky.emberDashData.emberDashDataMod.DS.Sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data", "hasMany")
@js.native
object hasMany extends js.Object {
  def apply[K /* <: String */](`type`: K): ComputedProperty[
    typingsSlinky.emberDashData.emberDashDataMod.DS.PromiseManyArray[
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
  def apply[K /* <: String */](
    `type`: K,
    options: (RelationshipOptions[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]) with (Async | Sync)
  ): ComputedProperty[
    typingsSlinky.emberDashData.emberDashDataMod.DS.ManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ], 
    typingsSlinky.emberDashData.emberDashDataMod.DS.ManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]
  ] = js.native
}

