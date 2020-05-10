package typingsSlinky.ravenForRedux.mod

import typingsSlinky.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RavenMiddlewareOptions[T] extends js.Object {
  var actionTransformer: js.UndefOr[js.Function1[/* action */ Action[_], Action[_]]] = js.native
  var breadcrumbCategory: js.UndefOr[String] = js.native
  var breadcrumbDataFromAction: js.UndefOr[js.Function1[/* action */ Action[_], _]] = js.native
  var filterBreadcrumbActions: js.UndefOr[js.Function1[/* action */ Action[_], Boolean]] = js.native
  var getUserContext: js.UndefOr[js.Function1[/* state */ T, RavenUserContext]] = js.native
  var stateTransformer: js.UndefOr[js.Function1[/* state */ T, T]] = js.native
}

object RavenMiddlewareOptions {
  @scala.inline
  def apply[T](): RavenMiddlewareOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RavenMiddlewareOptions[T]]
  }
  @scala.inline
  implicit class RavenMiddlewareOptionsOps[Self[t] <: RavenMiddlewareOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withActionTransformer(value: /* action */ Action[_] => Action[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionTransformer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionTransformer: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionTransformer")(js.undefined)
        ret
    }
    @scala.inline
    def withBreadcrumbCategory(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadcrumbCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreadcrumbCategory: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadcrumbCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withBreadcrumbDataFromAction(value: /* action */ Action[_] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadcrumbDataFromAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBreadcrumbDataFromAction: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadcrumbDataFromAction")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterBreadcrumbActions(value: /* action */ Action[_] => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBreadcrumbActions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilterBreadcrumbActions: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBreadcrumbActions")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUserContext(value: /* state */ T => RavenUserContext): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetUserContext: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserContext")(js.undefined)
        ret
    }
    @scala.inline
    def withStateTransformer(value: /* state */ T => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateTransformer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStateTransformer: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateTransformer")(js.undefined)
        ret
    }
  }
  
}

