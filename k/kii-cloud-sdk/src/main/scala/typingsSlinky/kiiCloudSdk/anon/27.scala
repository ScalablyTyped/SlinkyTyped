package typingsSlinky.kiiCloudSdk.anon

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiThing
import typingsSlinky.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `27` extends js.Object {
  def failure(error: js.Error): js.Any
  def success(thing: KiiThing, group: KiiUser): js.Any
}

object `27` {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: (KiiThing, KiiUser) => js.Any): `27` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`27`]
  }
}

