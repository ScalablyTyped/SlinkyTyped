package typingsSlinky.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when a container starts.
  */
@js.native
trait SchemaContainerStartedEvent extends js.Object {
  /**
    * The numeric ID of the action that started this container.
    */
  var actionId: js.UndefOr[Double] = js.native
  /**
    * The public IP address that can be used to connect to the container. This
    * field is only populated when at least one port mapping is present. If the
    * instance was created with a private address, this field will be empty
    * even if port mappings exist.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /**
    * The container-to-host port mappings installed for this container. This
    * set will contain any ports exposed using the `PUBLISH_EXPOSED_PORTS` flag
    * as well as any specified in the `Action` definition.
    */
  var portMappings: js.UndefOr[StringDictionary[Double]] = js.native
}

object SchemaContainerStartedEvent {
  @scala.inline
  def apply(): SchemaContainerStartedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainerStartedEvent]
  }
  @scala.inline
  implicit class SchemaContainerStartedEventOps[Self <: SchemaContainerStartedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionId")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withPortMappings(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portMappings")(js.undefined)
        ret
    }
  }
  
}

