package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAccessConfig
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonAutoDelete
import typingsSlinky.gapiClientCompute.AnonDeviceName
import typingsSlinky.gapiClientCompute.AnonFields
import typingsSlinky.gapiClientCompute.AnonFieldsInstance
import typingsSlinky.gapiClientCompute.AnonInstance
import typingsSlinky.gapiClientCompute.AnonInstanceKey
import typingsSlinky.gapiClientCompute.AnonPort
import typingsSlinky.gapiClientCompute.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancesResource extends js.Object {
  /** Adds an access config to an instance's network interface. */
  def addAccessConfig(request: AnonInstance): Request_[Operation] = js.native
  /** Retrieves aggregated list of instances. */
  def aggregatedList(request: AnonAlt): Request_[InstanceAggregatedList] = js.native
  /**
    * Attaches an existing Disk resource to an instance. You must first create the disk before you can attach it. It is not possible to create and attach a
    * disk at the same time. For more information, read Adding a persistent disk to your instance.
    */
  def attachDisk(request: AnonFieldsInstance): Request_[Operation] = js.native
  /** Deletes the specified Instance resource. For more information, see Stopping or Deleting an Instance. */
  def delete(request: AnonFieldsInstance): Request_[Operation] = js.native
  /** Deletes an access config from an instance's network interface. */
  def deleteAccessConfig(request: AnonAccessConfig): Request_[Operation] = js.native
  /** Detaches a disk from an instance. */
  def detachDisk(request: AnonDeviceName): Request_[Operation] = js.native
  /** Returns the specified Instance resource. Get a list of available instances by making a list() request. */
  def get(request: AnonInstanceKey): Request_[Instance] = js.native
  /** Returns the specified instance's serial port output. */
  def getSerialPortOutput(request: AnonPort): Request_[SerialPortOutput] = js.native
  /** Creates an instance resource in the specified project using the data included in the request. */
  def insert(request: AnonQuotaUser): Request_[Operation] = js.native
  /** Retrieves the list of instances contained within the specified zone. */
  def list(request: AnonFields): Request_[InstanceList] = js.native
  /** Performs a reset on the instance. For more information, see Resetting an instance. */
  def reset(request: AnonFieldsInstance): Request_[Operation] = js.native
  /** Sets the auto-delete flag for a disk attached to an instance. */
  def setDiskAutoDelete(request: AnonAutoDelete): Request_[Operation] = js.native
  /** Sets labels on an instance. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: AnonFieldsInstance): Request_[Operation] = js.native
  /** Changes the number and/or type of accelerator for a stopped instance to the values specified in the request. */
  def setMachineResources(request: AnonFieldsInstance): Request_[Operation] = js.native
  /** Changes the machine type for a stopped instance to the machine type specified in the request. */
  def setMachineType(request: AnonFieldsInstance): Request_[Operation] = js.native
  /** Sets metadata for the specified instance to the data included in the request. */
  def setMetadata(request: AnonFieldsInstance): Request_[Operation] = js.native
  /**
    * Changes the minimum CPU platform that this instance should use. This method can only be called on a stopped instance. For more information, read
    * Specifying a Minimum CPU Platform.
    */
  def setMinCpuPlatform(request: AnonFieldsInstance): Request_[Operation] = js.native
  /** Sets an instance's scheduling options. */
  def setScheduling(request: AnonFieldsInstance): Request_[Operation] = js.native
  /** Sets the service account on the instance. For more information, read Changing the service account and access scopes for an instance. */
  def setServiceAccount(request: AnonFieldsInstance): Request_[Operation] = js.native
  /** Sets tags for the specified instance to the data included in the request. */
  def setTags(request: AnonFieldsInstance): Request_[Operation] = js.native
  /** Starts an instance that was stopped using the using the instances().stop method. For more information, see Restart an instance. */
  def start(request: AnonFieldsInstance): Request_[Operation] = js.native
  /** Starts an instance that was stopped using the using the instances().stop method. For more information, see Restart an instance. */
  def startWithEncryptionKey(request: AnonFieldsInstance): Request_[Operation] = js.native
  /**
    * Stops a running instance, shutting it down cleanly, and allows you to restart the instance at a later time. Stopped instances do not incur per-minute,
    * virtual machine usage charges while they are stopped, but any resources that the virtual machine is using, such as persistent disks and static IP
    * addresses, will continue to be charged until they are deleted. For more information, see Stopping an instance.
    */
  def stop(request: AnonFieldsInstance): Request_[Operation] = js.native
}

