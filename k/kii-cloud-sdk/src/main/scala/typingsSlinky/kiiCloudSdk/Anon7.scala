package typingsSlinky.kiiCloudSdk

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon7 extends js.Object {
  def failure(error: js.Error): js.Any
  def success(group: KiiGroup): js.Any
}

object Anon7 {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: KiiGroup => js.Any): Anon7 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon7]
  }
}

