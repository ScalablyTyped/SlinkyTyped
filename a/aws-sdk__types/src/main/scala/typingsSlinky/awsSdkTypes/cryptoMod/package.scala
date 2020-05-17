package typingsSlinky.awsSdkTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cryptoMod {
  type StreamHasher[StreamType] = js.Function2[
    /* hashCtor */ typingsSlinky.awsSdkTypes.anon.Instantiable, 
    /* stream */ StreamType, 
    js.Promise[js.typedarray.Uint8Array]
  ]
  type randomValues = js.Function1[/* byteLength */ scala.Double, js.Promise[js.typedarray.Uint8Array]]
}
