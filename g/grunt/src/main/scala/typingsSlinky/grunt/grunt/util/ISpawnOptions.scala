package typingsSlinky.grunt.grunt.util

import typingsSlinky.grunt.AnonCustom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link http://gruntjs.com/api/grunt.util#grunt.util.spawn}
  */
@js.native
trait ISpawnOptions extends js.Object {
  /**
    * An array of arguments to pass to the command.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  /**
    * The command to execute. It should be in the system path.
    */
  var cmd: js.UndefOr[String] = js.native
  /**
    * If this value is set and an error occurs, it will be used as the value
    * and null will be passed as the error value.
    */
  var fallback: js.UndefOr[js.Any] = js.native
  /**
    * If specified, the same grunt bin that is currently running will be
    * spawned as the child command, instead of the "cmd" option.
    * Defaults to false.
    */
  var grunt: js.UndefOr[Boolean] = js.native
  /**
    * Additional options for the Node.js child_process spawn method.
    */
  var opts: js.UndefOr[AnonCustom] = js.native
}

object ISpawnOptions {
  @scala.inline
  def apply(): ISpawnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpawnOptions]
  }
  @scala.inline
  implicit class ISpawnOptionsOps[Self <: ISpawnOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withCmd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCmd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmd")(js.undefined)
        ret
    }
    @scala.inline
    def withFallback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.undefined)
        ret
    }
    @scala.inline
    def withGrunt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grunt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrunt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grunt")(js.undefined)
        ret
    }
    @scala.inline
    def withOpts(value: AnonCustom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opts")(js.undefined)
        ret
    }
  }
  
}

