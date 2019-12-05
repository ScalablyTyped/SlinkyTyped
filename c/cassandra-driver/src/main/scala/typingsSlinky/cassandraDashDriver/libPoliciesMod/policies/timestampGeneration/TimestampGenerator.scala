package typingsSlinky.cassandraDashDriver.libPoliciesMod.policies.timestampGeneration

import typingsSlinky.cassandraDashDriver.cassandraDashDriverMod.Client
import typingsSlinky.cassandraDashDriver.libTypesMod.types.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimestampGenerator extends js.Object {
  def next(client: Client): Long | Double
}

object TimestampGenerator {
  @scala.inline
  def apply(next: Client => Long | Double): TimestampGenerator = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
  
    __obj.asInstanceOf[TimestampGenerator]
  }
}

