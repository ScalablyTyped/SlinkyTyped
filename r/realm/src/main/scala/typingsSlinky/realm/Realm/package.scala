package typingsSlinky.realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Realm {
  
  type CollectionChangeCallback[T] = js.Function2[
    /* collection */ typingsSlinky.realm.Realm.Collection[T], 
    /* change */ typingsSlinky.realm.Realm.ObjectChanges, 
    scala.Unit
  ]
  
  /**
    * A function which can be called to migrate a Realm from one version of the schema to another.
    */
  type MigrationCallback = js.Function2[
    /* oldRealm */ typingsSlinky.realm.Realm, 
    /* newRealm */ typingsSlinky.realm.Realm, 
    scala.Unit
  ]
  
  type ObjectChangeCallback = js.Function2[
    /* object */ typingsSlinky.realm.Realm.Object, 
    /* changes */ typingsSlinky.realm.Realm.ObjectChangeSet, 
    scala.Unit
  ]
  
  // object props type
  type ObjectPropsType = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  // properties types
  type PropertiesTypes = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.realm.Realm.PropertyType | typingsSlinky.realm.Realm.ObjectSchemaProperty
  ]
  
  /**
    * PropertyType
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~PropertyType }
    */
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.realm.realmStrings.bool
    - typingsSlinky.realm.realmStrings.int
    - typingsSlinky.realm.realmStrings.float
    - typingsSlinky.realm.realmStrings.double
    - typingsSlinky.realm.realmStrings.string
    - typingsSlinky.realm.realmStrings.data
    - typingsSlinky.realm.realmStrings.date
    - typingsSlinky.realm.realmStrings.list
    - typingsSlinky.realm.realmStrings.linkingObjects
  */
  type PropertyType = typingsSlinky.realm.Realm._PropertyType | java.lang.String
  
  /**
    * SortDescriptor
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Collection.html#~SortDescriptor }
    */
  type SortDescriptor = js.Array[java.lang.String] | (js.Tuple2[java.lang.String, scala.Boolean])
}
