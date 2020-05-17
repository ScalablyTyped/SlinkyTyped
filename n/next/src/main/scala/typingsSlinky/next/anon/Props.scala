package typingsSlinky.next.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props[P /* <: StringDictionary[js.Any] */] extends js.Object {
  var props: P = js.native
  var revalidate: js.UndefOr[Double | Boolean] = js.native
}

object Props {
  @scala.inline
  def apply[P](props: P): Props[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[P]]
  }
  @scala.inline
  implicit class PropsOps[Self[p] <: Props[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withProps(value: P): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevalidate(value: Double | Boolean): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revalidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevalidate: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revalidate")(js.undefined)
        ret
    }
  }
  
}

