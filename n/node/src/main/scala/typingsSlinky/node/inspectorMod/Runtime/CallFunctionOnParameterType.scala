package typingsSlinky.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallFunctionOnParameterType extends js.Object {
  /**
    * Call arguments. All call arguments must belong to the same JavaScript world as the target object.
    */
  var arguments: js.UndefOr[js.Array[CallArgument]] = js.native
  /**
    * Whether execution should <code>await</code> for resulting value and return once awaited promise is resolved.
    */
  var awaitPromise: js.UndefOr[Boolean] = js.native
  /**
    * Specifies execution context which global object will be used to call function on. Either executionContextId or objectId should be specified.
    */
  var executionContextId: js.UndefOr[ExecutionContextId] = js.native
  /**
    * Declaration of the function to call.
    */
  var functionDeclaration: String = js.native
  /**
    * Whether preview should be generated for the result.
    * @experimental
    */
  var generatePreview: js.UndefOr[Boolean] = js.native
  /**
    * Symbolic group name that can be used to release multiple objects. If objectGroup is not specified and objectId is, objectGroup will be inherited from object.
    */
  var objectGroup: js.UndefOr[String] = js.native
  /**
    * Identifier of the object to call function on. Either objectId or executionContextId should be specified.
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.native
  /**
    * Whether the result is expected to be a JSON object which should be sent by value.
    */
  var returnByValue: js.UndefOr[Boolean] = js.native
  /**
    * In silent mode exceptions thrown during evaluation are not reported and do not pause execution. Overrides <code>setPauseOnException</code> state.
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * Whether execution should be treated as initiated by user in the UI.
    */
  var userGesture: js.UndefOr[Boolean] = js.native
}

object CallFunctionOnParameterType {
  @scala.inline
  def apply(functionDeclaration: String): CallFunctionOnParameterType = {
    val __obj = js.Dynamic.literal(functionDeclaration = functionDeclaration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallFunctionOnParameterType]
  }
  @scala.inline
  implicit class CallFunctionOnParameterTypeOps[Self <: CallFunctionOnParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunctionDeclaration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArguments(value: js.Array[CallArgument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(js.undefined)
        ret
    }
    @scala.inline
    def withAwaitPromise(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awaitPromise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwaitPromise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awaitPromise")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionContextId(value: ExecutionContextId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionContextId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionContextId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionContextId")(js.undefined)
        ret
    }
    @scala.inline
    def withGeneratePreview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatePreview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneratePreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatePreview")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectId(value: RemoteObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnByValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnByValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnByValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnByValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withUserGesture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userGesture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserGesture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userGesture")(js.undefined)
        ret
    }
  }
  
}

