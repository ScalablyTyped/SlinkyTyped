package typingsSlinky.powerappsComponentFramework.ComponentFramework.NavigationApi

import typingsSlinky.powerappsComponentFramework.ComponentFramework.NavigationApi.Types.OpenFileMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Interface for open file options.
		 */
@js.native
trait OpenFileOptions extends js.Object {
  /**
  			 * Specify whether to open or save the file
  			 * Values:
  			 *   1 - open
  			 *   2 - save
  			 */
  var openMode: OpenFileMode = js.native
}

object OpenFileOptions {
  @scala.inline
  def apply(openMode: OpenFileMode): OpenFileOptions = {
    val __obj = js.Dynamic.literal(openMode = openMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenFileOptions]
  }
  @scala.inline
  implicit class OpenFileOptionsOps[Self <: OpenFileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpenMode(value: OpenFileMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

