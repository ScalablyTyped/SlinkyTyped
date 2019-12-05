package typingsSlinky.dispatchr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object addonsCreateStoreMod {
  import typingsSlinky.dispatchr.dispatchrMod.Store
  import typingsSlinky.dispatchr.dispatchrStrings.handlers
  import typingsSlinky.dispatchr.dispatchrStrings.mixins
  import typingsSlinky.dispatchr.dispatchrStrings.statics
  import typingsSlinky.dispatchr.dispatchrStrings.storeName
  import typingsSlinky.std.Pick

  type Omit[T, K /* <: String */] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
  // see: https://github.com/yahoo/fluxible/blob/dispatchr-v1.2.0/packages/dispatchr/addons/createStore.js#L9
  type StoreThis[T /* <: StoreOptions */] = (Omit[T, statics | storeName | handlers | mixins]) with Store[js.Object]
}
