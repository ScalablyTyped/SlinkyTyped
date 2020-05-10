package typingsSlinky.pulumiAws.outputMod.cloudwatch

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTargetInputTransformer extends js.Object {
  /**
    * Key value pairs specified in the form of JSONPath (for example, time = $.time)
    */
  var inputPaths: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Structure containing the template body.
    */
  var inputTemplate: String = js.native
}

object EventTargetInputTransformer {
  @scala.inline
  def apply(inputTemplate: String): EventTargetInputTransformer = {
    val __obj = js.Dynamic.literal(inputTemplate = inputTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTargetInputTransformer]
  }
  @scala.inline
  implicit class EventTargetInputTransformerOps[Self <: EventTargetInputTransformer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputPaths(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputPaths")(js.undefined)
        ret
    }
  }
  
}

