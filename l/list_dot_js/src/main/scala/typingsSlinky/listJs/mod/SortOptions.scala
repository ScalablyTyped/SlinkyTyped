package typingsSlinky.listJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortOptions extends js.Object {
  var alphabet: js.UndefOr[String] = js.native
  var insensitive: js.UndefOr[Boolean] = js.native
  var order: js.UndefOr[String] = js.native
  var sortFunction: js.UndefOr[js.Function2[/* a */ js.Object, /* b */ js.Object, js.UndefOr[Double]]] = js.native
}

object SortOptions {
  @scala.inline
  def apply(): SortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortOptions]
  }
  @scala.inline
  implicit class SortOptionsOps[Self <: SortOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlphabet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphabet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlphabet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphabet")(js.undefined)
        ret
    }
    @scala.inline
    def withInsensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withSortFunction(value: (/* a */ js.Object, /* b */ js.Object) => js.UndefOr[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFunction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSortFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFunction")(js.undefined)
        ret
    }
  }
  
}

