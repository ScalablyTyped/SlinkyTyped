package typingsSlinky.appBuilderLib.appFileCopierMod

import typingsSlinky.fsExtra.mod.Stats
import typingsSlinky.node.Buffer
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedFileSet extends js.Object {
  var destination: String = js.native
  var files: js.Array[String] = js.native
  var metadata: Map[String, Stats] = js.native
  var src: String = js.native
  var transformedFiles: js.UndefOr[(Map[Double, String | Buffer]) | Null] = js.native
}

object ResolvedFileSet {
  @scala.inline
  def apply(destination: String, files: js.Array[String], metadata: Map[String, Stats], src: String): ResolvedFileSet = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedFileSet]
  }
  @scala.inline
  implicit class ResolvedFileSetOps[Self <: ResolvedFileSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: Map[String, Stats]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformedFiles(value: Map[Double, String | Buffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformedFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformedFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformedFilesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformedFiles")(null)
        ret
    }
  }
  
}

