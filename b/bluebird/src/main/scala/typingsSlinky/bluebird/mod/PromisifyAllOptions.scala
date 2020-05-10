package typingsSlinky.bluebird.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromisifyAllOptions[T] extends PromisifyOptions {
  var filter: js.UndefOr[
    js.Function4[
      /* name */ String, 
      /* func */ js.Function1[/* repeated */ js.Any, _], 
      /* target */ js.UndefOr[js.Any], 
      /* passesDefaultFilter */ js.UndefOr[Boolean], 
      Boolean
    ]
  ] = js.native
  // The promisifier gets a reference to the original method and should return a function which returns a promise
  var promisifier: js.UndefOr[
    js.ThisFunction2[
      /* this */ T, 
      /* originalMethod */ js.Function1[/* repeated */ js.Any, _], 
      /* defaultPromisifer */ js.Function1[/* repeated */ js.Any, js.Function1[/* repeated */ _, Bluebird[_]]], 
      js.Function0[js.Thenable[_]]
    ]
  ] = js.native
  var suffix: js.UndefOr[String] = js.native
}

object PromisifyAllOptions {
  @scala.inline
  def apply[T](): PromisifyAllOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromisifyAllOptions[T]]
  }
  @scala.inline
  implicit class PromisifyAllOptionsOps[Self[t] <: PromisifyAllOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFilter(
      value: (/* name */ String, /* func */ js.Function1[/* repeated */ js.Any, _], /* target */ js.UndefOr[js.Any], /* passesDefaultFilter */ js.UndefOr[Boolean]) => Boolean
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withPromisifier(
      value: js.ThisFunction2[
          /* this */ T, 
          /* originalMethod */ js.Function1[/* repeated */ js.Any, _], 
          /* defaultPromisifer */ js.Function1[/* repeated */ js.Any, js.Function1[/* repeated */ _, Bluebird[_]]], 
          js.Function0[js.Thenable[_]]
        ]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promisifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromisifier: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promisifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffix(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffix: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(js.undefined)
        ret
    }
  }
  
}

