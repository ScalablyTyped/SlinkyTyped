package typingsSlinky.jestHasteMap.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerMessage extends js.Object {
  var computeDependencies: Boolean = js.native
  var computeSha1: Boolean = js.native
  var dependencyExtractor: js.UndefOr[String] = js.native
  var filePath: String = js.native
  var hasteImplModulePath: js.UndefOr[String] = js.native
  var rootDir: String = js.native
}

object WorkerMessage {
  @scala.inline
  def apply(computeDependencies: Boolean, computeSha1: Boolean, filePath: String, rootDir: String): WorkerMessage = {
    val __obj = js.Dynamic.literal(computeDependencies = computeDependencies.asInstanceOf[js.Any], computeSha1 = computeSha1.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerMessage]
  }
  @scala.inline
  implicit class WorkerMessageOps[Self <: WorkerMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputeDependencies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputeSha1(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeSha1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependencyExtractor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyExtractor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencyExtractor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyExtractor")(js.undefined)
        ret
    }
    @scala.inline
    def withHasteImplModulePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasteImplModulePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasteImplModulePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasteImplModulePath")(js.undefined)
        ret
    }
  }
  
}

