package typingsSlinky.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSource extends js.Object {
  /** Information about an application which feeds sensor data into the platform. */
  var application: js.UndefOr[Application] = js.native
  var dataQualityStandard: js.UndefOr[js.Array[String]] = js.native
  /**
    * A unique identifier for the data stream produced by this data source. The identifier includes:
    *
    *
    * - The physical device's manufacturer, model, and serial number (UID).
    * - The application's package name or name. Package name is used when the data source was created by an Android application. The developer project number
    * is used when the data source was created by a REST client.
    * - The data source's type.
    * - The data source's stream name.  Note that not all attributes of the data source are used as part of the stream identifier. In particular, the version
    * of the hardware/the application isn't used. This allows us to preserve the same stream through version updates. This also means that two DataSource
    * objects may represent the same data stream even if they're not equal.
    *
    * The exact format of the data stream ID created by an Android application is:
    * type:dataType.name:application.packageName:device.manufacturer:device.model:device.uid:dataStreamName
    *
    * The exact format of the data stream ID created by a REST client is: type:dataType.name:developer project
    * number:device.manufacturer:device.model:device.uid:dataStreamName
    *
    * When any of the optional fields that comprise of the data stream ID are blank, they will be omitted from the data stream ID. The minimum viable data
    * stream ID would be: type:dataType.name:developer project number
    *
    * Finally, the developer project number is obfuscated when read by any REST or Android client that did not create the data source. Only the data source
    * creator will see the developer project number in clear and normal form.
    */
  var dataStreamId: js.UndefOr[String] = js.native
  /**
    * The stream name uniquely identifies this particular data source among other data sources of the same type from the same underlying producer. Setting
    * the stream name is optional, but should be done whenever an application exposes two streams for the same data type, or when a device has two equivalent
    * sensors.
    */
  var dataStreamName: js.UndefOr[String] = js.native
  /** The data type defines the schema for a stream of data being collected by, inserted into, or queried from the Fitness API. */
  var dataType: js.UndefOr[DataType] = js.native
  /** Representation of an integrated device (such as a phone or a wearable) that can hold sensors. */
  var device: js.UndefOr[Device] = js.native
  /** An end-user visible name for this data source. */
  var name: js.UndefOr[String] = js.native
  /** A constant describing the type of this data source. Indicates whether this data source produces raw or derived data. */
  var `type`: js.UndefOr[String] = js.native
}

object DataSource {
  @scala.inline
  def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  @scala.inline
  implicit class DataSourceOps[Self <: DataSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(js.undefined)
        ret
    }
    @scala.inline
    def withDataQualityStandard(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataQualityStandard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataQualityStandard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataQualityStandard")(js.undefined)
        ret
    }
    @scala.inline
    def withDataStreamId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataStreamId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataStreamId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataStreamId")(js.undefined)
        ret
    }
    @scala.inline
    def withDataStreamName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataStreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataStreamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataStreamName")(js.undefined)
        ret
    }
    @scala.inline
    def withDataType(value: DataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(js.undefined)
        ret
    }
    @scala.inline
    def withDevice(value: Device): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

