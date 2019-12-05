package typingsSlinky.meteor.meteorMeteorMod.Meteor

import typingsSlinky.meteor.Anon_ErrorOnResultReceivedResult
import typingsSlinky.meteor.EJSONable
import typingsSlinky.meteor.EJSONableProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/meteor", "Meteor.apply")
@js.native
object apply extends js.Object {
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](name: String, args: js.Array[EJSONable | EJSONableProperty]): js.Any = js.native
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](
    name: String,
    args: js.Array[EJSONable | EJSONableProperty],
    options: Anon_ErrorOnResultReceivedResult[Result]
  ): js.Any = js.native
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](
    name: String,
    args: js.Array[EJSONable | EJSONableProperty],
    options: Anon_ErrorOnResultReceivedResult[Result],
    asyncCallback: js.Function2[/* error */ js.UndefOr[js.Error | Error], /* result */ js.UndefOr[Result], Unit]
  ): js.Any = js.native
}

