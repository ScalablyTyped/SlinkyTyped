package typingsSlinky.reactNativeFirebase.mod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object functions {
  
  /**
    * An HttpsCallable is a reference to a "callable" http trigger in
    * Google Cloud Functions.
    */
  type HttpsCallable[Params, Result] = (js.Function1[
    /* data */ Params, 
    js.Promise[
      typingsSlinky.reactNativeFirebase.mod.RNFirebase.functions.HttpsCallableResult[Result]
    ]
  ]) | (js.Function0[
    js.Promise[
      typingsSlinky.reactNativeFirebase.mod.RNFirebase.functions.HttpsCallableResult[Result]
    ]
  ])
  
  type HttpsErrorCode = org.scalablytyped.runtime.StringDictionary[typingsSlinky.reactNativeFirebase.mod.RNFirebase.functions.FunctionsErrorCode]
}
