package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object realm {
  
  /**
    * Extracts an intersection of keys from T, where the value extends the given PropType.
    */
  type ExtractPropertyNamesOfType[T, PropType] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends PropType? K : never}[keyof T] */ js.Any
  
  type Realm = typingsSlinky.realm.Realm_
  
  /**
    * Joins T stripped of all keys which value extends Realm.Collection and all inherited from Realm.Object,
    * with only the keys which value extends Realm.List, remapped as Arrays.
    */
  //
  type RealmInsertionModel[T] = (typingsSlinky.std.Omit[
    typingsSlinky.std.Omit[
      T, 
      /* keyof realm.Realm.Object */ typingsSlinky.realm.realmStrings.keys | typingsSlinky.realm.realmStrings.entries | typingsSlinky.realm.realmStrings.toJSON | typingsSlinky.realm.realmStrings.isValid | typingsSlinky.realm.realmStrings.objectSchema | typingsSlinky.realm.realmStrings.linkingObjects | typingsSlinky.realm.realmStrings.linkingObjectsCount | typingsSlinky.realm.realmStrings._objectId | typingsSlinky.realm.realmStrings.addListener | typingsSlinky.realm.realmStrings.removeListener | typingsSlinky.realm.realmStrings.removeAllListeners
    ], 
    typingsSlinky.realm.ExtractPropertyNamesOfType[T, typingsSlinky.realm.Realm.Collection[_]]
  ]) with (typingsSlinky.realm.RealmOptionalParMappedModel[
    typingsSlinky.std.Pick[
      T, 
      typingsSlinky.realm.ExtractPropertyNamesOfType[T, typingsSlinky.realm.Realm.List[_]]
    ]
  ])
  
  /**
    * Exchanges properties defined as Realm.List<Model> with an optional Array<Model | RealmInsertionModel<Model>>.
    */
  type RealmOptionalParMappedModel[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? T[K] extends realm.Realm.List<infer GT>? std.Array<any | realm.RealmInsertionModel<any>> : never}
    */ typingsSlinky.realm.realmStrings.RealmOptionalParMappedModel with org.scalablytyped.runtime.TopLevel[T]
}
