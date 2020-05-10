package typingsSlinky.reduxFirstRouterRestoreScroll

import typingsSlinky.reduxFirstRouter.mod.LocationState
import typingsSlinky.reduxFirstRouterRestoreScroll.reduxFirstRouterRestoreScrollStrings.`profile-box`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonManual extends js.Object {
  /** @default false */
  var manual: js.UndefOr[Boolean] = js.native
  /** Use to implement custom scroll positioning. */
  var shouldUpdateScroll: js.UndefOr[
    js.Function2[
      /* prev */ LocationState[js.Object, _], 
      /* locationState */ LocationState[js.Object, _], 
      Boolean | `profile-box` | (js.Tuple2[Double, Double])
    ]
  ] = js.native
  /**
    * To implement a custom backend storage for scroll state, pass a custom
    * stateStorage object. The object should implement the methods as described
    * by the package `scroll-behavior` as well as a function called setPrevKey
    * that keeps track of the previous key.
    */
  var stateStorage: js.UndefOr[AnonRead] = js.native
}

object AnonManual {
  @scala.inline
  def apply(): AnonManual = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonManual]
  }
  @scala.inline
  implicit class AnonManualOps[Self <: AnonManual] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManual(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manual")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldUpdateScroll(
      value: (/* prev */ LocationState[js.Object, _], /* locationState */ LocationState[js.Object, _]) => Boolean | `profile-box` | (js.Tuple2[Double, Double])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldUpdateScroll")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutShouldUpdateScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldUpdateScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withStateStorage(value: AnonRead): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateStorage")(js.undefined)
        ret
    }
  }
  
}

