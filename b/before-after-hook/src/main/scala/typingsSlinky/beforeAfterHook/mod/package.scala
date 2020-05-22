package typingsSlinky.beforeAfterHook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AfterHook[O, R] = js.Function2[/* result */ R, /* options */ O, scala.Unit]
  type AnyHook[O, R, E] = typingsSlinky.beforeAfterHook.mod.BeforeHook[O] | (typingsSlinky.beforeAfterHook.mod.ErrorHook[O, E]) | (typingsSlinky.beforeAfterHook.mod.AfterHook[O, R]) | (typingsSlinky.beforeAfterHook.mod.WrapHook[O, R])
  type BeforeHook[O] = js.Function1[/* options */ O, scala.Unit]
  type Collection = org.scalablytyped.runtime.Instantiable0[typingsSlinky.beforeAfterHook.mod.HookCollection]
  type ErrorHook[O, E] = js.Function2[/* error */ E, /* options */ O, scala.Unit]
  type HookMethod[O, R] = js.Function1[/* options */ O, R | js.Promise[R]]
  type Singular = org.scalablytyped.runtime.Instantiable0[typingsSlinky.beforeAfterHook.mod.HookSingular[js.Object, js.Object, js.Object]]
  type WrapHook[O, R] = js.Function2[
    /* hookMethod */ typingsSlinky.beforeAfterHook.mod.HookMethod[O, R], 
    /* options */ O, 
    R | js.Promise[R]
  ]
}
