package typingsSlinky.dispatchr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object createStoreMod {
  
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
  
  // see: https://github.com/yahoo/fluxible/blob/dispatchr-v1.2.0/packages/dispatchr/addons/createStore.js#L9
  type StoreThis[T /* <: typingsSlinky.dispatchr.createStoreMod.StoreOptions */] = (typingsSlinky.dispatchr.createStoreMod.Omit[
    T, 
    typingsSlinky.dispatchr.dispatchrStrings.statics | typingsSlinky.dispatchr.dispatchrStrings.storeName | typingsSlinky.dispatchr.dispatchrStrings.handlers | typingsSlinky.dispatchr.dispatchrStrings.mixins
  ]) with typingsSlinky.dispatchr.mod.Store[js.Object]
}
