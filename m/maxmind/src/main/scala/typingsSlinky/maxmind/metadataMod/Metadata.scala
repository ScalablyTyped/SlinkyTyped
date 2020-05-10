package typingsSlinky.maxmind.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metadata extends js.Object {
  val binaryFormatMajorVersion: Double = js.native
  val binaryFormatMinorVersion: Double = js.native
  val buildEpoch: js.Date = js.native
  val databaseType: String = js.native
  val description: js.Any = js.native
  val ipVersion: Double = js.native
  val languages: js.Array[String] = js.native
  val nodeByteSize: Double = js.native
  val nodeCount: Double = js.native
  val recordSize: Double = js.native
  val searchTreeSize: Double = js.native
  val treeDepth: Double = js.native
}

object Metadata {
  @scala.inline
  def apply(
    binaryFormatMajorVersion: Double,
    binaryFormatMinorVersion: Double,
    buildEpoch: js.Date,
    databaseType: String,
    description: js.Any,
    ipVersion: Double,
    languages: js.Array[String],
    nodeByteSize: Double,
    nodeCount: Double,
    recordSize: Double,
    searchTreeSize: Double,
    treeDepth: Double
  ): Metadata = {
    val __obj = js.Dynamic.literal(binaryFormatMajorVersion = binaryFormatMajorVersion.asInstanceOf[js.Any], binaryFormatMinorVersion = binaryFormatMinorVersion.asInstanceOf[js.Any], buildEpoch = buildEpoch.asInstanceOf[js.Any], databaseType = databaseType.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], ipVersion = ipVersion.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], nodeByteSize = nodeByteSize.asInstanceOf[js.Any], nodeCount = nodeCount.asInstanceOf[js.Any], recordSize = recordSize.asInstanceOf[js.Any], searchTreeSize = searchTreeSize.asInstanceOf[js.Any], treeDepth = treeDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinaryFormatMajorVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryFormatMajorVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBinaryFormatMinorVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryFormatMinorVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildEpoch(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildEpoch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatabaseType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeByteSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeByteSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchTreeSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTreeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeDepth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

