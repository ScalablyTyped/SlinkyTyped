package typingsSlinky.cassandraDriver.policiesMod.policies.timestampGeneration

import typingsSlinky.cassandraDriver.mod.Client
import typingsSlinky.cassandraDriver.typesMod.types.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimestampGenerator extends js.Object {
  def next(client: Client): Long | Double = js.native
}

object TimestampGenerator {
  @scala.inline
  def apply(next: Client => Long | Double): TimestampGenerator = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[TimestampGenerator]
  }
  @scala.inline
  implicit class TimestampGeneratorOps[Self <: TimestampGenerator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNext(value: Client => Long | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

