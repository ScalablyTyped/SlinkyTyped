package typingsSlinky.oracleOraclejet.ojrouterMod

import typingsSlinky.oracleOraclejet.anon.HasChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterState_ extends js.Object {
  var canEnter: js.Function0[Boolean | js.Promise[Boolean]] = js.native
  var canExit: js.Function0[Boolean | js.Promise[Boolean]] = js.native
  var enter: js.Function0[js.Promise[Unit] | Unit] = js.native
  var exit: js.Function0[js.Promise[Unit] | Unit] = js.native
  val id: String = js.native
  var label: js.UndefOr[String] = js.native
  var parameters: js.Object = js.native
  var title: String | js.Function0[js.UndefOr[String]] = js.native
  var value: js.Any = js.native
  // constructor(id: string, options?: RouterState.ConfigOptions, router?: Router);
  def go(): js.Promise[HasChanged] = js.native
  def isCurrent(): Boolean = js.native
}

object RouterState_ {
  @scala.inline
  def apply(
    canEnter: () => Boolean | js.Promise[Boolean],
    canExit: () => Boolean | js.Promise[Boolean],
    enter: () => js.Promise[Unit] | Unit,
    exit: () => js.Promise[Unit] | Unit,
    go: () => js.Promise[HasChanged],
    id: String,
    isCurrent: () => Boolean,
    parameters: js.Object,
    title: String | js.Function0[js.UndefOr[String]],
    value: js.Any
  ): RouterState_ = {
    val __obj = js.Dynamic.literal(canEnter = js.Any.fromFunction0(canEnter), canExit = js.Any.fromFunction0(canExit), enter = js.Any.fromFunction0(enter), exit = js.Any.fromFunction0(exit), go = js.Any.fromFunction0(go), id = id.asInstanceOf[js.Any], isCurrent = js.Any.fromFunction0(isCurrent), parameters = parameters.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterState_]
  }
  @scala.inline
  implicit class RouterState_Ops[Self <: RouterState_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanEnter(value: () => Boolean | js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canEnter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCanExit(value: () => Boolean | js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canExit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnter(value: () => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExit(value: () => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGo(value: () => js.Promise[HasChanged]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("go")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCurrent(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCurrent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParameters(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleFunction0(value: () => js.UndefOr[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTitle(value: String | js.Function0[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
  }
  
}

