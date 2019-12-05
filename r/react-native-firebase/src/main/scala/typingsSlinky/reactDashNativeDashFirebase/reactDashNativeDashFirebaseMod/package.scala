package typingsSlinky.reactDashNativeDashFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashFirebaseMod {
  import typingsSlinky.reactDashNativeDashFirebase.Anon_NativeModuleExists
  import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.Analytics
  import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.auth.Auth
  import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.auth.AuthStatics
  import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.config.Config
  import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.crashlytics.Crashlytics
  import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.database.Database
  import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.database.DatabaseStatics
  import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Firestore
  import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.FirestoreStatics
  import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.functions.Functions
  import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.functions.FunctionsStatics
  import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.iid.InstanceId
  import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.links.Links
  import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.links.LinksStatics
  import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.messaging.Messaging
  import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.messaging.MessagingStatics
  import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Notifications
  import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.NotificationsStatics
  import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.perf.Perf
  import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.storage.Storage
  import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.storage.StorageStatics

  // type AdmobModule = FirebaseModuleAndStatics<RNFirebase.admob.AdMob>;
  type AnalyticsModule = FirebaseModuleAndStatics[Analytics, js.Object]
  type AuthModule = FirebaseModuleAndStatics[Auth, AuthStatics]
  type ConfigModule = FirebaseModuleAndStatics[Config, js.Object]
  type CrashlyticsModule = FirebaseModuleAndStatics[Crashlytics, js.Object]
  type DatabaseModule = FirebaseModuleAndStatics[Database, DatabaseStatics]
  type Firebase = Firebase_
  type FirebaseModuleAndStatics[M, S] = Anon_NativeModuleExists[M] with S
  type FirestoreModule = FirebaseModuleAndStatics[Firestore, FirestoreStatics]
  type FunctionsModule = FirebaseModuleAndStatics[Functions, FunctionsStatics]
  type IidModule = FirebaseModuleAndStatics[InstanceId, js.Object]
  type LinksModule = FirebaseModuleAndStatics[Links, LinksStatics]
  type MessagingModule = FirebaseModuleAndStatics[Messaging, MessagingStatics]
  type NotificationsModule = FirebaseModuleAndStatics[Notifications, NotificationsStatics]
  type PerfModule = FirebaseModuleAndStatics[Perf, js.Object]
  type StorageModule = FirebaseModuleAndStatics[Storage, StorageStatics]
}
