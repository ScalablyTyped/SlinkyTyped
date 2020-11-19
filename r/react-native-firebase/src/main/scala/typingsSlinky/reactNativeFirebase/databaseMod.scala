package typingsSlinky.reactNativeFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-firebase/database", JSImport.Namespace)
@js.native
object databaseMod extends js.Object {
  
  @js.native
  trait ThenableReference[T]
    extends js.Promise[T]
       with typingsSlinky.reactNativeFirebase.mod.RNFirebase.database.Reference
  
  type DataSnapshot = typingsSlinky.reactNativeFirebase.mod.RNFirebase.database.DataSnapshot
  
  type Database = typingsSlinky.reactNativeFirebase.mod.RNFirebase.database.Database
  
  type DatabaseStatics = typingsSlinky.reactNativeFirebase.mod.RNFirebase.database.DatabaseStatics
  
  type Query = typingsSlinky.reactNativeFirebase.mod.RNFirebase.database.Query
  
  type QueryErrorCallback = typingsSlinky.reactNativeFirebase.mod.RNFirebase.database.QueryErrorCallback
  
  type QueryEventType = typingsSlinky.reactNativeFirebase.mod.RNFirebase.database.QueryEventType
  
  type QuerySuccessCallback = typingsSlinky.reactNativeFirebase.mod.RNFirebase.database.QuerySuccessCallback
  
  type Reference = typingsSlinky.reactNativeFirebase.mod.RNFirebase.database.Reference
  
  type RnReference = typingsSlinky.reactNativeFirebase.mod.RNFirebase.database.RnReference
}
