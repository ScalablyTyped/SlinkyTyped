package typingsSlinky.relayRuntime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FragmentName extends js.Object {
  val fragmentName: String = js.native
  val fragmentPropName: String = js.native
}

object FragmentName {
  @scala.inline
  def apply(fragmentName: String, fragmentPropName: String): FragmentName = {
    val __obj = js.Dynamic.literal(fragmentName = fragmentName.asInstanceOf[js.Any], fragmentPropName = fragmentPropName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentName]
  }
  @scala.inline
  implicit class FragmentNameOps[Self <: FragmentName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFragmentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragmentPropName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentPropName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

