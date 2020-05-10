package typingsSlinky.pgPromise.mod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.pgPromise.AnonDeferrable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Transaction Mode namespace;
// API: http://vitaly-t.github.io/pg-promise/txMode.html
@js.native
trait ITXMode extends js.Object {
  var TransactionMode: Instantiable1[
    js.UndefOr[/* options */ AnonDeferrable], 
    typingsSlinky.pgPromise.mod.TransactionMode
  ] = js.native
  var isolationLevel: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof isolationLevel */ js.Any = js.native
}

object ITXMode {
  @scala.inline
  def apply(
    TransactionMode: Instantiable1[js.UndefOr[/* options */ AnonDeferrable], TransactionMode],
    isolationLevel: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof isolationLevel */ js.Any
  ): ITXMode = {
    val __obj = js.Dynamic.literal(TransactionMode = TransactionMode.asInstanceOf[js.Any], isolationLevel = isolationLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITXMode]
  }
  @scala.inline
  implicit class ITXModeOps[Self <: ITXMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransactionMode(value: Instantiable1[js.UndefOr[/* options */ AnonDeferrable], TransactionMode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransactionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsolationLevel(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof isolationLevel */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolationLevel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

