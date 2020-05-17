package typingsSlinky.reactDevUtils.anon

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.webpack.mod.Compiler_
import typingsSlinky.webpack.mod.Compiler_.Watching
import typingsSlinky.webpack.mod.Compiler_.Watching.Handler
import typingsSlinky.webpack.mod.Compiler_.Watching.WatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofCompiler extends js.Object {
  var Watching: Instantiable3[
    /* compiler */ Compiler_, 
    /* watchOptions */ WatchOptions, 
    /* handler */ Handler, 
    typingsSlinky.webpack.mod.Compiler_.Watching
  ] = js.native
}

object TypeofCompiler {
  @scala.inline
  def apply(
    Watching: Instantiable3[
      /* compiler */ Compiler_, 
      /* watchOptions */ WatchOptions, 
      /* handler */ Handler, 
      Watching
    ]
  ): TypeofCompiler = {
    val __obj = js.Dynamic.literal(Watching = Watching.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCompiler]
  }
  @scala.inline
  implicit class TypeofCompilerOps[Self <: TypeofCompiler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWatching(
      value: Instantiable3[
          /* compiler */ Compiler_, 
          /* watchOptions */ WatchOptions, 
          /* handler */ Handler, 
          Watching
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Watching")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