object InstancesResource {
  @scala.inline
  def apply(
    addAccessConfig: AnonInstance => Request_[Operation],
    aggregatedList: AnonAlt => Request_[InstanceAggregatedList],
    attachDisk: AnonFieldsInstance => Request_[Operation],
    delete: AnonFieldsInstance => Request_[Operation],
    deleteAccessConfig: AnonAccessConfig => Request_[Operation],
    detachDisk: AnonDeviceName => Request_[Operation],
    get: AnonInstanceKey => Request_[Instance],
    getSerialPortOutput: AnonPort => Request_[SerialPortOutput],
    insert: AnonQuotaUser => Request_[Operation],
    list: AnonFields => Request_[InstanceList],
    reset: AnonFieldsInstance => Request_[Operation],
    setDiskAutoDelete: AnonAutoDelete => Request_[Operation],
    setLabels: AnonFieldsInstance => Request_[Operation],
    setMachineResources: AnonFieldsInstance => Request_[Operation],
    setMachineType: AnonFieldsInstance => Request_[Operation],
    setMetadata: AnonFieldsInstance => Request_[Operation],
    setMinCpuPlatform: AnonFieldsInstance => Request_[Operation],
    setScheduling: AnonFieldsInstance => Request_[Operation],
    setServiceAccount: AnonFieldsInstance => Request_[Operation],
    setTags: AnonFieldsInstance => Request_[Operation],
    start: AnonFieldsInstance => Request_[Operation],
    startWithEncryptionKey: AnonFieldsInstance => Request_[Operation],
    stop: AnonFieldsInstance => Request_[Operation]
  ): InstancesResource = {
    val __obj = js.Dynamic.literal(addAccessConfig = js.Any.fromFunction1(addAccessConfig), aggregatedList = js.Any.fromFunction1(aggregatedList), attachDisk = js.Any.fromFunction1(attachDisk), delete = js.Any.fromFunction1(delete), deleteAccessConfig = js.Any.fromFunction1(deleteAccessConfig), detachDisk = js.Any.fromFunction1(detachDisk), get = js.Any.fromFunction1(get), getSerialPortOutput = js.Any.fromFunction1(getSerialPortOutput), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), reset = js.Any.fromFunction1(reset), setDiskAutoDelete = js.Any.fromFunction1(setDiskAutoDelete), setLabels = js.Any.fromFunction1(setLabels), setMachineResources = js.Any.fromFunction1(setMachineResources), setMachineType = js.Any.fromFunction1(setMachineType), setMetadata = js.Any.fromFunction1(setMetadata), setMinCpuPlatform = js.Any.fromFunction1(setMinCpuPlatform), setScheduling = js.Any.fromFunction1(setScheduling), setServiceAccount = js.Any.fromFunction1(setServiceAccount), setTags = js.Any.fromFunction1(setTags), start = js.Any.fromFunction1(start), startWithEncryptionKey = js.Any.fromFunction1(startWithEncryptionKey), stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[InstancesResource]
  }
  @scala.inline
  implicit class InstancesResourceOps[Self <: InstancesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddAccessConfig(value: AnonInstance => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAccessConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAggregatedList(value: AnonAlt => Request_[InstanceAggregatedList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAttachDisk(value: AnonFieldsInstance => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachDisk")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonFieldsInstance => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteAccessConfig(value: AnonAccessConfig => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAccessConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDetachDisk(value: AnonDeviceName => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detachDisk")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonInstanceKey => Request_[Instance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSerialPortOutput(value: AnonPort => Request_[SerialPortOutput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSerialPortOutput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonQuotaUser => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[InstanceList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReset(value: AnonFieldsInstance => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDiskAutoDelete(value: AnonAutoDelete => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDiskAutoDelete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLabels(value: AnonFieldsInstance => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabels")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMachineResources(value: AnonFieldsInstance => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMachineResources")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMachineType(value: AnonFieldsInstance => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMachineType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMetadata(value: AnonFieldsInstance => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMetadata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMinCpuPlatform(value: AnonFieldsInstance => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinCpuPlatform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetScheduling(value: AnonFieldsInstance => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScheduling")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetServiceAccount(value: AnonFieldsInstance => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setServiceAccount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTags(value: AnonFieldsInstance => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTags")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStart(value: AnonFieldsInstance => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartWithEncryptionKey(value: AnonFieldsInstance => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startWithEncryptionKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStop(value: AnonFieldsInstance => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

