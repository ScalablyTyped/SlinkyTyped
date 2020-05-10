package typingsSlinky.jupyterlabApplication.tokensMod.IRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The specification for registering a route with the router.
  */
@js.native
trait IRegisterOptions extends js.Object {
  /**
    * The command string that will be invoked upon matching.
    */
  var command: String = js.native
  /**
    * The regular expression that will be matched against URLs.
    */
  var pattern: js.RegExp = js.native
  /**
    * The rank order of the registered rule. A lower rank denotes a higher
    * priority. The default rank is `100`.
    */
  var rank: js.UndefOr[Double] = js.native
}

object IRegisterOptions {
  @scala.inline
  def apply(command: String, pattern: js.RegExp): IRegisterOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRegisterOptions]
  }
  @scala.inline
  implicit class IRegisterOptionsOps[Self <: IRegisterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(js.undefined)
        ret
    }
  }
  
}

