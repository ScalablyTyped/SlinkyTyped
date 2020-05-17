package typingsSlinky.realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Realm {
  type CollectionChangeCallback[T] = js.Function2[
    /* collection */ typingsSlinky.realm.Realm.Collection[T], 
    /* change */ typingsSlinky.realm.Realm.CollectionChangeSet, 
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
}
