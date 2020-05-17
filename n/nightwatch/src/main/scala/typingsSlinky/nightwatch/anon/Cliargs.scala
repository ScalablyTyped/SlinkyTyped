package typingsSlinky.nightwatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cliargs extends js.Object {
  var cli_args: js.Array[String] = js.native
  var port: Double = js.native
  var server_path: String = js.native
  var start_process: Boolean = js.native
}

object Cliargs {
  @scala.inline
  def apply(cli_args: js.Array[String], port: Double, server_path: String, start_process: Boolean): Cliargs = {
    val __obj = js.Dynamic.literal(cli_args = cli_args.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], server_path = server_path.asInstanceOf[js.Any], start_process = start_process.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cliargs]
  }
  @scala.inline
  implicit class CliargsOps[Self <: Cliargs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCli_args(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cli_args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServer_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_process(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_process")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

