package typingsSlinky.kiiCloudSdk

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon6 extends js.Object {
  def failure(error: js.Error): js.Any
  def success(group: KiiUser): js.Any
}

object Anon6 {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: KiiUser => js.Any): Anon6 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon6]
  }
}

