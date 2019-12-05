package typingsSlinky.kiiDashCloudDashSdk

import typingsSlinky.kiiDashCloudDashSdk.KiiCloud.KiiThing
import typingsSlinky.kiiDashCloudDashSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureGroupSuccessThing extends js.Object {
  def failure(error: js.Error): js.Any
  def success(thing: KiiThing, group: KiiUser): js.Any
}

object Anon_ErrorFailureGroupSuccessThing {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: (KiiThing, KiiUser) => js.Any): Anon_ErrorFailureGroupSuccessThing = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureGroupSuccessThing]
  }
}

