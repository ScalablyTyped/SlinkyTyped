package typingsSlinky.reactReduxI18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DispatchCallback[S /* <: typingsSlinky.redux.mod.Action[_] */] = js.Function2[
    /* dispatch */ js.UndefOr[typingsSlinky.redux.mod.Dispatch[S]], 
    /* getState */ js.UndefOr[js.Function0[S]], 
    js.Any
  ]
  type TranslationObjects = org.scalablytyped.runtime.StringDictionary[typingsSlinky.reactReduxI18n.mod.SubTranslationObject]
}
