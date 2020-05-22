package typingsSlinky.kiiCloudSdk.anon

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiThing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  def failure(error: js.Error): js.Any
  def success(thing: KiiThing): js.Any
}

object `1` {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: KiiThing => js.Any): `1` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`1`]
  }
}

