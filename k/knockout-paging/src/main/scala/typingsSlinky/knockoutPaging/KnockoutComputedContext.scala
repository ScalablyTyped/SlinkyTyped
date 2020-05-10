package typingsSlinky.knockoutPaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutComputedContext extends js.Object {
  var isSleeping: Boolean = js.native
  def getDependenciesCount(): Double = js.native
  def isInitial(): Boolean = js.native
}

object KnockoutComputedContext {
  @scala.inline
  def apply(getDependenciesCount: () => Double, isInitial: () => Boolean, isSleeping: Boolean): KnockoutComputedContext = {
    val __obj = js.Dynamic.literal(getDependenciesCount = js.Any.fromFunction0(getDependenciesCount), isInitial = js.Any.fromFunction0(isInitial), isSleeping = isSleeping.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutComputedContext]
  }
  @scala.inline
  implicit class KnockoutComputedContextOps[Self <: KnockoutComputedContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDependenciesCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDependenciesCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInitial(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInitial")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSleeping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSleeping")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

