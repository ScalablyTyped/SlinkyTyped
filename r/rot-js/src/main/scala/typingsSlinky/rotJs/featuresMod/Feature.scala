package typingsSlinky.rotJs.featuresMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class Dungeon feature; has own .create() method
  */
@js.native
trait Feature extends js.Object {
  def create(digCallback: DigCallback): Unit = js.native
  def debug(): Unit = js.native
  def isValid(isWallCallback: TestPositionCallback, canBeDugCallback: TestPositionCallback): Boolean = js.native
}

object Feature {
  @scala.inline
  def apply(
    create: DigCallback => Unit,
    debug: () => Unit,
    isValid: (TestPositionCallback, TestPositionCallback) => Boolean
  ): Feature = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), debug = js.Any.fromFunction0(debug), isValid = js.Any.fromFunction2(isValid))
    __obj.asInstanceOf[Feature]
  }
  @scala.inline
  implicit class FeatureOps[Self <: Feature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: DigCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDebug(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsValid(value: (TestPositionCallback, TestPositionCallback) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

