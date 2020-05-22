package typingsSlinky.kiiCloudSdk.anon

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiTopic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `31`[T] extends js.Object {
  def failure(error: js.Error): js.Any
  def success(topic: KiiTopic, message: T): js.Any
}

object `31` {
  @scala.inline
  def apply[T](failure: js.Error => js.Any, success: (KiiTopic, T) => js.Any): `31`[T] = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`31`[T]]
  }
}

