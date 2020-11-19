package typingsSlinky.reactNativeFirebase.mod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object database {
  
  type QueryErrorCallback = js.Function1[/* e */ js.Error, scala.Unit]
  
  type QuerySuccessCallback = js.Function2[
    /* snapshot */ typingsSlinky.reactNativeFirebase.mod.RNFirebase.database.DataSnapshot, 
    /* previousChildId */ js.UndefOr[java.lang.String | scala.Null], 
    scala.Unit
  ]
}
