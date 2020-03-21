package typingsSlinky.nextReduxWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MakeStore = js.Function2[
    /* initialState */ js.Any, 
    /* options */ typingsSlinky.nextReduxWrapper.mod.MakeStoreOptions, 
    typingsSlinky.redux.mod.Store[js.Any, typingsSlinky.redux.mod.AnyAction]
  ]
}
