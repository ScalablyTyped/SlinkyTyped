package typingsSlinky.emberData.mod.DS

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.emberData.anon.Id
import typingsSlinky.emberData.anon.Ids
import typingsSlinky.emberData.anon.`0`
import typingsSlinky.emberData.mod.AttributeMeta
import typingsSlinky.emberData.mod.AttributesFor
import typingsSlinky.emberData.mod.ModelKeys
import typingsSlinky.emberData.mod.RelationshipMeta
import typingsSlinky.emberData.mod.RelationshipsFor
import typingsSlinky.emberData.registriesModelMod.ModelRegistry
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ember-data", "DS.Snapshot")
@js.native
class Snapshot[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */] () extends StObject {
  
  /**
    * Returns the value of an attribute.
    */
  def attr[L /* <: AttributesFor[
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] */](keyName: L): /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K][L] */ js.Any = js.native
  
  /**
    * Returns all attributes and their corresponding values.
    */
  def attributes(): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ L in keyof ember-data.ember-data/types/registries/model.ModelRegistry[K] ]: ember-data.ember-data/types/registries/model.ModelRegistry[K][L]}
    */ typingsSlinky.emberData.emberDataStrings.Snapshot with TopLevel[ModelRegistry] = js.native
  
  /**
    * Returns the current value of a belongsTo relationship.
    */
  def belongsTo[L /* <: RelationshipsFor[
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] */](keyName: L): js.UndefOr[
    (Snapshot[/* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String]) | Null
  ] = js.native
  def belongsTo[L /* <: RelationshipsFor[
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] */](keyName: L, options: js.Object): js.UndefOr[
    (Snapshot[/* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String]) | Null
  ] = js.native
  def belongsTo[L /* <: RelationshipsFor[
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] */](keyName: L, options: Id): js.UndefOr[String | Null] = js.native
  
  /**
    * Returns all changed attributes and their old and new values.
    */
  def changedAttributes(): Partial[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ L in keyof ember-data.ember-data/types/registries/model.ModelRegistry[K] ]: ember-data.ember-data/types/registries/model.ModelRegistry[K][L]}
    */ typingsSlinky.emberData.emberDataStrings.Snapshot with TopLevel[ModelRegistry]
  ] = js.native
  
  /**
    * Iterates through all the attributes of the model, calling the passed
    * function on each attribute.
    */
  def eachAttribute[M /* <: /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any */](callback: js.Function2[/* key */ ModelKeys[M], /* meta */ AttributeMeta[M], Unit]): Unit = js.native
  def eachAttribute[M /* <: /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any */](
    callback: js.Function2[/* key */ ModelKeys[M], /* meta */ AttributeMeta[M], Unit],
    binding: js.Object
  ): Unit = js.native
  
  /**
    * Iterates through all the relationships of the model, calling the passed
    * function on each relationship.
    */
  def eachRelationship[M /* <: /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any */](callback: js.Function2[/* key */ ModelKeys[M], /* meta */ RelationshipMeta[M], Unit]): Unit = js.native
  def eachRelationship[M /* <: /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any */](
    callback: js.Function2[/* key */ ModelKeys[M], /* meta */ RelationshipMeta[M], Unit],
    binding: js.Object
  ): Unit = js.native
  
  /**
    * Returns the current value of a hasMany relationship.
    */
  def hasMany[L /* <: RelationshipsFor[
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] */](keyName: L): js.UndefOr[
    js.Array[
      Snapshot[/* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String]
    ]
  ] = js.native
  def hasMany[L /* <: RelationshipsFor[
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] */](keyName: L, options: Ids): js.UndefOr[
    js.Array[
      Snapshot[/* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String]
    ]
  ] = js.native
  def hasMany[L /* <: RelationshipsFor[
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] */](keyName: L, options: `0`): js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The id of the snapshot's underlying record
    */
  var id: String = js.native
  
  /**
    * The name of the type of the underlying record for this snapshot, as a string.
    */
  var modelName: K = js.native
  
  /**
    * The underlying record for this snapshot. Can be used to access methods and
    * properties defined on the record.
    */
  var record: /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any = js.native
  
  /**
    * Serializes the snapshot using the serializer for the model.
    */
  def serialize[O /* <: js.Object */](options: O): js.Object = js.native
  
  /**
    * The type of the underlying record for this snapshot, as a DS.Model.
    */
  var `type`: /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any = js.native
}
