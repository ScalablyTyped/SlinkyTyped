package typingsSlinky.apolloEnv.objectMod._Global_

import typingsSlinky.apolloEnv.arrayMod._Global_.Array
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectConstructor extends js.Object {
  def fromEntries[K /* <: String */, V](map: Array[js.Tuple2[K, V]]): Record[K, V] = js.native
}

object ObjectConstructor {
  @scala.inline
  def apply(fromEntries: Array[js.Tuple2[js.Any, js.Any]] => Record[js.Any, js.Any]): ObjectConstructor = {
    val __obj = js.Dynamic.literal(fromEntries = js.Any.fromFunction1(fromEntries))
    __obj.asInstanceOf[ObjectConstructor]
  }
  @scala.inline
  implicit class ObjectConstructorOps[Self <: ObjectConstructor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromEntries(value: Array[js.Tuple2[js.Any, js.Any]] => Record[js.Any, js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromEntries")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

