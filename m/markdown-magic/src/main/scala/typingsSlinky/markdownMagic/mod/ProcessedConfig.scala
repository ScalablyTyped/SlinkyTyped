package typingsSlinky.markdownMagic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessedConfig extends Configuration {
  val originalPath: String = js.native
  val outputContent: String = js.native
  @JSName("outputDir")
  val outputDir_ProcessedConfig: String = js.native
  val outputFilePath: String = js.native
}

object ProcessedConfig {
  @scala.inline
  def apply(originalPath: String, outputContent: String, outputDir: String, outputFilePath: String): ProcessedConfig = {
    val __obj = js.Dynamic.literal(originalPath = originalPath.asInstanceOf[js.Any], outputContent = outputContent.asInstanceOf[js.Any], outputDir = outputDir.asInstanceOf[js.Any], outputFilePath = outputFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessedConfig]
  }
  @scala.inline
  implicit class ProcessedConfigOps[Self <: ProcessedConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOriginalPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFilePath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

