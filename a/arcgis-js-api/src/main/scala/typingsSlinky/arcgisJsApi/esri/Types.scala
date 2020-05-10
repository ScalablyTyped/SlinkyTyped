package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.HashMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Types[T /* <: Base */, Base] extends js.Object {
  var base: Constructor[Base] | js.Function = js.native
  var key: String | (js.Function1[/* obj */ js.Any, String]) = js.native
  var typeMap: HashMap[Constructor[T]] = js.native
}

object Types {
  @scala.inline
  def apply[T, Base](
    base: Constructor[Base] | js.Function,
    key: String | (js.Function1[/* obj */ js.Any, String]),
    typeMap: HashMap[Constructor[T]]
  ): Types[T, Base] = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], typeMap = typeMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Types[T, Base]]
  }
  @scala.inline
  implicit class TypesOps[Self[t, base] <: Types[t, base], T, Base] (val x: Self[T, Base]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, Base] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, Base]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, Base]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, Base]) with Other]
    @scala.inline
    def withBase(value: Constructor[Base] | js.Function): Self[T, Base] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyFunction1(value: /* obj */ js.Any => String): Self[T, Base] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKey(value: String | (js.Function1[/* obj */ js.Any, String])): Self[T, Base] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeMap(value: HashMap[Constructor[T]]): Self[T, Base] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

