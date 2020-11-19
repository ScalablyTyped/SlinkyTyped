package typingsSlinky.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Sync {
  
  type ConnectionNotificationCallback = js.Function2[
    /* newState */ typingsSlinky.realm.Realm.Sync.ConnectionState, 
    /* oldState */ typingsSlinky.realm.Realm.Sync.ConnectionState, 
    scala.Unit
  ]
  
  type ErrorCallback = js.Function2[
    /* session */ typingsSlinky.realm.Realm.Sync.Session, 
    /* error */ typingsSlinky.realm.Realm.Sync.SyncError, 
    scala.Unit
  ]
  
  type ProgressNotificationCallback = js.Function2[/* transferred */ scala.Double, /* transferable */ scala.Double, scala.Unit]
  
  type RealmWatchPredicate = js.Function1[/* realmPath */ java.lang.String, scala.Boolean]
  
  type SSLVerifyCallback = js.Function1[
    /* sslVerifyObject */ typingsSlinky.realm.Realm.Sync.SSLVerifyObject, 
    scala.Boolean
  ]
  
  type SubscriptionNotificationCallback = js.Function2[
    /* subscription */ typingsSlinky.realm.Realm.Sync.Subscription, 
    /* state */ typingsSlinky.realm.Realm.Sync.SubscriptionState, 
    scala.Unit
  ]
}
