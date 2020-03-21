package typingsSlinky.kiiCloudSdk

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiThing
import typingsSlinky.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon28 extends js.Object {
  def failure(error: js.Error): js.Any
  def success(thing: KiiThing, user: KiiUser, isOwner: Boolean): js.Any
}

object Anon28 {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: (KiiThing, KiiUser, Boolean) => js.Any): Anon28 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction3(success))
  
    __obj.asInstanceOf[Anon28]
  }
}

