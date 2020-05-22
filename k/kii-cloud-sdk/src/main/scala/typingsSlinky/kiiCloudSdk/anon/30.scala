package typingsSlinky.kiiCloudSdk.anon

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiTopic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `30` extends js.Object {
  def failure(error: js.Error): js.Any
  def success(topic: KiiTopic): js.Any
}

object `30` {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: KiiTopic => js.Any): `30` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`30`]
  }
}

