package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonViewModelPath extends js.Object {
  var require: js.UndefOr[
    (js.Function1[/* module */ String, _]) | (js.Function3[
      /* modules */ js.Array[String], 
      /* ready */ js.UndefOr[js.Any], 
      /* errback */ js.UndefOr[js.Any], 
      Unit
    ])
  ] = js.native
  var viewModelPath: String = js.native
}

object AnonViewModelPath {
  @scala.inline
  def apply(viewModelPath: String): AnonViewModelPath = {
    val __obj = js.Dynamic.literal(viewModelPath = viewModelPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonViewModelPath]
  }
  @scala.inline
  implicit class AnonViewModelPathOps[Self <: AnonViewModelPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withViewModelPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModelPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequireFunction1(value: /* module */ String => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequireFunction3(
      value: (/* modules */ js.Array[String], /* ready */ js.UndefOr[js.Any], /* errback */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRequire(
      value: (js.Function1[/* module */ String, _]) | (js.Function3[
          /* modules */ js.Array[String], 
          /* ready */ js.UndefOr[js.Any], 
          /* errback */ js.UndefOr[js.Any], 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(js.undefined)
        ret
    }
  }
  
}

