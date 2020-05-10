package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonAltDisk
import typingsSlinky.gapiClientCompute.AnonDisk
import typingsSlinky.gapiClientCompute.AnonFields
import typingsSlinky.gapiClientCompute.AnonResource
import typingsSlinky.gapiClientCompute.AnonSourceImage
import typingsSlinky.gapiClientCompute.AnonZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisksResource extends js.Object {
  /** Retrieves an aggregated list of persistent disks. */
  def aggregatedList(request: AnonAlt): Request_[DiskAggregatedList] = js.native
  /** Creates a snapshot of a specified persistent disk. */
  def createSnapshot(request: AnonDisk): Request_[Operation] = js.native
  /**
    * Deletes the specified persistent disk. Deleting a disk removes its data permanently and is irreversible. However, deleting a disk does not delete any
    * snapshots previously made from the disk. You must separately delete snapshots.
    */
  def delete(request: AnonZone): Request_[Operation] = js.native
  /** Returns a specified persistent disk. Get a list of available persistent disks by making a list() request. */
  def get(request: AnonAltDisk): Request_[Disk] = js.native
  /**
    * Creates a persistent disk in the specified project using the data in the request. You can create a disk with a sourceImage, a sourceSnapshot, or create
    * an empty 500 GB data disk by omitting all properties. You can also create a disk that is larger than the default size by specifying the sizeGb
    * property.
    */
  def insert(request: AnonSourceImage): Request_[Operation] = js.native
  /** Retrieves a list of persistent disks contained within the specified zone. */
  def list(request: AnonFields): Request_[DiskList] = js.native
  /** Resizes the specified persistent disk. */
  def resize(request: AnonZone): Request_[Operation] = js.native
  /** Sets the labels on a disk. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: AnonResource): Request_[Operation] = js.native
}

object DisksResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[DiskAggregatedList],
    createSnapshot: AnonDisk => Request_[Operation],
    delete: AnonZone => Request_[Operation],
    get: AnonAltDisk => Request_[Disk],
    insert: AnonSourceImage => Request_[Operation],
    list: AnonFields => Request_[DiskList],
    resize: AnonZone => Request_[Operation],
    setLabels: AnonResource => Request_[Operation]
  ): DisksResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), createSnapshot = js.Any.fromFunction1(createSnapshot), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), resize = js.Any.fromFunction1(resize), setLabels = js.Any.fromFunction1(setLabels))
    __obj.asInstanceOf[DisksResource]
  }
  @scala.inline
  implicit class DisksResourceOps[Self <: DisksResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregatedList(value: AnonAlt => Request_[DiskAggregatedList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateSnapshot(value: AnonDisk => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSnapshot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonZone => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAltDisk => Request_[Disk]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonSourceImage => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[DiskList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResize(value: AnonZone => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLabels(value: AnonResource => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabels")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

