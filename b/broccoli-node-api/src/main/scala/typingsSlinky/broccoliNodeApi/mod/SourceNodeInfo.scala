package typingsSlinky.broccoliNodeApi.mod

import typingsSlinky.broccoliNodeApi.broccoliNodeApiStrings.source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceNodeInfo extends NodeInfoCommon[source] {
  /**
    A path to an existing directory on disk, relative to the current working directory.
    */
  var sourceDirectory: String = js.native
  /**
    If false, changed files in the sourceDirectory will not trigger rebuilds
    (though they might still be picked up by subsequent rebuilds). If true,
    instructs the Broccoli file system watcher to watch the sourceDirectory
    recursively and trigger a rebuild whenever a file changes.
    */
  var watched: Boolean = js.native
}

object SourceNodeInfo {
  @scala.inline
  def apply(
    instantiationStack: String,
    name: String,
    nodeType: source,
    sourceDirectory: String,
    watched: Boolean
  ): SourceNodeInfo = {
    val __obj = js.Dynamic.literal(instantiationStack = instantiationStack.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], sourceDirectory = sourceDirectory.asInstanceOf[js.Any], watched = watched.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceNodeInfo]
  }
  @scala.inline
  implicit class SourceNodeInfoOps[Self <: SourceNodeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatched(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watched")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

