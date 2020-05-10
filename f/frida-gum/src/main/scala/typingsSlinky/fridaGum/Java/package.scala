package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Java {
  type Env = js.Any
  type Members[T] = typingsSlinky.std.Record[
    /* keyof T */ java.lang.String, 
    typingsSlinky.fridaGum.Java.MethodDispatcher[js.Object] | (typingsSlinky.fridaGum.Java.Field[js.Any, js.Object])
  ]
  type MethodImplementation[This /* <: typingsSlinky.fridaGum.Java.Members[This] */] = js.ThisFunction1[/* this */ typingsSlinky.fridaGum.Java.Wrapper[This], /* repeated */ js.Any, js.Any]
}
