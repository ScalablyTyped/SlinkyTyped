package typingsSlinky.normalizr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalizedSchema[E, R] extends js.Object {
  var entities: E = js.native
  var result: R = js.native
}

object NormalizedSchema {
  @scala.inline
  def apply[E, R](entities: E, result: R): NormalizedSchema[E, R] = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedSchema[E, R]]
  }
  @scala.inline
  implicit class NormalizedSchemaOps[Self[e, r] <: NormalizedSchema[e, r], E, R] (val x: Self[E, R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[E, R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[E, R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[E, R]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[E, R]) with Other]
    @scala.inline
    def withEntities(value: E): Self[E, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: R): Self[E, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

