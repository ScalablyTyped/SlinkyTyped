package typingsSlinky.emberData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AttributesFor[Model /* <: typingsSlinky.emberData.mod.DS.Model */] = typingsSlinky.emberData.mod.ModelKeys[Model]
  
  type ChangedAttributes = org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Tuple2[js.Any, js.Any]]]
  
  /**
    The keys from the actual Model class, removing all the keys which come from
    the base class.
    */
  type ModelKeys[Model /* <: typingsSlinky.emberData.mod.DS.Model */] = typingsSlinky.std.Exclude[
    /* keyof Model */ java.lang.String, 
    /* keyof ember-data.ember-data.DS.Model */ typingsSlinky.emberData.emberDataStrings.isEmpty | typingsSlinky.emberData.emberDataStrings.isLoading | typingsSlinky.emberData.emberDataStrings.isLoaded | typingsSlinky.emberData.emberDataStrings.hasDirtyAttributes | typingsSlinky.emberData.emberDataStrings.isSaving | typingsSlinky.emberData.emberDataStrings.isDeleted | typingsSlinky.emberData.emberDataStrings.isNew | typingsSlinky.emberData.emberDataStrings.isValid | typingsSlinky.emberData.emberDataStrings.dirtyType | typingsSlinky.emberData.emberDataStrings.isError | typingsSlinky.emberData.emberDataStrings.isReloading | typingsSlinky.emberData.emberDataStrings.id | typingsSlinky.emberData.emberDataStrings.store | typingsSlinky.emberData.emberDataStrings.errors | typingsSlinky.emberData.emberDataStrings.adapterError | typingsSlinky.emberData.emberDataStrings.serialize | typingsSlinky.emberData.emberDataStrings.toJSON | typingsSlinky.emberData.emberDataStrings.ready | typingsSlinky.emberData.emberDataStrings.didLoad | typingsSlinky.emberData.emberDataStrings.didUpdate | typingsSlinky.emberData.emberDataStrings.didCreate | typingsSlinky.emberData.emberDataStrings.didDelete | typingsSlinky.emberData.emberDataStrings.becameInvalid | typingsSlinky.emberData.emberDataStrings.becameError | typingsSlinky.emberData.emberDataStrings.rolledBack | typingsSlinky.emberData.emberDataStrings.deleteRecord | typingsSlinky.emberData.emberDataStrings.destroyRecord | typingsSlinky.emberData.emberDataStrings.unloadRecord | typingsSlinky.emberData.emberDataStrings.changedAttributes | typingsSlinky.emberData.emberDataStrings.rollbackAttributes | typingsSlinky.emberData.emberDataStrings.save | typingsSlinky.emberData.emberDataStrings.reload | typingsSlinky.emberData.emberDataStrings.belongsTo | typingsSlinky.emberData.emberDataStrings.hasMany | typingsSlinky.emberData.emberDataStrings.eachRelationship
  ]
  
  // TODO: filter to attr properties only (TS 2.8)
  type RelationshipsFor[Model /* <: typingsSlinky.emberData.mod.DS.Model */] = typingsSlinky.emberData.mod.ModelKeys[Model]
}
