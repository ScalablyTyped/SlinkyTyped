package typingsSlinky.realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Realm {
  
  type App[FunctionsFactoryType /* <: js.Object */, CustomDataType /* <: js.Object */] = typingsSlinky.realm.Realm.App_[FunctionsFactoryType, CustomDataType]
  
  type CollectionChangeCallback[T] = js.Function2[
    /* collection */ typingsSlinky.realm.Realm.Collection[T], 
    /* changes */ typingsSlinky.realm.Realm.CollectionChangeSet, 
    scala.Unit
  ]
  
  type ConnectionNotificationCallback = js.Function2[
    /* newState */ typingsSlinky.realm.Realm.ConnectionState, 
    /* oldState */ typingsSlinky.realm.Realm.ConnectionState, 
    scala.Unit
  ]
  
  type Credentials[PayloadType /* <: js.Object */] = typingsSlinky.realm.Realm.Credentials_[PayloadType]
  
  type ErrorCallback = js.Function2[
    /* session */ typingsSlinky.realm.Realm.App.Sync.Session, 
    /* error */ typingsSlinky.realm.Realm.SyncError, 
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
  
  /**
    * realm configuration used for overriding default configuration values.
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~Configuration }
    */
  // object props type
  type ObjectPropsType = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ProgressNotificationCallback = js.Function2[/* transferred */ scala.Double, /* transferable */ scala.Double, scala.Unit]
  
  // properties types
  type PropertiesTypes = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.realm.Realm.PropertyType | typingsSlinky.realm.Realm.ObjectSchemaProperty | typingsSlinky.realm.Realm.ObjectSchema
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
    - typingsSlinky.realm.realmStrings.decimal128
    - typingsSlinky.realm.realmStrings.objectId
    - typingsSlinky.realm.realmStrings.string
    - typingsSlinky.realm.realmStrings.data
    - typingsSlinky.realm.realmStrings.date
    - typingsSlinky.realm.realmStrings.list
    - typingsSlinky.realm.realmStrings.linkingObjects
  */
  type PropertyType = typingsSlinky.realm.Realm._PropertyType | java.lang.String
  
  /**
    * A function which executes on the MongoDB Realm platform.
    */
  type RealmFunction[R, A /* <: js.Array[_] */] = js.Function1[/* args */ A, js.Promise[R]]
  
  type Services = typingsSlinky.realm.Realm.Services_
  
  /**
    * SortDescriptor
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Collection.html#~SortDescriptor }
    */
  type SortDescriptor = js.Array[java.lang.String] | (js.Tuple2[java.lang.String, scala.Boolean])
  
  type UserMap = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.realm.Realm.User[typingsSlinky.realm.Realm.DefaultFunctionsFactory, js.Any]
  ]
}
