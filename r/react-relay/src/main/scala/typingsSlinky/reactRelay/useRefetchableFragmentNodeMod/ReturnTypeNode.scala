package typingsSlinky.reactRelay.useRefetchableFragmentNodeMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeNode[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */, TOptions] extends js.Object {
  var fragmentData: js.Any = js.native
  var fragmentRef: js.Any = js.native
  var refetch: RefetchFnDynamic[TQuery, TKey, TOptions] = js.native
  def disableStoreUpdates(): Unit = js.native
  def enableStoreUpdates(): Unit = js.native
}

object ReturnTypeNode {
  @scala.inline
  def apply[TQuery, TKey, TOptions](
    disableStoreUpdates: () => Unit,
    enableStoreUpdates: () => Unit,
    fragmentData: js.Any,
    fragmentRef: js.Any,
    refetch: RefetchFnDynamic[TQuery, TKey, TOptions]
  ): ReturnTypeNode[TQuery, TKey, TOptions] = {
    val __obj = js.Dynamic.literal(disableStoreUpdates = js.Any.fromFunction0(disableStoreUpdates), enableStoreUpdates = js.Any.fromFunction0(enableStoreUpdates), fragmentData = fragmentData.asInstanceOf[js.Any], fragmentRef = fragmentRef.asInstanceOf[js.Any], refetch = refetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeNode[TQuery, TKey, TOptions]]
  }
  @scala.inline
  implicit class ReturnTypeNodeOps[Self[tquery, tkey, toptions] <: ReturnTypeNode[tquery, tkey, toptions], TQuery, TKey, TOptions] (val x: Self[TQuery, TKey, TOptions]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TQuery, TKey, TOptions] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TQuery, TKey, TOptions]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TQuery, TKey, TOptions]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TQuery, TKey, TOptions]) with Other]
    @scala.inline
    def withDisableStoreUpdates(value: () => Unit): Self[TQuery, TKey, TOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStoreUpdates")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnableStoreUpdates(value: () => Unit): Self[TQuery, TKey, TOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableStoreUpdates")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFragmentData(value: js.Any): Self[TQuery, TKey, TOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragmentRef(value: js.Any): Self[TQuery, TKey, TOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefetch(value: RefetchFnDynamic[TQuery, TKey, TOptions]): Self[TQuery, TKey, TOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

