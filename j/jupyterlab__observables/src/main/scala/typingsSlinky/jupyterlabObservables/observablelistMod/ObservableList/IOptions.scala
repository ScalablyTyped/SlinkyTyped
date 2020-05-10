package typingsSlinky.jupyterlabObservables.observablelistMod.ObservableList

import typingsSlinky.phosphorAlgorithm.iterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize an observable map.
  */
@js.native
trait IOptions[T] extends js.Object {
  /**
    * The item comparison function for change detection on `set`.
    *
    * If not given, strict `===` equality will be used.
    */
  var itemCmp: js.UndefOr[js.Function2[/* first */ T, /* second */ T, Boolean]] = js.native
  /**
    * An optional initial set of values.
    */
  var values: js.UndefOr[IterableOrArrayLike[T]] = js.native
}

object IOptions {
  @scala.inline
  def apply[T](): IOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions[T]]
  }
  @scala.inline
  implicit class IOptionsOps[Self[t] <: IOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withItemCmp(value: (/* first */ T, /* second */ T) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCmp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutItemCmp: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCmp")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: IterableOrArrayLike[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

