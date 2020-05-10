package typingsSlinky.dojo

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.dojo.dojo.dnd.Container.ContainerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofContainer extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/Container.__ContainerArgs.html
    *
    *
    */
  var __ContainerArgs: Instantiable0[ContainerArgs] = js.native
}

object TypeofContainer {
  @scala.inline
  def apply(__ContainerArgs: Instantiable0[ContainerArgs]): TypeofContainer = {
    val __obj = js.Dynamic.literal(__ContainerArgs = __ContainerArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofContainer]
  }
  @scala.inline
  implicit class TypeofContainerOps[Self <: TypeofContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__ContainerArgs(value: Instantiable0[ContainerArgs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__ContainerArgs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

