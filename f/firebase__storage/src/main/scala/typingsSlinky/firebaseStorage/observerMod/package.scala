package typingsSlinky.firebaseStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object observerMod {
  
  type CompleteFn = js.Function0[scala.Unit]
  
  type ErrorFn = js.Function1[
    /* error */ typingsSlinky.firebaseStorage.errorMod.FirebaseStorageError, 
    scala.Unit
  ]
  
  type NextFn[T] = js.Function1[/* value */ T, scala.Unit]
  
  type Subscribe[T] = js.Function3[
    /* next */ js.UndefOr[
      typingsSlinky.firebaseStorage.observerMod.NextFn[T] | typingsSlinky.firebaseStorage.observerMod.StorageObserver[T]
    ], 
    /* error */ js.UndefOr[typingsSlinky.firebaseStorage.observerMod.ErrorFn], 
    /* complete */ js.UndefOr[typingsSlinky.firebaseStorage.observerMod.CompleteFn], 
    typingsSlinky.firebaseStorage.observerMod.Unsubscribe
  ]
  
  type Unsubscribe = js.Function0[scala.Unit]
}
