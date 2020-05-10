package typingsSlinky.mdxJsReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectedMDXProviderProps extends js.Object {
  var components: MDXProviderComponents = js.native
}

object InjectedMDXProviderProps {
  @scala.inline
  def apply(components: MDXProviderComponents): InjectedMDXProviderProps = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectedMDXProviderProps]
  }
  @scala.inline
  implicit class InjectedMDXProviderPropsOps[Self <: InjectedMDXProviderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponents(value: MDXProviderComponents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

