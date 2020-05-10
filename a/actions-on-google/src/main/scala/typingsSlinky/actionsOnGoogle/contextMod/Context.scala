package typingsSlinky.actionsOnGoogle.contextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context[TParameters /* <: Parameters */] extends OutputContext[TParameters] {
  /**
    * Full name of the context.
    * @public
    */
  var name: String = js.native
  /**
    * The context parameters from the current intent.
    * Context parameters include parameters collected in previous intents
    * during the lifespan of the given context.
    *
    * See {@link https://dialogflow.com/docs/concept-actions#section-extracting-values-from-contexts|
    *     here}.
    *
    * @example
    * ```javascript
    *
    * app.intent('Tell Greeting', conv => {
    *   const context1 = conv.contexts.get('context1')
    *   const parameters = context1.parameters
    *   const color = parameters.color
    *   const num = parameters.num
    * })
    *
    * // Using destructuring
    * app.intent('Tell Greeting', conv => {
    *   const context1 = conv.contexts.get('context1')
    *   const { color, num } = context1.parameters
    * })
    * ```
    *
    * @public
    */
  @JSName("parameters")
  var parameters_Context: TParameters = js.native
}

object Context {
  @scala.inline
  def apply[TParameters](lifespan: Double, name: String, parameters: TParameters): Context[TParameters] = {
    val __obj = js.Dynamic.literal(lifespan = lifespan.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[TParameters]]
  }
  @scala.inline
  implicit class ContextOps[Self[tparameters] <: Context[tparameters], TParameters] (val x: Self[TParameters]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TParameters] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TParameters]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TParameters] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TParameters] with Other]
    @scala.inline
    def withName(value: String): Self[TParameters] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: TParameters): Self[TParameters] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

