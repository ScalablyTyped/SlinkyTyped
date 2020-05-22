package typingsSlinky.kiiCloudSdk.anon

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiGroup
import typingsSlinky.kiiCloudSdk.KiiCloud.KiiThing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `26` extends js.Object {
  def failure(error: js.Error): js.Any
  def success(thing: KiiThing, user: KiiGroup, isOwner: Boolean): js.Any
}

object `26` {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: (KiiThing, KiiGroup, Boolean) => js.Any): `26` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction3(success))
    __obj.asInstanceOf[`26`]
  }
}

