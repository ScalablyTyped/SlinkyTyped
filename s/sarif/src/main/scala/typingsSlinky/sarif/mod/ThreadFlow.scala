package typingsSlinky.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreadFlow extends js.Object {
  /**
    * An string that uniquely identifies the threadFlow within the codeFlow in which it occurs.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Values of relevant expressions at the start of the thread flow that remain constant.
    */
  var immutableState: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.native
  /**
    * Values of relevant expressions at the start of the thread flow that may change during thread flow execution.
    */
  var initialState: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.native
  /**
    * A temporally ordered array of 'threadFlowLocation' objects, each of which describes a location visited by the
    * tool while producing the result.
    */
  var locations: js.Array[ThreadFlowLocation] = js.native
  /**
    * A message relevant to the thread flow.
    */
  var message: js.UndefOr[Message] = js.native
  /**
    * Key/value pairs that provide additional information about the thread flow.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
}

object ThreadFlow {
  @scala.inline
  def apply(locations: js.Array[ThreadFlowLocation]): ThreadFlow = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadFlow]
  }
  @scala.inline
  implicit class ThreadFlowOps[Self <: ThreadFlow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocations(value: js.Array[ThreadFlowLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withImmutableState(value: StringDictionary[MultiformatMessageString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immutableState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmutableState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immutableState")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialState(value: StringDictionary[MultiformatMessageString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

