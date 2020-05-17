package typingsSlinky.jupyterlabServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target extends js.Object {
  /**
    * Filter for returned comms
    *
    * @deprecated - this is a non-standard field. Use target_name instead
    *
    * #### Notes
    * See https://github.com/jupyterlab/jupyterlab/issues/6947
    */
  var target: js.UndefOr[String] = js.native
  /**
    * The comm target name to filter returned comms
    */
  var target_name: js.UndefOr[String] = js.native
}

object Target {
  @scala.inline
  def apply(): Target = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Target]
  }
  @scala.inline
  implicit class TargetOps[Self <: Target] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_name")(js.undefined)
        ret
    }
  }
  
}

