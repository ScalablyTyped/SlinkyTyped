package typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryTriggerMod

import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.all
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.createReference
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.deleteReference
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.updateReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryTrigger extends js.Object {
  /**
    * <p>The branches that will be included in the trigger configuration. If you specify an empty array, the trigger will apply to all branches.</p> <note> <p>While no content is required in the array, you must include the array itself.</p> </note>
    */
  var branches: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
  /**
    * <p>Any custom data associated with the trigger that will be included in the information sent to the target of the trigger.</p>
    */
  var customData: js.UndefOr[String] = js.native
  /**
    * <p>The ARN of the resource that is the target for a trigger. For example, the ARN of a topic in Amazon Simple Notification Service (SNS).</p>
    */
  var destinationArn: String = js.native
  /**
    * <p>The repository events that will cause the trigger to run actions in another service, such as sending a notification through Amazon Simple Notification Service (SNS). </p> <note> <p>The valid value "all" cannot be used with any other values.</p> </note>
    */
  var events: (js.Array[all | updateReference | createReference | deleteReference | String]) | (js.Iterable[all | updateReference | createReference | deleteReference | String]) = js.native
  /**
    * <p>The name of the trigger.</p>
    */
  var name: String = js.native
}

object RepositoryTrigger {
  @scala.inline
  def apply(
    destinationArn: String,
    events: (js.Array[all | updateReference | createReference | deleteReference | String]) | (js.Iterable[all | updateReference | createReference | deleteReference | String]),
    name: String
  ): RepositoryTrigger = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryTrigger]
  }
  @scala.inline
  implicit class RepositoryTriggerOps[Self <: RepositoryTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventsIterable(value: js.Iterable[all | updateReference | createReference | deleteReference | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(
      value: (js.Array[all | updateReference | createReference | deleteReference | String]) | (js.Iterable[all | updateReference | createReference | deleteReference | String])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranchesIterable(value: js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranches(value: js.Array[String] | js.Iterable[String]): Self = {
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
    @scala.inline
    def withCustomData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(js.undefined)
        ret
    }
  }
  
}

