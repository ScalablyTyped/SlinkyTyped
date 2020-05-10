package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAltFields
import typingsSlinky.gapiClientCompute.AnonOauthtokenPrettyPrint
import typingsSlinky.gapiClientCompute.AnonOrderby
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsResource extends js.Object {
  /** Disable this project as a shared VPC host project. */
  def disableXpnHost(request: AnonAltFields): Request_[Operation] = js.native
  /** Disable a serivce resource (a.k.a service project) associated with this host project. */
  def disableXpnResource(request: AnonAltFields): Request_[Operation] = js.native
  /** Enable this project as a shared VPC host project. */
  def enableXpnHost(request: AnonAltFields): Request_[Operation] = js.native
  /**
    * Enable service resource (a.k.a service project) for a host project, so that subnets in the host project can be used by instances in the service
    * project.
    */
  def enableXpnResource(request: AnonAltFields): Request_[Operation] = js.native
  /** Returns the specified Project resource. */
  def get(request: AnonOauthtokenPrettyPrint): Request_[Project] = js.native
  /** Get the shared VPC host project that this project links to. May be empty if no link exists. */
  def getXpnHost(request: AnonOauthtokenPrettyPrint): Request_[Project] = js.native
  /** Get service resources (a.k.a service project) associated with this host project. */
  def getXpnResources(request: AnonOrderby): Request_[ProjectsGetXpnResources] = js.native
  /** List all shared VPC host projects visible to the user in an organization. */
  def listXpnHosts(request: AnonOrderby): Request_[XpnHostList] = js.native
  /** Moves a persistent disk from one zone to another. */
  def moveDisk(request: AnonAltFields): Request_[Operation] = js.native
  /** Moves an instance and its attached persistent disks from one zone to another. */
  def moveInstance(request: AnonAltFields): Request_[Operation] = js.native
  /** Sets metadata common to all instances within the specified project using the data included in the request. */
  def setCommonInstanceMetadata(request: AnonAltFields): Request_[Operation] = js.native
  /**
    * Enables the usage export feature and sets the usage export bucket where reports are stored. If you provide an empty request body using this method, the
    * usage export feature will be disabled.
    */
  def setUsageExportBucket(request: AnonAltFields): Request_[Operation] = js.native
}

object ProjectsResource {
  @scala.inline
  def apply(
    disableXpnHost: AnonAltFields => Request_[Operation],
    disableXpnResource: AnonAltFields => Request_[Operation],
    enableXpnHost: AnonAltFields => Request_[Operation],
    enableXpnResource: AnonAltFields => Request_[Operation],
    get: AnonOauthtokenPrettyPrint => Request_[Project],
    getXpnHost: AnonOauthtokenPrettyPrint => Request_[Project],
    getXpnResources: AnonOrderby => Request_[ProjectsGetXpnResources],
    listXpnHosts: AnonOrderby => Request_[XpnHostList],
    moveDisk: AnonAltFields => Request_[Operation],
    moveInstance: AnonAltFields => Request_[Operation],
    setCommonInstanceMetadata: AnonAltFields => Request_[Operation],
    setUsageExportBucket: AnonAltFields => Request_[Operation]
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
    def withDisableXpnHost(value: AnonAltFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableXpnHost")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisableXpnResource(value: AnonAltFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableXpnResource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnableXpnHost(value: AnonAltFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableXpnHost")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnableXpnResource(value: AnonAltFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableXpnResource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonOauthtokenPrettyPrint => Request_[Project]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetXpnHost(value: AnonOauthtokenPrettyPrint => Request_[Project]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXpnHost")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetXpnResources(value: AnonOrderby => Request_[ProjectsGetXpnResources]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXpnResources")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListXpnHosts(value: AnonOrderby => Request_[XpnHostList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listXpnHosts")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMoveDisk(value: AnonAltFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveDisk")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMoveInstance(value: AnonAltFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveInstance")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetCommonInstanceMetadata(value: AnonAltFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCommonInstanceMetadata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetUsageExportBucket(value: AnonAltFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUsageExportBucket")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

