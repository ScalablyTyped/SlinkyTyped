package typingsSlinky.node.childProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpawnOptionsWithStdioTuple[Stdin /* <: StdioNull | StdioPipe */, Stdout /* <: StdioNull | StdioPipe */, Stderr /* <: StdioNull | StdioPipe */] extends SpawnOptions {
  @JSName("stdio")
  var stdio_SpawnOptionsWithStdioTuple: js.Tuple3[Stdin, Stdout, Stderr] = js.native
}

object SpawnOptionsWithStdioTuple {
  @scala.inline
  def apply[Stdin, Stdout, Stderr](stdio: js.Tuple3[Stdin, Stdout, Stderr]): SpawnOptionsWithStdioTuple[Stdin, Stdout, Stderr] = {
    val __obj = js.Dynamic.literal(stdio = stdio.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpawnOptionsWithStdioTuple[Stdin, Stdout, Stderr]]
  }
  @scala.inline
  implicit class SpawnOptionsWithStdioTupleOps[Self[stdin, stdout, stderr] <: SpawnOptionsWithStdioTuple[stdin, stdout, stderr], Stdin, Stdout, Stderr] (val x: Self[Stdin, Stdout, Stderr]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Stdin, Stdout, Stderr] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Stdin, Stdout, Stderr]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Stdin, Stdout, Stderr]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Stdin, Stdout, Stderr]) with Other]
    @scala.inline
    def withStdio(value: js.Tuple3[Stdin, Stdout, Stderr]): Self[Stdin, Stdout, Stderr] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdio")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

