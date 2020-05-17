package typingsSlinky.reactNativeFabric.mod

import typingsSlinky.reactNativeFabric.anon.Crash
import typingsSlinky.reactNativeFabric.anon.LogAddToCart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fabric extends js.Object {
  /**
    * API for interacting with the Answers kit.
    *
    * https://docs.fabric.io/ios/answers/index.html
    */
  var Answers: LogAddToCart = js.native
  /**
    * API for interacting with the Crashlytics kit.
    *
    * https://docs.fabric.io/ios/crashlytics/index.html
    */        
  var Crashlytics: Crash = js.native
}

object Fabric {
  @scala.inline
  def apply(Answers: LogAddToCart, Crashlytics: Crash): Fabric = {
    val __obj = js.Dynamic.literal(Answers = Answers.asInstanceOf[js.Any], Crashlytics = Crashlytics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fabric]
  }
  @scala.inline
  implicit class FabricOps[Self <: Fabric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnswers(value: LogAddToCart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Answers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrashlytics(value: Crash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Crashlytics")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

