package typingsSlinky.kiiDashCloudDashSdk

import typingsSlinky.kiiDashCloudDashSdk.KiiCloud.KiiThing
import typingsSlinky.kiiDashCloudDashSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureIsOwner extends js.Object {
  def failure(error: js.Error): js.Any
  def success(thing: KiiThing, user: KiiUser, isOwner: Boolean): js.Any
}

object Anon_ErrorFailureIsOwner {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: (KiiThing, KiiUser, Boolean) => js.Any): Anon_ErrorFailureIsOwner = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction3(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureIsOwner]
  }
}

