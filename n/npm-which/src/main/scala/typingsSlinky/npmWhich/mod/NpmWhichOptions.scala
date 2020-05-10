package typingsSlinky.npmWhich.mod

import typingsSlinky.node.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for the `npmwhich`-module.
  */
@js.native
trait NpmWhichOptions extends js.Object {
  /**
    * The directory to find the binary for.
    */
  var cwd: js.UndefOr[String] = js.native
  /**
    * The environment to use for resolving the binary.
    */
  var env: js.UndefOr[ProcessEnv] = js.native
}

object NpmWhichOptions {
  @scala.inline
  def apply(): NpmWhichOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NpmWhichOptions]
  }
  @scala.inline
  implicit class NpmWhichOptionsOps[Self <: NpmWhichOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: ProcessEnv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
  }
  
}

