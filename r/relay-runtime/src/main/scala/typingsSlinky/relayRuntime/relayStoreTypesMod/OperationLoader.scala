package typingsSlinky.relayRuntime.relayStoreTypesMod

import typingsSlinky.relayRuntime.normalizationNodeMod.NormalizationSplitOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationLoader extends js.Object {
  /**
    * Synchronously load an operation, returning either the node or null if it
    * cannot be resolved synchronously.
    */
  def get(reference: js.Any): js.UndefOr[NormalizationSplitOperation | Null] = js.native
  /**
    * Asynchronously load an operation.
    */
  def load(reference: js.Any): js.Promise[js.UndefOr[NormalizationSplitOperation | Null]] = js.native
}

object OperationLoader {
  @scala.inline
  def apply(
    get: js.Any => js.UndefOr[NormalizationSplitOperation | Null],
    load: js.Any => js.Promise[js.UndefOr[NormalizationSplitOperation | Null]]
  ): OperationLoader = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), load = js.Any.fromFunction1(load))
    __obj.asInstanceOf[OperationLoader]
  }
  @scala.inline
  implicit class OperationLoaderOps[Self <: OperationLoader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: js.Any => js.UndefOr[NormalizationSplitOperation | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoad(value: js.Any => js.Promise[js.UndefOr[NormalizationSplitOperation | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

