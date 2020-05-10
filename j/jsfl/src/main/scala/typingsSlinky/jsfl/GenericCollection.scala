package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericCollection[T] extends js.Object {
  var elements: js.Array[T] = js.native
  def each(
    callback: js.Function3[
      /* element */ T, 
      /* index */ js.UndefOr[Double], 
      /* elements */ js.UndefOr[js.Array[T]], 
      Unit
    ]
  ): js.Any = js.native
  def randomize(info: js.Any): GenericCollection[T] = js.native
  def rename(pattern: String): GenericCollection[T] = js.native
  def select(): GenericCollection[T] = js.native
  def toGrid(x: Double, y: Double): GenericCollection[T] = js.native
  def update(): GenericCollection[T] = js.native
}

object GenericCollection {
  @scala.inline
  def apply[T](
    each: js.Function3[
      /* element */ T, 
      /* index */ js.UndefOr[Double], 
      /* elements */ js.UndefOr[js.Array[T]], 
      Unit
    ] => js.Any,
    elements: js.Array[T],
    randomize: js.Any => GenericCollection[T],
    rename: String => GenericCollection[T],
    select: () => GenericCollection[T],
    toGrid: (Double, Double) => GenericCollection[T],
    update: () => GenericCollection[T]
  ): GenericCollection[T] = {
    val __obj = js.Dynamic.literal(each = js.Any.fromFunction1(each), elements = elements.asInstanceOf[js.Any], randomize = js.Any.fromFunction1(randomize), rename = js.Any.fromFunction1(rename), select = js.Any.fromFunction0(select), toGrid = js.Any.fromFunction2(toGrid), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[GenericCollection[T]]
  }
  @scala.inline
  implicit class GenericCollectionOps[Self[t] <: GenericCollection[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withEach(
      value: js.Function3[
          /* element */ T, 
          /* index */ js.UndefOr[Double], 
          /* elements */ js.UndefOr[js.Array[T]], 
          Unit
        ] => js.Any
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withElements(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRandomize(value: js.Any => GenericCollection[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRename(value: String => GenericCollection[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelect(value: () => GenericCollection[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToGrid(value: (Double, Double) => GenericCollection[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toGrid")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdate(value: () => GenericCollection[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

