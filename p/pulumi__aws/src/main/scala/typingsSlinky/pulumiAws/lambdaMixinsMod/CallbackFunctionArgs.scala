package typingsSlinky.pulumiAws.lambdaMixinsMod

import typingsSlinky.pulumiAws.AnonCodePathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in @pulumi/aws.@pulumi/aws/utils.Diff<keyof @pulumi/aws.@pulumi/aws/lambda/function.FunctionArgs, keyof @pulumi/aws.AnonCodePathOptions> ]: @pulumi/aws.@pulumi/aws/lambda/function.FunctionArgs[P]} */ @js.native
trait CallbackFunctionArgs[E, R] extends AnonCodePathOptions {
  /**
    * The Javascript callback to use as the entrypoint for the AWS Lambda out of.  Either
    * [callback] or [callbackFactory] must be provided.
    */
  var callback: js.UndefOr[Callback[E, R]] = js.native
  /**
    * The Javascript function instance that will be called to produce the callback function that is
    * the entrypoint for the AWS Lambda. Either [callback] or [callbackFactory] must be
    * provided.
    *
    * This form is useful when there is expensive initialization work that should only be executed
    * once.  The factory-function will be invoked once when the final AWS Lambda module is loaded.
    * It can run whatever code it needs, and will end by returning the actual function that Lambda
    * will call into each time the Lambda is invoked.
    */
  var callbackFactory: js.UndefOr[CallbackFactory[E, R]] = js.native
}

object CallbackFunctionArgs {
  @scala.inline
  def apply[E, R](): CallbackFunctionArgs[E, R] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbackFunctionArgs[E, R]]
  }
  @scala.inline
  implicit class CallbackFunctionArgsOps[Self[e, r] <: CallbackFunctionArgs[e, r], E, R] (val x: Self[E, R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[E, R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[E, R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[E, R]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[E, R]) with Other]
    @scala.inline
    def withCallback(
      value: (E, /* context */ Context, /* callback */ js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], Unit]) => js.Promise[R] | Unit
    ): Self[E, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self[E, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbackFactory(value: () => Callback[E, R]): Self[E, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackFactory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCallbackFactory: Self[E, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackFactory")(js.undefined)
        ret
    }
  }
  
}

