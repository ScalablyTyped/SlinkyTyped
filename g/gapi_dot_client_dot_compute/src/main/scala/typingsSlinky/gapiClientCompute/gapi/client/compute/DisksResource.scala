package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.AltDisk
import typingsSlinky.gapiClientCompute.anon.Fields
import typingsSlinky.gapiClientCompute.anon.Resource
import typingsSlinky.gapiClientCompute.anon.SourceImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisksResource extends js.Object {
  /** Retrieves an aggregated list of persistent disks. */
  def aggregatedList(request: Alt): Request[DiskAggregatedList]
  /** Creates a snapshot of a specified persistent disk. */
  def createSnapshot(request: typingsSlinky.gapiClientCompute.anon.Disk): Request[Operation]
  /**
    * Deletes the specified persistent disk. Deleting a disk removes its data permanently and is irreversible. However, deleting a disk does not delete any
    * snapshots previously made from the disk. You must separately delete snapshots.
    */
  def delete(request: typingsSlinky.gapiClientCompute.anon.Zone): Request[Operation]
  /** Returns a specified persistent disk. Get a list of available persistent disks by making a list() request. */
  def get(request: AltDisk): Request[Disk]
  /**
    * Creates a persistent disk in the specified project using the data in the request. You can create a disk with a sourceImage, a sourceSnapshot, or create
    * an empty 500 GB data disk by omitting all properties. You can also create a disk that is larger than the default size by specifying the sizeGb
    * property.
    */
  def insert(request: SourceImage): Request[Operation]
  /** Retrieves a list of persistent disks contained within the specified zone. */
  def list(request: Fields): Request[DiskList]
  /** Resizes the specified persistent disk. */
  def resize(request: typingsSlinky.gapiClientCompute.anon.Zone): Request[Operation]
  /** Sets the labels on a disk. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: Resource): Request[Operation]
}

object DisksResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[DiskAggregatedList],
    createSnapshot: typingsSlinky.gapiClientCompute.anon.Disk => Request[Operation],
    delete: typingsSlinky.gapiClientCompute.anon.Zone => Request[Operation],
    get: AltDisk => Request[Disk],
    insert: SourceImage => Request[Operation],
    list: Fields => Request[DiskList],
    resize: typingsSlinky.gapiClientCompute.anon.Zone => Request[Operation],
    setLabels: Resource => Request[Operation]
  ): DisksResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), createSnapshot = js.Any.fromFunction1(createSnapshot), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), resize = js.Any.fromFunction1(resize), setLabels = js.Any.fromFunction1(setLabels))
    __obj.asInstanceOf[DisksResource]
  }
}

