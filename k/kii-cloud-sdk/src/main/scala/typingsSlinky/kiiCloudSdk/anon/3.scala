package typingsSlinky.kiiCloudSdk.anon

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `3` extends js.Object {
  def failure(error: js.Error): js.Any
  def success(group: KiiGroup): js.Any
}

object `3` {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: KiiGroup => js.Any): `3` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`3`]
  }
}

