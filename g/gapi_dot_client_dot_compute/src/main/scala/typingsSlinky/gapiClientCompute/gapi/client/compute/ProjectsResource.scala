package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.AltFields
import typingsSlinky.gapiClientCompute.anon.OauthtokenPrettyPrint
import typingsSlinky.gapiClientCompute.anon.Orderby
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsResource extends js.Object {
  /** Disable this project as a shared VPC host project. */
  def disableXpnHost(request: AltFields): Request[Operation] = js.native
  /** Disable a serivce resource (a.k.a service project) associated with this host project. */
  def disableXpnResource(request: AltFields): Request[Operation] = js.native
  /** Enable this project as a shared VPC host project. */
  def enableXpnHost(request: AltFields): Request[Operation] = js.native
  /**
    * Enable service resource (a.k.a service project) for a host project, so that subnets in the host project can be used by instances in the service
    * project.
    */
  def enableXpnResource(request: AltFields): Request[Operation] = js.native
  /** Returns the specified Project resource. */
  def get(request: OauthtokenPrettyPrint): Request[Project] = js.native
  /** Get the shared VPC host project that this project links to. May be empty if no link exists. */
  def getXpnHost(request: OauthtokenPrettyPrint): Request[Project] = js.native
  /** Get service resources (a.k.a service project) associated with this host project. */
  def getXpnResources(request: Orderby): Request[ProjectsGetXpnResources] = js.native
  /** List all shared VPC host projects visible to the user in an organization. */
  def listXpnHosts(request: Orderby): Request[XpnHostList] = js.native
  /** Moves a persistent disk from one zone to another. */
  def moveDisk(request: AltFields): Request[Operation] = js.native
  /** Moves an instance and its attached persistent disks from one zone to another. */
  def moveInstance(request: AltFields): Request[Operation] = js.native
  /** Sets metadata common to all instances within the specified project using the data included in the request. */
  def setCommonInstanceMetadata(request: AltFields): Request[Operation] = js.native
  /**
    * Enables the usage export feature and sets the usage export bucket where reports are stored. If you provide an empty request body using this method, the
    * usage export feature will be disabled.
    */
  def setUsageExportBucket(request: AltFields): Request[Operation] = js.native
}

object ProjectsResource {
  @scala.inline
  def apply(
    disableXpnHost: AltFields => Request[Operation],
    disableXpnResource: AltFields => Request[Operation],
    enableXpnHost: AltFields => Request[Operation],
    enableXpnResource: AltFields => Request[Operation],
    get: OauthtokenPrettyPrint => Request[Project],
    getXpnHost: OauthtokenPrettyPrint => Request[Project],
    getXpnResources: Orderby => Request[ProjectsGetXpnResources],
    listXpnHosts: Orderby => Request[XpnHostList],
    moveDisk: AltFields => Request[Operation],
    moveInstance: AltFields => Request[Operation],
    setCommonInstanceMetadata: AltFields => Request[Operation],
    setUsageExportBucket: AltFields => Request[Operation]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(disableXpnHost = js.Any.fromFunction1(disableXpnHost), disableXpnResource = js.Any.fromFunction1(disableXpnResource), enableXpnHost = js.Any.fromFunction1(enableXpnHost), enableXpnResource = js.Any.fromFunction1(enableXpnResource), get = js.Any.fromFunction1(get), getXpnHost = js.Any.fromFunction1(getXpnHost), getXpnResources = js.Any.fromFunction1(getXpnResources), listXpnHosts = js.Any.fromFunction1(listXpnHosts), moveDisk = js.Any.fromFunction1(moveDisk), moveInstance = js.Any.fromFunction1(moveInstance), setCommonInstanceMetadata = js.Any.fromFunction1(setCommonInstanceMetadata), setUsageExportBucket = js.Any.fromFunction1(setUsageExportBucket))
    __obj.asInstanceOf[ProjectsResource]
  }
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableXpnHost(value: AltFields => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableXpnHost")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisableXpnResource(value: AltFields => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableXpnResource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnableXpnHost(value: AltFields => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableXpnHost")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnableXpnResource(value: AltFields => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableXpnResource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: OauthtokenPrettyPrint => Request[Project]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetXpnHost(value: OauthtokenPrettyPrint => Request[Project]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXpnHost")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetXpnResources(value: Orderby => Request[ProjectsGetXpnResources]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXpnResources")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListXpnHosts(value: Orderby => Request[XpnHostList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listXpnHosts")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMoveDisk(value: AltFields => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveDisk")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMoveInstance(value: AltFields => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveInstance")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetCommonInstanceMetadata(value: AltFields => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCommonInstanceMetadata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetUsageExportBucket(value: AltFields => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUsageExportBucket")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

