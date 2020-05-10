package typingsSlinky.pathjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPath extends js.Object {
  var core: IPathCore = js.native
  var history: IPathHistory = js.native
  var routes: IPathRoutes = js.native
  def dispatch(passed_route: String): Unit = js.native
  def listen(): Unit = js.native
  def map(path: String): IPathRoute = js.native
  def `match`(path: String, parameterize: Boolean): IPathRoute | Null = js.native
  def rescue(fn: js.Function): Unit = js.native
  def root(path: String): Unit = js.native
}

object IPath {
  @scala.inline
  def apply(
    core: IPathCore,
    dispatch: String => Unit,
    history: IPathHistory,
    listen: () => Unit,
    map: String => IPathRoute,
    `match`: (String, Boolean) => IPathRoute | Null,
    rescue: js.Function => Unit,
    root: String => Unit,
    routes: IPathRoutes
  ): IPath = {
    val __obj = js.Dynamic.literal(core = core.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1(dispatch), history = history.asInstanceOf[js.Any], listen = js.Any.fromFunction0(listen), map = js.Any.fromFunction1(map), rescue = js.Any.fromFunction1(rescue), root = js.Any.fromFunction1(root), routes = routes.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
    __obj.asInstanceOf[IPath]
  }
  @scala.inline
  implicit class IPathOps[Self <: IPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCore(value: IPathCore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("core")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispatch(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHistory(value: IPathHistory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMap(value: String => IPathRoute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMatch(value: (String, Boolean) => IPathRoute | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRescue(value: js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rescue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRoot(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRoutes(value: IPathRoutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

