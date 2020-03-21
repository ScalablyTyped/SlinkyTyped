package typingsSlinky.kiiCloudSdk

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiGroup
import typingsSlinky.kiiCloudSdk.KiiCloud.KiiThing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon31 extends js.Object {
  def failure(error: js.Error): js.Any
  def success(thing: KiiThing, group: KiiGroup): js.Any
}

object Anon31 {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: (KiiThing, KiiGroup) => js.Any): Anon31 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon31]
  }
}

