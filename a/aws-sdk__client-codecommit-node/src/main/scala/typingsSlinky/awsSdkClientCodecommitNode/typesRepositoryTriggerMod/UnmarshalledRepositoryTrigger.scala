package typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryTriggerMod

import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.all
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.createReference
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.deleteReference
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.updateReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledRepositoryTrigger extends RepositoryTrigger {
  /**
    * <p>The branches that will be included in the trigger configuration. If you specify an empty array, the trigger will apply to all branches.</p> <note> <p>While no content is required in the array, you must include the array itself.</p> </note>
    */
  @JSName("branches")
  var branches_UnmarshalledRepositoryTrigger: js.UndefOr[js.Array[String]] = js.native
  /**
    * <p>The repository events that will cause the trigger to run actions in another service, such as sending a notification through Amazon Simple Notification Service (SNS). </p> <note> <p>The valid value "all" cannot be used with any other values.</p> </note>
    */
  @JSName("events")
  var events_UnmarshalledRepositoryTrigger: js.Array[all | updateReference | createReference | deleteReference | String] = js.native
}

object UnmarshalledRepositoryTrigger {
  @scala.inline
  def apply(
    destinationArn: String,
    events: js.Array[all | updateReference | createReference | deleteReference | String],
    name: String
  ): UnmarshalledRepositoryTrigger = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledRepositoryTrigger]
  }
  @scala.inline
  implicit class UnmarshalledRepositoryTriggerOps[Self <: UnmarshalledRepositoryTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: js.Array[all | updateReference | createReference | deleteReference | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranches(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBranches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branches")(js.undefined)
        ret
    }
  }
  
}

