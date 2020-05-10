package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofmsilo extends js.Object {
  def mdump(): Double = js.native
  def mdump_uri(owner_s: String): Double = js.native
  def mstore(): Double = js.native
  def mstore_uri(owner_s: String): Double = js.native
}

object Typeofmsilo {
  @scala.inline
  def apply(
    mdump: () => Double,
    mdump_uri: String => Double,
    mstore: () => Double,
    mstore_uri: String => Double
  ): Typeofmsilo = {
    val __obj = js.Dynamic.literal(mdump = js.Any.fromFunction0(mdump), mdump_uri = js.Any.fromFunction1(mdump_uri), mstore = js.Any.fromFunction0(mstore), mstore_uri = js.Any.fromFunction1(mstore_uri))
    __obj.asInstanceOf[Typeofmsilo]
  }
  @scala.inline
  implicit class TypeofmsiloOps[Self <: Typeofmsilo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMdump(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdump")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMdump_uri(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdump_uri")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMstore(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mstore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMstore_uri(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mstore_uri")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

